package org.veupathdb.lib.s3.s34k.params

import org.veupathdb.lib.s3.s34k.fields.BucketName
import org.veupathdb.lib.s3.s34k.client.BucketDeleteParams
import org.veupathdb.lib.s3.s34k.request.`object`.ObjectDeleteParams

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
open class DeleteParams(
  region: String? = null,
  var callback: ((Boolean) -> Unit)? = null
) : RegionRequest(region) {

  /**
   * Converts this [DeleteParams] instance into a [BucketDeleteParams] instance.
   *
   * All properties configured on this [DeleteParams] instance will be copied
   * to the new [BucketDeleteParams] instance.
   *
   * @param name Name of the bucket to be deleted.
   *
   * @return New [BucketDeleteParams] instance.
   */
  fun toBucketDeleteParams(name: BucketName) =
    BucketDeleteParams(name, region, callback, headers, queryParams)

  /**
   * Converts this [DeleteParams] instance into a [ObjectDeleteParams] instance.
   *
   * All properties configured on this [DeleteParams] instance will be copied
   * to the new [ObjectDeleteParams] instance.
   *
   * @param path Path to the object to be deleted.
   *
   * @return New [ObjectDeleteParams] instance.
   */
  fun toObjectDeleteParams(path: String) =
    ObjectDeleteParams(path, region, callback, headers, queryParams)
}