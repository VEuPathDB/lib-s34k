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
   *
   * This callback will be passed a boolean flag indicating whether the
   * directory existed before the delete operation was called.  `true` indicates
   * the directory did exist but has now been deleted, `false` indicates the
   * directory did not exist at the time the delete operation was executed.
   */
  var callback: ((deleted: Boolean) -> Unit)?

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