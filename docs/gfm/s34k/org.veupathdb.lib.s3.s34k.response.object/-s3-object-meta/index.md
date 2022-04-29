//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.response.object](../index.md)/[S3ObjectMeta](index.md)

# S3ObjectMeta

[jvm]\
interface [S3ObjectMeta](index.md) : [S3ObjectResponse](../-s3-object-response/index.md)

## Properties

| Name | Summary |
|---|---|
| [bucket](../../org.veupathdb.lib.s3.s34k.response/-s3-response/bucket.md) | [jvm]<br>abstract val [bucket](../../org.veupathdb.lib.s3.s34k.response/-s3-response/bucket.md): [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.md) |
| [contentType](content-type.md) | [jvm]<br>abstract val [contentType](content-type.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [eTag](e-tag.md) | [jvm]<br>abstract val [eTag](e-tag.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [headers](../../org.veupathdb.lib.s3.s34k.response/-s3-response/headers.md) | [jvm]<br>abstract val [headers](../../org.veupathdb.lib.s3.s34k.response/-s3-response/headers.md): [S3Headers](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers/index.md) |
| [lastModified](last-modified.md) | [jvm]<br>abstract val [lastModified](last-modified.md): [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) |
| [legalHold](legal-hold.md) | [jvm]<br>abstract val [legalHold](legal-hold.md): [S3LegalHold](../../org.veupathdb.lib.s3.s34k/-s3-legal-hold/index.md)? |
| [path](../-s3-object-response/path.md) | [jvm]<br>abstract val [path](../-s3-object-response/path.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [region](../../org.veupathdb.lib.s3.s34k.response/-s3-response/region.md) | [jvm]<br>abstract val [region](../../org.veupathdb.lib.s3.s34k.response/-s3-response/region.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [retentionMode](retention-mode.md) | [jvm]<br>abstract val [retentionMode](retention-mode.md): [S3RetentionMode](../../org.veupathdb.lib.s3.s34k/-s3-retention-mode/index.md)? |
| [size](size.md) | [jvm]<br>abstract val [size](size.md): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
