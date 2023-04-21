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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.manticoresearch.client.JSON;


/**
 * Query string filter
 */
@JsonPropertyOrder({
  QueryFilter.JSON_PROPERTY_QUERY_STRING
})
@JsonTypeName("queryFilter")
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-21T16:12:17.895346Z[Etc/UTC]")
public class QueryFilter {
  public static final String JSON_PROPERTY_QUERY_STRING = "query_string";
  private String queryString;

  public QueryFilter() { 
  }

  public QueryFilter queryString(String queryString) {
    this.queryString = queryString;
    return this;
  }

   /**
   * Get queryString
   * @return queryString
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUERY_STRING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getQueryString() {
    return queryString;
  }


  @JsonProperty(JSON_PROPERTY_QUERY_STRING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQueryString(String queryString) {
    this.queryString = queryString;
  }


  /**
   * Return true if this queryFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryFilter queryFilter = (QueryFilter) o;
    return Objects.equals(this.queryString, queryFilter.queryString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryFilter {\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
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

