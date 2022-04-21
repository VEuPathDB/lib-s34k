package org.veupathdb.lib.s3.s34k.request.`object`

import org.veupathdb.lib.s3.s34k.fields.headers.S3HeadersMutable
import org.veupathdb.lib.s3.s34k.fields.query_params.S3QueryParamsMutable
import org.veupathdb.lib.s3.s34k.fields.tags.TagMap
import org.veupathdb.lib.s3.s34k.response.`object`.S3Object

/**
 * Empty Object Put Operation Parameters
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class ObjectTouchParams : TaggedObjectRequest {
  /**
   * Content type for the newly created empty object.
   */
  var contentType: String?

  /**
   * Callback that will be called on successful operation completion.
   */
  var callback: ((S3Object) -> Unit)?

  constructor(
    path:        String?               = null,
    region:      String?               = null,
    contentType: String?               = null,
    callback:    ((S3Object) -> Unit)? = null
  ) : super(path, region) {
    this.contentType = contentType
    this.callback    = callback
  }

  internal constructor(
    path:        String?,
    region:      String?,
    contentType: String?,
    callback:    ((S3Object) -> Unit)?,
    tags: TagMap,
    headers: S3HeadersMutable,
    queryParams: S3QueryParamsMutable,
  ) : super(path, region, tags, headers, queryParams) {
    this.contentType = contentType
    this.callback = callback
  }
}