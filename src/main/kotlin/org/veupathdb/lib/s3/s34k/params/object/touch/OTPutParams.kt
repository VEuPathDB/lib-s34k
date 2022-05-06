package org.veupathdb.lib.s3.s34k.params.`object`.touch

/**
 * Object Touch Operation Put Phase Parameters
 *
 * Parameters specific to the 'put object' phase of the object touch complex
 * operation.
 *
 * If the put phase is skipped on the object touch operation due to an object
 * already existing at the target path and the [ObjectTouchParams.overwrite]
 * flag being set to `false` then these parameters will be ignored.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.3.0
 */
interface OTPutParams {
}