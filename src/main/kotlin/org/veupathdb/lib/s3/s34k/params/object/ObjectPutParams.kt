package org.veupathdb.lib.s3.s34k.params.`object`

import org.veupathdb.lib.s3.s34k.S3Object
import java.io.InputStream

/**
 * Object Put Operation Parameters.
 *
 * @constructor Constructs a new [ObjectPutParams] instance.
 *
 * @param callback Optional callback that will be called upon request
 * completion.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class ObjectPutParams(val callback: ((S3Object) -> Unit)? = null) :
  ObjectPutRequestParams()
{

  /**
   * Stream containing the data that will be written to the object in the S3
   * store.
   *
   * Whether this stream will be closed on completion of the put operation is
   * implementation specific.
   *
   * Defaults to an empty stream.
   */
  var stream: InputStream = ByteArray(0).inputStream()

  /**
   * Size of the object being written to the S3 store.
   *
   * If the size is unknown set this value to -1.
   *
   * Defaults to -1.
   */
  var length: Long = -1

  /**
   * Max chunk size to send in a single request to the S3 store.
   *
   * Defaults to 10MiB.
   */
  var partSize: Long = 10_485_760

  override fun toString(): String {
    val out = StringBuilder(2048)

    out.append("ObjectPutParams {\n")

    callback.also { out.append("  callback = ").append(it).append(",\n") }
    out.append("  stream = ...,\n")
    out.append("  length = ").append(length).append(",\n")
    out.append("  partSize = ").append(partSize).append(",\n")

    super.toString(out)
    out.append('}')

    return out.toString()
  }
}