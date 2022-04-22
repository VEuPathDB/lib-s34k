package org.veupathdb.lib.s3.s34k.errors

import org.veupathdb.lib.s3.s34k.requests.S3RequestParams

class InvalidRequestConfigException : S34kException {

  val reason: String

  val params: S3RequestParams

  constructor(reason: String, params: S3RequestParams) : super(
    "S3 request was not sent due to an invalid request configuration: $reason",
  ) {
    this.reason = reason
    this.params = params
  }

  constructor(
    reason: String,
    params: S3RequestParams,
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
    params: S3RequestParams,
    message: String
  ) : super(message) {
    this.reason = reason
    this.params = params
  }

  constructor(
    reason: String,
    params: S3RequestParams,
    message: String,
    cause: Throwable
  ) : super(message, cause) {
    this.reason = reason
    this.params = params
  }
}