package org.veupathdb.lib.s3.s34k.params.bucket.tag

import org.veupathdb.lib.s3.s34k.S3Object
import org.veupathdb.lib.s3.s34k.errors.S34KError

@Suppress("unused")
open class TargetedBucketTagDeleteError : S34KError {

  val target: S3Object

  val params: TargetedBucketTagDeleteParams

  val phase: TargetedBucketTagDeletePhase

  constructor(
    target: S3Object,
    phase:  TargetedBucketTagDeletePhase,
    params: TargetedBucketTagDeleteParams
  ) : super("Tag deletion failed in phase $phase") {
    this.target = target
    this.params = params
    this.phase  = phase
  }

  constructor(
    target:  S3Object,
    phase:   TargetedBucketTagDeletePhase,
    params:  TargetedBucketTagDeleteParams,
    message: String
  ) : super(message) {
    this.target = target
    this.params = params
    this.phase  = phase
  }

  constructor(
    target: S3Object,
    phase:  TargetedBucketTagDeletePhase,
    params: TargetedBucketTagDeleteParams,
    cause:  Throwable
  ) : super("Tag deletion failed in phase $phase", cause) {
    this.target = target
    this.params = params
    this.phase  = phase
  }

  constructor(
    target:  S3Object,
    phase:   TargetedBucketTagDeletePhase,
    params:  TargetedBucketTagDeleteParams,
    message: String,
    cause:   Throwable,
  ) : super(message, cause) {
    this.target = target
    this.params = params
    this.phase  = phase
  }
}