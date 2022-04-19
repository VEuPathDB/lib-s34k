package org.veupathdb.lib.s3.s34k.errors

import org.veupathdb.lib.s3.s34k.params.bucket.BucketName

/**
 * Bucket is not empty exception.
 *
 * Thrown when attempting to delete a bucket that still has object contents.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class BucketNotEmptyException : S34kException {

  val bucket: BucketName

  constructor(bucket: BucketName, cause: Throwable) : super(
    "Cannot delete bucket $bucket, bucket is not empty.",
    cause
  ) {
    this.bucket = bucket
  }

  constructor(bucket: BucketName) : super(
    "Cannot delete bucket $bucket, bucket is not empty.",
  ) {
    this.bucket = bucket
  }
}