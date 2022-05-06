package org.veupathdb.lib.s3.s34k.params.`object`.touch

import org.veupathdb.lib.s3.s34k.fields.MutableTagMap
import org.veupathdb.lib.s3.s34k.params.S3RequestParams

/**
 * Object Touch Operation Put Phase Parameters
 *
 * Parameters specific to the 'put object' phase of the object touch complex
 * operation.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.3.0
 */
interface OTPutParams : S3RequestParams {

  /**
   * Tags to append to the newly created object (if it was newly created).
   *
   * If the target object already existed and [putTagsIfCollision] is set to
   * `false`, any tags set here will be ignored.
   *
   * If the target object already existed and [putTagsIfCollision] is set to
   * `true`, these tags will be attached to the existing object.
   */
  val tags: MutableTagMap

  /**
   * Controls whether the [tags] in this parameter set should be applied to the
   * target object if it already existed.
   *
   * In other words, if the target object path already exists in the store,
   * should the operation append the [tags] values to the object already in the
   * store.
   *
   * Defaults to `false`
   */
  var putTagsIfCollision: Boolean

  /**
   * Optional callback that will be executed on successful completion of the put
   * phase of the touch operation.
   *
   * If the put phase is skipped on the object touch operation due to an object
   * already existing at the target path and the [ObjectTouchParams.overwrite]
   * flag being set to `false` then this callback will not be executed.
   */
  var callback: (() -> Unit)?
}