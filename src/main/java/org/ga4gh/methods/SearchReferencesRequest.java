/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.methods;  
@SuppressWarnings("all")
/** This request maps to the body of `POST /references/search`
as JSON. */
@org.apache.avro.specific.AvroGenerated
public class SearchReferencesRequest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SearchReferencesRequest\",\"namespace\":\"org.ga4gh.methods\",\"doc\":\"This request maps to the body of `POST /references/search`\\nas JSON.\",\"fields\":[{\"name\":\"referenceSetId\",\"type\":[\"null\",\"string\"],\"doc\":\"If present, return only references which belong to this reference set.\",\"default\":null},{\"name\":\"md5checksums\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"doc\":\"If nonempty, return references which match any of the given `md5checksums`.\\n  See `Reference::md5checksum` for details.\",\"default\":[]},{\"name\":\"parentReferenceIds\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"doc\":\"If nonempty, return references that are joined onto references with one of the\\n  specified IDs.\",\"default\":[]},{\"name\":\"accessions\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"doc\":\"If nonempty, return references for which the accession\\n  matches this string. Best to give a version number e.g. `GCF_000001405.26`.\\n  If only the main accession number is given then all records with\\n  that main accession will be returned, whichever version.\\n  Note that different versions will have different sequences.\",\"default\":[]},{\"name\":\"referenceNames\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"doc\":\"If nonempty, return references that have one of the specified names. The name\\n  specified must match the reference's name exactly, and is case sensitive.\",\"default\":[]},{\"name\":\"pageSize\",\"type\":[\"null\",\"int\"],\"doc\":\"Specifies the maximum number of results to return in a single page.\\n  If unspecified, a system default will be used.\",\"default\":null},{\"name\":\"pageToken\",\"type\":[\"null\",\"string\"],\"doc\":\"The continuation token, which is used to page through large result sets.\\n  To get the next page of results, set this parameter to the value of\\n  `nextPageToken` from the previous response.\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** If present, return only references which belong to this reference set. */
   private java.lang.CharSequence referenceSetId;
  /** If nonempty, return references which match any of the given `md5checksums`.
  See `Reference::md5checksum` for details. */
   private java.util.List<java.lang.CharSequence> md5checksums;
  /** If nonempty, return references that are joined onto references with one of the
  specified IDs. */
   private java.util.List<java.lang.CharSequence> parentReferenceIds;
  /** If nonempty, return references for which the accession
  matches this string. Best to give a version number e.g. `GCF_000001405.26`.
  If only the main accession number is given then all records with
  that main accession will be returned, whichever version.
  Note that different versions will have different sequences. */
   private java.util.List<java.lang.CharSequence> accessions;
  /** If nonempty, return references that have one of the specified names. The name
  specified must match the reference's name exactly, and is case sensitive. */
   private java.util.List<java.lang.CharSequence> referenceNames;
  /** Specifies the maximum number of results to return in a single page.
  If unspecified, a system default will be used. */
   private java.lang.Integer pageSize;
  /** The continuation token, which is used to page through large result sets.
  To get the next page of results, set this parameter to the value of
  `nextPageToken` from the previous response. */
   private java.lang.CharSequence pageToken;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public SearchReferencesRequest() {}

  /**
   * All-args constructor.
   */
  public SearchReferencesRequest(java.lang.CharSequence referenceSetId, java.util.List<java.lang.CharSequence> md5checksums, java.util.List<java.lang.CharSequence> parentReferenceIds, java.util.List<java.lang.CharSequence> accessions, java.util.List<java.lang.CharSequence> referenceNames, java.lang.Integer pageSize, java.lang.CharSequence pageToken) {
    this.referenceSetId = referenceSetId;
    this.md5checksums = md5checksums;
    this.parentReferenceIds = parentReferenceIds;
    this.accessions = accessions;
    this.referenceNames = referenceNames;
    this.pageSize = pageSize;
    this.pageToken = pageToken;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return referenceSetId;
    case 1: return md5checksums;
    case 2: return parentReferenceIds;
    case 3: return accessions;
    case 4: return referenceNames;
    case 5: return pageSize;
    case 6: return pageToken;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: referenceSetId = (java.lang.CharSequence)value$; break;
    case 1: md5checksums = (java.util.List<java.lang.CharSequence>)value$; break;
    case 2: parentReferenceIds = (java.util.List<java.lang.CharSequence>)value$; break;
    case 3: accessions = (java.util.List<java.lang.CharSequence>)value$; break;
    case 4: referenceNames = (java.util.List<java.lang.CharSequence>)value$; break;
    case 5: pageSize = (java.lang.Integer)value$; break;
    case 6: pageToken = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'referenceSetId' field.
   * If present, return only references which belong to this reference set.   */
  public java.lang.CharSequence getReferenceSetId() {
    return referenceSetId;
  }

  /**
   * Sets the value of the 'referenceSetId' field.
   * If present, return only references which belong to this reference set.   * @param value the value to set.
   */
  public void setReferenceSetId(java.lang.CharSequence value) {
    this.referenceSetId = value;
  }

  /**
   * Gets the value of the 'md5checksums' field.
   * If nonempty, return references which match any of the given `md5checksums`.
  See `Reference::md5checksum` for details.   */
  public java.util.List<java.lang.CharSequence> getMd5checksums() {
    return md5checksums;
  }

  /**
   * Sets the value of the 'md5checksums' field.
   * If nonempty, return references which match any of the given `md5checksums`.
  See `Reference::md5checksum` for details.   * @param value the value to set.
   */
  public void setMd5checksums(java.util.List<java.lang.CharSequence> value) {
    this.md5checksums = value;
  }

  /**
   * Gets the value of the 'parentReferenceIds' field.
   * If nonempty, return references that are joined onto references with one of the
  specified IDs.   */
  public java.util.List<java.lang.CharSequence> getParentReferenceIds() {
    return parentReferenceIds;
  }

  /**
   * Sets the value of the 'parentReferenceIds' field.
   * If nonempty, return references that are joined onto references with one of the
  specified IDs.   * @param value the value to set.
   */
  public void setParentReferenceIds(java.util.List<java.lang.CharSequence> value) {
    this.parentReferenceIds = value;
  }

  /**
   * Gets the value of the 'accessions' field.
   * If nonempty, return references for which the accession
  matches this string. Best to give a version number e.g. `GCF_000001405.26`.
  If only the main accession number is given then all records with
  that main accession will be returned, whichever version.
  Note that different versions will have different sequences.   */
  public java.util.List<java.lang.CharSequence> getAccessions() {
    return accessions;
  }

  /**
   * Sets the value of the 'accessions' field.
   * If nonempty, return references for which the accession
  matches this string. Best to give a version number e.g. `GCF_000001405.26`.
  If only the main accession number is given then all records with
  that main accession will be returned, whichever version.
  Note that different versions will have different sequences.   * @param value the value to set.
   */
  public void setAccessions(java.util.List<java.lang.CharSequence> value) {
    this.accessions = value;
  }

  /**
   * Gets the value of the 'referenceNames' field.
   * If nonempty, return references that have one of the specified names. The name
  specified must match the reference's name exactly, and is case sensitive.   */
  public java.util.List<java.lang.CharSequence> getReferenceNames() {
    return referenceNames;
  }

  /**
   * Sets the value of the 'referenceNames' field.
   * If nonempty, return references that have one of the specified names. The name
  specified must match the reference's name exactly, and is case sensitive.   * @param value the value to set.
   */
  public void setReferenceNames(java.util.List<java.lang.CharSequence> value) {
    this.referenceNames = value;
  }

  /**
   * Gets the value of the 'pageSize' field.
   * Specifies the maximum number of results to return in a single page.
  If unspecified, a system default will be used.   */
  public java.lang.Integer getPageSize() {
    return pageSize;
  }

  /**
   * Sets the value of the 'pageSize' field.
   * Specifies the maximum number of results to return in a single page.
  If unspecified, a system default will be used.   * @param value the value to set.
   */
  public void setPageSize(java.lang.Integer value) {
    this.pageSize = value;
  }

  /**
   * Gets the value of the 'pageToken' field.
   * The continuation token, which is used to page through large result sets.
  To get the next page of results, set this parameter to the value of
  `nextPageToken` from the previous response.   */
  public java.lang.CharSequence getPageToken() {
    return pageToken;
  }

  /**
   * Sets the value of the 'pageToken' field.
   * The continuation token, which is used to page through large result sets.
  To get the next page of results, set this parameter to the value of
  `nextPageToken` from the previous response.   * @param value the value to set.
   */
  public void setPageToken(java.lang.CharSequence value) {
    this.pageToken = value;
  }

  /** Creates a new SearchReferencesRequest RecordBuilder */
  public static org.ga4gh.methods.SearchReferencesRequest.Builder newBuilder() {
    return new org.ga4gh.methods.SearchReferencesRequest.Builder();
  }
  
  /** Creates a new SearchReferencesRequest RecordBuilder by copying an existing Builder */
  public static org.ga4gh.methods.SearchReferencesRequest.Builder newBuilder(org.ga4gh.methods.SearchReferencesRequest.Builder other) {
    return new org.ga4gh.methods.SearchReferencesRequest.Builder(other);
  }
  
  /** Creates a new SearchReferencesRequest RecordBuilder by copying an existing SearchReferencesRequest instance */
  public static org.ga4gh.methods.SearchReferencesRequest.Builder newBuilder(org.ga4gh.methods.SearchReferencesRequest other) {
    return new org.ga4gh.methods.SearchReferencesRequest.Builder(other);
  }
  
  /**
   * RecordBuilder for SearchReferencesRequest instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SearchReferencesRequest>
    implements org.apache.avro.data.RecordBuilder<SearchReferencesRequest> {

    private java.lang.CharSequence referenceSetId;
    private java.util.List<java.lang.CharSequence> md5checksums;
    private java.util.List<java.lang.CharSequence> parentReferenceIds;
    private java.util.List<java.lang.CharSequence> accessions;
    private java.util.List<java.lang.CharSequence> referenceNames;
    private java.lang.Integer pageSize;
    private java.lang.CharSequence pageToken;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.methods.SearchReferencesRequest.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.methods.SearchReferencesRequest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.referenceSetId)) {
        this.referenceSetId = data().deepCopy(fields()[0].schema(), other.referenceSetId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.md5checksums)) {
        this.md5checksums = data().deepCopy(fields()[1].schema(), other.md5checksums);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.parentReferenceIds)) {
        this.parentReferenceIds = data().deepCopy(fields()[2].schema(), other.parentReferenceIds);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.accessions)) {
        this.accessions = data().deepCopy(fields()[3].schema(), other.accessions);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.referenceNames)) {
        this.referenceNames = data().deepCopy(fields()[4].schema(), other.referenceNames);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.pageSize)) {
        this.pageSize = data().deepCopy(fields()[5].schema(), other.pageSize);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.pageToken)) {
        this.pageToken = data().deepCopy(fields()[6].schema(), other.pageToken);
        fieldSetFlags()[6] = true;
      }
    }
    
    /** Creates a Builder by copying an existing SearchReferencesRequest instance */
    private Builder(org.ga4gh.methods.SearchReferencesRequest other) {
            super(org.ga4gh.methods.SearchReferencesRequest.SCHEMA$);
      if (isValidValue(fields()[0], other.referenceSetId)) {
        this.referenceSetId = data().deepCopy(fields()[0].schema(), other.referenceSetId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.md5checksums)) {
        this.md5checksums = data().deepCopy(fields()[1].schema(), other.md5checksums);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.parentReferenceIds)) {
        this.parentReferenceIds = data().deepCopy(fields()[2].schema(), other.parentReferenceIds);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.accessions)) {
        this.accessions = data().deepCopy(fields()[3].schema(), other.accessions);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.referenceNames)) {
        this.referenceNames = data().deepCopy(fields()[4].schema(), other.referenceNames);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.pageSize)) {
        this.pageSize = data().deepCopy(fields()[5].schema(), other.pageSize);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.pageToken)) {
        this.pageToken = data().deepCopy(fields()[6].schema(), other.pageToken);
        fieldSetFlags()[6] = true;
      }
    }

    /** Gets the value of the 'referenceSetId' field */
    public java.lang.CharSequence getReferenceSetId() {
      return referenceSetId;
    }
    
    /** Sets the value of the 'referenceSetId' field */
    public org.ga4gh.methods.SearchReferencesRequest.Builder setReferenceSetId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.referenceSetId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'referenceSetId' field has been set */
    public boolean hasReferenceSetId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'referenceSetId' field */
    public org.ga4gh.methods.SearchReferencesRequest.Builder clearReferenceSetId() {
      referenceSetId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'md5checksums' field */
    public java.util.List<java.lang.CharSequence> getMd5checksums() {
      return md5checksums;
    }
    
    /** Sets the value of the 'md5checksums' field */
    public org.ga4gh.methods.SearchReferencesRequest.Builder setMd5checksums(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[1], value);
      this.md5checksums = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'md5checksums' field has been set */
    public boolean hasMd5checksums() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'md5checksums' field */
    public org.ga4gh.methods.SearchReferencesRequest.Builder clearMd5checksums() {
      md5checksums = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'parentReferenceIds' field */
    public java.util.List<java.lang.CharSequence> getParentReferenceIds() {
      return parentReferenceIds;
    }
    
    /** Sets the value of the 'parentReferenceIds' field */
    public org.ga4gh.methods.SearchReferencesRequest.Builder setParentReferenceIds(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[2], value);
      this.parentReferenceIds = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'parentReferenceIds' field has been set */
    public boolean hasParentReferenceIds() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'parentReferenceIds' field */
    public org.ga4gh.methods.SearchReferencesRequest.Builder clearParentReferenceIds() {
      parentReferenceIds = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'accessions' field */
    public java.util.List<java.lang.CharSequence> getAccessions() {
      return accessions;
    }
    
    /** Sets the value of the 'accessions' field */
    public org.ga4gh.methods.SearchReferencesRequest.Builder setAccessions(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[3], value);
      this.accessions = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'accessions' field has been set */
    public boolean hasAccessions() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'accessions' field */
    public org.ga4gh.methods.SearchReferencesRequest.Builder clearAccessions() {
      accessions = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'referenceNames' field */
    public java.util.List<java.lang.CharSequence> getReferenceNames() {
      return referenceNames;
    }
    
    /** Sets the value of the 'referenceNames' field */
    public org.ga4gh.methods.SearchReferencesRequest.Builder setReferenceNames(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[4], value);
      this.referenceNames = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'referenceNames' field has been set */
    public boolean hasReferenceNames() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'referenceNames' field */
    public org.ga4gh.methods.SearchReferencesRequest.Builder clearReferenceNames() {
      referenceNames = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'pageSize' field */
    public java.lang.Integer getPageSize() {
      return pageSize;
    }
    
    /** Sets the value of the 'pageSize' field */
    public org.ga4gh.methods.SearchReferencesRequest.Builder setPageSize(java.lang.Integer value) {
      validate(fields()[5], value);
      this.pageSize = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'pageSize' field has been set */
    public boolean hasPageSize() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'pageSize' field */
    public org.ga4gh.methods.SearchReferencesRequest.Builder clearPageSize() {
      pageSize = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'pageToken' field */
    public java.lang.CharSequence getPageToken() {
      return pageToken;
    }
    
    /** Sets the value of the 'pageToken' field */
    public org.ga4gh.methods.SearchReferencesRequest.Builder setPageToken(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.pageToken = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'pageToken' field has been set */
    public boolean hasPageToken() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'pageToken' field */
    public org.ga4gh.methods.SearchReferencesRequest.Builder clearPageToken() {
      pageToken = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public SearchReferencesRequest build() {
      try {
        SearchReferencesRequest record = new SearchReferencesRequest();
        record.referenceSetId = fieldSetFlags()[0] ? this.referenceSetId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.md5checksums = fieldSetFlags()[1] ? this.md5checksums : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[1]);
        record.parentReferenceIds = fieldSetFlags()[2] ? this.parentReferenceIds : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[2]);
        record.accessions = fieldSetFlags()[3] ? this.accessions : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[3]);
        record.referenceNames = fieldSetFlags()[4] ? this.referenceNames : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[4]);
        record.pageSize = fieldSetFlags()[5] ? this.pageSize : (java.lang.Integer) defaultValue(fields()[5]);
        record.pageToken = fieldSetFlags()[6] ? this.pageToken : (java.lang.CharSequence) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
