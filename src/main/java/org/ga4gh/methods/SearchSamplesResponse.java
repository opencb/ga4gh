/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.methods;  
@SuppressWarnings("all")
/** This is the response from `POST /samples/search` expressed as JSON. */
@org.apache.avro.specific.AvroGenerated
public class SearchSamplesResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SearchSamplesResponse\",\"namespace\":\"org.ga4gh.methods\",\"doc\":\"This is the response from `POST /samples/search` expressed as JSON.\",\"fields\":[{\"name\":\"samples\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Sample\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"A biological sample used in an experiment. (e.g. whole blood from\\nan affected individual)\",\"fields\":[{\"name\":\"id\",\"type\":\"string\",\"doc\":\"The sample UUID. This is globally unique.\"},{\"name\":\"individualId\",\"type\":[\"null\",\"string\"],\"doc\":\"The ID of the individual this sample belongs to.\",\"default\":null},{\"name\":\"accessions\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"doc\":\"Public identifiers for this sample.\",\"default\":[]},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"doc\":\"The name of the sample.\",\"default\":null},{\"name\":\"description\",\"type\":[\"null\",\"string\"],\"doc\":\"A description of the sample.\",\"default\":null},{\"name\":\"created\",\"type\":[\"null\",\"long\"],\"doc\":\"The time at which this sample was created in milliseconds from the epoch.\",\"default\":null},{\"name\":\"updated\",\"type\":[\"null\",\"long\"],\"doc\":\"The time at which this sample was last updated in milliseconds\\n  from the epoch.\",\"default\":null},{\"name\":\"samplingDate\",\"type\":[\"null\",\"long\"],\"doc\":\"The time at which this sample was taken from the individual, in milliseconds\\n  from the epoch.\",\"default\":null},{\"name\":\"age\",\"type\":[\"null\",\"long\"],\"doc\":\"The age of this sample in months. TODO: is months the right format?\\n  This field may be approximate.\",\"default\":null},{\"name\":\"cellType\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"OntologyTerm\",\"doc\":\"An ontology term describing an attribute. (e.g. the phenotype attribute\\n'polydactyly' from HPO)\",\"fields\":[{\"name\":\"ontologySource\",\"type\":\"string\",\"doc\":\"The source of the onotology term.\\n  (e.g. `Ontology for Biomedical Investigation`)\"},{\"name\":\"id\",\"type\":\"string\",\"doc\":\"The ID defined by the external onotology source.\\n  (e.g. `http://purl.obolibrary.org/obo/OBI_0001271`)\"},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"doc\":\"The name of the onotology term. (e.g. `RNA-seq assay`)\",\"default\":null}]}],\"doc\":\"The cell type of this sample.\\n  Using the [Cell Ontology](http://cellontology.org/) (CL) is recommended. See\",\"default\":null},{\"name\":\"cellLine\",\"type\":[\"null\",\"OntologyTerm\"],\"doc\":\"The cell line of this sample. \\n  Using the [Cell Line Ontology](https://code.google.com/p/clo-ontology/) is a possibility.\\n  TODO: discuss further. Other possibilities: Cellosaurus (nextprot), BRENDA/BTO, EFO (EBI)\",\"default\":null},{\"name\":\"geocode\",\"type\":[\"null\",\"string\"],\"doc\":\"Geographic coordinates from which the individual was obtained.\\n  TODO: Figure out the right type for this field.\",\"default\":null},{\"name\":\"sampleType\",\"type\":[\"null\",\"string\"],\"doc\":\"A descriptor of the sample type. (e.g. `frozen`)\",\"default\":null},{\"name\":\"organismPart\",\"type\":[\"null\",\"OntologyTerm\"],\"doc\":\"The anatomical part of the individual from which this sample derives.\\n  Using [Uberon](http://uberon.org) is recommended.\",\"default\":null},{\"name\":\"info\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"string\"}},\"doc\":\"A map of additional sample information.\",\"default\":{}}]}},\"doc\":\"The list of matching samples.\",\"default\":[]},{\"name\":\"nextPageToken\",\"type\":[\"null\",\"string\"],\"doc\":\"The continuation token, which is used to page through large result sets.\\n  Provide this value in a subsequent request to return the next page of\\n  results. This field will be empty if there aren't any additional results.\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The list of matching samples. */
  @Deprecated public java.util.List<org.ga4gh.models.Sample> samples;
  /** The continuation token, which is used to page through large result sets.
  Provide this value in a subsequent request to return the next page of
  results. This field will be empty if there aren't any additional results. */
  @Deprecated public java.lang.CharSequence nextPageToken;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public SearchSamplesResponse() {}

  /**
   * All-args constructor.
   */
  public SearchSamplesResponse(java.util.List<org.ga4gh.models.Sample> samples, java.lang.CharSequence nextPageToken) {
    this.samples = samples;
    this.nextPageToken = nextPageToken;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return samples;
    case 1: return nextPageToken;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: samples = (java.util.List<org.ga4gh.models.Sample>)value$; break;
    case 1: nextPageToken = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'samples' field.
   * The list of matching samples.   */
  public java.util.List<org.ga4gh.models.Sample> getSamples() {
    return samples;
  }

  /**
   * Sets the value of the 'samples' field.
   * The list of matching samples.   * @param value the value to set.
   */
  public void setSamples(java.util.List<org.ga4gh.models.Sample> value) {
    this.samples = value;
  }

  /**
   * Gets the value of the 'nextPageToken' field.
   * The continuation token, which is used to page through large result sets.
  Provide this value in a subsequent request to return the next page of
  results. This field will be empty if there aren't any additional results.   */
  public java.lang.CharSequence getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Sets the value of the 'nextPageToken' field.
   * The continuation token, which is used to page through large result sets.
  Provide this value in a subsequent request to return the next page of
  results. This field will be empty if there aren't any additional results.   * @param value the value to set.
   */
  public void setNextPageToken(java.lang.CharSequence value) {
    this.nextPageToken = value;
  }

  /** Creates a new SearchSamplesResponse RecordBuilder */
  public static org.ga4gh.methods.SearchSamplesResponse.Builder newBuilder() {
    return new org.ga4gh.methods.SearchSamplesResponse.Builder();
  }
  
  /** Creates a new SearchSamplesResponse RecordBuilder by copying an existing Builder */
  public static org.ga4gh.methods.SearchSamplesResponse.Builder newBuilder(org.ga4gh.methods.SearchSamplesResponse.Builder other) {
    return new org.ga4gh.methods.SearchSamplesResponse.Builder(other);
  }
  
  /** Creates a new SearchSamplesResponse RecordBuilder by copying an existing SearchSamplesResponse instance */
  public static org.ga4gh.methods.SearchSamplesResponse.Builder newBuilder(org.ga4gh.methods.SearchSamplesResponse other) {
    return new org.ga4gh.methods.SearchSamplesResponse.Builder(other);
  }
  
  /**
   * RecordBuilder for SearchSamplesResponse instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SearchSamplesResponse>
    implements org.apache.avro.data.RecordBuilder<SearchSamplesResponse> {

    private java.util.List<org.ga4gh.models.Sample> samples;
    private java.lang.CharSequence nextPageToken;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.methods.SearchSamplesResponse.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.methods.SearchSamplesResponse.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.samples)) {
        this.samples = data().deepCopy(fields()[0].schema(), other.samples);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nextPageToken)) {
        this.nextPageToken = data().deepCopy(fields()[1].schema(), other.nextPageToken);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing SearchSamplesResponse instance */
    private Builder(org.ga4gh.methods.SearchSamplesResponse other) {
            super(org.ga4gh.methods.SearchSamplesResponse.SCHEMA$);
      if (isValidValue(fields()[0], other.samples)) {
        this.samples = data().deepCopy(fields()[0].schema(), other.samples);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nextPageToken)) {
        this.nextPageToken = data().deepCopy(fields()[1].schema(), other.nextPageToken);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'samples' field */
    public java.util.List<org.ga4gh.models.Sample> getSamples() {
      return samples;
    }
    
    /** Sets the value of the 'samples' field */
    public org.ga4gh.methods.SearchSamplesResponse.Builder setSamples(java.util.List<org.ga4gh.models.Sample> value) {
      validate(fields()[0], value);
      this.samples = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'samples' field has been set */
    public boolean hasSamples() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'samples' field */
    public org.ga4gh.methods.SearchSamplesResponse.Builder clearSamples() {
      samples = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'nextPageToken' field */
    public java.lang.CharSequence getNextPageToken() {
      return nextPageToken;
    }
    
    /** Sets the value of the 'nextPageToken' field */
    public org.ga4gh.methods.SearchSamplesResponse.Builder setNextPageToken(java.lang.CharSequence value) {
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
    public org.ga4gh.methods.SearchSamplesResponse.Builder clearNextPageToken() {
      nextPageToken = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public SearchSamplesResponse build() {
      try {
        SearchSamplesResponse record = new SearchSamplesResponse();
        record.samples = fieldSetFlags()[0] ? this.samples : (java.util.List<org.ga4gh.models.Sample>) defaultValue(fields()[0]);
        record.nextPageToken = fieldSetFlags()[1] ? this.nextPageToken : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}