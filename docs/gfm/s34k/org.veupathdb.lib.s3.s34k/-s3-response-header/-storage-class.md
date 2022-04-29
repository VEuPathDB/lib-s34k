//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k](../index.md)/[S3ResponseHeader](index.md)/[StorageClass](-storage-class.md)

# StorageClass

[jvm]\
const val [StorageClass](-storage-class.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)

x-amz-storage-class

Provides storage class information of the object. Amazon S3 returns this header for all objects except for S3 Standard storage class objects.

For more information, see "Storage Classes".

Valid Values:

- 
   STANDARD
- 
   REDUCED_REDUNDANCY
- 
   STANDARD_IA
- 
   ONEZONE_IA
- 
   INTELLIGENT_TIERING
- 
   GLACIER
- 
   DEEP_ARCHIVE
- 
   OUTPOSTS
- 
   GLACIER_IR
