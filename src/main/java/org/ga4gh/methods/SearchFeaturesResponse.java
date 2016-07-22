/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.methods;  
@SuppressWarnings("all")
/** This is the response from `POST /features/search` expressed as JSON. */
@org.apache.avro.specific.AvroGenerated
public class SearchFeaturesResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SearchFeaturesResponse\",\"namespace\":\"org.ga4gh.methods\",\"doc\":\"This is the response from `POST /features/search` expressed as JSON.\",\"fields\":[{\"name\":\"features\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Feature\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"Node in the annotation graph that annotates a contiguous region of a\\n  sequence.\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Id of this annotation node.\"},{\"name\":\"parentId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Parent Id of this node. Set to empty string if node has no parent.\"},{\"name\":\"childIds\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"doc\":\"Ordered array of Child Ids of this node.\\n    Since not all child nodes are ordered by genomic coordinates,\\n    this can't always be reconstructed from parentId's of the children alone.\",\"default\":[]},{\"name\":\"featureSetId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Identifier for the containing feature set.\"},{\"name\":\"referenceName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The reference on which this feature occurs.\\n    (e.g. `chr20` or `X`)\"},{\"name\":\"start\",\"type\":\"long\",\"doc\":\"The start position at which this feature occurs (0-based).\\n    This corresponds to the first base of the string of reference bases.\\n    Genomic positions are non-negative integers less than reference length.\\n    Features spanning the join of circular genomes are represented as\\n    two features one on each side of the join (position 0).\",\"default\":0},{\"name\":\"end\",\"type\":\"long\",\"doc\":\"The end position (exclusive), resulting in [start, end) closed-open interval.\\n    This is typically calculated by `start + referenceBases.length`.\"},{\"name\":\"strand\",\"type\":{\"type\":\"enum\",\"name\":\"Strand\",\"doc\":\"Indicates the DNA strand associate for some data item.\\n* `NEG_STRAND`: The negative (-) strand.\\n* `POS_STRAND`:  The postive (+) strand.\",\"symbols\":[\"NEG_STRAND\",\"POS_STRAND\"]},\"doc\":\"The strand on which the feature is present.\"},{\"name\":\"featureType\",\"type\":{\"type\":\"record\",\"name\":\"OntologyTerm\",\"doc\":\"An ontology term describing an attribute. (e.g. the phenotype attribute\\n  'polydactyly' from HPO)\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Ontology source identifier - the identifier, a CURIE (preferred) or\\n  PURL for an ontology source e.g. http://purl.obolibrary.org/obo/hp.obo\\n  It differs from the standard GA4GH schema's :ref:`id <apidesign_object_ids>`\\n  in that it is a URI pointing to an information resource outside of the scope\\n  of the schema or its resource implementation.\"},{\"name\":\"term\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Ontology term - the representation the id is pointing to.\",\"default\":null},{\"name\":\"sourceName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Ontology source name - the name of ontology from which the term is obtained\\n  e.g. 'Human Phenotype Ontology'\",\"default\":null},{\"name\":\"sourceVersion\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Ontology source version - the version of the ontology from which the\\n  OntologyTerm is obtained; e.g. 2.6.1.\\n  There is no standard for ontology versioning and some frequently\\n  released ontologies may use a datestamp, or build number.\",\"default\":null}]},\"doc\":\"Feature that is annotated by this region.  Normally, this will be a term in\\n    the Sequence Ontology.\"},{\"name\":\"attributes\",\"type\":{\"type\":\"record\",\"name\":\"Attributes\",\"doc\":\"Type defining a collection of attributes associated with various protocol\\n  records.  Each attribute is a name that maps to an array of one or more\\n  values.  Values can be strings, external identifiers, or ontology terms.\\n  Values should be split into the array elements instead of using a separator\\n  syntax that needs to parsed.\",\"fields\":[{\"name\":\"vals\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},{\"type\":\"record\",\"name\":\"ExternalIdentifier\",\"doc\":\"Identifier from a public database\",\"fields\":[{\"name\":\"database\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The source of the identifier.\\n  (e.g. `Ensembl`)\"},{\"name\":\"identifier\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The ID defined by the external database.\\n  (e.g. `ENST00000000000`)\"},{\"name\":\"version\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The version of the object or the database\\n  (e.g. `78`)\"}]},\"OntologyTerm\"]},\"avro.java.string\":\"String\"},\"default\":{}}]},\"doc\":\"Name/value attributes of the annotation.  Attribute names follow the GFF3\\n    naming convention of reserved names starting with an upper cases\\n    character, and user-define names start with lower-case.  Most GFF3\\n    pre-defined attributes apply, the exceptions are ID and Parent, which are\\n    defined as fields. Additional, the following attributes are added:\\n    * Score - the GFF3 score column\\n    * Phase - the GFF3 phase column for CDS features.\"}]}},\"doc\":\"The list of matching annotations, sorted by start position. Annotations which\\n    share a start position are returned in a deterministic order.\",\"default\":[]},{\"name\":\"nextPageToken\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The continuation token, which is used to page through large result sets.\\n    Provide this value in a subsequent request to return the next page of\\n    results. This field will be empty if there aren't any additional results.\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The list of matching annotations, sorted by start position. Annotations which
    share a start position are returned in a deterministic order. */
   private java.util.List<org.ga4gh.models.Feature> features;
  /** The continuation token, which is used to page through large result sets.
    Provide this value in a subsequent request to return the next page of
    results. This field will be empty if there aren't any additional results. */
   private java.lang.String nextPageToken;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public SearchFeaturesResponse() {}

  /**
   * All-args constructor.
   */
  public SearchFeaturesResponse(java.util.List<org.ga4gh.models.Feature> features, java.lang.String nextPageToken) {
    this.features = features;
    this.nextPageToken = nextPageToken;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return features;
    case 1: return nextPageToken;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: features = (java.util.List<org.ga4gh.models.Feature>)value$; break;
    case 1: nextPageToken = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'features' field.
   * The list of matching annotations, sorted by start position. Annotations which
    share a start position are returned in a deterministic order.   */
  public java.util.List<org.ga4gh.models.Feature> getFeatures() {
    return features;
  }

  /**
   * Sets the value of the 'features' field.
   * The list of matching annotations, sorted by start position. Annotations which
    share a start position are returned in a deterministic order.   * @param value the value to set.
   */
  public void setFeatures(java.util.List<org.ga4gh.models.Feature> value) {
    this.features = value;
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

  /** Creates a new SearchFeaturesResponse RecordBuilder */
  public static org.ga4gh.methods.SearchFeaturesResponse.Builder newBuilder() {
    return new org.ga4gh.methods.SearchFeaturesResponse.Builder();
  }
  
  /** Creates a new SearchFeaturesResponse RecordBuilder by copying an existing Builder */
  public static org.ga4gh.methods.SearchFeaturesResponse.Builder newBuilder(org.ga4gh.methods.SearchFeaturesResponse.Builder other) {
    return new org.ga4gh.methods.SearchFeaturesResponse.Builder(other);
  }
  
  /** Creates a new SearchFeaturesResponse RecordBuilder by copying an existing SearchFeaturesResponse instance */
  public static org.ga4gh.methods.SearchFeaturesResponse.Builder newBuilder(org.ga4gh.methods.SearchFeaturesResponse other) {
    return new org.ga4gh.methods.SearchFeaturesResponse.Builder(other);
  }
  
  /**
   * RecordBuilder for SearchFeaturesResponse instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SearchFeaturesResponse>
    implements org.apache.avro.data.RecordBuilder<SearchFeaturesResponse> {

    private java.util.List<org.ga4gh.models.Feature> features;
    private java.lang.String nextPageToken;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.methods.SearchFeaturesResponse.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.methods.SearchFeaturesResponse.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.features)) {
        this.features = data().deepCopy(fields()[0].schema(), other.features);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nextPageToken)) {
        this.nextPageToken = data().deepCopy(fields()[1].schema(), other.nextPageToken);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing SearchFeaturesResponse instance */
    private Builder(org.ga4gh.methods.SearchFeaturesResponse other) {
            super(org.ga4gh.methods.SearchFeaturesResponse.SCHEMA$);
      if (isValidValue(fields()[0], other.features)) {
        this.features = data().deepCopy(fields()[0].schema(), other.features);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nextPageToken)) {
        this.nextPageToken = data().deepCopy(fields()[1].schema(), other.nextPageToken);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'features' field */
    public java.util.List<org.ga4gh.models.Feature> getFeatures() {
      return features;
    }
    
    /** Sets the value of the 'features' field */
    public org.ga4gh.methods.SearchFeaturesResponse.Builder setFeatures(java.util.List<org.ga4gh.models.Feature> value) {
      validate(fields()[0], value);
      this.features = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'features' field has been set */
    public boolean hasFeatures() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'features' field */
    public org.ga4gh.methods.SearchFeaturesResponse.Builder clearFeatures() {
      features = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'nextPageToken' field */
    public java.lang.String getNextPageToken() {
      return nextPageToken;
    }
    
    /** Sets the value of the 'nextPageToken' field */
    public org.ga4gh.methods.SearchFeaturesResponse.Builder setNextPageToken(java.lang.String value) {
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
    public org.ga4gh.methods.SearchFeaturesResponse.Builder clearNextPageToken() {
      nextPageToken = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public SearchFeaturesResponse build() {
      try {
        SearchFeaturesResponse record = new SearchFeaturesResponse();
        record.features = fieldSetFlags()[0] ? this.features : (java.util.List<org.ga4gh.models.Feature>) defaultValue(fields()[0]);
        record.nextPageToken = fieldSetFlags()[1] ? this.nextPageToken : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
