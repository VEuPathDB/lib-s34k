package org.veupathdb.lib.s3.s34k.buckets

import org.veupathdb.lib.s3.s34k.S3ErrorCode
import org.veupathdb.lib.s3.s34k.errors.BucketAlreadyExistsError
import org.veupathdb.lib.s3.s34k.errors.BucketAlreadyOwnedByYouError
import org.veupathdb.lib.s3.s34k.errors.BucketNotFoundError
import org.veupathdb.lib.s3.s34k.errors.S34KError
import org.veupathdb.lib.s3.s34k.fields.BucketName
import org.veupathdb.lib.s3.s34k.params.bucket.*
import org.veupathdb.lib.s3.s34k.params.bucket.put.BucketPutParams
import org.veupathdb.lib.s3.s34k.params.bucket.put.BucketUpsertParams
import org.veupathdb.lib.s3.s34k.params.bucket.recursive.RecursiveBucketDeleteParams

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
interface BucketContainer {

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
  fun <R> withBucket(name: BucketName, action: S3Bucket.() -> R): R

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
  fun exists(name: BucketName): Boolean

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
  fun exists(name: BucketName, action: BucketExistsParams.() -> Unit): Boolean

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
  fun exists(name: BucketName, params: BucketExistsParams): Boolean

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
   * @throws BucketAlreadyExistsError If a bucket already exists in the S3
   * store with the given name.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun create(name: BucketName): S3Bucket

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
   * @throws BucketAlreadyExistsError If a bucket already exists in the S3
   * store with the given name.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun create(name: BucketName, action: BucketPutParams.() -> Unit): S3Bucket

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
   * @throws BucketAlreadyExistsError If a bucket already exists in the S3
   * store with the given name.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun create(name: BucketName, params: BucketPutParams): S3Bucket

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
  fun createIfNotExists(name: BucketName): S3Bucket

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
  fun createIfNotExists(name: BucketName, action: BucketUpsertParams.() -> Unit): S3Bucket

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
  fun createIfNotExists(name: BucketName, params: BucketUpsertParams): S3Bucket

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
  operator fun get(name: BucketName): S3Bucket?

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
  fun get(name: BucketName, action: BucketGetParams.() -> Unit): S3Bucket?

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
  fun get(name: BucketName, params: BucketGetParams): S3Bucket?

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
  fun list(): BucketList

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
  fun list(action: BucketListParams.() -> Unit): BucketList

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
  fun list(params: BucketListParams): BucketList

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
  fun delete(name: BucketName)

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
  fun delete(name: BucketName, action: BucketDeleteParams.() -> Unit)

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
  fun delete(name: BucketName, params: BucketDeleteParams)

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
  fun deleteRecursive(name: BucketName)

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
  fun deleteRecursive(name: BucketName, action: RecursiveBucketDeleteParams.() -> Unit)

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
  fun deleteRecursive(name: BucketName, params: RecursiveBucketDeleteParams)

  // endregion Delete Bucket Recursive
}