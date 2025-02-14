/*
 * Manticore Search Client
 * Сlient for Manticore Search. 
 *
 * The version of the OpenAPI document: 3.3.0
 * Contact: info@manticoresearch.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.manticoresearch.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.manticoresearch.client.model.HighlightField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.manticoresearch.client.JSON;


/**
 * Query HIGHLIGHT expression
 */
@JsonPropertyOrder({
  Highlight.JSON_PROPERTY_FIELDNAMES,
  Highlight.JSON_PROPERTY_FIELDS,
  Highlight.JSON_PROPERTY_ENCODER,
  Highlight.JSON_PROPERTY_HIGHLIGHT_QUERY,
  Highlight.JSON_PROPERTY_PRE_TAGS,
  Highlight.JSON_PROPERTY_POST_TAGS,
  Highlight.JSON_PROPERTY_NO_MATCH_SIZE,
  Highlight.JSON_PROPERTY_FRAGMENT_SIZE,
  Highlight.JSON_PROPERTY_NUMBER_OF_FRAGMENTS,
  Highlight.JSON_PROPERTY_LIMIT,
  Highlight.JSON_PROPERTY_LIMIT_WORDS,
  Highlight.JSON_PROPERTY_LIMIT_SNIPPETS,
  Highlight.JSON_PROPERTY_LIMITS_PER_FIELD,
  Highlight.JSON_PROPERTY_USE_BOUNDARIES,
  Highlight.JSON_PROPERTY_FORCE_ALL_WORDS,
  Highlight.JSON_PROPERTY_ALLOW_EMPTY,
  Highlight.JSON_PROPERTY_EMIT_ZONES,
  Highlight.JSON_PROPERTY_FORCE_SNIPPETS,
  Highlight.JSON_PROPERTY_AROUND,
  Highlight.JSON_PROPERTY_START_SNIPPET_ID,
  Highlight.JSON_PROPERTY_HTML_STRIP_MODE,
  Highlight.JSON_PROPERTY_SNIPPET_BOUNDARY
})
@JsonTypeName("highlight")
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-28T11:55:17.809597Z[Etc/UTC]")
public class Highlight {
  public static final String JSON_PROPERTY_FIELDNAMES = "fieldnames";
  private List<String> fieldnames;

  public static final String JSON_PROPERTY_FIELDS = "fields";
  private List<HighlightField> fields;

  /**
   * Gets or Sets encoder
   */
  public enum EncoderEnum {
    DEFAULT("default"),
    
    HTML("html");

    private String value;

    EncoderEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EncoderEnum fromValue(String value) {
      for (EncoderEnum b : EncoderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ENCODER = "encoder";
  private EncoderEnum encoder;

  public static final String JSON_PROPERTY_HIGHLIGHT_QUERY = "highlight_query";
  private JsonNullable<Map<String, Object>> highlightQuery = JsonNullable.<Map<String, Object>>undefined();

  public static final String JSON_PROPERTY_PRE_TAGS = "pre_tags";
  private String preTags = "<strong>";

  public static final String JSON_PROPERTY_POST_TAGS = "post_tags";
  private String postTags = "</strong>";

  /**
   * Gets or Sets noMatchSize
   */
  public enum NoMatchSizeEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    NoMatchSizeEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NoMatchSizeEnum fromValue(Integer value) {
      for (NoMatchSizeEnum b : NoMatchSizeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_NO_MATCH_SIZE = "no_match_size";
  private NoMatchSizeEnum noMatchSize;

  public static final String JSON_PROPERTY_FRAGMENT_SIZE = "fragment_size";
  private Integer fragmentSize = 256;

  public static final String JSON_PROPERTY_NUMBER_OF_FRAGMENTS = "number_of_fragments";
  private Integer numberOfFragments = 0;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit = 256;

  public static final String JSON_PROPERTY_LIMIT_WORDS = "limit_words";
  private Integer limitWords = 0;

  public static final String JSON_PROPERTY_LIMIT_SNIPPETS = "limit_snippets";
  private Integer limitSnippets = 0;

  public static final String JSON_PROPERTY_LIMITS_PER_FIELD = "limits_per_field";
  private Boolean limitsPerField = false;

  public static final String JSON_PROPERTY_USE_BOUNDARIES = "use_boundaries";
  private Boolean useBoundaries = false;

  public static final String JSON_PROPERTY_FORCE_ALL_WORDS = "force_all_words";
  private Boolean forceAllWords = false;

  public static final String JSON_PROPERTY_ALLOW_EMPTY = "allow_empty";
  private Boolean allowEmpty = false;

  public static final String JSON_PROPERTY_EMIT_ZONES = "emit_zones";
  private Boolean emitZones = false;

  public static final String JSON_PROPERTY_FORCE_SNIPPETS = "force_snippets";
  private Boolean forceSnippets = false;

  public static final String JSON_PROPERTY_AROUND = "around";
  private Integer around = 5;

  public static final String JSON_PROPERTY_START_SNIPPET_ID = "start_snippet_id";
  private Integer startSnippetId = 1;

  /**
   * Gets or Sets htmlStripMode
   */
  public enum HtmlStripModeEnum {
    NONE("none"),
    
    STRIP("strip"),
    
    INDEX("index"),
    
    RETAIN("retain");

    private String value;

    HtmlStripModeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static HtmlStripModeEnum fromValue(String value) {
      for (HtmlStripModeEnum b : HtmlStripModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_HTML_STRIP_MODE = "html_strip_mode";
  private HtmlStripModeEnum htmlStripMode;

  /**
   * Gets or Sets snippetBoundary
   */
  public enum SnippetBoundaryEnum {
    SENTENCE("sentence"),
    
    PARAGRAPH("paragraph"),
    
    ZONE("zone");

    private String value;

    SnippetBoundaryEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SnippetBoundaryEnum fromValue(String value) {
      for (SnippetBoundaryEnum b : SnippetBoundaryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SNIPPET_BOUNDARY = "snippet_boundary";
  private SnippetBoundaryEnum snippetBoundary;

  public Highlight() { 
  }

  public Highlight fieldnames(List<String> fieldnames) {
    this.fieldnames = fieldnames;
    return this;
  }

  public Highlight addFieldnamesItem(String fieldnamesItem) {
    if (this.fieldnames == null) {
      this.fieldnames = new ArrayList<>();
    }
    this.fieldnames.add(fieldnamesItem);
    return this;
  }

   /**
   * Get fieldnames
   * @return fieldnames
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELDNAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getFieldnames() {
    return fieldnames;
  }


  @JsonProperty(JSON_PROPERTY_FIELDNAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldnames(List<String> fieldnames) {
    this.fieldnames = fieldnames;
  }


  public Highlight fields(List<HighlightField> fields) {
    this.fields = fields;
    return this;
  }

  public Highlight addFieldsItem(HighlightField fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<HighlightField> getFields() {
    return fields;
  }


  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFields(List<HighlightField> fields) {
    this.fields = fields;
  }


  public Highlight encoder(EncoderEnum encoder) {
    this.encoder = encoder;
    return this;
  }

   /**
   * Get encoder
   * @return encoder
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENCODER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EncoderEnum getEncoder() {
    return encoder;
  }


  @JsonProperty(JSON_PROPERTY_ENCODER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncoder(EncoderEnum encoder) {
    this.encoder = encoder;
  }


  public Highlight highlightQuery(Map<String, Object> highlightQuery) {
    this.highlightQuery = JsonNullable.<Map<String, Object>>of(highlightQuery);
    return this;
  }

  public Highlight putHighlightQueryItem(String key, Object highlightQueryItem) {
    if (this.highlightQuery == null || !this.highlightQuery.isPresent()) {
      this.highlightQuery = JsonNullable.<Map<String, Object>>of(new HashMap<>());
    }
    try {
      this.highlightQuery.get().put(key, highlightQueryItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get highlightQuery
   * @return highlightQuery
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Map<String, Object> getHighlightQuery() {
        return highlightQuery.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HIGHLIGHT_QUERY)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, Object>> getHighlightQuery_JsonNullable() {
    return highlightQuery;
  }
  
  @JsonProperty(JSON_PROPERTY_HIGHLIGHT_QUERY)
  public void setHighlightQuery_JsonNullable(JsonNullable<Map<String, Object>> highlightQuery) {
    this.highlightQuery = highlightQuery;
  }

  public void setHighlightQuery(Map<String, Object> highlightQuery) {
    this.highlightQuery = JsonNullable.<Map<String, Object>>of(highlightQuery);
  }


  public Highlight preTags(String preTags) {
    this.preTags = preTags;
    return this;
  }

   /**
   * Get preTags
   * @return preTags
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRE_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPreTags() {
    return preTags;
  }


  @JsonProperty(JSON_PROPERTY_PRE_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreTags(String preTags) {
    this.preTags = preTags;
  }


  public Highlight postTags(String postTags) {
    this.postTags = postTags;
    return this;
  }

   /**
   * Get postTags
   * @return postTags
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POST_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostTags() {
    return postTags;
  }


  @JsonProperty(JSON_PROPERTY_POST_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostTags(String postTags) {
    this.postTags = postTags;
  }


  public Highlight noMatchSize(NoMatchSizeEnum noMatchSize) {
    this.noMatchSize = noMatchSize;
    return this;
  }

   /**
   * Get noMatchSize
   * @return noMatchSize
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NO_MATCH_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NoMatchSizeEnum getNoMatchSize() {
    return noMatchSize;
  }


  @JsonProperty(JSON_PROPERTY_NO_MATCH_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoMatchSize(NoMatchSizeEnum noMatchSize) {
    this.noMatchSize = noMatchSize;
  }


  public Highlight fragmentSize(Integer fragmentSize) {
    this.fragmentSize = fragmentSize;
    return this;
  }

   /**
   * Get fragmentSize
   * @return fragmentSize
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FRAGMENT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFragmentSize() {
    return fragmentSize;
  }


  @JsonProperty(JSON_PROPERTY_FRAGMENT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFragmentSize(Integer fragmentSize) {
    this.fragmentSize = fragmentSize;
  }


  public Highlight numberOfFragments(Integer numberOfFragments) {
    this.numberOfFragments = numberOfFragments;
    return this;
  }

   /**
   * Get numberOfFragments
   * @return numberOfFragments
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_FRAGMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfFragments() {
    return numberOfFragments;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_FRAGMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfFragments(Integer numberOfFragments) {
    this.numberOfFragments = numberOfFragments;
  }


  public Highlight limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public Highlight limitWords(Integer limitWords) {
    this.limitWords = limitWords;
    return this;
  }

   /**
   * Get limitWords
   * @return limitWords
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT_WORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimitWords() {
    return limitWords;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT_WORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimitWords(Integer limitWords) {
    this.limitWords = limitWords;
  }


  public Highlight limitSnippets(Integer limitSnippets) {
    this.limitSnippets = limitSnippets;
    return this;
  }

   /**
   * Get limitSnippets
   * @return limitSnippets
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT_SNIPPETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimitSnippets() {
    return limitSnippets;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT_SNIPPETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimitSnippets(Integer limitSnippets) {
    this.limitSnippets = limitSnippets;
  }


  public Highlight limitsPerField(Boolean limitsPerField) {
    this.limitsPerField = limitsPerField;
    return this;
  }

   /**
   * Get limitsPerField
   * @return limitsPerField
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMITS_PER_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLimitsPerField() {
    return limitsPerField;
  }


  @JsonProperty(JSON_PROPERTY_LIMITS_PER_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimitsPerField(Boolean limitsPerField) {
    this.limitsPerField = limitsPerField;
  }


  public Highlight useBoundaries(Boolean useBoundaries) {
    this.useBoundaries = useBoundaries;
    return this;
  }

   /**
   * Get useBoundaries
   * @return useBoundaries
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE_BOUNDARIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseBoundaries() {
    return useBoundaries;
  }


  @JsonProperty(JSON_PROPERTY_USE_BOUNDARIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseBoundaries(Boolean useBoundaries) {
    this.useBoundaries = useBoundaries;
  }


  public Highlight forceAllWords(Boolean forceAllWords) {
    this.forceAllWords = forceAllWords;
    return this;
  }

   /**
   * Get forceAllWords
   * @return forceAllWords
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORCE_ALL_WORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getForceAllWords() {
    return forceAllWords;
  }


  @JsonProperty(JSON_PROPERTY_FORCE_ALL_WORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForceAllWords(Boolean forceAllWords) {
    this.forceAllWords = forceAllWords;
  }


  public Highlight allowEmpty(Boolean allowEmpty) {
    this.allowEmpty = allowEmpty;
    return this;
  }

   /**
   * Get allowEmpty
   * @return allowEmpty
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_EMPTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowEmpty() {
    return allowEmpty;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_EMPTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowEmpty(Boolean allowEmpty) {
    this.allowEmpty = allowEmpty;
  }


  public Highlight emitZones(Boolean emitZones) {
    this.emitZones = emitZones;
    return this;
  }

   /**
   * Get emitZones
   * @return emitZones
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMIT_ZONES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEmitZones() {
    return emitZones;
  }


  @JsonProperty(JSON_PROPERTY_EMIT_ZONES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmitZones(Boolean emitZones) {
    this.emitZones = emitZones;
  }


  public Highlight forceSnippets(Boolean forceSnippets) {
    this.forceSnippets = forceSnippets;
    return this;
  }

   /**
   * Get forceSnippets
   * @return forceSnippets
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORCE_SNIPPETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getForceSnippets() {
    return forceSnippets;
  }


  @JsonProperty(JSON_PROPERTY_FORCE_SNIPPETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForceSnippets(Boolean forceSnippets) {
    this.forceSnippets = forceSnippets;
  }


  public Highlight around(Integer around) {
    this.around = around;
    return this;
  }

   /**
   * Get around
   * @return around
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AROUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAround() {
    return around;
  }


  @JsonProperty(JSON_PROPERTY_AROUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAround(Integer around) {
    this.around = around;
  }


  public Highlight startSnippetId(Integer startSnippetId) {
    this.startSnippetId = startSnippetId;
    return this;
  }

   /**
   * Get startSnippetId
   * @return startSnippetId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_SNIPPET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartSnippetId() {
    return startSnippetId;
  }


  @JsonProperty(JSON_PROPERTY_START_SNIPPET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartSnippetId(Integer startSnippetId) {
    this.startSnippetId = startSnippetId;
  }


  public Highlight htmlStripMode(HtmlStripModeEnum htmlStripMode) {
    this.htmlStripMode = htmlStripMode;
    return this;
  }

   /**
   * Get htmlStripMode
   * @return htmlStripMode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTML_STRIP_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HtmlStripModeEnum getHtmlStripMode() {
    return htmlStripMode;
  }


  @JsonProperty(JSON_PROPERTY_HTML_STRIP_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHtmlStripMode(HtmlStripModeEnum htmlStripMode) {
    this.htmlStripMode = htmlStripMode;
  }


  public Highlight snippetBoundary(SnippetBoundaryEnum snippetBoundary) {
    this.snippetBoundary = snippetBoundary;
    return this;
  }

   /**
   * Get snippetBoundary
   * @return snippetBoundary
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNIPPET_BOUNDARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SnippetBoundaryEnum getSnippetBoundary() {
    return snippetBoundary;
  }


  @JsonProperty(JSON_PROPERTY_SNIPPET_BOUNDARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnippetBoundary(SnippetBoundaryEnum snippetBoundary) {
    this.snippetBoundary = snippetBoundary;
  }


  /**
   * Return true if this highlight object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Highlight highlight = (Highlight) o;
    return Objects.equals(this.fieldnames, highlight.fieldnames) &&
        Objects.equals(this.fields, highlight.fields) &&
        Objects.equals(this.encoder, highlight.encoder) &&
        equalsNullable(this.highlightQuery, highlight.highlightQuery) &&
        Objects.equals(this.preTags, highlight.preTags) &&
        Objects.equals(this.postTags, highlight.postTags) &&
        Objects.equals(this.noMatchSize, highlight.noMatchSize) &&
        Objects.equals(this.fragmentSize, highlight.fragmentSize) &&
        Objects.equals(this.numberOfFragments, highlight.numberOfFragments) &&
        Objects.equals(this.limit, highlight.limit) &&
        Objects.equals(this.limitWords, highlight.limitWords) &&
        Objects.equals(this.limitSnippets, highlight.limitSnippets) &&
        Objects.equals(this.limitsPerField, highlight.limitsPerField) &&
        Objects.equals(this.useBoundaries, highlight.useBoundaries) &&
        Objects.equals(this.forceAllWords, highlight.forceAllWords) &&
        Objects.equals(this.allowEmpty, highlight.allowEmpty) &&
        Objects.equals(this.emitZones, highlight.emitZones) &&
        Objects.equals(this.forceSnippets, highlight.forceSnippets) &&
        Objects.equals(this.around, highlight.around) &&
        Objects.equals(this.startSnippetId, highlight.startSnippetId) &&
        Objects.equals(this.htmlStripMode, highlight.htmlStripMode) &&
        Objects.equals(this.snippetBoundary, highlight.snippetBoundary);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldnames, fields, encoder, hashCodeNullable(highlightQuery), preTags, postTags, noMatchSize, fragmentSize, numberOfFragments, limit, limitWords, limitSnippets, limitsPerField, useBoundaries, forceAllWords, allowEmpty, emitZones, forceSnippets, around, startSnippetId, htmlStripMode, snippetBoundary);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Highlight {\n");
    sb.append("    fieldnames: ").append(toIndentedString(fieldnames)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    encoder: ").append(toIndentedString(encoder)).append("\n");
    sb.append("    highlightQuery: ").append(toIndentedString(highlightQuery)).append("\n");
    sb.append("    preTags: ").append(toIndentedString(preTags)).append("\n");
    sb.append("    postTags: ").append(toIndentedString(postTags)).append("\n");
    sb.append("    noMatchSize: ").append(toIndentedString(noMatchSize)).append("\n");
    sb.append("    fragmentSize: ").append(toIndentedString(fragmentSize)).append("\n");
    sb.append("    numberOfFragments: ").append(toIndentedString(numberOfFragments)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    limitWords: ").append(toIndentedString(limitWords)).append("\n");
    sb.append("    limitSnippets: ").append(toIndentedString(limitSnippets)).append("\n");
    sb.append("    limitsPerField: ").append(toIndentedString(limitsPerField)).append("\n");
    sb.append("    useBoundaries: ").append(toIndentedString(useBoundaries)).append("\n");
    sb.append("    forceAllWords: ").append(toIndentedString(forceAllWords)).append("\n");
    sb.append("    allowEmpty: ").append(toIndentedString(allowEmpty)).append("\n");
    sb.append("    emitZones: ").append(toIndentedString(emitZones)).append("\n");
    sb.append("    forceSnippets: ").append(toIndentedString(forceSnippets)).append("\n");
    sb.append("    around: ").append(toIndentedString(around)).append("\n");
    sb.append("    startSnippetId: ").append(toIndentedString(startSnippetId)).append("\n");
    sb.append("    htmlStripMode: ").append(toIndentedString(htmlStripMode)).append("\n");
    sb.append("    snippetBoundary: ").append(toIndentedString(snippetBoundary)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

