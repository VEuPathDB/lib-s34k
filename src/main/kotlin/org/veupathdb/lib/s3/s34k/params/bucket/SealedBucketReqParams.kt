package org.veupathdb.lib.s3.s34k.params.bucket

import org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException
import org.veupathdb.lib.s3.s34k.params.RequestParams

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
 * @throws IllegalArgumentException If the bucket parameter is not `null` and
 * violates any of the rules outlined in the [BucketName] constructor
 * documentation.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
sealed class SealedBucketReqParams(bucket: String? = null, var region: String? = null) : RequestParams() {

  /**
   * Name of the target S3 bucket.
   *
   * This value must be set or an [InvalidRequestConfigException] will be thrown
   * when the request is attempted.
   */
  var bucket: BucketName? = bucket?.let(::BucketName)

  /**
   * Converts the given string into a [BucketName] instance and sets it to the
   * [bucket] property.
   *
   * @param name Bucket name.
   *
   * @throws IllegalArgumentException If the given name violates any of the
   * rules outlined in the [BucketName] constructor documentation.
   */
  fun setBucketName(name: String) {
    bucket = BucketName(name)
  }

  override fun toString(sb: StringBuilder) {
    sb.append("  bucket = ").append(bucket).append(",\n")
    region?.also { sb.append("  region = ").append(it).append(",\n") }
    super.toString(sb)
  }
}
