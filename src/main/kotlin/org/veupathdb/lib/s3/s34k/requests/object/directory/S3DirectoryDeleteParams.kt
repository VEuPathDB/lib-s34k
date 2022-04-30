package org.veupathdb.lib.s3.s34k.requests.`object`.directory

import org.veupathdb.lib.s3.s34k.requests.`object`.S3ObjectRequestParams

/**
 * Directory deletion request parameters.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3DirectoryDeleteParams : S3ObjectRequestParams {

  /**
   * Optional callback that will be executed on successful completion of the
   * S3 operation.
   */
  var callback: (() -> Unit)?

  /**
   * Whether to delete this directory recursively (including all contents)
   *
   * If set to false and this directory is not empty, the operation will fail
   * with a [DirectoryNotEmptyError] exception.
   *
   * Defaults to `true`
   */
  var recursive: Boolean
}