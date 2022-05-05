package org.veupathdb.lib.s3.s34k.fields

/**
 * Mutable set of object names.
 *
 * Implementations of this interface should be thread safe.
 *
 * @see PathSet
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since  v0.1.0
 */
interface MutablePathSet : PathSet {

  fun add(path: String)

  /**
   * Adds the given paths to this [MutablePathSet].
   */
  fun add(vararg paths: String)

  /**
   * Adds the paths from the [Iterable] value to this [MutablePathSet].
   */
  fun add(paths: Iterable<String>)

  /**
   * Adds the given path to this [MutablePathSet].
   */
  operator fun plusAssign(path: String)

  /**
   * Returns an immutable [PathSet] copy of this [MutablePathSet] instance.
   *
   * @return A new [PathSet] copy of this object.
   */
  fun toImmutable(): PathSet
}