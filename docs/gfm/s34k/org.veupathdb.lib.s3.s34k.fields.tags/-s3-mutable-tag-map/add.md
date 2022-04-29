//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.fields.tags](../index.md)/[S3MutableTagMap](index.md)/[add](add.md)

# add

[jvm]\
abstract fun [add](add.md)(tag: [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md))

Adds the single given tag to this map.

## Parameters

jvm

| | |
|---|---|
| tag | Tag to add to this map. |

[jvm]\
abstract fun [add](add.md)(vararg tags: [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md))

abstract fun [add](add.md)(tags: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md)&gt;)

Adds the given tags to this map.

## Parameters

jvm

| | |
|---|---|
| tags | Tags to add to this map. |

[jvm]\
abstract fun [add](add.md)(tags: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)

abstract fun [add](add.md)(vararg tags: [Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)

Adds the given tags to this map.

## Parameters

jvm

| | |
|---|---|
| tags | Tags to add to this map. |

## Throws

| | |
|---|---|
| [kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | as per the rules outlined in the [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md) docs. |
