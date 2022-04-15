package org.veupathdb.lib.s3.s34k

import org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException
import org.veupathdb.lib.s3.s34k.errors.ObjectNotFoundException
import org.veupathdb.lib.s3.s34k.errors.S34kException
import org.veupathdb.lib.s3.s34k.params.bucket.BucketTagGetParams
import org.veupathdb.lib.s3.s34k.params.`object`.*
import java.io.File
import java.io.InputStream

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
  val region: String

  // region Object Exists

  /**
   * Tests for the existence of an object at the given [path].
   *
   * @param path Path to the object to test for.
   *
   * @return `true` if an object exists at the given path, otherwise `false`.
   *
   * @throws BucketNotFoundException If the bucket has been deleted since this
   * [S3Bucket] instance was created.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun objectExists(path: String): Boolean

  /**
   * Tests for the existence of an object with the operation configured by the
   * given [params].
   *
   * @param params S3 operation configuration.
   *
   * @return `true` if an object exists at the given path, otherwise `false`.
   *
   * @throws BucketNotFoundException If the bucket has been deleted since this
   * [S3Bucket] instance was created.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun objectExists(params: ObjectExistsParams): Boolean

  /**
   * Tests for the existence of an object with the operation configured by the
   * given [action].
   *
   * @param action Action to configure the S3 operation.
   *
   * @return `true` if an object exists at the given path, otherwise `false`.
   *
   * @throws BucketNotFoundException If the bucket has been deleted since this
   * [S3Bucket] instance was created.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun objectExists(action: ObjectExistsParams.() -> Unit): Boolean

  // endregion


  // region: Stat Object

  // TODO: Document me
  fun statObject(path: String): S3ObjectMeta

  // TODO: Document me
  fun statObject(params: ObjectStatParams): S3ObjectMeta

  // TODO: Document me
  fun statObject(action: ObjectStatParams.() -> Unit): S3ObjectMeta

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
  fun putObjectTags(params: ObjectTagPutParams): S3TagSet

  // TODO: Document me
  fun putObjectTags(action: ObjectTagPutParams.() -> Unit): S3TagSet

  // endregion

  // region: Bucket Tags

  // TODO: Document me
  fun getBucketTags(): S3TagSet

  // TODO: Document me
  fun getBucketTags(params: BucketTagGetParams): S3TagSet

  // TODO: Document me
  fun getBucketTags(action: BucketTagGetParams.() -> Unit): S3TagSet

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
   * @throws BucketNotFoundException If the bucket has been deleted since this
   * [S3Bucket] instance was created.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  // TODO: Document me
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
   * @throws BucketNotFoundException If the bucket has been deleted since this
   * [S3Bucket] instance was created.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  // TODO: Document me
  fun touchObject(path: String): S3Object

  // TODO: Document me
  fun touchObject(params: ObjectTouchParams): S3Object

  // TODO: Document me
  fun touchObject(action: ObjectTouchParams.() -> Unit): S3Object

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
   * @throws BucketNotFoundException If the bucket has been deleted since this
   * [S3Bucket] instance was created.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun putDirectory(path: String): S3Object

  // TODO: Document me
  fun putDirectory(params: DirectoryPutParams): S3Object

  // TODO: Document me
  fun putDirectory(action: DirectoryPutParams.() -> Unit): S3Object

  // endregion

  // region: Put Object

  /**
   * Puts an object of an unknown size into this bucket at the given [path] and
   * copies the contents of the given [InputStream] into that object.
   *
   * @param path Path to the object to create.
   *
   * @param stream [InputStream] over the contents to copy into the newly
   * created object.
   *
   * @throws BucketNotFoundException If the bucket has been deleted since this
   * [S3Bucket] instance was created.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun putObject(path: String, stream: InputStream)

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
   * @throws BucketNotFoundException If the bucket has been deleted since this
   * [S3Bucket] instance was created.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun putObject(path: String, stream: InputStream, size: Long): S3Object

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
   * @throws BucketNotFoundException If the bucket has been deleted since this
   * [S3Bucket] instance was created.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun uploadFile(path: String, file: File): S3Object

  // TODO: Document me
  fun uploadFile(params: ObjectFilePutParams): S3Object

  // TODO: Document me
  fun uploadFile(action: ObjectFilePutParams.() -> Unit)

  // endregion
}