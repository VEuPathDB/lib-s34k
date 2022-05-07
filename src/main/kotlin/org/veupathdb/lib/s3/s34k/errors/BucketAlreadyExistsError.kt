package org.veupathdb.lib.s3.s34k.errors

import org.veupathdb.lib.s3.s34k.BucketName
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
open class BucketAlreadyExistsError : AbstractBucketOperationError {

  override val code = S3ErrorCode.BucketAlreadyExists

  constructor(bucket: BucketName, msg: String) : super(bucket, msg)

  constructor(bucket: BucketName, cause: Throwable)
    : super(bucket, "Bucket $bucket already exists.", cause)

  constructor(bucket: BucketName, msg: String, cause: Throwable)
    : super(bucket, msg, cause)
}
