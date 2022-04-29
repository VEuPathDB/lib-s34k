---
title: S3ObjectMeta
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.response.object](../index.html)/[S3ObjectMeta](index.html)



# S3ObjectMeta



[jvm]\
interface [S3ObjectMeta](index.html) : [S3ObjectResponse](../-s3-object-response/index.html)



## Properties


| Name | Summary |
|---|---|
| [bucket](../../org.veupathdb.lib.s3.s34k.response/-s3-response/bucket.html) | [jvm]<br>abstract val [bucket](../../org.veupathdb.lib.s3.s34k.response/-s3-response/bucket.html): [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.html) |
| [contentType](content-type.html) | [jvm]<br>abstract val [contentType](content-type.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [eTag](e-tag.html) | [jvm]<br>abstract val [eTag](e-tag.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [headers](../../org.veupathdb.lib.s3.s34k.response/-s3-response/headers.html) | [jvm]<br>abstract val [headers](../../org.veupathdb.lib.s3.s34k.response/-s3-response/headers.html): [S3Headers](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers/index.html) |
| [lastModified](last-modified.html) | [jvm]<br>abstract val [lastModified](last-modified.html): [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) |
| [legalHold](legal-hold.html) | [jvm]<br>abstract val [legalHold](legal-hold.html): [S3LegalHold](../../org.veupathdb.lib.s3.s34k/-s3-legal-hold/index.html)? |
| [path](../-s3-object-response/path.html) | [jvm]<br>abstract val [path](../-s3-object-response/path.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [region](../../org.veupathdb.lib.s3.s34k.response/-s3-response/region.html) | [jvm]<br>abstract val [region](../../org.veupathdb.lib.s3.s34k.response/-s3-response/region.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [retentionMode](retention-mode.html) | [jvm]<br>abstract val [retentionMode](retention-mode.html): [S3RetentionMode](../../org.veupathdb.lib.s3.s34k/-s3-retention-mode/index.html)? |
| [size](size.html) | [jvm]<br>abstract val [size](size.html): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |

