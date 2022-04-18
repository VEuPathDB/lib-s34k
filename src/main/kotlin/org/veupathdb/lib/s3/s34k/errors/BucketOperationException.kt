package org.veupathdb.lib.s3.s34k.errors

import org.veupathdb.lib.s3.s34k.params.bucket.BucketName

open class BucketOperationException : S34kException {

  val bucket: BucketName

  constructor(
    bucket: BucketName,
    msg:    String,
    cause:  Throwable
  ) : super(msg, cause) {
    this.bucket = bucket
  }

  constructor(bucket: BucketName, msg: String) : super(msg) {
    this.bucket = bucket
  }
}
