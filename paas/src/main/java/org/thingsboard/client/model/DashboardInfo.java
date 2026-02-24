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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.thingsboard.client.model.CustomerId;
import org.thingsboard.client.model.DashboardId;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.EntityInfo;
import org.thingsboard.client.model.ResourceExportData;
import org.thingsboard.client.model.ShortCustomerInfo;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * DashboardInfo
 */
@JsonPropertyOrder({
  DashboardInfo.JSON_PROPERTY_TITLE,
  DashboardInfo.JSON_PROPERTY_IMAGE,
  DashboardInfo.JSON_PROPERTY_MOBILE_HIDE,
  DashboardInfo.JSON_PROPERTY_MOBILE_ORDER,
  DashboardInfo.JSON_PROPERTY_CONFIGURATION,
  DashboardInfo.JSON_PROPERTY_NAME,
  DashboardInfo.JSON_PROPERTY_RESOURCES,
  DashboardInfo.JSON_PROPERTY_ID,
  DashboardInfo.JSON_PROPERTY_CREATED_TIME,
  DashboardInfo.JSON_PROPERTY_TENANT_ID,
  DashboardInfo.JSON_PROPERTY_CUSTOMER_ID,
  DashboardInfo.JSON_PROPERTY_ASSIGNED_CUSTOMERS,
  DashboardInfo.JSON_PROPERTY_VERSION,
  DashboardInfo.JSON_PROPERTY_OWNER_NAME,
  DashboardInfo.JSON_PROPERTY_GROUPS,
  DashboardInfo.JSON_PROPERTY_OWNER_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class DashboardInfo {
  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private String title;

  public static final String JSON_PROPERTY_IMAGE = "image";
  @javax.annotation.Nullable
  private String image;

  public static final String JSON_PROPERTY_MOBILE_HIDE = "mobileHide";
  @javax.annotation.Nullable
  private Boolean mobileHide;

  public static final String JSON_PROPERTY_MOBILE_ORDER = "mobileOrder";
  @javax.annotation.Nullable
  private Integer mobileOrder;

  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode _configuration = null;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_RESOURCES = "resources";
  @javax.annotation.Nullable
  private List<ResourceExportData> resources = new ArrayList<>();

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private DashboardId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @javax.annotation.Nullable
  private CustomerId customerId;

  public static final String JSON_PROPERTY_ASSIGNED_CUSTOMERS = "assignedCustomers";
  @javax.annotation.Nullable
  private Set<ShortCustomerInfo> assignedCustomers = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Long version;

  public static final String JSON_PROPERTY_OWNER_NAME = "ownerName";
  @javax.annotation.Nullable
  private String ownerName;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  @javax.annotation.Nullable
  private List<EntityInfo> groups = new ArrayList<>();

  public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
  @javax.annotation.Nullable
  private EntityId ownerId;

  public DashboardInfo() { 
  }

  @JsonCreator
  public DashboardInfo(
    @JsonProperty(JSON_PROPERTY_IMAGE) String image, 
    @JsonProperty(JSON_PROPERTY_MOBILE_HIDE) Boolean mobileHide, 
    @JsonProperty(JSON_PROPERTY_MOBILE_ORDER) Integer mobileOrder, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId, 
    @JsonProperty(JSON_PROPERTY_OWNER_NAME) String ownerName, 
    @JsonProperty(JSON_PROPERTY_OWNER_ID) EntityId ownerId
  ) {
  this();
    this.image = image;
    this.mobileHide = mobileHide;
    this.mobileOrder = mobileOrder;
    this.name = name;
    this.createdTime = createdTime;
    this.tenantId = tenantId;
    this.ownerName = ownerName;
    this.ownerId = ownerId;
  }

  public DashboardInfo title(@javax.annotation.Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the dashboard.
   * @return title
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = title;
  }


  /**
   * Thumbnail picture for rendering of the dashboards in a grid view on mobile devices.
   * @return image
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_IMAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getImage() {
    return image;
  }




  /**
   * Hide dashboard from mobile devices. Useful if the dashboard is not designed for small screens.
   * @return mobileHide
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MOBILE_HIDE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getMobileHide() {
    return mobileHide;
  }




  /**
   * Order on mobile devices. Useful to adjust sorting of the dashboards for mobile applications
   * @return mobileOrder
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MOBILE_ORDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMobileOrder() {
    return mobileOrder;
  }




  public DashboardInfo _configuration(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode _configuration) {
    this._configuration = _configuration;
    return this;
  }

  /**
   * Get _configuration
   * @return _configuration
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getConfiguration() {
    return _configuration;
  }


  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfiguration(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode _configuration) {
    this._configuration = _configuration;
  }


  /**
   * Same as title of the dashboard. Read-only field. Update the &#39;title&#39; to change the &#39;name&#39; of the dashboard.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }




  public DashboardInfo resources(@javax.annotation.Nullable List<ResourceExportData> resources) {
    this.resources = resources;
    return this;
  }

  public DashboardInfo addResourcesItem(ResourceExportData resourcesItem) {
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


  public DashboardInfo id(@javax.annotation.Nullable DashboardId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the dashboard Id. Specify existing dashboard Id to update the dashboard. Referencing non-existing dashboard id will cause error. Omit this field to create new dashboard.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DashboardId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable DashboardId id) {
    this.id = id;
  }


  /**
   * Timestamp of the dashboard creation, in milliseconds
   * @return createdTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  /**
   * JSON object with Tenant Id. Tenant Id of the dashboard can&#39;t be changed.
   * @return tenantId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }




  public DashboardInfo customerId(@javax.annotation.Nullable CustomerId customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * JSON object with Customer Id. 
   * @return customerId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomerId getCustomerId() {
    return customerId;
  }


  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerId(@javax.annotation.Nullable CustomerId customerId) {
    this.customerId = customerId;
  }


  public DashboardInfo assignedCustomers(@javax.annotation.Nullable Set<ShortCustomerInfo> assignedCustomers) {
    this.assignedCustomers = assignedCustomers;
    return this;
  }

  public DashboardInfo addAssignedCustomersItem(ShortCustomerInfo assignedCustomersItem) {
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
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ASSIGNED_CUSTOMERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Set<ShortCustomerInfo> getAssignedCustomers() {
    return assignedCustomers;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(value = JSON_PROPERTY_ASSIGNED_CUSTOMERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssignedCustomers(@javax.annotation.Nullable Set<ShortCustomerInfo> assignedCustomers) {
    this.assignedCustomers = assignedCustomers;
  }


  public DashboardInfo version(@javax.annotation.Nullable Long version) {
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
   * Owner name
   * @return ownerName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OWNER_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOwnerName() {
    return ownerName;
  }




  public DashboardInfo groups(@javax.annotation.Nullable List<EntityInfo> groups) {
    this.groups = groups;
    return this;
  }

  public DashboardInfo addGroupsItem(EntityInfo groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Groups
   * @return groups
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GROUPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EntityInfo> getGroups() {
    return groups;
  }


  @JsonProperty(value = JSON_PROPERTY_GROUPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroups(@javax.annotation.Nullable List<EntityInfo> groups) {
    this.groups = groups;
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
   * Return true if this DashboardInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardInfo dashboardInfo = (DashboardInfo) o;
    return Objects.equals(this.title, dashboardInfo.title) &&
        Objects.equals(this.image, dashboardInfo.image) &&
        Objects.equals(this.mobileHide, dashboardInfo.mobileHide) &&
        Objects.equals(this.mobileOrder, dashboardInfo.mobileOrder) &&
        Objects.equals(this._configuration, dashboardInfo._configuration) &&
        Objects.equals(this.name, dashboardInfo.name) &&
        Objects.equals(this.resources, dashboardInfo.resources) &&
        Objects.equals(this.id, dashboardInfo.id) &&
        Objects.equals(this.createdTime, dashboardInfo.createdTime) &&
        Objects.equals(this.tenantId, dashboardInfo.tenantId) &&
        Objects.equals(this.customerId, dashboardInfo.customerId) &&
        Objects.equals(this.assignedCustomers, dashboardInfo.assignedCustomers) &&
        Objects.equals(this.version, dashboardInfo.version) &&
        Objects.equals(this.ownerName, dashboardInfo.ownerName) &&
        Objects.equals(this.groups, dashboardInfo.groups) &&
        Objects.equals(this.ownerId, dashboardInfo.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, image, mobileHide, mobileOrder, _configuration, name, resources, id, createdTime, tenantId, customerId, assignedCustomers, version, ownerName, groups, ownerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardInfo {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    mobileHide: ").append(toIndentedString(mobileHide)).append("\n");
    sb.append("    mobileOrder: ").append(toIndentedString(mobileOrder)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    assignedCustomers: ").append(toIndentedString(assignedCustomers)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTitle()))));
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

    // add `configuration` to the URL query string
    if (getConfiguration() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sconfiguration%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getConfiguration()))));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
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

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    // add `ownerName` to the URL query string
    if (getOwnerName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sownerName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOwnerName()))));
    }

    // add `groups` to the URL query string
    if (getGroups() != null) {
      for (int i = 0; i < getGroups().size(); i++) {
        if (getGroups().get(i) != null) {
          joiner.add(getGroups().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sgroups%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `ownerId` to the URL query string
    if (getOwnerId() != null) {
      joiner.add(getOwnerId().toUrlQueryString(prefix + "ownerId" + suffix));
    }

    return joiner.toString();
  }
}

