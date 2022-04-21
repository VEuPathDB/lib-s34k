package org.veupathdb.lib.s3.s34k.client

import org.veupathdb.lib.s3.s34k.S3Bucket
import org.veupathdb.lib.s3.s34k.fields.headers.S3HeadersMutable
import org.veupathdb.lib.s3.s34k.fields.query_params.S3QueryParamsMutable
import org.veupathdb.lib.s3.s34k.params.BaseRequest

// TODO: Document me
class BucketListParams : BaseRequest {
  var callback: ((List<S3Bucket>) -> Unit)?

  constructor(callback: ((List<S3Bucket>) -> Unit)? = null) : super() {
    this.callback = callback
  }

  internal constructor(
    callback:    ((List<S3Bucket>) -> Unit)?,
    headers: S3HeadersMutable,
    queryParams: S3QueryParamsMutable,
  ) : super(headers, queryParams) {
    this.callback = callback
  }
}