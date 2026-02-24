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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.thingsboard.client.model.AlarmRule;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * DeviceProfileAlarm
 */
@JsonPropertyOrder({
  DeviceProfileAlarm.JSON_PROPERTY_ID,
  DeviceProfileAlarm.JSON_PROPERTY_ALARM_TYPE,
  DeviceProfileAlarm.JSON_PROPERTY_CREATE_RULES,
  DeviceProfileAlarm.JSON_PROPERTY_CLEAR_RULE,
  DeviceProfileAlarm.JSON_PROPERTY_PROPAGATE,
  DeviceProfileAlarm.JSON_PROPERTY_PROPAGATE_TO_OWNER,
  DeviceProfileAlarm.JSON_PROPERTY_PROPAGATE_TO_OWNER_HIERARCHY,
  DeviceProfileAlarm.JSON_PROPERTY_PROPAGATE_TO_TENANT,
  DeviceProfileAlarm.JSON_PROPERTY_PROPAGATE_RELATION_TYPES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class DeviceProfileAlarm {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private String id;

  public static final String JSON_PROPERTY_ALARM_TYPE = "alarmType";
  @javax.annotation.Nullable
  private String alarmType;

  public static final String JSON_PROPERTY_CREATE_RULES = "createRules";
  @javax.annotation.Nullable
  private Map<String, AlarmRule> createRules = new HashMap<>();

  public static final String JSON_PROPERTY_CLEAR_RULE = "clearRule";
  @javax.annotation.Nullable
  private AlarmRule clearRule;

  public static final String JSON_PROPERTY_PROPAGATE = "propagate";
  @javax.annotation.Nullable
  private Boolean propagate;

  public static final String JSON_PROPERTY_PROPAGATE_TO_OWNER = "propagateToOwner";
  @javax.annotation.Nullable
  private Boolean propagateToOwner;

  public static final String JSON_PROPERTY_PROPAGATE_TO_OWNER_HIERARCHY = "propagateToOwnerHierarchy";
  @javax.annotation.Nullable
  private Boolean propagateToOwnerHierarchy;

  public static final String JSON_PROPERTY_PROPAGATE_TO_TENANT = "propagateToTenant";
  @javax.annotation.Nullable
  private Boolean propagateToTenant;

  public static final String JSON_PROPERTY_PROPAGATE_RELATION_TYPES = "propagateRelationTypes";
  @javax.annotation.Nullable
  private List<String> propagateRelationTypes = new ArrayList<>();

  public DeviceProfileAlarm() { 
  }

  public DeviceProfileAlarm id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * String value representing the alarm rule id
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public DeviceProfileAlarm alarmType(@javax.annotation.Nullable String alarmType) {
    this.alarmType = alarmType;
    return this;
  }

  /**
   * String value representing type of the alarm
   * @return alarmType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ALARM_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAlarmType() {
    return alarmType;
  }


  @JsonProperty(value = JSON_PROPERTY_ALARM_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlarmType(@javax.annotation.Nullable String alarmType) {
    this.alarmType = alarmType;
  }


  public DeviceProfileAlarm createRules(@javax.annotation.Nullable Map<String, AlarmRule> createRules) {
    this.createRules = createRules;
    return this;
  }

  public DeviceProfileAlarm putCreateRulesItem(String key, AlarmRule createRulesItem) {
    if (this.createRules == null) {
      this.createRules = new HashMap<>();
    }
    this.createRules.put(key, createRulesItem);
    return this;
  }

  /**
   * Complex JSON object representing create alarm rules. The unique create alarm rule can be created for each alarm severity type. There can be 5 create alarm rules configured per a single alarm type. See method implementation notes and AlarmRule model for more details
   * @return createRules
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATE_RULES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, AlarmRule> getCreateRules() {
    return createRules;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATE_RULES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateRules(@javax.annotation.Nullable Map<String, AlarmRule> createRules) {
    this.createRules = createRules;
  }


  public DeviceProfileAlarm clearRule(@javax.annotation.Nullable AlarmRule clearRule) {
    this.clearRule = clearRule;
    return this;
  }

  /**
   * JSON object representing clear alarm rule
   * @return clearRule
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CLEAR_RULE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AlarmRule getClearRule() {
    return clearRule;
  }


  @JsonProperty(value = JSON_PROPERTY_CLEAR_RULE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClearRule(@javax.annotation.Nullable AlarmRule clearRule) {
    this.clearRule = clearRule;
  }


  public DeviceProfileAlarm propagate(@javax.annotation.Nullable Boolean propagate) {
    this.propagate = propagate;
    return this;
  }

  /**
   * Propagation flag to specify if alarm should be propagated to parent entities of alarm originator
   * @return propagate
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PROPAGATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPropagate() {
    return propagate;
  }


  @JsonProperty(value = JSON_PROPERTY_PROPAGATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPropagate(@javax.annotation.Nullable Boolean propagate) {
    this.propagate = propagate;
  }


  public DeviceProfileAlarm propagateToOwner(@javax.annotation.Nullable Boolean propagateToOwner) {
    this.propagateToOwner = propagateToOwner;
    return this;
  }

  /**
   * Propagation flag to specify if alarm should be propagated to the owner (tenant or customer) of alarm originator
   * @return propagateToOwner
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PROPAGATE_TO_OWNER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPropagateToOwner() {
    return propagateToOwner;
  }


  @JsonProperty(value = JSON_PROPERTY_PROPAGATE_TO_OWNER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPropagateToOwner(@javax.annotation.Nullable Boolean propagateToOwner) {
    this.propagateToOwner = propagateToOwner;
  }


  public DeviceProfileAlarm propagateToOwnerHierarchy(@javax.annotation.Nullable Boolean propagateToOwnerHierarchy) {
    this.propagateToOwnerHierarchy = propagateToOwnerHierarchy;
    return this;
  }

  /**
   * Propagation flag to specify if alarm should be propagated to the owner (tenant or customer) and all parent owners in the customer hierarchy
   * @return propagateToOwnerHierarchy
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PROPAGATE_TO_OWNER_HIERARCHY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPropagateToOwnerHierarchy() {
    return propagateToOwnerHierarchy;
  }


  @JsonProperty(value = JSON_PROPERTY_PROPAGATE_TO_OWNER_HIERARCHY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPropagateToOwnerHierarchy(@javax.annotation.Nullable Boolean propagateToOwnerHierarchy) {
    this.propagateToOwnerHierarchy = propagateToOwnerHierarchy;
  }


  public DeviceProfileAlarm propagateToTenant(@javax.annotation.Nullable Boolean propagateToTenant) {
    this.propagateToTenant = propagateToTenant;
    return this;
  }

  /**
   * Propagation flag to specify if alarm should be propagated to the tenant entity
   * @return propagateToTenant
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PROPAGATE_TO_TENANT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPropagateToTenant() {
    return propagateToTenant;
  }


  @JsonProperty(value = JSON_PROPERTY_PROPAGATE_TO_TENANT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPropagateToTenant(@javax.annotation.Nullable Boolean propagateToTenant) {
    this.propagateToTenant = propagateToTenant;
  }


  public DeviceProfileAlarm propagateRelationTypes(@javax.annotation.Nullable List<String> propagateRelationTypes) {
    this.propagateRelationTypes = propagateRelationTypes;
    return this;
  }

  public DeviceProfileAlarm addPropagateRelationTypesItem(String propagateRelationTypesItem) {
    if (this.propagateRelationTypes == null) {
      this.propagateRelationTypes = new ArrayList<>();
    }
    this.propagateRelationTypes.add(propagateRelationTypesItem);
    return this;
  }

  /**
   * JSON array of relation types that should be used for propagation. By default, &#39;propagateRelationTypes&#39; array is empty which means that the alarm will be propagated based on any relation type to parent entities. This parameter should be used only in case when &#39;propagate&#39; parameter is set to true, otherwise, &#39;propagateRelationTypes&#39; array will be ignored.
   * @return propagateRelationTypes
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PROPAGATE_RELATION_TYPES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getPropagateRelationTypes() {
    return propagateRelationTypes;
  }


  @JsonProperty(value = JSON_PROPERTY_PROPAGATE_RELATION_TYPES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPropagateRelationTypes(@javax.annotation.Nullable List<String> propagateRelationTypes) {
    this.propagateRelationTypes = propagateRelationTypes;
  }


  /**
   * Return true if this DeviceProfileAlarm object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceProfileAlarm deviceProfileAlarm = (DeviceProfileAlarm) o;
    return Objects.equals(this.id, deviceProfileAlarm.id) &&
        Objects.equals(this.alarmType, deviceProfileAlarm.alarmType) &&
        Objects.equals(this.createRules, deviceProfileAlarm.createRules) &&
        Objects.equals(this.clearRule, deviceProfileAlarm.clearRule) &&
        Objects.equals(this.propagate, deviceProfileAlarm.propagate) &&
        Objects.equals(this.propagateToOwner, deviceProfileAlarm.propagateToOwner) &&
        Objects.equals(this.propagateToOwnerHierarchy, deviceProfileAlarm.propagateToOwnerHierarchy) &&
        Objects.equals(this.propagateToTenant, deviceProfileAlarm.propagateToTenant) &&
        Objects.equals(this.propagateRelationTypes, deviceProfileAlarm.propagateRelationTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, alarmType, createRules, clearRule, propagate, propagateToOwner, propagateToOwnerHierarchy, propagateToTenant, propagateRelationTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceProfileAlarm {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    alarmType: ").append(toIndentedString(alarmType)).append("\n");
    sb.append("    createRules: ").append(toIndentedString(createRules)).append("\n");
    sb.append("    clearRule: ").append(toIndentedString(clearRule)).append("\n");
    sb.append("    propagate: ").append(toIndentedString(propagate)).append("\n");
    sb.append("    propagateToOwner: ").append(toIndentedString(propagateToOwner)).append("\n");
    sb.append("    propagateToOwnerHierarchy: ").append(toIndentedString(propagateToOwnerHierarchy)).append("\n");
    sb.append("    propagateToTenant: ").append(toIndentedString(propagateToTenant)).append("\n");
    sb.append("    propagateRelationTypes: ").append(toIndentedString(propagateRelationTypes)).append("\n");
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
      joiner.add(String.format(java.util.Locale.ROOT, "%sid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getId()))));
    }

    // add `alarmType` to the URL query string
    if (getAlarmType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%salarmType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAlarmType()))));
    }

    // add `createRules` to the URL query string
    if (getCreateRules() != null) {
      for (String _key : getCreateRules().keySet()) {
        if (getCreateRules().get(_key) != null) {
          joiner.add(getCreateRules().get(_key).toUrlQueryString(String.format(java.util.Locale.ROOT, "%screateRules%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    // add `clearRule` to the URL query string
    if (getClearRule() != null) {
      joiner.add(getClearRule().toUrlQueryString(prefix + "clearRule" + suffix));
    }

    // add `propagate` to the URL query string
    if (getPropagate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spropagate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPropagate()))));
    }

    // add `propagateToOwner` to the URL query string
    if (getPropagateToOwner() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spropagateToOwner%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPropagateToOwner()))));
    }

    // add `propagateToOwnerHierarchy` to the URL query string
    if (getPropagateToOwnerHierarchy() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spropagateToOwnerHierarchy%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPropagateToOwnerHierarchy()))));
    }

    // add `propagateToTenant` to the URL query string
    if (getPropagateToTenant() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spropagateToTenant%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPropagateToTenant()))));
    }

    // add `propagateRelationTypes` to the URL query string
    if (getPropagateRelationTypes() != null) {
      for (int i = 0; i < getPropagateRelationTypes().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%spropagateRelationTypes%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getPropagateRelationTypes().get(i)))));
      }
    }

    return joiner.toString();
  }
}

