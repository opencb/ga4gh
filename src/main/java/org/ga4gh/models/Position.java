/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.models;  
@SuppressWarnings("all")
/** A `Position` is an unoriented base in some `Reference`. A `Position` is
represented by a `Reference` name, and a base number on that `Reference`
(0-based). */
@org.apache.avro.specific.AvroGenerated
public class Position extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Position\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"A `Position` is an unoriented base in some `Reference`. A `Position` is\\nrepresented by a `Reference` name, and a base number on that `Reference`\\n(0-based).\",\"fields\":[{\"name\":\"referenceName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The name of the `Reference` on which the `Position` is located.\"},{\"name\":\"position\",\"type\":\"long\",\"doc\":\"The 0-based offset from the start of the forward strand for that `Reference`.\\n  Genomic positions are non-negative integers less than `Reference` length.\"},{\"name\":\"strand\",\"type\":{\"type\":\"enum\",\"name\":\"Strand\",\"doc\":\"Indicates the DNA strand associate for some data item.\\n* `NEG_STRAND`: The negative (-) strand.\\n* `POS_STRAND`:  The postive (+) strand.\",\"symbols\":[\"NEG_STRAND\",\"POS_STRAND\"]},\"doc\":\"Strand the position is associated with.\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The name of the `Reference` on which the `Position` is located. */
   private java.lang.String referenceName;
  /** The 0-based offset from the start of the forward strand for that `Reference`.
  Genomic positions are non-negative integers less than `Reference` length. */
   private long position;
  /** Strand the position is associated with. */
   private org.ga4gh.models.Strand strand;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Position() {}

  /**
   * All-args constructor.
   */
  public Position(java.lang.String referenceName, java.lang.Long position, org.ga4gh.models.Strand strand) {
    this.referenceName = referenceName;
    this.position = position;
    this.strand = strand;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return referenceName;
    case 1: return position;
    case 2: return strand;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: referenceName = (java.lang.String)value$; break;
    case 1: position = (java.lang.Long)value$; break;
    case 2: strand = (org.ga4gh.models.Strand)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'referenceName' field.
   * The name of the `Reference` on which the `Position` is located.   */
  public java.lang.String getReferenceName() {
    return referenceName;
  }

  /**
   * Sets the value of the 'referenceName' field.
   * The name of the `Reference` on which the `Position` is located.   * @param value the value to set.
   */
  public void setReferenceName(java.lang.String value) {
    this.referenceName = value;
  }

  /**
   * Gets the value of the 'position' field.
   * The 0-based offset from the start of the forward strand for that `Reference`.
  Genomic positions are non-negative integers less than `Reference` length.   */
  public java.lang.Long getPosition() {
    return position;
  }

  /**
   * Sets the value of the 'position' field.
   * The 0-based offset from the start of the forward strand for that `Reference`.
  Genomic positions are non-negative integers less than `Reference` length.   * @param value the value to set.
   */
  public void setPosition(java.lang.Long value) {
    this.position = value;
  }

  /**
   * Gets the value of the 'strand' field.
   * Strand the position is associated with.   */
  public org.ga4gh.models.Strand getStrand() {
    return strand;
  }

  /**
   * Sets the value of the 'strand' field.
   * Strand the position is associated with.   * @param value the value to set.
   */
  public void setStrand(org.ga4gh.models.Strand value) {
    this.strand = value;
  }

  /** Creates a new Position RecordBuilder */
  public static org.ga4gh.models.Position.Builder newBuilder() {
    return new org.ga4gh.models.Position.Builder();
  }
  
  /** Creates a new Position RecordBuilder by copying an existing Builder */
  public static org.ga4gh.models.Position.Builder newBuilder(org.ga4gh.models.Position.Builder other) {
    return new org.ga4gh.models.Position.Builder(other);
  }
  
  /** Creates a new Position RecordBuilder by copying an existing Position instance */
  public static org.ga4gh.models.Position.Builder newBuilder(org.ga4gh.models.Position other) {
    return new org.ga4gh.models.Position.Builder(other);
  }
  
  /**
   * RecordBuilder for Position instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Position>
    implements org.apache.avro.data.RecordBuilder<Position> {

    private java.lang.String referenceName;
    private long position;
    private org.ga4gh.models.Strand strand;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.models.Position.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.models.Position.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.referenceName)) {
        this.referenceName = data().deepCopy(fields()[0].schema(), other.referenceName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.position)) {
        this.position = data().deepCopy(fields()[1].schema(), other.position);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.strand)) {
        this.strand = data().deepCopy(fields()[2].schema(), other.strand);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Position instance */
    private Builder(org.ga4gh.models.Position other) {
            super(org.ga4gh.models.Position.SCHEMA$);
      if (isValidValue(fields()[0], other.referenceName)) {
        this.referenceName = data().deepCopy(fields()[0].schema(), other.referenceName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.position)) {
        this.position = data().deepCopy(fields()[1].schema(), other.position);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.strand)) {
        this.strand = data().deepCopy(fields()[2].schema(), other.strand);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'referenceName' field */
    public java.lang.String getReferenceName() {
      return referenceName;
    }
    
    /** Sets the value of the 'referenceName' field */
    public org.ga4gh.models.Position.Builder setReferenceName(java.lang.String value) {
      validate(fields()[0], value);
      this.referenceName = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'referenceName' field has been set */
    public boolean hasReferenceName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'referenceName' field */
    public org.ga4gh.models.Position.Builder clearReferenceName() {
      referenceName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'position' field */
    public java.lang.Long getPosition() {
      return position;
    }
    
    /** Sets the value of the 'position' field */
    public org.ga4gh.models.Position.Builder setPosition(long value) {
      validate(fields()[1], value);
      this.position = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'position' field has been set */
    public boolean hasPosition() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'position' field */
    public org.ga4gh.models.Position.Builder clearPosition() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'strand' field */
    public org.ga4gh.models.Strand getStrand() {
      return strand;
    }
    
    /** Sets the value of the 'strand' field */
    public org.ga4gh.models.Position.Builder setStrand(org.ga4gh.models.Strand value) {
      validate(fields()[2], value);
      this.strand = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'strand' field has been set */
    public boolean hasStrand() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'strand' field */
    public org.ga4gh.models.Position.Builder clearStrand() {
      strand = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public Position build() {
      try {
        Position record = new Position();
        record.referenceName = fieldSetFlags()[0] ? this.referenceName : (java.lang.String) defaultValue(fields()[0]);
        record.position = fieldSetFlags()[1] ? this.position : (java.lang.Long) defaultValue(fields()[1]);
        record.strand = fieldSetFlags()[2] ? this.strand : (org.ga4gh.models.Strand) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
