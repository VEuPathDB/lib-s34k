//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k](../index.md)/[S3Api](index.md)/[newClient](new-client.md)

# newClient

[jvm]\

@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)

fun [newClient](new-client.md)(config: [S3Config](../-s3-config/index.md)): [S3Client](../-s3-client/index.md)

Gets a new [S3Client](../-s3-client/index.md) instance configured with the given [S3Config](../-s3-config/index.md) value.

Clients are loaded dynamically from the first implementing library found on the classpath.

#### Return

A newly created [S3Client](../-s3-client/index.md) instance.

## Parameters

jvm

| | |
|---|---|
| config | Configuration for the new client instance. |

## Throws

| | |
|---|---|
| [kotlin.RuntimeException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-runtime-exception/index.html) | if no implementing library was found on the classpath. |
