package org.veupathdb.lib.s3.s34k.params.`object`

import org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException
import org.veupathdb.lib.s3.s34k.params.BaseRequest

/**
 * Object Request Params
 *
 * Base type for S3 object operation param sets.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
open class BaseObjectRequest : BaseRequest {

  /**
   * Path to the object target of this request.
   *
   * This value must be set or an [InvalidRequestConfigException] will be thrown
   * when the request is attempted.
   */
  var path: String?

  constructor(path: String? = null) : super() {
    this.path = path
  }

  internal constructor(
    path:        String?,
    region:      String?,
    headers:     MutableMap<String, Array<String>>,
    queryParams: MutableMap<String, Array<String>>,
  ) : super(region, headers, queryParams) {
    this.path = path
  }
}
