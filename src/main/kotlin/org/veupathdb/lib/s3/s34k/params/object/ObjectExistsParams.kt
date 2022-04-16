package org.veupathdb.lib.s3.s34k.params.`object`

/**
 * Object Exists Test Operation Parameters
 *
 * @constructor Constructs a new [ObjectExistsParams] instance.
 *
 * @param callback Optional callback that will be called upon request
 * completion.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class ObjectExistsParams(
  path: String? = null,
  var callback: ((Boolean) -> Unit)? = null)
  : SealedObjReqParams(path)
{
  override fun toString(): String {
    val out = StringBuilder(2048)

    out.append("ObjectExistsParams {")
    callback?.also { out.append("  callback = ").append(it).append(",\n") }

    super.toString(out)

    out.append("}")

    return out.toString()
  }
}
