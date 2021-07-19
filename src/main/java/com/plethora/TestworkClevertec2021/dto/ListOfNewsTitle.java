// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dto.proto

package com.plethora.TestworkClevertec2021.dto;

/**
 * Protobuf type {@code ListOfNewsTitle}
 */
public final class ListOfNewsTitle extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ListOfNewsTitle)
    ListOfNewsTitleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListOfNewsTitle.newBuilder() to construct.
  private ListOfNewsTitle(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListOfNewsTitle() {
    newsDtoTitles_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListOfNewsTitle();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListOfNewsTitle(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              newsDtoTitles_ = new java.util.ArrayList<com.plethora.TestworkClevertec2021.dto.NewsDtoTitle>();
              mutable_bitField0_ |= 0x00000001;
            }
            newsDtoTitles_.add(
                input.readMessage(com.plethora.TestworkClevertec2021.dto.NewsDtoTitle.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        newsDtoTitles_ = java.util.Collections.unmodifiableList(newsDtoTitles_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.plethora.TestworkClevertec2021.dto.Dto.internal_static_ListOfNewsTitle_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.plethora.TestworkClevertec2021.dto.Dto.internal_static_ListOfNewsTitle_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle.class, com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle.Builder.class);
  }

  public static final int NEWSDTOTITLES_FIELD_NUMBER = 1;
  private java.util.List<com.plethora.TestworkClevertec2021.dto.NewsDtoTitle> newsDtoTitles_;
  /**
   * <code>repeated .NewsDtoTitle newsDtoTitles = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.plethora.TestworkClevertec2021.dto.NewsDtoTitle> getNewsDtoTitlesList() {
    return newsDtoTitles_;
  }
  /**
   * <code>repeated .NewsDtoTitle newsDtoTitles = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.plethora.TestworkClevertec2021.dto.NewsDtoTitleOrBuilder> 
      getNewsDtoTitlesOrBuilderList() {
    return newsDtoTitles_;
  }
  /**
   * <code>repeated .NewsDtoTitle newsDtoTitles = 1;</code>
   */
  @java.lang.Override
  public int getNewsDtoTitlesCount() {
    return newsDtoTitles_.size();
  }
  /**
   * <code>repeated .NewsDtoTitle newsDtoTitles = 1;</code>
   */
  @java.lang.Override
  public com.plethora.TestworkClevertec2021.dto.NewsDtoTitle getNewsDtoTitles(int index) {
    return newsDtoTitles_.get(index);
  }
  /**
   * <code>repeated .NewsDtoTitle newsDtoTitles = 1;</code>
   */
  @java.lang.Override
  public com.plethora.TestworkClevertec2021.dto.NewsDtoTitleOrBuilder getNewsDtoTitlesOrBuilder(
      int index) {
    return newsDtoTitles_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < newsDtoTitles_.size(); i++) {
      output.writeMessage(1, newsDtoTitles_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < newsDtoTitles_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, newsDtoTitles_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle)) {
      return super.equals(obj);
    }
    com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle other = (com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle) obj;

    if (!getNewsDtoTitlesList()
        .equals(other.getNewsDtoTitlesList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getNewsDtoTitlesCount() > 0) {
      hash = (37 * hash) + NEWSDTOTITLES_FIELD_NUMBER;
      hash = (53 * hash) + getNewsDtoTitlesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ListOfNewsTitle}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ListOfNewsTitle)
      com.plethora.TestworkClevertec2021.dto.ListOfNewsTitleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.plethora.TestworkClevertec2021.dto.Dto.internal_static_ListOfNewsTitle_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.plethora.TestworkClevertec2021.dto.Dto.internal_static_ListOfNewsTitle_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle.class, com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle.Builder.class);
    }

    // Construct using com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getNewsDtoTitlesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (newsDtoTitlesBuilder_ == null) {
        newsDtoTitles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        newsDtoTitlesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.plethora.TestworkClevertec2021.dto.Dto.internal_static_ListOfNewsTitle_descriptor;
    }

    @java.lang.Override
    public com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle getDefaultInstanceForType() {
      return com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle.getDefaultInstance();
    }

    @java.lang.Override
    public com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle build() {
      com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle buildPartial() {
      com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle result = new com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle(this);
      int from_bitField0_ = bitField0_;
      if (newsDtoTitlesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          newsDtoTitles_ = java.util.Collections.unmodifiableList(newsDtoTitles_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.newsDtoTitles_ = newsDtoTitles_;
      } else {
        result.newsDtoTitles_ = newsDtoTitlesBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle) {
        return mergeFrom((com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle other) {
      if (other == com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle.getDefaultInstance()) return this;
      if (newsDtoTitlesBuilder_ == null) {
        if (!other.newsDtoTitles_.isEmpty()) {
          if (newsDtoTitles_.isEmpty()) {
            newsDtoTitles_ = other.newsDtoTitles_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNewsDtoTitlesIsMutable();
            newsDtoTitles_.addAll(other.newsDtoTitles_);
          }
          onChanged();
        }
      } else {
        if (!other.newsDtoTitles_.isEmpty()) {
          if (newsDtoTitlesBuilder_.isEmpty()) {
            newsDtoTitlesBuilder_.dispose();
            newsDtoTitlesBuilder_ = null;
            newsDtoTitles_ = other.newsDtoTitles_;
            bitField0_ = (bitField0_ & ~0x00000001);
            newsDtoTitlesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getNewsDtoTitlesFieldBuilder() : null;
          } else {
            newsDtoTitlesBuilder_.addAllMessages(other.newsDtoTitles_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.plethora.TestworkClevertec2021.dto.NewsDtoTitle> newsDtoTitles_ =
      java.util.Collections.emptyList();
    private void ensureNewsDtoTitlesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        newsDtoTitles_ = new java.util.ArrayList<com.plethora.TestworkClevertec2021.dto.NewsDtoTitle>(newsDtoTitles_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.plethora.TestworkClevertec2021.dto.NewsDtoTitle, com.plethora.TestworkClevertec2021.dto.NewsDtoTitle.Builder, com.plethora.TestworkClevertec2021.dto.NewsDtoTitleOrBuilder> newsDtoTitlesBuilder_;

    /**
     * <code>repeated .NewsDtoTitle newsDtoTitles = 1;</code>
     */
    public java.util.List<com.plethora.TestworkClevertec2021.dto.NewsDtoTitle> getNewsDtoTitlesList() {
      if (newsDtoTitlesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(newsDtoTitles_);
      } else {
        return newsDtoTitlesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .NewsDtoTitle newsDtoTitles = 1;</code>
     */
    public int getNewsDtoTitlesCount() {
      if (newsDtoTitlesBuilder_ == null) {
        return newsDtoTitles_.size();
      } else {
        return newsDtoTitlesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .NewsDtoTitle newsDtoTitles = 1;</code>
     */
    public com.plethora.TestworkClevertec2021.dto.NewsDtoTitle getNewsDtoTitles(int index) {
      if (newsDtoTitlesBuilder_ == null) {
        return newsDtoTitles_.get(index);
      } else {
        return newsDtoTitlesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .NewsDtoTitle newsDtoTitles = 1;</code>
     */
    public Builder setNewsDtoTitles(
        int index, com.plethora.TestworkClevertec2021.dto.NewsDtoTitle value) {
      if (newsDtoTitlesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNewsDtoTitlesIsMutable();
        newsDtoTitles_.set(index, value);
        onChanged();
      } else {
        newsDtoTitlesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .NewsDtoTitle newsDtoTitles = 1;</code>
     */
    public Builder setNewsDtoTitles(
        int index, com.plethora.TestworkClevertec2021.dto.NewsDtoTitle.Builder builderForValue) {
      if (newsDtoTitlesBuilder_ == null) {
        ensureNewsDtoTitlesIsMutable();
        newsDtoTitles_.set(index, builderForValue.build());
        onChanged();
      } else {
        newsDtoTitlesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .NewsDtoTitle newsDtoTitles = 1;</code>
     */
    public Builder addNewsDtoTitles(com.plethora.TestworkClevertec2021.dto.NewsDtoTitle value) {
      if (newsDtoTitlesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNewsDtoTitlesIsMutable();
        newsDtoTitles_.add(value);
        onChanged();
      } else {
        newsDtoTitlesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .NewsDtoTitle newsDtoTitles = 1;</code>
     */
    public Builder addNewsDtoTitles(
        int index, com.plethora.TestworkClevertec2021.dto.NewsDtoTitle value) {
      if (newsDtoTitlesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNewsDtoTitlesIsMutable();
        newsDtoTitles_.add(index, value);
        onChanged();
      } else {
        newsDtoTitlesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .NewsDtoTitle newsDtoTitles = 1;</code>
     */
    public Builder addNewsDtoTitles(
        com.plethora.TestworkClevertec2021.dto.NewsDtoTitle.Builder builderForValue) {
      if (newsDtoTitlesBuilder_ == null) {
        ensureNewsDtoTitlesIsMutable();
        newsDtoTitles_.add(builderForValue.build());
        onChanged();
      } else {
        newsDtoTitlesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .NewsDtoTitle newsDtoTitles = 1;</code>
     */
    public Builder addNewsDtoTitles(
        int index, com.plethora.TestworkClevertec2021.dto.NewsDtoTitle.Builder builderForValue) {
      if (newsDtoTitlesBuilder_ == null) {
        ensureNewsDtoTitlesIsMutable();
        newsDtoTitles_.add(index, builderForValue.build());
        onChanged();
      } else {
        newsDtoTitlesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .NewsDtoTitle newsDtoTitles = 1;</code>
     */
    public Builder addAllNewsDtoTitles(
        java.lang.Iterable<? extends com.plethora.TestworkClevertec2021.dto.NewsDtoTitle> values) {
      if (newsDtoTitlesBuilder_ == null) {
        ensureNewsDtoTitlesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, newsDtoTitles_);
        onChanged();
      } else {
        newsDtoTitlesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .NewsDtoTitle newsDtoTitles = 1;</code>
     */
    public Builder clearNewsDtoTitles() {
      if (newsDtoTitlesBuilder_ == null) {
        newsDtoTitles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        newsDtoTitlesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .NewsDtoTitle newsDtoTitles = 1;</code>
     */
    public Builder removeNewsDtoTitles(int index) {
      if (newsDtoTitlesBuilder_ == null) {
        ensureNewsDtoTitlesIsMutable();
        newsDtoTitles_.remove(index);
        onChanged();
      } else {
        newsDtoTitlesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .NewsDtoTitle newsDtoTitles = 1;</code>
     */
    public com.plethora.TestworkClevertec2021.dto.NewsDtoTitle.Builder getNewsDtoTitlesBuilder(
        int index) {
      return getNewsDtoTitlesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .NewsDtoTitle newsDtoTitles = 1;</code>
     */
    public com.plethora.TestworkClevertec2021.dto.NewsDtoTitleOrBuilder getNewsDtoTitlesOrBuilder(
        int index) {
      if (newsDtoTitlesBuilder_ == null) {
        return newsDtoTitles_.get(index);  } else {
        return newsDtoTitlesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .NewsDtoTitle newsDtoTitles = 1;</code>
     */
    public java.util.List<? extends com.plethora.TestworkClevertec2021.dto.NewsDtoTitleOrBuilder> 
         getNewsDtoTitlesOrBuilderList() {
      if (newsDtoTitlesBuilder_ != null) {
        return newsDtoTitlesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(newsDtoTitles_);
      }
    }
    /**
     * <code>repeated .NewsDtoTitle newsDtoTitles = 1;</code>
     */
    public com.plethora.TestworkClevertec2021.dto.NewsDtoTitle.Builder addNewsDtoTitlesBuilder() {
      return getNewsDtoTitlesFieldBuilder().addBuilder(
          com.plethora.TestworkClevertec2021.dto.NewsDtoTitle.getDefaultInstance());
    }
    /**
     * <code>repeated .NewsDtoTitle newsDtoTitles = 1;</code>
     */
    public com.plethora.TestworkClevertec2021.dto.NewsDtoTitle.Builder addNewsDtoTitlesBuilder(
        int index) {
      return getNewsDtoTitlesFieldBuilder().addBuilder(
          index, com.plethora.TestworkClevertec2021.dto.NewsDtoTitle.getDefaultInstance());
    }
    /**
     * <code>repeated .NewsDtoTitle newsDtoTitles = 1;</code>
     */
    public java.util.List<com.plethora.TestworkClevertec2021.dto.NewsDtoTitle.Builder> 
         getNewsDtoTitlesBuilderList() {
      return getNewsDtoTitlesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.plethora.TestworkClevertec2021.dto.NewsDtoTitle, com.plethora.TestworkClevertec2021.dto.NewsDtoTitle.Builder, com.plethora.TestworkClevertec2021.dto.NewsDtoTitleOrBuilder> 
        getNewsDtoTitlesFieldBuilder() {
      if (newsDtoTitlesBuilder_ == null) {
        newsDtoTitlesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.plethora.TestworkClevertec2021.dto.NewsDtoTitle, com.plethora.TestworkClevertec2021.dto.NewsDtoTitle.Builder, com.plethora.TestworkClevertec2021.dto.NewsDtoTitleOrBuilder>(
                newsDtoTitles_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        newsDtoTitles_ = null;
      }
      return newsDtoTitlesBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ListOfNewsTitle)
  }

  // @@protoc_insertion_point(class_scope:ListOfNewsTitle)
  private static final com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle();
  }

  public static com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListOfNewsTitle>
      PARSER = new com.google.protobuf.AbstractParser<ListOfNewsTitle>() {
    @java.lang.Override
    public ListOfNewsTitle parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListOfNewsTitle(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListOfNewsTitle> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListOfNewsTitle> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.plethora.TestworkClevertec2021.dto.ListOfNewsTitle getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
