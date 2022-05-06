package org.veupathdb.lib.s3.s34k.params.`object`.directory

import org.veupathdb.lib.s3.s34k.errors.S34KError

open class DirectoryDeleteError : S34KError {

  val bucket: String

  /**
   * Path to the directory that could not be deleted.
   */
  val path: String

  val phase: DirectoryDeletePhase

  constructor(bucket: String, path: String, phase: DirectoryDeletePhase) : super(err(bucket, path)) {
    this.bucket = bucket
    this.path   = path
    this.phase  = phase
  }

  constructor(bucket: String, path: String, phase: DirectoryDeletePhase, message: String) : super(message) {
    this.bucket = bucket
    this.path   = path
    this.phase  = phase
  }

  constructor(
    bucket: String,
    path:   String,
    phase:  DirectoryDeletePhase,
    cause:  Throwable
  ) : super(err(bucket, path), cause) {
    this.bucket = bucket
    this.path   = path
    this.phase  = phase
  }

  constructor(
    bucket:  String,
    path:    String,
    phase:   DirectoryDeletePhase,
    message: String,
    cause:   Throwable,
  ) : super(message, cause) {
    this.bucket = bucket
    this.path   = path
    this.phase  = phase
  }
}

@Suppress("NOTHING_TO_INLINE")
private inline fun err(bucket: String, path: String) =
  "Failed to delete directory '$path' from bucket '$bucket'"