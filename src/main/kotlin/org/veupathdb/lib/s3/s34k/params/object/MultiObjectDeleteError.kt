package org.veupathdb.lib.s3.s34k.params.`object`

import org.veupathdb.lib.s3.s34k.errors.S34KError

open class MultiObjectDeleteError : S34KError {

  val bucket: String

  val errors: List<ObjectDeleteError>

  constructor(bucket: String, errors: List<ObjectDeleteError>) : super(err(bucket)) {
    this.errors = errors
    this.bucket = bucket
  }

  constructor(bucket: String, errors: List<ObjectDeleteError>, message: String) : super(message) {
    this.errors = errors
    this.bucket = bucket
  }

  constructor(bucket: String, errors: List<ObjectDeleteError>, cause: Throwable) : super(err(bucket), cause) {
    this.errors = errors
    this.bucket = bucket
  }

  constructor(bucket: String, errors: List<ObjectDeleteError>, message: String, cause: Throwable) : super(message, cause) {
    this.errors = errors
    this.bucket = bucket
  }
}

@Suppress("NOTHING_TO_INLINE")
private inline fun err(bucket: String) =
  "Multi-object delete failed for bucket '$bucket'"