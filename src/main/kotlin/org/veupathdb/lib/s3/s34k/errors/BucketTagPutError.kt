package org.veupathdb.lib.s3.s34k.errors

import org.veupathdb.lib.s3.s34k.fields.BucketName

class BucketTagPutError : BucketError {
  constructor(bucket: BucketName) : super(bucket, err(bucket))
  constructor(bucket: BucketName, message: String) : super(bucket, message)
  constructor(bucket: BucketName, cause: Throwable) : super(bucket, cause)
  constructor(bucket: BucketName, message: String, cause: Throwable) : super(bucket, message, cause)
}

@Suppress("NOTHING_TO_INLINE")
private inline fun err(bucket: BucketName) =
  "Failed to put tags onto bucket '$bucket'"