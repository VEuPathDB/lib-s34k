package org.veupathdb.lib.s3.s34k.fields.headers

import java.util.stream.Stream

/**
 * Map of headers being sent to or returned from an S3 operation.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since  v0.1.0
 */
interface S3Headers : Iterable<Pair<String, List<String>>> {
  /**
   * Number of header entries in this [S3Headers] map.
   */
  val size: Int

  /**
   * Whether this header map is empty.
   */
  val isEmpty: Boolean

  /**
   * Whether this header map is not empty.
   */
  val isNotEmpty: Boolean

  /**
   * Converts this [S3Headers] instance into a standard Java map of headers to
   * value lists.
   *
   * @return The converted map.
   */
  fun toMap(): Map<String, List<String>>

  /**
   * Returns a stream over the contents of this [S3Headers] map.
   *
   * @return Stream over the contents of this header map.
   */
  fun stream(): Stream<Pair<String, List<String>>>

  /**
   * Returns a list of header values stored under the given header key.
   *
   * If no such key exists, `null` will be returned.
   *
   * @return Either a list of header values for the given header key, or `null`
   * if no such entry exists in this header map.
   */
  operator fun get(header: String): List<String>?
}