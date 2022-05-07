package org.veupathdb.lib.s3.s34k.errors

import org.veupathdb.lib.s3.s34k.fields.BucketName

open class ObjectError : BucketError {

  val path: String

  constructor(bucket: BucketName, path: String) : super(bucket) {
    this.path = path
  }

  constructor(bucket: BucketName, path: String, message: String) : super(bucket, message) {
    this.path = path
  }

  constructor(bucket: BucketName, path: String, cause: Throwable) : super(bucket, cause) {
    this.path = path
  }

  constructor(bucket: BucketName, path: String, message: String, cause: Throwable) : super(bucket, message, cause) {
    this.path = path
  }
}