package org.veupathdb.lib.s3.s34k.requests.client

import org.veupathdb.lib.s3.s34k.requests.bucket.S3BucketRequestParams

/**
 * Bucket delete request parameters.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3BucketDeleteParams : S3BucketRequestParams {

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed a boolean flag indicating whether the target
   * bucket was deleted.  `true` indicates that the bucket existed in the store
   * at the time of the operation and is now deleted, `false` indicates that the
   * bucket had already been removed from the store at the time this operation
   * was run.
   */
  var callback: ((deleted: Boolean) -> Unit)?
}