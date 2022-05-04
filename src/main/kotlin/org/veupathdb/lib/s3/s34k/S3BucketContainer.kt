package org.veupathdb.lib.s3.s34k

import org.veupathdb.lib.s3.s34k.errors.BucketAlreadyExistsException
import org.veupathdb.lib.s3.s34k.errors.BucketAlreadyOwnedByYouError
import org.veupathdb.lib.s3.s34k.errors.BucketNotFoundError
import org.veupathdb.lib.s3.s34k.errors.S34KError
import org.veupathdb.lib.s3.s34k.params.bucket.*
import org.veupathdb.lib.s3.s34k.params.bucket.recursive.S3RecursiveBucketDeleteParams

/**
 * # S3 Bucket Container
 *
 * Represents the root of an S3 store on which bucket operations may be
 * performed.
 *
 * ## Managing Bucket Tags
 *
 * This interface does not define any methods for managing bucket tags.  To work
 * with bucket tags use one of the bucket access methods contained in this type,
 * such as [withBucket] or [get] which give access to an [S3Bucket] instance
 * without performing any additional operations.
 *
 * **Example**:
 * ```
 * container.withBucket("my-bucket") {
 *   tags.put("something", "some value")
 * }
 *
 * container["my-bucket"].tags.put("something", "some value")
 *
 */
@Suppress("unused")
interface S3BucketContainer {

  /**
   * Executes the given action on the target bucket.
   *
   * @param name Name of the target bucket.
   *
   * @param action Action that will be called on the [S3Bucket] handle on the
   * target bucket.
   *
   * @throws BucketNotFoundError If the target bucket does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun <R> withBucket(name: String, action: S3Bucket.() -> R): R

  // region Bucket Exists

  /**
   * Tests for the existence of a bucket with the given name.
   *
   * @param name Name of the bucket to test for.
   *
   * @return `true` if the target bucket exists, otherwise `false`.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun exists(name: S3BucketName): Boolean

  /**
   * Tests for the existence of a bucket with the operation configured by the
   * given [action].
   *
   * @param action Action to configure the S3 operation.
   *
   * @return `true` if the target bucket exists, otherwise `false`.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun exists(name: S3BucketName, action: S3BucketExistsParams.() -> Unit): Boolean

  /**
   * Tests for the existence of a bucket with the operation configured by the
   * given [params].
   *
   * @param params S3 operation parameters.
   *
   * @return `true` if the target bucket exists, otherwise `false`.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun exists(name: S3BucketName, params: S3BucketExistsParams): Boolean

  // endregion

  // region Create Bucket

  /**
   * Attempts to create a bucket with the given name.
   *
   * **Warning** This may not be allowed based on the security policy/
   * permissions granted on the target S3 instance.
   *
   * @param name Name of the bucket to create.
   *
   * @return A new [S3Bucket] instance wrapping the newly created bucket.
   *
   * @throws BucketAlreadyOwnedByYouError If a bucket already exists in the
   * S3 store with the given name, and it was created by a user with the given
   * access credentials.
   *
   * @throws BucketAlreadyExistsException If a bucket already exists in the S3
   * store with the given name.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun create(name: S3BucketName): S3Bucket

  /**
   * Attempts to create a bucket with the given name with the operation
   * configured by the given [action].
   *
   * **Warning** This may not be allowed based on the security policy/
   * permissions granted on the target S3 instance.
   *
   * @param action Action to configure the S3 operation.
   *
   * @return A new [S3Bucket] instance wrapping the newly created bucket.
   *
   * @throws BucketAlreadyOwnedByYouError If a bucket already exists in the
   * S3 store with the given name, and it was created by a user with the given
   * access credentials.
   *
   * @throws BucketAlreadyExistsException If a bucket already exists in the S3
   * store with the given name.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun create(name: S3BucketName, action: S3BucketCreateParams.() -> Unit): S3Bucket

  /**
   * Attempts to create a bucket with the given name with the operation
   * configured by the given [params].
   *
   * **Warning** This may not be allowed based on the security policy/
   * permissions granted on the target S3 instance.
   *
   * @param params S3 operation parameters.
   *
   * @return A new [S3Bucket] instance wrapping the newly created bucket.
   *
   * @throws BucketAlreadyOwnedByYouError If a bucket already exists in the
   * S3 store with the given name, and it was created by a user with the given
   * access credentials.
   *
   * @throws BucketAlreadyExistsException If a bucket already exists in the S3
   * store with the given name.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun create(name: S3BucketName, params: S3BucketCreateParams): S3Bucket

  // endregion

  // region Create Bucket if Not Exists

  /**
   * Attempts to create a bucket with the given name if it does not already
   * exist in the S3 instance.
   *
   * **Warning** This may not be allowed based on the security policy/
   * permissions granted on the target S3 instance.
   *
   * @param name Name of the bucket to create.
   *
   * @return A new [S3Bucket] instance wrapping either the newly created bucket
   * or the pre-existing bucket.
   */
  fun createIfNotExists(name: S3BucketName): S3Bucket

