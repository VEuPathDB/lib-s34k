package org.veupathdb.lib.s3.s34k.errors

import org.veupathdb.lib.s3.s34k.fields.BucketName

/**
 * `NoSuchKey`
 *
 * The specified key does not exist.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since  v0.1.0
 */
open class ObjectNotFoundError : ObjectError {

  constructor(bucket: BucketName, path: String) : super(bucket, path)

  constructor(bucket: BucketName, path: String, message: String) : super(bucket, path, message)

  constructor(bucket: BucketName, path: String, cause: Throwable) : super(bucket, path, err(bucket, path))

  constructor(bucket: BucketName, path: String, message: String, cause: Throwable) : super(bucket, path, message, cause)
}

@Suppress("NOTHING_TO_INLINE")
private inline fun err(bucket: BucketName, path: String) =
  "Object '$path' not found in bucket '$bucket'"