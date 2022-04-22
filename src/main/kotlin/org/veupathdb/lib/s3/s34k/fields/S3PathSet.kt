package org.veupathdb.lib.s3.s34k.fields

/**
 * Mutable set of tag names.
 */
interface S3PathSet : Iterable<String> {

  /**
   * Number of tags currently in this [S3PathSet]
   */
  val size: Int

  /**
   * Whether this [S3PathSet] is empty.
   */
  val isEmpty: Boolean

  /**
   * Whether this [S3PathSet] is not empty.
   */
  val isNotEmpty: Boolean

  /**
   * Returns a read only set containing the tag names in this [S3PathSet].
   */
  fun toSet(): Set<String>

  fun toList(): List<String>

  operator fun contains(path: String): Boolean
}