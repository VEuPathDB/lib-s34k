package org.veupathdb.lib.s3.s34k.params.bucket

import org.veupathdb.lib.s3.s34k.S3Tag
import org.veupathdb.lib.s3.s34k.params.AbstractRequestParams
import org.veupathdb.lib.s3.s34k.params.TagSenderParams

class BucketTagPutParams(var callback: (() -> Unit)? = null)
  : TagSenderParams, AbstractRequestParams()
{
  override val tags: Set<S3Tag> = HashSet()

  override fun addTags(tags: Map<String, String>) {
    tags.forEach { (k, v) -> (this.tags as MutableSet).add(S3Tag(k, v)) }
  }

  override fun addTags(vararg tags: S3Tag) {
    (this.tags as MutableSet).addAll(tags)
  }

  override fun addTags(tags: Collection<S3Tag>) {
    (this.tags as MutableSet).addAll(tags)
  }

  override fun addTag(key: String, value: String) {
    (this.tags as MutableSet).add(S3Tag(key, value))
  }
}