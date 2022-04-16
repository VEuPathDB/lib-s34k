package org.veupathdb.lib.s3.s34k.params.`object`

import org.veupathdb.lib.s3.s34k.S3Object
import org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException

/**
 * Directory Put Operation Parameters
 *
 * @constructor Constructs a new [DirectoryPutParams] instance.
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
class DirectoryPutParams(
  path: String? = null,
  var callback: ((directory: S3Object) -> Unit)? = null,
) : SealedObjPutReqParams(path) {
  override fun toString(): String {
    val out = StringBuilder(2048)

    out.append("DirectoryPutParams {")
    callback?.also { out.append("  callback = ").append(it).append(",\n") }

    super.toString(out)

    out.append("}")

    return out.toString()
  }
}