package org.veupathdb.lib.s3.s34k

/**
 * Index of valid `x-amz-*` response headers.
 *
 * This index may not be complete.
 */
@Suppress("unused")
object ResponseHeader {

  /**
   * `x-amz-archive-status`
   *
   * The archive state of the head object.
   *
   * Valid Values:
   * * `ARCHIVE_ACCESS`
   * * `DEEP_ARCHIVE_ACCESS`
   */
  const val ArchiveStatus = "x-amz-archive-status"

  /**
   * `x-amz-checksum-crc32`
   *
   * The base64-encoded, 32-bit CRC32 checksum of the object. This will only be
   * present if it was uploaded with the object. With multipart uploads, this
   * may not be a checksum value of the object. For more information about how
   * checksums are calculated with multipart uploads, see "Checking Object
   * Integrity" in the Amazon S3 User Guide.
   */
  const val ChecksumCRC32 = "x-amz-checksum-crc32"

  /**
   * `x-amz-checksum-crc32c`
   *
   * The base64-encoded, 32-bit CRC32C checksum of the object. This will only be
   * present if it was uploaded with the object. With multipart uploads, this
   * may not be a checksum value of the object. For more information about how
   * checksums are calculated with multipart uploads, see "Checking Object
   * Integrity" in the Amazon S3 User Guide.
   */
  const val ChecksumCRC32C = "x-amz-checksum-crc32c"

  /**
   * `x-amz-checksum-sha1`
   *
   * The base64-encoded, 160-bit SHA-1 digest of the object. This will only be
   * present if it was uploaded with the object. With multipart uploads, this
   * may not be a checksum value of the object. For more information about how
   * checksums are calculated with multipart uploads, see "Checking Object
   * Integrity" in the Amazon S3 User Guide.
   */
  const val ChecksumSHA1 = "x-amz-checksum-sha1"

  /**
   * `x-amz-checksum-sha256`
   *
   * The base64-encoded, 256-bit SHA-256 digest of the object. This will only be
   * present if it was uploaded with the object. With multipart uploads, this
   * may not be a checksum value of the object. For more information about how
   * checksums are calculated with multipart uploads, see "Checking Object
   * Integrity" in the Amazon S3 User Guide.
   */
  const val ChecksumSHA256 = "x-amz-checksum-sha256"

  /**
   * `x-amz-delete-marker`
   *
   * Specifies whether the object retrieved was (`true`) or was not (`false`) a
   * Delete Marker. If `false`, this response header does not appear in the
   * response.
   */
  const val DeleteMarker = "x-amz-delete-marker"

  /**
   * `x-amz-expiration`
   *
   * If the object expiration is configured (see PUT Bucket lifecycle), the
   * response includes this header. It includes the expiry-date and rule-id
   * key-value pairs providing object expiration information. The value of the
   * rule-id is URL-encoded.
   */
  const val Expiration = "x-amz-expiration"

  /**
   * `x-amz-missing-meta`
   *
   * This is set to the number of metadata entries not returned in `x-amz-meta`
   * headers. This can happen if you create metadata using an API like SOAP that
   * supports more flexible metadata than the REST API. For example, using SOAP,
   * you can create metadata whose values are not legal HTTP headers.
   */
  const val MissingMeta = "x-amz-missing-meta"

  /**
   * `x-amz-mp-parts-count`
   *
   * The count of parts this object has. This value is only returned if you
   * specify `partNumber` in your request and the object was uploaded as a
   * multipart upload.
   */
  const val MultiPartPartsCount = "x-amz-mp-parts-count"

  /**
   * `x-amz-object-lock-legal-hold`
   *
   * Specifies whether a legal hold is in effect for this object. This header is
   * only returned if the requester has the `s3:GetObjectLegalHold` permission.
   * This header is not returned if the specified version of this object has
   * never had a legal hold applied. For more information about S3 Object Lock,
   * see "Object Lock".
   */
  const val ObjectLockLegalHold = "x-amz-object-lock-legal-hold"

  /**
   * `x-amz-object-lock-mode`
   *
   * The Object Lock mode, if any, that's in effect for this object. This header
   * is only returned if the requester has the `s3:GetObjectRetention`
   * permission. For more information about S3 Object Lock, see "Object Lock".
   *
   * Valid Values:
   * * `GOVERNANCE`
   * * `COMPLIANCE`
   */
  const val ObjectLockMode = "x-amz-object-lock-mode"

  /**
   * `x-amz-object-lock-retain-until-date`
   *
   * The date and time when the Object Lock retention period expires. This
   * header is only returned if the requester has the `s3:GetObjectRetention`
   * permission.
   */
  const val ObjectLockRetainUntilDate = "x-amz-object-lock-retain-until-date"

