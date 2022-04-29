---
title: S3RequestParams
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.requests](../index.html)/[S3RequestParams](index.html)



# S3RequestParams



[jvm]\
interface [S3RequestParams](index.html)

Represents a basic S3 request.



#### Author



Elizabeth Paige Harper https://github.com/Foxcapades



#### Since



v0.1.0



## Properties


| Name | Summary |
|---|---|
| [headers](headers.html) | [jvm]<br>abstract val [headers](headers.html): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.html)<br>Additional/custom headers to send with the S3 operation request. |
| [queryParams](query-params.html) | [jvm]<br>abstract val [queryParams](query-params.html): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.html)<br>Additional/custom query parameters to send with the S3 operation request. |


## Inheritors


| Name |
|---|
| [S3RegionRequestParams](../-s3-region-request-params/index.html) |
| [S3RBDBucketDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.bucket.recursive/-s3-r-b-d-bucket-delete-params/index.html) |
| [S3RBDObjectDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.bucket.recursive/-s3-r-b-d-object-delete-params/index.html) |
| [S3RBDObjectListParams](../../org.veupathdb.lib.s3.s34k.requests.bucket.recursive/-s3-r-b-d-object-list-params/index.html) |
| [S3BucketListParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-list-params/index.html) |

