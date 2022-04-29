---
title: BucketNotFoundException
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.errors](../index.html)/[BucketNotFoundException](index.html)



# BucketNotFoundException



[jvm]\
class [BucketNotFoundException](index.html) : [AbstractBucketOperationException](../-abstract-bucket-operation-exception/index.html)

NoSuchBucket



The specified bucket does not exist.



#### Author



Elizabeth Paige Harper https://github.com/Foxcapades



#### Since



v0.1.0



## Constructors


| | |
|---|---|
| [BucketNotFoundException](-bucket-not-found-exception.html) | [jvm]<br>fun [BucketNotFoundException](-bucket-not-found-exception.html)(bucket: [BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.html)) |
| [BucketNotFoundException](-bucket-not-found-exception.html) | [jvm]<br>fun [BucketNotFoundException](-bucket-not-found-exception.html)(bucket: [BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [BucketNotFoundException](-bucket-not-found-exception.html) | [jvm]<br>fun [BucketNotFoundException](-bucket-not-found-exception.html)(bucket: [BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.html), cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) |
| [BucketNotFoundException](-bucket-not-found-exception.html) | [jvm]<br>fun [BucketNotFoundException](-bucket-not-found-exception.html)(bucket: [BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) |


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
| [bucket](../-abstract-bucket-operation-exception/bucket.html) | [jvm]<br>val [bucket](../-abstract-bucket-operation-exception/bucket.html): [BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.html)<br>Name of the bucket on which the failed operation was taking place. |
| [cause](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#-654012527%2FProperties%2F863300109) | [jvm]<br>open val [cause](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#-654012527%2FProperties%2F863300109): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? |
| [code](code.html) | [jvm]<br>open override val [code](code.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>S3 Error Code |
| [message](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#1824300659%2FProperties%2F863300109) | [jvm]<br>open val [message](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#1824300659%2FProperties%2F863300109): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |

