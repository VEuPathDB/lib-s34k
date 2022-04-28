package org.veupathdb.lib.s3.s34k.requests.client

import org.veupathdb.lib.s3.s34k.S3Bucket
import org.veupathdb.lib.s3.s34k.requests.bucket.S3BucketRequestParams

/**
 * Fetch bucket request parameters.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3BucketGetParams : S3BucketRequestParams {

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed a handle on the bucket retrieved from the S3
   * store.
   */
  var callback: ((bucket: S3Bucket) -> Unit)?
}