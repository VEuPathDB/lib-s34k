package org.veupathdb.lib.s3.s34k.fields.tags

/**
 * Mutable set of tag names.
 */
sealed interface TagSet : Iterable<String> {

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
   */
  fun toSet(): Set<String>

  /**
   * Adds the given tags to this [TagSet].
   */
  fun addTags(vararg tags: String)

  /**
   * Adds the tags from the [Iterable] value to this [TagSet].
   */
  fun addTags(tags: Iterable<String>)
}