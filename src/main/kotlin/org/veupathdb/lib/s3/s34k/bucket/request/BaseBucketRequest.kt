package org.veupathdb.lib.s3.s34k.bucket.request

import org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException
import org.veupathdb.lib.s3.s34k.fields.BucketName
import org.veupathdb.lib.s3.s34k.fields.headers.S3HeadersMutable
import org.veupathdb.lib.s3.s34k.fields.query_params.S3QueryParamsMutable
import org.veupathdb.lib.s3.s34k.params.RegionRequest

/**
 * Bucket Request Params
 *
 * Base type for S3 bucket operation param sets.
 *
 * @constructor Constructs a new [BaseBucketRequest] instance.
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
open class BaseBucketRequest : RegionRequest {

  /**
   * Name of the target S3 bucket.
   *
   * This value must be set or an [InvalidRequestConfigException] will be thrown
   * when the request is attempted.
   */
  var bucket: BucketName?

  constructor(bucket: String? = null, region: String? = null) : super(region) {
    this.bucket = bucket?.let(::BucketName)
  }

  internal constructor(
    bucket:      BucketName,
    region:      String?,
    headers: S3HeadersMutable,
    queryParams: S3QueryParamsMutable,
  ) : super(region, headers, queryParams) {
    this.bucket = bucket
  }

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
}
