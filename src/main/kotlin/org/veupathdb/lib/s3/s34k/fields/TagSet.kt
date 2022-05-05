package org.veupathdb.lib.s3.s34k.fields

import java.util.stream.Stream

/**
 * Set of tag names.
 *
 * Generally used for tag delete requests, but may be used for other operations
 * as well.
 *
 * @see MutableTagSet
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since  v0.1.0
 */
interface TagSet : Iterable<String> {

  /**
   * Number of tags currently in this [TagSet]
   */
  val size: Int

  /**
   * Whether this [TagSet] is empty.
   */
  val isEmpty: Boolean

  /**
   * Whether this [TagSet] is not empty.
   */
  val isNotEmpty: Boolean

  /**
   * Returns a read only set containing the tag names in this [TagSet].
   *
   * @return Set of the tag names in this [TagSet].
   */
  fun toSet(): Set<String>

  /**
   * Returns a read only list containing the tag names in this
   * [TagSet].
   *
   * The order of the values in this list is not guaranteed.
   *
   * @return List of the tag names in this [TagSet].
   */
  fun toList(): List<String>

  /**
   * Returns a stream over the contents of this [TagSet].
   *
   * @return A stream over the contents of this [TagSet].
   */
  fun stream(): Stream<String>

  operator fun contains(tag: String): Boolean
}