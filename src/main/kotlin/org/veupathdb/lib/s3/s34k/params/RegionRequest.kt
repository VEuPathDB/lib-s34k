package org.veupathdb.lib.s3.s34k.params

import org.veupathdb.lib.s3.s34k.fields.headers.S3HeadersMutable
import org.veupathdb.lib.s3.s34k.fields.query_params.S3QueryParamsMutable

// TODO: Document me
open class RegionRequest : BaseRequest {

  var region: String?

  constructor(region: String? = null) {
    this.region = region
  }

  internal constructor(
    region:      String?,
    headers: S3HeadersMutable,
    queryParams: S3QueryParamsMutable,
  ) : super(headers, queryParams) {
    this.region = region
  }
}