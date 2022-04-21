package org.veupathdb.lib.s3.s34k.request.bucket

import org.veupathdb.lib.s3.s34k.fields.*
import org.veupathdb.lib.s3.s34k.fields.headers.S3HeadersMutable
import org.veupathdb.lib.s3.s34k.fields.query_params.S3QueryParamsMutable
import org.veupathdb.lib.s3.s34k.fields.tags.TagMap
import org.veupathdb.lib.s3.s34k.fields.tags.TagMapImpl

open class TaggedBucketRequest : BucketRequest {

  val tags: TagMap

  constructor(
    bucket: BucketName? = null,
    region: String?     = null,
  ) : super(bucket, region) {
    tags = TagMapImpl()
  }

  internal constructor(
    bucket:      BucketName?,
    region:      String?,
    tags: TagMap,
    headers: S3HeadersMutable,
    queryParams: S3QueryParamsMutable,
  ) : super(bucket, region, headers, queryParams) {
    this.tags = tags
  }
}