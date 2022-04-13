package org.veupathdb.lib.s3.s34k.params

/**
 * Bucket Exists Check Operation Parameters
 *
 * @constructor Constructs a new [BucketExistsParams] instance.
 *
 * @param callback Optional callback that will be called upon request
 * completion.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class BucketExistsParams(val callback: ((exists: Boolean) -> Unit)? = null)
  : BucketRequestParams()
{
  override fun toString(): String {
    val out = StringBuilder(2048)

    out.append("BucketExistsParams {")
    out.append("  callback = ").append(callback).append(",\n")

    super.toString(out)

    out.append("}")

    return out.toString()
  }
}