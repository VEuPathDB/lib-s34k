---
title: org.veupathdb.lib.s3.s34k.requests.object
---
//[s34k](../../index.html)/[org.veupathdb.lib.s3.s34k.requests.object](index.html)



# Package org.veupathdb.lib.s3.s34k.requests.object



## Types


| Name | Summary |
|---|---|
| [ObjectDeleteError](-object-delete-error/index.html) | [jvm]<br>class [ObjectDeleteError](-object-delete-error/index.html) : [S34kException](../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html)<br>Object deletion error. |
| [S3FileUploadParams](-s3-file-upload-params/index.html) | [jvm]<br>interface [S3FileUploadParams](-s3-file-upload-params/index.html) : [S3ObjectWriteParams](-s3-object-write-params/index.html)<br>File upload request parameters. |
| [S3MultiObjectDeleteParams](-s3-multi-object-delete-params/index.html) | [jvm]<br>interface [S3MultiObjectDeleteParams](-s3-multi-object-delete-params/index.html) : [S3RegionRequestParams](../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/index.html)<br>Multi-Object delete request parameters. |
| [S3ObjectCreateParams](-s3-object-create-params/index.html) | [jvm]<br>interface [S3ObjectCreateParams](-s3-object-create-params/index.html) : [S3ObjectWriteParams](-s3-object-write-params/index.html) |
| [S3ObjectDeleteParams](-s3-object-delete-params/index.html) | [jvm]<br>interface [S3ObjectDeleteParams](-s3-object-delete-params/index.html) : [S3ObjectRequestParams](-s3-object-request-params/index.html)<br>Object delete request parameters. |
| [S3ObjectDownloadParams](-s3-object-download-params/index.html) | [jvm]<br>interface [S3ObjectDownloadParams](-s3-object-download-params/index.html) : [S3ObjectRequestParams](-s3-object-request-params/index.html)<br>Object download request parameters. |
| [S3ObjectExistsParams](-s3-object-exists-params/index.html) | [jvm]<br>interface [S3ObjectExistsParams](-s3-object-exists-params/index.html) : [S3ObjectRequestParams](-s3-object-request-params/index.html)<br>Object existence test request parameters. |
| [S3ObjectGetParams](-s3-object-get-params/index.html) | [jvm]<br>interface [S3ObjectGetParams](-s3-object-get-params/index.html) : [S3ObjectRequestParams](-s3-object-request-params/index.html)<br>Object get request parameters. |
| [S3ObjectListParams](-s3-object-list-params/index.html) | [jvm]<br>interface [S3ObjectListParams](-s3-object-list-params/index.html) : [S3RegionRequestParams](../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/index.html) |
| [S3ObjectRequestParams](-s3-object-request-params/index.html) | [jvm]<br>interface [S3ObjectRequestParams](-s3-object-request-params/index.html) : [S3RegionRequestParams](../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/index.html)<br>Base parameters for operations relating to a target S3 object. |
| [S3ObjectStatParams](-s3-object-stat-params/index.html) | [jvm]<br>interface [S3ObjectStatParams](-s3-object-stat-params/index.html) : [S3ObjectRequestParams](-s3-object-request-params/index.html)<br>Object stat request parameters. |
| [S3ObjectTagCreateParams](-s3-object-tag-create-params/index.html) | [jvm]<br>interface [S3ObjectTagCreateParams](-s3-object-tag-create-params/index.html) : [S3ObjectWriteParams](-s3-object-write-params/index.html)<br>Object tag creation request parameters. |
| [S3ObjectTagDeleteParams](-s3-object-tag-delete-params/index.html) | [jvm]<br>interface [S3ObjectTagDeleteParams](-s3-object-tag-delete-params/index.html) : [S3TagDeleteParams](../org.veupathdb.lib.s3.s34k.requests/-s3-tag-delete-params/index.html), [S3ObjectRequestParams](-s3-object-request-params/index.html)<br>Object tag delete operation parameters. |
| [S3ObjectTagGetParams](-s3-object-tag-get-params/index.html) | [jvm]<br>interface [S3ObjectTagGetParams](-s3-object-tag-get-params/index.html) : [S3TagGetParams](../org.veupathdb.lib.s3.s34k.requests/-s3-tag-get-params/index.html), [S3ObjectRequestParams](-s3-object-request-params/index.html) |
| [S3ObjectTouchParams](-s3-object-touch-params/index.html) | [jvm]<br>interface [S3ObjectTouchParams](-s3-object-touch-params/index.html) : [S3ObjectWriteParams](-s3-object-write-params/index.html) |
| [S3ObjectWriteParams](-s3-object-write-params/index.html) | [jvm]<br>interface [S3ObjectWriteParams](-s3-object-write-params/index.html) : [S3TagCreateParams](../org.veupathdb.lib.s3.s34k.requests/-s3-tag-create-params/index.html), [S3ObjectRequestParams](-s3-object-request-params/index.html)<br>Parameter base for S3 object write operations. |
| [S3StreamingObjectCreateParams](-s3-streaming-object-create-params/index.html) | [jvm]<br>interface [S3StreamingObjectCreateParams](-s3-streaming-object-create-params/index.html) : [S3ObjectCreateParams](-s3-object-create-params/index.html)<br>Object put via [InputStream](https://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html) operation parameters. |

