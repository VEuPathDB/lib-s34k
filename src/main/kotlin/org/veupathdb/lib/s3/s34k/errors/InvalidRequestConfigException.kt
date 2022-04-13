package org.veupathdb.lib.s3.s34k.errors

import org.veupathdb.lib.s3.s34k.params.RequestParams

class InvalidRequestConfigException : S34kException {
  val reason: String
  val params: RequestParams

  constructor(reason: String, params: RequestParams, cause: Throwable) : super(
    "S3 request was not sent due to an invalid request configuration: $reason",
    cause
  ) {
    this.reason = reason
    this.params = params
  }

  constructor(reason: String, params: RequestParams) : super(
    "S3 request was not sent due to an invalid request configuration: $reason",
  ) {
    this.reason = reason
    this.params = params
  }
}