package org.veupathdb.lib.s3.s34k.fields.query_params

import org.veupathdb.lib.s3.s34k.fields.ArrayMap
import java.util.stream.Stream

internal open class QueryParamMapImpl : S3QueryParams, ArrayMap() {
  override fun stream(): Stream<Pair<String, List<String>>> =
    raw.entries
      .stream()
      .map { (k, v) -> Pair(k, v.asList()) }

  override fun get(queryParam: String) =
    raw[queryParam]?.asList()
}