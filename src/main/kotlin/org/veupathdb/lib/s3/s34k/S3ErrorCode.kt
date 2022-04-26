package org.veupathdb.lib.s3.s34k

/**
 * Index of S3 error codes.
 *
 * This index may not be complete.
 */
@Suppress("unused")
object S3ErrorCode {

  /**
   * The bucket does not allow ACLs.
   */
  const val AccessControlListNotSupported = "AccessControlListNotSupported"

  /**
   * Access Denied
   */
  const val AccessDenied = "AccessDenied"

  /**
   * An access point with an identical name already exists in your account.
   */
  const val AccessPointAlreadyOwnedByYou = "AccessPointAlreadyOwnedByYou"

  /**
   * There is a problem with your AWS account that prevents the operation from
   * completing successfully.
   */
  const val AccountProblem = "AccountProblem"

  /**
   * All access to this Amazon S3 resource has been disabled
   */
  const val AllAccessDisabled = "AllAccessDisabled"

  /**
   * The email address that you provided is associated with more than one
   * account.
   */
  const val AmbiguousGrantByEmailAddress = "AmbiguousGrantByEmailAddress"

  /**
   * The authorization header that you provided is not valid.
   */
  const val AuthorizationHeaderMalformed = "AuthorizationHeaderMalformed"

  /**
   * The Content-MD5 or checksum value that you specified did not match what the
   * server received.
   */
  const val BadDigest = "BadDigest"

  /**
   * The requested bucket name is not available.
   *
   * The bucket namespace is shared by all users of the system.
   */
  const val BucketAlreadyExists = "BucketAlreadyExists"

  /**
   * The bucket that you tried to create already exists, and you own it.
   */
  const val BucketAlreadyOwnedByYou = "BucketAlreadyOwnedByYou"

  /**
   * The bucket that you tried to delete is not empty.
   */
  const val BucketNotEmpty = "BucketNotEmpty"

  /**
   * Your Multi-Region Access Point idempotency token was already used for a
   * different request.
   */
  const val ClientTokenConflict = "ClientTokenConflict"

  /**
   * This request does not support credentials.
   */
  const val CredentialsNotSupported = "CredentialsNotSupported"

  /**
   * Cross-Region logging is not allowed.
   */
  const val CrossLocationLoggingProhibited = "CrossLocationLoggingProhibited"

  /**
   * Your proposed upload is smaller than the minimum allowed object size.
   */
  const val EntityTooSmall = "EntityTooSmall"

  /**
   * Your proposed upload exceeds the maximum allowed object size.
   */
  const val EntityTooLarge = "EntityTooLarge"

  /**
   * The provided token has expired.
   */
  const val ExpiredToken = "ExpiredToken"

  /**
   * You are trying to access a bucket from a different Region than where the
   * bucket exists.
   */
  const val IllegalLocationConstraintException = "IllegalLocationConstraintException"

  /**
   * The versioning configuration specified in the request is not valid.
   */
  const val IllegalVersioningConfigurationException = "IllegalVersioningConfigurationException"

  /**
   * You did not provide the number of bytes specified by the Content-Length
   * HTTP header.
   */
  const val IncompleteBody = "IncompleteBody"

  /**
   * POST requires exactly one file upload per request.
   */
  const val IncorrectNumberOfFilesInPostRequest = "IncorrectNumberOfFilesInPostRequest"

  /**
   * The inline data exceeds the maximum allowed size.
   */
  const val InlineDataTooLarge = "InlineDataTooLarge"

  /**
   * An internal error occurred.
   */
  const val InternalError = "InternalError"

  /**
   * The access key ID that you provided does not exist in our records.
   */
  const val InvalidAccessKeyId = "InvalidAccessKeyId"

  /**
   * The specified access point name or account is not valid.
   */
  const val InvalidAccessPoint = "InvalidAccessPoint"

  /**
   * The specified access point alias name is not valid.
   */
  const val InvalidAccessPointAliasError = "InvalidAccessPointAliasError"

  /**
   * You must specify the Anonymous role.
   */
  const val InvalidAddressingHeader = "InvalidAddressingHeader"

