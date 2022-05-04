package org.veupathdb.lib.s3.s34k.errors

/**
 * Base type for exceptions thrown based on errors returned by the S3 API.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since  v0.1.0
 */
abstract class AbstractResponseError : S34KError {

  /**
   * S3 Error Code
   */
  abstract val code: String

  constructor(message: String): super(message)

  constructor(cause: Throwable): super(cause)

  constructor(message: String, cause: Throwable) : super(message, cause)
}