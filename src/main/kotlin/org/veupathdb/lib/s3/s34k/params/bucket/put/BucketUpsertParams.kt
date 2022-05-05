package org.veupathdb.lib.s3.s34k.params.bucket.put

import org.veupathdb.lib.s3.s34k.Bucket
import org.veupathdb.lib.s3.s34k.fields.MutableHeaders
import org.veupathdb.lib.s3.s34k.fields.MutableQueryParams
import org.veupathdb.lib.s3.s34k.fields.MutableTagMap
import org.veupathdb.lib.s3.s34k.params.RegionRequestParams

/**
 * Bucket 'create if not exists' request parameters.
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
interface BucketUpsertParams : BucketPutParams {

  /**
   * Controls whether the [tags] in this parameter set should be applied to the
   * target bucket if it already existed.
   *
   * In other words, if the target bucket name already exists in the store,
   * should the operation append the [tags] values to the bucket already in the
   * store.
   *
   * Default = `false`
   */
  var putTagsIfCollision: Boolean
}