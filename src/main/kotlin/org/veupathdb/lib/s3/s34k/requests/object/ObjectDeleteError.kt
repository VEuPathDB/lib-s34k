package org.veupathdb.lib.s3.s34k.requests.`object`

import org.veupathdb.lib.s3.s34k.errors.S34kException

class ObjectDeleteError : S34kException {
  val path: String

  val s3Message: String

  val s3Code: String

  constructor(
    path:      String,
    s3Message: String,
    s3Code:    String,
    message:   String,
    cause:     Throwable,
  ) : super(message, cause) {
    this.path      = path
    this.s3Message = s3Message
    this.s3Code    = s3Code
  }

  constructor(
    path:      String,
    s3Message: String,
    s3Code:    String,
  ) : super() {
    this.path      = path
    this.s3Message = s3Message
    this.s3Code    = s3Code
  }
}