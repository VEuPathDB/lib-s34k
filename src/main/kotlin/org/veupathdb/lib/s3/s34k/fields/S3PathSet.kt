package org.veupathdb.lib.s3.s34k.fields

/**
 * Set of object names.
 */
interface S3PathSet : Iterable<String> {

  /**
   * Number of paths currently in this [S3PathSet]
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
   * Returns a read only set containing the paths in this [S3PathSet].
   */
  fun toSet(): Set<String>

  fun toList(): List<String>

  operator fun contains(path: String): Boolean
}