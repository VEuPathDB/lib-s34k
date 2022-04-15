package org.veupathdb.lib.s3.s34k

// TODO: Document me
interface S3Headers {

  fun toMap(): Map<String, List<String>>

  fun keys(): Set<String>

  fun getHeader(key: String): String

  fun getHeaders(key: String): List<String>
}