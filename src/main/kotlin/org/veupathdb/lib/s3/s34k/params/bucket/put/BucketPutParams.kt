package org.veupathdb.lib.s3.s34k.params.bucket.put

import org.veupathdb.lib.s3.s34k.Bucket
import org.veupathdb.lib.s3.s34k.fields.MutableHeaders
import org.veupathdb.lib.s3.s34k.fields.MutableQueryParams
import org.veupathdb.lib.s3.s34k.fields.MutableTagMap
import org.veupathdb.lib.s3.s34k.params.RegionRequestParams

/**
 * Bucket create request parameters.
 *
 * This is a 'complex operation' in that it has 3 phases that can be configured
 * independently:
 *
 * 1. Create the bucket
 * 2. Attach tags to the bucket
 * 3. Get the created bucket
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface BucketPutParams : RegionRequestParams {

  /**
   * Global headers that will be applied to all phases of the operation.
   *
   * If there is a conflict between a global header and a phase specific header,
   * the phase specific header will be used.
   *
   * This is done rather than merging the 2 sets of headers to prevent the
   * creation of invalid headers or otherwise confusing behavior
   *
   * If both sets of headers are desired, set the headers on the phase specific
   * header set.
   */
  override val headers: MutableHeaders

  /**
   * Global query params that will be applied to all phases of the operation.
   *
   * If there is a conflict between a global query param and a phase specific
   * query param, the phase specific query param will be used.
   *
   * This is done rather than merging the 2 sets of query to prevent possibly
   * confusing behavior.
   *
   * If both sets of query params are desired, set the query params on the phase
   * specific query param set.
   */
  override val queryParams: MutableQueryParams

  /**
   * Tags that may be attached to the target bucket during the execution of
   * this S3 operation.
   */
  val tags: MutableTagMap

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed a handle on the newly created S3 bucket.
   */
  var callback: ((bucket: Bucket) -> Unit)?

  /**
   * Options specific to the put phase of the bucket create operation.
   */
  val putParams: BPPutParams

  /**
   * Options specific to the tag put phase of the bucket create operation.
   */
  val tagPutParams: BPTagPutParams

  /**
   * Options specific to the get phase of the bucket create operation.
   */
  val getParams: BPGetParams
}