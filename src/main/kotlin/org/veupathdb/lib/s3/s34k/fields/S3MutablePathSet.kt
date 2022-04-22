package org.veupathdb.lib.s3.s34k.fields

interface S3MutablePathSet : S3PathSet {

  fun add(path: String)

  /**
   * Adds the given tags to this [S3PathSet].
   */
  fun add(vararg paths: String)

  /**
   * Adds the tags from the [Iterable] value to this [S3PathSet].
   */
  fun add(paths: Iterable<String>)

  operator fun plusAssign(path: String)
}