package org.veupathdb.lib.s3.s34k.`object`.request

import org.veupathdb.lib.s3.s34k.S3TagSet
import org.veupathdb.lib.s3.s34k.fields.tags.TagSetImpl
import org.veupathdb.lib.s3.s34k.fields.headers.S3HeadersMutable
import org.veupathdb.lib.s3.s34k.fields.query_params.S3QueryParamsMutable
import org.veupathdb.lib.s3.s34k.fields.tags.TagSet
import org.veupathdb.lib.s3.s34k.params.TagDeleteRequest

// TODO: Document me
class ObjectTagDeleteParams : TagDeleteRequest, BaseObjectRequest {

  override val tags: TagSet

  override var allTags: Boolean = false

  var callback: ((S3TagSet) -> Unit)? = null

  constructor(
    path:     String?               = null,
    region:   String?               = null,
    callback: ((S3TagSet) -> Unit)? = null,
  ) : super(path, region) {
    this.callback = callback
    this.tags     = TagSetImpl()
  }

  internal constructor(
    path:        String?,
    region:      String?,
    tags: TagSet,
    allTags:     Boolean,
    callback:    ((S3TagSet) -> Unit)?,
    headers: S3HeadersMutable,
    queryParams: S3QueryParamsMutable,
  ) : super(path, region, headers, queryParams) {
    this.tags     = tags
    this.allTags  = allTags
    this.callback = callback
  }
}