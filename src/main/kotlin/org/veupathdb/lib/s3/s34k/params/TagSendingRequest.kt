package org.veupathdb.lib.s3.s34k.params

import org.veupathdb.lib.s3.s34k.fields.tags.TagMap

/**
 * Base interface for S3 operation configurations that can send tags to the S3
 * server along with the put operation.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface TagSendingRequest {

  /**
   * Tags that will be attached to the object being put into the S3 store.
   */
  val tags: TagMap
}