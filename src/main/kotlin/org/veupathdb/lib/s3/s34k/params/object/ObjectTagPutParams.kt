package org.veupathdb.lib.s3.s34k.params.`object`

import org.veupathdb.lib.s3.s34k.S3TagSet

/**
 * Empty Object Put Operation Parameters
 *
 * @constructor Constructs a new [ObjectTagPutParams] instance.
 *
 * @param path Path to the object target of this request.
 *
 * @param callback Optional callback that will be called upon request
 * completion.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class ObjectTagPutParams(
  path: String? = null,
  var callback: ((S3TagSet) -> Unit)? = null
) : SealedObjPutReqParams(path) {
  override fun toString(): String {
    val out = StringBuilder(2048)

    out.append("ObjectTagPutParams {")
    callback?.also { out.append("  callback = ").append(it).append(",\n") }

    super.toString(out)

    out.append("}")

    return out.toString()
  }
}