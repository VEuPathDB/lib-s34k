package org.veupathdb.lib.s3.s34k.fields.headers

// TODO: Document me
interface S3HeadersMutable : S3Headers {

  // TODO: Document me
  fun addHeader(header: String, vararg values: String)

  // TODO: Document me
  fun addHeader(header: String, values: Iterable<String>)

  // TODO: Document me
  fun addHeaders(headers: Map<String, Iterable<String>>)

  // TODO: Document me
  fun addHeaders(vararg headers: Pair<String, String>)

}