package org.veupathdb.lib.s3.s34k

import org.veupathdb.lib.s3.s34k.errors.BucketNotFoundError
import org.veupathdb.lib.s3.s34k.errors.ObjectNotFoundException
import org.veupathdb.lib.s3.s34k.errors.S34KError
import org.veupathdb.lib.s3.s34k.requests.`object`.*
import org.veupathdb.lib.s3.s34k.requests.`object`.directory.DirectoryDeleteError
import org.veupathdb.lib.s3.s34k.requests.`object`.directory.S3DirectoryDeleteParams
import org.veupathdb.lib.s3.s34k.response.`object`.*
import java.io.File
import java.io.InputStream

// TODO: S3Directory should contain an object manager
// TODO: "what is a directory?" (an empty object for s34k)
// TODO: XMinioObjectExistsAsDirectory error when trying to put an object at the parent path of a directory?
//       Existing path:      /pot/avie1.png
//       Attempted put path: /pot
//       custom minio error codes: https://github.com/minio/minio/blob/master/cmd/api-errors.go
// TODO: Access denied when trying to use a file as part of a new key name?
//       Existing object:    /port
//       Attempted put path: /port/grapes
@Suppress("unused")
interface S3ObjectContainer {

  // region Fetch

  // region Has

  /**
   * Tests whether this object container contains an object at the given [path].
   *
   * @param path Path to the object to test for.
   *
   * @return `true` if this container has an object at that path, otherwise
   * `false`.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see getObjectExists
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  operator fun contains(path: String): Boolean

  /**
   * Tests whether this object container contains an object at the configured
   * target path.
   *
   * @param action Action used to configure the backing S3 operation.
   *
   * @return `true` if this container has an object at that path, otherwise
   * `false`.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see getObjectExists
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun contains(action: S3ObjectExistsParams.() -> Unit): Boolean

  /**
   * Tests whether this object container contains an object at the configured
   * target path.
   *
   * @param params Parameters for the backing S3 operation.
   *
   * @return `true` if this container has an object at that path, otherwise
   * `false`.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see getObjectExists
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun contains(params: S3ObjectExistsParams): Boolean

  /**
   * Tests whether this object container contains an object at the given [path].
   *
   * This method is an alias for [contains].
   *
   * @param path Path to the object to test for.
   *
   * @return `true` if this container has an object at that path, otherwise
   * `false`.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see contains
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun getObjectExists(path: String) = contains(path)

  /**
   * Tests whether this object container contains an object at the configured
   * target path.
   *
   * This method is an alias for [contains].
   *
   * @param action Action used to configure the backing S3 operation.
   *
   * @return `true` if this container has an object at that path, otherwise
   * `false`.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see contains
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun getObjectExists(action: S3ObjectExistsParams.() -> Unit) = contains(action)

  /**
   * Tests whether this object container contains an object at the configured
   * target path.
   *
   * This method is an alias for [contains].
   *
   * @param params Parameters for the backing S3 operation.
   *
   * @return `true` if this container has an object at that path, otherwise
   * `false`.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see contains
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun getObjectExists(params: S3ObjectExistsParams) = contains(params)

  // endregion Has

  // region Count

  /**
   * Returns a count of all the objects in this object container, optionally
   * filtered by a given path prefix.
   *
   * If no path prefix is provided, all paths in this object container will be
   * counted regardless of nested directory depth.
   *
   * If a path prefix is provided, only paths in this object container whose
   * path name begins with [pathPrefix] will be counted.
   *
   * @param pathPrefix Optional filtering prefix.  When provided, this will
   * filter the counted paths to only those starting with this value.
   *
   * @return A count of `0` or more paths that exist in this object container
   * that optionally meet the filtering criteria.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun countAll(pathPrefix: String? = null): UInt

  /**
   * Returns a count of all the objects in this object container, filtered by
   * the given predicate function.
   *
   * The given predicate function will be given each path individually, only
   * those paths on which the predicate returns `true` will be counted.
   *
   * @param filter Predicate that will be used to determine which paths to count
   * and which not to.
   *
   * @return A count of `0` or more paths that exist in this object container
   * that also meet the given predicate's criteria.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun countAll(filter: (String) -> Boolean): UInt

  /**
   * Returns a count of first level subdirectories directly under the given
   * [parent] directory name.
   *
   * **Examples**
   *
   * For these examples our object container is a bucket named "my-bucket".
   *
   * Given contents of "my-bucket":
   * ```
   * /foo/bar.txt
   * /bazz.txt
   * /fizz/buzz/flamingo.txt
   * /fizz/buzz/grapes.png
   * ```
   *
   * If we run the command:
   * ```
   * container.countSubDirs()
   * ```
   *
   * The result will be `2`, as at the root of the container the direct
   * subdirectories are `my-bucket/foo/` and `my-bucket/fizz/`.
   *
   * If we run the command:
   * ```
   * container.countSubDirs("foo")
   * ```
   *
   * The result will be `0` as the path `my-bucket/foo/` contains no direct
   * subdirectories.
   *
   * If we run the command:
   * ```
   * container.countSubDirs("fizz")
   * ```
   *
   * The result will be `1` as the path `my-bucket/fizz/` contains the direct
   * subdirectory `./buzz/`
   *
   * @param parent Name of the parent directory under which the subdirectories
   * will be listed.
   *
   * If this value does not point to an existing directory, this method will
   * return `0`.
   *
   * @return A count of subdirectories under either the object container root or
   * under the given path prefix.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun countSubDirs(parent: String? = null): UInt

  // endregion Count

  // region Get

  /**
   * Fetches the object at the target path and returns a handle on it which can
   * be used to stream out the target object's contents.
   *
   * If the target path does not exist, or is a directory, `null` will be
   * returned.
   *
   * @param path Path to the target object.
   *
   * @return An [S3StreamObject] instance handle on the target object, or `null`
   * if no such object could be found.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see getStream
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  operator fun get(path: String): S3StreamObject?

  /**
   * Fetches the configured target object and returns a handle on it which can
   * be used to stream out the target object's contents.
   *
   * If the target path does not exist, or is a directory, `null` will be
   * returned.
   *
   * @param action Action used to configure the backing S3 operation.
   *
   * @return An [S3StreamObject] instance handle on the target object, or `null`
   * if no such object could be found.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see getStream
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun get(action: S3ObjectGetParams.() -> Unit): S3StreamObject?

  /**
   * Fetches the configured target object and returns a handle on it which can
   * be used to stream out the target object's contents.
   *
   * If the target path does not exist, or is a directory, `null` will be
   * returned.
   *
   * @param params Parameters for the backing S3 operation.
   *
   * @return An [S3StreamObject] instance handle on the target object, or `null`
   * if no such object could be found.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see getStream
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun get(params: S3ObjectGetParams): S3StreamObject?

  /**
   * Fetches the object at the target path and returns a handle on it which can
   * be used to stream out the target object's contents.
   *
   * If the target path does not exist, or is a directory, `null` will be
   * returned.
   *
   * This method is an alias for [get].
   *
   * @param path Path to the target object.
   *
   * @return An [S3StreamObject] instance handle on the target object, or `null`
   * if no such object could be found.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see get
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun getStream(path: String) = get(path)

  /**
   * Fetches the configured target object and returns a handle on it which can
   * be used to stream out the target object's contents.
   *
   * If the target path does not exist, or is a directory, `null` will be
   * returned.
   *
   * This method is an alias for [get].
   *
   * @param action Action used to configure the backing S3 operation.
   *
   * @return An [S3StreamObject] instance handle on the target object, or `null`
   * if no such object could be found.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see get
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun getStream(action: S3ObjectGetParams.() -> Unit) = get(action)

  /**
   * Fetches the configured target object and returns a handle on it which can
   * be used to stream out the target object's contents.
   *
   * If the target path does not exist, or is a directory, `null` will be
   * returned.
   *
   * This method is an alias for [get].
   *
   * @param params Parameters for the backing S3 operation.
   *
   * @return An [S3StreamObject] instance handle on the target object, or `null`
   * if no such object could be found.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see get
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun getStream(params: S3ObjectGetParams) = get(params)

  // endregion Get

  // region Download

  /**
   * Fetches the object at the target path and downloads it into the specified
   * local file.
   *
   * @param path Path to the target object to download.
   *
   * @param localFile Target local file into which the object's content will be
   * downloaded.
   *
   * If this file does not exist it will be created as part of this operation.
   *
   * If this file does already exist, it will be truncated before writing as
   * part of this operation.
   *
   * @return An [S3FileObject] instance handle on the target object and local
   * file.
   *
   * @throws ObjectNotFoundException If the configured target object does not
   * exist.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see getFile
   */
  @Throws(ObjectNotFoundException::class, BucketNotFoundError::class, S34KError::class)
  fun download(path: String, localFile: File): S3FileObject

