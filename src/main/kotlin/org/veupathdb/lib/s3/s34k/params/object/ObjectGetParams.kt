package org.veupathdb.lib.s3.s34k.params.`object`

import org.veupathdb.lib.s3.s34k.S3StreamObject

/**
 * Object Retrieval Operation Parameters
 *
 * @constructor Constructs a new [ObjectGetParams] instance.
 *
 * @param callback Optional callback that will be called upon request
 * completion.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class ObjectGetParams(var callback: ((S3StreamObject) -> Unit)? = null)
  : SealedObjReqParams()
{
  override fun toString(): String {
    val out = StringBuilder(2048)

    out.append("ObjectGetParams {\n")
    callback?.also { out.append("  callback = ").append(it).append(",\n") }
    out.append("}")

    super.toString(out)

    return out.toString()
  }
}