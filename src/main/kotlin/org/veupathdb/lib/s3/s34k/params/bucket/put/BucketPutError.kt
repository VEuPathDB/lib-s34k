package org.veupathdb.lib.s3.s34k.params.bucket.put

import org.veupathdb.lib.s3.s34k.BucketName
import org.veupathdb.lib.s3.s34k.errors.S34KError

open class BucketPutError : S34KError {

  val bucket: BucketName

  val phase: BucketPutPhase

  constructor(bucket: BucketName, phase: BucketPutPhase) : super() {
    this.bucket = bucket
    this.phase  = phase
  }

  constructor(bucket: BucketName, phase: BucketPutPhase, message: String) : super(message) {
    this.bucket = bucket
    this.phase  = phase
  }

  constructor(bucket: BucketName, phase: BucketPutPhase, cause: Throwable) : super(cause) {
    this.bucket = bucket
    this.phase  = phase
  }

  constructor(bucket: BucketName, phase: BucketPutPhase, message: String, cause: Throwable) : super(message, cause) {
    this.bucket = bucket
    this.phase  = phase
  }
}