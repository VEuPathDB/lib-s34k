package org.veupathdb.lib.s3.s34k.requests.`object`

import org.veupathdb.lib.s3.s34k.errors.S34kException

/**
 * Object deletion error.
 *
 * Represents any error that occurred as a result of attempting to delete a
 * single object from an S3 store.
 *
 * Bulk object deletes may include more than one instance of this exception as
 * details about the objects that could not be deleted.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class ObjectDeleteError : S34kException {

  /**
   * Key/path of the object on which the delete operation was attempted.
   */
  val path: String

  /**
   * Message returned by the S3 server.
   */
  val s3Message: String

  /**
   * Error code returned by the S3 server.
   */
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