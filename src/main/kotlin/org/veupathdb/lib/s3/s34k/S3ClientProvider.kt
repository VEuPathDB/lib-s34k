package org.veupathdb.lib.s3.s34k

/**
 * S3 Client Provider
 *
 * Factory/provider for creating [S3Client] instances.
 *
 * This is the entrypoint for specific implementations of the S34K API.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3ClientProvider {

  /**
   * Provides a new [S3Client] instance, configured by the passed [S3Config]
   * instance.
   *
   * @param config S3 client configuration.
   *
   * @return New [S3Client] instance.
   */
  fun new(config: S3Config): S3Client
}