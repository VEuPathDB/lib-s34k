package org.veupathdb.lib.s3.s34k.errors


class APIError : S34KError {

  val code: String

  constructor(code: String) : super() {
    this.code = code
  }

  constructor(code: String, message: String) : super(message) {
    this.code = code
  }

  constructor(code: String, cause: Throwable) : super(cause) {
    this.code = code
  }

  constructor(code: String, message: String, cause: Throwable) : super(message, cause) {
    this.code = code
  }
}