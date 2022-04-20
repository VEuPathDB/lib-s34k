package org.veupathdb.lib.s3.s34k.params.bucket

import org.veupathdb.lib.s3.s34k.S3TagSet
import org.veupathdb.lib.s3.s34k.params.BaseRequest
import org.veupathdb.lib.s3.s34k.params.TagDeleter
import java.util.Collections

// TODO: Document me
class BucketTagDeleteParams : TagDeleter, BaseRequest {
  private val rawTags: MutableSet<String>

  override val tags: Set<String>
    get() = Collections.unmodifiableSet(rawTags)

  override var allTags: Boolean = false

  var callback: ((S3TagSet) -> Unit)? = null

  constructor() : super() {
    rawTags = HashSet()
  }

  internal constructor(
    region:      String?,
    tags:        MutableSet<String>,
    allTags:     Boolean,
    headers:     MutableMap<String, Array<String>>,
    queryParams: MutableMap<String, Array<String>>,
    callback:    ((S3TagSet) -> Unit)?
  ) : super(region, headers, queryParams) {
    this.rawTags = tags
    this.allTags = allTags
    this.callback = callback
  }

  override fun addTag(tag: String) {
    rawTags.add(tag)
  }

  override fun addTags(vararg tags: String) {
    rawTags.addAll(tags)
  }

  override fun addTags(tags: Iterable<String>) {
    rawTags.addAll(tags)
  }
}