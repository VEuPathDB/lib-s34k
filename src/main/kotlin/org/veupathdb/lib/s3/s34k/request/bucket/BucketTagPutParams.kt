package org.veupathdb.lib.s3.s34k.request.bucket

import org.veupathdb.lib.s3.s34k.fields.headers.S3HeadersMutable
import org.veupathdb.lib.s3.s34k.fields.query_params.S3QueryParamsMutable
import org.veupathdb.lib.s3.s34k.fields.tags.TagMap
import org.veupathdb.lib.s3.s34k.fields.tags.TagMapImpl
import org.veupathdb.lib.s3.s34k.params.RegionRequest
import org.veupathdb.lib.s3.s34k.params.TagSendingRequest

// TODO: Document me
class BucketTagPutParams : TagSendingRequest, RegionRequest {
  override val tags: TagMap

  var callback: (() -> Unit)?

  constructor(
    region: String? = null,
    callback: (() -> Unit)? = null
  ) : super(region) {
    this.tags     = TagMapImpl()
    this.callback = callback
  }

  internal constructor(
    region: String?,
    tags: TagMap,
    callback: (() -> Unit)?,
    headers: S3HeadersMutable,
    queryParams: S3QueryParamsMutable,
  ) : super(region, headers, queryParams) {
    this.tags     = tags
    this.callback = callback
  }
}