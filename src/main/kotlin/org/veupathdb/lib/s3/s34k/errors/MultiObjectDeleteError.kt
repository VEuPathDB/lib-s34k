package org.veupathdb.lib.s3.s34k.errors

import org.veupathdb.lib.s3.s34k.fields.BucketName

open class MultiObjectDeleteError : BucketError {

  val errors: List<ObjectDeleteError>

  constructor(bucket: BucketName, errors: List<ObjectDeleteError>) : super(bucket, err(bucket)) {
    this.errors = errors
  }

  constructor(bucket: BucketName, errors: List<ObjectDeleteError>, message: String) : super(bucket, message) {
    this.errors = errors
  }

  constructor(bucket: BucketName, errors: List<ObjectDeleteError>, cause: Throwable) : super(bucket, err(bucket), cause) {
    this.errors = errors
  }

  constructor(bucket: BucketName, errors: List<ObjectDeleteError>, message: String, cause: Throwable) : super(bucket, message, cause) {
    this.errors = errors
  }
}

@Suppress("NOTHING_TO_INLINE")
private inline fun err(bucket: BucketName) =
  "Multi-object delete failed for bucket '$bucket'"