//[s34k](../../../../index.md)/[org.veupathdb.lib.s3.s34k.fields](../../index.md)/[BucketName](../index.md)/[Companion](index.md)/[of](of.md)

# of

[jvm]\

@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)

fun [of](of.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [BucketName](../index.md)

Constructs a new [BucketName](../index.md) instance from the given name if it is not null.

If the given name *is*null, an [IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) will be thrown.

#### Return

New [BucketName](../index.md) instance.

## Parameters

jvm

| | |
|---|---|
| name | Bucket name. |

## Throws

| | |
|---|---|
| [kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | If the input value is null, or if the input string violates any of the rules outlined in this type's constructor documentation. |
