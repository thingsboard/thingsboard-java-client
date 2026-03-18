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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.thingsboard.client.model.TenantId;
import org.thingsboard.client.model.WidgetBundleInfo;
import org.thingsboard.client.model.WidgetTypeId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * WidgetTypeInfo
 */
@JsonPropertyOrder({
  WidgetTypeInfo.JSON_PROPERTY_ID,
  WidgetTypeInfo.JSON_PROPERTY_CREATED_TIME,
  WidgetTypeInfo.JSON_PROPERTY_TENANT_ID,
  WidgetTypeInfo.JSON_PROPERTY_FQN,
  WidgetTypeInfo.JSON_PROPERTY_NAME,
  WidgetTypeInfo.JSON_PROPERTY_DEPRECATED,
  WidgetTypeInfo.JSON_PROPERTY_SCADA,
  WidgetTypeInfo.JSON_PROPERTY_VERSION,
  WidgetTypeInfo.JSON_PROPERTY_IMAGE,
  WidgetTypeInfo.JSON_PROPERTY_DESCRIPTION,
  WidgetTypeInfo.JSON_PROPERTY_TAGS,
  WidgetTypeInfo.JSON_PROPERTY_WIDGET_TYPE,
  WidgetTypeInfo.JSON_PROPERTY_BUNDLES
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class WidgetTypeInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private WidgetTypeId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_FQN = "fqn";
  @Nullable
  private String fqn;

  public static final String JSON_PROPERTY_NAME = "name";
  @Nullable
  private String name;

  public static final String JSON_PROPERTY_DEPRECATED = "deprecated";
  @Nullable
  private Boolean deprecated;

  public static final String JSON_PROPERTY_SCADA = "scada";
  @Nullable
  private Boolean scada;

  public static final String JSON_PROPERTY_VERSION = "version";
  @Nullable
  private Long version;

  public static final String JSON_PROPERTY_IMAGE = "image";
  @Nullable
  private String image;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @Nullable
  private String description;

  public static final String JSON_PROPERTY_TAGS = "tags";
  @Nullable
  private List<String> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_WIDGET_TYPE = "widgetType";
  @Nullable
  private String widgetType;

  public static final String JSON_PROPERTY_BUNDLES = "bundles";
  @Nullable
  private List<WidgetBundleInfo> bundles = new ArrayList<>();

  public WidgetTypeInfo() { 
  }

  @JsonCreator
  public WidgetTypeInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId, 
    @JsonProperty(JSON_PROPERTY_FQN) String fqn, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_IMAGE) String image, 
    @JsonProperty(JSON_PROPERTY_DESCRIPTION) String description, 
    @JsonProperty(JSON_PROPERTY_WIDGET_TYPE) String widgetType
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
    this.fqn = fqn;
    this.name = name;
    this.image = image;
    this.description = description;
    this.widgetType = widgetType;
  }

  public WidgetTypeInfo id(@Nullable WidgetTypeId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the Widget Type Id. Specify this field to update the Widget Type. Referencing non-existing Widget Type Id will cause error. Omit this field to create new Widget Type.
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetTypeId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable WidgetTypeId id) {
    this.id = id;
  }


  /**
   * Timestamp of the Widget Type creation, in milliseconds
   * @return createdTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  /**
   * JSON object with Tenant Id.
   * @return tenantId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }




  /**
   * Unique FQN that is used in dashboards as a reference widget type
   * @return fqn
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_FQN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFqn() {
    return fqn;
  }




  /**
   * Widget name used in search and UI
   * @return name
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }




  public WidgetTypeInfo deprecated(@Nullable Boolean deprecated) {
    this.deprecated = deprecated;
    return this;
  }

  /**
   * Whether widget type is deprecated.
   * @return deprecated
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DEPRECATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDeprecated() {
    return deprecated;
  }


  @JsonProperty(value = JSON_PROPERTY_DEPRECATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeprecated(@Nullable Boolean deprecated) {
    this.deprecated = deprecated;
  }


  public WidgetTypeInfo scada(@Nullable Boolean scada) {
    this.scada = scada;
    return this;
  }

  /**
   * Whether widget type is SCADA symbol.
   * @return scada
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SCADA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getScada() {
    return scada;
  }


  @JsonProperty(value = JSON_PROPERTY_SCADA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScada(@Nullable Boolean scada) {
    this.scada = scada;
  }


  public WidgetTypeInfo version(@Nullable Long version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVersion() {
    return version;
  }


  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(@Nullable Long version) {
    this.version = version;
  }


  /**
   * Base64 encoded widget thumbnail
   * @return image
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_IMAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getImage() {
    return image;
  }




  /**
   * Description of the widget type
   * @return description
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }




  public WidgetTypeInfo tags(@Nullable List<String> tags) {
    this.tags = tags;
    return this;
  }

  public WidgetTypeInfo addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags of the widget type
   * @return tags
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TAGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }


  @JsonProperty(value = JSON_PROPERTY_TAGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(@Nullable List<String> tags) {
    this.tags = tags;
  }


  /**
   * Type of the widget (timeseries, latest, control, alarm or static)
   * @return widgetType
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_WIDGET_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWidgetType() {
    return widgetType;
  }




  public WidgetTypeInfo bundles(@Nullable List<WidgetBundleInfo> bundles) {
    this.bundles = bundles;
    return this;
  }

  public WidgetTypeInfo addBundlesItem(WidgetBundleInfo bundlesItem) {
    if (this.bundles == null) {
      this.bundles = new ArrayList<>();
    }
    this.bundles.add(bundlesItem);
    return this;
  }

  /**
   * Bundles
   * @return bundles
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_BUNDLES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<WidgetBundleInfo> getBundles() {
    return bundles;
  }


  @JsonProperty(value = JSON_PROPERTY_BUNDLES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBundles(@Nullable List<WidgetBundleInfo> bundles) {
    this.bundles = bundles;
  }


  /**
   * Return true if this WidgetTypeInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetTypeInfo widgetTypeInfo = (WidgetTypeInfo) o;
    return Objects.equals(this.id, widgetTypeInfo.id) &&
        Objects.equals(this.createdTime, widgetTypeInfo.createdTime) &&
        Objects.equals(this.tenantId, widgetTypeInfo.tenantId) &&
        Objects.equals(this.fqn, widgetTypeInfo.fqn) &&
        Objects.equals(this.name, widgetTypeInfo.name) &&
        Objects.equals(this.deprecated, widgetTypeInfo.deprecated) &&
        Objects.equals(this.scada, widgetTypeInfo.scada) &&
        Objects.equals(this.version, widgetTypeInfo.version) &&
        Objects.equals(this.image, widgetTypeInfo.image) &&
        Objects.equals(this.description, widgetTypeInfo.description) &&
        Objects.equals(this.tags, widgetTypeInfo.tags) &&
        Objects.equals(this.widgetType, widgetTypeInfo.widgetType) &&
        Objects.equals(this.bundles, widgetTypeInfo.bundles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, fqn, name, deprecated, scada, version, image, description, tags, widgetType, bundles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetTypeInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    fqn: ").append(toIndentedString(fqn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
    sb.append("    scada: ").append(toIndentedString(scada)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    widgetType: ").append(toIndentedString(widgetType)).append("\n");
    sb.append("    bundles: ").append(toIndentedString(bundles)).append("\n");
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

    // add `image` to the URL query string
    if (getImage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%simage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getImage()))));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdescription%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDescription()))));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      for (int i = 0; i < getTags().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%stags%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getTags().get(i)))));
      }
    }

    // add `widgetType` to the URL query string
    if (getWidgetType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%swidgetType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getWidgetType()))));
    }

    // add `bundles` to the URL query string
    if (getBundles() != null) {
      for (int i = 0; i < getBundles().size(); i++) {
        if (getBundles().get(i) != null) {
          joiner.add(getBundles().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sbundles%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

