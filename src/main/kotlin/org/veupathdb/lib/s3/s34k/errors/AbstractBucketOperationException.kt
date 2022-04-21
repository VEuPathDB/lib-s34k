package org.veupathdb.lib.s3.s34k.errors

import org.veupathdb.lib.s3.s34k.fields.BucketName


abstract class AbstractBucketOperationException : AbstractResponseException {

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
