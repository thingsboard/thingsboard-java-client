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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.thingsboard.client.model.ResourceExportData;
import org.thingsboard.client.model.TenantId;
import org.thingsboard.client.model.WidgetTypeId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the Widget Type Details.
 */
@JsonPropertyOrder({
  WidgetTypeDetails.JSON_PROPERTY_ID,
  WidgetTypeDetails.JSON_PROPERTY_CREATED_TIME,
  WidgetTypeDetails.JSON_PROPERTY_TENANT_ID,
  WidgetTypeDetails.JSON_PROPERTY_FQN,
  WidgetTypeDetails.JSON_PROPERTY_NAME,
  WidgetTypeDetails.JSON_PROPERTY_DEPRECATED,
  WidgetTypeDetails.JSON_PROPERTY_SCADA,
  WidgetTypeDetails.JSON_PROPERTY_VERSION,
  WidgetTypeDetails.JSON_PROPERTY_DESCRIPTOR,
  WidgetTypeDetails.JSON_PROPERTY_IMAGE,
  WidgetTypeDetails.JSON_PROPERTY_DESCRIPTION,
  WidgetTypeDetails.JSON_PROPERTY_TAGS,
  WidgetTypeDetails.JSON_PROPERTY_RESOURCES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class WidgetTypeDetails {
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

  public static final String JSON_PROPERTY_IMAGE = "image";
  @javax.annotation.Nullable
  private String image;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private String description;

  public static final String JSON_PROPERTY_TAGS = "tags";
  @javax.annotation.Nullable
  private List<String> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_RESOURCES = "resources";
  @javax.annotation.Nullable
  private List<ResourceExportData> resources = new ArrayList<>();

  public WidgetTypeDetails() { 
  }

  @JsonCreator
  public WidgetTypeDetails(
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

  public WidgetTypeDetails id(@javax.annotation.Nullable WidgetTypeId id) {
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




  public WidgetTypeDetails deprecated(@javax.annotation.Nullable Boolean deprecated) {
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


  public WidgetTypeDetails scada(@javax.annotation.Nullable Boolean scada) {
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


  public WidgetTypeDetails version(@javax.annotation.Nullable Long version) {
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




  public WidgetTypeDetails image(@javax.annotation.Nullable String image) {
    this.image = image;
    return this;
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


  @JsonProperty(value = JSON_PROPERTY_IMAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImage(@javax.annotation.Nullable String image) {
    this.image = image;
  }


  public WidgetTypeDetails description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the widget
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


  public WidgetTypeDetails tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
    return this;
  }

  public WidgetTypeDetails addTagsItem(String tagsItem) {
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
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TAGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }


  @JsonProperty(value = JSON_PROPERTY_TAGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
  }


  public WidgetTypeDetails resources(@javax.annotation.Nullable List<ResourceExportData> resources) {
    this.resources = resources;
    return this;
  }

  public WidgetTypeDetails addResourcesItem(ResourceExportData resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

  /**
   * Get resources
   * @return resources
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RESOURCES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ResourceExportData> getResources() {
    return resources;
  }


  @JsonProperty(value = JSON_PROPERTY_RESOURCES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResources(@javax.annotation.Nullable List<ResourceExportData> resources) {
    this.resources = resources;
  }


  /**
   * Return true if this WidgetTypeDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetTypeDetails widgetTypeDetails = (WidgetTypeDetails) o;
    return Objects.equals(this.id, widgetTypeDetails.id) &&
        Objects.equals(this.createdTime, widgetTypeDetails.createdTime) &&
        Objects.equals(this.tenantId, widgetTypeDetails.tenantId) &&
        Objects.equals(this.fqn, widgetTypeDetails.fqn) &&
        Objects.equals(this.name, widgetTypeDetails.name) &&
        Objects.equals(this.deprecated, widgetTypeDetails.deprecated) &&
        Objects.equals(this.scada, widgetTypeDetails.scada) &&
        Objects.equals(this.version, widgetTypeDetails.version) &&
        Objects.equals(this.descriptor, widgetTypeDetails.descriptor) &&
        Objects.equals(this.image, widgetTypeDetails.image) &&
        Objects.equals(this.description, widgetTypeDetails.description) &&
        Objects.equals(this.tags, widgetTypeDetails.tags) &&
        Objects.equals(this.resources, widgetTypeDetails.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, fqn, name, deprecated, scada, version, descriptor, image, description, tags, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetTypeDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    fqn: ").append(toIndentedString(fqn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
    sb.append("    scada: ").append(toIndentedString(scada)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

    // add `resources` to the URL query string
    if (getResources() != null) {
      for (int i = 0; i < getResources().size(); i++) {
        if (getResources().get(i) != null) {
          joiner.add(getResources().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sresources%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

