package org.veupathdb.lib.s3.s34k.params

import org.veupathdb.lib.s3.s34k.S3ObjectMeta
import org.veupathdb.lib.s3.s34k.`object`.request.ObjectStatParams

/**
 * Generic Stat Operation Parameters
 *
 * @constructor Constructs a new [StatParams] instance.
 *
 * @param callback Optional callback that will be called upon request
 * completion.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class StatParams(var callback: ((S3ObjectMeta) -> Unit)? = null) : BaseRequest() {

  fun toObjectStatParams(path: String, region: String? = null) =
    ObjectStatParams(path, region, callback, headers, queryParams)
}