// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/protobuf/struct.proto

package com.google.protobuf;

/**
 * Protobuf type {@code google.protobuf.Struct}
 *
 * <pre>
 * `Struct` represents a structured data value, consisting of fields
 * which map to dynamically typed values. In some languages, `Struct`
 * might be supported by a native representation. For example, in
 * scripting languages like JS a struct is represented as an
 * object. The details of that representation are described together
 * with the proto support for the language.
 * </pre>
 */
public  final class Struct extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.protobuf.Struct)
    StructOrBuilder {
  // Use Struct.newBuilder() to construct.
  private Struct(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Struct() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Struct(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              fields_ = com.google.protobuf.MapField.newMapField(
                  FieldsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.Value>
            fields = input.readMessage(
                FieldsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            fields_.getMutableMap().put(fields.getKey(), fields.getValue());
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.protobuf.StructProto.internal_static_google_protobuf_Struct_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetFields();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.protobuf.StructProto.internal_static_google_protobuf_Struct_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.protobuf.Struct.class, com.google.protobuf.Struct.Builder.class);
  }

  public static final int FIELDS_FIELD_NUMBER = 1;
  private static final class FieldsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.google.protobuf.Value> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.google.protobuf.Value>newDefaultInstance(
                com.google.protobuf.StructProto.internal_static_google_protobuf_Struct_FieldsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.google.protobuf.Value.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, com.google.protobuf.Value> fields_;
  private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.Value>
  internalGetFields() {
    if (fields_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          FieldsDefaultEntryHolder.defaultEntry);
   }
    return fields_;
  }
  /**
   * <code>map&lt;string, .google.protobuf.Value&gt; fields = 1;</code>
   *
   * <pre>
   * Map of dynamically typed values.
   * </pre>
   */

  public java.util.Map<java.lang.String, com.google.protobuf.Value> getFields() {
    return internalGetFields().getMap();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (java.util.Map.Entry<java.lang.String, com.google.protobuf.Value> entry
         : internalGetFields().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.Value>
      fields = FieldsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      output.writeMessage(1, fields);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, com.google.protobuf.Value> entry
         : internalGetFields().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.Value>
      fields = FieldsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, fields);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.protobuf.Struct)) {
      return super.equals(obj);
    }
    com.google.protobuf.Struct other = (com.google.protobuf.Struct) obj;

    boolean result = true;
    result = result && internalGetFields().equals(
        other.internalGetFields());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (!internalGetFields().getMap().isEmpty()) {
      hash = (37 * hash) + FIELDS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetFields().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.protobuf.Struct parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.protobuf.Struct parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.protobuf.Struct parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.protobuf.Struct parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.protobuf.Struct parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.protobuf.Struct parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.protobuf.Struct parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.protobuf.Struct parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.protobuf.Struct parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.protobuf.Struct parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.protobuf.Struct prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.protobuf.Struct}
   *
   * <pre>
   * `Struct` represents a structured data value, consisting of fields
   * which map to dynamically typed values. In some languages, `Struct`
   * might be supported by a native representation. For example, in
   * scripting languages like JS a struct is represented as an
   * object. The details of that representation are described together
   * with the proto support for the language.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.protobuf.Struct)
      com.google.protobuf.StructOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.protobuf.StructProto.internal_static_google_protobuf_Struct_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetFields();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableFields();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.protobuf.StructProto.internal_static_google_protobuf_Struct_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.protobuf.Struct.class, com.google.protobuf.Struct.Builder.class);
    }

    // Construct using com.google.protobuf.Struct.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      internalGetMutableFields().clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.protobuf.StructProto.internal_static_google_protobuf_Struct_descriptor;
    }

    public com.google.protobuf.Struct getDefaultInstanceForType() {
      return com.google.protobuf.Struct.getDefaultInstance();
    }

    public com.google.protobuf.Struct build() {
      com.google.protobuf.Struct result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.protobuf.Struct buildPartial() {
      com.google.protobuf.Struct result = new com.google.protobuf.Struct(this);
      int from_bitField0_ = bitField0_;
      result.fields_ = internalGetFields();
      result.fields_.makeImmutable();
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.protobuf.Struct) {
        return mergeFrom((com.google.protobuf.Struct)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.protobuf.Struct other) {
      if (other == com.google.protobuf.Struct.getDefaultInstance()) return this;
      internalGetMutableFields().mergeFrom(
          other.internalGetFields());
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.protobuf.Struct parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.protobuf.Struct) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, com.google.protobuf.Value> fields_;
    private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.Value>
    internalGetFields() {
      if (fields_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            FieldsDefaultEntryHolder.defaultEntry);
     }
      return fields_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.Value>
    internalGetMutableFields() {
      onChanged();;
      if (fields_ == null) {
        fields_ = com.google.protobuf.MapField.newMapField(
            FieldsDefaultEntryHolder.defaultEntry);
      }
      if (!fields_.isMutable()) {
        fields_ = fields_.copy();
      }
      return fields_;
    }
    /**
     * <code>map&lt;string, .google.protobuf.Value&gt; fields = 1;</code>
     *
     * <pre>
     * Map of dynamically typed values.
     * </pre>
     */
    public java.util.Map<java.lang.String, com.google.protobuf.Value> getFields() {
      return internalGetFields().getMap();
    }
    /**
     * <code>map&lt;string, .google.protobuf.Value&gt; fields = 1;</code>
     *
     * <pre>
     * Map of dynamically typed values.
     * </pre>
     */
    public java.util.Map<java.lang.String, com.google.protobuf.Value>
    getMutableFields() {
      return internalGetMutableFields().getMutableMap();
    }
    /**
     * <code>map&lt;string, .google.protobuf.Value&gt; fields = 1;</code>
     *
     * <pre>
     * Map of dynamically typed values.
     * </pre>
     */
    public Builder putAllFields(
        java.util.Map<java.lang.String, com.google.protobuf.Value> values) {
      getMutableFields().putAll(values);
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.protobuf.Struct)
  }

  // @@protoc_insertion_point(class_scope:google.protobuf.Struct)
  private static final com.google.protobuf.Struct DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.protobuf.Struct();
  }

  public static com.google.protobuf.Struct getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Struct>
      PARSER = new com.google.protobuf.AbstractParser<Struct>() {
    public Struct parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new Struct(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<Struct> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Struct> getParserForType() {
    return PARSER;
  }

  public com.google.protobuf.Struct getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

