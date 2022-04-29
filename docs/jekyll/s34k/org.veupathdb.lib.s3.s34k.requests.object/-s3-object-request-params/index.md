---
title: S3ObjectRequestParams
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.requests.object](../index.html)/[S3ObjectRequestParams](index.html)



# S3ObjectRequestParams



[jvm]\
interface [S3ObjectRequestParams](index.html) : [S3RegionRequestParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/index.html)

Base parameters for operations relating to a target S3 object.



#### Author



Elizabeth Paige Harper https://github.com/Foxcapades



#### Since



v0.1.0



## Properties


| Name | Summary |
|---|---|
| [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.html) | [jvm]<br>abstract val [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.html): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.html)<br>Additional/custom headers to send with the S3 operation request. |
| [path](path.html) | [jvm]<br>abstract var [path](path.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>*Required* path to the object target of this request. |
| [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.html) | [jvm]<br>abstract val [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.html): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.html)<br>Additional/custom query parameters to send with the S3 operation request. |
| [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.html) | [jvm]<br>abstract var [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |


## Inheritors


| Name |
|---|
| [S3ObjectDeleteParams](../-s3-object-delete-params/index.html) |
| [S3ObjectDownloadParams](../-s3-object-download-params/index.html) |
| [S3ObjectExistsParams](../-s3-object-exists-params/index.html) |
| [S3ObjectGetParams](../-s3-object-get-params/index.html) |
| [S3ObjectStatParams](../-s3-object-stat-params/index.html) |
| [S3ObjectTagDeleteParams](../-s3-object-tag-delete-params/index.html) |
| [S3ObjectTagGetParams](../-s3-object-tag-get-params/index.html) |
| [S3ObjectWriteParams](../-s3-object-write-params/index.html) |
| [S3DirectoryDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-s3-directory-delete-params/index.html) |