  /**
   * Fetches the object at the configured path and downloads it into the target
   * local file.
   *
   * @param action Action used to configure the backing S3 operation.
   *
   * If this file does not exist it will be created as part of this operation.
   *
   * If this file does already exist, it will be truncated before writing as
   * part of this operation.
   *
   * @return An [S3FileObject] instance handle on the target object and local
   * file.
   *
   * @throws ObjectNotFoundException If the configured target object does not
   * exist.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see getFile
   */
  @Throws(ObjectNotFoundException::class, BucketNotFoundError::class, S34KError::class)
  fun download(action: S3ObjectDownloadParams.() -> Unit): S3FileObject

  /**
   * Fetches the object at the configured path and downloads it into the target
   * local file.
   *
   * @param params Parameters for the backing S3 operation.
   *
   * If this file does not exist it will be created as part of this operation.
   *
   * If this file does already exist, it will be truncated before writing as
   * part of this operation.
   *
   * @return An [S3FileObject] instance handle on the target object and local
   * file.
   *
   * @throws ObjectNotFoundException If the configured target object does not
   * exist.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see getFile
   */
  @Throws(ObjectNotFoundException::class, BucketNotFoundError::class, S34KError::class)
  fun download(params: S3ObjectDownloadParams): S3FileObject

  /**
   * Fetches the object at the target path and downloads it into the specified
   * local file.
   *
   * This method is an alias of [download].
   *
   * @param path Path to the target object to download.
   *
   * @param localFile Target local file into which the object's content will be
   * downloaded.
   *
   * If this file does not exist it will be created as part of this operation.
   *
   * If this file does already exist, it will be truncated before writing as
   * part of this operation.
   *
   * @return An [S3FileObject] instance handle on the target object and local
   * file.
   *
   * @throws ObjectNotFoundException If the configured target object does not
   * exist.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see download
   */
  @Throws(ObjectNotFoundException::class, BucketNotFoundError::class, S34KError::class)
  fun getFile(path: String, localFile: File) = download(path, localFile)

