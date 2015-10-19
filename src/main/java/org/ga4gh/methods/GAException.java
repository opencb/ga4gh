/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.methods;  
@SuppressWarnings("all")
/** A general exception type. */
@org.apache.avro.specific.AvroGenerated
public class GAException extends org.apache.avro.specific.SpecificExceptionBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"error\",\"name\":\"GAException\",\"namespace\":\"org.ga4gh.methods\",\"doc\":\"A general exception type.\",\"fields\":[{\"name\":\"message\",\"type\":\"string\",\"doc\":\"The error message\"},{\"name\":\"errorCode\",\"type\":\"int\",\"doc\":\"The numerical error code\",\"default\":-1}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The error message */
   private java.lang.CharSequence message$;
  /** The numerical error code */
   private int errorCode;

  public GAException() {
    super();
  }
  
  public GAException(Object value) {
    super(value);
  }

  public GAException(Throwable cause) {
    super(cause);
  }

  public GAException(Object value, Throwable cause) {
    super(value, cause);
  }
  
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return message$;
    case 1: return errorCode;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: message$ = (java.lang.CharSequence)value$; break;
    case 1: errorCode = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'message$' field.
   * The error message   */
  public java.lang.CharSequence getMessage$() {
    return message$;
  }

  /**
   * Sets the value of the 'message$' field.
   * The error message   * @param value the value to set.
   */
  public void setMessage$(java.lang.CharSequence value) {
    this.message$ = value;
  }

  /**
   * Gets the value of the 'errorCode' field.
   * The numerical error code   */
  public java.lang.Integer getErrorCode() {
    return errorCode;
  }

  /**
   * Sets the value of the 'errorCode' field.
   * The numerical error code   * @param value the value to set.
   */
  public void setErrorCode(java.lang.Integer value) {
    this.errorCode = value;
  }

  /** Creates a new GAException RecordBuilder */
  public static org.ga4gh.methods.GAException.Builder newBuilder() {
    return new org.ga4gh.methods.GAException.Builder();
  }
  
  /** Creates a new GAException RecordBuilder by copying an existing Builder */
  public static org.ga4gh.methods.GAException.Builder newBuilder(org.ga4gh.methods.GAException.Builder other) {
    return new org.ga4gh.methods.GAException.Builder(other);
  }
  
  /** Creates a new GAException RecordBuilder by copying an existing GAException instance */
  public static org.ga4gh.methods.GAException.Builder newBuilder(org.ga4gh.methods.GAException other) {
    return new org.ga4gh.methods.GAException.Builder(other);
  }
  
  /**
   * RecordBuilder for GAException instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificErrorBuilderBase<GAException>
    implements org.apache.avro.data.ErrorBuilder<GAException> {

    private java.lang.CharSequence message$;
    private int errorCode;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.methods.GAException.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.methods.GAException.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.message$)) {
        this.message$ = data().deepCopy(fields()[0].schema(), other.message$);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.errorCode)) {
        this.errorCode = data().deepCopy(fields()[1].schema(), other.errorCode);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing GAException instance */
    private Builder(org.ga4gh.methods.GAException other) {
      super(other);
      if (isValidValue(fields()[0], other.message$)) {
        this.message$ = data().deepCopy(fields()[0].schema(), other.message$);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.errorCode)) {
        this.errorCode = data().deepCopy(fields()[1].schema(), other.errorCode);
        fieldSetFlags()[1] = true;
      }
    }

    @Override
    public org.ga4gh.methods.GAException.Builder setValue(Object value) {
      super.setValue(value);
      return this;
    }
    
    @Override
    public org.ga4gh.methods.GAException.Builder clearValue() {
      super.clearValue();
      return this;
    }

    @Override
    public org.ga4gh.methods.GAException.Builder setCause(Throwable cause) {
      super.setCause(cause);
      return this;
    }
    
    @Override
    public org.ga4gh.methods.GAException.Builder clearCause() {
      super.clearCause();
      return this;
    }

    /** Gets the value of the 'message$' field */
    public java.lang.CharSequence getMessage$() {
      return message$;
    }
    
    /** Sets the value of the 'message$' field */
    public org.ga4gh.methods.GAException.Builder setMessage$(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.message$ = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'message$' field has been set */
    public boolean hasMessage$() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'message$' field */
    public org.ga4gh.methods.GAException.Builder clearMessage$() {
      message$ = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'errorCode' field */
    public java.lang.Integer getErrorCode() {
      return errorCode;
    }
    
    /** Sets the value of the 'errorCode' field */
    public org.ga4gh.methods.GAException.Builder setErrorCode(int value) {
      validate(fields()[1], value);
      this.errorCode = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'errorCode' field has been set */
    public boolean hasErrorCode() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'errorCode' field */
    public org.ga4gh.methods.GAException.Builder clearErrorCode() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public GAException build() {
      try {
        GAException record = new GAException(getValue(), getCause());
        record.message$ = fieldSetFlags()[0] ? this.message$ : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.errorCode = fieldSetFlags()[1] ? this.errorCode : (java.lang.Integer) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
