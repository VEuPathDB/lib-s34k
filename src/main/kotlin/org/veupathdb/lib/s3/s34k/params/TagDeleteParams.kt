package org.veupathdb.lib.s3.s34k.params

import org.veupathdb.lib.s3.s34k.S3TagSet
import org.veupathdb.lib.s3.s34k.fields.tags.TagSet
import org.veupathdb.lib.s3.s34k.fields.tags.TagSetImpl
import org.veupathdb.lib.s3.s34k.request.bucket.BucketTagDeleteParams
import org.veupathdb.lib.s3.s34k.request.`object`.ObjectTagDeleteParams

class TagDeleteParams(var callback: ((S3TagSet) -> Unit)? = null)
  : TagDeleteRequest
  , RegionRequest()
{
  override val tags: TagSet = TagSetImpl()

  override var allTags = false

  fun toBucketTagDeleteParams() =
    BucketTagDeleteParams(region, tags, allTags, callback, headers, queryParams)

  fun toObjectTagDeleteParams(path: String) =
    ObjectTagDeleteParams(path, region, tags, allTags, callback, headers, queryParams)
}