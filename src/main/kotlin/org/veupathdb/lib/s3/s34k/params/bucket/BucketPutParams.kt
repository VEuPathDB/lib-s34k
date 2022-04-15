package org.veupathdb.lib.s3.s34k.params.bucket

import org.veupathdb.lib.s3.s34k.S3Bucket

/**
 * Put Bucket Operation Parameters
 *
 * @constructor Constructs a new [BucketPutParams] instance.
 *
 * @param callback Optional callback that will be called upon request
 * completion.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class BucketPutParams(var callback: ((bucket: S3Bucket) -> Unit)? = null)
  : SealedBucketReqParams()
{
  override fun toString(): String {
    val out = StringBuilder(2048)

    out.append("BucketPutParams {")
    callback?.also { out.append("  callback = ").append(it).append(",\n") }

    super.toString(out)

    out.append("}")

    return out.toString()
  }
}