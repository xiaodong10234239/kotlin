// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto_tcs.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package org.jetbrains.kotlin.gradle.idea.proto.generated.tcs;

@kotlin.jvm.JvmName("-initializeideaKotlinBinaryCapabilityProto")
public inline fun ideaKotlinBinaryCapabilityProto(block: org.jetbrains.kotlin.gradle.idea.proto.generated.tcs.IdeaKotlinBinaryCapabilityProtoKt.Dsl.() -> kotlin.Unit): org.jetbrains.kotlin.gradle.idea.proto.generated.tcs.IdeaKotlinBinaryCapabilityProto =
  org.jetbrains.kotlin.gradle.idea.proto.generated.tcs.IdeaKotlinBinaryCapabilityProtoKt.Dsl._create(org.jetbrains.kotlin.gradle.idea.proto.generated.tcs.IdeaKotlinBinaryCapabilityProto.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `org.jetbrains.kotlin.gradle.idea.proto.generated.tcs.IdeaKotlinBinaryCapabilityProto`
 */
public object IdeaKotlinBinaryCapabilityProtoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: org.jetbrains.kotlin.gradle.idea.proto.generated.tcs.IdeaKotlinBinaryCapabilityProto.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: org.jetbrains.kotlin.gradle.idea.proto.generated.tcs.IdeaKotlinBinaryCapabilityProto.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): org.jetbrains.kotlin.gradle.idea.proto.generated.tcs.IdeaKotlinBinaryCapabilityProto = _builder.build()

    /**
     * `optional string group = 1;`
     */
    public var group: kotlin.String
      @JvmName("getGroup")
      get() = _builder.group
      @JvmName("setGroup")
      set(value) {
        _builder.group = value
      }
    /**
     * `optional string group = 1;`
     */
    public fun clearGroup() {
      _builder.clearGroup()
    }
    /**
     * `optional string group = 1;`
     * @return Whether the group field is set.
     */
    public fun hasGroup(): kotlin.Boolean {
      return _builder.hasGroup()
    }

    /**
     * `optional string name = 2;`
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.name
      @JvmName("setName")
      set(value) {
        _builder.name = value
      }
    /**
     * `optional string name = 2;`
     */
    public fun clearName() {
      _builder.clearName()
    }
    /**
     * `optional string name = 2;`
     * @return Whether the name field is set.
     */
    public fun hasName(): kotlin.Boolean {
      return _builder.hasName()
    }

    /**
     * `optional string version = 3;`
     */
    public var version: kotlin.String
      @JvmName("getVersion")
      get() = _builder.version
      @JvmName("setVersion")
      set(value) {
        _builder.version = value
      }
    /**
     * `optional string version = 3;`
     */
    public fun clearVersion() {
      _builder.clearVersion()
    }
    /**
     * `optional string version = 3;`
     * @return Whether the version field is set.
     */
    public fun hasVersion(): kotlin.Boolean {
      return _builder.hasVersion()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun org.jetbrains.kotlin.gradle.idea.proto.generated.tcs.IdeaKotlinBinaryCapabilityProto.copy(block: `org.jetbrains.kotlin.gradle.idea.proto.generated.tcs`.IdeaKotlinBinaryCapabilityProtoKt.Dsl.() -> kotlin.Unit): org.jetbrains.kotlin.gradle.idea.proto.generated.tcs.IdeaKotlinBinaryCapabilityProto =
  `org.jetbrains.kotlin.gradle.idea.proto.generated.tcs`.IdeaKotlinBinaryCapabilityProtoKt.Dsl._create(this.toBuilder()).apply { block() }._build()

