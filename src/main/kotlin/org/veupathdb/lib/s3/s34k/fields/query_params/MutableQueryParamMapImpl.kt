package org.veupathdb.lib.s3.s34k.fields.query_params

// TODO: Document me
internal class MutableQueryParamMapImpl : S3QueryParamsMutable, QueryParamMapImpl() {

  override fun addQueryParam(header: String, vararg values: String) =
    addVararg(header, *values)

  override fun addQueryParam(header: String, values: Iterable<String>) =
    addIterable(header, values)

  override fun addQueryParams(headers: Map<String, Iterable<String>>) =
    headers.forEach { (k, v) -> addQueryParam(k, v) }

  override fun addQueryParams(vararg headers: Pair<String, String>) =
    headers.forEach { (k, v) -> addQueryParam(k, v) }
}