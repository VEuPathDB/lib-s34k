package org.veupathdb.lib.s3.s34k.params.bucket

import org.veupathdb.lib.s3.s34k.S3Bucket
import org.veupathdb.lib.s3.s34k.fields.S3MutableTagMap
import org.veupathdb.lib.s3.s34k.params.S3RegionRequestParams

/**
 * Bucket create request parameters.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3BucketCreateParams : S3RegionRequestParams {

  /**
   * Tags that may be attached to the target bucket during the execution of
   * this S3 operation.
   */
  val tags: S3MutableTagMap

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed a handle on the newly created S3 bucket.
   */
  var callback: ((bucket: S3Bucket) -> Unit)?
}