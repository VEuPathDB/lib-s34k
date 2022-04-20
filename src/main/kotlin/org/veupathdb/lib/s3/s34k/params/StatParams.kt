package org.veupathdb.lib.s3.s34k.params

import org.slf4j.LoggerFactory
import org.veupathdb.lib.s3.s34k.S3ObjectMeta
import org.veupathdb.lib.s3.s34k.params.`object`.ObjectStatParams

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

  private val Log = LoggerFactory.getLogger(this::class.java)

  fun toObjectStatParams(path: String): ObjectStatParams {
    Log.trace("toObjectStatParams(path = {})", path)
    return ObjectStatParams(path, callback)
  }
}