package org.veupathdb.lib.s3.s34k.params

import org.veupathdb.lib.s3.s34k.fields.tags.TagSet

/**
 * Tag Deleter
 *
 * Represents the tag deletion methods on any [TagDeleteRequest] implementation.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface TagDeleteRequest {

  /**
   * Set of tags to delete from the target bucket.
   *
   * If [allTags] is `true`, this set will be ignored.
   *
   * If [allTags] is `false`, only the tags in this set will be deleted.  If
   * this list is empty, nothing will be deleted.
   */
  val tags: TagSet

  /**
   * Whether all tags should be deleted from the target bucket.
   *
   * If set to `true` the value of [tags] will be ignored.
   */
  var allTags: Boolean
}