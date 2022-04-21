package org.veupathdb.lib.s3.s34k.errors

abstract class AbstractResponseException : S34kException {

  /**
   * S3 Error Code
   */
  abstract val code: String

  constructor(message: String, cause: Throwable) : super(message, cause)

  constructor(message: String): super(message)

  constructor(cause: Throwable): super(cause)
}