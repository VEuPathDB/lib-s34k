package org.veupathdb.lib.s3.s34k.requests.`object`

import org.veupathdb.lib.s3.s34k.response.`object`.S3Object

/**
 * Directory creation operation parameters.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3DirectoryCreateParams : S3ObjectWriteParams {

  /**
   * Optional callback that will be executed on successful completion of the
   * S3 operation.
   *
   * This callback will be passed an [S3Object] reference representing the
   * directory that was created.
   */
  var callback: ((S3Object) -> Unit)?
}