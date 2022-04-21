package org.veupathdb.lib.s3.s34k.`object`.request

import org.veupathdb.lib.s3.s34k.fields.headers.S3HeadersMutable
import org.veupathdb.lib.s3.s34k.fields.query_params.S3QueryParamsMutable

// TODO: Document me
class ObjectDeleteParams : BaseObjectRequest {

  var callback: ((deleted: Boolean) -> Unit)?

  constructor(
    path:     String?       = null,
    region:   String?       = null,
    callback: ((deleted: Boolean) -> Unit)? = null,
  ) : super(path, region) {
    this.callback = callback
  }

  internal constructor(
    path:        String?,
    region:      String?,
    callback:    ((deleted: Boolean) -> Unit)?,
    headers: S3HeadersMutable,
    queryParams: S3QueryParamsMutable
  ) : super(path, region, headers, queryParams) {
    this.callback = callback
  }
}