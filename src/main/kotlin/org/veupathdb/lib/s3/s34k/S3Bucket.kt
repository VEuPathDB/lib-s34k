package org.veupathdb.lib.s3.s34k

import org.veupathdb.lib.s3.s34k.errors.*
import org.veupathdb.lib.s3.s34k.fields.BucketName
import org.veupathdb.lib.s3.s34k.params.DeleteParams
import org.veupathdb.lib.s3.s34k.response.`object`.S3ObjectMeta
import org.veupathdb.lib.s3.s34k.params.TagGetParams
import org.veupathdb.lib.s3.s34k.params.TagPutParams
import org.veupathdb.lib.s3.s34k.request.bucket.BucketTagDeleteParams
import org.veupathdb.lib.s3.s34k.request.`object`.*
import org.veupathdb.lib.s3.s34k.response.`object`.S3FileObject
import org.veupathdb.lib.s3.s34k.response.`object`.S3Object
import org.veupathdb.lib.s3.s34k.response.`object`.S3StreamObject
import java.io.File
import java.io.InputStream
import java.time.OffsetDateTime
import java.util.*

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
  val name: BucketName

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

  // region Bucket Actions

  // region Delete

  /**
   * Deletes this bucket.
   *
   * @return Whether the bucket was deleted.  `true` if the bucket previously
   * existed and has been deleted, `false` if the bucket did not exist.
   *
   * @throws BucketNotEmptyException If this bucket is not empty and must be
   * cleared before deletion.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see deleteRecursive
   */
  @Throws(BucketNotEmptyException::class, S34kException::class)
  fun delete(): Boolean =
    delete(DeleteParams(region))

  /**
   * Deletes this bucket with the operation configured by the given action.
   *
   * @param action Action used to configure the S3 operation.
   *
   * @return Whether the bucket was deleted.  `true` if the bucket previously
   * existed and has been deleted, `false` if the bucket did not exist.
   *
   * @throws InvalidRequestConfigException If the S3 operation parameters are
   * missing required fields or otherwise incorrectly configured.
   *
   * @throws BucketNotEmptyException If this bucket is not empty and must be
   * cleared before deletion.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see deleteRecursive
   */
  @Throws(InvalidRequestConfigException::class, BucketNotEmptyException::class, S34kException::class)
  fun delete(action: DeleteParams.() -> Unit): Boolean =
    delete(DeleteParams(region).also(action))

  /**
   * Deletes this bucket with the operation configured by the given params.
   *
   * @param params S3 operation parameters.
   *
   * @return Whether the bucket was deleted.  `true` if the bucket previously
   * existed and has been deleted, `false` if the bucket did not exist.
   *
   * @throws InvalidRequestConfigException If the S3 operation parameters are
   * missing required fields or otherwise incorrectly configured.
   *
   * @throws BucketNotEmptyException If this bucket is not empty and must be
   * cleared before deletion.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see deleteRecursive
   */
  @Throws(InvalidRequestConfigException::class, BucketNotEmptyException::class, S34kException::class)
  fun delete(params: DeleteParams): Boolean

  // endregion Delete

  // region Delete Recursive

  /**
   * Recursively deletes this bucket and all its contents.
   *
   * @return Whether the bucket was deleted.  `true` if the bucket previously
   * existed and has been deleted, `false` if the bucket did not exist.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see delete
   */
  @Throws(S34kException::class)
  fun deleteRecursive(): Boolean =
    deleteRecursive(DeleteParams())

  /**
   * Recursively deletes this bucket and all its contents with the operation
   * configured by the given action.
   *
   * @param action Action used to configure the S3 operation.
   *
   * @return Whether the bucket was deleted.  `true` if the bucket previously
   * existed and has been deleted, `false` if the bucket did not exist.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see delete
   */
  @Throws(S34kException::class)
  fun deleteRecursive(action: DeleteParams.() -> Unit): Boolean =
    deleteRecursive(DeleteParams().also(action))

  /**
   * Recursively deletes this bucket and all its contents with the operation
   * configured by the given params.
   *
   * @param params S3 operation parameters.
   *
   * @return Whether the bucket was deleted.  `true` if the bucket previously
   * existed and has been deleted, `false` if the bucket did not exist.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see delete
   */
  @Throws(S34kException::class)
  fun deleteRecursive(params: DeleteParams): Boolean

  // endregion

  // region Delete Bucket Tags

  /**
   * Deletes all the tags from this bucket.
   *
   * @return Set of the tags that were deleted.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundException::class, S34kException::class)
  fun deleteBucketTags(): S3TagSet =
    deleteBucketTags(BucketTagDeleteParams(region))

  /**
   * Deletes the listed tags from this bucket.
   *
   * @param tags Tags to delete.
   *
   * @return Set of the tags that were deleted.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundException::class, S34kException::class)
  fun deleteBucketTags(vararg tags: String): S3TagSet =
    deleteBucketTags(BucketTagDeleteParams(region).also {
      it.tags.addTags(tags.asList())
    })

  /**
   * Deletes the listed tags from this bucket.
   *
   * @param tags Iterable over tags to delete.
   *
   * @return Set of the tags that were deleted.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundException::class, S34kException::class)
  fun deleteBucketTags(tags: Iterable<String>): S3TagSet =
    deleteBucketTags(BucketTagDeleteParams(region).also {
      it.tags.addTags(tags)
    })

  /**
   * Deletes the target tags from this bucket.
   *
   * @param action Action used to configure the S3 operation parameters.
   *
   * @return Set of the tags that were deleted.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundException::class, S34kException::class)
  fun deleteBucketTags(action: BucketTagDeleteParams.() -> Unit): S3TagSet =
    deleteBucketTags(BucketTagDeleteParams(region).also(action))

  /**
   * Deletes the target tags from this bucket.
   *
   * @param params S3 operation parameters.
   *
   * @return Set of the tags that were deleted.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundException::class, S34kException::class)
  fun deleteBucketTags(params: BucketTagDeleteParams): S3TagSet

  // endregion Delete Bucket Tags

  // region Get Bucket Tags

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
  @Throws(BucketNotFoundException::class, S34kException::class)
  fun getBucketTags(): S3TagSet =
    getBucketTags(TagGetParams(region))


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
  @Throws(BucketNotFoundException::class, S34kException::class)
  fun getBucketTags(action: TagGetParams.() -> Unit): S3TagSet =
    getBucketTags(TagGetParams(region).also(action))


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
  @Throws(BucketNotFoundException::class, S34kException::class)
  fun getBucketTags(params: TagGetParams): S3TagSet

  // endregion

  // region Put Bucket Tags

  // TODO: Document me
  @Throws(BucketNotFoundException::class, S34kException::class)
  fun putBucketTags(vararg tags: Pair<String, String>) =
    putBucketTags(TagPutParams(region).also {
      Arrays.stream(tags).forEach { (k, v) -> it.tags.addTag(k, v) }
    })

  // TODO: Document me
  @Throws(BucketNotFoundException::class, S34kException::class)
  fun putBucketTags(vararg tags: S3Tag) =
    putBucketTags(TagPutParams(region).also {
      Arrays.stream(tags).forEach { t -> it.tags.addTag(t) }
    })

  /**
   * Attaches the given tags to this S3 bucket.
   *
   * If the given map of tags is empty, this method does nothing.
   *
   * @param tags Tags to attach to this bucket.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundException::class, S34kException::class)
  fun putBucketTags(tags: Map<String, String>) =
    putBucketTags(TagPutParams(region).also { it.tags.addTags(tags) })

  /**
   * Attaches the given tags to this S3 bucket.
   *
   * If the given collection of tags is empty, this method does nothing.
   *
   * @param tags Tags to attach to this bucket.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundException::class, S34kException::class)
  fun putBucketTags(tags: Iterable<S3Tag>) =
    putBucketTags(TagPutParams(region).also { it.tags.addTags(tags) })

  /**
   * Attaches the tags from the given operation parameters to this bucket.
   *
   * @param action Action used to configure the S3 operation parameters.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundException::class, S34kException::class)
  fun putBucketTags(action: TagPutParams.() -> Unit) =
    putBucketTags(TagPutParams(region).also(action))

  /**
   * Attaches the tags from the given operation parameters to this bucket.
   *
   * If the configured collection of tags is empty, this method does nothing.
   *
   * @param params Parameters for the S3 operation.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundException::class, S34kException::class)
  fun putBucketTags(params: TagPutParams)

  // endregion

  // endregion Bucket Actions

  // region Object Actions

  // region Delete Object Tags

  // TODO: Document me
  @Throws(ObjectNotFoundException::class, BucketNotFoundException::class, S34kException::class)
  fun deleteObjectTags(path: String) =
    deleteObjectTags(ObjectTagDeleteParams(path, region))

  // TODO: Document me
  @Throws(ObjectNotFoundException::class, BucketNotFoundException::class, S34kException::class)
  fun deleteObjectTags(path: String, vararg tags: String) =
    deleteObjectTags(ObjectTagDeleteParams(path, region).also {
      it.tags.addTags(tags.asList())
    })

  // TODO: Document me
  @Throws(ObjectNotFoundException::class, BucketNotFoundException::class, S34kException::class)
  fun deleteObjectTags(path: String, tags: Iterable<String>) =
    deleteObjectTags(ObjectTagDeleteParams(path, region).also {
      it.tags.addTags(tags)
    })

  // TODO: Document me
  @Throws(InvalidRequestConfigException::class, ObjectNotFoundException::class, BucketNotFoundException::class, S34kException::class)
  fun deleteObjectTags(action: ObjectTagDeleteParams.() -> Unit) =
    deleteObjectTags(ObjectTagDeleteParams(null, region).also(action))

  // TODO: Document me
  @Throws(InvalidRequestConfigException::class, ObjectNotFoundException::class, BucketNotFoundException::class, S34kException::class)
  fun deleteObjectTags(params: ObjectTagDeleteParams): S3TagSet

  // endregion Delete Object Tags

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
  @Throws(BucketNotFoundException::class, S34kException::class)
  fun objectExists(path: String) =
    objectExists(ObjectExistsParams(path, region))

  /**
   * Tests for the existence of an object with the operation configured by the
   * given [action].
   *
   * @param action Action to configure the S3 operation.
   *
   * @return `true` if an object exists at the given path, otherwise `false`.
   *
   * @throws InvalidRequestConfigException If the S3 operation parameters are
   * missing required fields or otherwise incorrectly configured.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(InvalidRequestConfigException::class, BucketNotFoundException::class, S34kException::class)
  fun objectExists(action: ObjectExistsParams.() -> Unit) =
    objectExists(ObjectExistsParams(null, region).also(action))


  /**
   * Tests for the existence of an object with the operation configured by the
   * given [params].
   *
   * @param params S3 operation configuration.
   *
   * @return `true` if an object exists at the given path, otherwise `false`.
   *
   * @throws InvalidRequestConfigException If the S3 operation parameters are
   * missing required fields or otherwise incorrectly configured.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(InvalidRequestConfigException::class, BucketNotFoundException::class, S34kException::class)
  fun objectExists(params: ObjectExistsParams): Boolean

  // endregion

  // region Stat Object

  /**
   * Fetches metadata for the object in this bucket at the given [path].
   *
   * @param path Path to the object whose metadata should be fetched.
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
  @Throws(ObjectNotFoundException::class, BucketNotFoundException::class, S34kException::class)
  fun statObject(path: String) =
    statObject(ObjectStatParams(path, region))

  /**
   * Fetches metadata for the object in this bucket at the configured path.
   *
   * @param action Action used to configure the S3 operation parameters.
   *
   * @return Metadata about the specified object.
   *
   * @throws InvalidRequestConfigException If the S3 operation parameters are
   * missing required fields or otherwise incorrectly configured.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws ObjectNotFoundException If the target object does not exist.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(InvalidRequestConfigException::class, ObjectNotFoundException::class, BucketNotFoundException::class, S34kException::class)
  fun statObject(action: ObjectStatParams.() -> Unit) =
    statObject(ObjectStatParams(null, region).also(action))

  /**
   * Fetches metadata for the object in this bucket at the configured path.
   *
   * @param params S3 operation parameters.
   *
   * @return Metadata about the specified object.
   *
   * @throws InvalidRequestConfigException If the S3 operation parameters are
   * missing required fields or otherwise incorrectly configured.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws ObjectNotFoundException If the target object does not exist.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(InvalidRequestConfigException::class, ObjectNotFoundException::class, BucketNotFoundException::class, S34kException::class)
  fun statObject(params: ObjectStatParams): S3ObjectMeta

  // endregion

  // region Get Object

  // TODO: Document me
  fun getObject(path: String) =
    getObject(ObjectGetParams(path, region))


  // TODO: Document me
  fun getObject(action: ObjectGetParams.() -> Unit) =
    getObject(ObjectGetParams(null, region).also(action))

  // TODO: Document me
  fun getObject(params: ObjectGetParams): S3StreamObject

  // endregion

  // region Get Object Tags

  // TODO: Document me
  fun getObjectTags(path: String) =
    getObjectTags(ObjectTagGetParams(path, region))

  // TODO: Document me
  fun getObjectTags(action: ObjectTagGetParams.() -> Unit) =
    getObjectTags(ObjectTagGetParams(null, region).also(action))

  // TODO: Document me
  fun getObjectTags(params: ObjectTagGetParams): S3TagSet

  // endregion

  // region Put Object Tags

  fun putObjectTags(path: String, vararg tags: Pair<String, String>) =
    putObjectTags(ObjectTagPutParams(path, region).also {
      tags.forEach { (k, v) -> it.tags.addTag(k, v) }
    })

  fun putObjectTags(path: String, vararg tags: S3Tag) =
    putObjectTags(ObjectTagPutParams(path, region).also {
      tags.forEach { t -> it.tags.addTag(t) }
    })

  // TODO: Document me
  fun putObjectTags(path: String, tags: Iterable<S3Tag>) =
    putObjectTags(ObjectTagPutParams(path, region).also {
      it.tags.addTags(tags)
    })

  // TODO: Document me
  fun putObjectTags(path: String, tags: Map<String, String>) =
    putObjectTags(ObjectTagPutParams(path, region).also {
      it.tags.addTags(tags)
    })

  // TODO: Document me
  fun putObjectTags(action: ObjectTagPutParams.() -> Unit) =
    putObjectTags(ObjectTagPutParams(null, region).also(action))

  // TODO: Document me
  fun putObjectTags(params: ObjectTagPutParams)

  // endregion

  // region Download Object

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
  fun downloadObject(path: String, localFile: File) =
    downloadObject(ObjectDownloadParams(path, region, localFile))

  // TODO: Document me
  fun downloadObject(action: ObjectDownloadParams.() -> Unit) =
    downloadObject(ObjectDownloadParams(null, region).also(action))

  // TODO: Document me
  fun downloadObject(params: ObjectDownloadParams): S3FileObject

  // endregion

  // region Touch Object

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
  fun touchObject(path: String) =
    touchObject(ObjectTouchParams(path, region))

  // TODO: Document me
  fun touchObject(action: ObjectTouchParams.() -> Unit) =
    touchObject(ObjectTouchParams(null, region).also(action))

  // TODO: Document me
  fun touchObject(params: ObjectTouchParams): S3Object

  // endregion

  // region Put Directory

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
  fun putDirectory(path: String) =
    putDirectory(DirectoryPutParams(path, region))

  // TODO: Document me
  fun putDirectory(action: DirectoryPutParams.() -> Unit) =
    putDirectory(DirectoryPutParams(null, region).also(action))

  // TODO: Document me
  fun putDirectory(params: DirectoryPutParams): S3Object

  // endregion

  // region Put Object

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
  fun putObject(path: String, stream: InputStream, size: Long = -1) =
    putObject(ObjectPutParams(path, region, stream, size))

  // TODO: Document me
  fun putObject(action: ObjectPutParams.() -> Unit) =
    putObject(ObjectPutParams(null, region).also(action))

  // TODO: Document me
  fun putObject(params: ObjectPutParams): S3Object

  // endregion

  // region Put File

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
  fun uploadFile(path: String, file: File) =
    uploadFile(ObjectFilePutParams(path, region, file))

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
  fun uploadFile(action: ObjectFilePutParams.() -> Unit) =
    uploadFile(ObjectFilePutParams(null, region).also(action))

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

  // region Delete Object

  // TODO: Document me
  fun deleteObject(path: String) =
    deleteObject(ObjectDeleteParams(path, region))

  // TODO: Document me
  fun deleteObject(action: ObjectDeleteParams.() -> Unit) =
    deleteObject(ObjectDeleteParams(null, region).also(action))

  // TODO: Document me
  fun deleteObject(params: ObjectDeleteParams): Boolean

  // endregion Delete Object

  // region Delete Objects

  // TODO: Document me
  fun deleteObjects(vararg paths: String) =
    deleteObjects(ObjectDeleteMultiParams(region).also {
      it.paths.addPaths(paths.toList())
    })

  // TODO: Document me
  fun deleteObjects(paths: Iterable<String>) =
    deleteObjects(ObjectDeleteMultiParams(region).also {
      it.paths.addPaths(paths)
    })

  // TODO: Document me
  fun deleteObjects(action: ObjectDeleteMultiParams.() -> Unit) =
    deleteObjects(ObjectDeleteMultiParams(region).also(action))

  // TODO: Document me
  fun deleteObjects(params: ObjectDeleteMultiParams)

  // endregion Delete Objects

  // region List Objects

  // TODO: Document me
  fun listObjects() =
    listObjects(ObjectListParams(region))

  // TODO: Document me
  fun listObjects(action: ObjectListParams.() -> Unit) =
    listObjects(ObjectListParams(region).also(action))

  // TODO: Document me
  fun listObjects(params: ObjectListParams): S3ObjectList

  // endregion List Objects

  // endregion Object Actions
}