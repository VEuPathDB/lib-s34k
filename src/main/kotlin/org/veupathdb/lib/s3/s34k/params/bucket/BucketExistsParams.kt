package org.veupathdb.lib.s3.s34k.params.bucket

/**
 * Bucket Exists Check Operation Parameters
 *
 * @constructor Constructs a new [BucketExistsParams] instance.
 *
 * @param bucket Name of the target S3 bucket.
 *
 * @throws IllegalArgumentException If the value set is not between `3` and
 * `63` characters in length.
 *
 * @param callback Optional callback that will be called upon request
 * completion.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class BucketExistsParams(
  bucket: String? = null,
  var callback: ((exists: Boolean) -> Unit)? = null
) : SealedBucketReqParams() {
  override fun toString(): String {
    val out = StringBuilder(2048)

    out.append("BucketExistsParams {")
    callback?.also { out.append("  callback = ").append(it).append(",\n") }

    super.toString(out)

    out.append("}")

    return out.toString()
  }
}