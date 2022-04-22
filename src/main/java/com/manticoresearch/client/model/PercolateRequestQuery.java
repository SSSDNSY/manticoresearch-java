/*
 * Manticore Search Client
 * Copyright (c) 2020-2021, Manticore Software LTD (https://manticoresearch.com)
 *
 * All rights reserved
 */


package com.manticoresearch.client.model;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.manticoresearch.client.JSON;


/**
 * PercolateRequestQuery
 */
@JsonPropertyOrder({
  PercolateRequestQuery.JSON_PROPERTY_PERCOLATE
})
@JsonIgnoreProperties(ignoreUnknown = true)

public class PercolateRequestQuery {
  public static final String JSON_PROPERTY_PERCOLATE = "percolate";
  private Object percolate;

  public PercolateRequestQuery() { 
  }

  public PercolateRequestQuery percolate(Object percolate) {
    this.percolate = percolate;
    return this;
  }

   /**
   * Get percolate
   * @return percolate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PERCOLATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getPercolate() {
    return percolate;
  }


  @JsonProperty(JSON_PROPERTY_PERCOLATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPercolate(Object percolate) {
    this.percolate = percolate;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  @JsonAnySetter
  public PercolateRequestQuery putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this percolateRequest_query object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PercolateRequestQuery percolateRequestQuery = (PercolateRequestQuery) o;
    return Objects.equals(this.percolate, percolateRequestQuery.percolate)&&
        Objects.equals(this.additionalProperties, percolateRequestQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percolate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PercolateRequestQuery {\n");
    sb.append("    percolate: ").append(toIndentedString(percolate)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

