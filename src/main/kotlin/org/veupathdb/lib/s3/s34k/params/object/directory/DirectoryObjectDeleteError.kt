package org.veupathdb.lib.s3.s34k.params.`object`.directory

import org.veupathdb.lib.s3.s34k.params.`object`.ObjectDeleteError

class DirectoryObjectDeleteError : DirectoryDeleteError {

  val errors: List<ObjectDeleteError>

  constructor(
    bucketName: String,
    path:       String,
    errors:     List<ObjectDeleteError>
  ) : super(bucketName, path, DirectoryDeletePhase.DeleteObjects, makeErrMsg(bucketName, path)) {
    this.errors = errors
  }

  constructor(
    bucketName: String,
    path:       String,
    errors:     List<ObjectDeleteError>,
    cause:      Throwable
  ) : super(bucketName, path, DirectoryDeletePhase.DeleteObjects, makeErrMsg(bucketName, path), cause) {
    this.errors = errors
  }

  constructor(
    bucketName: String,
    path:       String,
    errors:     List<ObjectDeleteError>,
    message:    String
  ) : super(bucketName, path, DirectoryDeletePhase.DeleteObjects, message) {
    this.errors = errors
  }

  constructor(
    bucketName: String,
    path:       String,
    errors:     List<ObjectDeleteError>,
    message:    String,
    cause:      Throwable
  ) : super(bucketName, path, DirectoryDeletePhase.DeleteObjects, message, cause) {
    this.errors = errors
  }
}

@Suppress("NOTHING_TO_INLINE")
private inline fun makeErrMsg(bucketName: String, path: String) =
  "Could not delete non-empty directory '$path' from bucket '$bucketName' due to one or more object deletion failures."