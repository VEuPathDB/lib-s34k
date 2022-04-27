package org.veupathdb.lib.s3.s34k.requests.`object`

/**
 * Object tag creation request parameters.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3ObjectTagCreateParams : S3ObjectWriteParams {

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   */
  var callback: (() -> Unit)?
}