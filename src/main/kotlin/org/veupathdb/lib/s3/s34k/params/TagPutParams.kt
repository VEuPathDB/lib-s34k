package org.veupathdb.lib.s3.s34k.params

import org.slf4j.LoggerFactory
import org.veupathdb.lib.s3.s34k.S3Tag

/**
 * Empty Object Put Operation Parameters
 *
 * @constructor Constructs a new [TagPutParams] instance.
 *
 * @param callback Optional callback that will be called upon request
 * completion.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class TagPutParams(val callback: (() -> Unit)? = null) : TagSenderParams, AbstractRequestParams() {

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

  override fun toString(): String {
    val out = StringBuilder(2048)

    out.append("TagPutParams {\n")
    out.append("  tags = {\n")
    tags.forEach { (hk, hv) ->
      out.append("    ").append(hk).append(" = ").append(hv).append(",\n")
    }
    out.append("  },\n")

    super.toString(out)
    out.append('}')

    return out.toString()
  }
}