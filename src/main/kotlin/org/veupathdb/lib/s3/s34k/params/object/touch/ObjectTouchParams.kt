package org.veupathdb.lib.s3.s34k.params.`object`.touch

import org.veupathdb.lib.s3.s34k.S3Object
import org.veupathdb.lib.s3.s34k.params.`object`.ObjectWriteParams

/**
 * Touch object operation parameters.
 *
 * Object touch creates an empty object in the target bucket if no such object
 * already exists.  This behavior may be changed using the [overwrite] flag.
 *
 * This is a 'complex operation' in that it may happen in 2 independently
 * configurable phases:
 *
 * 1. Lookup an existing object at the target path.
 * 2. Put a blank object at the target path.
 *
 * If [overwrite] is set to `true`, phase one is skipped and an object is put
 * into the target bucket no matter what.
 *
 * If [overwrite] is set to `false`, phase two is skipped if an object already
 * exists in the store at the target path.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface ObjectTouchParams : ObjectWriteParams {

  /**
   * Whether a pre-existing object already in the store should be overwritten
   * with a blank file created by this operation.
   *
   * If this is set to `true` the object get phase of this operation will be
   * skipped.
   *
   * Defaults to `false`
   *
   * @since v0.3.0
   */
  var overwrite: Boolean

  /**
   * Content type for the object if it is created.
   */
  var contentType: String?

  /**
   * Optional callback that will be executed on successful completion of this S3
   * operation.
   *
   * This callback will be executed after any callbacks set on the parameters
   * for the phases of this operation.
   */
  var callback: ((handle: S3Object) -> Unit)?
}