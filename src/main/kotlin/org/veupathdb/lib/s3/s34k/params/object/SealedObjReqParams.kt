package org.veupathdb.lib.s3.s34k.params.`object`

import org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException
import org.veupathdb.lib.s3.s34k.params.AbstractRequestParams

/**
 * Object Request Params
 *
 * Base type for S3 object operation param sets.
 *
 * @constructor Constructs a new [SealedObjReqParams] instance.
 *
 * @param path Path to the object target of this request.
 *
 * This value must be set or an [InvalidRequestConfigException] will be thrown
 * when the request is attempted.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
sealed class SealedObjReqParams(var path: String? = null) : AbstractRequestParams() {

  override fun toString(sb: StringBuilder) {
    sb.append("  path = ").append(path).append(",\n")
    super.toString(sb)
  }
}
