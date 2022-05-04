package org.veupathdb.lib.s3.s34k.params.bucket

import org.veupathdb.lib.s3.s34k.Bucket
import org.veupathdb.lib.s3.s34k.fields.S3MutableTagMap
import org.veupathdb.lib.s3.s34k.params.RegionRequestParams

/**
 * Bucket create request parameters.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface BucketCreateParams : RegionRequestParams {

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
  var callback: ((bucket: Bucket) -> Unit)?
}