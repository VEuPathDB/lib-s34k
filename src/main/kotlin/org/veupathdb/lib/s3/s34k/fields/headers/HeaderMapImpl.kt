package org.veupathdb.lib.s3.s34k.fields.headers

import org.veupathdb.lib.s3.s34k.fields.ArrayMap
import java.util.stream.Stream

internal open class HeaderMapImpl : S3Headers, ArrayMap() {
  override fun stream(): Stream<Pair<String, List<String>>> =
    raw.entries.stream().map { (k, v) -> Pair(k, v.asList()) }

  override fun get(header: String) =
    raw[header]?.asList()
}