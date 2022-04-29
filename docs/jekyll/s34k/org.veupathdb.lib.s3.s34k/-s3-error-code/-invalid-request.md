---
title: InvalidRequest
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k](../index.html)/[S3ErrorCode](index.html)/[InvalidRequest](-invalid-request.html)



# InvalidRequest



[jvm]\
const val [InvalidRequest](-invalid-request.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)



This error might occur for the following reasons:



- 
   The request is using the wrong signature version. Use AWS4-HMAC-SHA256 (Signature Version 4).
- 
   An access point can be created only for an existing bucket.
- 
   The access point is not in a state where it can be deleted.
- 
   An access point can be listed only for an existing bucket.
- 
   The next token is not valid.
- 
   At least one action must be specified in a lifecycle rule.
- 
   At least one lifecycle rule must be specified.
- 
   The number of lifecycle rules must not exceed the allowed limit of 1000 rules.
- 
   The range for the MaxResults parameter is not valid.
- 
   SOAP requests must be made over an HTTPS connection.
- 
   Amazon S3 Transfer Acceleration is not supported for buckets with non-DNS compliant names.
- 
   Amazon S3 Transfer Acceleration is not supported for buckets with periods (.) in their names.
- 
   The Amazon S3 Transfer Acceleration endpoint supports only virtual style requests.
- 
   Amazon S3 Transfer Acceleration is not configured on this bucket.
- 
   Amazon S3 Transfer Acceleration is disabled on this bucket.
- 
   Amazon S3 Transfer Acceleration is not supported on this bucket.
- 
   Amazon S3 Transfer Acceleration cannot be enabled on this bucket.
- 
   Conflicting values provided in HTTP headers and query parameters.
- 
   Conflicting values provided in HTTP headers and POST form fields.





