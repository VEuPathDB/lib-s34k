package org.veupathdb.lib.s3.s34k.params.tag

import org.veupathdb.lib.s3.s34k.fields.MutableHeaders
import org.veupathdb.lib.s3.s34k.fields.MutableQueryParams
import org.veupathdb.lib.s3.s34k.fields.MutableTagSet
import org.veupathdb.lib.s3.s34k.params.RegionRequestParams

/**
 * # Targeted Tag Delete Operation
 *
 * Parameters for a targeted tag deletion, i.e. a deletion of only specific
 * target tags.
 *
 * This is a 'complex operation' in that it happens in 3 phases:
 *
 * 1. Fetch all tags currently attached to the target bucket/object.
 * 2. Delete all tags currently attached to the target bucket/object.
 * 3. Re-attach the non-delete-target tags to the target bucket/object.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface TagDeleteParams : RegionRequestParams {

  /**
   * Set of tags to delete from the target bucket.
   */
  val tags: MutableTagSet

  /**
   * Global headers that will be used in all phases of this operation.
   */
  override val headers: MutableHeaders

  /**
   * Global query params that will be used in all phases of this operation.
   */
  override val queryParams: MutableQueryParams

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   */
  var callback: (() -> Unit)?

  /**
   * Parameters specific to the tag fetch phase of this operation.
   */
  val fetchParams: TagDeleteFetchParams

  /**
   * Parameters specific to the tag delete phase of this operation.
   */
  val deleteParams: TagDeleteDeleteParams

  /**
   * Parameters specific to the tag put phase of this operation.
   */
  val putParams: TagDeletePutParams

}