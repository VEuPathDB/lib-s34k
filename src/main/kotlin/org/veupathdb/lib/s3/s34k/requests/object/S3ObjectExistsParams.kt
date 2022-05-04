package org.veupathdb.lib.s3.s34k.requests.`object`

/**
 * Object existence test request parameters.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3ObjectExistsParams : S3ObjectRequestParams {

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed a boolean flag indicating whether the target
   * object exists.
   */
  var callback: ((exists: Boolean) -> Unit)?
}