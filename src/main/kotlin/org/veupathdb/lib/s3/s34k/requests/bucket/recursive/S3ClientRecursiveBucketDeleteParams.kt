package org.veupathdb.lib.s3.s34k.requests.bucket.recursive

import org.veupathdb.lib.s3.s34k.S3Client
import org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException
import org.veupathdb.lib.s3.s34k.fields.BucketName

/**
 * Client Recursive Bucket Delete Params.
 *
 * Recursive bucket delete parameters used by calls to the
 * [S3Client.deleteBucketRecursive] method.
 *
 * This type is based on the [S3RecursiveBucketDeleteParams] with the additional
 * field `bucketName`.
 *
 * For additional information about recursive bucket deletion, see the
 * [S3RecursiveBucketDeleteParams] documentation.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3ClientRecursiveBucketDeleteParams : S3RecursiveBucketDeleteParams {

  /**
   * *Required* name of the target S3 bucket.
   *
   * This value must be set or an [InvalidRequestConfigException] will be thrown
   * when the request is attempted.
   */
  var bucketName: BucketName?

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   */
  var callback: (() -> Unit)?
}