---
title: DirectoryObjectDeleteError
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.requests.object.directory](../index.html)/[DirectoryObjectDeleteError](index.html)



# DirectoryObjectDeleteError



[jvm]\
class [DirectoryObjectDeleteError](index.html) : [DirectoryDeleteError](../-directory-delete-error/index.html)



## Constructors


| | |
|---|---|
| [DirectoryObjectDeleteError](-directory-object-delete-error.html) | [jvm]<br>fun [DirectoryObjectDeleteError](-directory-object-delete-error.html)(bucketName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), errors: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ObjectDeleteError](../../org.veupathdb.lib.s3.s34k.requests.object/-object-delete-error/index.html)&gt;) |
| [DirectoryObjectDeleteError](-directory-object-delete-error.html) | [jvm]<br>fun [DirectoryObjectDeleteError](-directory-object-delete-error.html)(bucketName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), errors: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ObjectDeleteError](../../org.veupathdb.lib.s3.s34k.requests.object/-object-delete-error/index.html)&gt;, cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) |
| [DirectoryObjectDeleteError](-directory-object-delete-error.html) | [jvm]<br>fun [DirectoryObjectDeleteError](-directory-object-delete-error.html)(bucketName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), errors: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ObjectDeleteError](../../org.veupathdb.lib.s3.s34k.requests.object/-object-delete-error/index.html)&gt;, msg: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [DirectoryObjectDeleteError](-directory-object-delete-error.html) | [jvm]<br>fun [DirectoryObjectDeleteError](-directory-object-delete-error.html)(bucketName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), errors: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ObjectDeleteError](../../org.veupathdb.lib.s3.s34k.requests.object/-object-delete-error/index.html)&gt;, msg: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [addSuppressed](index.html#282858770%2FFunctions%2F863300109) | [jvm]<br>fun [addSuppressed](index.html#282858770%2FFunctions%2F863300109)(p0: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) |
| [fillInStackTrace](index.html#-1102069925%2FFunctions%2F863300109) | [jvm]<br>open fun [fillInStackTrace](index.html#-1102069925%2FFunctions%2F863300109)(): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) |
| [getLocalizedMessage](index.html#1043865560%2FFunctions%2F863300109) | [jvm]<br>open fun [getLocalizedMessage](index.html#1043865560%2FFunctions%2F863300109)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [getStackTrace](index.html#2050903719%2FFunctions%2F863300109) | [jvm]<br>open fun [getStackTrace](index.html#2050903719%2FFunctions%2F863300109)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[StackTraceElement](https://docs.oracle.com/javase/8/docs/api/java/lang/StackTraceElement.html)&gt; |
| [getSuppressed](index.html#672492560%2FFunctions%2F863300109) | [jvm]<br>fun [getSuppressed](index.html#672492560%2FFunctions%2F863300109)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)&gt; |
| [initCause](index.html#-418225042%2FFunctions%2F863300109) | [jvm]<br>open fun [initCause](index.html#-418225042%2FFunctions%2F863300109)(p0: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) |
| [printStackTrace](index.html#-1769529168%2FFunctions%2F863300109) | [jvm]<br>open fun [printStackTrace](index.html#-1769529168%2FFunctions%2F863300109)()<br>open fun [printStackTrace](index.html#1841853697%2FFunctions%2F863300109)(p0: [PrintStream](https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html))<br>open fun [printStackTrace](index.html#1175535278%2FFunctions%2F863300109)(p0: [PrintWriter](https://docs.oracle.com/javase/8/docs/api/java/io/PrintWriter.html)) |
| [setStackTrace](index.html#2135801318%2FFunctions%2F863300109) | [jvm]<br>open fun [setStackTrace](index.html#2135801318%2FFunctions%2F863300109)(p0: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[StackTraceElement](https://docs.oracle.com/javase/8/docs/api/java/lang/StackTraceElement.html)&gt;) |


## Properties


| Name | Summary |
|---|---|
| [bucketName](../-directory-delete-error/bucket-name.html) | [jvm]<br>val [bucketName](../-directory-delete-error/bucket-name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Name of the bucket containing the directory on which the delete operation was attempted. |
| [cause](index.html#-654012527%2FProperties%2F863300109) | [jvm]<br>open val [cause](index.html#-654012527%2FProperties%2F863300109): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? |
| [errors](errors.html) | [jvm]<br>val [errors](errors.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ObjectDeleteError](../../org.veupathdb.lib.s3.s34k.requests.object/-object-delete-error/index.html)&gt; |
| [message](index.html#1824300659%2FProperties%2F863300109) | [jvm]<br>open val [message](index.html#1824300659%2FProperties%2F863300109): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [path](../-directory-delete-error/path.html) | [jvm]<br>val [path](../-directory-delete-error/path.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Path to the directory that could not be deleted. |

