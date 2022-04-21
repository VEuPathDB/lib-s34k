package org.veupathdb.lib.s3.s34k.fields

import java.util.Collections

internal class PathSetImpl : PathSet {
  private val raw = HashSet<String>()

  override val size
    get() = raw.size

  override val isEmpty
    get() = raw.isEmpty()

  override val isNotEmpty
    get() = raw.isNotEmpty()

  override fun toSet(): Set<String> = Collections.unmodifiableSet(raw)

  override fun addPaths(vararg paths: String) {
    raw.addAll(paths)
  }

  override fun addPaths(paths: Iterable<String>) {
    raw.addAll(paths)
  }

  override fun iterator() = raw.iterator()
}