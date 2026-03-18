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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.thingsboard.client.model.MergedGroupPermissionInfo;
import org.thingsboard.client.model.MergedGroupTypePermissionInfo;
import org.thingsboard.client.model.Operation;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * MergedUserPermissions
 */
@JsonPropertyOrder({
  MergedUserPermissions.JSON_PROPERTY_GENERIC_PERMISSIONS,
  MergedUserPermissions.JSON_PROPERTY_GROUP_PERMISSIONS,
  MergedUserPermissions.JSON_PROPERTY_READ_GROUP_PERMISSIONS,
  MergedUserPermissions.JSON_PROPERTY_READ_ENTITY_PERMISSIONS,
  MergedUserPermissions.JSON_PROPERTY_READ_ATTR_PERMISSIONS,
  MergedUserPermissions.JSON_PROPERTY_READ_TS_PERMISSIONS
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class MergedUserPermissions {
  public static final String JSON_PROPERTY_GENERIC_PERMISSIONS = "genericPermissions";
  @Nullable
  private Map<String, Set<Operation>> genericPermissions = new HashMap<>();

  public static final String JSON_PROPERTY_GROUP_PERMISSIONS = "groupPermissions";
  @Nullable
  private Map<String, MergedGroupPermissionInfo> groupPermissions = new HashMap<>();

  public static final String JSON_PROPERTY_READ_GROUP_PERMISSIONS = "readGroupPermissions";
  @Nullable
  private Map<String, MergedGroupTypePermissionInfo> readGroupPermissions = new HashMap<>();

  public static final String JSON_PROPERTY_READ_ENTITY_PERMISSIONS = "readEntityPermissions";
  @Nullable
  private Map<String, MergedGroupTypePermissionInfo> readEntityPermissions = new HashMap<>();

  public static final String JSON_PROPERTY_READ_ATTR_PERMISSIONS = "readAttrPermissions";
  @Nullable
  private Map<String, MergedGroupTypePermissionInfo> readAttrPermissions = new HashMap<>();

  public static final String JSON_PROPERTY_READ_TS_PERMISSIONS = "readTsPermissions";
  @Nullable
  private Map<String, MergedGroupTypePermissionInfo> readTsPermissions = new HashMap<>();

  public MergedUserPermissions() { 
  }

  public MergedUserPermissions genericPermissions(@Nullable Map<String, Set<Operation>> genericPermissions) {
    this.genericPermissions = genericPermissions;
    return this;
  }

  public MergedUserPermissions putGenericPermissionsItem(String key, Set<Operation> genericPermissionsItem) {
    if (this.genericPermissions == null) {
      this.genericPermissions = new HashMap<>();
    }
    this.genericPermissions.put(key, genericPermissionsItem);
    return this;
  }

  /**
   * Map of permissions defined using generic roles (&#39;Customer Administrator&#39;, etc)
   * @return genericPermissions
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_GENERIC_PERMISSIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Set<Operation>> getGenericPermissions() {
    return genericPermissions;
  }


  @JsonProperty(value = JSON_PROPERTY_GENERIC_PERMISSIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGenericPermissions(@Nullable Map<String, Set<Operation>> genericPermissions) {
    this.genericPermissions = genericPermissions;
  }


  public MergedUserPermissions groupPermissions(@Nullable Map<String, MergedGroupPermissionInfo> groupPermissions) {
    this.groupPermissions = groupPermissions;
    return this;
  }

  public MergedUserPermissions putGroupPermissionsItem(String key, MergedGroupPermissionInfo groupPermissionsItem) {
    if (this.groupPermissions == null) {
      this.groupPermissions = new HashMap<>();
    }
    this.groupPermissions.put(key, groupPermissionsItem);
    return this;
  }

  /**
   * Map of permissions defined using group roles (&#39;Read&#39; or &#39;Write&#39; access to specific entity group, etc)
   * @return groupPermissions
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_GROUP_PERMISSIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, MergedGroupPermissionInfo> getGroupPermissions() {
    return groupPermissions;
  }


  @JsonProperty(value = JSON_PROPERTY_GROUP_PERMISSIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupPermissions(@Nullable Map<String, MergedGroupPermissionInfo> groupPermissions) {
    this.groupPermissions = groupPermissions;
  }


  public MergedUserPermissions readGroupPermissions(@Nullable Map<String, MergedGroupTypePermissionInfo> readGroupPermissions) {
    this.readGroupPermissions = readGroupPermissions;
    return this;
  }

  public MergedUserPermissions putReadGroupPermissionsItem(String key, MergedGroupTypePermissionInfo readGroupPermissionsItem) {
    if (this.readGroupPermissions == null) {
      this.readGroupPermissions = new HashMap<>();
    }
    this.readGroupPermissions.put(key, readGroupPermissionsItem);
    return this;
  }

  /**
   * Map of read permissions per entity type. Used on the UI to enable/disable certain components.
   * @return readGroupPermissions
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_READ_GROUP_PERMISSIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, MergedGroupTypePermissionInfo> getReadGroupPermissions() {
    return readGroupPermissions;
  }


  @JsonProperty(value = JSON_PROPERTY_READ_GROUP_PERMISSIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReadGroupPermissions(@Nullable Map<String, MergedGroupTypePermissionInfo> readGroupPermissions) {
    this.readGroupPermissions = readGroupPermissions;
  }


  public MergedUserPermissions readEntityPermissions(@Nullable Map<String, MergedGroupTypePermissionInfo> readEntityPermissions) {
    this.readEntityPermissions = readEntityPermissions;
    return this;
  }

  public MergedUserPermissions putReadEntityPermissionsItem(String key, MergedGroupTypePermissionInfo readEntityPermissionsItem) {
    if (this.readEntityPermissions == null) {
      this.readEntityPermissions = new HashMap<>();
    }
    this.readEntityPermissions.put(key, readEntityPermissionsItem);
    return this;
  }

  /**
   * Map of read permissions per resource. Used on the UI to enable/disable certain components.
   * @return readEntityPermissions
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_READ_ENTITY_PERMISSIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, MergedGroupTypePermissionInfo> getReadEntityPermissions() {
    return readEntityPermissions;
  }


  @JsonProperty(value = JSON_PROPERTY_READ_ENTITY_PERMISSIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReadEntityPermissions(@Nullable Map<String, MergedGroupTypePermissionInfo> readEntityPermissions) {
    this.readEntityPermissions = readEntityPermissions;
  }


  public MergedUserPermissions readAttrPermissions(@Nullable Map<String, MergedGroupTypePermissionInfo> readAttrPermissions) {
    this.readAttrPermissions = readAttrPermissions;
    return this;
  }

  public MergedUserPermissions putReadAttrPermissionsItem(String key, MergedGroupTypePermissionInfo readAttrPermissionsItem) {
    if (this.readAttrPermissions == null) {
      this.readAttrPermissions = new HashMap<>();
    }
    this.readAttrPermissions.put(key, readAttrPermissionsItem);
    return this;
  }

  /**
   * Map of read entity attributes permissions per resource. Used on the UI to enable/disable certain tabs.
   * @return readAttrPermissions
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_READ_ATTR_PERMISSIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, MergedGroupTypePermissionInfo> getReadAttrPermissions() {
    return readAttrPermissions;
  }


  @JsonProperty(value = JSON_PROPERTY_READ_ATTR_PERMISSIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReadAttrPermissions(@Nullable Map<String, MergedGroupTypePermissionInfo> readAttrPermissions) {
    this.readAttrPermissions = readAttrPermissions;
  }


  public MergedUserPermissions readTsPermissions(@Nullable Map<String, MergedGroupTypePermissionInfo> readTsPermissions) {
    this.readTsPermissions = readTsPermissions;
    return this;
  }

  public MergedUserPermissions putReadTsPermissionsItem(String key, MergedGroupTypePermissionInfo readTsPermissionsItem) {
    if (this.readTsPermissions == null) {
      this.readTsPermissions = new HashMap<>();
    }
    this.readTsPermissions.put(key, readTsPermissionsItem);
    return this;
  }

  /**
   * Map of read entity time-series permissions per resource. Used on the UI to enable/disable certain tabs.
   * @return readTsPermissions
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_READ_TS_PERMISSIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, MergedGroupTypePermissionInfo> getReadTsPermissions() {
    return readTsPermissions;
  }


  @JsonProperty(value = JSON_PROPERTY_READ_TS_PERMISSIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReadTsPermissions(@Nullable Map<String, MergedGroupTypePermissionInfo> readTsPermissions) {
    this.readTsPermissions = readTsPermissions;
  }


  /**
   * Return true if this MergedUserPermissions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MergedUserPermissions mergedUserPermissions = (MergedUserPermissions) o;
    return Objects.equals(this.genericPermissions, mergedUserPermissions.genericPermissions) &&
        Objects.equals(this.groupPermissions, mergedUserPermissions.groupPermissions) &&
        Objects.equals(this.readGroupPermissions, mergedUserPermissions.readGroupPermissions) &&
        Objects.equals(this.readEntityPermissions, mergedUserPermissions.readEntityPermissions) &&
        Objects.equals(this.readAttrPermissions, mergedUserPermissions.readAttrPermissions) &&
        Objects.equals(this.readTsPermissions, mergedUserPermissions.readTsPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genericPermissions, groupPermissions, readGroupPermissions, readEntityPermissions, readAttrPermissions, readTsPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergedUserPermissions {\n");
    sb.append("    genericPermissions: ").append(toIndentedString(genericPermissions)).append("\n");
    sb.append("    groupPermissions: ").append(toIndentedString(groupPermissions)).append("\n");
    sb.append("    readGroupPermissions: ").append(toIndentedString(readGroupPermissions)).append("\n");
    sb.append("    readEntityPermissions: ").append(toIndentedString(readEntityPermissions)).append("\n");
    sb.append("    readAttrPermissions: ").append(toIndentedString(readAttrPermissions)).append("\n");
    sb.append("    readTsPermissions: ").append(toIndentedString(readTsPermissions)).append("\n");
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

    // add `genericPermissions` to the URL query string
    if (getGenericPermissions() != null) {
      for (String _key : getGenericPermissions().keySet()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%sgenericPermissions%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix),
            getGenericPermissions().get(_key), ApiClient.urlEncode(ApiClient.valueToString(getGenericPermissions().get(_key)))));
      }
    }

    // add `groupPermissions` to the URL query string
    if (getGroupPermissions() != null) {
      for (String _key : getGroupPermissions().keySet()) {
        if (getGroupPermissions().get(_key) != null) {
          joiner.add(getGroupPermissions().get(_key).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sgroupPermissions%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    // add `readGroupPermissions` to the URL query string
    if (getReadGroupPermissions() != null) {
      for (String _key : getReadGroupPermissions().keySet()) {
        if (getReadGroupPermissions().get(_key) != null) {
          joiner.add(getReadGroupPermissions().get(_key).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sreadGroupPermissions%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    // add `readEntityPermissions` to the URL query string
    if (getReadEntityPermissions() != null) {
      for (String _key : getReadEntityPermissions().keySet()) {
        if (getReadEntityPermissions().get(_key) != null) {
          joiner.add(getReadEntityPermissions().get(_key).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sreadEntityPermissions%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    // add `readAttrPermissions` to the URL query string
    if (getReadAttrPermissions() != null) {
      for (String _key : getReadAttrPermissions().keySet()) {
        if (getReadAttrPermissions().get(_key) != null) {
          joiner.add(getReadAttrPermissions().get(_key).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sreadAttrPermissions%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    // add `readTsPermissions` to the URL query string
    if (getReadTsPermissions() != null) {
      for (String _key : getReadTsPermissions().keySet()) {
        if (getReadTsPermissions().get(_key) != null) {
          joiner.add(getReadTsPermissions().get(_key).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sreadTsPermissions%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

