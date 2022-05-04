package org.veupathdb.lib.s3.s34k.params.bucket.tag

import org.veupathdb.lib.s3.s34k.fields.MutableHeaders
import org.veupathdb.lib.s3.s34k.fields.MutableQueryParams
import org.veupathdb.lib.s3.s34k.params.RegionRequestParams

interface TargetedBucketTagDeleteParams : RegionRequestParams {

  /**
   * Global headers that apply to all phases of the bucket tag delete operation.
   */
  override val headers: MutableHeaders

  /**
   * Global query params that apply to all phases of the bucket tag delete
   * operation.
   */
  override val queryParams: MutableQueryParams

  val getParams: TargetedBucketTagDeleteGet

  val deleteParams: TargetedBucketTagDeleteDelete

  val putParams: TargetedBucketTagDeletePut
}