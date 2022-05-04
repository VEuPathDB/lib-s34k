package org.veupathdb.lib.s3.s34k

import java.io.InputStream

/**
 * Handle on an S3 object containing an [InputStream] over the contents of the
 * remote object.
 *
 * The wrapped [InputStream] must be closed when the caller is done with it.
 *
 * The stream wrapped by this object may be closed by using this type's [close]
 * method.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3StreamObject : S3Object, AutoCloseable {

  /**
   * Input stream over the contents of the remote object.
   *
   * This stream must be closed when the caller is done with it.
   */
  val stream: InputStream
}