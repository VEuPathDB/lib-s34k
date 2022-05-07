package org.veupathdb.lib.s3.s34k.errors

import org.veupathdb.lib.s3.s34k.BucketName
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
open class BucketNotFoundError : AbstractBucketOperationError {

  override val code = S3ErrorCode.NoSuchBucket

  constructor(bucket: BucketName)
    : super(bucket, "Bucket $bucket does not exist.")

  constructor(bucket: BucketName, message: String)
    : super(bucket, message)

  constructor(bucket: BucketName, cause: Throwable)
    : super(bucket, "Bucket $bucket already exists.", cause)

  constructor(bucket: BucketName, message: String, cause: Throwable)
    : super(bucket, message, cause)
}
