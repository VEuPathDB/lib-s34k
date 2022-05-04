package org.veupathdb.lib.s3.s34k.params.`object`

import org.veupathdb.lib.s3.s34k.fields.MutableTagMap
import org.veupathdb.lib.s3.s34k.params.RegionRequestParams

/**
 * Parameter base for S3 object write operations.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface ObjectWriteParams : RegionRequestParams {
  /**
   * Tags that will be attached to the target object.
   */
  val tags: MutableTagMap
}