//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests.bucket.recursive](../index.md)/[S3RecursiveBucketDeleteParams](index.md)

# S3RecursiveBucketDeleteParams

[jvm]\
interface [S3RecursiveBucketDeleteParams](index.md) : [S3RegionRequestParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/index.md)

Recursive Bucket Delete Request Parameters.

Defines request parameters used in the multi-stage operation necessary to fully remove a bucket from an S3 instance.

This operation happens in 3 stages:

1. 
   Fetch a listing of all objects in the bucket.
2. 
   Recursively delete all objects in the bucket.
3. 
   Delete the bucket itself.

Each phase can be configured independently with headers and query parameters, in addition to sets of global (all phase) headers and query parameters.

As this operation is complex, there is are a lot of errors that could result from the operation, and those errors will include as much information as possible to assist in recovering or handling each error.

#### Author

Elizabeth Paige Harper https://github.com/Foxcapades

#### Since

v0.1.0

## Properties

| Name | Summary |
|---|---|
| [bucketDelete](bucket-delete.md) | [jvm]<br>abstract val [bucketDelete](bucket-delete.md): [S3RBDBucketDeleteParams](../-s3-r-b-d-bucket-delete-params/index.md)<br>Bucket delete operation parameters. |
| [headers](headers.md) | [jvm]<br>abstract override val [headers](headers.md): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.md)<br>Headers that will be applied to all requests in all phases of the recursive bucket delete operation. |
| [objectDelete](object-delete.md) | [jvm]<br>abstract val [objectDelete](object-delete.md): [S3RBDObjectDeleteParams](../-s3-r-b-d-object-delete-params/index.md)<br>Bulk object delete operation parameters. |
| [objectFetch](object-fetch.md) | [jvm]<br>abstract val [objectFetch](object-fetch.md): [S3RBDObjectListParams](../-s3-r-b-d-object-list-params/index.md)<br>Object list operation parameters. |
| [queryParams](query-params.md) | [jvm]<br>abstract override val [queryParams](query-params.md): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.md)<br>Query parameters that will be applied to all requests in all phases of the recursive bucket delete operation. |
| [region](region.md) | [jvm]<br>abstract override var [region](region.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Global region value that will be applied to all requests in all phases of the recursive bucket delete operation. |

## Inheritors

| Name |
|---|
| [S3ClientRecursiveBucketDeleteParams](../-s3-client-recursive-bucket-delete-params/index.md) |
