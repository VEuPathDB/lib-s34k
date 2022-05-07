package org.veupathdb.lib.s3.s34k.errors

import org.veupathdb.lib.s3.s34k.BucketName
import org.veupathdb.lib.s3.s34k.S3ErrorCode

/**
 * `BucketAlreadyOwnedByYou`
 *
 * The bucket that you tried to create already exists, and you own it. Amazon S3
 * returns this error in all AWS Regions except in the US East (N. Virginia)
 * Region (us-east-1). For legacy compatibility, if you re-create an existing
 * bucket that you already own in us-east-1, Amazon S3 returns 200 OK and resets
 * the bucket access control lists (ACLs).
 *
 * For Amazon S3 on Outposts, the bucket that you tried to create already exists
 * in your Outpost and you own it.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since  v0.1.0
 */
open class BucketAlreadyOwnedByYouError : BucketAlreadyExistsError {

  override val code = S3ErrorCode.BucketAlreadyOwnedByYou

  constructor(bucket: BucketName, msg: String) : super(bucket, msg)

  constructor(bucket: BucketName, msg: String, cause: Throwable) : super(
    bucket,
    msg,
    cause
  )

  constructor(bucket: BucketName, cause: Throwable) : super(
    bucket,
    "You already own bucket $bucket",
    cause
  )
}