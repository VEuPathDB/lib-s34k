package org.veupathdb.lib.s3.s34k.params

import org.slf4j.LoggerFactory
import org.veupathdb.lib.s3.s34k.S3TagSet
import org.veupathdb.lib.s3.s34k.params.bucket.BucketTagGetParams
import org.veupathdb.lib.s3.s34k.params.`object`.ObjectTagGetParams

/**
 * Generic Tag Get Operation Parameters
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class TagGetParams : RequestParams() {
  private val Log = LoggerFactory.getLogger(this::class.java)

  /**
   * Converts this generic [TagGetParams] into params specifically for getting
   * tags for an S3 object.
   *
   * @param path Path to the S3 object whose tags should be fetched.
   *
   * @param cb Optional callback that will be executed on successfully
   * completing the request to the S3 server.
   *
   * @return Converted [ObjectTagGetParams] instance.
   */
  fun toObjectTagGetParams(path: String, cb: ((tags: S3TagSet) -> Unit)? = null): ObjectTagGetParams {
    Log.trace("toObjectTagGetParams(path = {}, cb = {})", path, cb)

    return ObjectTagGetParams(path, cb).also {
      headers.forEach { (k, v) -> it.addHeaders(k, *v) }
      queryParams.forEach { (k, v) -> it.addQueryParams(k, *v) }
    }
  }

  /**
   * Converts this generic [TagGetParams] into params specifically for getting
   * tags for an S3 bucket.
   *
   * @param cb Optional callback that will be executed on successfully
   * completing the request to the S3 server.
   *
   * @return Converted [BucketTagGetParams] instance.
   */
  fun toBucketTagGetParams(cb: ((tags: S3TagSet) -> Unit)? = null): BucketTagGetParams {
    Log.trace("toBucketTagGetParams(cb = {})", cb)

    return BucketTagGetParams(cb).also {
      headers.forEach { (k, v) -> it.addHeaders(k, *v) }
      queryParams.forEach { (k, v) -> it.addQueryParams(k, *v) }
    }
  }

  override fun toString(): String {
    val out = StringBuilder(2048)

    out.append("TagGetParams {\n")
    super.toString(out)
    out.append("}")

    return out.toString()
  }
}