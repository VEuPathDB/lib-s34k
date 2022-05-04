package org.veupathdb.lib.s3.s34k.params.`object`.directory

import org.veupathdb.lib.s3.s34k.params.S3RegionRequestParams

/**
 * Directory deletion request parameters.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3DirectoryDeleteParams : S3RegionRequestParams {

  /**
   * Optional callback that will be executed on successful completion of the
   * S3 operation.
   */
  var callback: (() -> Unit)?
}