package org.veupathdb.lib.s3.s34k.request.`object`

import org.veupathdb.lib.s3.s34k.fields.headers.S3HeadersMutable
import org.veupathdb.lib.s3.s34k.fields.query_params.S3QueryParamsMutable
import org.veupathdb.lib.s3.s34k.fields.tags.TagMap
import org.veupathdb.lib.s3.s34k.fields.tags.TagMapImpl
import org.veupathdb.lib.s3.s34k.params.TagSendingRequest

/**
 * Object Put Operation Params
 *
 * Base type for S3 put operation param sets.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
open class TaggedObjectRequest : TagSendingRequest, BaseObjectRequest {

  override val tags: TagMap

  constructor(path: String? = null, region: String? = null) : super(path, region) {
    this.tags = TagMapImpl()
  }

  internal constructor(
    path: String?,
    region: String?,
    tags: TagMap,
    headers: S3HeadersMutable,
    queryParams: S3QueryParamsMutable,
  ) : super(path, region, headers, queryParams) {
    this.tags = tags
  }
}
