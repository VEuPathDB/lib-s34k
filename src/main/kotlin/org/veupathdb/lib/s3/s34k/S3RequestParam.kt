package org.veupathdb.lib.s3.s34k


/**
 * Index of valid `x-amz-*` request headers and URI parameters.
 *
 * This index may not be complete.
 */
@Suppress("unused")
object S3RequestParam {

  /**
   * `If-Match`
   *
   * Return the object only if its entity tag (ETag) is the same as the one
   * specified; otherwise, return a 412 (precondition failed) error.
   */
  const val IfMatch = "If-Match"

  /**
   * `If-Modified-Since`
   *
   * Return the object only if it has been modified since the specified time;
   * otherwise, return a 304 (not modified) error.
   */
  const val IfModifiedSince = "If-Modified-Since"

  /**
   * `If-None-Match`
   *
   * Return the object only if its entity tag (ETag) is different from the one
   * specified; otherwise, return a 304 (not modified) error.
   */
  const val IfNoneMatch = "If-None-Match"

  /**
   * `If-Unmodified-Since`
   *
   * Return the object only if it has not been modified since the specified
   * time; otherwise, return a 412 (precondition failed) error.
   */
  const val IfUnmodifiedSince = "If-Unmodified-Since"

  /**
   * `partNumber`
   *
   * Part number of the object being read. This is a positive integer between
   * `1` and `10,000`. Effectively performs a 'ranged' GET request for the part
   * specified. Useful for downloading just a part of an object.
   */
  const val PartNumber = "partNumber"

  /**
   * `Range`
   *
   * Downloads the specified range bytes of an object. For more information
   * about the HTTP Range header, see
   * https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35.
   *
   * **Note**: Amazon S3 doesn't support retrieving multiple ranges of data per
   * `GET` request.
   */
  const val Range = "Range"

  /**
   * `response-cache-control`
   *
   * Sets the Cache-Control header of the response.
   */
  const val ResponseCacheControl = "response-cache-control"

  /**
   * `response-content-disposition`
   *
   * Sets the Content-Disposition header of the response
   */
  const val ResponseContentDisposition = "response-content-disposition"

  /**
   * `response-content-encoding`
   *
   * Sets the Content-Encoding header of the response.
   */
  const val ResponseContentEncoding = "response-content-encoding"

  /**
   * `response-content-language`
   *
   * Sets the Content-Language header of the response.
   */
  const val ResponseContentLength = "response-content-language"

  /**
   * `response-content-type`
   *
   * Sets the Content-Type header of the response.
   */
  const val ResponseContentType = "response-content-type"

  /**
   * `response-expires`
   *
   * Sets the Expires header of the response.
   */
  const val ResponseExpires = "response-expires"

  /**
   * `versionId`
   *
   * VersionId used to reference a specific version of the object.
   */
  const val VersionID = "versionId"

  /**
   * `x-amz-checksum-mode`
   *
   * To retrieve the checksum, this mode must be enabled.
   *
   * Valid Values:
   * * `ENABLED`
   */
  const val ChecksumMode = "x-amz-checksum-mode"

  /**
   * `x-amz-expected-bucket-owner`
   *
   * The account ID of the expected bucket owner. If the bucket is owned by a
   * different account, the request fails with the HTTP status code 403
   * Forbidden (access denied).
   */
  const val ExpectedBucketOwner = "x-amz-expected-bucket-owner"

  /**
   * `x-amz-request-payer`
   *
   * Confirms that the requester knows that they will be charged for the
   * request. Bucket owners need not specify this parameter in their requests.
   * For information about downloading objects from Requester Pays buckets, see
   * "Downloading Objects in Requester Pays Buckets" in the Amazon S3 User
   * Guide.
   *
   * Valid Values:
   * * `requester`
   */
  const val RequestPayer = "x-amz-request-payer"

  /**
   * `x-amz-server-side-encryption-customer-algorithm`
   *
   * Specifies the algorithm to use to when decrypting the object (for example, AES256).
   */
  const val ServerSideEncryptionCustomerAlgorithm = "x-amz-server-side-encryption-customer-algorithm"

  /**
   * `x-amz-server-side-encryption-customer-key`
   *
   * Specifies the customer-provided encryption key for Amazon S3 used to
   * encrypt the data. This value is used to decrypt the object when recovering
   * it and must match the one used when storing the data. The key must be
   * appropriate for use with the algorithm specified in the
   * `x-amz-server-side-encryption-customer-algorithm` header.
   */
  const val ServerSideEncryptionCustomerKey = "x-amz-server-side-encryption-customer-key"

  /**
   * `x-amz-server-side-encryption-customer-key-MD5`
   *
   * Specifies the 128-bit MD5 digest of the encryption key according to RFC
   * 1321. Amazon S3 uses this header for a message integrity check to ensure
   * that the encryption key was transmitted without error.
   */
  const val ServerSideEncryptionCustomerKeyMD5 = "x-amz-server-side-encryption-customer-key-MD5"
}