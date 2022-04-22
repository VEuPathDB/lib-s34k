package org.veupathdb.lib.s3.s34k.requests

/**
 * Represents an S3 request with a 'region' parameter.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3RegionRequestParams : S3RequestParams {
  var region: String?
}