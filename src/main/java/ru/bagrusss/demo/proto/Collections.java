// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: collections.proto

package ru.bagrusss.demo.proto;

/**
 * Protobuf type {@code demo.Collections}
 */
public  final class Collections extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:demo.Collections)
    CollectionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Collections.newBuilder() to construct.
  private Collections(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Collections() {
    strings_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Collections(
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
            com.google.protobuf.ByteString bs = input.readBytes();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              strings_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            strings_.add(bs);
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              usersMap_ = com.google.protobuf.MapField.newMapField(
                  UsersMapDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000002;
            }
            com.google.protobuf.MapEntry<java.lang.String, ru.bagrusss.demo.proto.User>
            usersMap__ = input.readMessage(
                UsersMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            usersMap_.getMutableMap().put(
                usersMap__.getKey(), usersMap__.getValue());
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        strings_ = strings_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ru.bagrusss.demo.proto.CollectionsOuterClass.internal_static_demo_Collections_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetUsersMap();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ru.bagrusss.demo.proto.CollectionsOuterClass.internal_static_demo_Collections_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ru.bagrusss.demo.proto.Collections.class, ru.bagrusss.demo.proto.Collections.Builder.class);
  }

  public static final int STRINGS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList strings_;
  /**
   * <code>repeated string strings = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getStringsList() {
    return strings_;
  }
  /**
   * <code>repeated string strings = 1;</code>
   */
  public int getStringsCount() {
    return strings_.size();
  }
  /**
   * <code>repeated string strings = 1;</code>
   */
  public java.lang.String getStrings(int index) {
    return strings_.get(index);
  }
  /**
   * <code>repeated string strings = 1;</code>
   */
  public com.google.protobuf.ByteString
      getStringsBytes(int index) {
    return strings_.getByteString(index);
  }

  public static final int USERSMAP_FIELD_NUMBER = 2;
  private static final class UsersMapDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, ru.bagrusss.demo.proto.User> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, ru.bagrusss.demo.proto.User>newDefaultInstance(
                ru.bagrusss.demo.proto.CollectionsOuterClass.internal_static_demo_Collections_UsersMapEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                ru.bagrusss.demo.proto.User.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, ru.bagrusss.demo.proto.User> usersMap_;
  private com.google.protobuf.MapField<java.lang.String, ru.bagrusss.demo.proto.User>
  internalGetUsersMap() {
    if (usersMap_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          UsersMapDefaultEntryHolder.defaultEntry);
    }
    return usersMap_;
  }

  public int getUsersMapCount() {
    return internalGetUsersMap().getMap().size();
  }
  /**
   * <code>map&lt;string, .demo.User&gt; usersMap = 2;</code>
   */

  public boolean containsUsersMap(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetUsersMap().getMap().containsKey(key);
  }
  /**
   * Use {@link #getUsersMapMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, ru.bagrusss.demo.proto.User> getUsersMap() {
    return getUsersMapMap();
  }
  /**
   * <code>map&lt;string, .demo.User&gt; usersMap = 2;</code>
   */

  public java.util.Map<java.lang.String, ru.bagrusss.demo.proto.User> getUsersMapMap() {
    return internalGetUsersMap().getMap();
  }
  /**
   * <code>map&lt;string, .demo.User&gt; usersMap = 2;</code>
   */

  public ru.bagrusss.demo.proto.User getUsersMapOrDefault(
      java.lang.String key,
      ru.bagrusss.demo.proto.User defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, ru.bagrusss.demo.proto.User> map =
        internalGetUsersMap().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .demo.User&gt; usersMap = 2;</code>
   */

  public ru.bagrusss.demo.proto.User getUsersMapOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, ru.bagrusss.demo.proto.User> map =
        internalGetUsersMap().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    for (ru.bagrusss.demo.proto.User item : getUsersMapMap().values()) {
      if (!item.isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
    }
    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < strings_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, strings_.getRaw(i));
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetUsersMap(),
        UsersMapDefaultEntryHolder.defaultEntry,
        2);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < strings_.size(); i++) {
        dataSize += computeStringSizeNoTag(strings_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getStringsList().size();
    }
    for (java.util.Map.Entry<java.lang.String, ru.bagrusss.demo.proto.User> entry
         : internalGetUsersMap().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, ru.bagrusss.demo.proto.User>
      usersMap__ = UsersMapDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, usersMap__);
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
    if (!(obj instanceof ru.bagrusss.demo.proto.Collections)) {
      return super.equals(obj);
    }
    ru.bagrusss.demo.proto.Collections other = (ru.bagrusss.demo.proto.Collections) obj;

    boolean result = true;
    result = result && getStringsList()
        .equals(other.getStringsList());
    result = result && internalGetUsersMap().equals(
        other.internalGetUsersMap());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getStringsCount() > 0) {
      hash = (37 * hash) + STRINGS_FIELD_NUMBER;
      hash = (53 * hash) + getStringsList().hashCode();
    }
    if (!internalGetUsersMap().getMap().isEmpty()) {
      hash = (37 * hash) + USERSMAP_FIELD_NUMBER;
      hash = (53 * hash) + internalGetUsersMap().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ru.bagrusss.demo.proto.Collections parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.bagrusss.demo.proto.Collections parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.bagrusss.demo.proto.Collections parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.bagrusss.demo.proto.Collections parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.bagrusss.demo.proto.Collections parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.bagrusss.demo.proto.Collections parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.bagrusss.demo.proto.Collections parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.bagrusss.demo.proto.Collections parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.bagrusss.demo.proto.Collections parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ru.bagrusss.demo.proto.Collections parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.bagrusss.demo.proto.Collections parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.bagrusss.demo.proto.Collections parseFrom(
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
  public static Builder newBuilder(ru.bagrusss.demo.proto.Collections prototype) {
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
   * Protobuf type {@code demo.Collections}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:demo.Collections)
      ru.bagrusss.demo.proto.CollectionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ru.bagrusss.demo.proto.CollectionsOuterClass.internal_static_demo_Collections_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetUsersMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableUsersMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ru.bagrusss.demo.proto.CollectionsOuterClass.internal_static_demo_Collections_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ru.bagrusss.demo.proto.Collections.class, ru.bagrusss.demo.proto.Collections.Builder.class);
    }

    // Construct using ru.bagrusss.demo.proto.Collections.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      strings_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableUsersMap().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ru.bagrusss.demo.proto.CollectionsOuterClass.internal_static_demo_Collections_descriptor;
    }

    @java.lang.Override
    public ru.bagrusss.demo.proto.Collections getDefaultInstanceForType() {
      return ru.bagrusss.demo.proto.Collections.getDefaultInstance();
    }

    @java.lang.Override
    public ru.bagrusss.demo.proto.Collections build() {
      ru.bagrusss.demo.proto.Collections result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ru.bagrusss.demo.proto.Collections buildPartial() {
      ru.bagrusss.demo.proto.Collections result = new ru.bagrusss.demo.proto.Collections(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        strings_ = strings_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.strings_ = strings_;
      result.usersMap_ = internalGetUsersMap();
      result.usersMap_.makeImmutable();
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ru.bagrusss.demo.proto.Collections) {
        return mergeFrom((ru.bagrusss.demo.proto.Collections)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ru.bagrusss.demo.proto.Collections other) {
      if (other == ru.bagrusss.demo.proto.Collections.getDefaultInstance()) return this;
      if (!other.strings_.isEmpty()) {
        if (strings_.isEmpty()) {
          strings_ = other.strings_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureStringsIsMutable();
          strings_.addAll(other.strings_);
        }
        onChanged();
      }
      internalGetMutableUsersMap().mergeFrom(
          other.internalGetUsersMap());
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      for (ru.bagrusss.demo.proto.User item : getUsersMapMap().values()) {
        if (!item.isInitialized()) {
          return false;
        }
      }
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ru.bagrusss.demo.proto.Collections parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ru.bagrusss.demo.proto.Collections) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList strings_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureStringsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        strings_ = new com.google.protobuf.LazyStringArrayList(strings_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string strings = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getStringsList() {
      return strings_.getUnmodifiableView();
    }
    /**
     * <code>repeated string strings = 1;</code>
     */
    public int getStringsCount() {
      return strings_.size();
    }
    /**
     * <code>repeated string strings = 1;</code>
     */
    public java.lang.String getStrings(int index) {
      return strings_.get(index);
    }
    /**
     * <code>repeated string strings = 1;</code>
     */
    public com.google.protobuf.ByteString
        getStringsBytes(int index) {
      return strings_.getByteString(index);
    }
    /**
     * <code>repeated string strings = 1;</code>
     */
    public Builder setStrings(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureStringsIsMutable();
      strings_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string strings = 1;</code>
     */
    public Builder addStrings(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureStringsIsMutable();
      strings_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string strings = 1;</code>
     */
    public Builder addAllStrings(
        java.lang.Iterable<java.lang.String> values) {
      ensureStringsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, strings_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string strings = 1;</code>
     */
    public Builder clearStrings() {
      strings_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string strings = 1;</code>
     */
    public Builder addStringsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureStringsIsMutable();
      strings_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, ru.bagrusss.demo.proto.User> usersMap_;
    private com.google.protobuf.MapField<java.lang.String, ru.bagrusss.demo.proto.User>
    internalGetUsersMap() {
      if (usersMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            UsersMapDefaultEntryHolder.defaultEntry);
      }
      return usersMap_;
    }
    private com.google.protobuf.MapField<java.lang.String, ru.bagrusss.demo.proto.User>
    internalGetMutableUsersMap() {
      onChanged();;
      if (usersMap_ == null) {
        usersMap_ = com.google.protobuf.MapField.newMapField(
            UsersMapDefaultEntryHolder.defaultEntry);
      }
      if (!usersMap_.isMutable()) {
        usersMap_ = usersMap_.copy();
      }
      return usersMap_;
    }

    public int getUsersMapCount() {
      return internalGetUsersMap().getMap().size();
    }
    /**
     * <code>map&lt;string, .demo.User&gt; usersMap = 2;</code>
     */

    public boolean containsUsersMap(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetUsersMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getUsersMapMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, ru.bagrusss.demo.proto.User> getUsersMap() {
      return getUsersMapMap();
    }
    /**
     * <code>map&lt;string, .demo.User&gt; usersMap = 2;</code>
     */

    public java.util.Map<java.lang.String, ru.bagrusss.demo.proto.User> getUsersMapMap() {
      return internalGetUsersMap().getMap();
    }
    /**
     * <code>map&lt;string, .demo.User&gt; usersMap = 2;</code>
     */

    public ru.bagrusss.demo.proto.User getUsersMapOrDefault(
        java.lang.String key,
        ru.bagrusss.demo.proto.User defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, ru.bagrusss.demo.proto.User> map =
          internalGetUsersMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .demo.User&gt; usersMap = 2;</code>
     */

    public ru.bagrusss.demo.proto.User getUsersMapOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, ru.bagrusss.demo.proto.User> map =
          internalGetUsersMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearUsersMap() {
      internalGetMutableUsersMap().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, .demo.User&gt; usersMap = 2;</code>
     */

    public Builder removeUsersMap(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableUsersMap().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, ru.bagrusss.demo.proto.User>
    getMutableUsersMap() {
      return internalGetMutableUsersMap().getMutableMap();
    }
    /**
     * <code>map&lt;string, .demo.User&gt; usersMap = 2;</code>
     */
    public Builder putUsersMap(
        java.lang.String key,
        ru.bagrusss.demo.proto.User value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableUsersMap().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, .demo.User&gt; usersMap = 2;</code>
     */

    public Builder putAllUsersMap(
        java.util.Map<java.lang.String, ru.bagrusss.demo.proto.User> values) {
      internalGetMutableUsersMap().getMutableMap()
          .putAll(values);
      return this;
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


    // @@protoc_insertion_point(builder_scope:demo.Collections)
  }

  // @@protoc_insertion_point(class_scope:demo.Collections)
  private static final ru.bagrusss.demo.proto.Collections DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ru.bagrusss.demo.proto.Collections();
  }

  public static ru.bagrusss.demo.proto.Collections getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<Collections>
      PARSER = new com.google.protobuf.AbstractParser<Collections>() {
    @java.lang.Override
    public Collections parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Collections(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Collections> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Collections> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ru.bagrusss.demo.proto.Collections getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

