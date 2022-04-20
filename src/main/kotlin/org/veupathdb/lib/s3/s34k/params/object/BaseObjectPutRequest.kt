package org.veupathdb.lib.s3.s34k.params.`object`

import org.slf4j.LoggerFactory
import org.veupathdb.lib.s3.s34k.S3Tag
import org.veupathdb.lib.s3.s34k.params.TagSender
import java.util.Collections

/**
 * Object Put Operation Params
 *
 * Base type for S3 put operation param sets.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
open class BaseObjectPutRequest
  : TagSender, BaseObjectRequest
{
  private val rawTags = HashSet<S3Tag>()

  private val Log = LoggerFactory.getLogger(this::class.java)

  override val tags: Set<S3Tag>
    get() = Collections.unmodifiableSet(rawTags)

  constructor(path: String? = null) : super(path)

  internal constructor(
    path: String?,
    region: String?,
    rawHeaders: MutableMap<String, Array<String>>,
    rawQueryParams: MutableMap<String, Array<String>>,
  ) : super(path, region, rawHeaders, rawQueryParams)

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
}
