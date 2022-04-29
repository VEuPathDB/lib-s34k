---
title: S3ClientRecursiveBucketDeleteParams
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.requests.bucket.recursive](../index.html)/[S3ClientRecursiveBucketDeleteParams](index.html)



# S3ClientRecursiveBucketDeleteParams



[jvm]\
interface [S3ClientRecursiveBucketDeleteParams](index.html) : [S3RecursiveBucketDeleteParams](../-s3-recursive-bucket-delete-params/index.html)

Client Recursive Bucket Delete Params.



Recursive bucket delete parameters used by calls to the [S3Client.deleteBucketRecursive](../../org.veupathdb.lib.s3.s34k/-s3-client/delete-bucket-recursive.html) method.



This type is based on the [S3RecursiveBucketDeleteParams](../-s3-recursive-bucket-delete-params/index.html) with the additional field bucketName.



For additional information about recursive bucket deletion, see the [S3RecursiveBucketDeleteParams](../-s3-recursive-bucket-delete-params/index.html) documentation.



#### Author



Elizabeth Paige Harper https://github.com/Foxcapades



#### Since



v0.1.0



## Properties


| Name | Summary |
|---|---|
| [bucketDelete](../-s3-recursive-bucket-delete-params/bucket-delete.html) | [jvm]<br>abstract val [bucketDelete](../-s3-recursive-bucket-delete-params/bucket-delete.html): [S3RBDBucketDeleteParams](../-s3-r-b-d-bucket-delete-params/index.html)<br>Bucket delete operation parameters. |
| [bucketName](bucket-name.html) | [jvm]<br>abstract var [bucketName](bucket-name.html): [BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.html)?<br>*Required* name of the target S3 bucket. |
| [headers](../-s3-recursive-bucket-delete-params/headers.html) | [jvm]<br>abstract override val [headers](../-s3-recursive-bucket-delete-params/headers.html): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.html)<br>Headers that will be applied to all requests in all phases of the recursive bucket delete operation. |
| [objectDelete](../-s3-recursive-bucket-delete-params/object-delete.html) | [jvm]<br>abstract val [objectDelete](../-s3-recursive-bucket-delete-params/object-delete.html): [S3RBDObjectDeleteParams](../-s3-r-b-d-object-delete-params/index.html)<br>Bulk object delete operation parameters. |
| [objectFetch](../-s3-recursive-bucket-delete-params/object-fetch.html) | [jvm]<br>abstract val [objectFetch](../-s3-recursive-bucket-delete-params/object-fetch.html): [S3RBDObjectListParams](../-s3-r-b-d-object-list-params/index.html)<br>Object list operation parameters. |
| [queryParams](../-s3-recursive-bucket-delete-params/query-params.html) | [jvm]<br>abstract override val [queryParams](../-s3-recursive-bucket-delete-params/query-params.html): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.html)<br>Query parameters that will be applied to all requests in all phases of the recursive bucket delete operation. |
| [region](../-s3-recursive-bucket-delete-params/region.html) | [jvm]<br>abstract override var [region](../-s3-recursive-bucket-delete-params/region.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Global region value that will be applied to all requests in all phases of the recursive bucket delete operation. |

