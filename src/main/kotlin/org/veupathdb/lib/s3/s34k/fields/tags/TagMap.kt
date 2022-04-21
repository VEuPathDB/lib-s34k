package org.veupathdb.lib.s3.s34k.fields.tags

import org.veupathdb.lib.s3.s34k.S3Tag

// TODO: Document me
sealed interface TagMap : Iterable<S3Tag> {

  /**
   * Number of tag pairs currently in this [TagMap]
   */
  val size: Int

  /**
   * Whether this [TagMap] is empty.
   */
  val isEmpty: Boolean

  /**
   * Whether this [TagMap] is not empty.
   */
  val isNotEmpty: Boolean

  // TODO: Document me
  fun toMap(): Map<String, String>

  // TODO: Document me
  fun toSet(): Set<S3Tag>

  // TODO: Document me
  fun addTag(key: String, value: String)

  // TODO: Document me
  fun addTag(tag: S3Tag)

  // TODO: Document me
  fun addTags(vararg tags: S3Tag)

  // TODO: Document me
  fun addTags(tags: Iterable<S3Tag>)

  // TODO: Document me
  fun addTags(tags: Map<String, String>)

  // TODO: Document me
  fun addTags(vararg tags: Pair<String, String>)
}