package org.veupathdb.lib.s3.s34k.requests.bucket

import org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException
import org.veupathdb.lib.s3.s34k.fields.BucketName
import org.veupathdb.lib.s3.s34k.requests.S3RegionRequestParams

/**
 * S3 Bucket Request
 *
 * Base type for S3 bucket operation param sets.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3BucketRequestParams : S3RegionRequestParams {

  /**
   * *Required* name of the target S3 bucket.
   *
   * This value must be set or an [InvalidRequestConfigException] will be thrown
   * when the request is attempted.
   */
  var bucketName: BucketName?
}