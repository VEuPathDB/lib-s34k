package org.veupathdb.lib.s3.s34k.params.`object`

import org.veupathdb.lib.s3.s34k.S3Object

/**
 * Directory Put Operation Parameters
 *
 * @constructor Constructs a new [DirectoryPutParams] instance.
 *
 * @param callback Optional callback that will be called upon request
 * completion.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class DirectoryPutParams(val callback: ((directory: S3Object) -> Unit)? = null)
  : ObjectPutRequestParams()
{
  override fun toString(): String {
    val out = StringBuilder(2048)

    out.append("DirectoryPutParams {")
    out.append("  callback = ").append(callback).append(",\n")

    super.toString(out)

    out.append("}")

    return out.toString()
  }
}