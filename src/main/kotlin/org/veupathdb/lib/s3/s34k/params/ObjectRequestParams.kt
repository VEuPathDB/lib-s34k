package org.veupathdb.lib.s3.s34k.params

import org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException

/**
 * Object Request Params
 *
 * Base type for S3 object operation param sets.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
sealed class ObjectRequestParams : RequestParams() {

  /**
   * Path to the object target of this request.
   *
   * This value must be set or an [InvalidRequestConfigException] will be thrown
   * when the request is attempted.
   */
  var path = ""

  override fun toString(sb: StringBuilder) {
    sb.append("  path = ").append(path).append(",\n")
    super.toString(sb)
  }
}
