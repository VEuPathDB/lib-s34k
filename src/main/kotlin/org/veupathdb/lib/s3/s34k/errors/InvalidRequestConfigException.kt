package org.veupathdb.lib.s3.s34k.errors

import org.veupathdb.lib.s3.s34k.params.BaseRequest

class InvalidRequestConfigException : S34kException {

  val reason: String

  val params: BaseRequest

  constructor(reason: String, params: BaseRequest) : super(
    "S3 request was not sent due to an invalid request configuration: $reason",
  ) {
    this.reason = reason
    this.params = params
  }

  constructor(
    reason: String,
    params: BaseRequest,
    cause:  Throwable
  ) : super(
    "S3 request was not sent due to an invalid request configuration: $reason",
    cause
  ) {
    this.reason = reason
    this.params = params
  }

  constructor(
    reason:  String,
    params:  BaseRequest,
    message: String
  ) : super(message) {
    this.reason = reason
    this.params = params
  }

  constructor(
    reason: String,
    params: BaseRequest,
    message: String,
    cause: Throwable
  ) : super(message, cause) {
    this.reason = reason
    this.params = params
  }
}