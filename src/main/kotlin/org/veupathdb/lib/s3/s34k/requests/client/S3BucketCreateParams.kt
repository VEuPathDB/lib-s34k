package org.veupathdb.lib.s3.s34k.requests.client

import org.veupathdb.lib.s3.s34k.response.bucket.S3Bucket
import org.veupathdb.lib.s3.s34k.requests.bucket.S3BucketWriteRequestParams

/**
 * Bucket create request parameters.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3BucketCreateParams : S3BucketWriteRequestParams {

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed a handle on the newly created S3 bucket.
   */
  var callback: ((bucket: S3Bucket) -> Unit)?
}