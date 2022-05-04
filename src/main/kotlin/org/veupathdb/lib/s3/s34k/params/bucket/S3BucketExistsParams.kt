package org.veupathdb.lib.s3.s34k.params.bucket

/**
 * Bucket existence check request parameters.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3BucketExistsParams : S3BucketRequestParams {

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed a boolean flag indicating whether the target
   * bucket exists in the S3 store.
   */
  var callback: ((exists: Boolean) -> Unit)?
}