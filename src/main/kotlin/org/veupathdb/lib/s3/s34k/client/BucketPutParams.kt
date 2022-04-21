package org.veupathdb.lib.s3.s34k.client

import org.veupathdb.lib.s3.s34k.S3Bucket
import org.veupathdb.lib.s3.s34k.fields.BucketName
import org.veupathdb.lib.s3.s34k.fields.headers.S3HeadersMutable
import org.veupathdb.lib.s3.s34k.fields.query_params.S3QueryParamsMutable
import org.veupathdb.lib.s3.s34k.fields.tags.TagMap
import org.veupathdb.lib.s3.s34k.bucket.request.TaggedBucketRequest

/**
 * Put Bucket Operation Parameters
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class BucketPutParams : TaggedBucketRequest {
  var callback: ((bucket: S3Bucket) -> Unit)?

  constructor(
    bucket: BucketName? = null,
    region: String? = null,
    callback: ((bucket: S3Bucket) -> Unit)? = null
  ) : super(bucket, region) {
    this.callback = callback
  }

  internal constructor(
    bucket:  BucketName?,
    region:  String?,
    callback: ((bucket: S3Bucket) -> Unit)?,
    tags: TagMap,
    headers: S3HeadersMutable,
    queryParams: S3QueryParamsMutable
  ) : super(bucket, region, tags, headers, queryParams) {
    this.callback = callback
  }
}