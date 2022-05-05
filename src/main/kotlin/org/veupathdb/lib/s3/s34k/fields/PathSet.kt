package org.veupathdb.lib.s3.s34k.fields

import java.util.stream.Stream

/**
 * Set of object names.
 */
interface PathSet : Iterable<String> {

  /**
   * Number of paths currently in this [PathSet]
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
   * Returns a read only set containing the paths in this [PathSet].
   */
  fun toSet(): Set<String>

  fun toList(): List<String>

  fun stream(): Stream<String>

  operator fun contains(path: String): Boolean
}