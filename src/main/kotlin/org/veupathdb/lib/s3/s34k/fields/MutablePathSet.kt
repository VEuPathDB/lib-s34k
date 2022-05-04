package org.veupathdb.lib.s3.s34k.fields

interface MutablePathSet : PathSet {

  fun add(path: String)

  /**
   * Adds the given tags to this [PathSet].
   */
  fun add(vararg paths: String)

  /**
   * Adds the tags from the [Iterable] value to this [PathSet].
   */
  fun add(paths: Iterable<String>)

  operator fun plusAssign(path: String)

  /**
   * Returns an immutable [PathSet] copy of this [MutablePathSet] instance.
   *
   * @return A new [PathSet] copy of this object.
   */
  fun toImmutable(): PathSet
}