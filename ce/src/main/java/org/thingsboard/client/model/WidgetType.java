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
import org.thingsboard.client.model.TenantId;
import org.thingsboard.client.model.WidgetTypeId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * WidgetType
 */
@JsonPropertyOrder({
  WidgetType.JSON_PROPERTY_ID,
  WidgetType.JSON_PROPERTY_CREATED_TIME,
  WidgetType.JSON_PROPERTY_TENANT_ID,
  WidgetType.JSON_PROPERTY_FQN,
  WidgetType.JSON_PROPERTY_NAME,
  WidgetType.JSON_PROPERTY_DEPRECATED,
  WidgetType.JSON_PROPERTY_SCADA,
  WidgetType.JSON_PROPERTY_VERSION,
  WidgetType.JSON_PROPERTY_DESCRIPTOR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class WidgetType {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private WidgetTypeId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_FQN = "fqn";
  @javax.annotation.Nullable
  private String fqn;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_DEPRECATED = "deprecated";
  @javax.annotation.Nullable
  private Boolean deprecated;

  public static final String JSON_PROPERTY_SCADA = "scada";
  @javax.annotation.Nullable
  private Boolean scada;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Long version;

  public static final String JSON_PROPERTY_DESCRIPTOR = "descriptor";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode descriptor;

  public WidgetType() { 
  }

  @JsonCreator
  public WidgetType(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId, 
    @JsonProperty(JSON_PROPERTY_FQN) String fqn, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_DESCRIPTOR) com.fasterxml.jackson.databind.JsonNode descriptor
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
    this.fqn = fqn;
    this.name = name;
    this.descriptor = descriptor;
  }

  public WidgetType id(@javax.annotation.Nullable WidgetTypeId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the Widget Type Id. Specify this field to update the Widget Type. Referencing non-existing Widget Type Id will cause error. Omit this field to create new Widget Type.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetTypeId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable WidgetTypeId id) {
    this.id = id;
  }


  /**
   * Timestamp of the Widget Type creation, in milliseconds
   * @return createdTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  /**
   * JSON object with Tenant Id.
   * @return tenantId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }




  /**
   * Unique FQN that is used in dashboards as a reference widget type
   * @return fqn
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FQN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFqn() {
    return fqn;
  }




  /**
   * Widget name used in search and UI
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }




  public WidgetType deprecated(@javax.annotation.Nullable Boolean deprecated) {
    this.deprecated = deprecated;
    return this;
  }

  /**
   * Whether widget type is deprecated.
   * @return deprecated
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEPRECATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDeprecated() {
    return deprecated;
  }


  @JsonProperty(value = JSON_PROPERTY_DEPRECATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeprecated(@javax.annotation.Nullable Boolean deprecated) {
    this.deprecated = deprecated;
  }


  public WidgetType scada(@javax.annotation.Nullable Boolean scada) {
    this.scada = scada;
    return this;
  }

  /**
   * Whether widget type is SCADA symbol.
   * @return scada
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SCADA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getScada() {
    return scada;
  }


  @JsonProperty(value = JSON_PROPERTY_SCADA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScada(@javax.annotation.Nullable Boolean scada) {
    this.scada = scada;
  }


  public WidgetType version(@javax.annotation.Nullable Long version) {
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
   * Complex JSON object that describes the widget type
   * @return descriptor
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DESCRIPTOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getDescriptor() {
    return descriptor;
  }




  /**
   * Return true if this WidgetType object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetType widgetType = (WidgetType) o;
    return Objects.equals(this.id, widgetType.id) &&
        Objects.equals(this.createdTime, widgetType.createdTime) &&
        Objects.equals(this.tenantId, widgetType.tenantId) &&
        Objects.equals(this.fqn, widgetType.fqn) &&
        Objects.equals(this.name, widgetType.name) &&
        Objects.equals(this.deprecated, widgetType.deprecated) &&
        Objects.equals(this.scada, widgetType.scada) &&
        Objects.equals(this.version, widgetType.version) &&
        Objects.equals(this.descriptor, widgetType.descriptor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, fqn, name, deprecated, scada, version, descriptor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetType {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    fqn: ").append(toIndentedString(fqn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
    sb.append("    scada: ").append(toIndentedString(scada)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(getId().toUrlQueryString(prefix + "id" + suffix));
    }

    // add `createdTime` to the URL query string
    if (getCreatedTime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%screatedTime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCreatedTime()))));
    }

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      joiner.add(getTenantId().toUrlQueryString(prefix + "tenantId" + suffix));
    }

    // add `fqn` to the URL query string
    if (getFqn() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfqn%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFqn()))));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `deprecated` to the URL query string
    if (getDeprecated() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdeprecated%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDeprecated()))));
    }

    // add `scada` to the URL query string
    if (getScada() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sscada%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getScada()))));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    // add `descriptor` to the URL query string
    if (getDescriptor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdescriptor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDescriptor()))));
    }

    return joiner.toString();
  }
}

