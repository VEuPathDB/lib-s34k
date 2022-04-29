---
title: RecursiveBucketDeleteObjectDeleteError
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.requests.bucket.recursive](../index.html)/[RecursiveBucketDeleteObjectDeleteError](index.html)



# RecursiveBucketDeleteObjectDeleteError



[jvm]\
open class [RecursiveBucketDeleteObjectDeleteError](index.html) : [RecursiveBucketDeleteError](../-recursive-bucket-delete-error/index.html)

Represents and exception thrown during the object deletion phase of the complex action of recursively deleting an S3 bucket.



It is important to verify the state of the S3 store after this exception is thrown.



This exception will contain as much information as possible about the error and the request that caused it.



#### Author



Elizabeth Paige Harper https://github.com/Foxcapades



#### Since



v0.1.0



## Constructors


| | |
|---|---|
| [RecursiveBucketDeleteObjectDeleteError](-recursive-bucket-delete-object-delete-error.html) | [jvm]<br>fun [RecursiveBucketDeleteObjectDeleteError](-recursive-bucket-delete-object-delete-error.html)(req: [S3ClientRecursiveBucketDeleteParams](../-s3-client-recursive-bucket-delete-params/index.html), errs: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ObjectDeleteError](../../org.veupathdb.lib.s3.s34k.requests.object/-object-delete-error/index.html)&gt;, message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) |
| [RecursiveBucketDeleteObjectDeleteError](-recursive-bucket-delete-object-delete-error.html) | [jvm]<br>fun [RecursiveBucketDeleteObjectDeleteError](-recursive-bucket-delete-object-delete-error.html)(req: [S3ClientRecursiveBucketDeleteParams](../-s3-client-recursive-bucket-delete-params/index.html), errs: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ObjectDeleteError](../../org.veupathdb.lib.s3.s34k.requests.object/-object-delete-error/index.html)&gt;) |


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
| [bucketDeleteHeaders](../-recursive-bucket-delete-error/bucket-delete-headers.html) | [jvm]<br>val [bucketDeleteHeaders](../-recursive-bucket-delete-error/bucket-delete-headers.html): [S3Headers](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers/index.html)<br>Headers that were being sent exclusively as part of the bucket delete operation. |
| [bucketDeleteQueryParams](../-recursive-bucket-delete-error/bucket-delete-query-params.html) | [jvm]<br>val [bucketDeleteQueryParams](../-recursive-bucket-delete-error/bucket-delete-query-params.html): [S3QueryParams](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params/index.html)<br>Query parameters that were being sent exclusively as part of the bucket delete operation. |
| [bucketName](../-recursive-bucket-delete-error/bucket-name.html) | [jvm]<br>val [bucketName](../-recursive-bucket-delete-error/bucket-name.html): [BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.html)<br>Name of the target bucket on which the recursive delete was being attempted. |
| [cause](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#-654012527%2FProperties%2F863300109) | [jvm]<br>open val [cause](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#-654012527%2FProperties%2F863300109): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? |
| [globalHeaders](../-recursive-bucket-delete-error/global-headers.html) | [jvm]<br>val [globalHeaders](../-recursive-bucket-delete-error/global-headers.html): [S3Headers](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers/index.html)<br>Headers that were being sent as part of every request in all phases of the recursive delete operation. |
| [globalQueryParams](../-recursive-bucket-delete-error/global-query-params.html) | [jvm]<br>val [globalQueryParams](../-recursive-bucket-delete-error/global-query-params.html): [S3QueryParams](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params/index.html)<br>Query parameters that were being sent as part of every request in all phases of the recursive delete operation. |
| [message](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#1824300659%2FProperties%2F863300109) | [jvm]<br>open val [message](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#1824300659%2FProperties%2F863300109): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [objectDeleteHeaders](../-recursive-bucket-delete-error/object-delete-headers.html) | [jvm]<br>val [objectDeleteHeaders](../-recursive-bucket-delete-error/object-delete-headers.html): [S3Headers](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers/index.html)<br>Headers that were being sent exclusively as part of the bucket object delete operation. |
| [objectDeleteQueryParams](../-recursive-bucket-delete-error/object-delete-query-params.html) | [jvm]<br>val [objectDeleteQueryParams](../-recursive-bucket-delete-error/object-delete-query-params.html): [S3QueryParams](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params/index.html)<br>Query parameters that were being sent exclusively as part of the bucket object delete operation. |
| [objectErrors](object-errors.html) | [jvm]<br>val [objectErrors](object-errors.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ObjectDeleteError](../../org.veupathdb.lib.s3.s34k.requests.object/-object-delete-error/index.html)&gt;<br>List of errors that occurred for each object whose delete operation failed. |
| [objectListHeaders](../-recursive-bucket-delete-error/object-list-headers.html) | [jvm]<br>val [objectListHeaders](../-recursive-bucket-delete-error/object-list-headers.html): [S3Headers](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers/index.html)<br>Headers that were being sent exclusively as part of the bucket object list operation. |
| [objectListQueryParams](../-recursive-bucket-delete-error/object-list-query-params.html) | [jvm]<br>val [objectListQueryParams](../-recursive-bucket-delete-error/object-list-query-params.html): [S3QueryParams](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params/index.html)<br>Query parameters that were being sent exclusively as part of the bucket object list operation. |
| [phase](../-recursive-bucket-delete-error/phase.html) | [jvm]<br>val [phase](../-recursive-bucket-delete-error/phase.html): [S3RecursiveDeletePhase](../-s3-recursive-delete-phase/index.html)<br>Operation phase in which the error occurred. |

