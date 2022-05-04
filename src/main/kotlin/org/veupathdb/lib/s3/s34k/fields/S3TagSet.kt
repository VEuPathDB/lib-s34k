package org.veupathdb.lib.s3.s34k.fields

/**
 * Set of tag names.
 *
 * Generally used for tag delete requests, but may be used for other operations
 * as well.
 *
 * @see S3MutableTagSet
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since  v0.1.0
 */
interface S3TagSet : Iterable<String> {

  /**
   * Number of tags currently in this [S3TagSet]
   */
  val size: Int

  /**
   * Whether this [S3TagSet] is empty.
   */
  val isEmpty: Boolean

  /**
   * Whether this [S3TagSet] is not empty.
   */
  val isNotEmpty: Boolean

  /**
   * Returns a read only set containing the tag names in this [S3TagSet].
   *
   * @return Set of the tag names in this [S3TagSet].
   */
  fun toSet(): Set<String>

  /**
   * Returns a read only list containing the tag names in this
   * [S3TagSet].
   *
   * The order of the values in this list is not guaranteed.
   *
   * @return List of the tag names in this [S3TagSet].
   */
  fun toList(): List<String>

  operator fun contains(tag: String): Boolean
}