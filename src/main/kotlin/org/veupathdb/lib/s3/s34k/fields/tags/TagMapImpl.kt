package org.veupathdb.lib.s3.s34k.fields.tags

import org.veupathdb.lib.s3.s34k.S3Tag
import java.util.Collections

internal class TagMapImpl : TagMap {
  private val raw = HashSet<S3Tag>()

  override val size: Int
    get() = TODO("Not yet implemented")

  override val isEmpty: Boolean
    get() = TODO("Not yet implemented")

  override val isNotEmpty: Boolean
    get() = TODO("Not yet implemented")

  override fun toMap(): Map<String, String> {
    val out = HashMap<String, String>(raw.size)
    raw.forEach { out[it.key] = it.value }
    return out
  }

  override fun toSet(): Set<S3Tag> = Collections.unmodifiableSet(raw)

  override fun addTag(key: String, value: String) {
    raw.add(S3Tag(key, value))
  }

  override fun addTags(vararg tags: S3Tag) {
    raw.addAll(tags)
  }

  override fun addTags(tags: Iterable<S3Tag>) {
    raw.addAll(tags)
  }

  override fun addTags(vararg tags: Pair<String, String>) {
    tags.forEach { (k, v) -> raw.add(S3Tag(k, v)) }
  }

  override fun addTags(tags: Map<String, String>) {
    tags.forEach { (k, v) -> raw.add(S3Tag(k, v)) }
  }

  override fun iterator() = raw.iterator()
}