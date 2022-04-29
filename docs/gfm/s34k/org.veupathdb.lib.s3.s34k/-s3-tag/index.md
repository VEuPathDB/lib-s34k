//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k](../index.md)/[S3Tag](index.md)

# S3Tag

[jvm]\
data class [S3Tag](index.md)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

Represents a single tag attached to a target object or bucket in an S3 store.

#### Author

Elizabeth Paige Harper https://github.com/Foxcapades

#### Since

v0.1.0

## Parameters

jvm

| | |
|---|---|
| key | Tag key.  Must be less than or equal to 128 characters in length. |
| value | Tag value.  Must be less than or equal to 256 characters in length. |

## Throws

| | |
|---|---|
| [kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | If the key is greater than 128 characters in length, or the value is greater than 256 characters in length. |

## Constructors

| | |
|---|---|
| [S3Tag](-s3-tag.md) | [jvm]<br>fun [S3Tag](-s3-tag.md)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |

## Functions

| Name | Summary |
|---|---|
| [toString](to-string.md) | [jvm]<br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

## Properties

| Name | Summary |
|---|---|
| [key](key.md) | [jvm]<br>val [key](key.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [value](value.md) | [jvm]<br>val [value](value.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
