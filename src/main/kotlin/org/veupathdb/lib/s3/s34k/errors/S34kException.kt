package org.veupathdb.lib.s3.s34k.errors

open class S34kException : RuntimeException {
  constructor(msg: String, cause: Throwable) : super(msg, cause)

  constructor(msg: String) : super(msg)
}