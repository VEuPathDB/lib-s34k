package org.veupathdb.lib.s3.s34k

import org.veupathdb.lib.s3.s34k.errors.BucketNotFoundError
import org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigError
import org.veupathdb.lib.s3.s34k.errors.ObjectNotFoundError
import org.veupathdb.lib.s3.s34k.errors.S34KError
import org.veupathdb.lib.s3.s34k.params.S3DeleteParams
import org.veupathdb.lib.s3.s34k.params.`object`.*
import org.veupathdb.lib.s3.s34k.params.`object`.directory.DirectoryObjectDeleteError
import org.veupathdb.lib.s3.s34k.params.`object`.directory.S3DirectoryDeleteParams
import java.io.File
import java.io.FileNotFoundException
import java.io.InputStream

/**
 * # S3 Object Container
 *
 * Represents a segment of an S3 store that may contain objects.  This could
 * either be a bucket or a 'directory'.
 *
 * All paths for all methods defined in this type are treated as relative to the
 * root of the container.  In the case of a bucket, all paths are absolute paths
 * to the bucket root.  In the case of a 'directory', all paths are relative to
 * the directory prefix.  The exception to this is paths starting with a leading
 * '`/`' character which will be treated as absolute paths in all cases.
 *
 * ## Managing Object Tags
 *
 * This interface does not define any methods for managing object tags.  To work
 * with object tags use one of the object access methods contained in this type,
 * such as [withObject] or [get] which will give access to an [S3Object]
 * instance without opening a stream over that object's contents.
 *
 * **Example**:
 * ```
 * container.withObject("my/object") {
 *   tags.put("something", "something else")
 * }
 *
 * container["my/object"].tags.put("something", "something else")
 * ```
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.3.0
 */
@Suppress("unused")
interface S3ObjectContainer {

  // region Imaginary

