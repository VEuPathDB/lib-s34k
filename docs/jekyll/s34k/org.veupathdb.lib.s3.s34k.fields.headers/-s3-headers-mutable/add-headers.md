---
title: addHeaders
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.fields.headers](../index.html)/[S3HeadersMutable](index.html)/[addHeaders](add-headers.html)



# addHeaders



[jvm]\
abstract fun [addHeaders](add-headers.html)(headers: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;&gt;)



Adds the headers in the given map to this header map.



If there exists any key in the input [headers](add-headers.html) map that already exists in this header map, the values in the supplied iterator will be appended to the header values already in this map.



## Parameters


jvm

| | |
|---|---|
| headers | Map of header keys to header values that will be appended to this header map. |





[jvm]\
abstract fun [addHeaders](add-headers.html)(vararg headers: [Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)



Adds the headers in the given set of pairs to this header map.



If there exists any key in the input [headers](add-headers.html) pairs that already exists in this header map, the value in the supplied pair will be appended to the header values already in this map.



## Parameters


jvm

| | |
|---|---|
| headers | Collection of pairs of header keys to values that will be appended to this header map. |




