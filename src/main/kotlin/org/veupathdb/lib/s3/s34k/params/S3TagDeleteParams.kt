package org.veupathdb.lib.s3.s34k.params

import org.veupathdb.lib.s3.s34k.fields.S3MutableTagSet

/**
 * Tag Deleter
 *
 * Represents the tag deletion methods on any [S3TagDeleteParams] implementation.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3TagDeleteParams : S3RegionRequestParams {

  /**
   * Set of tags to delete from the target bucket.
   *
   * If [allTags] is `true`, this set will be ignored.
   *
   * If [allTags] is `false`, only the tags in this set will be deleted.  If
   * this list is empty, nothing will be deleted.
   */
  val tags: S3MutableTagSet

  /**
   * Whether all tags should be deleted from the target bucket.
   *
   * If set to `true` the value of [tags] will be ignored.
   *
   * If set to `false` only the tags specified in [tags] will be deleted.
   *
   * Default is `false`
   */
  var allTags: Boolean

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   */
  var callback: (() -> Unit)?
}