  /**
   * This error might occur for the following reasons:
   *
   * * The specified argument was not valid.
   * * The request was missing a required header.
   * * The specified argument was incomplete or in the wrong format.
   * * The specified argument must have a length greater than or equal to 3.
   */
  const val InvalidArgument = "InvalidArgument"

  /**
   * Bucket cannot have ACLs set with ObjectOwnership's BucketOwnerEnforced
   * setting.
   */
  const val InvalidBucketAclWithObjectOwnership = "InvalidBucketAclWithObjectOwnership"

  /**
   * The specified bucket is not valid.
   */
  const val InvalidBucketName = "InvalidBucketName"

  /**
   * The request is not valid for the current state of the bucket.
   */
  const val InvalidBucketState = "InvalidBucketState"

  /**
   * The Content-MD5 or checksum value that you specified is not valid.
   */
  const val InvalidDigest = "InvalidDigest"

  /**
   * The encryption request that you specified is not valid. The valid value is
   * AES256.
   */
  const val InvalidEncryptionAlgorithmError = "InvalidEncryptionAlgorithmError"

  /**
   * The specified location (Region) constraint is not valid.
   */
  const val InvalidLocationConstraint = "InvalidLocationConstraint"

  /**
   * The operation is not valid for the current state of the object.
   */
  const val InvalidObjectState = "InvalidObjectState"

  /**
   * One or more of the specified parts could not be found.
   *
   * The part might not have been uploaded, or the specified entity tag might
   * not have matched the part's entity tag.
   */
  const val InvalidPart = "InvalidPart"

  /**
   * The list of parts was not in ascending order. The parts list must be
   * specified in order by part number.
   */
  const val InvalidPartOrder = "InvalidPartOrder"

  /**
   * All access to this object has been disabled.
   */
  const val InvalidPayer = "InvalidPayer"

  /**
   * The content of the form does not meet the conditions specified in the
   * policy document.
   */
  const val InvalidPolicyDocument = "InvalidPolicyDocument"

  /**
   * The requested range is not valid for the request.
   *
   * Try another range.
   */
  const val InvalidRange = "InvalidRange"

  /**
   * This error might occur for the following reasons:
   *
   * * The request is using the wrong signature version. Use AWS4-HMAC-SHA256
   *   (Signature Version 4).
   * * An access point can be created only for an existing bucket.
   * * The access point is not in a state where it can be deleted.
   * * An access point can be listed only for an existing bucket.
   * * The next token is not valid.
   * * At least one action must be specified in a lifecycle rule.
   * * At least one lifecycle rule must be specified.
   * * The number of lifecycle rules must not exceed the allowed limit of 1000
   *   rules.
   * * The range for the MaxResults parameter is not valid.
   * * SOAP requests must be made over an HTTPS connection.
   * * Amazon S3 Transfer Acceleration is not supported for buckets with non-DNS
   *   compliant names.
   * * Amazon S3 Transfer Acceleration is not supported for buckets with periods
   *   (.) in their names.
   * * The Amazon S3 Transfer Acceleration endpoint supports only virtual style
   *   requests.
   * * Amazon S3 Transfer Acceleration is not configured on this bucket.
   * * Amazon S3 Transfer Acceleration is disabled on this bucket.
   * * Amazon S3 Transfer Acceleration is not supported on this bucket.
   * * Amazon S3 Transfer Acceleration cannot be enabled on this bucket.
   * * Conflicting values provided in HTTP headers and query parameters.
   * * Conflicting values provided in HTTP headers and POST form fields.
   */
  const val InvalidRequest = "InvalidRequest"

  /**
   * The provided security credentials are not valid.
   */
  const val InvalidSecurity = "InvalidSecurity"

  /**
   * The SOAP request body is not valid.
   */
  const val InvalidSOAPRequest = "InvalidSOAPRequest"

  /**
   * The storage class that you specified is not valid.
   */
  const val InvalidStorageClass = "InvalidStorageClass"

