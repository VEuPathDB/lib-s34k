//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.response.object](../index.md)/[S3Object](index.md)/[delete](delete.md)

# delete

[jvm]\
abstract fun [delete](delete.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Deletes the current object from the S3 store (if it still exists).

#### Return

Flag indicating if the object was deleted from the store.  true if the object existed and was deleted, false if the object did not exist.

[jvm]\
abstract fun [delete](delete.md)(action: [S3DeleteRequestParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-delete-request-params/index.md).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Deletes the current object from the S3 store (if it still exists).

#### Return

Flag indicating if the object was deleted from the store.  true if the object existed and was deleted, false if the object did not exist.

## Parameters

jvm

| | |
|---|---|
| action | Action used to configure the S3 operation. |

[jvm]\
abstract fun [delete](delete.md)(params: [S3DeleteRequestParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-delete-request-params/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Deletes the current object from the S3 store (if it still exists).

#### Return

Flag indicating if the object was deleted from the store.  true if the object existed and was deleted, false if the object did not exist.

## Parameters

jvm

| | |
|---|---|
| params | S3 operation parameters. |
