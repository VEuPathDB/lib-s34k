package org.veupathdb.lib.s3.s34k.params

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
class ObjectGetParams(val callback: ((S3StreamObject) -> Unit)? = null)
  : ObjectRequestParams()
{
  override fun toString(): String {
    val out = StringBuilder(2048)

    out.append("  callback = ").append(callback).append(",\n")

    super.toString(out)

    return out.toString()
  }
}