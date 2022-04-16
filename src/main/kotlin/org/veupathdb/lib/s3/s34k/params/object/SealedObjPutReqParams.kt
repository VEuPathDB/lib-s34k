package org.veupathdb.lib.s3.s34k.params.`object`

import org.slf4j.LoggerFactory
import org.veupathdb.lib.s3.s34k.S3Tag
import org.veupathdb.lib.s3.s34k.params.TagSenderParams

/**
 * Object Put Operation Params
 *
 * Base type for S3 put operation param sets.
 *
 * @constructor Constructs a new [SealedObjPutReqParams] instance.
 *
 * @param path Path to the object target of this request.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
sealed class SealedObjPutReqParams(path: String? = null)
  : TagSenderParams, SealedObjReqParams(path)
{

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

  override fun toString(sb: StringBuilder) {
    if (tags.isNotEmpty()) {
      sb.append("  tags = {\n")
      tags.forEach { (hk, hv) ->
        sb.append("    ").append(hk).append(" = ").append(hv).append(",\n")
      }
      sb.append("  },\n")
    }

    super.toString(sb)
  }
}
