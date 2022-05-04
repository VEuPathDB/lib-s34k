package org.veupathdb.lib.s3.s34k.errors

import org.veupathdb.lib.s3.s34k.S3BucketName
import org.veupathdb.lib.s3.s34k.S3ErrorCode


/**
 * `BucketAlreadyExists`
 *
 * The requested bucket name is not available. The bucket namespace is shared by
 * all users of the system. Specify a different name and try again.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since  v0.1.0
 */
open class BucketAlreadyExistsException : AbstractBucketOperationError {

  override val code = S3ErrorCode.BucketAlreadyExists

  constructor(bucket: S3BucketName, msg: String) : super(bucket, msg)

  constructor(bucket: S3BucketName, cause: Throwable)
    : super(bucket, "Bucket $bucket already exists.", cause)

  constructor(bucket: S3BucketName, msg: String, cause: Throwable)
    : super(bucket, msg, cause)
}
