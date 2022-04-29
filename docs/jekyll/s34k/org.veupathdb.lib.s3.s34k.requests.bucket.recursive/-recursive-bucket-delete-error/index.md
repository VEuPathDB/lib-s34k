---
title: RecursiveBucketDeleteError
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.requests.bucket.recursive](../index.html)/[RecursiveBucketDeleteError](index.html)



# RecursiveBucketDeleteError



[jvm]\
open class [RecursiveBucketDeleteError](index.html) : [S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html)

Represents and exception thrown during any phase of the complex action of recursively deleting an S3 bucket.



This exception may be thrown during any phase of the action, and thus it is possible that no write operation has occurred, or it is also possible that the S3 store has been left in a partially-deleted state.



It is important to verify the state of the S3 store after this exception is thrown.



This exception will contain as much information as possible about the error and the request that caused it.



#### Author



Elizabeth Paige Harper https://github.com/Foxcapades



#### Since



v0.1.0



## See also


jvm

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.requests.bucket.recursive.RecursiveBucketDeleteObjectDeleteError](../-recursive-bucket-delete-object-delete-error/index.html) |  |



## Constructors


| | |
|---|---|
| [RecursiveBucketDeleteError](-recursive-bucket-delete-error.html) | [jvm]<br>fun [RecursiveBucketDeleteError](-recursive-bucket-delete-error.html)(phase: [S3RecursiveDeletePhase](../-s3-recursive-delete-phase/index.html), req: [S3ClientRecursiveBucketDeleteParams](../-s3-client-recursive-bucket-delete-params/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) |
| [RecursiveBucketDeleteError](-recursive-bucket-delete-error.html) | [jvm]<br>fun [RecursiveBucketDeleteError](-recursive-bucket-delete-error.html)(phase: [S3RecursiveDeletePhase](../-s3-recursive-delete-phase/index.html), req: [S3ClientRecursiveBucketDeleteParams](../-s3-client-recursive-bucket-delete-params/index.html), cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) |
| [RecursiveBucketDeleteError](-recursive-bucket-delete-error.html) | [jvm]<br>fun [RecursiveBucketDeleteError](-recursive-bucket-delete-error.html)(phase: [S3RecursiveDeletePhase](../-s3-recursive-delete-phase/index.html), req: [S3ClientRecursiveBucketDeleteParams](../-s3-client-recursive-bucket-delete-params/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [addSuppressed](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#282858770%2FFunctions%2F863300109) | [jvm]<br>fun [addSuppressed](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#282858770%2FFunctions%2F863300109)(p0: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) |
| [fillInStackTrace](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#-1102069925%2FFunctions%2F863300109) | [jvm]<br>open fun [fillInStackTrace](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#-1102069925%2FFunctions%2F863300109)(): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) |
| [getLocalizedMessage](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#1043865560%2FFunctions%2F863300109) | [jvm]<br>open fun [getLocalizedMessage](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#1043865560%2FFunctions%2F863300109)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [getStackTrace](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#2050903719%2FFunctions%2F863300109) | [jvm]<br>open fun [getStackTrace](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#2050903719%2FFunctions%2F863300109)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[StackTraceElement](https://docs.oracle.com/javase/8/docs/api/java/lang/StackTraceElement.html)&gt; |
| [getSuppressed](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#672492560%2FFunctions%2F863300109) | [jvm]<br>fun [getSuppressed](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#672492560%2FFunctions%2F863300109)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)&gt; |
| [initCause](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#-418225042%2FFunctions%2F863300109) | [jvm]<br>open fun [initCause](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#-418225042%2FFunctions%2F863300109)(p0: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) |
| [printStackTrace](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#-1769529168%2FFunctions%2F863300109) | [jvm]<br>open fun [printStackTrace](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#-1769529168%2FFunctions%2F863300109)()<br>open fun [printStackTrace](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#1841853697%2FFunctions%2F863300109)(p0: [PrintStream](https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html))<br>open fun [printStackTrace](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#1175535278%2FFunctions%2F863300109)(p0: [PrintWriter](https://docs.oracle.com/javase/8/docs/api/java/io/PrintWriter.html)) |
| [setStackTrace](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#2135801318%2FFunctions%2F863300109) | [jvm]<br>open fun [setStackTrace](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#2135801318%2FFunctions%2F863300109)(p0: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[StackTraceElement](https://docs.oracle.com/javase/8/docs/api/java/lang/StackTraceElement.html)&gt;) |


## Properties


| Name | Summary |
|---|---|
| [bucketDeleteHeaders](bucket-delete-headers.html) | [jvm]<br>val [bucketDeleteHeaders](bucket-delete-headers.html): [S3Headers](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers/index.html)<br>Headers that were being sent exclusively as part of the bucket delete operation. |
| [bucketDeleteQueryParams](bucket-delete-query-params.html) | [jvm]<br>val [bucketDeleteQueryParams](bucket-delete-query-params.html): [S3QueryParams](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params/index.html)<br>Query parameters that were being sent exclusively as part of the bucket delete operation. |
| [bucketName](bucket-name.html) | [jvm]<br>val [bucketName](bucket-name.html): [BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.html)<br>Name of the target bucket on which the recursive delete was being attempted. |
| [cause](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#-654012527%2FProperties%2F863300109) | [jvm]<br>open val [cause](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#-654012527%2FProperties%2F863300109): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? |
| [globalHeaders](global-headers.html) | [jvm]<br>val [globalHeaders](global-headers.html): [S3Headers](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers/index.html)<br>Headers that were being sent as part of every request in all phases of the recursive delete operation. |
| [globalQueryParams](global-query-params.html) | [jvm]<br>val [globalQueryParams](global-query-params.html): [S3QueryParams](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params/index.html)<br>Query parameters that were being sent as part of every request in all phases of the recursive delete operation. |
| [message](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#1824300659%2FProperties%2F863300109) | [jvm]<br>open val [message](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#1824300659%2FProperties%2F863300109): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [objectDeleteHeaders](object-delete-headers.html) | [jvm]<br>val [objectDeleteHeaders](object-delete-headers.html): [S3Headers](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers/index.html)<br>Headers that were being sent exclusively as part of the bucket object delete operation. |
| [objectDeleteQueryParams](object-delete-query-params.html) | [jvm]<br>val [objectDeleteQueryParams](object-delete-query-params.html): [S3QueryParams](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params/index.html)<br>Query parameters that were being sent exclusively as part of the bucket object delete operation. |
| [objectListHeaders](object-list-headers.html) | [jvm]<br>val [objectListHeaders](object-list-headers.html): [S3Headers](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers/index.html)<br>Headers that were being sent exclusively as part of the bucket object list operation. |
| [objectListQueryParams](object-list-query-params.html) | [jvm]<br>val [objectListQueryParams](object-list-query-params.html): [S3QueryParams](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params/index.html)<br>Query parameters that were being sent exclusively as part of the bucket object list operation. |
| [phase](phase.html) | [jvm]<br>val [phase](phase.html): [S3RecursiveDeletePhase](../-s3-recursive-delete-phase/index.html)<br>Operation phase in which the error occurred. |


## Inheritors


| Name |
|---|
| [RecursiveBucketDeleteObjectDeleteError](../-recursive-bucket-delete-object-delete-error/index.html) |

