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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.manticoresearch.client.JSON;


/**
 * Range attribute filter
 */
@JsonPropertyOrder({
  RangeFilter.JSON_PROPERTY_FIELD,
  RangeFilter.JSON_PROPERTY_LTE,
  RangeFilter.JSON_PROPERTY_GTE,
  RangeFilter.JSON_PROPERTY_LT,
  RangeFilter.JSON_PROPERTY_GT
})
@JsonTypeName("rangeFilter")
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-21T16:12:17.895346Z[Etc/UTC]")
public class RangeFilter {
  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_LTE = "lte";
  private BigDecimal lte;

  public static final String JSON_PROPERTY_GTE = "gte";
  private BigDecimal gte;

  public static final String JSON_PROPERTY_LT = "lt";
  private BigDecimal lt;

  public static final String JSON_PROPERTY_GT = "gt";
  private BigDecimal gt;

  public RangeFilter() { 
  }

  public RangeFilter field(String field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getField() {
    return field;
  }


  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setField(String field) {
    this.field = field;
  }


  public RangeFilter lte(BigDecimal lte) {
    this.lte = lte;
    return this;
  }

   /**
   * Get lte
   * @return lte
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLte() {
    return lte;
  }


  @JsonProperty(JSON_PROPERTY_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLte(BigDecimal lte) {
    this.lte = lte;
  }


  public RangeFilter gte(BigDecimal gte) {
    this.gte = gte;
    return this;
  }

   /**
   * Get gte
   * @return gte
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getGte() {
    return gte;
  }


  @JsonProperty(JSON_PROPERTY_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGte(BigDecimal gte) {
    this.gte = gte;
  }


  public RangeFilter lt(BigDecimal lt) {
    this.lt = lt;
    return this;
  }

   /**
   * Get lt
   * @return lt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLt() {
    return lt;
  }


  @JsonProperty(JSON_PROPERTY_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLt(BigDecimal lt) {
    this.lt = lt;
  }


  public RangeFilter gt(BigDecimal gt) {
    this.gt = gt;
    return this;
  }

   /**
   * Get gt
   * @return gt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getGt() {
    return gt;
  }


  @JsonProperty(JSON_PROPERTY_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGt(BigDecimal gt) {
    this.gt = gt;
  }


  /**
   * Return true if this rangeFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RangeFilter rangeFilter = (RangeFilter) o;
    return Objects.equals(this.field, rangeFilter.field) &&
        Objects.equals(this.lte, rangeFilter.lte) &&
        Objects.equals(this.gte, rangeFilter.gte) &&
        Objects.equals(this.lt, rangeFilter.lt) &&
        Objects.equals(this.gt, rangeFilter.gt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, lte, gte, lt, gt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RangeFilter {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    lte: ").append(toIndentedString(lte)).append("\n");
    sb.append("    gte: ").append(toIndentedString(gte)).append("\n");
    sb.append("    lt: ").append(toIndentedString(lt)).append("\n");
    sb.append("    gt: ").append(toIndentedString(gt)).append("\n");
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

