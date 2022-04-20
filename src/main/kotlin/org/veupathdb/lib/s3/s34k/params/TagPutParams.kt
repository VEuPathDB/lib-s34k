package org.veupathdb.lib.s3.s34k.params

import org.slf4j.LoggerFactory
import org.veupathdb.lib.s3.s34k.S3Tag
import org.veupathdb.lib.s3.s34k.params.bucket.BucketTagPutParams
import org.veupathdb.lib.s3.s34k.params.`object`.ObjectTagPutParams

/**
 * Generic Tag Put Operation Parameters
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class TagPutParams : TagSender, BaseRequest() {
  private val Log = LoggerFactory.getLogger(this::class.java)

  override val tags: Set<S3Tag> = HashSet()

  override fun addTags(tags: Map<String, String>) {
    Log.trace("addTags(tags = {})", tags)

    val list = (this.tags as MutableSet)
    tags.forEach { (k, v) -> list.add(S3Tag(k, v)) }
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

  fun toObjectTagPutParams(path: String, cb: (() -> Unit)? = null): ObjectTagPutParams {
    Log.trace("toObjectTagPutParams(path = {}, cb = {})", path, cb)

    return ObjectTagPutParams(path, cb).also {
      it.path = path
      (it.tags as MutableSet).addAll(tags)
      headers.forEach { (k, v) -> it.addHeaders(k, *v) }
      queryParams.forEach { (k, v) -> it.addQueryParams(k, *v) }
    }
  }

  fun toBucketTagPutParams(cb: (() -> Unit)? = null): BucketTagPutParams {
    Log.trace("toBucketTagPutParams(cb = {})", cb)

    return BucketTagPutParams(cb).also {
      (it.tags as MutableSet).addAll(tags)
      headers.forEach { (k, v) -> it.addHeaders(k, *v) }
      queryParams.forEach { (k, v) -> it.addQueryParams(k, *v) }
    }
  }
}