  /**
   * The target bucket for logging either does not exist, is not owned by you,
   * or does not have the appropriate grants for the log-delivery group.
   */
  const val InvalidTargetBucketForLogging = "InvalidTargetBucketForLogging"

  /**
   * The provided token is malformed or otherwise not valid.
   */
  const val InvalidToken = "InvalidToken"

  /**
   * The specified URI couldn't be parsed.
   */
  const val InvalidURI = "InvalidURI"

  /**
   * Your key is too long.
   */
  const val KeyTooLongError = "KeyTooLongError"

  /**
   * The ACL that you provided was not well-formed or did not validate against
   * our published schema.
   */
  const val MalformedACLError = "MalformedACLError"

  /**
   * The body of your POST request is not well-formed multipart/form-data.
   */
  const val MalformedPOSTRequest = "MalformedPOSTRequest"

  /**
   * The XML that you provided was not well-formed or did not validate against
   * our published schema.
   */
  const val MalformedXML = "MalformedXML"

  /**
   * Your request was too large.
   */
  const val MaxMessageLengthExceeded = "MaxMessageLengthExceeded"

  /**
   * Your POST request fields preceding the upload file were too large.
   */
  const val MaxPostPreDataLengthExceededError = "MaxPostPreDataLengthExceededError"

  /**
   * Your metadata headers exceed the maximum allowed metadata size.
   */
  const val MetadataTooLarge = "MetadataTooLarge"

  /**
   * The specified method is not allowed against this resource.
   */
  const val MethodNotAllowed = "MethodNotAllowed"

  /**
   * A SOAP attachment was expected, but none was found.
   */
  const val MissingAttachment = "MissingAttachment"

  /**
   * You must provide the Content-Length HTTP header.
   */
  const val MissingContentLength = "MissingContentLength"

  /**
   * You sent an empty XML document as a request.
   */
  const val MissingRequestBodyError = "MissingRequestBodyError"

  /**
   * The SOAP 1.1 request is missing a security element.
   */
  const val MissingSecurityElement = "MissingSecurityElement"

  /**
   * Your request is missing a required header.
   */
  const val MissingSecurityHeader = "MissingSecurityHeader"

  /**
   * There is no such thing as a logging status subresource for a key.
   */
  const val NoLoggingStatusForKey = "NoLoggingStatusForKey"

  /**
   * The specified bucket does not exist.
   */
  const val NoSuchBucket = "NoSuchBucket"

  /**
   * The specified bucket does not have a bucket policy.
   */
  const val NoSuchBucketPolicy = "NoSuchBucketPolicy"

  /**
   * The specified bucket does not have a CORS configuration.
   */
  const val NoSuchCORSConfiguration = "NoSuchCORSConfiguration"

  /**
   * The specified key does not exist.
   */
  const val NoSuchKey = "NoSuchKey"

  /**
   * The specified lifecycle configuration does not exist.
   */
  const val NoSuchLifecycleConfiguration = "NoSuchLifecycleConfiguration"

  /**
   * The specified Multi-Region Access Point does not exist.
   */
  const val NoSuchMultiRegionAccessPoint = "NoSuchMultiRegionAccessPoint"

  /**
   * The specified bucket does not have a website configuration.
   */
  const val NoSuchWebsiteConfiguration = "NoSuchWebsiteConfiguration"

  /**
   * The specified tag does not exist.
   */
  const val NoSuchTagSet = "NoSuchTagSet"

  /**
   * The specified multipart upload does not exist.
   *
   * The upload ID might not be valid, or the multipart upload might have been
   * aborted or completed.
   */
  const val NoSuchUpload = "NoSuchUpload"

  /**
   * The version ID specified in the request does not match an existing version.
   */
  const val NoSuchVersion = "NoSuchVersion"

  /**
   * A header that you provided implies functionality that is not implemented.
   */
  const val NotImplemented = "NotImplemented"

  /**
   * The resource was not changed.
   */
  const val NotModified = "NotModified"

  /**
   * Your account is not signed up for the Amazon S3 service.
   */
  const val NotSignedUp = "NotSignedUp"

