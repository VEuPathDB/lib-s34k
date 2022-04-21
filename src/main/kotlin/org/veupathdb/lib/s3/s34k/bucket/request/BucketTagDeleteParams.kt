package org.veupathdb.lib.s3.s34k.bucket.request

import org.veupathdb.lib.s3.s34k.S3TagSet
import org.veupathdb.lib.s3.s34k.fields.tags.TagSetImpl
import org.veupathdb.lib.s3.s34k.fields.headers.S3HeadersMutable
import org.veupathdb.lib.s3.s34k.fields.query_params.S3QueryParamsMutable
import org.veupathdb.lib.s3.s34k.fields.tags.TagSet
import org.veupathdb.lib.s3.s34k.params.RegionRequest
import org.veupathdb.lib.s3.s34k.params.TagDeleteRequest

// TODO: Document me
class BucketTagDeleteParams : TagDeleteRequest, RegionRequest {

  override val tags: TagSet

  override var allTags: Boolean = false

  var callback: ((S3TagSet) -> Unit)?

  constructor(
    region:   String?               = null,
    callback: ((S3TagSet) -> Unit)? = null,
  ) : super(region) {
    this.tags     = TagSetImpl()
    this.callback = callback
  }

  internal constructor(
    region:      String?,
    tags: TagSet,
    allTags:     Boolean,
    callback:    ((S3TagSet) -> Unit)?,
    headers: S3HeadersMutable,
    queryParams: S3QueryParamsMutable,
  ) : super(region, headers, queryParams) {
    this.tags     = tags
    this.allTags  = allTags
    this.callback = callback
  }
}