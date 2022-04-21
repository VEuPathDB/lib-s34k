package org.veupathdb.lib.s3.s34k.errors

/**
 * Generalized error wrapping a client implementation specific exception.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since  v0.1.0
 */
open class S34kException : RuntimeException {

  constructor(msg: String, cause: Throwable) : super(msg, cause)

  constructor(msg: String) : super(msg)

  constructor(cause: Throwable): super(cause)
}