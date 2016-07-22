/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.methods;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public interface AlleleAnnotationMethods {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"AlleleAnnotationMethods\",\"namespace\":\"org.ga4gh.methods\",\"types\":[{\"type\":\"error\",\"name\":\"GAException\",\"doc\":\"A general exception type.\",\"fields\":[{\"name\":\"message\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The error message\"},{\"name\":\"errorCode\",\"type\":\"int\",\"doc\":\"The numerical error code\",\"default\":-1}]},{\"type\":\"enum\",\"name\":\"Strand\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"Indicates the DNA strand associate for some data item.\\n* `NEG_STRAND`: The negative (-) strand.\\n* `POS_STRAND`:  The postive (+) strand.\",\"symbols\":[\"NEG_STRAND\",\"POS_STRAND\"]},{\"type\":\"record\",\"name\":\"Position\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"A `Position` is an unoriented base in some `Reference`. A `Position` is\\nrepresented by a `Reference` name, and a base number on that `Reference`\\n(0-based).\",\"fields\":[{\"name\":\"referenceName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The name of the `Reference` on which the `Position` is located.\"},{\"name\":\"position\",\"type\":\"long\",\"doc\":\"The 0-based offset from the start of the forward strand for that `Reference`.\\n  Genomic positions are non-negative integers less than `Reference` length.\"},{\"name\":\"strand\",\"type\":\"Strand\",\"doc\":\"Strand the position is associated with.\"}]},{\"type\":\"record\",\"name\":\"ExternalIdentifier\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"Identifier from a public database\",\"fields\":[{\"name\":\"database\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The source of the identifier.\\n  (e.g. `Ensembl`)\"},{\"name\":\"identifier\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The ID defined by the external database.\\n  (e.g. `ENST00000000000`)\"},{\"name\":\"version\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The version of the object or the database\\n  (e.g. `78`)\"}]},{\"type\":\"enum\",\"name\":\"CigarOperation\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"An enum for the different types of CIGAR alignment operations that exist.\\nUsed wherever CIGAR alignments are used. The different enumerated values\\nhave the following usage:\\n\\n* `ALIGNMENT_MATCH`: An alignment match indicates that a sequence can be\\n  aligned to the reference without evidence of an INDEL. Unlike the\\n  `SEQUENCE_MATCH` and `SEQUENCE_MISMATCH` operators, the `ALIGNMENT_MATCH`\\n  operator does not indicate whether the reference and read sequences are an\\n  exact match. This operator is equivalent to SAM's `M`.\\n* `INSERT`: The insert operator indicates that the read contains evidence of\\n  bases being inserted into the reference. This operator is equivalent to\\n  SAM's `I`.\\n* `DELETE`: The delete operator indicates that the read contains evidence of\\n  bases being deleted from the reference. This operator is equivalent to\\n  SAM's `D`.\\n* `SKIP`: The skip operator indicates that this read skips a long segment of\\n  the reference, but the bases have not been deleted. This operator is\\n  commonly used when working with RNA-seq data, where reads may skip long\\n  segments of the reference between exons. This operator is equivalent to\\n  SAM's 'N'.\\n* `CLIP_SOFT`: The soft clip operator indicates that bases at the start/end\\n  of a read have not been considered during alignment. This may occur if the\\n  majority of a read maps, except for low quality bases at the start/end of\\n  a read. This operator is equivalent to SAM's 'S'. Bases that are soft clipped\\n  will still be stored in the read.\\n* `CLIP_HARD`: The hard clip operator indicates that bases at the start/end of\\n  a read have been omitted from this alignment. This may occur if this linear\\n  alignment is part of a chimeric alignment, or if the read has been trimmed\\n  (e.g., during error correction, or to trim poly-A tails for RNA-seq). This\\n  operator is equivalent to SAM's 'H'.\\n* `PAD`: The pad operator indicates that there is padding in an alignment.\\n  This operator is equivalent to SAM's 'P'.\\n* `SEQUENCE_MATCH`: This operator indicates that this portion of the aligned\\n  sequence exactly matches the reference (e.g., all bases are equal to the\\n  reference bases). This operator is equivalent to SAM's '='.\\n* `SEQUENCE_MISMATCH`: This operator indicates that this portion of the\\n  aligned sequence is an alignment match to the reference, but a sequence\\n  mismatch (e.g., the bases are not equal to the reference). This can\\n  indicate a SNP or a read error. This operator is equivalent to SAM's 'X'.\",\"symbols\":[\"ALIGNMENT_MATCH\",\"INSERT\",\"DELETE\",\"SKIP\",\"CLIP_SOFT\",\"CLIP_HARD\",\"PAD\",\"SEQUENCE_MATCH\",\"SEQUENCE_MISMATCH\"]},{\"type\":\"record\",\"name\":\"CigarUnit\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"A structure for an instance of a CIGAR operation.\\n`FIXME: This belongs under Reads (only readAlignment refers to this)`\",\"fields\":[{\"name\":\"operation\",\"type\":\"CigarOperation\",\"doc\":\"The operation type.\"},{\"name\":\"operationLength\",\"type\":\"long\",\"doc\":\"The number of bases that the operation runs for.\"},{\"name\":\"referenceSequence\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"`referenceSequence` is only used at mismatches (`SEQUENCE_MISMATCH`)\\n  and deletions (`DELETE`). Filling this field replaces the MD tag.\\n  If the relevant information is not available, leave this field as `null`.\",\"default\":null}]},{\"type\":\"record\",\"name\":\"VariantSetMetadata\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"Optional metadata associated with a variant set.\",\"fields\":[{\"name\":\"key\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The top-level key.\"},{\"name\":\"value\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The value field for simple metadata.\"},{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"User-provided ID field, not enforced by this API.\\n  Two or more pieces of structured metadata with identical\\n  id and key fields are considered equivalent.\\n  `FIXME: If it's not enforced, then why can't it be null?`\"},{\"name\":\"type\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The type of data.\"},{\"name\":\"number\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The number of values that can be included in a field described by this\\n  metadata.\"},{\"name\":\"description\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"A textual description of this metadata.\"},{\"name\":\"info\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"avro.java.string\":\"String\"},\"doc\":\"Remaining structured metadata key-value pairs.\",\"default\":{}}]},{\"type\":\"record\",\"name\":\"VariantSet\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"A VariantSet is a collection of variants and variant calls intended to be analyzed together.\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The variant set ID.\"},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The variant set name.\",\"default\":null},{\"name\":\"datasetId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The ID of the dataset this variant set belongs to.\"},{\"name\":\"referenceSetId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The ID of the reference set that describes the sequences used by the variants in this set.\"},{\"name\":\"metadata\",\"type\":{\"type\":\"array\",\"items\":\"VariantSetMetadata\"},\"doc\":\"Optional metadata associated with this variant set.\\n  This array can be used to store information about the variant set, such as information found\\n  in VCF header fields, that isn't already available in first class fields such as \\\"name\\\".\",\"default\":[]}]},{\"type\":\"record\",\"name\":\"CallSet\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"A CallSet is a collection of calls that were generated by the same analysis of the same sample.\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The call set ID.\"},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The call set name.\",\"default\":null},{\"name\":\"sampleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The sample this call set's data was generated from.\\n  Note: the current API does not have a rigorous definition of sample. Therefore, this\\n  field actually contains an arbitrary str","ing, typically corresponding to the sampleId\\n  field in the read groups used to generate this call set.\"},{\"name\":\"variantSetIds\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"doc\":\"The IDs of the variant sets this call set has calls in.\",\"default\":[]},{\"name\":\"created\",\"type\":[\"null\",\"long\"],\"doc\":\"The date this call set was created in milliseconds from the epoch.\",\"default\":null},{\"name\":\"updated\",\"type\":[\"null\",\"long\"],\"doc\":\"The time at which this call set was last updated in\\n  milliseconds from the epoch.\",\"default\":null},{\"name\":\"info\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"avro.java.string\":\"String\"},\"doc\":\"A map of additional call set information.\",\"default\":{}}]},{\"type\":\"record\",\"name\":\"Call\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"A `Call` represents the determination of genotype with respect to a\\nparticular `Variant`.\\n\\nIt may include associated information such as quality\\nand phasing. For example, a call might assign a probability of 0.32 to\\nthe occurrence of a SNP named rs1234 in a call set with the name NA12345.\",\"fields\":[{\"name\":\"callSetName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The name of the call set this variant call belongs to.\\n  If this field is not present, the ordering of the call sets from a\\n  `SearchCallSetsRequest` over this `VariantSet` is guaranteed to match\\n  the ordering of the calls on this `Variant`.\\n  The number of results will also be the same.\",\"default\":null},{\"name\":\"callSetId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The ID of the call set this variant call belongs to.\\n\\n  If this field is not present, the ordering of the call sets from a\\n  `SearchCallSetsRequest` over this `VariantSet` is guaranteed to match\\n  the ordering of the calls on this `Variant`.\\n  The number of results will also be the same.\",\"default\":null},{\"name\":\"genotype\",\"type\":{\"type\":\"array\",\"items\":\"int\"},\"doc\":\"The genotype of this variant call.\\n\\n  A 0 value represents the reference allele of the associated `Variant`. Any\\n  other value is a 1-based index into the alternate alleles of the associated\\n  `Variant`.\\n\\n  If a variant had a referenceBases field of \\\"T\\\", an alternateBases\\n  value of [\\\"A\\\", \\\"C\\\"], and the genotype was [2, 1], that would mean the call\\n  represented the heterozygous value \\\"CA\\\" for this variant. If the genotype\\n  was instead [0, 1] the represented value would be \\\"TA\\\". Ordering of the\\n  genotype values is important if the phaseset field is present.\",\"default\":[]},{\"name\":\"phaseset\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"If this field is not null, this variant call's genotype ordering implies\\n  the phase of the bases and is consistent with any other variant calls on\\n  the same contig which have the same phaseset string.\",\"default\":null},{\"name\":\"genotypeLikelihood\",\"type\":{\"type\":\"array\",\"items\":\"double\"},\"doc\":\"The genotype likelihoods for this variant call. Each array entry\\n  represents how likely a specific genotype is for this call as\\n  log10(P(data | genotype)), analogous to the GL tag in the VCF spec. The\\n  value ordering is defined by the GL tag in the VCF spec.\",\"default\":[]},{\"name\":\"info\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"avro.java.string\":\"String\"},\"doc\":\"A map of additional variant call information.\",\"default\":{}}]},{\"type\":\"record\",\"name\":\"Variant\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"A `Variant` represents a change in DNA sequence relative to some reference.\\nFor example, a variant could represent a SNP or an insertion.\\nVariants belong to a `VariantSet`.\\nThis is equivalent to a row in VCF.\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The variant ID.\"},{\"name\":\"variantSetId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The ID of the `VariantSet` this variant belongs to. This transitively defines\\n  the `ReferenceSet` against which the `Variant` is to be interpreted.\"},{\"name\":\"names\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"doc\":\"Names for the variant, for example a RefSNP ID.\",\"default\":[]},{\"name\":\"created\",\"type\":[\"null\",\"long\"],\"doc\":\"The date this variant was created in milliseconds from the epoch.\",\"default\":null},{\"name\":\"updated\",\"type\":[\"null\",\"long\"],\"doc\":\"The time at which this variant was last updated in\\n  milliseconds from the epoch.\",\"default\":null},{\"name\":\"referenceName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The reference on which this variant occurs.\\n  (e.g. `chr20` or `X`)\"},{\"name\":\"start\",\"type\":\"long\",\"doc\":\"The start position at which this variant occurs (0-based).\\n  This corresponds to the first base of the string of reference bases.\\n  Genomic positions are non-negative integers less than reference length.\\n  Variants spanning the join of circular genomes are represented as\\n  two variants one on each side of the join (position 0).\"},{\"name\":\"end\",\"type\":\"long\",\"doc\":\"The end position (exclusive), resulting in [start, end) closed-open interval.\\n  This is typically calculated by `start + referenceBases.length`.\"},{\"name\":\"referenceBases\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The reference bases for this variant. They start at the given start position.\"},{\"name\":\"alternateBases\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"doc\":\"The bases that appear instead of the reference bases. Multiple alternate\\n  alleles are possible.\",\"default\":[]},{\"name\":\"info\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"avro.java.string\":\"String\"},\"doc\":\"A map of additional variant information.\",\"default\":{}},{\"name\":\"calls\",\"type\":{\"type\":\"array\",\"items\":\"Call\"},\"doc\":\"The variant calls for this particular variant. Each one represents the\\n  determination of genotype with respect to this variant. `Call`s in this array\\n  are implicitly associated with this `Variant`.\",\"default\":[]}]},{\"type\":\"record\",\"name\":\"OntologyTerm\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"An ontology term describing an attribute. (e.g. the phenotype attribute\\n  'polydactyly' from HPO)\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Ontology source identifier - the identifier, a CURIE (preferred) or\\n  PURL for an ontology source e.g. http://purl.obolibrary.org/obo/hp.obo\\n  It differs from the standard GA4GH schema's :ref:`id <apidesign_object_ids>`\\n  in that it is a URI pointing to an information resource outside of the scope\\n  of the schema or its resource implementation.\"},{\"name\":\"term\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Ontology term - the representation the id is pointing to.\",\"default\":null},{\"name\":\"sourceName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Ontology source name - the name of ontology from which the term is obtained\\n  e.g. 'Human Phenotype Ontology'\",\"default\":null},{\"name\":\"sourceVersion\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Ontology source version - the version of the ontology from which the\\n  OntologyTerm is obtained; e.g. 2.6.1.\\n  There is no standard for ontology versioning and some frequently\\n  released ontologies may use a datestamp, or build number.\",\"default\":null}]},{\"type\":\"record\",\"name\":\"Experiment\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"An experimental preparation of a sample.\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The experiment UUID. This is globally unique.\"},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The name of the experiment.\",\"default\":null},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"A description of the experiment.\",\"default\":null},{\"name\":\"createDateTime\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The time at which this record was created. \\n  Format: :ref:`ISO 8601 <metadata_date_time>`\"},","{\"name\":\"updateDateTime\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The time at which this record was last updated.\\n  Format: :ref:`ISO 8601 <metadata_date_time>`\"},{\"name\":\"runTime\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The time at which this experiment was performed.\\n  Granularity here is variable (e.g. date only).\\n  Format: :ref:`ISO 8601 <metadata_date_time>`\",\"default\":null},{\"name\":\"molecule\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The molecule examined in this experiment. (e.g. genomics DNA, total RNA)\",\"default\":null},{\"name\":\"strategy\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The experiment technique or strategy applied to the sample.\\n  (e.g. whole genome sequencing, RNA-seq, RIP-seq)\",\"default\":null},{\"name\":\"selection\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The method used to enrich the target. (e.g. immunoprecipitation, size\\n  fractionation, MNase digestion)\",\"default\":null},{\"name\":\"library\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The name of the library used as part of this experiment.\",\"default\":null},{\"name\":\"libraryLayout\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The configuration of sequenced reads. (e.g. Single or Paired)\",\"default\":null},{\"name\":\"instrumentModel\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The instrument model used as part of this experiment.\\n    This maps to sequencing technology in BAM.\"},{\"name\":\"instrumentDataFile\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The data file generated by the instrument.\\n  TODO: This isn't actually a file is it?\\n  Should this be `instrumentData` instead?\",\"default\":null},{\"name\":\"sequencingCenter\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The sequencing center used as part of this experiment.\"},{\"name\":\"platformUnit\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The platform unit used as part of this experiment. This is a flowcell-barcode\\n  or slide unique identifier.\",\"default\":null},{\"name\":\"info\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"avro.java.string\":\"String\"},\"doc\":\"A map of additional experiment information.\",\"default\":{}}]},{\"type\":\"record\",\"name\":\"Dataset\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"A Dataset is a collection of related data of multiple types.\\nData providers decide how to group data into datasets.\\nSee [Metadata API](../api/metadata.html) for a more detailed discussion.\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The dataset's id, locally unique to the server instance.\"},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The name of the dataset.\",\"default\":null},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Additional, human-readable information on the dataset.\",\"default\":null}]},{\"type\":\"record\",\"name\":\"Analysis\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"An analysis contains an interpretation of one or several experiments.\\n(e.g. SNVs, copy number variations, methylation status) together with\\ninformation about the methodology used.\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Formats of id | name | description | accessions are described in the\\n  documentation on general attributes and formats.\"},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"createDateTime\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The time at which this record was created. \\n  Format: :ref:`ISO 8601 <metadata_date_time>`\",\"default\":null},{\"name\":\"updateDateTime\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The time at which this record was last updated.\\n  Format: :ref:`ISO 8601 <metadata_date_time>`\"},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The type of analysis.\",\"default\":null},{\"name\":\"software\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"doc\":\"The software run to generate this analysis.\",\"default\":[]},{\"name\":\"info\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"avro.java.string\":\"String\"},\"doc\":\"A map of additional analysis information.\",\"default\":{}}]},{\"type\":\"record\",\"name\":\"AnalysisResult\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"An AnalysisResult record holds the output of a prediction package such\\nas SIFT on a specific allele.\",\"fields\":[{\"name\":\"analysisId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The ID of the analysis record for this result\"},{\"name\":\"result\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The text-based result for this analysis\"},{\"name\":\"score\",\"type\":[\"null\",\"int\"],\"doc\":\"The numeric score for this analysis\"}]},{\"type\":\"record\",\"name\":\"AlleleLocation\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"An allele location record holds the location of an allele relative to a\\nnon-genomic coordinate system such as a CDS or protein and holds the\\nreference and alternate sequence where appropriate\",\"fields\":[{\"name\":\"start\",\"type\":\"int\",\"doc\":\"Relative start position of the allele in this coordinate system\"},{\"name\":\"end\",\"type\":[\"null\",\"int\"],\"doc\":\"Relative end position of the allele in this coordinate system\",\"default\":null},{\"name\":\"referenceSequence\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Reference sequence in feature (this should be the codon at CDS level)\",\"default\":null},{\"name\":\"alternateSequence\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Alternate sequence in feature (this should be the codon at CDS level)\",\"default\":null}]},{\"type\":\"record\",\"name\":\"VariantAnnotationSet\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"A VariantAnnotationSet record groups VariantAnnotation records. It is derived\\nfrom a VariantSet and holds information describing the software and reference\\ndata used in the annotation.\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The ID of the variant annotation set record\"},{\"name\":\"variantSetId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The ID of the variant set to which this annotation set belongs\"},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The variant annotation set name.\",\"default\":null},{\"name\":\"analysis\",\"type\":\"Analysis\",\"doc\":\"Analysis details. It is essential to supply versions for all software and\\n  reference data used.\"}]},{\"type\":\"record\",\"name\":\"HGVSAnnotation\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"A HGVSAnnotation record holds Human Genome Variation Society descriptions\\nof the sequence change with respect to genomic, transcript and protein\\nsequences. See: http://www.hgvs.org/mutnomen/recs.html.\\nDescriptions should be provided at genomic level. Descriptions at transcript\\nlevel should be provided when the allele lies within a transcript. Descriptions\\nat protein level should be provided when the allele lies within the translated\\nsequence or stop codon.\",\"fields\":[{\"name\":\"genomic\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"transcript\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"protein\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]},{\"type\":\"record\",\"name\":\"TranscriptEffect\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"A transcript effect record is a set of information describing the\\neffect of an allele on a transcript\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The ID of the transcript effect record\"},{\"name\":\"featureId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The id of the transcript feature the annotation is relative to\"},{\"name\":\"a","lternateBases\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Alternate allele - a variant may have more than one alternate allele,\\n  each of which will have distinct annotation.\",\"default\":null},{\"name\":\"effects\",\"type\":{\"type\":\"array\",\"items\":\"OntologyTerm\"},\"doc\":\"Effect of variant on this feature\"},{\"name\":\"hgvsAnnotation\",\"type\":\"HGVSAnnotation\",\"doc\":\"Human Genome Variation Society variant descriptions\"},{\"name\":\"cDNALocation\",\"type\":[\"null\",\"AlleleLocation\"],\"doc\":\"Change relative to cDNA\",\"default\":null},{\"name\":\"CDSLocation\",\"type\":[\"null\",\"AlleleLocation\"],\"default\":null},{\"name\":\"proteinLocation\",\"type\":[\"null\",\"AlleleLocation\"],\"doc\":\"Change relative to protein\",\"default\":null},{\"name\":\"analysisResults\",\"type\":{\"type\":\"array\",\"items\":\"AnalysisResult\"},\"doc\":\"Output from prediction packages such as SIFT\"}]},{\"type\":\"record\",\"name\":\"VariantAnnotation\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"A `VariantAnnotation` record represents the result of comparing a variant\\nto a set of reference data.\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The ID of this VariantAnnotation.\"},{\"name\":\"variantId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The variant ID.\"},{\"name\":\"variantAnnotationSetId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The ID of the variant annotation set this record belongs to.\"},{\"name\":\"createDateTime\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The :ref:`ISO 8601 <metadata_date_time>` time at which this record was created.\",\"default\":null},{\"name\":\"transcriptEffects\",\"type\":{\"type\":\"array\",\"items\":\"TranscriptEffect\"},\"doc\":\"The transcript effect annotation for the alleles of this variant. Each one\\n  represents the effect of a single allele on a single transcript.\",\"default\":[]},{\"name\":\"info\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"avro.java.string\":\"String\"},\"doc\":\"Additional annotation data in key-value pairs.\",\"default\":{}}]},{\"type\":\"record\",\"name\":\"SearchVariantAnnotationsRequest\",\"doc\":\"This request maps to the body of `POST /variantannotations/search` as JSON\",\"fields\":[{\"name\":\"variantAnnotationSetId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Required. The ID of the variant annotation set to search over.\"},{\"name\":\"referenceName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Only return variants with reference alleles on the reference with this\\n  name. One of this field or `referenceId` or `features` is required.\\n  (case-sensitive, exact match)\",\"default\":null},{\"name\":\"referenceId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Only return variants with reference alleles on the reference with this\\n  ID. One of this field or `referenceName` or `features` is required.\",\"default\":null},{\"name\":\"start\",\"type\":\"long\",\"doc\":\"Required if referenceName or referenceId supplied.\\n  The beginning of the window (0-based, inclusive) for which variants with\\n  overlapping reference alleles should be returned.\\n  Genomic positions are non-negative integers less than reference length.\\n  Requests spanning the join of circular genomes are represented as\\n  two requests one on each side of the join (position 0).\"},{\"name\":\"end\",\"type\":\"long\",\"doc\":\"Required if referenceName or referenceId supplied.\\n  The end of the window (0-based, exclusive) for which variants with\\n  overlapping reference alleles should be returned.\"},{\"name\":\"effects\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"org.ga4gh.models.OntologyTerm\"}],\"doc\":\"This filter allows variant, transcript combinations to be extracted by effect\\n  type(s).\\n  Only return variant annotations including any of these effects and only return\\n  transcript effects including any of these effects. Exact matching across all\\n  fields of the Sequence Ontology OntologyTerm is required.\\n  (A transcript effect may have multiple SO effects which will all be reported.)\\n  If null, return all variant annotations.\",\"default\":null},{\"name\":\"pageSize\",\"type\":[\"null\",\"int\"],\"doc\":\"Specifies the maximum number of results to return in a single page.\\n  If unspecified, a system default will be used.\",\"default\":null},{\"name\":\"pageToken\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The continuation token, which is used to page through large result sets.\\n  To get the next page of results, set this parameter to the value of\\n  `nextPageToken` from the previous response.\",\"default\":null}]},{\"type\":\"record\",\"name\":\"SearchVariantAnnotationsResponse\",\"doc\":\"This is the response from `POST /variantannotations/search` expressed as JSON.\",\"fields\":[{\"name\":\"variantAnnotations\",\"type\":{\"type\":\"array\",\"items\":\"org.ga4gh.models.VariantAnnotation\"},\"doc\":\"The list of matching variant annotations.\",\"default\":[]},{\"name\":\"nextPageToken\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The continuation token, which is used to page through large result sets.\\n  Provide this value in a subsequent request to return the next page of\\n  results. This field will be empty if there aren't any additional results.\",\"default\":null}]},{\"type\":\"record\",\"name\":\"SearchVariantAnnotationSetsRequest\",\"doc\":\"This request maps to the body of `POST /variantannotationsets/search` as JSON\",\"fields\":[{\"name\":\"variantSetId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Required. The `VariantSet` to search.\"},{\"name\":\"pageSize\",\"type\":[\"null\",\"int\"],\"doc\":\"Specifies the maximum number of results to return in a single page.\\n  If unspecified, a system default will be used.\",\"default\":null},{\"name\":\"pageToken\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The continuation token, which is used to page through large result sets.\\n  To get the next page of results, set this parameter to the value of\\n  `nextPageToken` from the previous response.\",\"default\":null}]},{\"type\":\"record\",\"name\":\"SearchVariantAnnotationSetsResponse\",\"doc\":\"This is the response from `POST /variantannotationsets/search` expressed\\nas JSON.\",\"fields\":[{\"name\":\"variantAnnotationSets\",\"type\":{\"type\":\"array\",\"items\":\"org.ga4gh.models.VariantAnnotationSet\"},\"doc\":\"The list of matching variant annotation sets.\",\"default\":[]},{\"name\":\"nextPageToken\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The continuation token, which is used to page through large result sets.\\n  Provide this value in a subsequent request to return the next page of\\n  results. This field will be empty if there aren't any additional results.\",\"default\":null}]}],\"messages\":{\"searchVariantAnnotations\":{\"doc\":\"Gets a list of `VariantAnnotations` matching the search criteria.\\n\\n`POST /variantannotations/search` must accept a JSON version of\\n`SearchVariantAnnotationsRequest` as the post body and will return a\\nJSON version of `SearchVariantAnnotationsResponse`.\",\"request\":[{\"name\":\"request\",\"type\":\"SearchVariantAnnotationsRequest\"}],\"response\":\"SearchVariantAnnotationsResponse\",\"errors\":[\"GAException\"]},\"searchVariantAnnotationSets\":{\"doc\":\"Returns a list of available variant annotation sets\\n`POST /variantannotationsets/search` must accept a JSON version of\\n`SearchVariantAnnotationSetsRequest` as the post body and will return a JSON\\nversion of `SearchVariantAnnotationSetsResponse`.\",\"request\":[{\"name\":\"request\",\"type\":\"SearchVariantAnnotationSetsRequest\"}],\"response\":\"SearchVariantAnnotationSetsResponse\",\"errors\":[\"GAException\"]},\"getVariantAnnotationSet\":{\"doc\":\"Gets an `VariantAnnotationSet` by ID.\\n`GET /variantannotationsets/{id}` will return a JSON version of\\n`VariantAnnotationSet`.\",\"request\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"response\":\"org.ga4gh.models.VariantAnnotationSet\",\"errors\":[\"GAException\"]}}}");
  /** Gets a list of `VariantAnnotations` matching the search criteria.

`POST /variantannotations/search` must accept a JSON version of
`SearchVariantAnnotationsRequest` as the post body and will return a
JSON version of `SearchVariantAnnotationsResponse`. */
  org.ga4gh.methods.SearchVariantAnnotationsResponse searchVariantAnnotations(org.ga4gh.methods.SearchVariantAnnotationsRequest request) throws org.apache.avro.AvroRemoteException, org.ga4gh.methods.GAException;
  /** Returns a list of available variant annotation sets
`POST /variantannotationsets/search` must accept a JSON version of
`SearchVariantAnnotationSetsRequest` as the post body and will return a JSON
version of `SearchVariantAnnotationSetsResponse`. */
  org.ga4gh.methods.SearchVariantAnnotationSetsResponse searchVariantAnnotationSets(org.ga4gh.methods.SearchVariantAnnotationSetsRequest request) throws org.apache.avro.AvroRemoteException, org.ga4gh.methods.GAException;
  /** Gets an `VariantAnnotationSet` by ID.
`GET /variantannotationsets/{id}` will return a JSON version of
`VariantAnnotationSet`. */
  org.ga4gh.models.VariantAnnotationSet getVariantAnnotationSet(java.lang.String id) throws org.apache.avro.AvroRemoteException, org.ga4gh.methods.GAException;

  @SuppressWarnings("all")
  public interface Callback extends AlleleAnnotationMethods {
    public static final org.apache.avro.Protocol PROTOCOL = org.ga4gh.methods.AlleleAnnotationMethods.PROTOCOL;
    /** Gets a list of `VariantAnnotations` matching the search criteria.

`POST /variantannotations/search` must accept a JSON version of
`SearchVariantAnnotationsRequest` as the post body and will return a
JSON version of `SearchVariantAnnotationsResponse`. */
    void searchVariantAnnotations(org.ga4gh.methods.SearchVariantAnnotationsRequest request, org.apache.avro.ipc.Callback<org.ga4gh.methods.SearchVariantAnnotationsResponse> callback) throws java.io.IOException;
    /** Returns a list of available variant annotation sets
`POST /variantannotationsets/search` must accept a JSON version of
`SearchVariantAnnotationSetsRequest` as the post body and will return a JSON
version of `SearchVariantAnnotationSetsResponse`. */
    void searchVariantAnnotationSets(org.ga4gh.methods.SearchVariantAnnotationSetsRequest request, org.apache.avro.ipc.Callback<org.ga4gh.methods.SearchVariantAnnotationSetsResponse> callback) throws java.io.IOException;
    /** Gets an `VariantAnnotationSet` by ID.
`GET /variantannotationsets/{id}` will return a JSON version of
`VariantAnnotationSet`. */
    void getVariantAnnotationSet(java.lang.String id, org.apache.avro.ipc.Callback<org.ga4gh.models.VariantAnnotationSet> callback) throws java.io.IOException;
  }
}