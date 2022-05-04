package org.veupathdb.lib.s3.s34k.params.`object`

import org.veupathdb.lib.s3.s34k.S3FileObject
import org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigError
import org.veupathdb.lib.s3.s34k.params.S3RegionRequestParams
import java.io.File

/**
 * Object download request parameters.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface ObjectDownloadParams : S3RegionRequestParams {

  /**
   * *Required* handle on the local file into which the remote object will be
   * downloaded.
   *
   * This file does not need to already exist.
   *
   * This value must be set or an [InvalidRequestConfigError] will be thrown
   * when the request is attempted.
   */
  var localFile: File?

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed an [S3FileObject] instance representing the
   * file that was downloaded.
   */
  var callback: ((handle: S3FileObject) -> Unit)?
}