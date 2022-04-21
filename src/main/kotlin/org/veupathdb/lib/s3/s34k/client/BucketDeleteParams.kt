package org.veupathdb.lib.s3.s34k.client

import org.veupathdb.lib.s3.s34k.fields.BucketName
import org.veupathdb.lib.s3.s34k.fields.headers.S3HeadersMutable
import org.veupathdb.lib.s3.s34k.fields.query_params.S3QueryParamsMutable
import org.veupathdb.lib.s3.s34k.bucket.request.BucketRequest

class BucketDeleteParams : BucketRequest {

  var callback: ((deleted: Boolean) -> Unit)?

  constructor(
    bucket:   BucketName?   = null,
    region:   String?       = null,
    callback: ((deleted: Boolean) -> Unit)? = null
  ) : super(bucket, region) {
    this.callback = callback
  }

  internal constructor(
    bucket:      BucketName?,
    region:      String?,
    callback:    ((deleted: Boolean) -> Unit)?,
    headers: S3HeadersMutable,
    queryParams: S3QueryParamsMutable,
  ) : super(bucket, region, headers, queryParams) {
    this.callback = callback
  }
}