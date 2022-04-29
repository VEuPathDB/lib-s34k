---
title: org.veupathdb.lib.s3.s34k.requests.bucket.recursive
---
//[s34k](../../index.html)/[org.veupathdb.lib.s3.s34k.requests.bucket.recursive](index.html)



# Package org.veupathdb.lib.s3.s34k.requests.bucket.recursive



## Types


| Name | Summary |
|---|---|
| [RecursiveBucketDeleteError](-recursive-bucket-delete-error/index.html) | [jvm]<br>open class [RecursiveBucketDeleteError](-recursive-bucket-delete-error/index.html) : [S34kException](../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html)<br>Represents and exception thrown during any phase of the complex action of recursively deleting an S3 bucket. |
| [RecursiveBucketDeleteObjectDeleteError](-recursive-bucket-delete-object-delete-error/index.html) | [jvm]<br>open class [RecursiveBucketDeleteObjectDeleteError](-recursive-bucket-delete-object-delete-error/index.html) : [RecursiveBucketDeleteError](-recursive-bucket-delete-error/index.html)<br>Represents and exception thrown during the object deletion phase of the complex action of recursively deleting an S3 bucket. |
| [S3ClientRecursiveBucketDeleteParams](-s3-client-recursive-bucket-delete-params/index.html) | [jvm]<br>interface [S3ClientRecursiveBucketDeleteParams](-s3-client-recursive-bucket-delete-params/index.html) : [S3RecursiveBucketDeleteParams](-s3-recursive-bucket-delete-params/index.html)<br>Client Recursive Bucket Delete Params. |
| [S3RBDBucketDeleteParams](-s3-r-b-d-bucket-delete-params/index.html) | [jvm]<br>interface [S3RBDBucketDeleteParams](-s3-r-b-d-bucket-delete-params/index.html) : [S3RequestParams](../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/index.html)<br>Request parameters for the Bucket Delete phase of the recursive bucket delete operation. |
| [S3RBDObjectDeleteParams](-s3-r-b-d-object-delete-params/index.html) | [jvm]<br>interface [S3RBDObjectDeleteParams](-s3-r-b-d-object-delete-params/index.html) : [S3RequestParams](../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/index.html)<br>Request parameters for the Object Delete phase of the recursive bucket delete operation. |
| [S3RBDObjectListParams](-s3-r-b-d-object-list-params/index.html) | [jvm]<br>interface [S3RBDObjectListParams](-s3-r-b-d-object-list-params/index.html) : [S3RequestParams](../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/index.html)<br>Request parameters for the Object List phase of the recursive bucket delete operation. |
| [S3RecursiveBucketDeleteParams](-s3-recursive-bucket-delete-params/index.html) | [jvm]<br>interface [S3RecursiveBucketDeleteParams](-s3-recursive-bucket-delete-params/index.html) : [S3RegionRequestParams](../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/index.html)<br>Recursive Bucket Delete Request Parameters. |
| [S3RecursiveDeletePhase](-s3-recursive-delete-phase/index.html) | [jvm]<br>enum [S3RecursiveDeletePhase](-s3-recursive-delete-phase/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[S3RecursiveDeletePhase](-s3-recursive-delete-phase/index.html)&gt; <br>Represents and defines the different phases of a recursive bucket delete operation. |

