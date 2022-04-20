package org.veupathdb.lib.s3.s34k.params.bucket

import org.veupathdb.lib.s3.s34k.S3TagSet

class BucketDeleteParams : BaseBucketRequest {

  var callback: (() -> Unit)?

  constructor(bucket: String?) : super(bucket) {
    this.callback = null
  }

  constructor(
    bucket: String? = null,
    region: String? = null,
    callback: (() -> Unit)? = null
  ) : super(bucket, region) {
    this.callback = callback
  }

  internal constructor(
    bucket: BucketName,
    region: String?,
    callback: (() -> Unit)?,
    headers: MutableMap<String, Array<String>>,
    queryParams: MutableMap<String, Array<String>>,
  ) : super(bucket, region, headers, queryParams) {
    this.callback = callback
  }
}