package org.veupathdb.lib.s3.s34k.errors

import org.veupathdb.lib.s3.s34k.S3ErrorCode
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
class ObjectNotFoundError : AbstractResponseException {

  override val code = S3ErrorCode.NoSuchKey

  val bucket: BucketName

  val path: String

  constructor(bucket: BucketName, path: String) :
    super("Object $path not found in bucket $bucket") {
    this.bucket = bucket
    this.path   = path
  }

  constructor(bucket: BucketName, path: String, cause: Throwable) :
    super("Object $path not found in bucket $bucket", cause) {
    this.bucket = bucket
    this.path   = path
  }

  constructor(
    bucket:  BucketName,
    path:    String,
    message: String
  ) : super(message) {
    this.bucket = bucket
    this.path   = path
  }

  constructor(
    bucket:  BucketName,
    path:    String,
    message: String,
    cause:   Throwable
  ) : super(message, cause) {
    this.bucket = bucket
    this.path   = path
  }
}
