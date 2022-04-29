//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests.object.directory](../index.md)/[DirectoryDeleteError](index.md)

# DirectoryDeleteError

[jvm]\
open class [DirectoryDeleteError](index.md) : [S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md)

## Constructors

| | |
|---|---|
| [DirectoryDeleteError](-directory-delete-error.md) | [jvm]<br>fun [DirectoryDeleteError](-directory-delete-error.md)(bucketName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), msg: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [DirectoryDeleteError](-directory-delete-error.md) | [jvm]<br>fun [DirectoryDeleteError](-directory-delete-error.md)(bucketName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), msg: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) |

## Functions

| Name | Summary |
|---|---|
| [addSuppressed](../-directory-object-delete-error/index.md#282858770%2FFunctions%2F-1216412040) | [jvm]<br>fun [addSuppressed](../-directory-object-delete-error/index.md#282858770%2FFunctions%2F-1216412040)(p0: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) |
| [fillInStackTrace](../-directory-object-delete-error/index.md#-1102069925%2FFunctions%2F-1216412040) | [jvm]<br>open fun [fillInStackTrace](../-directory-object-delete-error/index.md#-1102069925%2FFunctions%2F-1216412040)(): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) |
| [getLocalizedMessage](../-directory-object-delete-error/index.md#1043865560%2FFunctions%2F-1216412040) | [jvm]<br>open fun [getLocalizedMessage](../-directory-object-delete-error/index.md#1043865560%2FFunctions%2F-1216412040)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [getStackTrace](../-directory-object-delete-error/index.md#2050903719%2FFunctions%2F-1216412040) | [jvm]<br>open fun [getStackTrace](../-directory-object-delete-error/index.md#2050903719%2FFunctions%2F-1216412040)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[StackTraceElement](https://docs.oracle.com/javase/8/docs/api/java/lang/StackTraceElement.html)&gt; |
| [getSuppressed](../-directory-object-delete-error/index.md#672492560%2FFunctions%2F-1216412040) | [jvm]<br>fun [getSuppressed](../-directory-object-delete-error/index.md#672492560%2FFunctions%2F-1216412040)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)&gt; |
| [initCause](../-directory-object-delete-error/index.md#-418225042%2FFunctions%2F-1216412040) | [jvm]<br>open fun [initCause](../-directory-object-delete-error/index.md#-418225042%2FFunctions%2F-1216412040)(p0: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) |
| [printStackTrace](../-directory-object-delete-error/index.md#-1769529168%2FFunctions%2F-1216412040) | [jvm]<br>open fun [printStackTrace](../-directory-object-delete-error/index.md#-1769529168%2FFunctions%2F-1216412040)()<br>open fun [printStackTrace](../-directory-object-delete-error/index.md#1841853697%2FFunctions%2F-1216412040)(p0: [PrintStream](https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html))<br>open fun [printStackTrace](../-directory-object-delete-error/index.md#1175535278%2FFunctions%2F-1216412040)(p0: [PrintWriter](https://docs.oracle.com/javase/8/docs/api/java/io/PrintWriter.html)) |
| [setStackTrace](../-directory-object-delete-error/index.md#2135801318%2FFunctions%2F-1216412040) | [jvm]<br>open fun [setStackTrace](../-directory-object-delete-error/index.md#2135801318%2FFunctions%2F-1216412040)(p0: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[StackTraceElement](https://docs.oracle.com/javase/8/docs/api/java/lang/StackTraceElement.html)&gt;) |

## Properties

| Name | Summary |
|---|---|
| [bucketName](bucket-name.md) | [jvm]<br>val [bucketName](bucket-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Name of the bucket containing the directory on which the delete operation was attempted. |
| [cause](../-directory-object-delete-error/index.md#-654012527%2FProperties%2F-1216412040) | [jvm]<br>open val [cause](../-directory-object-delete-error/index.md#-654012527%2FProperties%2F-1216412040): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? |
| [message](../-directory-object-delete-error/index.md#1824300659%2FProperties%2F-1216412040) | [jvm]<br>open val [message](../-directory-object-delete-error/index.md#1824300659%2FProperties%2F-1216412040): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [path](path.md) | [jvm]<br>val [path](path.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Path to the directory that could not be deleted. |

## Inheritors

| Name |
|---|
| [DirectoryNotEmptyError](../-directory-not-empty-error/index.md) |
| [DirectoryObjectDeleteError](../-directory-object-delete-error/index.md) |
