package org.veupathdb.lib.s3.s34k.params

import org.veupathdb.lib.s3.s34k.fields.tags.TagMap
import org.veupathdb.lib.s3.s34k.fields.tags.TagMapImpl
import org.veupathdb.lib.s3.s34k.params.bucket.BucketTagPutParams
import org.veupathdb.lib.s3.s34k.`object`.request.ObjectTagPutParams

/**
 * Generic Tag Put Operation Parameters
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class TagPutParams(var callback: (() -> Unit)? = null) : TagSendingRequest, RegionRequest() {

  override val tags: TagMap = TagMapImpl()

  fun toObjectTagPutParams(path: String) =
    ObjectTagPutParams(path, region, tags, callback, headers, queryParams)

  fun toBucketTagPutParams() =
    BucketTagPutParams(region, tags, callback, headers, queryParams)
}