---
title: defaultRegion
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.response.bucket](../index.html)/[S3Bucket](index.html)/[defaultRegion](default-region.html)



# defaultRegion



[jvm]\
abstract val [defaultRegion](default-region.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?



Region of this bucket.



This value will be used as a fallback for operations where no region is configured.



If this value is null and a set of operation parameters also has a null region, no region will be set on the operation.




