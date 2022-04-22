package org.veupathdb.lib.s3.s34k.requests

import org.veupathdb.lib.s3.s34k.fields.BucketName
import org.veupathdb.lib.s3.s34k.requests.client.S3BucketExistsParams
import org.veupathdb.lib.s3.s34k.requests.`object`.S3ObjectExistsParams

/**
 * Blank existence check request parameters.
 *
 * This type may be used to assemble the request then convert to a specific
 * target, bucket or object.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3BlankExistsParams : S3RegionRequestParams {

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed a boolean flag indicating whether the target
   * bucket or object exists in the S3 store.
   */
  var callback: ((exists: Boolean) -> Unit)?

  // TODO: Document me
  fun toBucketExistsParams(bucket: BucketName): S3BucketExistsParams

  // TODO: Document me
  fun toObjectExistsParams(path: String): S3ObjectExistsParams
}