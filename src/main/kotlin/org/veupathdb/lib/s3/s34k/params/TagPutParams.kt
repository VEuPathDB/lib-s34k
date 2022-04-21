package org.veupathdb.lib.s3.s34k.params

import org.veupathdb.lib.s3.s34k.request.bucket.BucketTagPutParams
import org.veupathdb.lib.s3.s34k.fields.tags.TagMap
import org.veupathdb.lib.s3.s34k.fields.tags.TagMapImpl
import org.veupathdb.lib.s3.s34k.request.`object`.ObjectTagPutParams

/**
 * Generic Tag Put Operation Parameters
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class TagPutParams(
  region: String? = null,
  var callback: (() -> Unit)? = null
) : TagSendingRequest, RegionRequest(region) {

  override val tags: TagMap = TagMapImpl()

  fun toObjectTagPutParams(path: String) =
    ObjectTagPutParams(path, region, tags, callback, headers, queryParams)

  fun toBucketTagPutParams() =
    BucketTagPutParams(region, tags, callback, headers, queryParams)
}