package org.veupathdb.lib.s3.s34k.request.`object`

import org.veupathdb.lib.s3.s34k.fields.headers.S3HeadersMutable
import org.veupathdb.lib.s3.s34k.fields.query_params.S3QueryParamsMutable
import org.veupathdb.lib.s3.s34k.fields.tags.TagMap
import org.veupathdb.lib.s3.s34k.response.`object`.S3Object

/**
 * Directory Put Operation Parameters
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class DirectoryPutParams : TaggedObjectRequest {

  var callback: ((directory: S3Object) -> Unit)?

  constructor(
    path: String? = null,
    region: String? = null,
    callback: ((directory: S3Object) -> Unit)? = null
  ) : super(path, region) {
    this.callback = callback
  }

  internal constructor(
    path: String?,
    region: String?,
    tags: TagMap,
    callback: ((directory: S3Object) -> Unit)?,
    headers: S3HeadersMutable,
    queryParams: S3QueryParamsMutable
  ) : super(path, region, tags, headers, queryParams) {
    this.callback = callback
  }
}