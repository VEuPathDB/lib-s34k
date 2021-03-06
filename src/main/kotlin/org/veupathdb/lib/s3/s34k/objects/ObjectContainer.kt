package org.veupathdb.lib.s3.s34k.objects

import org.veupathdb.lib.s3.s34k.errors.*
import org.veupathdb.lib.s3.s34k.params.DeleteParams
import org.veupathdb.lib.s3.s34k.params.`object`.*
import org.veupathdb.lib.s3.s34k.params.`object`.directory.DirectoryDeleteParams
import org.veupathdb.lib.s3.s34k.params.`object`.multi.MultiObjectDeleteParams
import org.veupathdb.lib.s3.s34k.params.`object`.touch.ObjectTouchParams
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
 * TODO: Handle delete markers
 * TODO: Version IDs
 * TODO: Governance Mode
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.3.0
 */
@Suppress("unused")
interface ObjectContainer {

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
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun contains(path: String, action: ObjectExistsParams.() -> Unit): Boolean

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
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun contains(path: String, params: ObjectExistsParams): Boolean

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
  @Throws(BucketNotFoundError::class, S34KError::class)
  operator fun get(path: String): S3Object?

  // TODO: document me
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun get(path: String, action: ObjectGetParams.() -> Unit): S3Object?

  // TODO: document me
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun get(path: String, params: ObjectGetParams): S3Object?

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
   * @return An [StreamObject] instance handle on the target object, or `null`
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
  fun open(path: String): StreamObject?

