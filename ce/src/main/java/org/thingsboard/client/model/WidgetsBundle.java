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
import org.thingsboard.client.model.WidgetsBundleId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the Widget Bundle.
 */
@JsonPropertyOrder({
  WidgetsBundle.JSON_PROPERTY_ID,
  WidgetsBundle.JSON_PROPERTY_CREATED_TIME,
  WidgetsBundle.JSON_PROPERTY_TENANT_ID,
  WidgetsBundle.JSON_PROPERTY_ALIAS,
  WidgetsBundle.JSON_PROPERTY_TITLE,
  WidgetsBundle.JSON_PROPERTY_IMAGE,
  WidgetsBundle.JSON_PROPERTY_SCADA,
  WidgetsBundle.JSON_PROPERTY_DESCRIPTION,
  WidgetsBundle.JSON_PROPERTY_ORDER,
  WidgetsBundle.JSON_PROPERTY_VERSION,
  WidgetsBundle.JSON_PROPERTY_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class WidgetsBundle {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private WidgetsBundleId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_ALIAS = "alias";
  @javax.annotation.Nullable
  private String alias;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private String title;

  public static final String JSON_PROPERTY_IMAGE = "image";
  @javax.annotation.Nullable
  private String image;

  public static final String JSON_PROPERTY_SCADA = "scada";
  @javax.annotation.Nullable
  private Boolean scada;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private String description;

  public static final String JSON_PROPERTY_ORDER = "order";
  @javax.annotation.Nullable
  private Integer order;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Long version;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public WidgetsBundle() { 
  }

  @JsonCreator
  public WidgetsBundle(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId, 
    @JsonProperty(JSON_PROPERTY_ALIAS) String alias, 
    @JsonProperty(JSON_PROPERTY_TITLE) String title, 
    @JsonProperty(JSON_PROPERTY_IMAGE) String image, 
    @JsonProperty(JSON_PROPERTY_SCADA) Boolean scada, 
    @JsonProperty(JSON_PROPERTY_DESCRIPTION) String description, 
    @JsonProperty(JSON_PROPERTY_ORDER) Integer order, 
    @JsonProperty(JSON_PROPERTY_NAME) String name
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
    this.alias = alias;
    this.title = title;
    this.image = image;
    this.scada = scada;
    this.description = description;
    this.order = order;
    this.name = name;
  }

  public WidgetsBundle id(@javax.annotation.Nullable WidgetsBundleId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the Widget Bundle Id. Specify this field to update the Widget Bundle. Referencing non-existing Widget Bundle Id will cause error. Omit this field to create new Widget Bundle.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetsBundleId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable WidgetsBundleId id) {
    this.id = id;
  }


  /**
   * Timestamp of the Widget Bundle creation, in milliseconds
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
   * Unique alias that is used in widget types as a reference widget bundle
   * @return alias
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ALIAS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAlias() {
    return alias;
  }




  /**
   * Title used in search and UI
   * @return title
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }




  /**
   * Relative or external image URL. Replaced with image data URL (Base64) in case of relative URL and &#39;inlineImages&#39; option enabled.
   * @return image
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_IMAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getImage() {
    return image;
  }




  /**
   * Whether widgets bundle contains SCADA symbol widget types.
   * @return scada
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SCADA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getScada() {
    return scada;
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




  /**
   * Order
   * @return order
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ORDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getOrder() {
    return order;
  }




  public WidgetsBundle version(@javax.annotation.Nullable Long version) {
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
   * Same as title of the Widget Bundle. Read-only field. Update the &#39;title&#39; to change the &#39;name&#39; of the Widget Bundle.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }




  /**
   * Return true if this WidgetsBundle object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetsBundle widgetsBundle = (WidgetsBundle) o;
    return Objects.equals(this.id, widgetsBundle.id) &&
        Objects.equals(this.createdTime, widgetsBundle.createdTime) &&
        Objects.equals(this.tenantId, widgetsBundle.tenantId) &&
        Objects.equals(this.alias, widgetsBundle.alias) &&
        Objects.equals(this.title, widgetsBundle.title) &&
        Objects.equals(this.image, widgetsBundle.image) &&
        Objects.equals(this.scada, widgetsBundle.scada) &&
        Objects.equals(this.description, widgetsBundle.description) &&
        Objects.equals(this.order, widgetsBundle.order) &&
        Objects.equals(this.version, widgetsBundle.version) &&
        Objects.equals(this.name, widgetsBundle.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, alias, title, image, scada, description, order, version, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetsBundle {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    scada: ").append(toIndentedString(scada)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

    // add `alias` to the URL query string
    if (getAlias() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%salias%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAlias()))));
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTitle()))));
    }

    // add `image` to the URL query string
    if (getImage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%simage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getImage()))));
    }

    // add `scada` to the URL query string
    if (getScada() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sscada%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getScada()))));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdescription%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDescription()))));
    }

    // add `order` to the URL query string
    if (getOrder() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sorder%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOrder()))));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    return joiner.toString();
  }
}

