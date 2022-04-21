package org.veupathdb.lib.s3.s34k.`object`.request

import org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException
import org.veupathdb.lib.s3.s34k.fields.headers.S3HeadersMutable
import org.veupathdb.lib.s3.s34k.fields.query_params.S3QueryParamsMutable
import org.veupathdb.lib.s3.s34k.params.RegionRequest

/**
 * Object Request Params
 *
 * Base type for S3 object operation param sets.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
open class BaseObjectRequest : RegionRequest {

  /**
   * Path to the object target of this request.
   *
   * This value must be set or an [InvalidRequestConfigException] will be thrown
   * when the request is attempted.
   */
  var path: String?

  constructor(path: String? = null, region: String? = null) : super(region) {
    this.path = path
  }

  internal constructor(
    path:        String?,
    region:      String?,
    headers: S3HeadersMutable,
    queryParams: S3QueryParamsMutable,
  ) : super(region, headers, queryParams) {
    this.path = path
  }
}
