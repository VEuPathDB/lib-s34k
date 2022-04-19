package org.veupathdb.lib.s3.s34k.params.bucket

class BucketDeleteParams(
  bucket: String? = null,
  region: String? = null,
  val callback: (() -> Unit)? = null
) : SealedBucketReqParams(bucket, region) {

  override fun toString(): String {
    val out = StringBuilder(2048)

    out.append("BucketDeleteParams {\n")
    super.toString(out)
    callback?.let { out.append("  callback = ").append(callback).append(",\n") }
    out.append('}')

    return out.toString()
  }
}