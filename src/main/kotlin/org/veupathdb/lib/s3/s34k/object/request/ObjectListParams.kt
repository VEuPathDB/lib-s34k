package org.veupathdb.lib.s3.s34k.`object`.request

import org.veupathdb.lib.s3.s34k.fields.headers.S3HeadersMutable
import org.veupathdb.lib.s3.s34k.fields.query_params.S3QueryParamsMutable
import org.veupathdb.lib.s3.s34k.params.RegionRequest

class ObjectListParams : RegionRequest {

  constructor(region: String? = null) : super(region)

  internal constructor (
    region: String?,
    headers: S3HeadersMutable,
    queryParams: S3QueryParamsMutable
  ) : super(region, headers, queryParams)
}