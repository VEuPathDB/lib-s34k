package org.veupathdb.lib.s3.s34k.params.`object`

import org.veupathdb.lib.s3.s34k.S3StreamObject
import org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException

/**
 * Object Retrieval Operation Parameters
 *
 * @constructor Constructs a new [ObjectGetParams] instance.
 *
 * @param path Path to the object target of this request.
 *
 * This value must be set or an [InvalidRequestConfigException] will be thrown
 * when the request is attempted.
 *
 * @param callback Optional callback that will be called upon request
 * completion.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class ObjectGetParams(
  path: String? = null,
  var callback: ((S3StreamObject) -> Unit)? = null
) : SealedObjReqParams(path) {
  override fun toString(): String {
    val out = StringBuilder(2048)

    out.append("ObjectGetParams {\n")
    callback?.also { out.append("  callback = ").append(it).append(",\n") }
    out.append("}")

    super.toString(out)

    return out.toString()
  }
}