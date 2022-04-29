//[s34k](../../index.md)/[org.veupathdb.lib.s3.s34k](index.md)

# Package org.veupathdb.lib.s3.s34k

## Types

| Name | Summary |
|---|---|
| [S3Api](-s3-api/index.md) | [jvm]<br>object [S3Api](-s3-api/index.md)<br>S3 API Client Provider |
| [S3Client](-s3-client/index.md) | [jvm]<br>interface [S3Client](-s3-client/index.md)<br>S3 API Wrapper |
| [S3ClientProvider](-s3-client-provider/index.md) | [jvm]<br>interface [S3ClientProvider](-s3-client-provider/index.md)<br>S3 Client Provider |
| [S3Config](-s3-config/index.md) | [jvm]<br>data class [S3Config](-s3-config/index.md)(url: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), port: [UShort](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-short/index.html), secure: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), accessKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), secretKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), region: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)<br>S3 Client Configuration |
| [S3ErrorCode](-s3-error-code/index.md) | [jvm]<br>object [S3ErrorCode](-s3-error-code/index.md)<br>Index of S3 error codes. |
| [S3LegalHold](-s3-legal-hold/index.md) | [jvm]<br>enum [S3LegalHold](-s3-legal-hold/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[S3LegalHold](-s3-legal-hold/index.md)&gt; <br>S3 Legal Holds |
| [S3RequestParam](-s3-request-param/index.md) | [jvm]<br>object [S3RequestParam](-s3-request-param/index.md)<br>Index of valid x-amz-* request headers and URI parameters. |
| [S3ResponseHeader](-s3-response-header/index.md) | [jvm]<br>object [S3ResponseHeader](-s3-response-header/index.md)<br>Index of valid x-amz-* response headers. |
| [S3RetentionMode](-s3-retention-mode/index.md) | [jvm]<br>enum [S3RetentionMode](-s3-retention-mode/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[S3RetentionMode](-s3-retention-mode/index.md)&gt; <br>S3 Retention Modes |
| [S3Tag](-s3-tag/index.md) | [jvm]<br>data class [S3Tag](-s3-tag/index.md)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Represents a single tag attached to a target object or bucket in an S3 store. |
