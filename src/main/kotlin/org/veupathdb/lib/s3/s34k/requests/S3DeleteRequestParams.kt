package org.veupathdb.lib.s3.s34k.requests

import org.veupathdb.lib.s3.s34k.fields.BucketName
import org.veupathdb.lib.s3.s34k.requests.client.S3BucketDeleteParams
import org.veupathdb.lib.s3.s34k.requests.`object`.S3ObjectDeleteParams

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
interface S3DeleteRequestParams : S3RegionRequestParams {

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   */
  var callback: (() -> Unit)?

  /**
   * Converts this generalized delete request into a bucket delete request.
   *
   * @param name Name of the target bucket.
   *
   * @return The converted [BasicS3BucketDeleteParams] instance.
   */
  fun toBucketDeleteParams(name: BucketName): S3BucketDeleteParams

  /**
   * Converts this generalized delete request into an object delete request.
   *
   * @param path Path to the target object.
   *
   * @return The converted [BasicS3ObjectDeleteParams] instance.
   */
  fun toObjectDeleteParams(path: String): S3ObjectDeleteParams
}