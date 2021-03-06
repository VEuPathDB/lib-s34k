package org.veupathdb.lib.s3.s34k.errors

import org.veupathdb.lib.s3.s34k.fields.BucketName


/**
 * `NoSuchBucket`
 *
 * The specified bucket does not exist.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since  v0.1.0
 */
open class BucketNotFoundError : BucketError {

  constructor(bucket: BucketName) : super(bucket, err(bucket))

  constructor(bucket: BucketName, message: String) : super(bucket, message)

  constructor(bucket: BucketName, cause: Throwable) : super(bucket, err(bucket), cause)

  constructor(bucket: BucketName, message: String, cause: Throwable) : super(bucket, message, cause)
}

@Suppress("NOTHING_TO_INLINE")
private inline fun err(bucket: BucketName) =
  "Bucket '$bucket' does not exist"
