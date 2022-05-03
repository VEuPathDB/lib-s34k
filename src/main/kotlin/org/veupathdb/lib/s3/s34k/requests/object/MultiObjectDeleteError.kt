package org.veupathdb.lib.s3.s34k.requests.`object`

import org.veupathdb.lib.s3.s34k.errors.S34KError

class MultiObjectDeleteError : S34KError {

  val errors: List<ObjectDeleteError>

  constructor(errors: List<ObjectDeleteError>) : super("Multi-object delete failed.") {
    this.errors = errors
  }

  constructor(errors: List<ObjectDeleteError>, message: String) : super(message) {
    this.errors = errors
  }

  constructor(errors: List<ObjectDeleteError>, cause: Throwable) : super("Multi-object delete failed.", cause) {
    this.errors = errors
  }

  constructor(errors: List<ObjectDeleteError>, message: String, cause: Throwable) : super(message, cause) {
    this.errors = errors
  }
}