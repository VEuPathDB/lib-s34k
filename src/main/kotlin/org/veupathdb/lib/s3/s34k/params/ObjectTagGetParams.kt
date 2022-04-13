package org.veupathdb.lib.s3.s34k.params

import org.veupathdb.lib.s3.s34k.S3TagSet

/**
 * Object Tag Retrieval Operation Parameters
 *
 * @constructor Constructs a new [ObjectTagGetParams] instance.
 *
 * @param callback Optional callback that will be called upon request
 * completion.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class ObjectTagGetParams(val callback: ((tags: S3TagSet) -> Unit)? = null)
  : ObjectRequestParams()
{
  override fun toString(): String {
    val out = StringBuilder(2048)

    out.append("ObjectTagGetParams {")
    out.append("  callback = ").append(callback).append(",\n")

    super.toString(out)

    out.append("}")

    return out.toString()
  }
}