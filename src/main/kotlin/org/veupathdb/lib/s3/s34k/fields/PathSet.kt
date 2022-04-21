package org.veupathdb.lib.s3.s34k.fields

/**
 * Mutable set of tag names.
 */
sealed interface PathSet : Iterable<String> {

  /**
   * Number of tags currently in this [PathSet]
   */
  val size: Int

  /**
   * Whether this [PathSet] is empty.
   */
  val isEmpty: Boolean

  /**
   * Whether this [PathSet] is not empty.
   */
  val isNotEmpty: Boolean

  /**
   * Returns a read only set containing the tag names in this [PathSet].
   */
  fun toSet(): Set<String>

  /**
   * Adds the given tags to this [PathSet].
   */
  fun addPaths(vararg paths: String)

  /**
   * Adds the tags from the [Iterable] value to this [PathSet].
   */
  fun addPaths(paths: Iterable<String>)
}