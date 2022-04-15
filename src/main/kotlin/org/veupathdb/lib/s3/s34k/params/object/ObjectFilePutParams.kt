package org.veupathdb.lib.s3.s34k.params.`object`

import org.veupathdb.lib.s3.s34k.S3Object
import org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException
import java.io.File

/**
 * File Put Operation Parameters.
 *
 * @constructor Constructs a new [ObjectFilePutParams] instance.
 *
 * @param callback Optional callback that will be called upon request
 * completion.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class ObjectFilePutParams(var callback: ((S3Object) -> Unit)? = null) :
  ObjectPutRequestParams()
{

  /**
   * Path to the local file that will be put into the S3 store.
   *
   * This value must be set or an [InvalidRequestConfigException] will be thrown
   * when the request is attempted.
   */
  var localFile: File? = null

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

    out.append("ObjectFilePutParams {\n")

    callback?.also { out.append("  callback = ").append(it).append(",\n") }
    out.append("  localFile = ").append(localFile).append(",\n")
    out.append("  length = ").append(length).append(",\n")
    out.append("  partSize = ").append(partSize).append(",\n")

    super.toString(out)
    out.append('}')

    return out.toString()
  }
}