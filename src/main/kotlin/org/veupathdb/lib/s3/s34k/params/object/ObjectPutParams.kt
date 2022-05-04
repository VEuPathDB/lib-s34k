package org.veupathdb.lib.s3.s34k.params.`object`

import org.veupathdb.lib.s3.s34k.S3Object

interface ObjectPutParams : ObjectWriteParams {

  /**
   * Optional content type for the S3 object being created.
   */
  var contentType: String?

  /**
   * Optional callback that will be executed upon successful completion of the
   * S3 operation.
   *
   * This callback will be passed an [S3Object] instance representing the object
   * that was created.
   */
  var callback: ((handle: S3Object) -> Unit)?

}