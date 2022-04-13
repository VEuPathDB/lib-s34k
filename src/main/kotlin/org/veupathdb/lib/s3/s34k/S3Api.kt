package org.veupathdb.lib.s3.s34k

import org.slf4j.LoggerFactory
import java.util.ServiceLoader

/**
 * S3 API Client Provider
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
object S3Api {

  private val Log = LoggerFactory.getLogger(this::class.java)

  private var type: Class<out S3Client>? = null

  /**
   * Gets a new [S3Client] instance configured with the given [S3Config] value.
   *
   * Clients are loaded dynamically from the first implementing library found
   * on the classpath.
   *
   * @param config Configuration for the new client instance.
   *
   * @return A newly created [S3Client] instance.
   *
   * @throws RuntimeException if no implementing library was found on the
   * classpath.
   */
  @JvmStatic
  fun newClient(config: S3Config): S3Client {
    Log.trace("getClient(config = {})", config)

    // If we have already located an implementation, use that rather than
    // searching for one.
    if (type != null) {
      val out = type!!.getConstructor().newInstance()
      out.initialize(config)
      return out
    }

    // We haven't loaded an implementation class yet, try to load one now.

    Log.debug("Searching for S3Client implementation.")
    val it = ServiceLoader.load(S3Client::class.java).iterator()

    // If no implementation was found, we can't proceed.
    if (!it.hasNext())
      throw RuntimeException("No S3Client implementation found.")

    val out = it.next()

    Log.debug("Implementation found: {}", it::class.java)
    out.initialize(config)

    // Cache the located class, so we don't have to search in the future.
    type = out::class.java

    return out
  }
}