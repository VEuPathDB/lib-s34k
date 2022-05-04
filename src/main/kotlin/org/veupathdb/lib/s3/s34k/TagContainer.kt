package org.veupathdb.lib.s3.s34k

import org.veupathdb.lib.s3.s34k.errors.BucketNotFoundError
import org.veupathdb.lib.s3.s34k.errors.ObjectNotFoundError
import org.veupathdb.lib.s3.s34k.errors.S34KError
import org.veupathdb.lib.s3.s34k.fields.S3TagMap
import org.veupathdb.lib.s3.s34k.params.tag.*

// TODO: what error should be thrown when attempting to put more than 10
//       tags via one at a time adding
@Suppress("unused")
interface TagContainer {

  // region Size

  /**
   * Fetches the number of tags currently attached to this tag container.
   *
   * @return The number of tags currently attached to this tag container.  This
   * value will be `10` at most.
   *
   * @throws ObjectNotFoundError If this [TagContainer] is an object, and that
   * object does not exist.
   *
   * @throws BucketNotFoundError If this [TagContainer] is a bucket that does
   * not exist, or if the parent bucket of this [TagContainer] does not exist.
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
  fun count(): Int

  fun count(action: TagCountParams.() -> Unit): Int

  fun count(params: TagCountParams): Int

  // endregion Size

  // region Contains

  /**
   * Tests whether this [TagContainer] contains a tag with the given key.
   *
   * @param key Key of the tag to test for.
   *
   * @return `true` if this tag container has a tag with the target key or at
   * least if the tag existed at the time of this method call.  `false` if at
   * the time of this method call, this tag container did not have a tag with
   * the target key.
   *
   * @throws ObjectNotFoundError If this [TagContainer] is an object, and that
   * object does not exist.
   *
   * @throws BucketNotFoundError If this [TagContainer] is a bucket that does
   * not exist, or if the parent bucket of this [TagContainer] does not exist.
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
  operator fun contains(key: String): Boolean

  fun contains(key: String, action: TagExistsParams.() -> Unit): Boolean

  fun contains(key: String, params: TagExistsParams): Boolean

  // endregion Contains

  // region Put

  /**
   * Puts the given key/value pair as a tag on this tag container.
   *
   * @param key Key of the tag to put.
   *
   * @param value Value of the tag to put.
   *
   * @throws IllegalArgumentException If either the key or value violate the
   * rules outlined in the [Tag] documentation.
   *
   * @throws ObjectNotFoundError If this [TagContainer] is an object, and that
   * object does not exist.
   *
   * @throws BucketNotFoundError If this [TagContainer] is a bucket that does
   * not exist, or if the parent bucket of this [TagContainer] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see set
   */
  @Throws(
    IllegalArgumentException::class,
    ObjectNotFoundError::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun put(key: String, value: String)

  /**
   * Puts the given tags onto this tag container.
   *
   * @param tags Tags to set on this tag container.  If this value is empty,
   * this method does nothing.
   *
   * @throws IllegalArgumentException If the given tag array contains more than
   * 10 values.
   *
   * @throws ObjectNotFoundError If this [TagContainer] is an object, and that
   * object does not exist.
   *
   * @throws BucketNotFoundError If this [TagContainer] is a bucket that does
   * not exist, or if the parent bucket of this [TagContainer] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    IllegalArgumentException::class,
    ObjectNotFoundError::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun put(vararg tags: Tag)

  /**
   * Puts the given tags onto this tag container.
   *
   * @param tags Tags to set on this tag container.  If this value is empty,
   * this method does nothing.
   *
   * @throws IllegalArgumentException If the given tag array contains more than
   * 10 values, or if any of the keys or values violate the rules outlined in
   * the [Tag] documentation
   *
   * @throws ObjectNotFoundError If this [TagContainer] is an object, and that
   * object does not exist.
   *
   * @throws BucketNotFoundError If this [TagContainer] is a bucket that does
   * not exist, or if the parent bucket of this [TagContainer] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    IllegalArgumentException::class,
    ObjectNotFoundError::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun put(vararg tags: Pair<String, String>)

  /**
   * Puts the given tags onto this tag container.
   *
   * @param tags Tags to set on this tag container.  If this iterable contains
   * no elements, this method does nothing.
   *
   * @throws IllegalArgumentException If the given tag iterable contains more
   * than 10 elements.
   *
   * @throws ObjectNotFoundError If this [TagContainer] is an object, and that
   * object does not exist.
   *
   * @throws BucketNotFoundError If this [TagContainer] is a bucket that does
   * not exist, or if the parent bucket of this [TagContainer] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    IllegalArgumentException::class,
    ObjectNotFoundError::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun put(tags: Iterable<Tag>)

  /**
   * Puts the given tags onto this tag container.
   *
   * @param tags Tags to set on this tag container.  If this map is empty, this
   * method does nothing.
   *
   * @throws IllegalArgumentException If the given tag map contains more than
   * 10 entries, or if any of the keys or values violate the rules outlined in
   * the [Tag] documentation
   *
   * @throws ObjectNotFoundError If this [TagContainer] is an object, and that
   * object does not exist.
   *
   * @throws BucketNotFoundError If this [TagContainer] is a bucket that does
   * not exist, or if the parent bucket of this [TagContainer] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    IllegalArgumentException::class,
    ObjectNotFoundError::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun put(tags: Map<String, String>)

  /**
   * Puts the given tags onto this tag container.
   *
   * @param tags Map of S3 tags to put on this tag container.  If this tag map
   * is empty, this method does nothing.
   *
   * @throws ObjectNotFoundError If this [TagContainer] is an object, and that
   * object does not exist.
   *
   * @throws BucketNotFoundError If this [TagContainer] is a bucket that does
   * not exist, or if the parent bucket of this [TagContainer] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun put(tags: S3TagMap)

  /**
   * Puts the configured tags onto this tag container.
   *
   * If the configured tag map is empty, this method does nothing.
   *
   * @param action Action used to configure the backing S3 operation.
   *
   * @throws ObjectNotFoundError If this [TagContainer] is an object, and that
   * object does not exist.
   *
   * @throws BucketNotFoundError If this [TagContainer] is a bucket that does
   * not exist, or if the parent bucket of this [TagContainer] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun put(action: TagPutParams.() -> Unit)

  /**
   * Puts the configured tags onto this tag container.
   *
   * If the configured tag map is empty, this method does nothing.
   *
   * @param params Parameters for the backing S3 operation.
   *
   * @throws ObjectNotFoundError If this [TagContainer] is an object, and that
   * object does not exist.
   *
   * @throws BucketNotFoundError If this [TagContainer] is a bucket that does
   * not exist, or if the parent bucket of this [TagContainer] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun put(params: TagPutParams)

  /**
   * Puts the given key/value pair as a tag on this tag container.
   *
   * @param key Key of the tag to put.
   *
   * @param value Value of the tag to put.
   *
   * @throws IllegalArgumentException If either the key or value violate the
   * rules outlined in the [Tag] documentation.
   *
   * @throws ObjectNotFoundError If this [TagContainer] is an object, and that
   * object does not exist.
   *
   * @throws BucketNotFoundError If this [TagContainer] is a bucket that does
   * not exist, or if the parent bucket of this [TagContainer] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see put
   */
  operator fun set(key: String, value: String) = put(key, value)

  // endregion Put

  // region Get

  fun getAll(): S3TagMap

  operator fun get(key: String): String?

  fun get(vararg keys: String): S3TagMap

  fun get(keys: Iterable<String>): S3TagMap

  fun get(action: TagGetParams.() -> Unit): S3TagMap

  fun get(params: TagGetParams): S3TagMap

  // endregion Get

  // region Delete

  fun delete(vararg keys: String)

  fun delete(keys: Iterable<String>)

  fun delete(action: TagDeleteParams.() -> Unit)

  fun delete(params: TagDeleteParams)

  // endregion Delete

  // region Delete All

  fun deleteAll()

  fun deleteAll(action: DeleteAllTagsParams.() -> Unit)

  fun deleteAll(params: DeleteAllTagsParams)

  // endregion Delete All
}