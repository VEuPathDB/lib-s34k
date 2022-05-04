package org.veupathdb.lib.s3.s34k.fields

import org.veupathdb.lib.s3.s34k.S3Tag

/**
 * Mutable map of [S3Tag] instances.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3MutableTagMap : S3TagMap {

  /**
   * Adds the single given tag to this map.
   *
   * @param tag Tag to add to this map.
   *
   * @throws IllegalStateException If adding this new tag would increase the
   * number of tags in this tag map to a value greater than 10.
   */
  fun add(tag: S3Tag)

  /**
   * Adds the given tags to this map.
   *
   * @param tags Tags to add to this map.
   *
   * @throws IllegalArgumentException If the given array of tags contains more
   * than 10 elements.
   *
   * @throws IllegalStateException If adding these new tags would increase the
   * number of tags in this tag map to a value greater than 10.
   */
  fun add(vararg tags: S3Tag)

  /**
   * Adds the given tags to this map.
   *
   * @param tags Tags to add to this map.
   *
   * @throws IllegalArgumentException If the given iterable of tags contains
   * more than 10 elements.
   *
   * @throws IllegalStateException If adding these new tags would increase the
   * number of tags in this tag map to a value greater than 10.
   */
  fun add(tags: Iterable<S3Tag>)

  /**
   * Adds the given tags to this map.
   *
   * @param tags Tags to add to this map.
   *
   * @throws IllegalArgumentException as per the rules outlined in the [S3Tag]
   * docs.
   *
   * @throws IllegalArgumentException If the given map of tags contains more
   * than 10 elements.
   *
   * @throws IllegalStateException If adding these new tags would increase the
   * number of tags in this tag map to a value greater than 10.
   */
  fun add(tags: Map<String, String>)

  /**
   * Adds the given tags to this map.
   *
   * @param tags Tags to add to this map.
   *
   * @throws IllegalArgumentException as per the rules outlined in the [S3Tag]
   * docs.
   *
   * @throws IllegalArgumentException If the given array of tags contains more
   * than 10 elements.
   *
   * @throws IllegalStateException If adding these new tags would increase the
   * number of tags in this tag map to a value greater than 10.
   */
  fun add(vararg tags: Pair<String, String>)

  /**
   * Adds the given key/value pair as a tag to this map.
   *
   * @param key Key for this tag.
   *
   * @param value Value for this tag.
   *
   * @throws IllegalArgumentException as per the rules outlined in the [S3Tag]
   * docs.
   *
   * @throws IllegalArgumentException If the given array of tags contains more
   * than 10 elements.
   *
   * @throws IllegalStateException If adding these new tags would increase the
   * number of tags in this tag map to a value greater than 10.
   *
   * @see set
   */
  fun add(key: String, value: String)

  /**
   * Sets the given values as a tag in this map.
   *
   * @param key Tag key.
   *
   * @param value Tag value.
   *
   * @throws IllegalArgumentException as per the rules outlined in the [S3Tag]
   * docs.
   *
   * @throws IllegalStateException If adding these new tags would increase the
   * number of tags in this tag map to a value greater than 10.
   *
   * @see add
   */
  operator fun set(key: String, value: String) = add(key, value)

  /**
   * Appends the given value to this map.
   *
   * @param tag Tag to add to this map.
   *
   * @throws IllegalStateException If adding these new tags would increase the
   * number of tags in this tag map to a value greater than 10.
   */
  operator fun plusAssign(tag: S3Tag)

  /**
   * Appends the given values to this map.
   *
   * @param tags Tags to add to this map.
   *
   * @throws IllegalArgumentException as per the rules outlined in the [S3Tag]
   * docs.
   *
   * @throws IllegalArgumentException If the given map of tags contains more
   * than 10 elements.
   *
   * @throws IllegalStateException If adding these new tags would increase the
   * number of tags in this tag map to a value greater than 10.
   */
  operator fun plusAssign(tags: Map<String, String>)

  /**
   * Appends the given value to this map.
   *
   * Usage:
   * ```
   * map += "foo" to "bar"
   * ```
   *
   * @param tag Tag to add to this map.
   *
   * @throws IllegalArgumentException as per the rules outlined in the [S3Tag]
   * docs.
   *
   * @throws IllegalStateException If adding these new tags would increase the
   * number of tags in this tag map to a value greater than 10.
   */
  operator fun plusAssign(tag: Pair<String, String>)

  fun toImmutable(): S3TagMap
}