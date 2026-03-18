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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.thingsboard.client.model.DashboardId;
import org.thingsboard.client.model.ResourceExportData;
import org.thingsboard.client.model.ShortCustomerInfo;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * Dashboard
 */
@JsonPropertyOrder({
  Dashboard.JSON_PROPERTY_ID,
  Dashboard.JSON_PROPERTY_CREATED_TIME,
  Dashboard.JSON_PROPERTY_TENANT_ID,
  Dashboard.JSON_PROPERTY_TITLE,
  Dashboard.JSON_PROPERTY_NAME,
  Dashboard.JSON_PROPERTY_IMAGE,
  Dashboard.JSON_PROPERTY_MOBILE_HIDE,
  Dashboard.JSON_PROPERTY_MOBILE_ORDER,
  Dashboard.JSON_PROPERTY_ASSIGNED_CUSTOMERS,
  Dashboard.JSON_PROPERTY_CONFIGURATION,
  Dashboard.JSON_PROPERTY_RESOURCES,
  Dashboard.JSON_PROPERTY_VERSION
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class Dashboard {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private DashboardId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_TITLE = "title";
  @Nonnull
  private String title;

  public static final String JSON_PROPERTY_NAME = "name";
  @Nullable
  private String name;

  public static final String JSON_PROPERTY_IMAGE = "image";
  @Nullable
  private String image;

  public static final String JSON_PROPERTY_MOBILE_HIDE = "mobileHide";
  @Nullable
  private Boolean mobileHide;

  public static final String JSON_PROPERTY_MOBILE_ORDER = "mobileOrder";
  @Nullable
  private Integer mobileOrder;

  public static final String JSON_PROPERTY_ASSIGNED_CUSTOMERS = "assignedCustomers";
  @Nullable
  private Set<ShortCustomerInfo> assignedCustomers = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  @Nullable
  private com.fasterxml.jackson.databind.JsonNode _configuration;

  public static final String JSON_PROPERTY_RESOURCES = "resources";
  @Nullable
  private List<ResourceExportData> resources = new ArrayList<>();

  public static final String JSON_PROPERTY_VERSION = "version";
  @Nullable
  private Long version;

  public Dashboard() { 
  }

  @JsonCreator
  public Dashboard(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_IMAGE) String image, 
    @JsonProperty(JSON_PROPERTY_MOBILE_HIDE) Boolean mobileHide, 
    @JsonProperty(JSON_PROPERTY_MOBILE_ORDER) Integer mobileOrder
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
    this.name = name;
    this.image = image;
    this.mobileHide = mobileHide;
    this.mobileOrder = mobileOrder;
  }

  public Dashboard id(@Nullable DashboardId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the dashboard Id. Specify existing dashboard Id to update the dashboard. Referencing non-existing dashboard id will cause error. Omit this field to create new dashboard.
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DashboardId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable DashboardId id) {
    this.id = id;
  }


  /**
   * Timestamp of the dashboard creation, in milliseconds
   * @return createdTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  /**
   * JSON object with Tenant Id. Tenant Id of the dashboard can&#39;t be changed.
   * @return tenantId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }




  public Dashboard title(@Nonnull String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the dashboard.
   * @return title
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_TITLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTitle() {
    return title;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(@Nonnull String title) {
    this.title = title;
  }


  /**
   * Same as title of the dashboard. Read-only field. Update the &#39;title&#39; to change the &#39;name&#39; of the dashboard.
   * @return name
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }




  /**
   * Thumbnail picture for rendering of the dashboards in a grid view on mobile devices.
   * @return image
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_IMAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getImage() {
    return image;
  }




  /**
   * Hide dashboard from mobile devices. Useful if the dashboard is not designed for small screens.
   * @return mobileHide
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MOBILE_HIDE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getMobileHide() {
    return mobileHide;
  }




  /**
   * Order on mobile devices. Useful to adjust sorting of the dashboards for mobile applications
   * @return mobileOrder
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MOBILE_ORDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMobileOrder() {
    return mobileOrder;
  }




  public Dashboard assignedCustomers(@Nullable Set<ShortCustomerInfo> assignedCustomers) {
    this.assignedCustomers = assignedCustomers;
    return this;
  }

  public Dashboard addAssignedCustomersItem(ShortCustomerInfo assignedCustomersItem) {
    if (this.assignedCustomers == null) {
      this.assignedCustomers = new LinkedHashSet<>();
    }
    this.assignedCustomers.add(assignedCustomersItem);
    return this;
  }

  /**
   * List of assigned customers with their info.
   * @return assignedCustomers
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ASSIGNED_CUSTOMERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Set<ShortCustomerInfo> getAssignedCustomers() {
    return assignedCustomers;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(value = JSON_PROPERTY_ASSIGNED_CUSTOMERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssignedCustomers(@Nullable Set<ShortCustomerInfo> assignedCustomers) {
    this.assignedCustomers = assignedCustomers;
  }


  public Dashboard _configuration(@Nullable com.fasterxml.jackson.databind.JsonNode _configuration) {
    this._configuration = _configuration;
    return this;
  }

  /**
   * JSON object with main configuration of the dashboard: layouts, widgets, aliases, etc. The JSON structure of the dashboard configuration is quite complex. The easiest way to learn it is to export existing dashboard to JSON.
   * @return _configuration
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getConfiguration() {
    return _configuration;
  }


  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfiguration(@Nullable com.fasterxml.jackson.databind.JsonNode _configuration) {
    this._configuration = _configuration;
  }


  public Dashboard resources(@Nullable List<ResourceExportData> resources) {
    this.resources = resources;
    return this;
  }

  public Dashboard addResourcesItem(ResourceExportData resourcesItem) {
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
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_RESOURCES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ResourceExportData> getResources() {
    return resources;
  }


  @JsonProperty(value = JSON_PROPERTY_RESOURCES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResources(@Nullable List<ResourceExportData> resources) {
    this.resources = resources;
  }


  public Dashboard version(@Nullable Long version) {
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
   * Return true if this Dashboard object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dashboard dashboard = (Dashboard) o;
    return Objects.equals(this.id, dashboard.id) &&
        Objects.equals(this.createdTime, dashboard.createdTime) &&
        Objects.equals(this.tenantId, dashboard.tenantId) &&
        Objects.equals(this.title, dashboard.title) &&
        Objects.equals(this.name, dashboard.name) &&
        Objects.equals(this.image, dashboard.image) &&
        Objects.equals(this.mobileHide, dashboard.mobileHide) &&
        Objects.equals(this.mobileOrder, dashboard.mobileOrder) &&
        Objects.equals(this.assignedCustomers, dashboard.assignedCustomers) &&
        Objects.equals(this._configuration, dashboard._configuration) &&
        Objects.equals(this.resources, dashboard.resources) &&
        Objects.equals(this.version, dashboard.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, title, name, image, mobileHide, mobileOrder, assignedCustomers, _configuration, resources, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dashboard {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    mobileHide: ").append(toIndentedString(mobileHide)).append("\n");
    sb.append("    mobileOrder: ").append(toIndentedString(mobileOrder)).append("\n");
    sb.append("    assignedCustomers: ").append(toIndentedString(assignedCustomers)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTitle()))));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `image` to the URL query string
    if (getImage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%simage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getImage()))));
    }

    // add `mobileHide` to the URL query string
    if (getMobileHide() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smobileHide%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMobileHide()))));
    }

    // add `mobileOrder` to the URL query string
    if (getMobileOrder() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smobileOrder%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMobileOrder()))));
    }

    // add `assignedCustomers` to the URL query string
    if (getAssignedCustomers() != null) {
      int i = 0;
      for (ShortCustomerInfo _item : getAssignedCustomers()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format(java.util.Locale.ROOT, "%sassignedCustomers%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `configuration` to the URL query string
    if (getConfiguration() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sconfiguration%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getConfiguration()))));
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

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    return joiner.toString();
  }
}

