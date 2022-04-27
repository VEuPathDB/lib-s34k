package org.veupathdb.lib.s3.s34k.requests.bucket.recursive

import org.veupathdb.lib.s3.s34k.requests.`object`.ObjectDeleteError

/**
 * Represents and exception thrown during the object deletion phase of the
 * complex action of recursively deleting an S3 bucket.
 *
 * It is important to verify the state of the S3 store after this exception is
 * thrown.
 *
 * This exception will contain as much information as possible about the error
 * and the request that caused it.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since  v0.1.0
 */
open class RecursiveBucketDeleteObjectDeleteError : RecursiveBucketDeleteError {

  /**
   * List of errors that occurred for each object whose delete operation failed.
   */
  val objectErrors: List<ObjectDeleteError>

  constructor(
    req: S3ClientRecursiveBucketDeleteParams,
    errs: List<ObjectDeleteError>,
    message: String,
    cause: Throwable
  ) : super(S3RecursiveDeletePhase.DeleteObjects, req, message, cause) {
    objectErrors = errs
  }

  constructor(
    req: S3ClientRecursiveBucketDeleteParams,
    errs: List<ObjectDeleteError>,
  ) : super(S3RecursiveDeletePhase.DeleteObjects, req) {
    objectErrors = errs
  }

}