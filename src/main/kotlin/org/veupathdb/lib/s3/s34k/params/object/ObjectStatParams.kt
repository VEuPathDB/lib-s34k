package org.veupathdb.lib.s3.s34k.params.`object`

import org.veupathdb.lib.s3.s34k.S3ObjectMeta

/**
 * Empty Object Put Operation Parameters
 *
 * @constructor Constructs a new [ObjectStatParams] instance.
 *
 * @param callback Optional callback that will be called upon request
 * completion.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class ObjectStatParams(val callback: ((S3ObjectMeta) -> Unit)? = null)
  : SealedObjReqParams()
{
  override fun toString(): String {
    val out = StringBuilder(2048)

    out.append("ObjectStatParams {")
    out.append("  callback = ").append(callback).append(",\n")

    super.toString(out)

    out.append("}")

    return out.toString()
  }
}