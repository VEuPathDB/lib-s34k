package org.veupathdb.lib.s3.s34k.requests.`object`

import org.veupathdb.lib.s3.s34k.errors.S34kException

class ObjectDeleteError(
  val path: String,
  val s3Message: String,
  val s3Code: String,
  message: String,
  cause: Throwable,
) : S34kException(message, cause)