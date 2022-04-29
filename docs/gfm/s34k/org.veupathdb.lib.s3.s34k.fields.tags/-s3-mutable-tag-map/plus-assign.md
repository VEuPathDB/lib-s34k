//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.fields.tags](../index.md)/[S3MutableTagMap](index.md)/[plusAssign](plus-assign.md)

# plusAssign

[jvm]\
abstract operator fun [plusAssign](plus-assign.md)(tag: [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md))

Appends the given value to this map.

## Parameters

jvm

| | |
|---|---|
| tag | Tag to add to this map. |

[jvm]\
abstract operator fun [plusAssign](plus-assign.md)(tags: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)

Appends the given values to this map.

## Parameters

jvm

| | |
|---|---|
| tags | Tags to add to this map. |

## Throws

| | |
|---|---|
| [kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | as per the rules outlined in the [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md) docs. |

[jvm]\
abstract operator fun [plusAssign](plus-assign.md)(tag: [Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)

Appends the given value to this map.

Usage:

map += "foo" to "bar"

## Parameters

jvm

| | |
|---|---|
| tag | Tag to add to this map. |

## Throws

| | |
|---|---|
| [kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | as per the rules outlined in the [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md) docs. |
