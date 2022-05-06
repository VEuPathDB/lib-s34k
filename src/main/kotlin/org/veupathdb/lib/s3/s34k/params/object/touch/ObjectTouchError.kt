package org.veupathdb.lib.s3.s34k.params.`object`.touch

import org.veupathdb.lib.s3.s34k.BucketName
import org.veupathdb.lib.s3.s34k.errors.S34KError

class ObjectTouchError : S34KError {

  val bucket: BucketName

  val path: String

  val phase: ObjectTouchPhase

  constructor(bucket: BucketName, path: String, phase: ObjectTouchPhase)
    : super(err(bucket, path, phase)) {
      this.bucket = bucket
      this.path   = path
      this.phase  = phase
    }

  constructor(bucket: BucketName, path: String, phase: ObjectTouchPhase, message: String)
    : super(message) {
      this.bucket = bucket
      this.path   = path
      this.phase  = phase
    }

  constructor(bucket: BucketName, path: String, phase: ObjectTouchPhase, cause: Throwable)
    : super(err(bucket, path, phase), cause) {
      this.bucket = bucket
      this.path   = path
      this.phase  = phase
    }

  constructor(bucket: BucketName, path: String, phase: ObjectTouchPhase, message: String, cause: Throwable)
    : super(message, cause) {
      this.bucket = bucket
      this.path   = path
      this.phase  = phase
    }


}

@Suppress("NOTHING_TO_INLINE")
private inline fun err(bucket: BucketName, path: String, phase: ObjectTouchPhase) =
  "Object touch failed for path '$path' in bucket '$bucket' during the $phase phase."