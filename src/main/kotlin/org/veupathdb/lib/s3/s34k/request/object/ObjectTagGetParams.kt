package org.veupathdb.lib.s3.s34k.request.`object`

import org.veupathdb.lib.s3.s34k.S3TagSet
import org.veupathdb.lib.s3.s34k.fields.headers.S3HeadersMutable
import org.veupathdb.lib.s3.s34k.fields.query_params.S3QueryParamsMutable

/**
 * Object Tag Retrieval Operation Parameters
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class ObjectTagGetParams : BaseObjectRequest {

  /**
   * Callback that will be called on successful operation completion.
   */
  var callback: ((tags: S3TagSet) -> Unit)?

  constructor(
    path: String? = null,
    region: String? = null,
    callback: ((tags: S3TagSet) -> Unit)? = null
  ) : super(path, region) {
    this.callback = callback
  }

  internal constructor(
    path: String?,
    region: String?,
    callback: ((tags: S3TagSet) -> Unit)?,
    headers: S3HeadersMutable,
    queryParams: S3QueryParamsMutable,
  ) : super(path, region, headers, queryParams) {
    this.callback = callback
  }
}