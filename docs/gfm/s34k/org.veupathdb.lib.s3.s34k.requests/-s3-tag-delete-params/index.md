//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests](../index.md)/[S3TagDeleteParams](index.md)

# S3TagDeleteParams

[jvm]\
interface [S3TagDeleteParams](index.md) : [S3RegionRequestParams](../-s3-region-request-params/index.md)

Tag Deleter

Represents the tag deletion methods on any [S3TagDeleteParams](index.md) implementation.

#### Author

Elizabeth Paige Harper https://github.com/Foxcapades

#### Since

v0.1.0

## Properties

| Name | Summary |
|---|---|
| [allTags](all-tags.md) | [jvm]<br>abstract var [allTags](all-tags.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether all tags should be deleted from the target bucket. |
| [callback](callback.md) | [jvm]<br>abstract var [callback](callback.md): ([S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?<br>Optional callback that will be executed on successful completion of the S3 operation. |
| [headers](../-s3-request-params/headers.md) | [jvm]<br>abstract val [headers](../-s3-request-params/headers.md): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.md)<br>Additional/custom headers to send with the S3 operation request. |
| [queryParams](../-s3-request-params/query-params.md) | [jvm]<br>abstract val [queryParams](../-s3-request-params/query-params.md): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.md)<br>Additional/custom query parameters to send with the S3 operation request. |
| [region](../-s3-region-request-params/region.md) | [jvm]<br>abstract var [region](../-s3-region-request-params/region.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [tags](tags.md) | [jvm]<br>abstract val [tags](tags.md): [S3MutableTagSet](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-mutable-tag-set/index.md)<br>Set of tags to delete from the target bucket. |

## Inheritors

| Name |
|---|
| [S3BlankTagDeleteParams](../-s3-blank-tag-delete-params/index.md) |
| [S3BucketTagDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.bucket/-s3-bucket-tag-delete-params/index.md) |
| [S3ObjectTagDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-tag-delete-params/index.md) |
