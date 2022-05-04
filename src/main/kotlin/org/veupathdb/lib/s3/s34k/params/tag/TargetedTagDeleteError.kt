package org.veupathdb.lib.s3.s34k.params.tag

import org.veupathdb.lib.s3.s34k.S3Object
import org.veupathdb.lib.s3.s34k.errors.S34KError

open class TargetedTagDeleteError : S34KError {

  val target: S3Object

  val params: TagDeleteParams

  val phase: TargetedTagDeletePhase

  constructor(
    target: S3Object,
    phase:  TargetedTagDeletePhase,
    params: TagDeleteParams
  ) : super("Tag deletion failed in phase $phase") {
    this.target = target
    this.params = params
    this.phase  = phase
  }

  constructor(
    target:  S3Object,
    phase:   TargetedTagDeletePhase,
    params:  TagDeleteParams,
    message: String
  ) : super(message) {
    this.target = target
    this.params = params
    this.phase  = phase
  }

  constructor(
    target: S3Object,
    phase:  TargetedTagDeletePhase,
    params: TagDeleteParams,
    cause:  Throwable
  ) : super("Tag deletion failed in phase $phase", cause) {
    this.target = target
    this.params = params
    this.phase  = phase
  }

  constructor(
    target:  S3Object,
    phase:   TargetedTagDeletePhase,
    params:  TagDeleteParams,
    message: String,
    cause:   Throwable,
  ) : super(message, cause) {
    this.target = target
    this.params = params
    this.phase  = phase
  }
}