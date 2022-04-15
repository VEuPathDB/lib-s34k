package org.veupathdb.lib.s3.s34k.params.bucket

import org.veupathdb.lib.s3.s34k.S3TagSet
import org.veupathdb.lib.s3.s34k.params.AbstractRequestParams

/**
 * Bucket Tag Retrieval Operation Parameters
 *
 * @constructor Constructs a new [BucketTagGetParams] instance.
 *
 * @param callback Optional callback that will be called upon request
 * completion.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class BucketTagGetParams(val callback: ((tags: S3TagSet) -> Unit)? = null)
  : AbstractRequestParams()
{
  override fun toString(): String {
    val out = StringBuilder(2048)

    out.append("BucketTagGetParams {")
    out.append("  callback = ").append(callback).append(",\n")

    super.toString(out)

    out.append("}")

    return out.toString()
  }
}