  /**
   * `x-amz-replication-status`
   *
   * Amazon S3 can return this header if your request involves a bucket that is
   * either a source or a destination in a replication rule.
   *
   * In replication, you have a source bucket on which you configure replication
   * and destination bucket or buckets where Amazon S3 stores object replicas.
   * When you request an object (`GetObject`) or object metadata (`HeadObject`)
   * from these buckets, Amazon S3 will return the `x-amz-replication-status`
   * header in the response as follows:
   *
   * * **If requesting an object from the source bucket**, Amazon S3 will return
   * the `x-amz-replication-status` header if the object in your request is
   * eligible for replication.
   * For example, suppose that in your replication configuration, you specify
   * object prefix TaxDocs requesting Amazon S3 to replicate objects with key
   * prefix TaxDocs. Any objects you upload with this key name prefix, for
   * example `TaxDocs/document1.pdf`, are eligible for replication. For any
   * object request with this key name prefix, Amazon S3 will return the
   * `x-amz-replication-status` header with value `PENDING`, `COMPLETED` or
   * `FAILED` indicating object replication status.
   *
   * * **If requesting an object from a destination bucket**, Amazon S3 will
   * return the `x-amz-replication-status` header with value `REPLICA` if the
   * object in your request is a replica that Amazon S3 created and there is no
   * replica modification replication in progress.
   *
   * * **When replicating objects to multiple destination buckets**, the
   * `x-amz-replication-status` header acts differently. The header of the
   * source object will only return a value of COMPLETED when replication is
   * successful to all destinations. The header will remain at value `PENDING`
   * until replication has completed for all destinations. If one or more
   * destinations fails replication the header will return `FAILED`.
   *
   * For more information, see "Replication".
   *
   * Valid Values:
   * * `COMPLETE`
   * * `PENDING`
   * * `FAILED`
   * * `REPLICA`
   */
  const val ReplicationStatus = "x-amz-replication-status"

  /**
   * `x-amz-request-charged`
   *
   * If present, indicates that the requester was successfully charged for the
   * request.
   *
   * Valid Values:
   * * `requester`
   */
  const val RequestCharged = "x-amz-request-charged"

  /**
   * `x-amz-restore`
   *
   * If the object is an archived object (an object whose storage class is
   * `GLACIER`), the response includes this header if either the archive
   * restoration is in progress (see `RestoreObject` or an archive copy is
   * already restored.
   *
   * If an archive copy is already restored, the header value indicates when
   * Amazon S3 is scheduled to delete the object copy. For example:
   *
   * ```
   * x-amz-restore: ongoing-request="false", expiry-date="Fri, 21 Dec 2012 00:00:00 GMT"
   * ```
   *
   * If the object restoration is in progress, the header returns the value
   * `ongoing-request="true"`.
   *
   * For more information about archiving objects, see "Transitioning Objects:
   * General Considerations".
   */
  const val Restore = "x-amz-restore"

  /**
   * `x-amz-server-side-encryption`
   *
   * The server-side encryption algorithm used when storing this object in
   * Amazon S3 (for example, `AES256`, `aws:kms`).
   *
   * Valid Values:
   * * `AES256`
   * * `aws:kms`
   */
  const val ServerSideEncryption = "x-amz-server-side-encryption"

  /**
   * `x-amz-server-side-encryption-aws-kms-key-id`
   *
   * If present, specifies the ID of the AWS Key Management Service (AWS KMS)
   * symmetric customer managed key that was used for the object.
   */
  const val ServerSideEncryptionAWSKMSKeyID = "x-amz-server-side-encryption-aws-kms-key-id"

  /**
   * `x-amz-server-side-encryption-bucket-key-enabled`
   *
   * Indicates whether the object uses an S3 Bucket Key for server-side
   * encryption with AWS KMS (`SSE-KMS`).
   */
  const val ServerSideEncryptionBucketKeyEnabled = "x-amz-server-side-encryption-bucket-key-enabled"

  /**
   * `x-amz-server-side-encryption-customer-algorithm`
   *
   * If server-side encryption with a customer-provided encryption key was
   * requested, the response will include this header confirming the encryption
   * algorithm used.
   */
  const val ServerSideEncryptionCustomerAlgorithm = "x-amz-server-side-encryption-customer-algorithm"

  /**
   * `x-amz-server-side-encryption-customer-key-MD5`
   *
   * If server-side encryption with a customer-provided encryption key was
   * requested, the response will include this header to provide round-trip
   * message integrity verification of the customer-provided encryption key.
   */
  const val ServerSideEncryptionCustomerKeyMD5 = "x-amz-server-side-encryption-customer-key-MD5"

  /**
   * `x-amz-storage-class`
   *
   * Provides storage class information of the object. Amazon S3 returns this
   * header for all objects except for S3 Standard storage class objects.
   *
   * For more information, see "Storage Classes".
   *
   * Valid Values:
   * * `STANDARD`
   * * `REDUCED_REDUNDANCY`
   * * `STANDARD_IA`
   * * `ONEZONE_IA`
   * * `INTELLIGENT_TIERING`
   * * `GLACIER`
   * * `DEEP_ARCHIVE`
   * * `OUTPOSTS`
   * * `GLACIER_IR`
   */
  const val StorageClass = "x-amz-storage-class"

  /**
   * `x-amz-tagging-count`
   *
   * The number of tags, if any, on the object.
   */
  const val TaggingCount = "x-amz-tagging-count"

  /**
   * `x-amz-version-id`
   *
   * Version of the object.
   */
  const val VersionID = "x-amz-version-id"

  /**
   * `x-amz-website-redirect-location`
   *
   * If the bucket is configured as a website, redirects requests for this
   * object to another object in the same bucket or to an external URL. Amazon
   * S3 stores the value of this header in the object metadata.
   */
  const val WebsiteRedirectLocation = "x-amz-website-redirect-location"
}