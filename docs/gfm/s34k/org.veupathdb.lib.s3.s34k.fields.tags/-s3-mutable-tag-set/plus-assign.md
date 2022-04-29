//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.fields.tags](../index.md)/[S3MutableTagSet](index.md)/[plusAssign](plus-assign.md)

# plusAssign

[jvm]\
abstract operator fun [plusAssign](plus-assign.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

Adds the given tag to this [S3MutableTagSet](index.md).

## Throws

| | |
|---|---|
| [kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | if the given tag name is greater than 128 characters in length. |
