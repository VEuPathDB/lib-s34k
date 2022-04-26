package org.veupathdb.lib.s3.s34k.requests.`object`

import org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException
import org.veupathdb.lib.s3.s34k.response.`object`.S3Object
import java.io.File

/**
 * File upload request parameters.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3FileUploadParams : S3ObjectWriteParams {

  /**
   * *Required* handle on the local file that will be uploaded to the S3 store.
   *
   * This value must be set or an [InvalidRequestConfigException] will be thrown
   * when the request is attempted.
   */
  var localFile: File?

  /**
   * Max chunk size to send in a single request to the S3 store.
   *
   * Defaults to 10MiB
   */
  var partSize: Int

  /**
   * Optional content type for the file being uploaded.
   */
  var contentType: String?

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed an [S3Object] instance representing the newly
   * created object.
   */
  var callback: ((S3Object) -> Unit)?
}