package org.veupathdb.lib.s3.s34k

import org.veupathdb.lib.s3.s34k.errors.S34kException
import org.veupathdb.lib.s3.s34k.errors.BucketAlreadyExistsException
import org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException
import org.veupathdb.lib.s3.s34k.params.bucket.BucketExistsParams
import org.veupathdb.lib.s3.s34k.params.bucket.BucketGetParams
import org.veupathdb.lib.s3.s34k.params.bucket.BucketPutParams

/**
 * S3 API Wrapper
 *
 * Wraps a specific S3 API implementation with a general wrapper so as not to
 * tie the code in this library to any one implementation.
 *
 * Due to the limitations of the Java `ServiceLoader`, implementations of this
 * type must have a no-argument constructor.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 * @since  v0.1.0
 */
interface S3Client {

  /**
   * Initializes this client with the given configuration.
   *
   * This method is called automatically on loading a specific [S3Client] and
   * **must not be called** outside that context.
   *
   * This method only exists due to the limitations of the Java `ServiceLoader`
   * class' `load` methods.
   *
   * @param config S3 connection configuration.
   */
  fun initialize(config: S3Config)


  // region: Bucket Exists

  /**
   * Tests for the existence of a bucket with the given name.
   *
   * @param bucketName Name of the bucket to test for.
   *
   * @return `true` if the target bucket exists, otherwise `false`.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @throws IllegalArgumentException If the given bucket name is not between
   * `3` and `63` characters in length.
   */
  fun bucketExists(bucketName: String): Boolean

  // TODO: Document me
  fun bucketExists(bucketName: String, region: String): Boolean

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
  fun bucketExists(params: BucketExistsParams): Boolean

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
  fun bucketExists(action: BucketExistsParams.() -> Unit): Boolean

  // endregion


  // region: Create Bucket

  /**
   * Attempts to create a bucket with the given name.
   *
   * **Warning** This may not be allowed based on the security policy/
   * permissions granted on the target S3 instance.
   *
   * @param bucketName Name of the bucket to create.
   *
   * @return A new [S3Bucket] instance wrapping the newly created bucket.
   *
   * @throws BucketAlreadyExistsException If a bucket already exists in the S3
   * store with the given name.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @throws IllegalArgumentException If the given bucket name is not between
   * `3` and `63` characters in length.
   *
   * @see bucketExists
   * @see createBucketIfNotExists
   */
  fun createBucket(bucketName: String): S3Bucket

  /**
   * Attempts to create a bucket with the given name.
   *
   * **Warning** This may not be allowed based on the security policy/
   * permissions granted on the target S3 instance.
   *
   * @param bucketName Name of the bucket to create.
   *
   * @param region Region where the bucket should reside.
   *
   * @return A new [S3Bucket] instance wrapping the newly created bucket.
   *
   * @throws BucketAlreadyExistsException If a bucket already exists in the S3
   * store with the given name.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @throws IllegalArgumentException If the given bucket name is not between
   * `3` and `63` characters in length.
   *
   * @see bucketExists
   * @see createBucketIfNotExists
   */
  fun createBucket(bucketName: String, region: String): S3Bucket

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
  fun createBucket(params: BucketPutParams): S3Bucket

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
  fun createBucket(action: BucketPutParams.() -> Unit): S3Bucket

  // endregion


  // region: Create Bucket if Not Exists

  /**
   * Attempts to create a bucket with the given name if it does not already
   * exist in the S3 instance.
   *
   * **Warning** This may not be allowed based on the security policy/
   * permissions granted on the target S3 instance.
   *
   * @param bucketName Name of the bucket to create.
   *
   * @return A new [S3Bucket] instance wrapping either the newly created bucket
   * or the pre-existing bucket.
   *
   * @throws IllegalArgumentException If the given bucket name is not between
   * `3` and `63` characters in length.
   *
   * @see bucketExists
   * @see createBucket
   */
  fun createBucketIfNotExists(bucketName: String): S3Bucket

  // TODO: Document me
  fun createBucketIfNotExists(bucketName: String, region: String): S3Bucket

  // TODO: Document me
  fun createBucketIfNotExists(params: BucketPutParams): S3Bucket

  // TODO: Document me
  fun createBucketIfNotExists(action: BucketPutParams.() -> Unit): S3Bucket

  // endregion


  // region: Get Bucket

  /**
   * Creates a new [S3Bucket] instance wrapping the target S3 bucket.
   *
   * @param bucketName Name of the bucket to wrap.
   *
   * @return A new [S3Bucket] instance wrapping the target bucket.
   *
   * @throws BucketNotFoundException If the target bucket does not exist.
   *
   * @throws IllegalArgumentException If the given bucket name is not between
   * `3` and `63` characters in length.
   *
   * @see bucketExists
   * @see createBucketIfNotExists
   */
  fun getBucket(bucketName: String): S3Bucket

  // TODO: Document me
  fun getBucket(bucketName: String, region: String): S3Bucket

  // TODO: Document me
  fun getBucket(params: BucketGetParams): S3Bucket

  // TODO: Document me
  fun getBucket(action: BucketGetParams.() -> Unit): S3Bucket

  // endregion
}