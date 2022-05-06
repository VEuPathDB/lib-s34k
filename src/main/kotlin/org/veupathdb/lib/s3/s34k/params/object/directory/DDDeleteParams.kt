package org.veupathdb.lib.s3.s34k.params.`object`.directory

import org.veupathdb.lib.s3.s34k.params.S3RequestParams

interface DDDeleteParams : S3RequestParams {

  /**
   * Defaults to `false`
   */
  var bypassGovernance: Boolean

  /**
   * Optional callback that will be executed on completion of the object delete
   * phase of the directory delete operation.
   *
   * If the object delete phase is never reached, this callback will not be
   * called.s
   */
  var callback: (() -> Unit)?
}