  /**
   * Fetches the object at the configured path and downloads it into the target
   * local file.
   *
   * This method is an alias of [download].
   *
   * @param action Action used to configure the backing S3 operation.
   *
   * If this file does not exist it will be created as part of this operation.
   *
   * If this file does already exist, it will be truncated before writing as
   * part of this operation.
   *
   * @return An [S3FileObject] instance handle on the target object and local
   * file.
   *
   * @throws ObjectNotFoundException If the configured target object does not
   * exist.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see download
   */
  @Throws(ObjectNotFoundException::class, BucketNotFoundError::class, S34KError::class)
  fun getFile(action: S3ObjectDownloadParams.() -> Unit) = download(action)

  /**
   * Fetches the object at the configured path and downloads it into the target
   * local file.
   *
   * This method is an alias of [download].
   *
   * @param params Parameters for the backing S3 operation.
   *
   * If this file does not exist it will be created as part of this operation.
   *
   * If this file does already exist, it will be truncated before writing as
   * part of this operation.
   *
   * @return An [S3FileObject] instance handle on the target object and local
   * file.
   *
   * @throws ObjectNotFoundException If the configured target object does not
   * exist.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see download
   */
  @Throws(ObjectNotFoundException::class, BucketNotFoundError::class, S34KError::class)
  fun getFile(params: S3ObjectDownloadParams) = download(params)

  // endregion Download

  // region Stat

  /**
   * Fetches metadata for the object at the target path.
   *
   * If the target object does not exist, `null` will be returned.
   *
   * @param path Path to the target object whose metadata should be returned.
   *
   * @return An [S3ObjectMeta] instance containing the target object's metadata
   * if the target object exists, otherwise `null`.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see getObjectMeta
   */
  fun stat(path: String): S3ObjectMeta?

  /**
   * Fetches metadata for the object at the target path.
   *
   * If the target object does not exist, `null` will be returned.
   *
   * @param action Action used to configure the backing S3 operation.
   *
   * @return An [S3ObjectMeta] instance containing the target object's metadata
   * if the target object exists, otherwise `null`.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see getObjectMeta
   */
  fun stat(action: S3ObjectStatParams.() -> Unit): S3ObjectMeta?

  /**
   * Fetches metadata for the object at the target path.
   *
   * If the target object does not exist, `null` will be returned.
   *
   * @param params Parameters for the backing S3 operation.
   *
   * @return An [S3ObjectMeta] instance containing the target object's metadata
   * if the target object exists, otherwise `null`.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see getObjectMeta
   */
  fun stat(params: S3ObjectStatParams): S3ObjectMeta?

  /**
   * Fetches metadata for the object at the target path.
   *
   * If the target object does not exist, `null` will be returned.
   *
   * This method is an alias of [stat].
   *
   * @param path Path to the target object whose metadata should be returned.
   *
   * @return An [S3ObjectMeta] instance containing the target object's metadata
   * if the target object exists, otherwise `null`.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see stat
   */
  fun getObjectMeta(path: String) = stat(path)

