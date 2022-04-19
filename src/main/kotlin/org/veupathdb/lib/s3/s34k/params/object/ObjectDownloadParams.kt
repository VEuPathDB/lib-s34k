package org.veupathdb.lib.s3.s34k.params.`object`

import org.veupathdb.lib.s3.s34k.S3FileObject
import org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException
import java.io.File

/**
 * Object Download Operation Parameters
 *
 * @constructor Constructs a new [ObjectDownloadParams] instance.
 *
 * @param path Path to the object target of this request.
 *
 * This value must be set or an [InvalidRequestConfigException] will be thrown
 * when the request is attempted.
 *
 * @param localFile Path to the local file into which the remote object will be downloaded.
 *
 * This value must be set or an [InvalidRequestConfigException] will be thrown
 * when the request is attempted.
 *
 * @param callback Optional callback that will be called upon request
 * completion.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class ObjectDownloadParams(
  path: String? = null,
  var localFile: File? = null,
  var callback: ((S3FileObject) -> Unit)? = null,
) : SealedObjReqParams(path) {
  override fun toString(): String {
    val out = StringBuilder(2048)

    out.append("ObjectDownloadParams {\n")
    callback?.also { out.append("  callback = ").append(it).append(",\n") }
    out.append("  localFile = ").append(localFile).append(",\n")

    super.toString(out)

    out.append("}")

    return out.toString()
  }
}