  /**
   * Fetches the configured target object and returns a handle on it which can
   * be used to stream out the target object's contents.
   *
   * If the target path does not exist, or is a directory, `null` will be
   * returned.
   *
   * @param action Action used to configure the backing S3 operation.
   *
   * @return An [StreamObject] instance handle on the target object, or `null`
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
  fun open(path: String, action: ObjectOpenParams.() -> Unit): StreamObject?

  /**
   * Fetches the configured target object and returns a handle on it which can
   * be used to stream out the target object's contents.
   *
   * If the target path does not exist, or is a directory, `null` will be
   * returned.
   *
   * @param params Parameters for the backing S3 operation.
   *
   * @return An [StreamObject] instance handle on the target object, or `null`
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
  fun open(path: String, params: ObjectOpenParams): StreamObject?

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
   * @return An [FileObject] instance handle on the target object and local
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
  fun download(path: String, localFile: File): FileObject

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
   * @return An [FileObject] instance handle on the target object and local
   * file.
   *
   * @throws InvalidRequestConfigError If the `localFile` value is not set on
   * the configured parameters.
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
  fun download(path: String, action: ObjectDownloadParams.() -> Unit): FileObject

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
   * @return An [FileObject] instance handle on the target object and local
   * file.
   *
   * @throws InvalidRequestConfigError If the `localFile` value  is not set on
   * the configured parameters.
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
  fun download(path: String, params: ObjectDownloadParams): FileObject

  // endregion Download

  // region Stat

  /**
   * Fetches metadata for the object at the target path.
   *
   * If the target object does not exist, `null` will be returned.
   *
   * @param path Path to the target object whose metadata should be returned.
   *
   * @return An [ObjectMeta] instance containing the target object's metadata
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
  fun stat(path: String): ObjectMeta?

  /**
   * Fetches metadata for the object at the target path.
   *
   * If the target object does not exist, `null` will be returned.
   *
   * @param path Path to the target object whose metadata should be returned.
   *
   * @param action Action used to configure the backing S3 operation.
   *
   * @return An [ObjectMeta] instance containing the target object's metadata
   * if the target object exists, otherwise `null`.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun stat(path: String, action: ObjectStatParams.() -> Unit): ObjectMeta?

  /**
   * Fetches metadata for the object at the target path.
   *
   * If the target object does not exist, `null` will be returned.
   *
   * @param path Path to the target object whose metadata should be returned.
   *
   * @param params Parameters for the backing S3 operation.
   *
   * @return An [ObjectMeta] instance containing the target object's metadata
   * if the target object exists, otherwise `null`.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun stat(path: String, params: ObjectStatParams): ObjectMeta?

  // endregion Stat

  // region List All

  /**
   * Fetches a list of all the objects in this container.
   *
   * @return An [ObjectList] instance containing `0` or more entries for each
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
  fun listAll(): ObjectList

  /**
   * Fetches a list of all the objects in this container.
   *
   * @param action Action used to configure the backing S3 operation.
   *
   * @return An [ObjectList] instance containing `0` or more entries for each
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
  fun listAll(action: ObjectListAllParams.() -> Unit): ObjectList

  /**
   * Fetches a list of all the objects in this container.
   *
   * @param params Parameters for the backing S3 operation.
   *
   * @return An [ObjectList] instance containing `0` or more entries for each
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
  fun listAll(params: ObjectListAllParams): ObjectList

  // endregion List All

  // region List

  fun list(prefix: String? = null): ObjectList

  fun list(action: ObjectListParams.() -> Unit): ObjectList

  fun list(params: ObjectListParams): ObjectList

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
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun touch(path: String, action: ObjectTouchParams.() -> Unit): S3Object

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
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun touch(path: String, params: ObjectTouchParams): S3Object

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
   * @throws InvalidRequestConfigError If the `stream` value is not set on the
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
  fun put(path: String, action: StreamingObjectPutParams.() -> Unit): S3Object

  /**
   * Creates or overwrites an object at the configured path with its contents
   * uploaded from the configured stream.
   *
   * @param params Parameters for the backing S3 operation.
   *
   * @return An [S3Object] instance handle on the target object.
   *
   * @throws InvalidRequestConfigError If the `stream` value is not set on the
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
  fun put(path: String, params: StreamingObjectPutParams): S3Object

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
   * @throws IllegalArgumentException If the given local file handle points to a
   * directory.
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
    IllegalArgumentException::class,
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
   * @throws IllegalArgumentException If the given local file handle points to a
   * directory.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    IllegalArgumentException::class,
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
   * @throws InvalidRequestConfigError If the `localFile` value is not set on
   * the configured parameters, or if the localFile value points to a directory.
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
  fun upload(path: String, action: FileUploadParams.() -> Unit): S3Object

  /**
   * Uploads the configured file to this container at the configured path,
   * overwriting any object presently at that path.
   *
   * @param params Parameters for the backing S3 operation.
   *
   * @return An [S3Object] instance handle on the target object.
   *
   * @throws InvalidRequestConfigError If the `localFile` value is not set on
   * the configured parameters, or if the localFile value points to a directory.
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
  fun upload(path: String, params: FileUploadParams): S3Object

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
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun delete(path: String, action: DeleteParams.() -> Unit)

  /**
   * Deletes the object at the target path from this container.
   *
   * @param params Parameters for the backing S3 operation.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun delete(path: String, params: DeleteParams)

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
   * operation could not be deleted.  This does not include errors resulting in
   * the target objects already having been deleted at the time of this method
   * call.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  // TODO: Misleading name, this should delete ALL objects
  fun deleteAll(vararg paths: String)

  /**
   * Deletes all the given target objects from this container.
   *
   * If the target paths set is empty, this method does nothing.
   *
   * @param paths Target paths to delete.
   *
   * @throws MultiObjectDeleteError If one or more of the object deletes in this
   * operation could not be deleted.  This does not include errors resulting in
   * the target objects already having been deleted at the time of this method
   * call.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  // TODO: Misleading name, this should delete ALL objects
  fun deleteAll(paths: Iterable<String>)

  /**
   * Deletes all the given target objects from this container.
   *
   * If the target paths set is empty, this method does nothing.
   *
   * @param action Action used to configure the backing S3 operation.
   *
   * @throws MultiObjectDeleteError If one or more of the object deletes in this
   * operation could not be deleted.  This does not include errors resulting in
   * the target objects already having been deleted at the time of this method
   * call.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  // TODO: Misleading name, this should delete ALL objects
  fun deleteAll(action: MultiObjectDeleteParams.() -> Unit)

  /**
   * Deletes all the given target objects from this container.
   *
   * If the target paths set is empty, this method does nothing.
   *
   * @param params Parameters for the backing S3 operation.
   *
   * @throws MultiObjectDeleteError If one or more of the object deletes in this
   * operation could not be deleted.  This does not include errors resulting in
   * the target objects already having been deleted at the time of this method
   * call.
   *
   * @throws BucketNotFoundError If this bucket or the bucket in which this
   * object container resides no longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  // TODO: Misleading name, this should delete ALL objects
  fun deleteAll(params: MultiObjectDeleteParams)

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
   * @throws MultiObjectDeleteError If some or all of the directory's
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
    MultiObjectDeleteError::class,
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
   * @throws MultiObjectDeleteError If some or all of the directory's
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
    MultiObjectDeleteError::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun rmdir(path: String, action: DirectoryDeleteParams.() -> Unit)

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
   * @throws MultiObjectDeleteError If some or all of the directory's
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
    MultiObjectDeleteError::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun rmdir(path: String, params: DirectoryDeleteParams)

  // endregion RmDir

  // endregion Delete
}