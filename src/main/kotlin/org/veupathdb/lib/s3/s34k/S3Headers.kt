package org.veupathdb.lib.s3.s34k

// TODO: Document me
interface S3Headers : Iterable<Pair<String, List<String>>> {

  val size: Int

  // TODO: Document me
  fun toMap(): Map<String, List<String>>

  // TODO: Document me
  fun keys(): Set<String>

  // TODO: Document me
  fun getHeader(key: String): String

  // TODO: Document me
  fun getHeaders(key: String): List<String>
}