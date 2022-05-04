package org.veupathdb.lib.s3.s34k.params

import org.veupathdb.lib.s3.s34k.fields.S3MutableTagMap
import org.veupathdb.lib.s3.s34k.fields.S3TagMap

/**
 * Base interface for S3 operation configurations that can send tags to the S3
 * server along with the put operation.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3TagCreateParams : S3RegionRequestParams {

  /**
   * Tags that will be attached to the target object.
   */
  val tags: S3MutableTagMap

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed an [S3TagMap] instance containing all the tags
   * that were attached to the S3 target.
   */
  var callback: ((tags: S3TagMap) -> Unit)?
}