  /**
   * The bucket ownership controls were not found.
   */
  const val OwnershipControlsNotFoundError = "OwnershipControlsNotFoundError"

  /**
   * A conflicting conditional operation is currently in progress against this
   * resource. Try again.
   */
  const val OperationAborted = "OperationAborted"

  /**
   * The bucket that you are attempting to access must be addressed using the
   * specified endpoint. Send all future requests to this endpoint.
   */
  const val PermanentRedirect = "PermanentRedirect"

  /**
   * At least one of the preconditions that you specified did not hold.
   */
  const val PreconditionFailed = "PreconditionFailed"

  /**
   * Temporary redirect.
   *
   * You are being redirected to the bucket while the Domain Name System (DNS)
   * server is being updated.
   */
  const val Redirect = "Redirect"

  /**
   * The request header and query parameters used to make the request exceed the
   * maximum allowed size.
   */
  const val RequestHeaderSectionTooLarge = "RequestHeaderSectionTooLarge"

  /**
   * A bucket POST request must be of the enclosure-type multipart/form-data.
   */
  const val RequestIsNotMultiPartContent = "RequestIsNotMultiPartContent"

  /**
   * Your socket connection to the server was not read from or written to within
   * the timeout period.
   */
  const val RequestTimeout = "RequestTimeout"

  /**
   * The difference between the request time and the server's time is too large.
   */
  const val RequestTimeTooSkewed = "RequestTimeTooSkewed"

  /**
   * Requesting the torrent file of a bucket is not permitted.
   */
  const val RequestTorrentOfBucketError = "RequestTorrentOfBucketError"

  /**
   * The object restore is already in progress.
   */
  const val RestoreAlreadyInProgress = "RestoreAlreadyInProgress"

  /**
   * The server-side encryption configuration was not found.
   */
  const val ServerSideEncryptionConfigurationNotFoundError = "ServerSideEncryptionConfigurationNotFoundError"

  /**
   * Reduce your request rate.
   */
  const val ServiceUnavailable = "ServiceUnavailable"

  /**
   * The request signature that the server calculated does not match the
   * signature that you provided.
   */
  const val SignatureDoesNotMatch = "SignatureDoesNotMatch"

  /**
   * Reduce your request rate.
   */
  const val SlowDown = "SlowDown"

  /**
   * You are being redirected to the bucket while the Domain Name System (DNS)
   * server is being updated.
   */
  const val TemporaryRedirect = "TemporaryRedirect"

  /**
   * The provided token must be refreshed.
   */
  const val TokenRefreshRequired = "TokenRefreshRequired"

  /**
   * You have attempted to create more access points than are allowed for an
   * account.
   */
  const val TooManyAccessPoints = "TooManyAccessPoints"

  /**
   * You have attempted to create more buckets than are allowed for an account.
   */
  const val TooManyBuckets = "TooManyBuckets"

  /**
   * You have attempted to create a Multi-Region Access Point with more Regions
   * than are allowed for an account.
   */
  const val TooManyMultiRegionAccessPointregionsError = "TooManyMultiRegionAccessPointregionsError"

  /**
   * You have attempted to create more Multi-Region Access Points than are
   * allowed for an account.
   */
  const val TooManyMultiRegionAccessPoints = "TooManyMultiRegionAccessPoints"

  /**
   * This request contains unsupported content.
   */
  const val UnexpectedContent = "UnexpectedContent"

  /**
   * The email address that you provided does not match any account on record.
   */
  const val UnresolvableGrantByEmailAddress = "UnresolvableGrantByEmailAddress"

  /**
   * The bucket POST request must contain the specified field name.
   *
   * If it is specified, check the order of the fields.
   */
  const val UserKeyMustBeSpecified = "UserKeyMustBeSpecified"

  /**
   * The specified access point does not exist.
   */
  const val NoSuchAccessPoint = "NoSuchAccessPoint"

  /**
   * Your request contains tag input that is not valid.
   */
  const val InvalidTag = "InvalidTag"

  /**
   * Your policy contains a principal that is not valid.
   */
  const val MalformedPolicy = "MalformedPolicy"
}