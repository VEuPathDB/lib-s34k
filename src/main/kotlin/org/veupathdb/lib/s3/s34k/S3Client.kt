package org.veupathdb.lib.s3.s34k

import org.veupathdb.lib.s3.s34k.errors.*
import org.veupathdb.lib.s3.s34k.fields.BucketName
import org.veupathdb.lib.s3.s34k.requests.bucket.recursive.S3ClientRecursiveBucketDeleteParams
import org.veupathdb.lib.s3.s34k.requests.client.*
import org.veupathdb.lib.s3.s34k.response.S3BucketList

/**
 * S3 API Wrapper
 *
 * Wraps a specific S3 API implementation with a general wrapper so as not to
 * tie the code in this library to any one implementation.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since  v0.1.0
 */
@Suppress("unused")
interface S3Client {

  val defaultRegion: String?

  // region Bucket Exists

  /**
   * Tests for the existence of a bucket with the given name.
   *
   * @param name Name of the bucket to test for.
   *
   * @param region Optional region for the bucket.
   *
   * @return `true` if the target bucket exists, otherwise `false`.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun bucketExists(name: BucketName, region: String? = null): Boolean

  /**
   * Tests for the existence of a bucket with the operation configured by the
   * given [action].
   *
   * @param action Action to configure the S3 operation.
   *
   * @return `true` if the target bucket exists, otherwise `false`.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun bucketExists(action: S3BucketExistsParams.() -> Unit): Boolean

  /**
   * Tests for the existence of a bucket with the operation configured by the
   * given [params].
   *
   * @param params S3 operation parameters.
   *
   * @return `true` if the target bucket exists, otherwise `false`.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun bucketExists(params: S3BucketExistsParams): Boolean

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
   * @param region Optional region where the bucket should reside.
   *
   * @return A new [S3Bucket] instance wrapping the newly created bucket.
   *
   * @throws BucketAlreadyOwnedByYouException If a bucket already exists in the
   * S3 store with the given name, and it was created by a user with the given
   * access credentials.
   *
   * @throws BucketAlreadyExistsException If a bucket already exists in the S3
   * store with the given name.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see bucketExists
   * @see createBucketIfNotExists
   */
  fun createBucket(name: BucketName, region: String? = null): S3Bucket

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
   * @throws BucketAlreadyOwnedByYouException If a bucket already exists in the
   * S3 store with the given name, and it was created by a user with the given
   * access credentials.
   *
   * @throws BucketAlreadyExistsException If a bucket already exists in the S3
   * store with the given name.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see bucketExists
   * @see createBucketIfNotExists
   */
  fun createBucket(action: S3BucketCreateParams.() -> Unit): S3Bucket

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
   * @throws BucketAlreadyOwnedByYouException If a bucket already exists in the
   * S3 store with the given name, and it was created by a user with the given
   * access credentials.
   *
   * @throws BucketAlreadyExistsException If a bucket already exists in the S3
   * store with the given name.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see bucketExists
   * @see createBucketIfNotExists
   */
  fun createBucket(params: S3BucketCreateParams): S3Bucket

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
   * @param region Optional region where the bucket should reside.
   *
   * @return A new [S3Bucket] instance wrapping either the newly created bucket
   * or the pre-existing bucket.
   *
   * @see bucketExists
   * @see createBucket
   */
  fun createBucketIfNotExists(name: BucketName, region: String? = null): S3Bucket

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
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see bucketExists
   * @see createBucket
   */
  fun createBucketIfNotExists(action: S3BucketCreateParams.() -> Unit): S3Bucket

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
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see bucketExists
   * @see createBucket
   */
  fun createBucketIfNotExists(params: S3BucketCreateParams): S3Bucket

  // endregion

  // region Get Bucket

  /**
   * Creates a new [S3Bucket] instance wrapping the target S3 bucket.
   *
   * @param name Name of the bucket to wrap.
   *
   * @param region Optional region for the bucket.
   *
   * @return A new [S3Bucket] instance wrapping the target bucket.
   *
   * @throws BucketNotFoundException If the target bucket does not exist.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see bucketExists
   * @see createBucketIfNotExists
   */
  fun getBucket(name: BucketName, region: String? = null): S3Bucket

  /**
   * Creates a new [S3Bucket] instance wrapping the target S3 bucket.
   *
   * @param action Action used to configure the S3 operation parameters.
   *
   * @return A new [S3Bucket] instance wrapping the target bucket.
   *
   * @throws BucketNotFoundException If the target bucket does not exist.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see bucketExists
   * @see createBucketIfNotExists
   */
  fun getBucket(action: S3BucketGetParams.() -> Unit): S3Bucket

  /**
   * Creates a new [S3Bucket] instance wrapping the target S3 bucket.
   *
   * @param params S3 operation parameters.
   *
   * @return A new [S3Bucket] instance wrapping the target bucket.
   *
   * @throws BucketNotFoundException If the target bucket does not exist.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see bucketExists
   * @see createBucketIfNotExists
   */
  fun getBucket(params: S3BucketGetParams): S3Bucket

  // endregion

  // region List Buckets

  /**
   * Fetches a list of all buckets available on the target S3 instance.
   *
   * @return A list of S3 bucket wrappers.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun listBuckets(): S3BucketList

  /**
   * Fetches a list of all buckets available on the target S3 instance.
   *
   * @param action Action used to configure the S3 operation parameters.
   *
   * @return A list of S3 bucket wrappers.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun listBuckets(action: S3BucketListParams.() -> Unit): S3BucketList

  /**
   * Fetches a list of all buckets available on the target S3 instance.
   *
   * @param params S3 operation parameters.
   *
   * @return A list of S3 bucket wrappers.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun listBuckets(params: S3BucketListParams): S3BucketList

  // endregion

  // region Delete Bucket

  /**
   * Deletes the target bucket from the S3 instance.
   *
   * @param name Name of the bucket to delete.
   *
   * @param region Optional region value for the S3 operation.
   *
   * @return Flag indicating whether the target bucket was deleted.  `true` if
   * the bucket existed and was deleted, `false` if the bucket did not exist.
   *
   * @throws BucketNotEmptyException If the target bucket is not empty.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun deleteBucket(name: BucketName, region: String? = null): Boolean


  /**
   * Deletes the target bucket from the S3 instance.
   *
   * @param action Action used to configure the S3 operation parameters.
   *
   * @return Flag indicating whether the target bucket was deleted.  `true` if
   * the bucket existed and was deleted, `false` if the bucket did not exist.
   *
   * @throws BucketNotEmptyException If the target bucket is not empty.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun deleteBucket(action: S3BucketDeleteParams.() -> Unit): Boolean

  /**
   * Deletes the target bucket from the S3 instance.
   *
   * @param params S3 operation parameters.
   *
   * @return Flag indicating whether the target bucket was deleted.  `true` if
   * the bucket existed and was deleted, `false` if the bucket did not exist.
   *
   * @throws BucketNotEmptyException If the target bucket is not empty.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun deleteBucket(params: S3BucketDeleteParams): Boolean

  // endregion

  // region Delete Bucket Recursive

  // TODO: Document me
  fun deleteBucketRecursive(name: BucketName, region: String? = null): Boolean

  // TODO: Document me
  fun deleteBucketRecursive(action: S3ClientRecursiveBucketDeleteParams.() -> Unit): Boolean

  // TODO: Document me
  fun deleteBucketRecursive(params: S3ClientRecursiveBucketDeleteParams): Boolean

  // endregion Delete Bucket Recursive
}