---
title: ChecksumSHA256
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k](../index.html)/[S3ResponseHeader](index.html)/[ChecksumSHA256](-checksum-s-h-a256.html)



# ChecksumSHA256



[jvm]\
const val [ChecksumSHA256](-checksum-s-h-a256.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)



x-amz-checksum-sha256



The base64-encoded, 256-bit SHA-256 digest of the object. This will only be present if it was uploaded with the object. With multipart uploads, this may not be a checksum value of the object. For more information about how checksums are calculated with multipart uploads, see "Checking Object Integrity" in the Amazon S3 User Guide.




