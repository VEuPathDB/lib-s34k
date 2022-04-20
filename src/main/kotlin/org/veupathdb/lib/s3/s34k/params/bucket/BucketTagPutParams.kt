package org.veupathdb.lib.s3.s34k.params.bucket

import org.slf4j.LoggerFactory
import org.veupathdb.lib.s3.s34k.S3Tag
import org.veupathdb.lib.s3.s34k.params.BaseRequest
import org.veupathdb.lib.s3.s34k.params.TagSender

// TODO: Document me
class BucketTagPutParams(var callback: (() -> Unit)? = null)
  : TagSender, BaseRequest()
{
  private val Log = LoggerFactory.getLogger(this::class.java)

  override val tags: Set<S3Tag> = HashSet()

  override fun addTags(tags: Map<String, String>) {
    Log.trace("addTags(tags = {})", tags)
    tags.forEach { (k, v) -> (this.tags as MutableSet).add(S3Tag(k, v)) }
  }

  override fun addTags(vararg tags: S3Tag) {
    Log.trace("addTags(tags = {})", tags)
    (this.tags as MutableSet).addAll(tags)
  }

  override fun addTags(tags: Collection<S3Tag>) {
    Log.trace("addTags(tags = {})", tags)
    (this.tags as MutableSet).addAll(tags)
  }

  override fun addTag(key: String, value: String) {
    Log.trace("addTag(key = {}, value = {})", key, value)
    (this.tags as MutableSet).add(S3Tag(key, value))
  }


  override fun getTagsMap(): Map<String, String> {
    Log.trace("toMap()")

    if (tags.isEmpty())
      return emptyMap()

    val out = HashMap<String, String>(tags.size)

    tags.forEach { out[it.key] = it.value }

    return out
  }
}