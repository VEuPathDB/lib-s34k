//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests](../index.md)/[S3DeleteRequestParams](index.md)/[toBucketDeleteParams](to-bucket-delete-params.md)

# toBucketDeleteParams

[jvm]\
abstract fun [toBucketDeleteParams](to-bucket-delete-params.md)(name: [BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.md)): [S3BucketDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-delete-params/index.md)

Converts this generalized delete request into a bucket delete request.

#### Return

The converted BasicS3BucketDeleteParams instance.

## Parameters

jvm

| | |
|---|---|
| name | Name of the target bucket. |
