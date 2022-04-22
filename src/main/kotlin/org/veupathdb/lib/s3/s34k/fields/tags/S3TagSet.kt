package org.veupathdb.lib.s3.s34k.fields.tags

interface S3TagSet : Iterable<String> {

  /**
   * Number of tags currently in this [S3MutableTagSet]
   */
  val size: Int

  /**
   * Whether this [S3MutableTagSet] is empty.
   */
  val isEmpty: Boolean

  /**
   * Whether this [S3MutableTagSet] is not empty.
   */
  val isNotEmpty: Boolean

  /**
   * Returns a read only set containing the tag names in this [S3MutableTagSet].
   *
   * @return Set of the tag names in this [S3TagSet].
   */
  fun toSet(): Set<String>

  /**
   * Returns a read only list containing the tag names in this
   * [S3MutableTagSet].
   *
   * The order of the values in this list is not guaranteed.
   *
   * @return List of the tag names in this [S3TagSet].
   */
  fun toList(): List<String>

  operator fun contains(tag: String): Boolean
}