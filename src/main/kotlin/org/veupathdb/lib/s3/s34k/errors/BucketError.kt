package org.veupathdb.lib.s3.s34k.errors

import org.veupathdb.lib.s3.s34k.fields.BucketName

open class BucketError : S34KError {

  val bucket: BucketName

  constructor(bucket: BucketName) : super() {
    this.bucket = bucket
  }

  constructor(bucket: BucketName, message: String) : super(message) {
    this.bucket = bucket
  }

  constructor(bucket: BucketName, cause: Throwable) : super(cause) {
    this.bucket = bucket
  }

  constructor(bucket: BucketName, message: String, cause: Throwable) : super(message, cause) {
    this.bucket = bucket
  }
}
