package org.veupathdb.lib.s3.s34k.fields.tags

import java.util.Collections

internal class TagSetImpl : TagSet {
  private val raw = HashSet<String>()

  override val size
    get() = raw.size

  override val isEmpty
    get() = raw.isEmpty()

  override val isNotEmpty
    get() = raw.isNotEmpty()

  override fun toSet(): Set<String> = Collections.unmodifiableSet(raw)

  override fun addTags(vararg tags: String) {
    raw.addAll(tags)
  }

  override fun addTags(tags: Iterable<String>) {
    raw.addAll(tags)
  }

  override fun iterator() = raw.iterator()
}