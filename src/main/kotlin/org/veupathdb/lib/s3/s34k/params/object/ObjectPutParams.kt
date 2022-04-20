package org.veupathdb.lib.s3.s34k.params.`object`

import org.veupathdb.lib.s3.s34k.S3Object
import java.io.InputStream

/**
 * Object Put Operation Parameters.
 *
 * @constructor Constructs a new [ObjectPutParams] instance.
 *
 * @param path Path to the object target of this request.
 *
 * @param stream Stream containing the data that will be written to the object in the S3
 * store.
 *
 * Whether this stream will be closed on completion of the put operation is
 * implementation specific.
 *
 * Defaults to an empty stream.
 *
 * @param callback Optional callback that will be called upon request
 * completion.
 *
 * @param length Size of the object being written to the S3 store.
 *
 * If the size is unknown set this value to -1.
 *
 * Defaults to -1.
 *
 * @param partSize Max chunk size to send in a single request to the S3 store.
 *
 * Defaults to 10MiB.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class ObjectPutParams(
  path: String? = null,
  var stream:      InputStream?          = null,
  var length:      Long                  = -1,
  var partSize:    Long                  = 10_485_760,
  var contentType: String?               = null,
  var callback:    ((S3Object) -> Unit)? = null
) : BaseObjectPutRequest(path)