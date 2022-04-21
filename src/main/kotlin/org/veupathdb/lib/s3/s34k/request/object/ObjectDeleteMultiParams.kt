package org.veupathdb.lib.s3.s34k.request.`object`

import org.veupathdb.lib.s3.s34k.fields.headers.S3HeadersMutable
import org.veupathdb.lib.s3.s34k.fields.PathSet
import org.veupathdb.lib.s3.s34k.fields.PathSetImpl
import org.veupathdb.lib.s3.s34k.fields.query_params.S3QueryParamsMutable
import org.veupathdb.lib.s3.s34k.params.RegionRequest

// TODO: Document me
class ObjectDeleteMultiParams : RegionRequest {

  val paths: PathSet

  var callback: (() -> Unit)?

  constructor(
    region:   String?       = null,
    callback: (() -> Unit)? = null,
  ) : super(region) {
    this.paths    = PathSetImpl()
    this.callback = callback
  }

  internal constructor(
    paths:       PathSet,
    region:      String?,
    callback:    (() -> Unit)?,
    headers: S3HeadersMutable,
    queryParams: S3QueryParamsMutable
  ) : super(region, headers, queryParams) {
    this.paths    = paths
    this.callback = callback
  }
}