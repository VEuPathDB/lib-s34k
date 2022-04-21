package org.veupathdb.lib.s3.s34k.bucket.request

import org.veupathdb.lib.s3.s34k.S3TagSet
import org.veupathdb.lib.s3.s34k.fields.BucketName
import org.veupathdb.lib.s3.s34k.fields.headers.S3HeadersMutable
import org.veupathdb.lib.s3.s34k.fields.query_params.S3QueryParamsMutable

/**
 * Bucket Tag Retrieval Operation Parameters
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class BucketTagGetParams : BucketRequest {
  var callback: ((tags: S3TagSet) -> Unit)?

  constructor(
    bucket:   BucketName?                 = null,
    region:   String?                     = null,
    callback: ((tags: S3TagSet) -> Unit)? = null
  ) : super(bucket, region) {
    this.callback = callback
  }

  internal constructor(
    bucket:      BucketName?,
    region:      String?,
    callback:    ((tags: S3TagSet) -> Unit)?,
    headers: S3HeadersMutable,
    queryParams: S3QueryParamsMutable
  ) : super(bucket, region, headers, queryParams) {
    this.callback = callback
  }
}