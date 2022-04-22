package org.veupathdb.lib.s3.s34k.requests

import org.veupathdb.lib.s3.s34k.requests.bucket.S3BucketTagCreateParams
import org.veupathdb.lib.s3.s34k.requests.`object`.S3ObjectTagCreateParams

/**
 * Generalized tag creation request parameters.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3BlankTagCreateParams: S3TagCreateParams {

  var callback: (() -> Unit)?

  /**
   * Converts this [S3BucketTagCreateParams] instance into an
   * [S3ObjectTagCreateParams] instance.
   *
   * @param path Path to the target object for the created request params.
   *
   * @return The converted [S3ObjectTagCreateParams] instance.
   */
  fun toObjectTagCreateParams(path: String): S3ObjectTagCreateParams

  /**
   * Converts this [S3BucketTagCreateParams] instance into an
   * [S3BucketTagCreateParams] instance.
   *
   * @return The converted [S3BucketTagCreateParams] instance.
   */
  fun toBucketTagCreateParams(): S3BucketTagCreateParams

}