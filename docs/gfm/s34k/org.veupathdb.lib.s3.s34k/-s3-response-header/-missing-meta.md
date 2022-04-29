//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k](../index.md)/[S3ResponseHeader](index.md)/[MissingMeta](-missing-meta.md)

# MissingMeta

[jvm]\
const val [MissingMeta](-missing-meta.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)

x-amz-missing-meta

This is set to the number of metadata entries not returned in x-amz-meta headers. This can happen if you create metadata using an API like SOAP that supports more flexible metadata than the REST API. For example, using SOAP, you can create metadata whose values are not legal HTTP headers.
