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
import org.thingsboard.client.model.CustomerId;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.ReportTemplateConfig;
import org.thingsboard.client.model.ReportTemplateId;
import org.thingsboard.client.model.ReportTemplateType;
import org.thingsboard.client.model.TbReportFormat;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the Report Template.
 */
@JsonPropertyOrder({
  ReportTemplate.JSON_PROPERTY_ID,
  ReportTemplate.JSON_PROPERTY_CREATED_TIME,
  ReportTemplate.JSON_PROPERTY_TENANT_ID,
  ReportTemplate.JSON_PROPERTY_CUSTOMER_ID,
  ReportTemplate.JSON_PROPERTY_NAME,
  ReportTemplate.JSON_PROPERTY_FORMAT,
  ReportTemplate.JSON_PROPERTY_TYPE,
  ReportTemplate.JSON_PROPERTY_DESCRIPTION,
  ReportTemplate.JSON_PROPERTY_VERSION,
  ReportTemplate.JSON_PROPERTY_CONFIGURATION,
  ReportTemplate.JSON_PROPERTY_OWNER_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class ReportTemplate {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private ReportTemplateId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @javax.annotation.Nullable
  private CustomerId customerId;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_FORMAT = "format";
  @javax.annotation.Nonnull
  private TbReportFormat format;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nonnull
  private ReportTemplateType type;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private String description;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Long version;

  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  @javax.annotation.Nonnull
  private ReportTemplateConfig _configuration;

  public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
  @javax.annotation.Nullable
  private EntityId ownerId;

  public ReportTemplate() { 
  }

  @JsonCreator
  public ReportTemplate(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_ID) CustomerId customerId, 
    @JsonProperty(JSON_PROPERTY_OWNER_ID) EntityId ownerId
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
    this.customerId = customerId;
    this.ownerId = ownerId;
  }

  public ReportTemplate id(@javax.annotation.Nullable ReportTemplateId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the report template Id. Specify this field to update the report. Referencing non-existing report template Id will cause error. Omit this field to create new report template
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ReportTemplateId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable ReportTemplateId id) {
    this.id = id;
  }


  /**
   * Timestamp of the report template creation, in milliseconds
   * @return createdTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  /**
   * JSON object with Tenant Id. Tenant Id of the report template can&#39;t be changed.
   * @return tenantId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }




  /**
   * JSON object with Customer Id
   * @return customerId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomerId getCustomerId() {
    return customerId;
  }




  public ReportTemplate name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Report name
   * @return name
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public ReportTemplate format(@javax.annotation.Nonnull TbReportFormat format) {
    this.format = format;
    return this;
  }

  /**
   * Report format
   * @return format
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FORMAT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TbReportFormat getFormat() {
    return format;
  }


  @JsonProperty(value = JSON_PROPERTY_FORMAT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFormat(@javax.annotation.Nonnull TbReportFormat format) {
    this.format = format;
  }


  public ReportTemplate type(@javax.annotation.Nonnull ReportTemplateType type) {
    this.type = type;
    return this;
  }

  /**
   * Report template type
   * @return type
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ReportTemplateType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@javax.annotation.Nonnull ReportTemplateType type) {
    this.type = type;
  }


  public ReportTemplate description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description
   * @return description
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }


  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public ReportTemplate version(@javax.annotation.Nullable Long version) {
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


  public ReportTemplate _configuration(@javax.annotation.Nonnull ReportTemplateConfig _configuration) {
    this._configuration = _configuration;
    return this;
  }

  /**
   * a JSON value with report template configuration
   * @return _configuration
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ReportTemplateConfig getConfiguration() {
    return _configuration;
  }


  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConfiguration(@javax.annotation.Nonnull ReportTemplateConfig _configuration) {
    this._configuration = _configuration;
  }


  /**
   * JSON object with Customer or Tenant Id
   * @return ownerId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OWNER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getOwnerId() {
    return ownerId;
  }




  /**
   * Return true if this ReportTemplate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportTemplate reportTemplate = (ReportTemplate) o;
    return Objects.equals(this.id, reportTemplate.id) &&
        Objects.equals(this.createdTime, reportTemplate.createdTime) &&
        Objects.equals(this.tenantId, reportTemplate.tenantId) &&
        Objects.equals(this.customerId, reportTemplate.customerId) &&
        Objects.equals(this.name, reportTemplate.name) &&
        Objects.equals(this.format, reportTemplate.format) &&
        Objects.equals(this.type, reportTemplate.type) &&
        Objects.equals(this.description, reportTemplate.description) &&
        Objects.equals(this.version, reportTemplate.version) &&
        Objects.equals(this._configuration, reportTemplate._configuration) &&
        Objects.equals(this.ownerId, reportTemplate.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, customerId, name, format, type, description, version, _configuration, ownerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportTemplate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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

    // add `customerId` to the URL query string
    if (getCustomerId() != null) {
      joiner.add(getCustomerId().toUrlQueryString(prefix + "customerId" + suffix));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `format` to the URL query string
    if (getFormat() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sformat%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFormat()))));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdescription%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDescription()))));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    // add `configuration` to the URL query string
    if (getConfiguration() != null) {
      joiner.add(getConfiguration().toUrlQueryString(prefix + "configuration" + suffix));
    }

    // add `ownerId` to the URL query string
    if (getOwnerId() != null) {
      joiner.add(getOwnerId().toUrlQueryString(prefix + "ownerId" + suffix));
    }

    return joiner.toString();
  }
}

