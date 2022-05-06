package org.veupathdb.lib.s3.s34k.params.`object`.directory

import org.veupathdb.lib.s3.s34k.fields.PageSize
import org.veupathdb.lib.s3.s34k.params.S3RequestParams

interface DDListParams : S3RequestParams {

  /**
   * Number of results per page while listing objects under the target
   * 'directory' prefix.
   *
   * Defaults to `1000`
   */
  var pageSize: PageSize

  /**
   * Optional callback that will be executed on completion of the object list
   * phase of the directory delete operation.
   *
   * If this phase of the operation is never reached, this callback will not be
   * executed.
   */
  var callback: (() -> Unit)?
}