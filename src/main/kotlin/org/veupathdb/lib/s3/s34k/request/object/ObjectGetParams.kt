package org.veupathdb.lib.s3.s34k.request.`object`

import org.veupathdb.lib.s3.s34k.fields.headers.S3HeadersMutable
import org.veupathdb.lib.s3.s34k.fields.query_params.S3QueryParamsMutable
import org.veupathdb.lib.s3.s34k.response.`object`.S3StreamObject

/**
 * Object Retrieval Operation Parameters
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class ObjectGetParams : BaseObjectRequest {
  /**
   * Optional callback that will be called upon request completion.
   */
  var callback: ((S3StreamObject) -> Unit)?

  constructor(
    path: String? = null,
    region: String? = null,
    callback: ((S3StreamObject) -> Unit)? = null
  ) : super(path, region) {
    this.callback = callback
  }

  internal constructor(
    path:        String?,
    region:      String?,
    callback:    ((S3StreamObject) -> Unit)?,
    headers: S3HeadersMutable,
    queryParams: S3QueryParamsMutable,
  ) : super(path, region, headers, queryParams) {
    this.callback = callback
  }
}