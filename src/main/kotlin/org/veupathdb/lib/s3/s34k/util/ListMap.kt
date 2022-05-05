package org.veupathdb.lib.s3.s34k.util

import java.util.stream.Stream

/**
 * Immutable map of keys to lists of values.
 *
 * Implementations of this interface should be thread safe.
 *
 * @param K Type of the keys in this [ListMap]
 *
 * @param V Type of the values in the lists in this [ListMap]
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since  v0.3.0
 */
interface ListMap<K, V> : Iterable<Pair<K, List<V>>> {

  /**
   * Number of lists in this [ListMap].
   */
  val size: UInt

  /**
   * Total number of values in all lists in this [ListMap].
   */
  val totalSize: UInt

  /**
   * Whether this [ListMap] is empty.
   */
  val isEmpty: Boolean

  /**
   * Whether this [ListMap] is not empty.
   */
  val isNotEmpty: Boolean

  /**
   * Retrieves the list of values at the given [key] in this [ListMap].
   *
   * If the given [key] does not exist in this map, `null` will be returned.
   */
  operator fun get(key: K): List<V>?

  /**
   * Tests whether this [ListMap] contains the given [key].
   *
   * @return Whether this map contains the given [key].
   */
  operator fun contains(key: K): Boolean

  fun toMap(): Map<K, List<V>>

  fun stream(): Stream<Pair<K, List<V>>>
}