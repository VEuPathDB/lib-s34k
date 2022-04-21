package org.veupathdb.lib.s3.s34k.params

import org.veupathdb.lib.s3.s34k.fields.BucketName
import org.veupathdb.lib.s3.s34k.request.bucket.BucketExistsParams
import org.veupathdb.lib.s3.s34k.request.`object`.ObjectExistsParams

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

  // TODO: Document me
  fun toObjectExistsParams(path: String, region: String? = null) =
    ObjectExistsParams(path, region, callback, headers, queryParams)

  fun toBucketExistsParams(bucket: BucketName, region: String? = null) =
    BucketExistsParams(bucket, region, callback, headers, queryParams)
}