  /**
   * Executes the given action on the target object.
   *
   * @param path Path/key to the target object.
   *
   * @param action Action that will be called on the [S3Object] handle on the
   * target object.
   *
   * @throws ObjectNotFoundError If the target object does not exist.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    ObjectNotFoundError::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun <R> withObject(path: String, action: S3Object.() -> R): R

  // TODO:
  // fun <R> withDirectory(path: String, action: (S3Directory) -> R): R

  // endregion Imaginary

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
   * @throws InvalidRequestConfigError If the `path` value is not set on the
   * configured parameters.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    InvalidRequestConfigError::class,
    BucketNotFoundError::class,
    S34KError::class
  )
  fun contains(path: String, action: S3ObjectExistsParams.() -> Unit): Boolean

  /**
   * Tests whether this object container contains an object at the configured
   * target path.
   *
   * @param params Parameters for the backing S3 operation.
   *
   * @return `true` if this container has an object at that path, otherwise
   * `false`.
   *
   * @throws InvalidRequestConfigError If the `path` value is not set on the
   * configured parameters.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    InvalidRequestConfigError::class,
    BucketNotFoundError::class,
    S34KError::class
  )
  fun contains(path: String, params: S3ObjectExistsParams): Boolean

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

  // TODO: count all config + action

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

  // TODO: count subdirectories config + action

  // endregion Count

  // region Get

  // TODO: document me
  @Throws(
    BucketNotFoundError::class,
    S34KError::class,
  )
  operator fun get(path: String): S3Object?

  // TODO: document me
  @Throws(
    InvalidRequestConfigError::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun get(path: String, action: S3ObjectGetParams.() -> Unit): S3Object?

  // TODO: document me
  @Throws(
    InvalidRequestConfigError::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun get(path: String, params: S3ObjectGetParams)

  // endregion Get

  // region Open

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
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun open(path: String): S3StreamObject?

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
   * @throws InvalidRequestConfigError If the `path` value is not set on the
   * configured parameters.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    InvalidRequestConfigError::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun open(path: String, action: S3ObjectOpenParams.() -> Unit): S3StreamObject?

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
   * @throws InvalidRequestConfigError If the `path` value is not set on the
   * configured parameters.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    InvalidRequestConfigError::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun open(path: String, params: S3ObjectOpenParams): S3StreamObject?

  // endregion Open

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
   * @throws ObjectNotFoundError If the configured target object does not
   * exist.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    ObjectNotFoundError::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
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
   * @throws InvalidRequestConfigError If either the `path` or `localFile` value
   * is not set on the configured parameters.
   *
   * @throws ObjectNotFoundError If the configured target object does not
   * exist.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    InvalidRequestConfigError::class,
    ObjectNotFoundError::class,
    BucketNotFoundError::class,
    S34KError::class
  )
  fun download(path: String, action: S3ObjectDownloadParams.() -> Unit): S3FileObject

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
   * @throws InvalidRequestConfigError If either the `path` or `localFile` value
   * is not set on the configured parameters.
   *
   * @throws ObjectNotFoundError If the configured target object does not
   * exist.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    InvalidRequestConfigError::class,
    ObjectNotFoundError::class,
    BucketNotFoundError::class,
    S34KError::class
  )
  fun download(path: String, params: S3ObjectDownloadParams): S3FileObject

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
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
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
   * @throws InvalidRequestConfigError If the `path` value is not set on the
   * configured parameters.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    InvalidRequestConfigError::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun stat(path: String, action: S3ObjectStatParams.() -> Unit): S3ObjectMeta?

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
   * @throws InvalidRequestConfigError If the `path` value is not set on the
   * configured parameters.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    InvalidRequestConfigError::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun stat(path: String, params: S3ObjectStatParams): S3ObjectMeta?

  // endregion Stat

  // region List

  /**
   * Fetches a list of all the objects in this container.
   *
   * @return An [S3ObjectList] instance containing `0` or more entries for each
   * key/path found in this container.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun listAll(): S3ObjectList

  /**
   * Fetches a list of all the objects in this container.
   *
   * @param action Action used to configure the backing S3 operation.
   *
   * @return An [S3ObjectList] instance containing `0` or more entries for each
   * key/path found in this container.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun listAll(action: S3ObjectListParams.() -> Unit): S3ObjectList

  /**
   * Fetches a list of all the objects in this container.
   *
   * @param params Parameters for the backing S3 operation.
   *
   * @return An [S3ObjectList] instance containing `0` or more entries for each
   * key/path found in this container.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun listAll(params: S3ObjectListParams): S3ObjectList

  // endregion List

  // endregion Fetch

  // region Create

  // region Touch

  /**
   * Creates an empty object at the specified path if one does not already
   * exist.
   *
   * Unlike the other object put methods, if an object already exists at the
   * given path it will not be overwritten, in that case this method will do
   * nothing.
   *
   * @param path Path/key for the empty object to create.
   *
   * @return A handle on the newly created object.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun touch(path: String): S3Object

  /**
   * Creates an empty object at the specified path if one does not already
   * exist.
   *
   * Unlike the other object put methods, if an object already exists at the
   * given path it will not be overwritten, in that case this method will do
   * nothing.
   *
   * @param action Action used to configure the backing S3 operation.
   *
   * @throws InvalidRequestConfigError If the `path` value is not set on the
   * configured parameters.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    InvalidRequestConfigError::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun touch(path: String, action: S3ObjectTouchParams.() -> Unit): S3Object

  /**
   * Creates an empty object at the specified path if one does not already
   * exist.
   *
   * Unlike the other object put methods, if an object already exists at the
   * given path it will not be overwritten, in that case this method will do
   * nothing.
   *
   * @param params Parameters for the backing S3 operation.
   *
   * @throws InvalidRequestConfigError If the `path` value is not set on the
   * configured parameters.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    InvalidRequestConfigError::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun touch(path: String, params: S3ObjectTouchParams): S3Object

  // endregion Touch

  // region Put Stream

  /**
   * Creates or overwrites an object at the specified path with its contents
   * uploaded from the given stream.
   *
   * This method is a Kotlin syntax extra that is an alias for [put].
   *
   * @param path Path to the new object to create.
   *
   * @return An [S3Object] instance handle on the target object.
   *
   * @param stream Stream whose contents will be written to the object in the
   * store at the given path.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see put
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  operator fun set(path: String, stream: InputStream) = put(path, stream)

  /**
   * Creates or overwrites an object at the specified path with its contents
   * uploaded from the given stream.
   *
   * @param path Path to the new object to create.
   *
   * @param stream Stream whose contents will be written to the object in the
   * store at the given path.
   *
   * @return An [S3Object] instance handle on the target object.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun put(path: String, stream: InputStream): S3Object

  /**
   * Creates or overwrites an object at the configured path with its contents
   * uploaded from the configured stream.
   *
   * @param action Action used to configure the backing S3 operation.
   *
   * @return An [S3Object] instance handle on the target object.
   *
   * @throws InvalidRequestConfigError If either the `path` value or `stream`
   * value is not set on the configured parameters.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    InvalidRequestConfigError::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun put(path: String, action: S3StreamingObjectCreateParams.() -> Unit): S3Object

  /**
   * Creates or overwrites an object at the configured path with its contents
   * uploaded from the configured stream.
   *
   * @param params Parameters for the backing S3 operation.
   *
   * @return An [S3Object] instance handle on the target object.
   *
   * @throws InvalidRequestConfigError If either the `path` value or `stream`
   * value is not set on the configured parameters.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    InvalidRequestConfigError::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun put(path: String, params: S3StreamingObjectCreateParams): S3Object

  // endregion Put Stream

  // region Put File

  /**
   * Uploads the specified file to this container at the given path, overwriting
   * any object presently at that path.
   *
   * This method is a Kotlin syntax extra that is an alias for [upload].
   *
   * @param path Path to the object to create/overwrite in this container.
   *
   * @param file Local file to upload.
   *
   * @return An [S3Object] instance handle on the target object.
   *
   * @throws FileNotFoundException If the given local file does not exist.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see upload
   */
  @Throws(
    FileNotFoundException::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  operator fun set(path: String, file: File) = upload(path, file)

  /**
   * Uploads the specified file to this container at the given path, overwriting
   * any object presently at that path.
   *
   * @param path Path to the object to create/overwrite in this container.
   *
   * @param file Local file to upload.
   *
   * @return An [S3Object] instance handle on the target object.
   *
   * @throws FileNotFoundException If the given local file does not exist.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    FileNotFoundException::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun upload(path: String, file: File): S3Object

  /**
   * Uploads the configured file to this container at the configured path,
   * overwriting any object presently at that path.
   *
   * @param action Action used to configure the backing S3 operation.
   *
   * @return An [S3Object] instance handle on the target object.
   *
   * @throws InvalidRequestConfigError If either the `path` value or `localFile`
   * value is not set on the configured parameters.
   *
   * @throws FileNotFoundException If the configured local file does not exist.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    InvalidRequestConfigError::class,
    FileNotFoundException::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun upload(path: String, action: S3FileUploadParams.() -> Unit): S3Object

  /**
   * Uploads the configured file to this container at the configured path,
   * overwriting any object presently at that path.
   *
   * @param params Parameters for the backing S3 operation.
   *
   * @return An [S3Object] instance handle on the target object.
   *
   * @throws InvalidRequestConfigError If either the `path` value or `localFile`
   * value is not set on the configured parameters.
   *
   * @throws FileNotFoundException If the configured local file does not exist.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    InvalidRequestConfigError::class,
    FileNotFoundException::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun upload(path: String, params: S3FileUploadParams): S3Object

  // endregion Put File

  // region Put Zip

  // TODO: PUT ZIP METHODS

  // endregion Put Zip

  // endregion Create

  // region Delete

  // region Delete Object

  /**
   * Deletes the object at the target path from this container.
   *
   * @param path Path to the target object to delete.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun delete(path: String)

  /**
   * Deletes the object at the target path from this container.
   *
   * @param action Action used to configure the backing S3 operation.
   *
   * @throws InvalidRequestConfigError If the `path` value  is not set on the
   * configured parameters.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    InvalidRequestConfigError::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun delete(path: String, action: S3DeleteParams.() -> Unit)

  /**
   * Deletes the object at the target path from this container.
   *
   * @param params Parameters for the backing S3 operation.
   *
   * @throws InvalidRequestConfigError If the `path` value  is not set on the
   * configured parameters.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    InvalidRequestConfigError::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun delete(path: String, params: S3DeleteParams)

  // endregion Delete Object

  // region Delete Multi

  /**
   * Deletes all the given target objects from this container.
   *
   * If the target paths set is empty, this method does nothing.
   *
   * @param paths Target paths to delete.
   *
   * @throws MultiObjectDeleteError If one or more of the object deletes in this
   * operation could not be deleted.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun deleteAll(vararg paths: String)

  /**
   * Deletes all the given target objects from this container.
   *
   * If the target paths set is empty, this method does nothing.
   *
   * @param paths Target paths to delete.
   *
   * @throws MultiObjectDeleteError If one or more of the object deletes in this
   * operation could not be deleted.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun deleteAll(paths: Iterable<String>)

  /**
   * Deletes all the given target objects from this container.
   *
   * If the target paths set is empty, this method does nothing.
   *
   * @param action Action used to configure the backing S3 operation.
   *
   * @throws MultiObjectDeleteError If one or more of the object deletes in this
   * operation could not be deleted.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun deleteAll(action: S3MultiObjectDeleteParams.() -> Unit)

  /**
   * Deletes all the given target objects from this container.
   *
   * If the target paths set is empty, this method does nothing.
   *
   * @param params Parameters for the backing S3 operation.
   *
   * @throws MultiObjectDeleteError If one or more of the object deletes in this
   * operation could not be deleted.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
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
   * @throws DirectoryObjectDeleteError If some or all of the directory's
   * contents could not be deleted.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    DirectoryObjectDeleteError::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun rmdir(path: String)

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
   * @param action Action used to configure the backing S3 operation.
   *
   * @throws InvalidRequestConfigError If `path` value is not set on the
   * configured parameters.
   *
   * @throws DirectoryObjectDeleteError If some or all of the directory's
   * contents could not be deleted.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    InvalidRequestConfigError::class,
    DirectoryObjectDeleteError::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun rmdir(path: String, action: S3DirectoryDeleteParams.() -> Unit)

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
   * @param params Parameters for the backing S3 operation.
   *
   * @throws InvalidRequestConfigError If the `path` value is not set on the
   * configured parameters.
   *
   * @throws DirectoryObjectDeleteError If some or all of the directory's
   * contents could not be deleted.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    InvalidRequestConfigError::class,
    DirectoryObjectDeleteError::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun rmdir(path: String, params: S3DirectoryDeleteParams)

  // endregion RmDir

  // endregion Delete
}