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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.manticoresearch.client.JSON;


/**
 * Query fields to be included/excluded to/from response
 */
@JsonPropertyOrder({
  SourceByRules.JSON_PROPERTY_INCLUDES,
  SourceByRules.JSON_PROPERTY_EXCLUDES
})
@JsonTypeName("sourceByRules")
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-21T16:12:17.895346Z[Etc/UTC]")
public class SourceByRules {
  public static final String JSON_PROPERTY_INCLUDES = "includes";
  private List<String> includes = null;

  public static final String JSON_PROPERTY_EXCLUDES = "excludes";
  private List<String> excludes = new ArrayList<>(Arrays.asList(""));

  public SourceByRules() { 
  }

  public SourceByRules includes(List<String> includes) {
    this.includes = includes;
    return this;
  }

  public SourceByRules addIncludesItem(String includesItem) {
    if (this.includes == null) {
      this.includes = null;
    }
    this.includes.add(includesItem);
    return this;
  }

   /**
   * Get includes
   * @return includes
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INCLUDES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getIncludes() {
    return includes;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIncludes(List<String> includes) {
    this.includes = includes;
  }


  public SourceByRules excludes(List<String> excludes) {
    this.excludes = excludes;
    return this;
  }

  public SourceByRules addExcludesItem(String excludesItem) {
    if (this.excludes == null) {
      this.excludes = new ArrayList<>(Arrays.asList(""));
    }
    this.excludes.add(excludesItem);
    return this;
  }

   /**
   * Get excludes
   * @return excludes
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXCLUDES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getExcludes() {
    return excludes;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUDES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExcludes(List<String> excludes) {
    this.excludes = excludes;
  }


  /**
   * Return true if this sourceByRules object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceByRules sourceByRules = (SourceByRules) o;
    return Objects.equals(this.includes, sourceByRules.includes) &&
        Objects.equals(this.excludes, sourceByRules.excludes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includes, excludes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceByRules {\n");
    sb.append("    includes: ").append(toIndentedString(includes)).append("\n");
    sb.append("    excludes: ").append(toIndentedString(excludes)).append("\n");
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

