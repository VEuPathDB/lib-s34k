package org.veupathdb.lib.s3.s34k

import org.veupathdb.lib.s3.s34k.errors.BucketNotEmptyException
import org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigError
import org.veupathdb.lib.s3.s34k.errors.S34KError
import org.veupathdb.lib.s3.s34k.params.S3DeleteRequestParams
import org.veupathdb.lib.s3.s34k.params.bucket.recursive.RecursiveBucketDeleteError
import org.veupathdb.lib.s3.s34k.params.bucket.recursive.S3RecursiveBucketDeleteParams
import java.time.OffsetDateTime

/**
 * S3 Bucket API Wrapper
 *
 * Wraps the implementation specific operations on an S3 bucket.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
@Suppress("unused")
interface S3Bucket {

  // region Properties

  /**
   * Reference to the parent client that created this [S3Bucket] instance.
   */
  val client: S3Client

  /**
   * Name of this bucket.
   */
  val name: S3BucketName

  /**
   * Region of this bucket.
   *
   * This value will be used as a fallback for operations where no region is
   * configured.
   *
   * If this value is `null` and a set of operation parameters also has a `null`
   * region, no region will be set on the operation.
   */
  val region: String?

  /**
   * Date/time this bucket was created.
   */
  val creationDate: OffsetDateTime

  /**
   * Bucket tag manager.
   */
  val tags: S3TagContainer

  /**
   * Bucket object manager
   */
  val objects: S3ObjectContainer

  // endregion Properties

  // region Bucket Actions

  // region Delete

  /**
   * Deletes this bucket.
   *
   * @throws BucketNotEmptyException If this bucket is not empty and must be
   * cleared before deletion.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see deleteRecursive
   */
  fun delete()

  /**
   * Deletes this bucket with the operation configured by the given action.
   *
   * @param action Action used to configure the S3 operation.
   *
   * @throws InvalidRequestConfigError If the S3 operation parameters are
   * missing required fields or otherwise incorrectly configured.
   *
   * @throws BucketNotEmptyException If this bucket is not empty and must be
   * cleared before deletion.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see deleteRecursive
   */
  fun delete(action: S3DeleteRequestParams.() -> Unit)

  /**
   * Deletes this bucket with the operation configured by the given params.
   *
   * @param params S3 operation parameters.
   *
   * @throws InvalidRequestConfigError If the S3 operation parameters are
   * missing required fields or otherwise incorrectly configured.
   *
   * @throws BucketNotEmptyException If this bucket is not empty and must be
   * cleared before deletion.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see deleteRecursive
   */
  fun delete(params: S3DeleteRequestParams)

  // endregion Delete

  // region Delete Recursive

  /**
   * Recursively deletes this bucket and all its contents.
   *
   * This operation happens in 3 phases which can be configured independently
   * using the [S3RecursiveBucketDeleteParams] class.
   * The 3 phases are:
   *
   * 1. Fetch a list of all the objects in the bucket.
   * 2. Delete all the objects from the bucket.
   * 3. Delete the bucket itself.
   *
   * @throws RecursiveBucketDeleteError If an error occurs while attempting to
   * delete the bucket, or it's contained objects.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see delete
   */
  fun deleteRecursive()

  /**
   * Recursively deletes this bucket and all its contents with the operation
   * configured by the given action.
   *
   * This operation happens in 3 phases which can be configured independently
   * using the [S3RecursiveBucketDeleteParams] class.
   * The 3 phases are:
   *
   * 1. Fetch a list of all the objects in the bucket.
   * 2. Delete all the objects from the bucket.
   * 3. Delete the bucket itself.
   *
   * @param action Action used to configure the S3 operation.
   *
   * @throws RecursiveBucketDeleteError If an error occurs while attempting to
   * delete the bucket, or it's contained objects.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see delete
   */
  fun deleteRecursive(action: S3RecursiveBucketDeleteParams.() -> Unit)

  /**
   * Recursively deletes this bucket and all its contents with the operation
   * configured by the given params.
   *
   * This operation happens in 3 phases which can be configured independently
   * using the [S3RecursiveBucketDeleteParams] class.
   * The 3 phases are:
   *
   * 1. Fetch a list of all the objects in the bucket.
   * 2. Delete all the objects from the bucket.
   * 3. Delete the bucket itself.
   *
   * @param params S3 operation parameters.
   *
   * @throws RecursiveBucketDeleteError If an error occurs while attempting to
   * delete the bucket, or it's contained objects.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see delete
   */
  fun deleteRecursive(params: S3RecursiveBucketDeleteParams)

  // endregion

  // endregion Bucket Actions
}