package org.veupathdb.lib.s3.s34k.requests.`object`.directory

import org.veupathdb.lib.s3.s34k.errors.S34KError
import org.veupathdb.lib.s3.s34k.requests.`object`.ObjectDeleteError

open class DirectoryDeleteError : S34KError {

  val bucket: String

  /**
   * Path to the directory that could not be deleted.
   */
  val path: String

  constructor(bucket: String, path: String) : super(err(bucket, path)) {
    this.bucket = bucket
    this.path = path
  }

  constructor(bucket: String, path: String, message: String) : super(message) {
    this.bucket = bucket
    this.path = path
  }

  constructor(
    bucket: String,
    path: String,
    cause: Throwable
  ) : super(err(bucket, path), cause) {
    this.bucket = bucket
    this.path = path
  }

  constructor(
    bucket: String,
    path: String,
    message: String,
    cause: Throwable
  ) : super(message, cause) {
    this.bucket = bucket
    this.path = path
  }
}

@Suppress("NOTHING_TO_INLINE")
private inline fun err(bucket: String, path: String) =
  "Failed to delete directory '$path' from bucket '$bucket'"