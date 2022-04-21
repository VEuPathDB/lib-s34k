package org.veupathdb.lib.s3.s34k

// TODO: Document me
data class S3Config(

  /**
   * URL to the S3 instance including protocol and port if necessary.
   */
  val url: String,

  // TODO: Document me
  val accessKey: String,

  // TODO: Document me
  val secretKey: String,

  // TODO: Document me
  val secure: Boolean = true,

  /**
   * Default region to use if not specified in operation specific params.
   */
  val region: String? = null,
) {
  override fun toString(): String {
    return "S3Config {\n" +
      "  url = $url,\n" +
      "  accessKey = ***,\n" +
      "  secretKey = ***,\n" +
      "  secure = $secure,\n" +
      "  region = $region\n" +
      "}"
  }
}
