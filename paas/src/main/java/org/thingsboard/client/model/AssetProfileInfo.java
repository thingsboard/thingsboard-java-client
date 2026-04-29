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
import java.util.Arrays;
import org.thingsboard.client.model.AssetProfileId;
import org.thingsboard.client.model.DashboardId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AssetProfileInfo
 */
@JsonPropertyOrder({
  AssetProfileInfo.JSON_PROPERTY_ID,
  AssetProfileInfo.JSON_PROPERTY_NAME,
  AssetProfileInfo.JSON_PROPERTY_IMAGE,
  AssetProfileInfo.JSON_PROPERTY_DEFAULT_DASHBOARD_ID,
  AssetProfileInfo.JSON_PROPERTY_TENANT_ID
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AssetProfileInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private AssetProfileId id;

  public static final String JSON_PROPERTY_NAME = "name";
  @Nullable
  private String name;

  public static final String JSON_PROPERTY_IMAGE = "image";
  @Nullable
  private String image;

  public static final String JSON_PROPERTY_DEFAULT_DASHBOARD_ID = "defaultDashboardId";
  @Nullable
  private DashboardId defaultDashboardId;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public AssetProfileInfo() { 
  }

  public AssetProfileInfo id(@Nullable AssetProfileId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the Asset Profile Id.
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AssetProfileId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable AssetProfileId id) {
    this.id = id;
  }


  public AssetProfileInfo name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Entity Name
   * @return name
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@Nullable String name) {
    this.name = name;
  }


  public AssetProfileInfo image(@Nullable String image) {
    this.image = image;
    return this;
  }

  /**
   * Either URL or Base64 data of the icon. Used in the mobile application to visualize set of asset profiles in the grid view. 
   * @return image
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_IMAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getImage() {
    return image;
  }


  @JsonProperty(value = JSON_PROPERTY_IMAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImage(@Nullable String image) {
    this.image = image;
  }


  public AssetProfileInfo defaultDashboardId(@Nullable DashboardId defaultDashboardId) {
    this.defaultDashboardId = defaultDashboardId;
    return this;
  }

  /**
   * Reference to the dashboard. Used in the mobile application to open the default dashboard when user navigates to asset details.
   * @return defaultDashboardId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DEFAULT_DASHBOARD_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DashboardId getDefaultDashboardId() {
    return defaultDashboardId;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFAULT_DASHBOARD_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultDashboardId(@Nullable DashboardId defaultDashboardId) {
    this.defaultDashboardId = defaultDashboardId;
  }


  public AssetProfileInfo tenantId(@Nullable TenantId tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Tenant id.
   * @return tenantId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(@Nullable TenantId tenantId) {
    this.tenantId = tenantId;
  }


  /**
   * Return true if this AssetProfileInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetProfileInfo assetProfileInfo = (AssetProfileInfo) o;
    return Objects.equals(this.id, assetProfileInfo.id) &&
        Objects.equals(this.name, assetProfileInfo.name) &&
        Objects.equals(this.image, assetProfileInfo.image) &&
        Objects.equals(this.defaultDashboardId, assetProfileInfo.defaultDashboardId) &&
        Objects.equals(this.tenantId, assetProfileInfo.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, image, defaultDashboardId, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetProfileInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    defaultDashboardId: ").append(toIndentedString(defaultDashboardId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `image` to the URL query string
    if (getImage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%simage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getImage()))));
    }

    // add `defaultDashboardId` to the URL query string
    if (getDefaultDashboardId() != null) {
      joiner.add(getDefaultDashboardId().toUrlQueryString(prefix + "defaultDashboardId" + suffix));
    }

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      joiner.add(getTenantId().toUrlQueryString(prefix + "tenantId" + suffix));
    }

    return joiner.toString();
  }
}

