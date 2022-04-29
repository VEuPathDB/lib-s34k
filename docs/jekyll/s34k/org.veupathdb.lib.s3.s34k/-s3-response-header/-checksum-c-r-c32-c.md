---
title: ChecksumCRC32C
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k](../index.html)/[S3ResponseHeader](index.html)/[ChecksumCRC32C](-checksum-c-r-c32-c.html)



# ChecksumCRC32C



[jvm]\
const val [ChecksumCRC32C](-checksum-c-r-c32-c.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)



x-amz-checksum-crc32c



The base64-encoded, 32-bit CRC32C checksum of the object. This will only be present if it was uploaded with the object. With multipart uploads, this may not be a checksum value of the object. For more information about how checksums are calculated with multipart uploads, see "Checking Object Integrity" in the Amazon S3 User Guide.




