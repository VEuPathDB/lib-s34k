package org.veupathdb.lib.s3.s34k.params.bucket

import org.slf4j.LoggerFactory
import org.veupathdb.lib.s3.s34k.S3Tag
import org.veupathdb.lib.s3.s34k.params.TagSenderParams

/**
 * Bucket Put Operation Params
 *
 * Base type for S3 put operation param sets.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
sealed class SealedBucketPutReqParams(
  bucket: String? = null,
  region: String? = null,
) : TagSenderParams, SealedBucketReqParams(bucket, region) {

  private val Log = LoggerFactory.getLogger(this::class.java)

  /**
   * Tags that will be attached to the object being put into the S3 store.
   */
  override val tags: Set<S3Tag> = HashSet()

  /**
   * Adds/overwrites the tags in the existing [SealedBucketPutReqParams.tags] [Set] with the
   * values contained in the given [tags] [Map].
   *
   * Each entry in the input map will be converted into an [S3Tag] instance and
   * put into the [Set] of tags attached to this request.
   *
   * @param tags Map of tags to set on this request.
   */
  override fun addTags(tags: Map<String, String>) {
    Log.trace("addTags(tags = {})", tags)

    val list = (this.tags as MutableSet)
    tags.forEach { (k, v) -> list.add(S3Tag(k, v)) }
  }

  /**
   * Adds/overwrites the tags in the existing [SealedBucketPutReqParams.tags] [Set] with the
   * values contained in the given [tags] array.
   *
   * @param tags Array of tags to set on this request.
   */
  override fun addTags(vararg tags: S3Tag) {
    Log.trace("addTags(tags = {})", tags)
    (this.tags as MutableSet).addAll(tags)
  }

  /**
   * Adds/overwrites the tags in the existing [SealedBucketPutReqParams.tags] [Set] with the
   * values contained in the given [tags] [Collection].
   *
   * @param tags Collection of tags to set on this request.
   */
  override fun addTags(tags: Collection<S3Tag>) {
    Log.trace("addTags(tags = {})", tags)
    (this.tags as MutableSet).addAll(tags)
  }

  /**
   * Adds/overwrites a single tag in the [tags] set on this request.
   *
   * The input values will be converted to an [S3Tag] instance.
   *
   * @param key Key of the tag to set.
   *
   * @param value Value of the tag to set.
   */
  override fun addTag(key: String, value: String) {
    Log.trace("addTag(key = {}, value = {})", key, value)
    (this.tags as MutableSet).add(S3Tag(key, value))
  }

  override fun toMap(): Map<String, String> {
    Log.trace("toMap()")

    if (tags.isEmpty())
      return emptyMap()

    val out = HashMap<String, String>(tags.size)

    tags.forEach { out.put(it.key, it.value) }

    return out
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
