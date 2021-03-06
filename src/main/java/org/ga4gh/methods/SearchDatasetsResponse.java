/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.methods;  
@SuppressWarnings("all")
/** This is the response from `POST /datasets/search` expressed as JSON. */
@org.apache.avro.specific.AvroGenerated
public class SearchDatasetsResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SearchDatasetsResponse\",\"namespace\":\"org.ga4gh.methods\",\"doc\":\"This is the response from `POST /datasets/search` expressed as JSON.\",\"fields\":[{\"name\":\"datasets\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Dataset\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"A Dataset is a collection of related data of multiple types.\\nData providers decide how to group data into datasets.\\nSee [Metadata API](../api/metadata.html) for a more detailed discussion.\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The dataset's id, locally unique to the server instance.\"},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The name of the dataset.\",\"default\":null},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Additional, human-readable information on the dataset.\",\"default\":null}]}},\"doc\":\"The list of datasets.\",\"default\":[]},{\"name\":\"nextPageToken\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The continuation token, which is used to page through large result sets.\\n  Provide this value in a subsequent request to return the next page of\\n  results. This field will be empty if there aren't any additional results.\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The list of datasets. */
   private java.util.List<org.ga4gh.models.Dataset> datasets;
  /** The continuation token, which is used to page through large result sets.
  Provide this value in a subsequent request to return the next page of
  results. This field will be empty if there aren't any additional results. */
   private java.lang.String nextPageToken;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public SearchDatasetsResponse() {}

  /**
   * All-args constructor.
   */
  public SearchDatasetsResponse(java.util.List<org.ga4gh.models.Dataset> datasets, java.lang.String nextPageToken) {
    this.datasets = datasets;
    this.nextPageToken = nextPageToken;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return datasets;
    case 1: return nextPageToken;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: datasets = (java.util.List<org.ga4gh.models.Dataset>)value$; break;
    case 1: nextPageToken = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'datasets' field.
   * The list of datasets.   */
  public java.util.List<org.ga4gh.models.Dataset> getDatasets() {
    return datasets;
  }

  /**
   * Sets the value of the 'datasets' field.
   * The list of datasets.   * @param value the value to set.
   */
  public void setDatasets(java.util.List<org.ga4gh.models.Dataset> value) {
    this.datasets = value;
  }

  /**
   * Gets the value of the 'nextPageToken' field.
   * The continuation token, which is used to page through large result sets.
  Provide this value in a subsequent request to return the next page of
  results. This field will be empty if there aren't any additional results.   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Sets the value of the 'nextPageToken' field.
   * The continuation token, which is used to page through large result sets.
  Provide this value in a subsequent request to return the next page of
  results. This field will be empty if there aren't any additional results.   * @param value the value to set.
   */
  public void setNextPageToken(java.lang.String value) {
    this.nextPageToken = value;
  }

  /** Creates a new SearchDatasetsResponse RecordBuilder */
  public static org.ga4gh.methods.SearchDatasetsResponse.Builder newBuilder() {
    return new org.ga4gh.methods.SearchDatasetsResponse.Builder();
  }
  
  /** Creates a new SearchDatasetsResponse RecordBuilder by copying an existing Builder */
  public static org.ga4gh.methods.SearchDatasetsResponse.Builder newBuilder(org.ga4gh.methods.SearchDatasetsResponse.Builder other) {
    return new org.ga4gh.methods.SearchDatasetsResponse.Builder(other);
  }
  
  /** Creates a new SearchDatasetsResponse RecordBuilder by copying an existing SearchDatasetsResponse instance */
  public static org.ga4gh.methods.SearchDatasetsResponse.Builder newBuilder(org.ga4gh.methods.SearchDatasetsResponse other) {
    return new org.ga4gh.methods.SearchDatasetsResponse.Builder(other);
  }
  
  /**
   * RecordBuilder for SearchDatasetsResponse instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SearchDatasetsResponse>
    implements org.apache.avro.data.RecordBuilder<SearchDatasetsResponse> {

    private java.util.List<org.ga4gh.models.Dataset> datasets;
    private java.lang.String nextPageToken;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.methods.SearchDatasetsResponse.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.methods.SearchDatasetsResponse.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.datasets)) {
        this.datasets = data().deepCopy(fields()[0].schema(), other.datasets);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nextPageToken)) {
        this.nextPageToken = data().deepCopy(fields()[1].schema(), other.nextPageToken);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing SearchDatasetsResponse instance */
    private Builder(org.ga4gh.methods.SearchDatasetsResponse other) {
            super(org.ga4gh.methods.SearchDatasetsResponse.SCHEMA$);
      if (isValidValue(fields()[0], other.datasets)) {
        this.datasets = data().deepCopy(fields()[0].schema(), other.datasets);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nextPageToken)) {
        this.nextPageToken = data().deepCopy(fields()[1].schema(), other.nextPageToken);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'datasets' field */
    public java.util.List<org.ga4gh.models.Dataset> getDatasets() {
      return datasets;
    }
    
    /** Sets the value of the 'datasets' field */
    public org.ga4gh.methods.SearchDatasetsResponse.Builder setDatasets(java.util.List<org.ga4gh.models.Dataset> value) {
      validate(fields()[0], value);
      this.datasets = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'datasets' field has been set */
    public boolean hasDatasets() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'datasets' field */
    public org.ga4gh.methods.SearchDatasetsResponse.Builder clearDatasets() {
      datasets = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'nextPageToken' field */
    public java.lang.String getNextPageToken() {
      return nextPageToken;
    }
    
    /** Sets the value of the 'nextPageToken' field */
    public org.ga4gh.methods.SearchDatasetsResponse.Builder setNextPageToken(java.lang.String value) {
      validate(fields()[1], value);
      this.nextPageToken = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'nextPageToken' field has been set */
    public boolean hasNextPageToken() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'nextPageToken' field */
    public org.ga4gh.methods.SearchDatasetsResponse.Builder clearNextPageToken() {
      nextPageToken = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public SearchDatasetsResponse build() {
      try {
        SearchDatasetsResponse record = new SearchDatasetsResponse();
        record.datasets = fieldSetFlags()[0] ? this.datasets : (java.util.List<org.ga4gh.models.Dataset>) defaultValue(fields()[0]);
        record.nextPageToken = fieldSetFlags()[1] ? this.nextPageToken : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
