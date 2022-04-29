---
title: add
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.fields.tags](../index.html)/[S3MutableTagMap](index.html)/[add](add.html)



# add



[jvm]\
abstract fun [add](add.html)(tag: [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html))



Adds the single given tag to this map.



## Parameters


jvm

| | |
|---|---|
| tag | Tag to add to this map. |





[jvm]\
abstract fun [add](add.html)(vararg tags: [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html))

abstract fun [add](add.html)(tags: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html)&gt;)



Adds the given tags to this map.



## Parameters


jvm

| | |
|---|---|
| tags | Tags to add to this map. |





[jvm]\
abstract fun [add](add.html)(tags: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)

abstract fun [add](add.html)(vararg tags: [Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)



Adds the given tags to this map.



## Parameters


jvm

| | |
|---|---|
| tags | Tags to add to this map. |



## Throws


| | |
|---|---|
| [kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | as per the rules outlined in the [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html) docs. |



