package org.veupathdb.lib.s3.s34k

import org.veupathdb.lib.s3.s34k.params.TagPutParams
import org.veupathdb.lib.s3.s34k.params.`object`.ObjectTagGetParams

// TODO: Document me
interface S3Object : S3ObjectResponse {

  // TODO: Document me
  fun getTags(): S3TagSet

  // TODO: Document me
  fun getTags(params: ObjectTagGetParams): S3TagSet

  // TODO: Document me
  fun getTags(action: ObjectTagGetParams.() -> Unit): S3TagSet

  // TODO: Document me
  fun setTag(key: String, value: String)

  // TODO: Document me
  fun setTags(tags: Map<String, String>)

  // TODO: Document me
  fun setTags(tags: Collection<S3Tag>)

  // TODO: Document me
  fun setTags(vararg tags: S3Tag)

  // TODO: Document me
  fun setTags(params: TagPutParams)

  // TODO: Document me
  fun setTags(action: TagPutParams.() -> Unit)
}