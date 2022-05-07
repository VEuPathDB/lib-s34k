package org.veupathdb.lib.s3.s34k.objects

import org.veupathdb.lib.s3.s34k.S3Response

/**
 * Response handle on an S3 object.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface ObjectResponse : S3Response {

  /**
   * Path/key to the object this handle represents.
   */
  val path: String
}