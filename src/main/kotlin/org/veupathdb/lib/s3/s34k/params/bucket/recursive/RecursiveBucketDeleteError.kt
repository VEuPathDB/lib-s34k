package org.veupathdb.lib.s3.s34k.params.bucket.recursive

import org.veupathdb.lib.s3.s34k.S3BucketName
import org.veupathdb.lib.s3.s34k.errors.S34KError
import org.veupathdb.lib.s3.s34k.fields.S3Headers
import org.veupathdb.lib.s3.s34k.fields.S3QueryParams

/**
 * Represents and exception thrown during any phase of the complex action of
 * recursively deleting an S3 bucket.
 *
 * This exception may be thrown during any phase of the action, and thus it is
 * possible that no write operation has occurred, or it is also possible that
 * the S3 store has been left in a partially-deleted state.
 *
 * It is important to verify the state of the S3 store after this exception is
 * thrown.
 *
 * This exception will contain as much information as possible about the error
 * and the request that caused it.
 *
 * @see RecursiveBucketDeleteObjectDeleteError
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since  v0.1.0
 */
open class RecursiveBucketDeleteError : S34KError {

  /**
   * Operation phase in which the error occurred.
   */
  val phase: RecursiveDeletePhase

  /**
   * Name of the target bucket on which the recursive delete was being
   * attempted.
   */
  val bucketName: S3BucketName

  /**
   * Headers that were being sent as part of every request in all phases of the
   * recursive delete operation.
   */
  val globalHeaders: S3Headers

  /**
   * Query parameters that were being sent as part of every request in all
   * phases of the recursive delete operation.
   */
  val globalQueryParams: S3QueryParams

  /**
   * Headers that were being sent exclusively as part of the bucket object list
   * operation.
   */
  val objectListHeaders: S3Headers

  /**
   * Query parameters that were being sent exclusively as part of the bucket
   * object list operation.
   */
  val objectListQueryParams: S3QueryParams

  /**
   * Headers that were being sent exclusively as part of the bucket object
   * delete operation.
   */
  val objectDeleteHeaders: S3Headers

  /**
   * Query parameters that were being sent exclusively as part of the bucket
   * object delete operation.
   */
  val objectDeleteQueryParams: S3QueryParams

  /**
   * Headers that were being sent exclusively as part of the bucket delete
   * operation.
   */
  val bucketDeleteHeaders: S3Headers

  /**
   * Query parameters that were being sent exclusively as part of the bucket
   * delete operation.
   */
  val bucketDeleteQueryParams: S3QueryParams

  constructor(
    name: S3BucketName,
    phase: RecursiveDeletePhase,
    req: RecursiveBucketDeleteParams,
    message: String,
    cause: Throwable
  ) : super(message, cause) {
    this.phase = phase
    this.bucketName = name
    this.globalHeaders = req.headers
    this.globalQueryParams = req.queryParams
    this.objectListHeaders = req.objectFetch.headers
    this.objectListQueryParams = req.objectFetch.queryParams
    this.objectDeleteHeaders = req.objectDelete.headers
    this.objectDeleteQueryParams = req.objectDelete.queryParams
    this.bucketDeleteHeaders = req.bucketDelete.headers
    this.bucketDeleteQueryParams = req.bucketDelete.queryParams
  }

  constructor(
    name: S3BucketName,
    phase: RecursiveDeletePhase,
    req: RecursiveBucketDeleteParams,
    cause: Throwable
  ) : super(cause) {
    this.phase = phase
    this.bucketName = name
    this.globalHeaders = req.headers
    this.globalQueryParams = req.queryParams
    this.objectListHeaders = req.objectFetch.headers
    this.objectListQueryParams = req.objectFetch.queryParams
    this.objectDeleteHeaders = req.objectDelete.headers
    this.objectDeleteQueryParams = req.objectDelete.queryParams
    this.bucketDeleteHeaders = req.bucketDelete.headers
    this.bucketDeleteQueryParams = req.bucketDelete.queryParams
  }

  constructor(
    name: S3BucketName,
    phase: RecursiveDeletePhase,
    req: RecursiveBucketDeleteParams,
  ) : super() {
    this.phase = phase
    this.bucketName = name
    this.globalHeaders = req.headers
    this.globalQueryParams = req.queryParams
    this.objectListHeaders = req.objectFetch.headers
    this.objectListQueryParams = req.objectFetch.queryParams
    this.objectDeleteHeaders = req.objectDelete.headers
    this.objectDeleteQueryParams = req.objectDelete.queryParams
    this.bucketDeleteHeaders = req.bucketDelete.headers
    this.bucketDeleteQueryParams = req.bucketDelete.queryParams
  }
}