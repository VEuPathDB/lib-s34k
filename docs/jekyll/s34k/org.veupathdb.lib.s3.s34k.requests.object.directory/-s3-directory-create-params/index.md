---
title: S3DirectoryCreateParams
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.requests.object.directory](../index.html)/[S3DirectoryCreateParams](index.html)



# S3DirectoryCreateParams



[jvm]\
interface [S3DirectoryCreateParams](index.html) : [S3ObjectWriteParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-write-params/index.html)

Directory creation operation parameters.



#### Author



Elizabeth Paige Harper https://github.com/Foxcapades



#### Since



v0.1.0



## Properties


| Name | Summary |
|---|---|
| [callback](callback.html) | [jvm]<br>abstract var [callback](callback.html): ([S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?<br>Optional callback that will be executed on successful completion of the S3 operation. |
| [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.html) | [jvm]<br>abstract val [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.html): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.html)<br>Additional/custom headers to send with the S3 operation request. |
| [path](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-request-params/path.html) | [jvm]<br>abstract var [path](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-request-params/path.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>*Required* path to the object target of this request. |
| [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.html) | [jvm]<br>abstract val [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.html): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.html)<br>Additional/custom query parameters to send with the S3 operation request. |
| [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.html) | [jvm]<br>abstract var [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [tags](../../org.veupathdb.lib.s3.s34k.requests/-s3-tag-create-params/tags.html) | [jvm]<br>abstract val [tags](../../org.veupathdb.lib.s3.s34k.requests/-s3-tag-create-params/tags.html): [S3MutableTagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-mutable-tag-map/index.html)<br>Tags that will be attached to the target object. |

