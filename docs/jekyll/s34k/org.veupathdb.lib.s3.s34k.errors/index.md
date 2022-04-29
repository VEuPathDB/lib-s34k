---
title: org.veupathdb.lib.s3.s34k.errors
---
//[s34k](../../index.html)/[org.veupathdb.lib.s3.s34k.errors](index.html)



# Package org.veupathdb.lib.s3.s34k.errors



## Types


| Name | Summary |
|---|---|
| [AbstractBucketOperationException](-abstract-bucket-operation-exception/index.html) | [jvm]<br>abstract class [AbstractBucketOperationException](-abstract-bucket-operation-exception/index.html) : [AbstractResponseException](-abstract-response-exception/index.html)<br>Base type for exceptions resulting from single bucket operations. |
| [AbstractResponseException](-abstract-response-exception/index.html) | [jvm]<br>abstract class [AbstractResponseException](-abstract-response-exception/index.html) : [S34kException](-s34k-exception/index.html)<br>Base type for exceptions thrown based on errors returned by the S3 API. |
| [BucketAlreadyExistsException](-bucket-already-exists-exception/index.html) | [jvm]<br>open class [BucketAlreadyExistsException](-bucket-already-exists-exception/index.html) : [AbstractBucketOperationException](-abstract-bucket-operation-exception/index.html)<br>BucketAlreadyExists |
| [BucketAlreadyOwnedByYouException](-bucket-already-owned-by-you-exception/index.html) | [jvm]<br>class [BucketAlreadyOwnedByYouException](-bucket-already-owned-by-you-exception/index.html) : [BucketAlreadyExistsException](-bucket-already-exists-exception/index.html)<br>BucketAlreadyOwnedByYou |
| [BucketNotEmptyException](-bucket-not-empty-exception/index.html) | [jvm]<br>class [BucketNotEmptyException](-bucket-not-empty-exception/index.html) : [AbstractBucketOperationException](-abstract-bucket-operation-exception/index.html)<br>Bucket is not empty exception. |
| [BucketNotFoundException](-bucket-not-found-exception/index.html) | [jvm]<br>class [BucketNotFoundException](-bucket-not-found-exception/index.html) : [AbstractBucketOperationException](-abstract-bucket-operation-exception/index.html)<br>NoSuchBucket |
| [InvalidRequestConfigException](-invalid-request-config-exception/index.html) | [jvm]<br>class [InvalidRequestConfigException](-invalid-request-config-exception/index.html) : [S34kException](-s34k-exception/index.html)<br>Exception thrown due to an invalid request/operation configuration. |
| [ObjectNotFoundException](-object-not-found-exception/index.html) | [jvm]<br>class [ObjectNotFoundException](-object-not-found-exception/index.html) : [AbstractResponseException](-abstract-response-exception/index.html)<br>NoSuchKey |
| [S34kException](-s34k-exception/index.html) | [jvm]<br>open class [S34kException](-s34k-exception/index.html) : [RuntimeException](https://docs.oracle.com/javase/8/docs/api/java/lang/RuntimeException.html)<br>Generalized error wrapping a client implementation specific exception. |

