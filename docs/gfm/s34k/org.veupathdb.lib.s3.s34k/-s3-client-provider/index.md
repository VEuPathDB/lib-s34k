//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k](../index.md)/[S3ClientProvider](index.md)

# S3ClientProvider

[jvm]\
interface [S3ClientProvider](index.md)

S3 Client Provider

Factory/provider for creating [S3Client](../-s3-client/index.md) instances.

This is the entrypoint for specific implementations of the S34K API.

#### Author

Elizabeth Paige Harper https://github.com/Foxcapades

#### Since

v0.1.0

## Functions

| Name | Summary |
|---|---|
| [new](new.md) | [jvm]<br>abstract fun [new](new.md)(config: [S3Config](../-s3-config/index.md)): [S3Client](../-s3-client/index.md)<br>Provides a new [S3Client](../-s3-client/index.md) instance, configured by the passed [S3Config](../-s3-config/index.md) instance. |
