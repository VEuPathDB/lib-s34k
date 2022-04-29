//[s34k](../../index.md)/[org.veupathdb.lib.s3.s34k.errors](index.md)

# Package org.veupathdb.lib.s3.s34k.errors

## Types

| Name | Summary |
|---|---|
| [AbstractBucketOperationException](-abstract-bucket-operation-exception/index.md) | [jvm]<br>abstract class [AbstractBucketOperationException](-abstract-bucket-operation-exception/index.md) : [AbstractResponseException](-abstract-response-exception/index.md)<br>Base type for exceptions resulting from single bucket operations. |
| [AbstractResponseException](-abstract-response-exception/index.md) | [jvm]<br>abstract class [AbstractResponseException](-abstract-response-exception/index.md) : [S34kException](-s34k-exception/index.md)<br>Base type for exceptions thrown based on errors returned by the S3 API. |
| [BucketAlreadyExistsException](-bucket-already-exists-exception/index.md) | [jvm]<br>open class [BucketAlreadyExistsException](-bucket-already-exists-exception/index.md) : [AbstractBucketOperationException](-abstract-bucket-operation-exception/index.md)<br>BucketAlreadyExists |
| [BucketAlreadyOwnedByYouException](-bucket-already-owned-by-you-exception/index.md) | [jvm]<br>class [BucketAlreadyOwnedByYouException](-bucket-already-owned-by-you-exception/index.md) : [BucketAlreadyExistsException](-bucket-already-exists-exception/index.md)<br>BucketAlreadyOwnedByYou |
| [BucketNotEmptyException](-bucket-not-empty-exception/index.md) | [jvm]<br>class [BucketNotEmptyException](-bucket-not-empty-exception/index.md) : [AbstractBucketOperationException](-abstract-bucket-operation-exception/index.md)<br>Bucket is not empty exception. |
| [BucketNotFoundException](-bucket-not-found-exception/index.md) | [jvm]<br>class [BucketNotFoundException](-bucket-not-found-exception/index.md) : [AbstractBucketOperationException](-abstract-bucket-operation-exception/index.md)<br>NoSuchBucket |
| [InvalidRequestConfigException](-invalid-request-config-exception/index.md) | [jvm]<br>class [InvalidRequestConfigException](-invalid-request-config-exception/index.md) : [S34kException](-s34k-exception/index.md)<br>Exception thrown due to an invalid request/operation configuration. |
| [ObjectNotFoundException](-object-not-found-exception/index.md) | [jvm]<br>class [ObjectNotFoundException](-object-not-found-exception/index.md) : [AbstractResponseException](-abstract-response-exception/index.md)<br>NoSuchKey |
| [S34kException](-s34k-exception/index.md) | [jvm]<br>open class [S34kException](-s34k-exception/index.md) : [RuntimeException](https://docs.oracle.com/javase/8/docs/api/java/lang/RuntimeException.html)<br>Generalized error wrapping a client implementation specific exception. |
