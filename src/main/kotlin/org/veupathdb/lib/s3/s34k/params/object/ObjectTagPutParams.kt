package org.veupathdb.lib.s3.s34k.params.`object`

/**
 * Empty Object Put Operation Parameters
 *
 * @constructor Constructs a new [ObjectTagPutParams] instance.
 *
 * @param callback Optional callback that will be called upon request
 * completion.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class ObjectTagPutParams(val callback: (() -> Unit)? = null)
  : ObjectPutRequestParams()
{
  override fun toString(): String {
    val out = StringBuilder(2048)

    out.append("ObjectTagPutParams {")
    out.append("  callback = ").append(callback).append(",\n")

    super.toString(out)

    out.append("}")

    return out.toString()
  }
}