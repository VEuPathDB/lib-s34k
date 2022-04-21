package org.veupathdb.lib.s3.s34k.request.`object`

import org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException
import org.veupathdb.lib.s3.s34k.fields.headers.S3HeadersMutable
import org.veupathdb.lib.s3.s34k.fields.query_params.S3QueryParamsMutable
import org.veupathdb.lib.s3.s34k.fields.tags.TagMap
import org.veupathdb.lib.s3.s34k.response.`object`.S3Object
import java.io.File

/**
 * File Put Operation Parameters.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class ObjectFilePutParams : TaggedObjectRequest {
  /**
   * Path to the local file that will be put into the S3 store.
   *
   * This value must be set or an [InvalidRequestConfigException] will be thrown
   * when the request is attempted.
   */
  var localFile: File?

  /**
   * Size of the object being written to the S3 store.
   *
   * If the size is unknown set this value to -1.
   *
   * Defaults to -1.
   */
  var length: Long

  /**
   * Max chunk size to send in a single request to the S3 store.
   *
   * Defaults to 10MiB.
   */
  var partSize: Long

  /**
   * Content type for the file being uploaded.
   */
  var contentType: String?

  /**
   * Optional callback that will be called upon request completion.
   */
  var callback: ((S3Object) -> Unit)?

  constructor(
    path: String? = null,
    region: String? = null,
    localFile: File? = null,
    length: Long = -1,
    partSize: Long = 10_485_760,
    contentType: String? = null,
    callback: ((S3Object) -> Unit)? = null
  ) : super(path, region) {
    this.localFile   = localFile
    this.length      = length
    this.partSize    = partSize
    this.contentType = contentType
    this.callback    = callback
  }

  internal constructor(
    path:        String?,
    region:      String?,
    localFile:   File?,
    length:      Long,
    partSize:    Long,
    contentType: String?,
    callback:    ((S3Object) -> Unit)?,
    tags: TagMap,
    headers: S3HeadersMutable,
    queryParams: S3QueryParamsMutable,
  ) : super(path, region, tags, headers, queryParams) {
    this.localFile   = localFile
    this.length      = length
    this.partSize    = partSize
    this.contentType = contentType
    this.callback    = callback
  }
}