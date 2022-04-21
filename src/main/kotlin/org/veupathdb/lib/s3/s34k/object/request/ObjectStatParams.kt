package org.veupathdb.lib.s3.s34k.`object`.request

import org.veupathdb.lib.s3.s34k.S3ObjectMeta
import org.veupathdb.lib.s3.s34k.fields.headers.S3HeadersMutable
import org.veupathdb.lib.s3.s34k.fields.query_params.S3QueryParamsMutable

/**
 * Empty Object Put Operation Parameters
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class ObjectStatParams : BaseObjectRequest {

  /**
   * Callback that will be called on successful operation completion.
   */
  var callback: ((S3ObjectMeta) -> Unit)?

  constructor(
    path: String? = null,
    region: String? = null,
    callback: ((S3ObjectMeta) -> Unit)? = null
  ) : super(path, region) {
    this.callback = callback
  }

  internal constructor(
    path: String?,
    region: String?,
    callback: ((S3ObjectMeta) -> Unit)?,
    headers: S3HeadersMutable,
    queryParams: S3QueryParamsMutable,
  ) : super(path, region, headers, queryParams) {
    this.callback = callback
  }
}