package org.veupathdb.lib.s3.s34k

import org.veupathdb.lib.s3.s34k.errors.*
import org.veupathdb.lib.s3.s34k.fields.BucketName
import org.veupathdb.lib.s3.s34k.fields.tags.S3TagMap
import org.veupathdb.lib.s3.s34k.requests.*
import org.veupathdb.lib.s3.s34k.requests.bucket.S3BucketTagDeleteParams
import org.veupathdb.lib.s3.s34k.requests.bucket.recursive.RecursiveBucketDeleteError
import org.veupathdb.lib.s3.s34k.requests.bucket.recursive.S3RecursiveBucketDeleteParams
import org.veupathdb.lib.s3.s34k.requests.`object`.*
import org.veupathdb.lib.s3.s34k.response.`object`.*
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

  // region Properties

  /**
   * Reference to the parent client that created this [S3Bucket] instance.
   */
  val client: S3Client

  /**
   * Name of this bucket.
   */
  val bucketName: BucketName

  /**
   * Region of this bucket.
   *
   * This value will be used as a fallback for operations where no region is
   * configured.
   *
   * If this value is `null` and a set of operation parameters also has a `null`
   * region, no region will be set on the operation.
   */
  val defaultRegion: String?

  /**
   * Date/time this bucket was created.
   */
  val creationDate: OffsetDateTime

  // endregion Properties

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
  fun delete(): Boolean

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
  fun delete(action: S3DeleteRequestParams.() -> Unit): Boolean

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
  fun delete(params: S3DeleteRequestParams): Boolean

  // endregion Delete

  // region Delete Recursive

  /**
   * Recursively deletes this bucket and all its contents.
   *
   * This operation happens in 3 phases which can be configured independently
   * using the [S3RecursiveBucketDeleteParams] class.
   * The 3 phases are:
   *
   * 1. Fetch a list of all the objects in the bucket.
   * 2. Delete all the objects from the bucket.
   * 3. Delete the bucket itself.
   *
   * @return Whether the bucket was deleted.  `true` if the bucket previously
   * existed and has been deleted, `false` if the bucket did not exist.
   *
   * @throws RecursiveBucketDeleteError If an error occurs while attempting to
   * delete the bucket, or it's contained objects.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see delete
   */
  fun deleteRecursive(): Boolean

  /**
   * Recursively deletes this bucket and all its contents with the operation
   * configured by the given action.
   *
   * @param action Action used to configure the S3 operation.
   *
   * @return Whether the bucket was deleted.  `true` if the bucket previously
   * existed and has been deleted, `false` if the bucket did not exist.
   *
   * @throws RecursiveBucketDeleteError If an error occurs while attempting to
   * delete the bucket, or it's contained objects.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see delete
   */
  fun deleteRecursive(action: S3RecursiveBucketDeleteParams.() -> Unit): Boolean

  /**
   * Recursively deletes this bucket and all its contents with the operation
   * configured by the given params.
   *
   * @param params S3 operation parameters.
   *
   * @return Whether the bucket was deleted.  `true` if the bucket previously
   * existed and has been deleted, `false` if the bucket did not exist.
   *
   * @throws RecursiveBucketDeleteError If an error occurs while attempting to
   * delete the bucket, or it's contained objects.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see delete
   */
  fun deleteRecursive(params: S3RecursiveBucketDeleteParams): Boolean

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
  fun deleteBucketTags(): S3TagMap

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
  fun deleteBucketTags(vararg tags: String): S3TagMap

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
  fun deleteBucketTags(tags: Iterable<String>): S3TagMap

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
  fun deleteBucketTags(action: S3BucketTagDeleteParams.() -> Unit): S3TagMap

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
  fun deleteBucketTags(params: S3BucketTagDeleteParams): S3TagMap

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
  fun getBucketTags(): S3TagMap

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
  fun getBucketTags(action: S3BlankTagGetParams.() -> Unit): S3TagMap

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
  fun getBucketTags(params: S3BlankTagGetParams): S3TagMap

  // endregion

  // region Put Bucket Tags

  /**
   * Attaches the given tags to this S3 bucket.
   *
   * If the given array of tag pairs is empty, this method does nothing.
   *
   * @param tags Array of key -> value pairs to assign to this bucket as tags.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun putBucketTags(vararg tags: Pair<String, String>)

  /**
   * Attaches the given tags to this S3 bucket.
   *
   * If the given array of tags is empty, this method does nothing.
   *
   * @param tags Array of tags to assign to this bucket as tags.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun putBucketTags(vararg tags: S3Tag)

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
  fun putBucketTags(tags: Map<String, String>)

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
  fun putBucketTags(tags: Iterable<S3Tag>)

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
  fun putBucketTags(action: S3BlankTagCreateParams.() -> Unit)

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
  fun putBucketTags(params: S3BlankTagCreateParams)

  // endregion

  // endregion Bucket Actions

  // region Object Actions

  // region Delete Object Tags

  /**
   * Deletes all the tags attached to the S3 object at the given [path].
   *
   * @param path Path to the object whose tags should be deleted.
   *
   * @return An [S3TagMap] containing the keys/values that were previously
   * attached to the target object.  If the target object previously had no tags
   * attached, this method will be empty.
   *
   * @throws ObjectNotFoundException If the target object does not exist.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun deleteObjectTags(path: String): S3TagMap

  /**
   * Deletes only the specified target tags from the S3 object at the given
   * [path].
   *
   * This operation happens in 3 phases due to S3 not presently supporting
   * targeted tag deletions:
   *
   * 1. Fetch a list of all the tags presently on the target object.
   * 2. Delete all tags from the target object.
   * 3. Re-append the tags to the object that did not appear in the tag removal
   *    list.
   *
   * Any/all tags not specified in the list of tags for removal will be
   * re-appended to the target object.
   *
   * If one or more tags in the removal list, they will be ignored and will not
   * appear in the output [S3TagMap].
   *
   * @param path Path to the object whose tags should be deleted.
   *
   * @param tags Tags to be removed from the object.
   *
   * @return An [S3TagMap] containing the tags that were previously attached to
   * the target object.  If any tags in the removal list were not attached to
   * the object at the time this method was called, those tags will not appear
   * in the returned tag map.
   *
   * @throws ObjectNotFoundException If the target object does not exist.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun deleteObjectTags(path: String, vararg tags: String): S3TagMap

  /**
   * Deletes only the specified target tags from the S3 object at the given
   * [path].
   *
   * This operation happens in 3 phases due to S3 not presently supporting
   * targeted tag deletions:
   *
   * 1. Fetch a list of all the tags presently on the target object.
   * 2. Delete all tags from the target object.
   * 3. Re-append the tags to the object that did not appear in the tag removal
   *    list.
   *
   * Any/all tags not specified in the list of tags for removal will be
   * re-appended to the target object.
   *
   * If one or more tags in the removal list, they will be ignored and will not
   * appear in the output [S3TagMap].
   *
   * @param path Path to the object whose tags should be deleted.
   *
   * @param tags Tags to be removed from the object.
   *
   * @return An [S3TagMap] containing the tags that were previously attached to
   * the target object.  If any tags in the removal list were not attached to
   * the object at the time this method was called, those tags will not appear
   * in the returned tag map.
   *
   * @throws ObjectNotFoundException If the target object does not exist.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun deleteObjectTags(path: String, tags: Iterable<String>): S3TagMap

  /**
   * Deletes only the specified target tags from the S3 object at the object
   * path configured by the given configuration [action].
   *
   * This operation happens in 3 phases due to S3 not presently supporting
   * targeted tag deletions:
   *
   * 1. Fetch a list of all the tags presently on the target object.
   * 2. Delete all tags from the target object.
   * 3. Re-append the tags to the object that did not appear in the tag removal
   *    list.
   *
   * Any/all tags not specified in the list of tags for removal will be
   * re-appended to the target object.
   *
   * If one or more tags in the removal list, they will be ignored and will not
   * appear in the output [S3TagMap].
   *
   * @param action Action used to configure this S3 operation.
   *
   * @return An [S3TagMap] containing the tags that were previously attached to
   * the target object.  If any tags in the removal list were not attached to
   * the object at the time this method was called, those tags will not appear
   * in the returned tag map.
   *
   * @throws InvalidRequestConfigException If the `path` property is not set on
   * the configured [S3ObjectTagDeleteParams] instance.
   *
   * @throws ObjectNotFoundException If the target object does not exist.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun deleteObjectTags(action: S3ObjectTagDeleteParams.() -> Unit): S3TagMap

  /**
   * Deletes only the specified target tags from the S3 object at the object
   * path configured by the given configuration.
   *
   * This operation happens in 3 phases due to S3 not presently supporting
   * targeted tag deletions:
   *
   * 1. Fetch a list of all the tags presently on the target object.
   * 2. Delete all tags from the target object.
   * 3. Re-append the tags to the object that did not appear in the tag removal
   *    list.
   *
   * Any/all tags not specified in the list of tags for removal will be
   * re-appended to the target object.
   *
   * If one or more tags in the removal list, they will be ignored and will not
   * appear in the output [S3TagMap].
   *
   * @param params S3 operation parameters.
   *
   * @return An [S3TagMap] containing the tags that were previously attached to
   * the target object.  If any tags in the removal list were not attached to
   * the object at the time this method was called, those tags will not appear
   * in the returned tag map.
   *
   * @throws InvalidRequestConfigException If the `path` property is not set on
   * the configured [S3ObjectTagDeleteParams] instance.
   *
   * @throws ObjectNotFoundException If the target object does not exist.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun deleteObjectTags(params: S3ObjectTagDeleteParams): S3TagMap

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
  fun objectExists(path: String): Boolean

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
  fun objectExists(action: S3ObjectExistsParams.() -> Unit): Boolean

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
  fun objectExists(params: S3ObjectExistsParams): Boolean

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
  fun statObject(path: String): S3ObjectMeta

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
  fun statObject(action: S3ObjectStatParams.() -> Unit): S3ObjectMeta

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
  fun statObject(params: S3ObjectStatParams): S3ObjectMeta

  // endregion

  // region Get Object

  /**
   * Fetches a target object from this bucket and returns an object reference
   * with a stream over the contents of the remote object.
   *
   * @param path Path to the target object.
   *
   * @return An object reference to the target object, containing a stream over
   * the contents of that object.
   *
   * @throws ObjectNotFoundException If the target object does not exist.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun getObject(path: String): S3StreamObject

  /**
   * Fetches the configured target object from this bucket and returns an object
   * reference with a stream over the contents of the remote object.
   *
   * @param action Action used to configure this S3 operation.
   *
   * @return An object reference to the target object, containing a stream over
   * the contents of that object.
   *
   * @throws InvalidRequestConfigException If the `path` property is not set on
   * the [S3ObjectGetParams] instance.
   *
   * @throws ObjectNotFoundException If the target object does not exist.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun getObject(action: S3ObjectGetParams.() -> Unit): S3StreamObject

  /**
   * Fetches the configured target object from this bucket and returns an object
   * reference with a stream over the contents of the remote object.
   *
   * @param params S3 operation parameters.
   *
   * @return An object reference to the target object, containing a stream over
   * the contents of that object.
   *
   * @throws InvalidRequestConfigException If the `path` property is not set on
   * the [S3ObjectGetParams] instance.
   *
   * @throws ObjectNotFoundException If the target object does not exist.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun getObject(params: S3ObjectGetParams): S3StreamObject

  // endregion

  // region Get Object Tags

  /**
   * Fetches a map of the tags currently attached to the object at the given
   * target [path].
   *
   * @param path Path to the target object whose tags should be fetched.
   *
   * @return A map of tag keys to values for all tags attached to the target
   * object.
   *
   * @throws ObjectNotFoundException If the target object does not exist.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun getObjectTags(path: String): S3TagMap

  /**
   * Fetches a map of the tags currently attached to the object at the target
   * with the operation configured by the given action.
   *
   * @param action Action used to configure the S3 operation.
   *
   * @return A map of tag keys to values for all tags attached to the target
   * object.
   *
   * @throws InvalidRequestConfigException If the S3 operation parameters are
   * missing required fields or otherwise incorrectly configured.
   *
   * @throws ObjectNotFoundException If the target object does not exist.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun getObjectTags(action: S3ObjectTagGetParams.() -> Unit): S3TagMap

  /**
   * Fetches a map of the tags currently attached to the object at the target
   * with the operation configured by the given parameters.
   *
   * @param params S3 operation parameters.
   *
   * @return A map of tag keys to values for all tags attached to the target
   * object.
   *
   * @throws InvalidRequestConfigException If the S3 operation parameters are
   * missing required fields or otherwise incorrectly configured.
   *
   * @throws ObjectNotFoundException If the target object does not exist.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun getObjectTags(params: S3ObjectTagGetParams): S3TagMap

  // endregion

  // region Put Object Tags

  /**
   * Attaches the given key/value pairs as tags onto the target object.
   *
   * @param path Path to the target object onto which the tags should be
   * assigned.
   *
   * @param tags List of key/value pairs that will be assigned to the target
   * object.
   *
   * @throws IllegalArgumentException If any of the given pairs of tags fail
   * to meet the validation requirements outlined in the [S3Tag] documentation.
   *
   * @throws ObjectNotFoundException If the target object does not exist.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun putObjectTags(path: String, vararg tags: Pair<String, String>)

  /**
   * Attaches the given [S3Tag]s onto the target object.
   *
   * @param path Path to the target object onto which the tags should be
   * assigned.
   *
   * @param tags List of [S3Tag] pairs that will be assigned to the target
   * object.
   *
   * @throws ObjectNotFoundException If the target object does not exist.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun putObjectTags(path: String, vararg tags: S3Tag)

  /**
   * Attaches the given [S3Tag]s onto the target object.
   *
   * @param path Path to the target object onto which the tags should be
   * assigned.
   *
   * @param tags List of [S3Tag] pairs that will be assigned to the target
   * object.
   *
   * @throws ObjectNotFoundException If the target object does not exist.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun putObjectTags(path: String, tags: Iterable<S3Tag>)

  /**
   * Attaches the key/value pairs in the given map as tags onto the target
   * object.
   *
   * @param path Path to the target object onto which the tags should be
   * assigned.
   *
   * @param tags Map\ of key/value pairs that will be assigned to the target
   * object.
   *
   * @throws IllegalArgumentException If any of the key/value pairs of in the
   * given map fail to meet the validation requirements outlined in the [S3Tag]
   * documentation.
   *
   * @throws ObjectNotFoundException If the target object does not exist.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun putObjectTags(path: String, tags: Map<String, String>)

  /**
   * Attaches the configured tags to the target object.
   *
   * @param action Action used to configure the S3 operation.
   *
   * @throws InvalidRequestConfigException If the S3 operation parameters are
   * missing required fields or otherwise incorrectly configured.
   *
   * @throws ObjectNotFoundException If the target object does not exist.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun putObjectTags(action: S3ObjectTagCreateParams.() -> Unit)

  /**
   * Attaches the configured tags to the target object.
   *
   * @param params S3 operation parameters.
   *
   * @throws InvalidRequestConfigException If the S3 operation parameters are
   * missing required fields or otherwise incorrectly configured.
   *
   * @throws ObjectNotFoundException If the target object does not exist.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun putObjectTags(params: S3ObjectTagCreateParams)

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
  fun downloadObject(path: String, localFile: File): S3FileObject

  // TODO: Document me
  fun downloadObject(action: S3ObjectDownloadParams.() -> Unit): S3FileObject

  // TODO: Document me
  fun downloadObject(params: S3ObjectDownloadParams): S3FileObject

  // endregion

  // region Touch Object

  /**
   * Creates an empty object at the given [path].
   *
   * @param path Path to the empty object to create.
   *
   * @return An [S3Object] instance wrapping the created empty object.
   *
   * @throws BucketNotFoundException If this bucket no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun touchObject(path: String): S3Object

  /**
   * Creates an empty object at the target path with the operation configured
   * by the given action.
   *
   * @param action Action used to configure the S3 operation.
   *
   * @return An [S3Object] instance wrapping the created empty object.
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
  fun touchObject(action: S3ObjectTouchParams.() -> Unit): S3Object

  /**
   * Creates an empty object at the target path with the operation configured
   * by the given params.
   *
   * @param params S3 operation parameters.
   *
   * @return An [S3Object] instance wrapping the created empty object.
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
  fun touchObject(params: S3ObjectTouchParams): S3Object

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
  fun putDirectory(path: String): S3Object

  // TODO: Document me
  fun putDirectory(action: S3DirectoryCreateParams.() -> Unit): S3Object

  // TODO: Document me
  fun putDirectory(params: S3DirectoryCreateParams): S3Object

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
  fun putObject(path: String, stream: InputStream, size: Long = -1): S3Object

  // TODO: Document me
  fun putObject(action: S3StreamingObjectCreateParams.() -> Unit): S3Object

  // TODO: Document me
  fun putObject(params: S3StreamingObjectCreateParams): S3Object

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
  fun uploadFile(path: String, file: File): S3Object

  /**
   * Puts an object into this bucket at the configured path and copies the
   * contents of the given configured file into the newly created object.
   *
   * The parameters must be configured by the [action] given to this method.
   *
   * @param action Action used to configure the S3 operation parameters.
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
  fun uploadFile(action: S3FileUploadParams.() -> Unit): S3Object

  /**
   * Puts an object into this bucket at the configured path and copies the
   * contents of the given configured file into the newly created object.
   *
   * @param params S3 operation parameters.
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
  fun uploadFile(params: S3FileUploadParams): S3Object

  // endregion

  // region Delete Object

  // TODO: Document me
  fun deleteObject(path: String): Boolean

  // TODO: Document me
  fun deleteObject(action: S3ObjectDeleteParams.() -> Unit): Boolean

  // TODO: Document me
  fun deleteObject(params: S3ObjectDeleteParams): Boolean

  // endregion Delete Object

  // region Delete Objects

  // TODO: Document me
  fun deleteObjects(vararg paths: String)

  // TODO: Document me
  fun deleteObjects(paths: Iterable<String>)

  // TODO: Document me
  fun deleteObjects(action: S3MultiObjectDeleteParams.() -> Unit)

  // TODO: Document me
  fun deleteObjects(params: S3MultiObjectDeleteParams)

  // endregion Delete Objects

  // region List Objects

  // TODO: Document me
  fun listObjects(): S3ObjectList

  // TODO: Document me
  fun listObjects(action: S3ObjectListParams.() -> Unit): S3ObjectList

  // TODO: Document me
  fun listObjects(params: S3ObjectListParams): S3ObjectList

  // endregion List Objects

  // endregion Object Actions
}