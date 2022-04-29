//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests.bucket.recursive](../index.md)/[S3ClientRecursiveBucketDeleteParams](index.md)

# S3ClientRecursiveBucketDeleteParams

[jvm]\
interface [S3ClientRecursiveBucketDeleteParams](index.md) : [S3RecursiveBucketDeleteParams](../-s3-recursive-bucket-delete-params/index.md)

Client Recursive Bucket Delete Params.

Recursive bucket delete parameters used by calls to the [S3Client.deleteBucketRecursive](../../org.veupathdb.lib.s3.s34k/-s3-client/delete-bucket-recursive.md) method.

This type is based on the [S3RecursiveBucketDeleteParams](../-s3-recursive-bucket-delete-params/index.md) with the additional field bucketName.

For additional information about recursive bucket deletion, see the [S3RecursiveBucketDeleteParams](../-s3-recursive-bucket-delete-params/index.md) documentation.

#### Author

Elizabeth Paige Harper https://github.com/Foxcapades

#### Since

v0.1.0

## Properties

| Name | Summary |
|---|---|
| [bucketDelete](../-s3-recursive-bucket-delete-params/bucket-delete.md) | [jvm]<br>abstract val [bucketDelete](../-s3-recursive-bucket-delete-params/bucket-delete.md): [S3RBDBucketDeleteParams](../-s3-r-b-d-bucket-delete-params/index.md)<br>Bucket delete operation parameters. |
| [bucketName](bucket-name.md) | [jvm]<br>abstract var [bucketName](bucket-name.md): [BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.md)?<br>*Required* name of the target S3 bucket. |
| [headers](../-s3-recursive-bucket-delete-params/headers.md) | [jvm]<br>abstract override val [headers](../-s3-recursive-bucket-delete-params/headers.md): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.md)<br>Headers that will be applied to all requests in all phases of the recursive bucket delete operation. |
| [objectDelete](../-s3-recursive-bucket-delete-params/object-delete.md) | [jvm]<br>abstract val [objectDelete](../-s3-recursive-bucket-delete-params/object-delete.md): [S3RBDObjectDeleteParams](../-s3-r-b-d-object-delete-params/index.md)<br>Bulk object delete operation parameters. |
| [objectFetch](../-s3-recursive-bucket-delete-params/object-fetch.md) | [jvm]<br>abstract val [objectFetch](../-s3-recursive-bucket-delete-params/object-fetch.md): [S3RBDObjectListParams](../-s3-r-b-d-object-list-params/index.md)<br>Object list operation parameters. |
| [queryParams](../-s3-recursive-bucket-delete-params/query-params.md) | [jvm]<br>abstract override val [queryParams](../-s3-recursive-bucket-delete-params/query-params.md): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.md)<br>Query parameters that will be applied to all requests in all phases of the recursive bucket delete operation. |
| [region](../-s3-recursive-bucket-delete-params/region.md) | [jvm]<br>abstract override var [region](../-s3-recursive-bucket-delete-params/region.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Global region value that will be applied to all requests in all phases of the recursive bucket delete operation. |
