package org.veupathdb.lib.s3.s34k

// TODO: Document me
data class S3Config(
  // TODO: Document me
  internal val url: String,

  // TODO: Document me
  internal val accessKey: String,

  // TODO: Document me
  internal val secretKey: String,

  /**
   * Default region to use if not specified in operation specific params.
   */
  internal val region: String = "",
) {
  override fun toString(): String {
    return "S3Config {url: $url, accessKey: ***, secretKey: ***, region = $region}"
  }
}
