package org.veupathdb.lib.s3.s34k

import org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException
import org.veupathdb.lib.s3.s34k.errors.ObjectNotFoundException
import org.veupathdb.lib.s3.s34k.errors.S34kException
import org.veupathdb.lib.s3.s34k.params.bucket.BucketTagGetParams
import org.veupathdb.lib.s3.s34k.params.bucket.BucketTagPutParams
import org.veupathdb.lib.s3.s34k.params.`object`.*
import java.io.File
import java.io.InputStream
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

  /**
   * Reference to the parent client that created this [S3Bucket] instance.
   */
  val client: S3Client

  /**
   * Name of this bucket.
   */
  val name: String

  /**
   * Region of this bucket.
   */
  val region: String?

  /**
   * Date/time this bucket was created.
   */
  val creationDate: OffsetDateTime


  // region Object Exists

  /**
   * Tests for the existence of an object at the given [path].
   *
   * @param path Path to the object to test for.
   *
   * @return `true` if an object exists at the given path, otherwise `false`.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun objectExists(path: String): Boolean


  /**
   * Tests for the existence of an object with the operation configured by the
   * given [action].
   *
   * @param action Action to configure the S3 operation.
   *
   * @return `true` if an object exists at the given path, otherwise `false`.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun objectExists(action: ObjectExistsParams.() -> Unit): Boolean


  /**
   * Tests for the existence of an object with the operation configured by the
   * given [params].
   *
   * @param params S3 operation configuration.
   *
   * @return `true` if an object exists at the given path, otherwise `false`.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun objectExists(params: ObjectExistsParams): Boolean

  // endregion


  // region: Stat Object

  /**
   * Fetches metadata for the object in this bucket at the given [path].
   *
   * @param path Path to the object whose metadata should be fetched.
   *
   * @param cb Optional callback that will be executed on successful response
   * from the S3 store.
   *
   * @return Metadata about the specified object.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws ObjectNotFoundException If the target object does not exist.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun statObject(path: String): S3ObjectMeta

  // TODO: Document me
  fun statObject(action: ObjectStatParams.() -> Unit): S3ObjectMeta

  // TODO: Document me
  fun statObject(params: ObjectStatParams): S3ObjectMeta

  // endregion


  // region: Get Object

  // TODO: Document me
  fun getObject(path: String): S3StreamObject

  // TODO: Document me
  fun getObject(params: ObjectGetParams): S3StreamObject

  // TODO: Document me
  fun getObject(action: ObjectGetParams.() -> Unit): S3StreamObject

  // endregion

  // region: Get Object Tags

  // TODO: Document me
  fun getObjectTags(path: String): S3TagSet

  // TODO: Document me
  fun getObjectTags(params: ObjectTagGetParams): S3TagSet

  // TODO: Document me
  fun getObjectTags(action: ObjectTagGetParams.() -> Unit): S3TagSet

  // endregion

  // region: Put Object Tags

  // TODO: Document me
  fun putObjectTags(path: String, tags: Collection<S3Tag>): S3TagSet

  // TODO: Document me
  fun putObjectTags(path: String, tags: Map<String, String>): S3TagSet

  // TODO: Document me
  fun putObjectTags(action: ObjectTagPutParams.() -> Unit): S3TagSet

  // TODO: Document me
  fun putObjectTags(params: ObjectTagPutParams): S3TagSet

  // endregion

  // region: Get Bucket Tags

  /**
   * Fetches the tags attached to this bucket.
   *
   * @return A set of the tags associated with this bucket.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun getBucketTags(): S3TagSet


  // TODO: Document me
  /**
   * Fetches the tags attached to this bucket.
   *
   * @param action Function used to configure the S3 operation parameters.
   *
   * @return A set of the tags associated with this bucket.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun getBucketTags(action: BucketTagGetParams.() -> Unit): S3TagSet


  /**
   * Fetches the tags attached to this bucket.
   *
   * @param params S3 operation parameters.
   *
   * @return A set of the tags associated with this bucket.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun getBucketTags(params: BucketTagGetParams): S3TagSet

  // endregion


  // region: Put Bucket Tags

  // TODO: Document me
  fun putBucketTags()

  // TODO: Document me
  fun putBucketTags(action: BucketTagPutParams.() -> Unit)

  // TODO: Document me
  fun putBucketTags(params: BucketTagPutParams)

  // endregion


  // region: Download Object

  /**
   * Downloads the remote object at [path] into the specified local file.
   *
   * If the target file does not exist, it will be created.
   *
   * If the target file already exists, it will be truncated before downloading
   * the object from the S3 bucket.
   *
   * @param path Path to the target object in the root bucket.
   *
   * @param localFile Reference to the local file into which the contents of the
   * remote object will be copied.
   *
   * @throws ObjectNotFoundException If the object at the given path does not
   * exist.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun downloadObject(path: String, localFile: File): S3FileObject

  // TODO: Document me
  fun downloadObject(params: ObjectDownloadParams): S3FileObject

  // TODO: Document me
  fun downloadObject(action: ObjectDownloadParams.() -> Unit): S3FileObject

  // endregion


  // region: Touch Object

  /**
   * Creates an empty object at the given [path].
   *
   * @param path Path to the empty object to create.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun touchObject(path: String): S3Object

  // TODO: Document me
  fun touchObject(action: ObjectTouchParams.() -> Unit): S3Object

  // TODO: Document me
  fun touchObject(params: ObjectTouchParams): S3Object

  // endregion


  // region: Put Directory

  /**
   * Creates an empty directory at the given [path].
   *
   * **Warning**: Not all S3 implementations allow the creation of or hold onto
   * empty directories.
   *
   * **Note**: Some S3 implementations allow the creation of directories simply
   * by attempting to put an object with a directory path.  For instance,
   * putting an object at "foo/bar/fizz" may create the directory structure
   * "foo/bar" automatically.
   *
   * @param path Path to the object to create.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun putDirectory(path: String): S3Object

  // TODO: Document me
  fun putDirectory(action: DirectoryPutParams.() -> Unit): S3Object

  // TODO: Document me
  fun putDirectory(params: DirectoryPutParams): S3Object

  // endregion


  // region: Put Object

  /**
   * Puts an object of a known size into this bucket at the given [path] and
   * copies at most [size] bytes of the contents of the given [stream] into the
   * newly created object.
   *
   * @param path Path to the object to create.
   *
   * @param stream [InputStream] over the contents to copy into the newly
   * created object.
   *
   * @param size Number of bytes to copy into the newly created object.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun putObject(path: String, stream: InputStream, size: Long = -1): S3Object

  // TODO: Document me
  fun putObject(params: ObjectPutParams): S3Object

  // TODO: Document me
  fun putObject(action: ObjectPutParams.() -> Unit): S3Object

  // endregion


  // region: Put File

  /**
   * Puts an object into this bucket at the given [path] and copies the contents
   * of the given [file] into the newly created object.
   *
   * @param path Path to the object to create.
   *
   * @param file File whose contents will be copied into the newly created
   * object.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun uploadFile(path: String, file: File): S3Object

  /**
   * Puts an object into this bucket at the configured path and copies the
   * contents of the given configured file into the newly created object.
   *
   * The parameters must be configured by the [action] given to this method.
   *
   * @param action Action used to configure the S3 operation parameters.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun uploadFile(action: ObjectFilePutParams.() -> Unit)

  /**
   * Puts an object into this bucket at the configured path and copies the
   * contents of the given configured file into the newly created object.
   *
   * @param params S3 operation parameters.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun uploadFile(params: ObjectFilePutParams): S3Object

  // endregion
}