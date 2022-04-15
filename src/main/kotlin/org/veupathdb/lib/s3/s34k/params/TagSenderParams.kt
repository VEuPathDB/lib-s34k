package org.veupathdb.lib.s3.s34k.params

import org.veupathdb.lib.s3.s34k.S3Tag

// TODO: Document me
interface TagSenderParams {

  /**
   * Tags that will be attached to the object being put into the S3 store.
   */
  val tags: Set<S3Tag>

  /**
   * Adds/overwrites the tags in the existing [ObjectPutRequestParams.tags] [Set] with the
   * values contained in the given [tags] [Map].
   *
   * Each entry in the input map will be converted into an [S3Tag] instance and
   * put into the [Set] of tags attached to this request.
   *
   * @param tags Map of tags to set on this request.
   */
  fun addTags(tags: Map<String, String>)

  /**
   * Adds/overwrites the tags in the existing [ObjectPutRequestParams.tags] [Set] with the
   * values contained in the given [tags] array.
   *
   * @param tags Array of tags to set on this request.
   */
  fun addTags(vararg tags: S3Tag)

  /**
   * Adds/overwrites the tags in the existing [ObjectPutRequestParams.tags] [Set] with the
   * values contained in the given [tags] [Collection].
   *
   * @param tags Collection of tags to set on this request.
   */
  fun addTags(tags: Collection<S3Tag>)

  /**
   * Adds/overwrites a single tag in the [tags] set on this request.
   *
   * The input values will be converted to an [S3Tag] instance.
   *
   * @param key Key of the tag to set.
   *
   * @param value Value of the tag to set.
   */
  fun addTag(key: String, value: String)
}