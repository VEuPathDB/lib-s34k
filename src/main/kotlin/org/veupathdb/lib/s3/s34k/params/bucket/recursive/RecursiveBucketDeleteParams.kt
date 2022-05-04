package org.veupathdb.lib.s3.s34k.params.bucket.recursive

import org.veupathdb.lib.s3.s34k.fields.S3MutableHeaders
import org.veupathdb.lib.s3.s34k.fields.S3MutableQueryParams
import org.veupathdb.lib.s3.s34k.params.S3RegionRequestParams

/**
 * Recursive Bucket Delete Request Parameters.
 *
 * Defines request parameters used in the multi-stage operation necessary to
 * fully remove a bucket from an S3 instance.
 *
 * This operation happens in 3 stages:
 *
 * 1. Fetch a listing of all objects in the bucket.
 * 2. Recursively delete all objects in the bucket.
 * 3. Delete the bucket itself.
 *
 * Each phase can be configured independently with headers and query parameters,
 * in addition to sets of global (all phase) headers and query parameters.
 *
 * As this operation is complex, there is are a lot of errors that could result
 * from the operation, and those errors will include as much information as
 * possible to assist in recovering or handling each error.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface RecursiveBucketDeleteParams : S3RegionRequestParams {

  /**
   * Headers that will be applied to all requests in all phases of the recursive
   * bucket delete operation.
   */
  override val headers: S3MutableHeaders

  /**
   * Query parameters that will be applied to all requests in all phases of the
   * recursive bucket delete operation.
   */
  override val queryParams: S3MutableQueryParams

  /**
   * Global region value that will be applied to all requests in all phases of
   * the recursive bucket delete operation.
   */
  override var region: String?

  /**
   * Object list operation parameters.
   */
  val objectFetch: RBDObjectListParams

  /**
   * Bulk object delete operation parameters.
   */
  val objectDelete: RBDObjectDeleteParams

  /**
   * Bucket delete operation parameters.
   */
  val bucketDelete: RBDBucketDeleteParams

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   */
  var callback: (() -> Unit)?
}

