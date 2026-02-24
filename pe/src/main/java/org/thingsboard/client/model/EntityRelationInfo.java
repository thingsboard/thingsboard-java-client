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
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.RelationTypeGroup;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * EntityRelationInfo
 */
@JsonPropertyOrder({
  EntityRelationInfo.JSON_PROPERTY_FROM,
  EntityRelationInfo.JSON_PROPERTY_TO,
  EntityRelationInfo.JSON_PROPERTY_TYPE,
  EntityRelationInfo.JSON_PROPERTY_TYPE_GROUP,
  EntityRelationInfo.JSON_PROPERTY_VERSION,
  EntityRelationInfo.JSON_PROPERTY_FROM_NAME,
  EntityRelationInfo.JSON_PROPERTY_TO_NAME,
  EntityRelationInfo.JSON_PROPERTY_ADDITIONAL_INFO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class EntityRelationInfo {
  public static final String JSON_PROPERTY_FROM = "from";
  @javax.annotation.Nonnull
  private EntityId from;

  public static final String JSON_PROPERTY_TO = "to";
  @javax.annotation.Nonnull
  private EntityId to;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nonnull
  private String type;

  public static final String JSON_PROPERTY_TYPE_GROUP = "typeGroup";
  @javax.annotation.Nonnull
  private RelationTypeGroup typeGroup;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Long version;

  public static final String JSON_PROPERTY_FROM_NAME = "fromName";
  @javax.annotation.Nullable
  private String fromName;

  public static final String JSON_PROPERTY_TO_NAME = "toName";
  @javax.annotation.Nullable
  private String toName;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalInfo;

  public EntityRelationInfo() { 
  }

  @JsonCreator
  public EntityRelationInfo(
    @JsonProperty(JSON_PROPERTY_FROM_NAME) String fromName, 
    @JsonProperty(JSON_PROPERTY_TO_NAME) String toName
  ) {
  this();
    this.fromName = fromName;
    this.toName = toName;
  }

  public EntityRelationInfo from(@javax.annotation.Nonnull EntityId from) {
    this.from = from;
    return this;
  }

  /**
   * JSON object with [from] Entity Id.
   * @return from
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FROM, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EntityId getFrom() {
    return from;
  }


  @JsonProperty(value = JSON_PROPERTY_FROM, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFrom(@javax.annotation.Nonnull EntityId from) {
    this.from = from;
  }


  public EntityRelationInfo to(@javax.annotation.Nonnull EntityId to) {
    this.to = to;
    return this;
  }

  /**
   * JSON object with [to] Entity Id.
   * @return to
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TO, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EntityId getTo() {
    return to;
  }


  @JsonProperty(value = JSON_PROPERTY_TO, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTo(@javax.annotation.Nonnull EntityId to) {
    this.to = to;
  }


  public EntityRelationInfo type(@javax.annotation.Nonnull String type) {
    this.type = type;
    return this;
  }

  /**
   * String value of relation type.
   * @return type
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@javax.annotation.Nonnull String type) {
    this.type = type;
  }


  public EntityRelationInfo typeGroup(@javax.annotation.Nonnull RelationTypeGroup typeGroup) {
    this.typeGroup = typeGroup;
    return this;
  }

  /**
   * Represents the type group of the relation.
   * @return typeGroup
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TYPE_GROUP, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RelationTypeGroup getTypeGroup() {
    return typeGroup;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE_GROUP, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTypeGroup(@javax.annotation.Nonnull RelationTypeGroup typeGroup) {
    this.typeGroup = typeGroup;
  }


  public EntityRelationInfo version(@javax.annotation.Nullable Long version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVersion() {
    return version;
  }


  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(@javax.annotation.Nullable Long version) {
    this.version = version;
  }


  /**
   * Name of the entity for [from] direction.
   * @return fromName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FROM_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFromName() {
    return fromName;
  }




  /**
   * Name of the entity for [to] direction.
   * @return toName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TO_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getToName() {
    return toName;
  }




  public EntityRelationInfo additionalInfo(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Additional parameters of the relation
   * @return additionalInfo
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getAdditionalInfo() {
    return additionalInfo;
  }


  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalInfo(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  /**
   * Return true if this EntityRelationInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityRelationInfo entityRelationInfo = (EntityRelationInfo) o;
    return Objects.equals(this.from, entityRelationInfo.from) &&
        Objects.equals(this.to, entityRelationInfo.to) &&
        Objects.equals(this.type, entityRelationInfo.type) &&
        Objects.equals(this.typeGroup, entityRelationInfo.typeGroup) &&
        Objects.equals(this.version, entityRelationInfo.version) &&
        Objects.equals(this.fromName, entityRelationInfo.fromName) &&
        Objects.equals(this.toName, entityRelationInfo.toName) &&
        Objects.equals(this.additionalInfo, entityRelationInfo.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, type, typeGroup, version, fromName, toName, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityRelationInfo {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeGroup: ").append(toIndentedString(typeGroup)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    fromName: ").append(toIndentedString(fromName)).append("\n");
    sb.append("    toName: ").append(toIndentedString(toName)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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

    // add `from` to the URL query string
    if (getFrom() != null) {
      joiner.add(getFrom().toUrlQueryString(prefix + "from" + suffix));
    }

    // add `to` to the URL query string
    if (getTo() != null) {
      joiner.add(getTo().toUrlQueryString(prefix + "to" + suffix));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `typeGroup` to the URL query string
    if (getTypeGroup() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stypeGroup%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTypeGroup()))));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    // add `fromName` to the URL query string
    if (getFromName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfromName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFromName()))));
    }

    // add `toName` to the URL query string
    if (getToName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stoName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getToName()))));
    }

    // add `additionalInfo` to the URL query string
    if (getAdditionalInfo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditionalInfo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalInfo()))));
    }

    return joiner.toString();
  }
}

