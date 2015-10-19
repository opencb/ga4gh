/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.models;  
@SuppressWarnings("all")
/** A string-to-reference-graph alignment can be represented by one CIGAR string and
one `Path` through multiple `Reference`s, against which the CIGAR string is
interpreted.

Note that `Path`s in `GraphAlignment`s are restricted to visiting `Reference`s
and following reference adjacencies. If a read needs to be aligned to sequences
that are not present in a `ReferenceSet`, it needs to be aligned to a new
`ReferenceSet` with those sequences. If a read needs to follow adjacencies that
are not present in the `ReferenceSet` it's being aligned to, it should be
represented as a "chimeric" alignment, and should use multiple `ReadAlignment`s
and the supplementaryAlignment flag instead of a single `GraphAlignment`.

Some especially large deletions could be represented just as well as a large
deletion in the CIGAR string, or as a chimeric alignment. */
@org.apache.avro.specific.AvroGenerated
public class GraphAlignment extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GraphAlignment\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"A string-to-reference-graph alignment can be represented by one CIGAR string and\\none `Path` through multiple `Reference`s, against which the CIGAR string is\\ninterpreted.\\n\\nNote that `Path`s in `GraphAlignment`s are restricted to visiting `Reference`s\\nand following reference adjacencies. If a read needs to be aligned to sequences\\nthat are not present in a `ReferenceSet`, it needs to be aligned to a new\\n`ReferenceSet` with those sequences. If a read needs to follow adjacencies that\\nare not present in the `ReferenceSet` it's being aligned to, it should be\\nrepresented as a \\\"chimeric\\\" alignment, and should use multiple `ReadAlignment`s\\nand the supplementaryAlignment flag instead of a single `GraphAlignment`.\\n\\nSome especially large deletions could be represented just as well as a large\\ndeletion in the CIGAR string, or as a chimeric alignment.\",\"fields\":[{\"name\":\"path\",\"type\":{\"type\":\"record\",\"name\":\"Path\",\"doc\":\"A `Path` is an ordered list of `Segment`s. In general any contiguous path\\nthrough a sequence graph, with no novel adjacencies, can be represented by a\\n`Path`.\",\"fields\":[{\"name\":\"segments\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Segment\",\"doc\":\"A `Segment` is a range on a sequence, possibly including the joins at the\\nsequence's ends. It does not include base data. (The bases for a sequence are\\navailable through the `getSequenceBases()` API call.)\\n\\nIn the sequence \\\"GTGG\\\", the segment starting at index 1 on the forward strand\\nwith length 2 is the \\\"TG\\\" on the forward strand. The length-2 segment starting\\nat index 1 on the reverse strand is \\\"AC\\\", corresponding to the first two base\\npairs of the sequence, or the last two bases of the reverse complement.\",\"fields\":[{\"name\":\"start\",\"type\":{\"type\":\"record\",\"name\":\"Position\",\"doc\":\"A `Position` is a side of a base pair in some already known sequence. A\\n`Position` is represented by a sequence name or ID, a base number on that\\nsequence (0-based), and a `Strand` to indicate the left or right side.\\n\\nFor example, given the sequence \\\"GTGG\\\", the `Position` on that sequence at\\noffset 1 in the forward orientation would be the left side of the T/A base pair.\\nThe base at this `Position` is \\\"T\\\". Alternately, for offset 1 in the reverse\\norientation, the `Position` would be the right side of the T/A base pair, and\\nthe base at the `Position` is \\\"A\\\".\\n\\nOffsets added to a `Position` are interpreted as reading along its strand;\\nadding to a reverse strand position actually subtracts from its `position`\\nmember.\",\"fields\":[{\"name\":\"referenceName\",\"type\":[\"null\",\"string\"],\"doc\":\"The name of the reference sequence in whatever reference set is being used.\\n  Does not generally include a \\\"chr\\\" prefix, so for example \\\"X\\\" would be used\\n  for the X chromosome.\\n\\n  If `sequenceId` is null, this must not be null.\",\"default\":null},{\"name\":\"sequenceId\",\"type\":[\"null\",\"string\"],\"doc\":\"The ID of the sequence on which the `Position` is located. This may be a\\n  `Reference` sequence, or a novel piece of sequence associated with a\\n  `VariantSet`.\\n\\n  If `referenceName` is null, this must not be null.\\n\\n  If the server supports the \\\"graph\\\" mode, this must not be null.\",\"default\":null},{\"name\":\"position\",\"type\":\"long\",\"doc\":\"The 0-based offset from the start of the forward strand for that sequence.\\n  Genomic positions are non-negative integers less than sequence length.\"},{\"name\":\"strand\",\"type\":{\"type\":\"enum\",\"name\":\"Strand\",\"doc\":\"Indicates the DNA strand associate for some data item.\\n* `POS_STRAND`:  The postive (+) strand.\\n* `NEG_STRAND`: The negative (-) strand.\\n* `NO_STRAND`: Strand-independent data or data where the strand can not be determined.\",\"symbols\":[\"POS_STRAND\",\"NEG_STRAND\",\"NO_STRAND\"]},\"doc\":\"Strand the position is associated with. `POS_STRAND` represents the forward\\n  strand, or equivalently the left side of a base, and `NEG_STRAND` represents\\n  the reverse strand, or equivalently the right side of a base.\"}]},\"doc\":\"The sequence ID and start index of this `Segment`. This base is always\\n  included in the segment, regardless of orientation.\"},{\"name\":\"length\",\"type\":\"long\",\"doc\":\"The length of this `Segment`'s sequence. If `start` is on the forward strand,\\n  the `Segment` contains the range [`start.position`, `start.position` +\\n  `length`). If `start` is on the reverse strand, the `Segment` contains the\\n  range (`start.position` - `length`, `start.position`]. This is equivalent to\\n  starting from the side indicated by `start`, and traversing through that base\\n  out to the specified length.\"},{\"name\":\"startJoin\",\"type\":[\"null\",\"Position\"],\"doc\":\"Start and end `Position`s where this `Segment` attaches to other sequences.\\n  Note that the segmentId for start and end might not be the same. The\\n  `Segment`s covering the sequences onto which this `Segment` is joined are\\n  called its \\\"parents\\\", while this segment is a \\\"child\\\".\\n\\n  Joins may occur on the outer sides of the terminal bases in a sequence: the\\n  left side of the base at index 0, and the right side of the base with maximum\\n  index. These are the \\\"terminal sides\\\" of the sequence. `startJoin` is the join\\n  on the side indicated by `start`, and may only be set if that side is a\\n  terminal side. Similarly, `endJoin` is the join on the opposite side of the\\n  piece of sequence selected by the segment, and may only be set if that side is\\n  a terminal side. The value of `startJoin` or `endJoin`, if set, is the side to\\n  which the corresponding side of this `Sequence` is connected.\",\"default\":null},{\"name\":\"endJoin\",\"type\":[\"null\",\"Position\"],\"default\":null}]}},\"doc\":\"We require that one of each consecutive pair of `Segment`s in a `Path` be\\n  joined onto the other. `Segment`s appear in the order in which they occur when\\n  walking the path from one end to the other.\",\"default\":[]}]},\"doc\":\"The `Path` against which the read is aligned\"},{\"name\":\"mappingQuality\",\"type\":[\"null\",\"int\"],\"doc\":\"The mapping quality of this alignment. Represents how likely\\n  the read maps to this position as opposed to other locations.\",\"default\":null},{\"name\":\"cigar\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"CigarUnit\",\"doc\":\"A structure for an instance of a CIGAR operation.\",\"fields\":[{\"name\":\"operation\",\"type\":{\"type\":\"enum\",\"name\":\"CigarOperation\",\"doc\":\"An enum for the different types of CIGAR alignment operations that exist.\\nUsed wherever CIGAR alignments are used. The different enumerated values\\nhave the following usage:\\n\\n* `ALIGNMENT_MATCH`: An alignment match indicates that a sequence can be\\n  aligned to the reference without evidence of an INDEL. Unlike the\\n  `SEQUENCE_MATCH` and `SEQUENCE_MISMATCH` operators, the `ALIGNMENT_MATCH`\\n  operator does not indicate whether the reference and read sequences are an\\n  exact match. This operator is equivalent to SAM's `M`.\\n* `INSERT`: The insert operator indicates that the read contains evidence of\\n  bases being inserted into the reference. This operator is equivalent to\\n  SAM's `I`.\\n* `DELETE`: The delete operator indicates that the read contains evidence of\\n  bases being deleted from the reference. This operator is equivalent to\\n  SAM's `D`.\\n* `SKIP`: The skip operator indicates that this read skips a long segment of\\n  the reference, but the bases have not been deleted. This operator is\\n  commonly used when working with RNA-seq data, where reads may skip long\\n  segments of the reference between exons. This operator is equivalent to\\n  SAM's 'N'.\\n* `CLIP_SOFT`: The soft clip operator indicates that bases at the start/end\\n  of a read have not been considered during alignment. This may occur if the\\n  majority of a read maps, except for low quality bases at the start/end of\\n  a read. This operator is equivalent to SAM's 'S'. Bases that are soft clipped\\n  will still be stored in the read.\\n* `CLIP_HARD`: The hard clip operator indicates that bases at the start/end of\\n  a read have been omitted from this alignment. This may occur if this linear\\n  alignment is part of a chimeric alignment, or if the read has been trimmed\\n  (e.g., ","during error correction, or to trim poly-A tails for RNA-seq). This\\n  operator is equivalent to SAM's 'H'.\\n* `PAD`: The pad operator indicates that there is padding in an alignment.\\n  This operator is equivalent to SAM's 'P'.\\n* `SEQUENCE_MATCH`: This operator indicates that this portion of the aligned\\n  sequence exactly matches the reference (e.g., all bases are equal to the\\n  reference bases). This operator is equivalent to SAM's '='.\\n* `SEQUENCE_MISMATCH`: This operator indicates that this portion of the\\n  aligned sequence is an alignment match to the reference, but a sequence\\n  mismatch (e.g., the bases are not equal to the reference). This can\\n  indicate a SNP or a read error. This operator is equivalent to SAM's 'X'.\",\"symbols\":[\"ALIGNMENT_MATCH\",\"INSERT\",\"DELETE\",\"SKIP\",\"CLIP_SOFT\",\"CLIP_HARD\",\"PAD\",\"SEQUENCE_MATCH\",\"SEQUENCE_MISMATCH\"]},\"doc\":\"The operation type.\"},{\"name\":\"operationLength\",\"type\":\"long\",\"doc\":\"The number of bases that the operation runs for.\"},{\"name\":\"referenceSequence\",\"type\":[\"null\",\"string\"],\"doc\":\"`referenceSequence` is only used at mismatches (`SEQUENCE_MISMATCH`)\\n  and deletions (`DELETE`). Filling this field replaces the MD tag.\\n  If the relevant information is not available, leave this field as `null`.\",\"default\":null}]}},\"doc\":\"Represents the local alignment of this sequence (alignment matches, indels,\\n  etc) versus the `Path`.\",\"default\":[]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The `Path` against which the read is aligned */
   private org.ga4gh.models.Path path;
  /** The mapping quality of this alignment. Represents how likely
  the read maps to this position as opposed to other locations. */
   private java.lang.Integer mappingQuality;
  /** Represents the local alignment of this sequence (alignment matches, indels,
  etc) versus the `Path`. */
   private java.util.List<org.ga4gh.models.CigarUnit> cigar;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public GraphAlignment() {}

  /**
   * All-args constructor.
   */
  public GraphAlignment(org.ga4gh.models.Path path, java.lang.Integer mappingQuality, java.util.List<org.ga4gh.models.CigarUnit> cigar) {
    this.path = path;
    this.mappingQuality = mappingQuality;
    this.cigar = cigar;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return path;
    case 1: return mappingQuality;
    case 2: return cigar;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: path = (org.ga4gh.models.Path)value$; break;
    case 1: mappingQuality = (java.lang.Integer)value$; break;
    case 2: cigar = (java.util.List<org.ga4gh.models.CigarUnit>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'path' field.
   * The `Path` against which the read is aligned   */
  public org.ga4gh.models.Path getPath() {
    return path;
  }

  /**
   * Sets the value of the 'path' field.
   * The `Path` against which the read is aligned   * @param value the value to set.
   */
  public void setPath(org.ga4gh.models.Path value) {
    this.path = value;
  }

  /**
   * Gets the value of the 'mappingQuality' field.
   * The mapping quality of this alignment. Represents how likely
  the read maps to this position as opposed to other locations.   */
  public java.lang.Integer getMappingQuality() {
    return mappingQuality;
  }

  /**
   * Sets the value of the 'mappingQuality' field.
   * The mapping quality of this alignment. Represents how likely
  the read maps to this position as opposed to other locations.   * @param value the value to set.
   */
  public void setMappingQuality(java.lang.Integer value) {
    this.mappingQuality = value;
  }

  /**
   * Gets the value of the 'cigar' field.
   * Represents the local alignment of this sequence (alignment matches, indels,
  etc) versus the `Path`.   */
  public java.util.List<org.ga4gh.models.CigarUnit> getCigar() {
    return cigar;
  }

  /**
   * Sets the value of the 'cigar' field.
   * Represents the local alignment of this sequence (alignment matches, indels,
  etc) versus the `Path`.   * @param value the value to set.
   */
  public void setCigar(java.util.List<org.ga4gh.models.CigarUnit> value) {
    this.cigar = value;
  }

  /** Creates a new GraphAlignment RecordBuilder */
  public static org.ga4gh.models.GraphAlignment.Builder newBuilder() {
    return new org.ga4gh.models.GraphAlignment.Builder();
  }
  
  /** Creates a new GraphAlignment RecordBuilder by copying an existing Builder */
  public static org.ga4gh.models.GraphAlignment.Builder newBuilder(org.ga4gh.models.GraphAlignment.Builder other) {
    return new org.ga4gh.models.GraphAlignment.Builder(other);
  }
  
  /** Creates a new GraphAlignment RecordBuilder by copying an existing GraphAlignment instance */
  public static org.ga4gh.models.GraphAlignment.Builder newBuilder(org.ga4gh.models.GraphAlignment other) {
    return new org.ga4gh.models.GraphAlignment.Builder(other);
  }
  
  /**
   * RecordBuilder for GraphAlignment instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GraphAlignment>
    implements org.apache.avro.data.RecordBuilder<GraphAlignment> {

    private org.ga4gh.models.Path path;
    private java.lang.Integer mappingQuality;
    private java.util.List<org.ga4gh.models.CigarUnit> cigar;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.models.GraphAlignment.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.models.GraphAlignment.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.path)) {
        this.path = data().deepCopy(fields()[0].schema(), other.path);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.mappingQuality)) {
        this.mappingQuality = data().deepCopy(fields()[1].schema(), other.mappingQuality);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.cigar)) {
        this.cigar = data().deepCopy(fields()[2].schema(), other.cigar);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing GraphAlignment instance */
    private Builder(org.ga4gh.models.GraphAlignment other) {
            super(org.ga4gh.models.GraphAlignment.SCHEMA$);
      if (isValidValue(fields()[0], other.path)) {
        this.path = data().deepCopy(fields()[0].schema(), other.path);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.mappingQuality)) {
        this.mappingQuality = data().deepCopy(fields()[1].schema(), other.mappingQuality);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.cigar)) {
        this.cigar = data().deepCopy(fields()[2].schema(), other.cigar);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'path' field */
    public org.ga4gh.models.Path getPath() {
      return path;
    }
    
    /** Sets the value of the 'path' field */
    public org.ga4gh.models.GraphAlignment.Builder setPath(org.ga4gh.models.Path value) {
      validate(fields()[0], value);
      this.path = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'path' field has been set */
    public boolean hasPath() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'path' field */
    public org.ga4gh.models.GraphAlignment.Builder clearPath() {
      path = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'mappingQuality' field */
    public java.lang.Integer getMappingQuality() {
      return mappingQuality;
    }
    
    /** Sets the value of the 'mappingQuality' field */
    public org.ga4gh.models.GraphAlignment.Builder setMappingQuality(java.lang.Integer value) {
      validate(fields()[1], value);
      this.mappingQuality = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'mappingQuality' field has been set */
    public boolean hasMappingQuality() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'mappingQuality' field */
    public org.ga4gh.models.GraphAlignment.Builder clearMappingQuality() {
      mappingQuality = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'cigar' field */
    public java.util.List<org.ga4gh.models.CigarUnit> getCigar() {
      return cigar;
    }
    
    /** Sets the value of the 'cigar' field */
    public org.ga4gh.models.GraphAlignment.Builder setCigar(java.util.List<org.ga4gh.models.CigarUnit> value) {
      validate(fields()[2], value);
      this.cigar = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'cigar' field has been set */
    public boolean hasCigar() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'cigar' field */
    public org.ga4gh.models.GraphAlignment.Builder clearCigar() {
      cigar = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public GraphAlignment build() {
      try {
        GraphAlignment record = new GraphAlignment();
        record.path = fieldSetFlags()[0] ? this.path : (org.ga4gh.models.Path) defaultValue(fields()[0]);
        record.mappingQuality = fieldSetFlags()[1] ? this.mappingQuality : (java.lang.Integer) defaultValue(fields()[1]);
        record.cigar = fieldSetFlags()[2] ? this.cigar : (java.util.List<org.ga4gh.models.CigarUnit>) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
