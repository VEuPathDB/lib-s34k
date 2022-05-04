package org.veupathdb.lib.s3.s34k.errors

import org.veupathdb.lib.s3.s34k.S3BucketName
import org.veupathdb.lib.s3.s34k.S3ErrorCode


/**
 * `NoSuchBucket`
 *
 * The specified bucket does not exist.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since  v0.1.0
 */
class BucketNotFoundError : AbstractBucketOperationError {

  override val code = S3ErrorCode.NoSuchBucket

  constructor(bucket: S3BucketName)
    : super(bucket, "Bucket $bucket does not exist.")

  constructor(bucket: S3BucketName, message: String)
    : super(bucket, message)

  constructor(bucket: S3BucketName, cause: Throwable)
    : super(bucket, "Bucket $bucket already exists.", cause)

  constructor(bucket: S3BucketName, message: String, cause: Throwable)
    : super(bucket, message, cause)
}
