package org.veupathdb.lib.s3.s34k.params

/**
 * Tag Deleter
 *
 * Represents the tag deletion methods on any [TagDeleter] implementation.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface TagDeleter {

  /**
   * Set of tags to delete from the target bucket.
   *
   * If [allTags] is `true`, this set will be ignored.
   *
   * If [allTags] is `false`, only the tags in this set will be deleted.  If
   * this list is empty, nothing will be deleted.
   */
  val tags: Set<String>

  /**
   * Whether all tags should be deleted from the target bucket.
   *
   * If set to `true` the value of [tags] will be ignored.
   */
  var allTags: Boolean

  /**
   * Adds the given [tag] to the [tags] set.
   *
   * @param tag Tag name to add.
   */
  fun addTag(tag: String)

  /**
   * Adds the given [tags] to the [tags] set.
   *
   * @param tags Tag names to add.
   */
  fun addTags(vararg tags: String)

  /**
   * Adds the given [tags] to the [tags] set.
   *
   * @param tags Tag names to add.
   */
  fun addTags(tags: Iterable<String>)
}