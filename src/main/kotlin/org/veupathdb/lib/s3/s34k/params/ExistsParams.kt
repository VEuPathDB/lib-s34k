package org.veupathdb.lib.s3.s34k.params

import org.slf4j.LoggerFactory
import org.veupathdb.lib.s3.s34k.params.bucket.BucketExistsParams
import org.veupathdb.lib.s3.s34k.params.`object`.ObjectExistsParams

/**
 * Exists Check Operation Parameters
 *
 * @constructor Constructs a new [ExistsParams] instance.
 *
 * @param callback Optional callback that will be called upon request
 * completion.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class ExistsParams(var callback: ((Boolean) -> Unit)? = null) : BaseRequest() {

  private val Log = LoggerFactory.getLogger(this::class.java)

  // TODO: Document me
  fun toObjectExistsParams(path: String): ObjectExistsParams {
    Log.trace("toObjectExistsParams(path = {})", path)
    return ObjectExistsParams(path, callback).also {
      (it.rawHeaders).putAll(headers)
      (it.rawQueryParams).putAll(queryParams)
    }
  }

  fun toBucketExistsParams(bucket: String): BucketExistsParams {
    Log.trace("toBucketExistsParams(bucket = {})", bucket)
    return BucketExistsParams(bucket, null, callback).also {
      (it.rawHeaders).putAll(headers)
      (it.rawQueryParams).putAll(queryParams)
    }
  }
}