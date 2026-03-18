/**
 * Copyright © 2026-2026 ThingsBoard, Inc.
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
package org.thingsboard.client.model;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.thingsboard.client.model.CfArgumentDynamicSourceConfiguration;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.EntitySearchDirection;
import org.thingsboard.client.model.GeofencingReportStrategy;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * ZoneGroupConfiguration
 */
@JsonPropertyOrder({
  ZoneGroupConfiguration.JSON_PROPERTY_REF_ENTITY_ID,
  ZoneGroupConfiguration.JSON_PROPERTY_REF_DYNAMIC_SOURCE_CONFIGURATION,
  ZoneGroupConfiguration.JSON_PROPERTY_PERIMETER_KEY_NAME,
  ZoneGroupConfiguration.JSON_PROPERTY_REPORT_STRATEGY,
  ZoneGroupConfiguration.JSON_PROPERTY_CREATE_RELATIONS_WITH_MATCHED_ZONES,
  ZoneGroupConfiguration.JSON_PROPERTY_RELATION_TYPE,
  ZoneGroupConfiguration.JSON_PROPERTY_DIRECTION
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class ZoneGroupConfiguration {
  public static final String JSON_PROPERTY_REF_ENTITY_ID = "refEntityId";
  @Nullable
  private EntityId refEntityId;

  public static final String JSON_PROPERTY_REF_DYNAMIC_SOURCE_CONFIGURATION = "refDynamicSourceConfiguration";
  @Nullable
  private CfArgumentDynamicSourceConfiguration refDynamicSourceConfiguration;

  public static final String JSON_PROPERTY_PERIMETER_KEY_NAME = "perimeterKeyName";
  @Nonnull
  private String perimeterKeyName;

  public static final String JSON_PROPERTY_REPORT_STRATEGY = "reportStrategy";
  @Nonnull
  private GeofencingReportStrategy reportStrategy;

  public static final String JSON_PROPERTY_CREATE_RELATIONS_WITH_MATCHED_ZONES = "createRelationsWithMatchedZones";
  @Nullable
  private Boolean createRelationsWithMatchedZones;

  public static final String JSON_PROPERTY_RELATION_TYPE = "relationType";
  @Nullable
  private String relationType;

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  @Nullable
  private EntitySearchDirection direction;

  public ZoneGroupConfiguration() { 
  }

  public ZoneGroupConfiguration refEntityId(@Nullable EntityId refEntityId) {
    this.refEntityId = refEntityId;
    return this;
  }

  /**
   * Get refEntityId
   * @return refEntityId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_REF_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getRefEntityId() {
    return refEntityId;
  }


  @JsonProperty(value = JSON_PROPERTY_REF_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefEntityId(@Nullable EntityId refEntityId) {
    this.refEntityId = refEntityId;
  }


  public ZoneGroupConfiguration refDynamicSourceConfiguration(@Nullable CfArgumentDynamicSourceConfiguration refDynamicSourceConfiguration) {
    this.refDynamicSourceConfiguration = refDynamicSourceConfiguration;
    return this;
  }

  /**
   * Get refDynamicSourceConfiguration
   * @return refDynamicSourceConfiguration
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_REF_DYNAMIC_SOURCE_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CfArgumentDynamicSourceConfiguration getRefDynamicSourceConfiguration() {
    return refDynamicSourceConfiguration;
  }


  @JsonProperty(value = JSON_PROPERTY_REF_DYNAMIC_SOURCE_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefDynamicSourceConfiguration(@Nullable CfArgumentDynamicSourceConfiguration refDynamicSourceConfiguration) {
    this.refDynamicSourceConfiguration = refDynamicSourceConfiguration;
  }


  public ZoneGroupConfiguration perimeterKeyName(@Nonnull String perimeterKeyName) {
    this.perimeterKeyName = perimeterKeyName;
    return this;
  }

  /**
   * Get perimeterKeyName
   * @return perimeterKeyName
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_PERIMETER_KEY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPerimeterKeyName() {
    return perimeterKeyName;
  }


  @JsonProperty(value = JSON_PROPERTY_PERIMETER_KEY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPerimeterKeyName(@Nonnull String perimeterKeyName) {
    this.perimeterKeyName = perimeterKeyName;
  }


  public ZoneGroupConfiguration reportStrategy(@Nonnull GeofencingReportStrategy reportStrategy) {
    this.reportStrategy = reportStrategy;
    return this;
  }

  /**
   * Get reportStrategy
   * @return reportStrategy
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_REPORT_STRATEGY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GeofencingReportStrategy getReportStrategy() {
    return reportStrategy;
  }


  @JsonProperty(value = JSON_PROPERTY_REPORT_STRATEGY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReportStrategy(@Nonnull GeofencingReportStrategy reportStrategy) {
    this.reportStrategy = reportStrategy;
  }


  public ZoneGroupConfiguration createRelationsWithMatchedZones(@Nullable Boolean createRelationsWithMatchedZones) {
    this.createRelationsWithMatchedZones = createRelationsWithMatchedZones;
    return this;
  }

  /**
   * Get createRelationsWithMatchedZones
   * @return createRelationsWithMatchedZones
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATE_RELATIONS_WITH_MATCHED_ZONES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCreateRelationsWithMatchedZones() {
    return createRelationsWithMatchedZones;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATE_RELATIONS_WITH_MATCHED_ZONES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateRelationsWithMatchedZones(@Nullable Boolean createRelationsWithMatchedZones) {
    this.createRelationsWithMatchedZones = createRelationsWithMatchedZones;
  }


  public ZoneGroupConfiguration relationType(@Nullable String relationType) {
    this.relationType = relationType;
    return this;
  }

  /**
   * Get relationType
   * @return relationType
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_RELATION_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRelationType() {
    return relationType;
  }


  @JsonProperty(value = JSON_PROPERTY_RELATION_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelationType(@Nullable String relationType) {
    this.relationType = relationType;
  }


  public ZoneGroupConfiguration direction(@Nullable EntitySearchDirection direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Get direction
   * @return direction
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DIRECTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntitySearchDirection getDirection() {
    return direction;
  }


  @JsonProperty(value = JSON_PROPERTY_DIRECTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirection(@Nullable EntitySearchDirection direction) {
    this.direction = direction;
  }


  /**
   * Return true if this ZoneGroupConfiguration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZoneGroupConfiguration zoneGroupConfiguration = (ZoneGroupConfiguration) o;
    return Objects.equals(this.refEntityId, zoneGroupConfiguration.refEntityId) &&
        Objects.equals(this.refDynamicSourceConfiguration, zoneGroupConfiguration.refDynamicSourceConfiguration) &&
        Objects.equals(this.perimeterKeyName, zoneGroupConfiguration.perimeterKeyName) &&
        Objects.equals(this.reportStrategy, zoneGroupConfiguration.reportStrategy) &&
        Objects.equals(this.createRelationsWithMatchedZones, zoneGroupConfiguration.createRelationsWithMatchedZones) &&
        Objects.equals(this.relationType, zoneGroupConfiguration.relationType) &&
        Objects.equals(this.direction, zoneGroupConfiguration.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refEntityId, refDynamicSourceConfiguration, perimeterKeyName, reportStrategy, createRelationsWithMatchedZones, relationType, direction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZoneGroupConfiguration {\n");
    sb.append("    refEntityId: ").append(toIndentedString(refEntityId)).append("\n");
    sb.append("    refDynamicSourceConfiguration: ").append(toIndentedString(refDynamicSourceConfiguration)).append("\n");
    sb.append("    perimeterKeyName: ").append(toIndentedString(perimeterKeyName)).append("\n");
    sb.append("    reportStrategy: ").append(toIndentedString(reportStrategy)).append("\n");
    sb.append("    createRelationsWithMatchedZones: ").append(toIndentedString(createRelationsWithMatchedZones)).append("\n");
    sb.append("    relationType: ").append(toIndentedString(relationType)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `refEntityId` to the URL query string
    if (getRefEntityId() != null) {
      joiner.add(getRefEntityId().toUrlQueryString(prefix + "refEntityId" + suffix));
    }

    // add `refDynamicSourceConfiguration` to the URL query string
    if (getRefDynamicSourceConfiguration() != null) {
      joiner.add(getRefDynamicSourceConfiguration().toUrlQueryString(prefix + "refDynamicSourceConfiguration" + suffix));
    }

    // add `perimeterKeyName` to the URL query string
    if (getPerimeterKeyName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sperimeterKeyName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPerimeterKeyName()))));
    }

    // add `reportStrategy` to the URL query string
    if (getReportStrategy() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sreportStrategy%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getReportStrategy()))));
    }

    // add `createRelationsWithMatchedZones` to the URL query string
    if (getCreateRelationsWithMatchedZones() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%screateRelationsWithMatchedZones%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCreateRelationsWithMatchedZones()))));
    }

    // add `relationType` to the URL query string
    if (getRelationType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srelationType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRelationType()))));
    }

    // add `direction` to the URL query string
    if (getDirection() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdirection%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDirection()))));
    }

    return joiner.toString();
  }
}

