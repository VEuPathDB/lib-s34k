package org.veupathdb.lib.s3.s34k.errors

open class BucketOperationException : S34kException {

  val bucket: String

  constructor(
    bucket: String,
    msg:    String,
    cause:  Throwable
  ) : super(msg, cause) {
    this.bucket = bucket
  }

  constructor(bucket: String, msg: String) : super(msg) {
    this.bucket = bucket
  }
}
