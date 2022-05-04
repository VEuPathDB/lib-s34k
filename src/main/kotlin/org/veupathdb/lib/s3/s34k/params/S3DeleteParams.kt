package org.veupathdb.lib.s3.s34k.params

/**
 * Generalized delete operation parameters.
 *
 * This type can be configured in the context of a method that provides the
 * S3 type specific fields, then converted to the actual required type upon
 * method execution.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3DeleteParams : S3RegionRequestParams {

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   */
  var callback: (() -> Unit)?
}