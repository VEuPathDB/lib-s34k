//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k](../index.md)/[S3ResponseHeader](index.md)/[ChecksumCRC32C](-checksum-c-r-c32-c.md)

# ChecksumCRC32C

[jvm]\
const val [ChecksumCRC32C](-checksum-c-r-c32-c.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)

x-amz-checksum-crc32c

The base64-encoded, 32-bit CRC32C checksum of the object. This will only be present if it was uploaded with the object. With multipart uploads, this may not be a checksum value of the object. For more information about how checksums are calculated with multipart uploads, see "Checking Object Integrity" in the Amazon S3 User Guide.