  /**
   * Attempts to create a bucket with the given name if it does not already
   * exist in the S3 instance.
   *
   * **Warning** This may not be allowed based on the security policy/
   * permissions granted on the target S3 instance.
   *
   * @param action Action used to configure the S3 operation parameters.
   *
   * @return A new [S3Bucket] instance wrapping either the newly created bucket
   * or the pre-existing bucket.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun createIfNotExists(name: S3BucketName, action: S3BucketCreateParams.() -> Unit): S3Bucket

  /**
   * Attempts to create a bucket with the given name if it does not already
   * exist in the S3 instance.
   *
   * **Warning** This may not be allowed based on the security policy/
   * permissions granted on the target S3 instance.
   *
   * @param params S3 operation parameters.
   *
   * @return A new [S3Bucket] instance wrapping either the newly created bucket
   * or the pre-existing bucket.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun createIfNotExists(name: S3BucketName, params: S3BucketCreateParams): S3Bucket

  // endregion

  // region Get Bucket

  /**
   * Creates a new [S3Bucket] instance wrapping the target S3 bucket.
   *
   * @param name Name of the bucket to wrap.
   *
   * @return A new [S3Bucket] instance wrapping the target bucket.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  operator fun get(name: S3BucketName): S3Bucket?

  /**
   * Creates a new [S3Bucket] instance wrapping the target S3 bucket.
   *
   * @param action Action used to configure the S3 operation parameters.
   *
   * @return A new [S3Bucket] instance wrapping the target bucket.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun get(name: S3BucketName, action: S3BucketGetParams.() -> Unit): S3Bucket?

  /**
   * Creates a new [S3Bucket] instance wrapping the target S3 bucket.
   *
   * @param params S3 operation parameters.
   *
   * @return A new [S3Bucket] instance wrapping the target bucket.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun get(name: S3BucketName, params: S3BucketGetParams): S3Bucket?

  // endregion

  // region List Buckets

  /**
   * Fetches a list of all buckets available on the target S3 instance.
   *
   * @return A list of S3 bucket wrappers.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun list(): S3BucketList

  /**
   * Fetches a list of all buckets available on the target S3 instance.
   *
   * @param action Action used to configure the S3 operation parameters.
   *
   * @return A list of S3 bucket wrappers.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun list(action: S3BucketListParams.() -> Unit): S3BucketList

  /**
   * Fetches a list of all buckets available on the target S3 instance.
   *
   * @param params S3 operation parameters.
   *
   * @return A list of S3 bucket wrappers.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun list(params: S3BucketListParams): S3BucketList

  // endregion

  // region Delete Bucket

  /**
   * Deletes the target bucket from the S3 instance.
   *
   * If the target bucket does not exist, this method does nothing.
   *
   * @param name Name of the bucket to delete.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun delete(name: S3BucketName)

  /**
   * Deletes the target bucket from the S3 instance.
   *
   * If the target bucket does not exist, this method does nothing.
   *
   * @param action Action used to configure the S3 operation parameters.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun delete(name: S3BucketName, action: S3BucketDeleteParams.() -> Unit)

  /**
   * Deletes the target bucket from the S3 instance.
   *
   * If the target bucket does not exist, this method does nothing.
   *
   * @param params S3 operation parameters.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun delete(name: S3BucketName, params: S3BucketDeleteParams)

  // endregion

  // region Delete Bucket Recursive

  /**
   * Deletes the target bucket and all of its contents.
   *
   * If the target bucket does not exist, this method does nothing.
   *
   * This is a 'complex operation' in that it happens in multiple phases.  The
   * phases are as follows:
   *
   * 1. Fetch a list of all the contents of the target bucket.
   * 2. Delete all the contents of the target bucket.
   * 3. Delete the bucket itself.
   *
   * Due to the nature of S3 operations, there exists the possibility of a race
   * condition where additional objects are inserted into the bucket after phase
   * 1 or 2 which will cause the bucket delete operation to fail with an
   * [S3ErrorCode.BucketNotEmpty] error.
   *
   * @param name Name of the bucket to delete.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun deleteRecursive(name: S3BucketName)

  /**
   * Deletes the target bucket and all of its contents.
   *
   * If the target bucket does not exist, this method does nothing.
   *
   * This is a 'complex operation' in that it happens in multiple phases.  The
   * phases are as follows:
   *
   * 1. Fetch a list of all the contents of the target bucket.
   * 2. Delete all the contents of the target bucket.
   * 3. Delete the bucket itself.
   *
   * Due to the nature of S3 operations, there exists the possibility of a race
   * condition where additional objects are inserted into the bucket after phase
   * 1 or 2 which will cause the bucket delete operation to fail with an
   * [S3ErrorCode.BucketNotEmpty] error.
   *
   * @param action Action used to configure the S3 operation parameters.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun deleteRecursive(name: S3BucketName, action: S3RecursiveBucketDeleteParams.() -> Unit)

  /**
   * Deletes the target bucket and all of its contents.
   *
   * If the target bucket does not exist, this method does nothing.
   *
   * This is a 'complex operation' in that it happens in multiple phases.  The
   * phases are as follows:
   *
   * 1. Fetch a list of all the contents of the target bucket.
   * 2. Delete all the contents of the target bucket.
   * 3. Delete the bucket itself.
   *
   * Due to the nature of S3 operations, there exists the possibility of a race
   * condition where additional objects are inserted into the bucket after phase
   * 1 or 2 which will cause the bucket delete operation to fail with an
   * [S3ErrorCode.BucketNotEmpty] error.
   *
   * @param params S3 operation parameters.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun deleteRecursive(name: S3BucketName, params: S3RecursiveBucketDeleteParams)

  // endregion Delete Bucket Recursive
}