package org.veupathdb.lib.s3.s34k.requests.`object`

/**
 * Object delete request parameters.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3ObjectDeleteParams : S3ObjectRequestParams {

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed a boolean flag indicating whether the file was
   * deleted.  `true` means the file previously existed, and was deleted.
   * `false` means the file did not exist at the time the request was made.
   */
  var callback: ((Boolean) -> Unit)?
}