package org.veupathdb.lib.s3.s34k

// TODO: Document me
data class S3Config(
  // TODO: Document me
  val url: String,

  // TODO: Document me
  val accessKey: String,

  // TODO: Document me
  val secretKey: String,

  /**
   * Default region to use if not specified in operation specific params.
   */
  val region: String?,
) {
  override fun toString(): String {
    return "S3Config {\n" +
      "  url = $url,\n" +
      "  accessKey = ***,\n" +
      "  secretKey = ***,\n" +
      "  region = $region\n" +
      "}"
  }
}
