package org.veupathdb.lib.s3.s34k

/**
 * S3 Client Configuration
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since  v0.1.0
 */
data class S3Config(

  /**
   * URL to the S3 instance including protocol and port if necessary.
   */
  val url: String,

  /**
   * Access token/key used to authenticate with the S3 service.
   */
  val accessKey: String,

  /**
   * Secret token/key used to authenticate with the S3 service.
   */
  val secretKey: String,

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
      "  region = $region\n" +
      "}"
  }
}
