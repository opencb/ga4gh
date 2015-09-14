/*
 * Copyright 2015 OpenCB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.models;  
@SuppressWarnings("all")
/** An enum for the different types of CIGAR alignment operations that exist.
Used wherever CIGAR alignments are used. The different enumerated values
have the following usage:

* `ALIGNMENT_MATCH`: An alignment match indicates that a sequence can be
  aligned to the reference without evidence of an INDEL. Unlike the
  `SEQUENCE_MATCH` and `SEQUENCE_MISMATCH` operators, the `ALIGNMENT_MATCH`
  operator does not indicate whether the reference and read sequences are an
  exact match. This operator is equivalent to SAM's `M`.
* `INSERT`: The insert operator indicates that the read contains evidence of
  bases being inserted into the reference. This operator is equivalent to
  SAM's `I`.
* `DELETE`: The delete operator indicates that the read contains evidence of
  bases being deleted from the reference. This operator is equivalent to
  SAM's `D`.
* `SKIP`: The skip operator indicates that this read skips a long segment of
  the reference, but the bases have not been deleted. This operator is
  commonly used when working with RNA-seq data, where reads may skip long
  segments of the reference between exons. This operator is equivalent to
  SAM's 'N'.
* `CLIP_SOFT`: The soft clip operator indicates that bases at the start/end
  of a read have not been considered during alignment. This may occur if the
  majority of a read maps, except for low quality bases at the start/end of
  a read. This operator is equivalent to SAM's 'S'. Bases that are soft clipped
  will still be stored in the read.
* `CLIP_HARD`: The hard clip operator indicates that bases at the start/end of
  a read have been omitted from this alignment. This may occur if this linear
  alignment is part of a chimeric alignment, or if the read has been trimmed
  (e.g., during error correction, or to trim poly-A tails for RNA-seq). This
  operator is equivalent to SAM's 'H'.
* `PAD`: The pad operator indicates that there is padding in an alignment.
  This operator is equivalent to SAM's 'P'.
* `SEQUENCE_MATCH`: This operator indicates that this portion of the aligned
  sequence exactly matches the reference (e.g., all bases are equal to the
  reference bases). This operator is equivalent to SAM's '='.
* `SEQUENCE_MISMATCH`: This operator indicates that this portion of the
  aligned sequence is an alignment match to the reference, but a sequence
  mismatch (e.g., the bases are not equal to the reference). This can
  indicate a SNP or a read error. This operator is equivalent to SAM's 'X'. */
@org.apache.avro.specific.AvroGenerated
public enum CigarOperation { 
  ALIGNMENT_MATCH, INSERT, DELETE, SKIP, CLIP_SOFT, CLIP_HARD, PAD, SEQUENCE_MATCH, SEQUENCE_MISMATCH  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"CigarOperation\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"An enum for the different types of CIGAR alignment operations that exist.\\nUsed wherever CIGAR alignments are used. The different enumerated values\\nhave the following usage:\\n\\n* `ALIGNMENT_MATCH`: An alignment match indicates that a sequence can be\\n  aligned to the reference without evidence of an INDEL. Unlike the\\n  `SEQUENCE_MATCH` and `SEQUENCE_MISMATCH` operators, the `ALIGNMENT_MATCH`\\n  operator does not indicate whether the reference and read sequences are an\\n  exact match. This operator is equivalent to SAM's `M`.\\n* `INSERT`: The insert operator indicates that the read contains evidence of\\n  bases being inserted into the reference. This operator is equivalent to\\n  SAM's `I`.\\n* `DELETE`: The delete operator indicates that the read contains evidence of\\n  bases being deleted from the reference. This operator is equivalent to\\n  SAM's `D`.\\n* `SKIP`: The skip operator indicates that this read skips a long segment of\\n  the reference, but the bases have not been deleted. This operator is\\n  commonly used when working with RNA-seq data, where reads may skip long\\n  segments of the reference between exons. This operator is equivalent to\\n  SAM's 'N'.\\n* `CLIP_SOFT`: The soft clip operator indicates that bases at the start/end\\n  of a read have not been considered during alignment. This may occur if the\\n  majority of a read maps, except for low quality bases at the start/end of\\n  a read. This operator is equivalent to SAM's 'S'. Bases that are soft clipped\\n  will still be stored in the read.\\n* `CLIP_HARD`: The hard clip operator indicates that bases at the start/end of\\n  a read have been omitted from this alignment. This may occur if this linear\\n  alignment is part of a chimeric alignment, or if the read has been trimmed\\n  (e.g., during error correction, or to trim poly-A tails for RNA-seq). This\\n  operator is equivalent to SAM's 'H'.\\n* `PAD`: The pad operator indicates that there is padding in an alignment.\\n  This operator is equivalent to SAM's 'P'.\\n* `SEQUENCE_MATCH`: This operator indicates that this portion of the aligned\\n  sequence exactly matches the reference (e.g., all bases are equal to the\\n  reference bases). This operator is equivalent to SAM's '='.\\n* `SEQUENCE_MISMATCH`: This operator indicates that this portion of the\\n  aligned sequence is an alignment match to the reference, but a sequence\\n  mismatch (e.g., the bases are not equal to the reference). This can\\n  indicate a SNP or a read error. This operator is equivalent to SAM's 'X'.\",\"symbols\":[\"ALIGNMENT_MATCH\",\"INSERT\",\"DELETE\",\"SKIP\",\"CLIP_SOFT\",\"CLIP_HARD\",\"PAD\",\"SEQUENCE_MATCH\",\"SEQUENCE_MISMATCH\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
}
