package org.veupathdb.lib.s3.s34k.params.`object`

import org.veupathdb.lib.s3.s34k.S3ObjectMeta

/**
 * Empty Object Put Operation Parameters
 *
 * @constructor Constructs a new [ObjectStatParams] instance.
 *
 * @param path Path to the object target of this request.
 *
 * @param callback Optional callback that will be called upon request
 * completion.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class ObjectStatParams(
  path: String? = null,
  var callback: ((S3ObjectMeta) -> Unit)? = null
) : BaseObjectRequest(path)