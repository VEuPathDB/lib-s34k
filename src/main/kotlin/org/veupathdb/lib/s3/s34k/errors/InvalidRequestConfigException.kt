package org.veupathdb.lib.s3.s34k.errors

import org.veupathdb.lib.s3.s34k.params.AbstractRequestParams

class InvalidRequestConfigException : S34kException {
  val reason: String
  val params: AbstractRequestParams

  constructor(reason: String, params: AbstractRequestParams, cause: Throwable) : super(
    "S3 request was not sent due to an invalid request configuration: $reason",
    cause
  ) {
    this.reason = reason
    this.params = params
  }

  constructor(reason: String, params: AbstractRequestParams) : super(
    "S3 request was not sent due to an invalid request configuration: $reason",
  ) {
    this.reason = reason
    this.params = params
  }
}