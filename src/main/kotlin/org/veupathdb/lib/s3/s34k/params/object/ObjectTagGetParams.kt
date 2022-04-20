package org.veupathdb.lib.s3.s34k.params.`object`

import org.veupathdb.lib.s3.s34k.S3TagSet

/**
 * Object Tag Retrieval Operation Parameters
 *
 * @constructor Constructs a new [ObjectTagGetParams] instance.
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
class ObjectTagGetParams(
  path: String? = null,
  var callback: ((tags: S3TagSet) -> Unit)? = null
) : BaseObjectRequest(path)