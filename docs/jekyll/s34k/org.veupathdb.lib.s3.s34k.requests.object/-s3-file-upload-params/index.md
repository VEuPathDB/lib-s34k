---
title: S3FileUploadParams
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.requests.object](../index.html)/[S3FileUploadParams](index.html)



# S3FileUploadParams



[jvm]\
interface [S3FileUploadParams](index.html) : [S3ObjectWriteParams](../-s3-object-write-params/index.html)

File upload request parameters.



#### Author



Elizabeth Paige Harper https://github.com/Foxcapades



#### Since



v0.1.0



## Properties


| Name | Summary |
|---|---|
| [callback](callback.html) | [jvm]<br>abstract var [callback](callback.html): ([S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?<br>Optional callback that will be executed on successful completion of the S3 operation. |
| [contentType](content-type.html) | [jvm]<br>abstract var [contentType](content-type.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Optional content type for the file being uploaded. |
| [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.html) | [jvm]<br>abstract val [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.html): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.html)<br>Additional/custom headers to send with the S3 operation request. |
| [localFile](local-file.html) | [jvm]<br>abstract var [localFile](local-file.html): [File](https://docs.oracle.com/javase/8/docs/api/java/io/File.html)?<br>*Required* handle on the local file that will be uploaded to the S3 store. |
| [partSize](part-size.html) | [jvm]<br>abstract var [partSize](part-size.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Max chunk size to send in a single request to the S3 store. |
| [path](../-s3-object-request-params/path.html) | [jvm]<br>abstract var [path](../-s3-object-request-params/path.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>*Required* path to the object target of this request. |
| [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.html) | [jvm]<br>abstract val [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.html): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.html)<br>Additional/custom query parameters to send with the S3 operation request. |
| [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.html) | [jvm]<br>abstract var [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [tags](../../org.veupathdb.lib.s3.s34k.requests/-s3-tag-create-params/tags.html) | [jvm]<br>abstract val [tags](../../org.veupathdb.lib.s3.s34k.requests/-s3-tag-create-params/tags.html): [S3MutableTagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-mutable-tag-map/index.html)<br>Tags that will be attached to the target object. |

