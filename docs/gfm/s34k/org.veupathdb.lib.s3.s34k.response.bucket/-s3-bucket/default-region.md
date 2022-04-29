//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.response.bucket](../index.md)/[S3Bucket](index.md)/[defaultRegion](default-region.md)

# defaultRegion

[jvm]\
abstract val [defaultRegion](default-region.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?

Region of this bucket.

This value will be used as a fallback for operations where no region is configured.

If this value is null and a set of operation parameters also has a null region, no region will be set on the operation.
