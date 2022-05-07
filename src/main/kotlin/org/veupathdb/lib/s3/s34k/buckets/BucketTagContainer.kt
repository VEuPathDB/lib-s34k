package org.veupathdb.lib.s3.s34k.buckets

import org.veupathdb.lib.s3.s34k.Tag
import org.veupathdb.lib.s3.s34k.errors.BucketNotFoundError
import org.veupathdb.lib.s3.s34k.errors.S34KError
import org.veupathdb.lib.s3.s34k.fields.TagMap
import org.veupathdb.lib.s3.s34k.params.bucket.tag.TargetedBucketTagDeleteParams
import org.veupathdb.lib.s3.s34k.params.tag.*

@Suppress("unused")
interface BucketTagContainer {

  // region Size

  /**
   * Fetches the number of tags currently attached to this tag container.
   *
   * @return The number of tags currently attached to this tag container.  This
   * value will be `10` at most.
   *
   * @throws BucketNotFoundError If this [S3Bucket] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun count(): Int

  /**
   * Fetches the number of tags currently attached to this tag container.
   *
   * @param action Action used to configure this operation.
   *
   * @return The number of tags currently attached to this tag container.  This
   * value will be `10` at most.
   *
   * @throws BucketNotFoundError If this [S3Bucket] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun count(action: TagCountParams.() -> Unit): Int

  /**
   * Fetches the number of tags currently attached to this tag container.
   *
   * @param params Parameters used to configure this operation.
   *
   * @return The number of tags currently attached to this tag container.  This
   * value will be `10` at most.
   *
   * @throws BucketNotFoundError If this [S3Bucket] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun count(params: TagCountParams): Int

  // endregion Size

  // region Contains

  /**
   * Tests whether this [BucketTagContainer] contains a tag with the given key.
   *
   * @param key Key of the tag to test for.
   *
   * @return `true` if this tag container has a tag with the target key or at
   * least if the tag existed at the time of this method call.  `false` if at
   * the time of this method call, this tag container did not have a tag with
   * the target key.
   *
   * @throws BucketNotFoundError If this [S3Bucket] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    BucketNotFoundError::class,
    S34KError::class,
  )
  operator fun contains(key: String): Boolean

  /**
   * Tests whether this [BucketTagContainer] contains a tag with the given key.
   *
   * @param key Key of the tag to test for.
   *
   * @param action Action used to configure this operation.
   *
   * @return `true` if this tag container has a tag with the target key or at
   * least if the tag existed at the time of this method call.  `false` if at
   * the time of this method call, this tag container did not have a tag with
   * the target key.
   *
   * @throws BucketNotFoundError If this [S3Bucket] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun contains(key: String, action: TagExistsParams.() -> Unit): Boolean

  /**
   * Tests whether this [BucketTagContainer] contains a tag with the given key.
   *
   * @param key Key of the tag to test for.
   *
   * @param params Parameters used to configure this operation.
   *
   * @return `true` if this tag container has a tag with the target key or at
   * least if the tag existed at the time of this method call.  `false` if at
   * the time of this method call, this tag container did not have a tag with
   * the target key.
   *
   * @throws BucketNotFoundError If this [S3Bucket] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    BucketNotFoundError::class,
    S34KError::class,
  )
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
   * @throws BucketNotFoundError If this [BucketTagContainer] is a bucket that
   * does not exist, or if the parent bucket of this [BucketTagContainer] does
   * not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see set
   */
  @Throws(
    IllegalArgumentException::class,
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
   * @throws BucketNotFoundError If this [S3Bucket] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    IllegalArgumentException::class,
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
   * @throws BucketNotFoundError If this [S3Bucket] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    IllegalArgumentException::class,
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
   * @throws BucketNotFoundError If this [S3Bucket] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    IllegalArgumentException::class,
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
   * @throws BucketNotFoundError If this [S3Bucket] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    IllegalArgumentException::class,
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
   * @throws BucketNotFoundError If this [S3Bucket] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun put(tags: TagMap)

  /**
   * Puts the configured tags onto this tag container.
   *
   * If the configured tag map is empty, this method does nothing.
   *
   * @param action Action used to configure the backing S3 operation.
   *
   * @throws BucketNotFoundError If this [S3Bucket] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun put(action: TagPutParams.() -> Unit)

  /**
   * Puts the configured tags onto this tag container.
   *
   * If the configured tag map is empty, this method does nothing.
   *
   * @param params Parameters for the backing S3 operation.
   *
   * @throws BucketNotFoundError If this [S3Bucket] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    BucketNotFoundError::class,
    S34KError::class,
  )
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
   * @throws BucketNotFoundError If this [S3Bucket] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   *
   * @see put
   */
  @Throws(
    BucketNotFoundError::class,
    S34KError::class,
  )
  operator fun set(key: String, value: String) = put(key, value)

  // endregion Put

  // region Get

  /**
   * Gets all tags currently attached to this [S3Bucket].
   *
   * @return A [TagMap] containing all the tags attached to this [S3Bucket].
   *
   * @throws BucketNotFoundError If this [S3Bucket] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun getAll(): TagMap

  /**
   * Gets the target tag from this [S3Bucket].
   *
   * @param key Key of the tag to fetch.
   *
   * @return The value of the target key, if such a key exists, otherwise
   * `null`.
   *
   * @throws IllegalArgumentException If the given [key] violates the rules
   * outlined in the [Tag] documentation.
   *
   * @throws BucketNotFoundError If this [S3Bucket] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    IllegalArgumentException::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  operator fun get(key: String): String?

  /**
   * Gets the target tags from this [S3Bucket].
   *
   * @param keys Keys of the tags to fetch.
   *
   * @return A tag map containing only the specified tags that exist on the
   * target [S3Bucket].
   *
   * @throws IllegalArgumentException If any of the given [keys] violate the
   * rules outlined in the [Tag] documentation.
   *
   * @throws BucketNotFoundError If this [S3Bucket] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    IllegalArgumentException::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun get(vararg keys: String): TagMap

  /**
   * Gets the target tags from this [S3Bucket].
   *
   * @param keys Keys of the tags to fetch.
   *
   * @return A tag map containing only the specified tags that exist on the
   * target [S3Bucket].
   *
   * @throws IllegalArgumentException If any of the given [keys] violate the
   * rules outlined in the [Tag] documentation.
   *
   * @throws BucketNotFoundError If this [S3Bucket] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    IllegalArgumentException::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun get(keys: Iterable<String>): TagMap

  /**
   * Gets the target tags from this [S3Bucket].
   *
   * @param action Action used to configure this operation.
   *
   * @return A tag map containing only the specified tags that exist on the
   * target [S3Bucket].
   *
   * @throws BucketNotFoundError If this [S3Bucket] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun get(action: TagGetParams.() -> Unit): TagMap

  /**
   * Gets the target tags from this [S3Bucket].
   *
   * @param params Parameters used to configure this operation.
   *
   * @return A tag map containing only the specified tags that exist on the
   * target [S3Bucket].
   *
   * @throws BucketNotFoundError If this [S3Bucket] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun get(params: TagGetParams): TagMap

  // endregion Get

  // region Delete

  /**
   * Deletes the target tags from this [S3Bucket].
   *
   * @param keys Keys of the target tags to delete.
   *
   * @throws IllegalArgumentException If any of the given [keys] violate the
   * rules outlined in the [Tag] documentation.
   *
   * @throws BucketNotFoundError If this [S3Bucket] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    IllegalArgumentException::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun delete(vararg keys: String)

  /**
   * Deletes the target tags from this [S3Bucket].
   *
   * @param keys Keys of the target tags to delete.
   *
   * @throws IllegalArgumentException If any of the given [keys] violate the
   * rules outlined in the [Tag] documentation.
   *
   * @throws BucketNotFoundError If this [S3Bucket] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    IllegalArgumentException::class,
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun delete(keys: Iterable<String>)

  /**
   * Deletes the target tags from this [S3Bucket].
   *
   * @param action Action used to configure this operation.
   *
   * @throws BucketNotFoundError If this [S3Bucket] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun delete(action: TargetedBucketTagDeleteParams.() -> Unit)

  /**
   * Deletes the target tags from this [S3Bucket].
   *
   * @param params Parameters used to configure this operation.
   *
   * @throws BucketNotFoundError If this [S3Bucket] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun delete(params: TargetedBucketTagDeleteParams)

  // endregion Delete

  // region Delete All

  /**
   * Deletes all tags currently attached to this bucket.
   *
   * @throws BucketNotFoundError If this [S3Bucket] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun deleteAll()

  /**
   * Deletes all tags currently attached to this bucket.
   *
   * @param action Action used to configure this operation.
   *
   * @throws BucketNotFoundError If this [S3Bucket] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun deleteAll(action: DeleteAllTagsParams.() -> Unit)

  /**
   * Deletes all tags currently attached to this bucket.
   *
   * @param params Parameters used to configure this operation.
   *
   * @throws BucketNotFoundError If this [S3Bucket] does not exist.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(
    BucketNotFoundError::class,
    S34KError::class,
  )
  fun deleteAll(params: DeleteAllTagsParams)

  // endregion Delete All
}