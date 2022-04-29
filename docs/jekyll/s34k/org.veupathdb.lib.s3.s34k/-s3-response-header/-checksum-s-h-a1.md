---
title: ChecksumSHA1
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k](../index.html)/[S3ResponseHeader](index.html)/[ChecksumSHA1](-checksum-s-h-a1.html)



# ChecksumSHA1



[jvm]\
const val [ChecksumSHA1](-checksum-s-h-a1.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)



x-amz-checksum-sha1



The base64-encoded, 160-bit SHA-1 digest of the object. This will only be present if it was uploaded with the object. With multipart uploads, this may not be a checksum value of the object. For more information about how checksums are calculated with multipart uploads, see "Checking Object Integrity" in the Amazon S3 User Guide.




