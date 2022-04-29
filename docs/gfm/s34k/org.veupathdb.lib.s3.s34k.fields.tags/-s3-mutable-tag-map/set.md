//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.fields.tags](../index.md)/[S3MutableTagMap](index.md)/[set](set.md)

# set

[jvm]\
abstract operator fun [set](set.md)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

Sets the given values as a tag in this map.

## Parameters

jvm

| | |
|---|---|
| key | Tag key. |
| value | Tag value. |

## Throws

| | |
|---|---|
| [kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | as per the rules outlined in the [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md) docs. |
