// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/protobuf/struct.proto

package com.google.protobuf;

/**
 * Protobuf type {@code google.protobuf.Value}
 *
 * <pre>
 * `Value` represents a dynamically typed value which can be either
 * null, a number, a string, a boolean, a recursive struct value, or a
 * list of values. A producer of value is expected to set one of that
 * variants, absence of any variant indicates an error.
 * </pre>
 */
public  final class Value extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.protobuf.Value)
    ValueOrBuilder {
  // Use Value.newBuilder() to construct.
  private Value(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Value() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Value(
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
          case 8: {
            int rawValue = input.readEnum();
            kindCase_ = 1;
            kind_ = rawValue;
            break;
          }
          case 17: {
            kindCase_ = 2;
            kind_ = input.readDouble();
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();
            kindCase_ = 3;
            kind_ = s;
            break;
          }
          case 32: {
            kindCase_ = 4;
            kind_ = input.readBool();
            break;
          }
          case 42: {
            com.google.protobuf.Struct.Builder subBuilder = null;
            if (kindCase_ == 5) {
              subBuilder = ((com.google.protobuf.Struct) kind_).toBuilder();
            }
            kind_ =
                input.readMessage(com.google.protobuf.Struct.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.google.protobuf.Struct) kind_);
              kind_ = subBuilder.buildPartial();
            }
            kindCase_ = 5;
            break;
          }
          case 50: {
            com.google.protobuf.ListValue.Builder subBuilder = null;
            if (kindCase_ == 6) {
              subBuilder = ((com.google.protobuf.ListValue) kind_).toBuilder();
            }
            kind_ =
                input.readMessage(com.google.protobuf.ListValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.google.protobuf.ListValue) kind_);
              kind_ = subBuilder.buildPartial();
            }
            kindCase_ = 6;
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
    return com.google.protobuf.StructProto.internal_static_google_protobuf_Value_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.protobuf.StructProto.internal_static_google_protobuf_Value_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.protobuf.Value.class, com.google.protobuf.Value.Builder.class);
  }

  private int kindCase_ = 0;
  private java.lang.Object kind_;
  public enum KindCase
      implements com.google.protobuf.Internal.EnumLite {
    NULL_VALUE(1),
    NUMBER_VALUE(2),
    STRING_VALUE(3),
    BOOL_VALUE(4),
    STRUCT_VALUE(5),
    LIST_VALUE(6),
    KIND_NOT_SET(0);
    private int value = 0;
    private KindCase(int value) {
      this.value = value;
    }
    public static KindCase valueOf(int value) {
      switch (value) {
        case 1: return NULL_VALUE;
        case 2: return NUMBER_VALUE;
        case 3: return STRING_VALUE;
        case 4: return BOOL_VALUE;
        case 5: return STRUCT_VALUE;
        case 6: return LIST_VALUE;
        case 0: return KIND_NOT_SET;
        default: throw new java.lang.IllegalArgumentException(
          "Value is undefined for this oneof enum.");
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public KindCase
  getKindCase() {
    return KindCase.valueOf(
        kindCase_);
  }

  public static final int NULL_VALUE_FIELD_NUMBER = 1;
  /**
   * <code>optional .google.protobuf.NullValue null_value = 1;</code>
   *
   * <pre>
   * Represents a null value.
   * </pre>
   */
  public int getNullValueValue() {
    if (kindCase_ == 1) {
      return (java.lang.Integer) kind_;
    }
    return 0;
  }
  /**
   * <code>optional .google.protobuf.NullValue null_value = 1;</code>
   *
   * <pre>
   * Represents a null value.
   * </pre>
   */
  public com.google.protobuf.NullValue getNullValue() {
    if (kindCase_ == 1) {
      com.google.protobuf.NullValue result =  com.google.protobuf.NullValue.valueOf((java.lang.Integer) kind_);
      return result == null ? com.google.protobuf.NullValue.UNRECOGNIZED : result;
    }
    return com.google.protobuf.NullValue.NULL_VALUE;
  }

  public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
  /**
   * <code>optional double number_value = 2;</code>
   *
   * <pre>
   * Represents a double value.
   * </pre>
   */
  public double getNumberValue() {
    if (kindCase_ == 2) {
      return (java.lang.Double) kind_;
    }
    return 0D;
  }

  public static final int STRING_VALUE_FIELD_NUMBER = 3;
  /**
   * <code>optional string string_value = 3;</code>
   *
   * <pre>
   * Represents a string value.
   * </pre>
   */
  public java.lang.String getStringValue() {
    java.lang.Object ref = "";
    if (kindCase_ == 3) {
      ref = kind_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (kindCase_ == 3) {
        kind_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string string_value = 3;</code>
   *
   * <pre>
   * Represents a string value.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getStringValueBytes() {
    java.lang.Object ref = "";
    if (kindCase_ == 3) {
      ref = kind_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (kindCase_ == 3) {
        kind_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BOOL_VALUE_FIELD_NUMBER = 4;
  /**
   * <code>optional bool bool_value = 4;</code>
   *
   * <pre>
   * Represents a boolean value.
   * </pre>
   */
  public boolean getBoolValue() {
    if (kindCase_ == 4) {
      return (java.lang.Boolean) kind_;
    }
    return false;
  }

  public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
  /**
   * <code>optional .google.protobuf.Struct struct_value = 5;</code>
   *
   * <pre>
   * Represents a structured value.
   * </pre>
   */
  public com.google.protobuf.Struct getStructValue() {
    if (kindCase_ == 5) {
       return (com.google.protobuf.Struct) kind_;
    }
    return com.google.protobuf.Struct.getDefaultInstance();
  }
  /**
   * <code>optional .google.protobuf.Struct struct_value = 5;</code>
   *
   * <pre>
   * Represents a structured value.
   * </pre>
   */
  public com.google.protobuf.StructOrBuilder getStructValueOrBuilder() {
    if (kindCase_ == 5) {
       return (com.google.protobuf.Struct) kind_;
    }
    return com.google.protobuf.Struct.getDefaultInstance();
  }

  public static final int LIST_VALUE_FIELD_NUMBER = 6;
  /**
   * <code>optional .google.protobuf.ListValue list_value = 6;</code>
   *
   * <pre>
   * Represents a repeated `Value`.
   * </pre>
   */
  public com.google.protobuf.ListValue getListValue() {
    if (kindCase_ == 6) {
       return (com.google.protobuf.ListValue) kind_;
    }
    return com.google.protobuf.ListValue.getDefaultInstance();
  }
  /**
   * <code>optional .google.protobuf.ListValue list_value = 6;</code>
   *
   * <pre>
   * Represents a repeated `Value`.
   * </pre>
   */
  public com.google.protobuf.ListValueOrBuilder getListValueOrBuilder() {
    if (kindCase_ == 6) {
       return (com.google.protobuf.ListValue) kind_;
    }
    return com.google.protobuf.ListValue.getDefaultInstance();
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
    if (kindCase_ == 1) {
      output.writeEnum(1, ((java.lang.Integer) kind_));
    }
    if (kindCase_ == 2) {
      output.writeDouble(
          2, (double)((java.lang.Double) kind_));
    }
    if (kindCase_ == 3) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, kind_);
    }
    if (kindCase_ == 4) {
      output.writeBool(
          4, (boolean)((java.lang.Boolean) kind_));
    }
    if (kindCase_ == 5) {
      output.writeMessage(5, (com.google.protobuf.Struct) kind_);
    }
    if (kindCase_ == 6) {
      output.writeMessage(6, (com.google.protobuf.ListValue) kind_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (kindCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, ((java.lang.Integer) kind_));
    }
    if (kindCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(
            2, (double)((java.lang.Double) kind_));
    }
    if (kindCase_ == 3) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, kind_);
    }
    if (kindCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(
            4, (boolean)((java.lang.Boolean) kind_));
    }
    if (kindCase_ == 5) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, (com.google.protobuf.Struct) kind_);
    }
    if (kindCase_ == 6) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, (com.google.protobuf.ListValue) kind_);
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
    if (!(obj instanceof com.google.protobuf.Value)) {
      return super.equals(obj);
    }
    com.google.protobuf.Value other = (com.google.protobuf.Value) obj;

    boolean result = true;
    result = result && getKindCase().equals(
        other.getKindCase());
    if (!result) return false;
    switch (kindCase_) {
      case 1:
        result = result && getNullValueValue()
            == other.getNullValueValue();
        break;
      case 2:
        result = result && (
            java.lang.Double.doubleToLongBits(getNumberValue())
            == java.lang.Double.doubleToLongBits(
                other.getNumberValue()));
        break;
      case 3:
        result = result && getStringValue()
            .equals(other.getStringValue());
        break;
      case 4:
        result = result && (getBoolValue()
            == other.getBoolValue());
        break;
      case 5:
        result = result && getStructValue()
            .equals(other.getStructValue());
        break;
      case 6:
        result = result && getListValue()
            .equals(other.getListValue());
        break;
      case 0:
      default:
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + NULL_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getNullValueValue();
    hash = (37 * hash) + NUMBER_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getNumberValue()));
    hash = (37 * hash) + STRING_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getStringValue().hashCode();
    hash = (37 * hash) + BOOL_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBoolValue());
    hash = (37 * hash) + STRUCT_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getStructValue().hashCode();
    hash = (37 * hash) + LIST_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getListValue().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.protobuf.Value parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.protobuf.Value parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.protobuf.Value parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.protobuf.Value parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.protobuf.Value parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.protobuf.Value parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.protobuf.Value parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.protobuf.Value parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.protobuf.Value parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.protobuf.Value parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.protobuf.Value prototype) {
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
   * Protobuf type {@code google.protobuf.Value}
   *
   * <pre>
   * `Value` represents a dynamically typed value which can be either
   * null, a number, a string, a boolean, a recursive struct value, or a
   * list of values. A producer of value is expected to set one of that
   * variants, absence of any variant indicates an error.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.protobuf.Value)
      com.google.protobuf.ValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.protobuf.StructProto.internal_static_google_protobuf_Value_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.protobuf.StructProto.internal_static_google_protobuf_Value_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.protobuf.Value.class, com.google.protobuf.Value.Builder.class);
    }

    // Construct using com.google.protobuf.Value.newBuilder()
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
      kindCase_ = 0;
      kind_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.protobuf.StructProto.internal_static_google_protobuf_Value_descriptor;
    }

    public com.google.protobuf.Value getDefaultInstanceForType() {
      return com.google.protobuf.Value.getDefaultInstance();
    }

    public com.google.protobuf.Value build() {
      com.google.protobuf.Value result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.protobuf.Value buildPartial() {
      com.google.protobuf.Value result = new com.google.protobuf.Value(this);
      if (kindCase_ == 1) {
        result.kind_ = kind_;
      }
      if (kindCase_ == 2) {
        result.kind_ = kind_;
      }
      if (kindCase_ == 3) {
        result.kind_ = kind_;
      }
      if (kindCase_ == 4) {
        result.kind_ = kind_;
      }
      if (kindCase_ == 5) {
        if (structValueBuilder_ == null) {
          result.kind_ = kind_;
        } else {
          result.kind_ = structValueBuilder_.build();
        }
      }
      if (kindCase_ == 6) {
        if (listValueBuilder_ == null) {
          result.kind_ = kind_;
        } else {
          result.kind_ = listValueBuilder_.build();
        }
      }
      result.kindCase_ = kindCase_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.protobuf.Value) {
        return mergeFrom((com.google.protobuf.Value)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.protobuf.Value other) {
      if (other == com.google.protobuf.Value.getDefaultInstance()) return this;
      switch (other.getKindCase()) {
        case NULL_VALUE: {
          setNullValueValue(other.getNullValueValue());
          break;
        }
        case NUMBER_VALUE: {
          setNumberValue(other.getNumberValue());
          break;
        }
        case STRING_VALUE: {
          kindCase_ = 3;
          kind_ = other.kind_;
          onChanged();
          break;
        }
        case BOOL_VALUE: {
          setBoolValue(other.getBoolValue());
          break;
        }
        case STRUCT_VALUE: {
          mergeStructValue(other.getStructValue());
          break;
        }
        case LIST_VALUE: {
          mergeListValue(other.getListValue());
          break;
        }
        case KIND_NOT_SET: {
          break;
        }
      }
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
      com.google.protobuf.Value parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.protobuf.Value) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int kindCase_ = 0;
    private java.lang.Object kind_;
    public KindCase
        getKindCase() {
      return KindCase.valueOf(
          kindCase_);
    }

    public Builder clearKind() {
      kindCase_ = 0;
      kind_ = null;
      onChanged();
      return this;
    }


    /**
     * <code>optional .google.protobuf.NullValue null_value = 1;</code>
     *
     * <pre>
     * Represents a null value.
     * </pre>
     */
    public int getNullValueValue() {
      if (kindCase_ == 1) {
        return ((java.lang.Integer) kind_).intValue();
      }
      return 0;
    }
    /**
     * <code>optional .google.protobuf.NullValue null_value = 1;</code>
     *
     * <pre>
     * Represents a null value.
     * </pre>
     */
    public Builder setNullValueValue(int value) {
      kindCase_ = 1;
      kind_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.protobuf.NullValue null_value = 1;</code>
     *
     * <pre>
     * Represents a null value.
     * </pre>
     */
    public com.google.protobuf.NullValue getNullValue() {
      if (kindCase_ == 1) {
        com.google.protobuf.NullValue result =  com.google.protobuf.NullValue.valueOf((java.lang.Integer) kind_);
        return result == null ? com.google.protobuf.NullValue.UNRECOGNIZED : result;
      }
      return com.google.protobuf.NullValue.NULL_VALUE;
    }
    /**
     * <code>optional .google.protobuf.NullValue null_value = 1;</code>
     *
     * <pre>
     * Represents a null value.
     * </pre>
     */
    public Builder setNullValue(com.google.protobuf.NullValue value) {
      if (value == null) {
        throw new NullPointerException();
      }
      kindCase_ = 1;
      kind_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.protobuf.NullValue null_value = 1;</code>
     *
     * <pre>
     * Represents a null value.
     * </pre>
     */
    public Builder clearNullValue() {
      if (kindCase_ == 1) {
        kindCase_ = 0;
        kind_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>optional double number_value = 2;</code>
     *
     * <pre>
     * Represents a double value.
     * </pre>
     */
    public double getNumberValue() {
      if (kindCase_ == 2) {
        return (java.lang.Double) kind_;
      }
      return 0D;
    }
    /**
     * <code>optional double number_value = 2;</code>
     *
     * <pre>
     * Represents a double value.
     * </pre>
     */
    public Builder setNumberValue(double value) {
      kindCase_ = 2;
      kind_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional double number_value = 2;</code>
     *
     * <pre>
     * Represents a double value.
     * </pre>
     */
    public Builder clearNumberValue() {
      if (kindCase_ == 2) {
        kindCase_ = 0;
        kind_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>optional string string_value = 3;</code>
     *
     * <pre>
     * Represents a string value.
     * </pre>
     */
    public java.lang.String getStringValue() {
      java.lang.Object ref = "";
      if (kindCase_ == 3) {
        ref = kind_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (kindCase_ == 3) {
          kind_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string string_value = 3;</code>
     *
     * <pre>
     * Represents a string value.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getStringValueBytes() {
      java.lang.Object ref = "";
      if (kindCase_ == 3) {
        ref = kind_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (kindCase_ == 3) {
          kind_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string string_value = 3;</code>
     *
     * <pre>
     * Represents a string value.
     * </pre>
     */
    public Builder setStringValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  kindCase_ = 3;
      kind_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string string_value = 3;</code>
     *
     * <pre>
     * Represents a string value.
     * </pre>
     */
    public Builder clearStringValue() {
      if (kindCase_ == 3) {
        kindCase_ = 0;
        kind_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>optional string string_value = 3;</code>
     *
     * <pre>
     * Represents a string value.
     * </pre>
     */
    public Builder setStringValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      kindCase_ = 3;
      kind_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>optional bool bool_value = 4;</code>
     *
     * <pre>
     * Represents a boolean value.
     * </pre>
     */
    public boolean getBoolValue() {
      if (kindCase_ == 4) {
        return (java.lang.Boolean) kind_;
      }
      return false;
    }
    /**
     * <code>optional bool bool_value = 4;</code>
     *
     * <pre>
     * Represents a boolean value.
     * </pre>
     */
    public Builder setBoolValue(boolean value) {
      kindCase_ = 4;
      kind_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool bool_value = 4;</code>
     *
     * <pre>
     * Represents a boolean value.
     * </pre>
     */
    public Builder clearBoolValue() {
      if (kindCase_ == 4) {
        kindCase_ = 0;
        kind_ = null;
        onChanged();
      }
      return this;
    }

    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> structValueBuilder_;
    /**
     * <code>optional .google.protobuf.Struct struct_value = 5;</code>
     *
     * <pre>
     * Represents a structured value.
     * </pre>
     */
    public com.google.protobuf.Struct getStructValue() {
      if (structValueBuilder_ == null) {
        if (kindCase_ == 5) {
          return (com.google.protobuf.Struct) kind_;
        }
        return com.google.protobuf.Struct.getDefaultInstance();
      } else {
        if (kindCase_ == 5) {
          return structValueBuilder_.getMessage();
        }
        return com.google.protobuf.Struct.getDefaultInstance();
      }
    }
    /**
     * <code>optional .google.protobuf.Struct struct_value = 5;</code>
     *
     * <pre>
     * Represents a structured value.
     * </pre>
     */
    public Builder setStructValue(com.google.protobuf.Struct value) {
      if (structValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        kind_ = value;
        onChanged();
      } else {
        structValueBuilder_.setMessage(value);
      }
      kindCase_ = 5;
      return this;
    }
    /**
     * <code>optional .google.protobuf.Struct struct_value = 5;</code>
     *
     * <pre>
     * Represents a structured value.
     * </pre>
     */
    public Builder setStructValue(
        com.google.protobuf.Struct.Builder builderForValue) {
      if (structValueBuilder_ == null) {
        kind_ = builderForValue.build();
        onChanged();
      } else {
        structValueBuilder_.setMessage(builderForValue.build());
      }
      kindCase_ = 5;
      return this;
    }
    /**
     * <code>optional .google.protobuf.Struct struct_value = 5;</code>
     *
     * <pre>
     * Represents a structured value.
     * </pre>
     */
    public Builder mergeStructValue(com.google.protobuf.Struct value) {
      if (structValueBuilder_ == null) {
        if (kindCase_ == 5 &&
            kind_ != com.google.protobuf.Struct.getDefaultInstance()) {
          kind_ = com.google.protobuf.Struct.newBuilder((com.google.protobuf.Struct) kind_)
              .mergeFrom(value).buildPartial();
        } else {
          kind_ = value;
        }
        onChanged();
      } else {
        if (kindCase_ == 5) {
          structValueBuilder_.mergeFrom(value);
        }
        structValueBuilder_.setMessage(value);
      }
      kindCase_ = 5;
      return this;
    }
    /**
     * <code>optional .google.protobuf.Struct struct_value = 5;</code>
     *
     * <pre>
     * Represents a structured value.
     * </pre>
     */
    public Builder clearStructValue() {
      if (structValueBuilder_ == null) {
        if (kindCase_ == 5) {
          kindCase_ = 0;
          kind_ = null;
          onChanged();
        }
      } else {
        if (kindCase_ == 5) {
          kindCase_ = 0;
          kind_ = null;
        }
        structValueBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>optional .google.protobuf.Struct struct_value = 5;</code>
     *
     * <pre>
     * Represents a structured value.
     * </pre>
     */
    public com.google.protobuf.Struct.Builder getStructValueBuilder() {
      return getStructValueFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.protobuf.Struct struct_value = 5;</code>
     *
     * <pre>
     * Represents a structured value.
     * </pre>
     */
    public com.google.protobuf.StructOrBuilder getStructValueOrBuilder() {
      if ((kindCase_ == 5) && (structValueBuilder_ != null)) {
        return structValueBuilder_.getMessageOrBuilder();
      } else {
        if (kindCase_ == 5) {
          return (com.google.protobuf.Struct) kind_;
        }
        return com.google.protobuf.Struct.getDefaultInstance();
      }
    }
    /**
     * <code>optional .google.protobuf.Struct struct_value = 5;</code>
     *
     * <pre>
     * Represents a structured value.
     * </pre>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> 
        getStructValueFieldBuilder() {
      if (structValueBuilder_ == null) {
        if (!(kindCase_ == 5)) {
          kind_ = com.google.protobuf.Struct.getDefaultInstance();
        }
        structValueBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder>(
                (com.google.protobuf.Struct) kind_,
                getParentForChildren(),
                isClean());
        kind_ = null;
      }
      kindCase_ = 5;
      onChanged();;
      return structValueBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.ListValue, com.google.protobuf.ListValue.Builder, com.google.protobuf.ListValueOrBuilder> listValueBuilder_;
    /**
     * <code>optional .google.protobuf.ListValue list_value = 6;</code>
     *
     * <pre>
     * Represents a repeated `Value`.
     * </pre>
     */
    public com.google.protobuf.ListValue getListValue() {
      if (listValueBuilder_ == null) {
        if (kindCase_ == 6) {
          return (com.google.protobuf.ListValue) kind_;
        }
        return com.google.protobuf.ListValue.getDefaultInstance();
      } else {
        if (kindCase_ == 6) {
          return listValueBuilder_.getMessage();
        }
        return com.google.protobuf.ListValue.getDefaultInstance();
      }
    }
    /**
     * <code>optional .google.protobuf.ListValue list_value = 6;</code>
     *
     * <pre>
     * Represents a repeated `Value`.
     * </pre>
     */
    public Builder setListValue(com.google.protobuf.ListValue value) {
      if (listValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        kind_ = value;
        onChanged();
      } else {
        listValueBuilder_.setMessage(value);
      }
      kindCase_ = 6;
      return this;
    }
    /**
     * <code>optional .google.protobuf.ListValue list_value = 6;</code>
     *
     * <pre>
     * Represents a repeated `Value`.
     * </pre>
     */
    public Builder setListValue(
        com.google.protobuf.ListValue.Builder builderForValue) {
      if (listValueBuilder_ == null) {
        kind_ = builderForValue.build();
        onChanged();
      } else {
        listValueBuilder_.setMessage(builderForValue.build());
      }
      kindCase_ = 6;
      return this;
    }
    /**
     * <code>optional .google.protobuf.ListValue list_value = 6;</code>
     *
     * <pre>
     * Represents a repeated `Value`.
     * </pre>
     */
    public Builder mergeListValue(com.google.protobuf.ListValue value) {
      if (listValueBuilder_ == null) {
        if (kindCase_ == 6 &&
            kind_ != com.google.protobuf.ListValue.getDefaultInstance()) {
          kind_ = com.google.protobuf.ListValue.newBuilder((com.google.protobuf.ListValue) kind_)
              .mergeFrom(value).buildPartial();
        } else {
          kind_ = value;
        }
        onChanged();
      } else {
        if (kindCase_ == 6) {
          listValueBuilder_.mergeFrom(value);
        }
        listValueBuilder_.setMessage(value);
      }
      kindCase_ = 6;
      return this;
    }
    /**
     * <code>optional .google.protobuf.ListValue list_value = 6;</code>
     *
     * <pre>
     * Represents a repeated `Value`.
     * </pre>
     */
    public Builder clearListValue() {
      if (listValueBuilder_ == null) {
        if (kindCase_ == 6) {
          kindCase_ = 0;
          kind_ = null;
          onChanged();
        }
      } else {
        if (kindCase_ == 6) {
          kindCase_ = 0;
          kind_ = null;
        }
        listValueBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>optional .google.protobuf.ListValue list_value = 6;</code>
     *
     * <pre>
     * Represents a repeated `Value`.
     * </pre>
     */
    public com.google.protobuf.ListValue.Builder getListValueBuilder() {
      return getListValueFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.protobuf.ListValue list_value = 6;</code>
     *
     * <pre>
     * Represents a repeated `Value`.
     * </pre>
     */
    public com.google.protobuf.ListValueOrBuilder getListValueOrBuilder() {
      if ((kindCase_ == 6) && (listValueBuilder_ != null)) {
        return listValueBuilder_.getMessageOrBuilder();
      } else {
        if (kindCase_ == 6) {
          return (com.google.protobuf.ListValue) kind_;
        }
        return com.google.protobuf.ListValue.getDefaultInstance();
      }
    }
    /**
     * <code>optional .google.protobuf.ListValue list_value = 6;</code>
     *
     * <pre>
     * Represents a repeated `Value`.
     * </pre>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.ListValue, com.google.protobuf.ListValue.Builder, com.google.protobuf.ListValueOrBuilder> 
        getListValueFieldBuilder() {
      if (listValueBuilder_ == null) {
        if (!(kindCase_ == 6)) {
          kind_ = com.google.protobuf.ListValue.getDefaultInstance();
        }
        listValueBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.ListValue, com.google.protobuf.ListValue.Builder, com.google.protobuf.ListValueOrBuilder>(
                (com.google.protobuf.ListValue) kind_,
                getParentForChildren(),
                isClean());
        kind_ = null;
      }
      kindCase_ = 6;
      onChanged();;
      return listValueBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.protobuf.Value)
  }

  // @@protoc_insertion_point(class_scope:google.protobuf.Value)
  private static final com.google.protobuf.Value DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.protobuf.Value();
  }

  public static com.google.protobuf.Value getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Value>
      PARSER = new com.google.protobuf.AbstractParser<Value>() {
    public Value parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new Value(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<Value> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Value> getParserForType() {
    return PARSER;
  }

  public com.google.protobuf.Value getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

