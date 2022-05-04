package org.veupathdb.lib.s3.s34k.errors

import org.veupathdb.lib.s3.s34k.S3BucketName
import org.veupathdb.lib.s3.s34k.S3ErrorCode

/**
 * Bucket is not empty exception.
 *
 * Thrown when attempting to delete a bucket that still has object contents.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class BucketNotEmptyException : AbstractBucketOperationError {

  override val code = S3ErrorCode.BucketNotEmpty

  constructor(bucket: S3BucketName, msg: String) : super(bucket, msg)

  constructor(bucket: S3BucketName, msg: String, cause: Throwable)
    : super(bucket, msg, cause)

  constructor(bucket: S3BucketName, cause: Throwable)
    : super(bucket, "Cannot delete bucket $bucket, bucket is not empty.", cause)

  constructor(bucket: S3BucketName)
    : super(bucket, "Cannot delete bucket $bucket, bucket is not empty.")
}