package org.veupathdb.lib.s3.s34k.errors

import org.veupathdb.lib.s3.s34k.fields.BucketName

/**
 * Bucket is not empty exception.
 *
 * Thrown when attempting to delete a bucket that still has object contents.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
open class BucketNotEmptyError : BucketError {

  constructor(bucket: BucketName) : super(bucket, err(bucket))

  constructor(bucket: BucketName, message: String) : super(bucket, message)

  constructor(bucket: BucketName, cause: Throwable) : super(bucket, err(bucket), cause)

  constructor(bucket: BucketName, message: String, cause: Throwable) : super(bucket, message, cause)
}

private inline fun err(bucket: BucketName) =
  "Cannot delete non-empty bucket '$bucket'"