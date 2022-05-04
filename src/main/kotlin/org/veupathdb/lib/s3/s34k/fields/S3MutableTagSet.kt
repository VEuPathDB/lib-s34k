package org.veupathdb.lib.s3.s34k.fields

/**
 * Mutable set of tag names.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3MutableTagSet : S3TagSet {

  /**
   * Adds the given tag to this [S3MutableTagSet].
   *
   * @throws IllegalArgumentException if the given tag name is greater than 128
   * characters in length.
   */
  fun add(tag: String)

  /**
   * Adds the given tags to this [S3MutableTagSet].
   *
   * @throws IllegalArgumentException if any of the given tag names are greater
   * than 128 characters in length.
   */
  fun add(vararg tags: String)

  /**
   * Adds the tags from the [Iterable] value to this [S3MutableTagSet].
   *
   * @throws IllegalArgumentException if any of the given tag names are greater
   * than 128 characters in length.
   */
  fun add(tags: Iterable<String>)

  /**
   * Adds the given tag to this [S3MutableTagSet].
   *
   * @throws IllegalArgumentException if the given tag name is greater than 128
   * characters in length.
   */
  operator fun plusAssign(tag: String)

  fun toImmutable(): S3TagSet
}