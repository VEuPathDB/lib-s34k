package org.veupathdb.lib.s3.s34k.request.`object`

import org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException
import org.veupathdb.lib.s3.s34k.fields.headers.S3HeadersMutable
import org.veupathdb.lib.s3.s34k.fields.query_params.S3QueryParamsMutable
import org.veupathdb.lib.s3.s34k.response.`object`.S3FileObject
import java.io.File

/**
 * Object Download Operation Parameters
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class ObjectDownloadParams : BaseObjectRequest {

  /**
   * Path to the local file into which the remote object will be downloaded.
   *
   * This value must be set or an [InvalidRequestConfigException] will be thrown
   * when the request is attempted.
   */
  var localFile: File?

  /**
   * Optional callback that will be called upon request completion.
   */
  var callback: ((S3FileObject) -> Unit)?

  constructor(
    path: String? = null,
    region: String? = null,
    localFile: File? = null,
    callback: ((S3FileObject) -> Unit)? = null
  ) : super(path, region) {
    this.localFile = localFile
    this.callback = callback
  }

  internal constructor(
    path: String?,
    region: String?,
    localFile: File?,
    callback: ((S3FileObject) -> Unit)?,
    headers: S3HeadersMutable,
    queryParams: S3QueryParamsMutable,
  ) : super(path, region, headers, queryParams) {
    this.localFile = localFile
    this.callback = callback
  }
}