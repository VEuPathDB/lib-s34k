package org.veupathdb.lib.s3.s34k.params.bucket

import org.veupathdb.lib.s3.s34k.S3Bucket

// TODO: Document me
class BucketListParams(
  bucket: String? = null,
  region: String? = null,
  var callback: ((List<S3Bucket>) -> Unit)? = null
) : SealedBucketReqParams(bucket, region) {
  override fun toString(): String {
    val out = StringBuilder(2048)

    out.append("BucketListParams {")
    callback?.also { out.append("  callback = ").append(it).append(",\n") }

    super.toString(out)

    out.append("}")

    return out.toString()
  }
}