package org.veupathdb.lib.s3.s34k.fields.tags

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
   */
  fun add(tag: S3Tag)

  /**
   * Adds the given tags to this map.
   *
   * @param tags Tags to add to this map.
   */
  fun add(vararg tags: S3Tag)

  /**
   * Adds the given tags to this map.
   *
   * @param tags Tags to add to this map.
   */
  fun add(tags: Iterable<S3Tag>)

  /**
   * Adds the given tags to this map.
   *
   * @param tags Tags to add to this map.
   *
   * @throws IllegalArgumentException as per the rules outlined in the [S3Tag]
   * docs.
   */
  fun add(tags: Map<String, String>)

  /**
   * Adds the given tags to this map.
   *
   * @param tags Tags to add to this map.
   *
   * @throws IllegalArgumentException as per the rules outlined in the [S3Tag]
   * docs.
   */
  fun add(vararg tags: Pair<String, String>)

  /**
   * Sets the given values as a tag in this map.
   *
   * @param key Tag key.
   *
   * @param value Tag value.
   *
   * @throws IllegalArgumentException as per the rules outlined in the [S3Tag]
   * docs.
   */
  operator fun set(key: String, value: String)

  /**
   * Appends the given value to this map.
   *
   * @param tag Tag to add to this map.
   */
  operator fun plusAssign(tag: S3Tag)

  /**
   * Appends the given values to this map.
   *
   * @param tags Tags to add to this map.
   *
   * @throws IllegalArgumentException as per the rules outlined in the [S3Tag]
   * docs.
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
   */
  operator fun plusAssign(tag: Pair<String, String>)
}