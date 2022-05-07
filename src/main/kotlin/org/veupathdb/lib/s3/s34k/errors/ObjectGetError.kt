package org.veupathdb.lib.s3.s34k.errors

import org.veupathdb.lib.s3.s34k.fields.BucketName

class ObjectGetError : ObjectError {
  constructor(bucket: BucketName, path: String) : super(bucket, path, err(bucket, path))
  constructor(bucket: BucketName, path: String, message: String) : super(bucket, path, message)
  constructor(bucket: BucketName, path: String, cause: Throwable) : super(bucket, path, cause)
  constructor(bucket: BucketName, path: String, message: String, cause: Throwable) : super(bucket, path, message, cause)
}

@Suppress("NOTHING_TO_INLINE")
private inline fun err(bucket: BucketName, path: String) =
  "Failed to get object '$path' from bucket '$bucket'"