package org.veupathdb.lib.s3.s34k.requests.bucket

import org.veupathdb.lib.s3.s34k.requests.S3TagCreateParams

/**
 * Bucket tag creation request params.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3BucketTagCreateParams : S3TagCreateParams {

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   */
  var callback: (() -> Unit)?

}