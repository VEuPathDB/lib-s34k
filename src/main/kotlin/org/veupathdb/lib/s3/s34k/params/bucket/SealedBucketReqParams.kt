package org.veupathdb.lib.s3.s34k.params.bucket

import org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException
import org.veupathdb.lib.s3.s34k.params.AbstractRequestParams

/**
 * Bucket Request Params
 *
 * Base type for S3 bucket operation param sets.
 *
 * @constructor Constructs a new [SealedBucketReqParams] instance.
 *
 * @param bucket Name of the target S3 bucket.
 *
 * @param region Optional region value.
 *
 * @throws IllegalArgumentException If the value set is not between `3` and
 * `63` characters in length.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
sealed class SealedBucketReqParams(bucket: String? = null, var region: String? = null) : AbstractRequestParams() {

  /**
   * Name of the target S3 bucket.
   *
   * This value must be set or an [InvalidRequestConfigException] will be thrown
   * when the request is attempted.
   *
   * @throws IllegalArgumentException If the value set is not between `3` and
   * `63` characters in length.
   */
  var bucket: String? = bucket
    set(value) {
      if (value == null || value.length !in 3 .. 63)
        throw IllegalArgumentException("Bucket name must be between 3 and 64 characters in length.  Given value: $value")
      field = value
    }

  override fun toString(sb: StringBuilder) {
    sb.append("  bucket = ").append(bucket).append(",\n")
    region?.also { sb.append("  region = ").append(it).append(",\n") }
    super.toString(sb)
  }
}
