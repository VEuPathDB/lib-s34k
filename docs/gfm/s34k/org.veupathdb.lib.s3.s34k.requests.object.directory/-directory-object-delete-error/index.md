//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests.object.directory](../index.md)/[DirectoryObjectDeleteError](index.md)

# DirectoryObjectDeleteError

[jvm]\
class [DirectoryObjectDeleteError](index.md) : [DirectoryDeleteError](../-directory-delete-error/index.md)

## Constructors

| | |
|---|---|
| [DirectoryObjectDeleteError](-directory-object-delete-error.md) | [jvm]<br>fun [DirectoryObjectDeleteError](-directory-object-delete-error.md)(bucketName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), errors: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ObjectDeleteError](../../org.veupathdb.lib.s3.s34k.requests.object/-object-delete-error/index.md)&gt;) |
| [DirectoryObjectDeleteError](-directory-object-delete-error.md) | [jvm]<br>fun [DirectoryObjectDeleteError](-directory-object-delete-error.md)(bucketName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), errors: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ObjectDeleteError](../../org.veupathdb.lib.s3.s34k.requests.object/-object-delete-error/index.md)&gt;, cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) |
| [DirectoryObjectDeleteError](-directory-object-delete-error.md) | [jvm]<br>fun [DirectoryObjectDeleteError](-directory-object-delete-error.md)(bucketName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), errors: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ObjectDeleteError](../../org.veupathdb.lib.s3.s34k.requests.object/-object-delete-error/index.md)&gt;, msg: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [DirectoryObjectDeleteError](-directory-object-delete-error.md) | [jvm]<br>fun [DirectoryObjectDeleteError](-directory-object-delete-error.md)(bucketName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), errors: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ObjectDeleteError](../../org.veupathdb.lib.s3.s34k.requests.object/-object-delete-error/index.md)&gt;, msg: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) |

## Functions

| Name | Summary |
|---|---|
| [addSuppressed](index.md#282858770%2FFunctions%2F-1216412040) | [jvm]<br>fun [addSuppressed](index.md#282858770%2FFunctions%2F-1216412040)(p0: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) |
| [fillInStackTrace](index.md#-1102069925%2FFunctions%2F-1216412040) | [jvm]<br>open fun [fillInStackTrace](index.md#-1102069925%2FFunctions%2F-1216412040)(): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) |
| [getLocalizedMessage](index.md#1043865560%2FFunctions%2F-1216412040) | [jvm]<br>open fun [getLocalizedMessage](index.md#1043865560%2FFunctions%2F-1216412040)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [getStackTrace](index.md#2050903719%2FFunctions%2F-1216412040) | [jvm]<br>open fun [getStackTrace](index.md#2050903719%2FFunctions%2F-1216412040)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[StackTraceElement](https://docs.oracle.com/javase/8/docs/api/java/lang/StackTraceElement.html)&gt; |
| [getSuppressed](index.md#672492560%2FFunctions%2F-1216412040) | [jvm]<br>fun [getSuppressed](index.md#672492560%2FFunctions%2F-1216412040)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)&gt; |
| [initCause](index.md#-418225042%2FFunctions%2F-1216412040) | [jvm]<br>open fun [initCause](index.md#-418225042%2FFunctions%2F-1216412040)(p0: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) |
| [printStackTrace](index.md#-1769529168%2FFunctions%2F-1216412040) | [jvm]<br>open fun [printStackTrace](index.md#-1769529168%2FFunctions%2F-1216412040)()<br>open fun [printStackTrace](index.md#1841853697%2FFunctions%2F-1216412040)(p0: [PrintStream](https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html))<br>open fun [printStackTrace](index.md#1175535278%2FFunctions%2F-1216412040)(p0: [PrintWriter](https://docs.oracle.com/javase/8/docs/api/java/io/PrintWriter.html)) |
| [setStackTrace](index.md#2135801318%2FFunctions%2F-1216412040) | [jvm]<br>open fun [setStackTrace](index.md#2135801318%2FFunctions%2F-1216412040)(p0: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[StackTraceElement](https://docs.oracle.com/javase/8/docs/api/java/lang/StackTraceElement.html)&gt;) |

## Properties

| Name | Summary |
|---|---|
| [bucketName](../-directory-delete-error/bucket-name.md) | [jvm]<br>val [bucketName](../-directory-delete-error/bucket-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Name of the bucket containing the directory on which the delete operation was attempted. |
| [cause](index.md#-654012527%2FProperties%2F-1216412040) | [jvm]<br>open val [cause](index.md#-654012527%2FProperties%2F-1216412040): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? |
| [errors](errors.md) | [jvm]<br>val [errors](errors.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ObjectDeleteError](../../org.veupathdb.lib.s3.s34k.requests.object/-object-delete-error/index.md)&gt; |
| [message](index.md#1824300659%2FProperties%2F-1216412040) | [jvm]<br>open val [message](index.md#1824300659%2FProperties%2F-1216412040): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [path](../-directory-delete-error/path.md) | [jvm]<br>val [path](../-directory-delete-error/path.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Path to the directory that could not be deleted. |
