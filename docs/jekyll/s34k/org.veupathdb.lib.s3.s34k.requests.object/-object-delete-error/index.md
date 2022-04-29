---
title: ObjectDeleteError
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.requests.object](../index.html)/[ObjectDeleteError](index.html)



# ObjectDeleteError



[jvm]\
class [ObjectDeleteError](index.html) : [S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html)

Object deletion error.



Represents any error that occurred as a result of attempting to delete a single object from an S3 store.



Bulk object deletes may include more than one instance of this exception as details about the objects that could not be deleted.



#### Author



Elizabeth Paige Harper https://github.com/Foxcapades



#### Since



v0.1.0



## Constructors


| | |
|---|---|
| [ObjectDeleteError](-object-delete-error.html) | [jvm]<br>fun [ObjectDeleteError](-object-delete-error.html)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), s3Message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), s3Code: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) |
| [ObjectDeleteError](-object-delete-error.html) | [jvm]<br>fun [ObjectDeleteError](-object-delete-error.html)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), s3Message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), s3Code: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


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
| [cause](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#-654012527%2FProperties%2F863300109) | [jvm]<br>open val [cause](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#-654012527%2FProperties%2F863300109): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? |
| [message](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#1824300659%2FProperties%2F863300109) | [jvm]<br>open val [message](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html#1824300659%2FProperties%2F863300109): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [path](path.html) | [jvm]<br>val [path](path.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Key/path of the object on which the delete operation was attempted. |
| [s3Code](s3-code.html) | [jvm]<br>val [s3Code](s3-code.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Error code returned by the S3 server. |
| [s3Message](s3-message.html) | [jvm]<br>val [s3Message](s3-message.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Message returned by the S3 server. |

