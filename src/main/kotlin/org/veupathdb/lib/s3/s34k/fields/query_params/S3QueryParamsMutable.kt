package org.veupathdb.lib.s3.s34k.fields.query_params

// TODO: Document me
interface S3QueryParamsMutable : S3QueryParams {

  // TODO: Document me
  fun addQueryParam(header: String, vararg values: String)

  // TODO: Document me
  fun addQueryParam(header: String, values: Iterable<String>)

  // TODO: Document me
  fun addQueryParams(headers: Map<String, Iterable<String>>)

  // TODO: Document me
  fun addQueryParams(vararg headers: Pair<String, String>)
}