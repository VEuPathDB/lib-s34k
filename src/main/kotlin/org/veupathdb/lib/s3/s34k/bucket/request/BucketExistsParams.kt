package org.veupathdb.lib.s3.s34k.bucket.request

import org.veupathdb.lib.s3.s34k.fields.BucketName
import org.veupathdb.lib.s3.s34k.fields.headers.S3HeadersMutable
import org.veupathdb.lib.s3.s34k.fields.query_params.S3QueryParamsMutable

/**
 * Bucket Exists Check Operation Parameters
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class BucketExistsParams : BucketRequest {
  var callback: ((exists: Boolean) -> Unit)?

  constructor(
    bucket:   BucketName?                  = null,
    region:   String?                      = null,
    callback: ((exists: Boolean) -> Unit)? = null
  ) : super(bucket, region) {
    this.callback = callback
  }

  internal constructor(
    bucket: BucketName?,
    region: String?,
    callback: ((exists: Boolean) -> Unit)?,
    headers: S3HeadersMutable,
    queryParams: S3QueryParamsMutable,
  ) : super(bucket, region, headers, queryParams) {
    this.callback = callback
  }
}