  /**
   * Fetches metadata for the object at the target path.
   *
   * If the target object does not exist, `null` will be returned.
   *
   * This method is an alias of [stat].
   *
   * @param action Action used to configure the backing S3 operation.
   *
   * @return An [S3ObjectMeta] instance containing the target object's metadata
   * if the target object exists, otherwise `null`.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see stat
   */
  fun getObjectMeta(action: S3ObjectStatParams.() -> Unit) = stat(action)

  /**
   * Fetches metadata for the object at the target path.
   *
   * If the target object does not exist, `null` will be returned.
   *
   * This method is an alias of [stat].
   *
   * @param params Parameters for the backing S3 operation.
   *
   * @return An [S3ObjectMeta] instance containing the target object's metadata
   * if the target object exists, otherwise `null`.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see stat
   */
  fun getObjectMeta(params: S3ObjectStatParams) = stat(params)

  // endregion Stat

  // region List

  /**
   * Fetches a list of all the objects in this container.
   *
   *
   */
  fun listAll(): S3ObjectList

  fun listAll(action: S3ObjectListParams.() -> Unit): S3ObjectList

  fun listAll(params: S3ObjectListParams): S3ObjectList

  // endregion List

  // endregion Fetch

  // region Create

  // region Touch

  fun touch(path: String): S3Object

  fun touch(action: S3ObjectCreateParams.() -> Unit): S3Object

  fun touch(params: S3ObjectCreateParams): S3Object

  fun putEmpty(path: String) = touch(path)

  fun putEmpty(action: S3ObjectCreateParams.() -> Unit) = touch(action)

  fun putEmpty(params: S3ObjectCreateParams) = touch(params)

  // endregion Touch

  // region Put Stream

  operator fun set(path: String, stream: InputStream) = putStream(path, stream)

  fun putStream(path: String, stream: InputStream): S3Object

  fun putStream(action: S3StreamingObjectCreateParams.() -> Unit): S3Object

  fun putStream(params: S3StreamingObjectCreateParams): S3Object

  // endregion Put Stream

  // region Put File

  operator fun set(path: String, file: File) = upload(path, file)

  fun upload(path: String, file: File): S3Object

  fun upload(action: S3FileUploadParams.() -> Unit): S3Object

  fun upload(params: S3FileUploadParams): S3Object

  fun putFile(path: String, file: File) = upload(path, file)

  fun putFile(action: S3FileUploadParams.() -> Unit) = upload(action)

  fun putFile(params: S3FileUploadParams) = upload(params)

  // endregion Put File

  // region Put Zip

  // TODO: PUT ZIP METHODS

  // endregion Put Zip

  // endregion Create

  // region Delete

  // region Delete Object

  fun delete(path: String)

  fun delete(action: S3ObjectDeleteParams.() -> Unit)

  fun delete(params: S3ObjectDeleteParams)

  // endregion Delete Object

  // region Delete Multi

  fun deleteAll(vararg paths: String)

  fun deleteAll(paths: Iterable<String>)

  fun deleteAll(action: S3MultiObjectDeleteParams.() -> Unit)

  fun deleteAll(params: S3MultiObjectDeleteParams)

  // endregion Delete Multi

  // region RmDir

  /**
   * Recursively removes all contents in the target directory.
   *
   * **Example**
   *
   * Given the container state:
   * ```
   * foo/bar/bazz.txt
   * foo/bar/fizz.txt
   * foo/buzz.txt
   * food/world.png
   * ```
   *
   * The operation:
   * ```
   * container.rmdir("foo")
   * ```
   *
   * Will result in the state:
   * ```
   * food/world.png
   * ```
   *
   * @param path Path to the target directory that will be removed.
   *
   * @throws DirectoryDeleteError If some or all of the directory's contents
   * could not be deleted.
   *
   * @throws BucketNotFoundError I
   */
  @Throws(DirectoryDeleteError::class, BucketNotFoundError::class, S34KError::class)
  fun rmdir(path: String)

  fun rmdir(action: S3DirectoryDeleteParams.() -> Unit)

  fun rmdir(params: S3DirectoryDeleteParams)

  fun deleteDirectory(path: String) = rmdir(path)

  fun deleteDirectory(action: S3DirectoryDeleteParams.() -> Unit) = rmdir(action)

  fun deleteDirectory(params: S3DirectoryDeleteParams) = rmdir(params)

  // endregion RmDir

  // endregion Delete
}