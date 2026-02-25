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
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.thingsboard.client.model.ObjectAttributes;
import org.thingsboard.client.model.TelemetryObserveStrategy;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * TelemetryMappingConfiguration
 */
@JsonPropertyOrder({
  TelemetryMappingConfiguration.JSON_PROPERTY_KEY_NAME,
  TelemetryMappingConfiguration.JSON_PROPERTY_OBSERVE,
  TelemetryMappingConfiguration.JSON_PROPERTY_ATTRIBUTE,
  TelemetryMappingConfiguration.JSON_PROPERTY_TELEMETRY,
  TelemetryMappingConfiguration.JSON_PROPERTY_ATTRIBUTE_LWM2M,
  TelemetryMappingConfiguration.JSON_PROPERTY_INIT_ATTR_TEL_AS_OBS_STRATEGY,
  TelemetryMappingConfiguration.JSON_PROPERTY_OBSERVE_STRATEGY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class TelemetryMappingConfiguration {
  public static final String JSON_PROPERTY_KEY_NAME = "keyName";
  @javax.annotation.Nullable
  private Map<String, String> keyName = new HashMap<>();

  public static final String JSON_PROPERTY_OBSERVE = "observe";
  @javax.annotation.Nullable
  private Set<String> observe = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_ATTRIBUTE = "attribute";
  @javax.annotation.Nullable
  private Set<String> attribute = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_TELEMETRY = "telemetry";
  @javax.annotation.Nullable
  private Set<String> telemetry = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_ATTRIBUTE_LWM2M = "attributeLwm2m";
  @javax.annotation.Nullable
  private Map<String, ObjectAttributes> attributeLwm2m = new HashMap<>();

  public static final String JSON_PROPERTY_INIT_ATTR_TEL_AS_OBS_STRATEGY = "initAttrTelAsObsStrategy";
  @javax.annotation.Nullable
  private Boolean initAttrTelAsObsStrategy;

  public static final String JSON_PROPERTY_OBSERVE_STRATEGY = "observeStrategy";
  @javax.annotation.Nullable
  private TelemetryObserveStrategy observeStrategy;

  public TelemetryMappingConfiguration() { 
  }

  public TelemetryMappingConfiguration keyName(@javax.annotation.Nullable Map<String, String> keyName) {
    this.keyName = keyName;
    return this;
  }

  public TelemetryMappingConfiguration putKeyNameItem(String key, String keyNameItem) {
    if (this.keyName == null) {
      this.keyName = new HashMap<>();
    }
    this.keyName.put(key, keyNameItem);
    return this;
  }

  /**
   * Map of LwM2M resource paths to telemetry key names
   * @return keyName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_KEY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getKeyName() {
    return keyName;
  }


  @JsonProperty(value = JSON_PROPERTY_KEY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyName(@javax.annotation.Nullable Map<String, String> keyName) {
    this.keyName = keyName;
  }


  public TelemetryMappingConfiguration observe(@javax.annotation.Nullable Set<String> observe) {
    this.observe = observe;
    return this;
  }

  public TelemetryMappingConfiguration addObserveItem(String observeItem) {
    if (this.observe == null) {
      this.observe = new LinkedHashSet<>();
    }
    this.observe.add(observeItem);
    return this;
  }

  /**
   * Set of resources to observe
   * @return observe
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OBSERVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Set<String> getObserve() {
    return observe;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(value = JSON_PROPERTY_OBSERVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObserve(@javax.annotation.Nullable Set<String> observe) {
    this.observe = observe;
  }


  public TelemetryMappingConfiguration attribute(@javax.annotation.Nullable Set<String> attribute) {
    this.attribute = attribute;
    return this;
  }

  public TelemetryMappingConfiguration addAttributeItem(String attributeItem) {
    if (this.attribute == null) {
      this.attribute = new LinkedHashSet<>();
    }
    this.attribute.add(attributeItem);
    return this;
  }

  /**
   * Set of attribute keys
   * @return attribute
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ATTRIBUTE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Set<String> getAttribute() {
    return attribute;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(value = JSON_PROPERTY_ATTRIBUTE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttribute(@javax.annotation.Nullable Set<String> attribute) {
    this.attribute = attribute;
  }


  public TelemetryMappingConfiguration telemetry(@javax.annotation.Nullable Set<String> telemetry) {
    this.telemetry = telemetry;
    return this;
  }

  public TelemetryMappingConfiguration addTelemetryItem(String telemetryItem) {
    if (this.telemetry == null) {
      this.telemetry = new LinkedHashSet<>();
    }
    this.telemetry.add(telemetryItem);
    return this;
  }

  /**
   * Set of telemetry keys
   * @return telemetry
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TELEMETRY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Set<String> getTelemetry() {
    return telemetry;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(value = JSON_PROPERTY_TELEMETRY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTelemetry(@javax.annotation.Nullable Set<String> telemetry) {
    this.telemetry = telemetry;
  }


  public TelemetryMappingConfiguration attributeLwm2m(@javax.annotation.Nullable Map<String, ObjectAttributes> attributeLwm2m) {
    this.attributeLwm2m = attributeLwm2m;
    return this;
  }

  public TelemetryMappingConfiguration putAttributeLwm2mItem(String key, ObjectAttributes attributeLwm2mItem) {
    if (this.attributeLwm2m == null) {
      this.attributeLwm2m = new HashMap<>();
    }
    this.attributeLwm2m.put(key, attributeLwm2mItem);
    return this;
  }

  /**
   * Map of resource paths to specific LwM2M object attributes
   * @return attributeLwm2m
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ATTRIBUTE_LWM2M, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, ObjectAttributes> getAttributeLwm2m() {
    return attributeLwm2m;
  }


  @JsonProperty(value = JSON_PROPERTY_ATTRIBUTE_LWM2M, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttributeLwm2m(@javax.annotation.Nullable Map<String, ObjectAttributes> attributeLwm2m) {
    this.attributeLwm2m = attributeLwm2m;
  }


  public TelemetryMappingConfiguration initAttrTelAsObsStrategy(@javax.annotation.Nullable Boolean initAttrTelAsObsStrategy) {
    this.initAttrTelAsObsStrategy = initAttrTelAsObsStrategy;
    return this;
  }

  /**
   * Get initAttrTelAsObsStrategy
   * @return initAttrTelAsObsStrategy
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INIT_ATTR_TEL_AS_OBS_STRATEGY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getInitAttrTelAsObsStrategy() {
    return initAttrTelAsObsStrategy;
  }


  @JsonProperty(value = JSON_PROPERTY_INIT_ATTR_TEL_AS_OBS_STRATEGY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInitAttrTelAsObsStrategy(@javax.annotation.Nullable Boolean initAttrTelAsObsStrategy) {
    this.initAttrTelAsObsStrategy = initAttrTelAsObsStrategy;
  }


  public TelemetryMappingConfiguration observeStrategy(@javax.annotation.Nullable TelemetryObserveStrategy observeStrategy) {
    this.observeStrategy = observeStrategy;
    return this;
  }

  /**
   * Observation strategy for telemetry
   * @return observeStrategy
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OBSERVE_STRATEGY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TelemetryObserveStrategy getObserveStrategy() {
    return observeStrategy;
  }


  @JsonProperty(value = JSON_PROPERTY_OBSERVE_STRATEGY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObserveStrategy(@javax.annotation.Nullable TelemetryObserveStrategy observeStrategy) {
    this.observeStrategy = observeStrategy;
  }


  /**
   * Return true if this TelemetryMappingConfiguration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelemetryMappingConfiguration telemetryMappingConfiguration = (TelemetryMappingConfiguration) o;
    return Objects.equals(this.keyName, telemetryMappingConfiguration.keyName) &&
        Objects.equals(this.observe, telemetryMappingConfiguration.observe) &&
        Objects.equals(this.attribute, telemetryMappingConfiguration.attribute) &&
        Objects.equals(this.telemetry, telemetryMappingConfiguration.telemetry) &&
        Objects.equals(this.attributeLwm2m, telemetryMappingConfiguration.attributeLwm2m) &&
        Objects.equals(this.initAttrTelAsObsStrategy, telemetryMappingConfiguration.initAttrTelAsObsStrategy) &&
        Objects.equals(this.observeStrategy, telemetryMappingConfiguration.observeStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyName, observe, attribute, telemetry, attributeLwm2m, initAttrTelAsObsStrategy, observeStrategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelemetryMappingConfiguration {\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    observe: ").append(toIndentedString(observe)).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    telemetry: ").append(toIndentedString(telemetry)).append("\n");
    sb.append("    attributeLwm2m: ").append(toIndentedString(attributeLwm2m)).append("\n");
    sb.append("    initAttrTelAsObsStrategy: ").append(toIndentedString(initAttrTelAsObsStrategy)).append("\n");
    sb.append("    observeStrategy: ").append(toIndentedString(observeStrategy)).append("\n");
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

    // add `keyName` to the URL query string
    if (getKeyName() != null) {
      for (String _key : getKeyName().keySet()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%skeyName%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix),
            getKeyName().get(_key), ApiClient.urlEncode(ApiClient.valueToString(getKeyName().get(_key)))));
      }
    }

    // add `observe` to the URL query string
    if (getObserve() != null) {
      int i = 0;
      for (String _item : getObserve()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%sobserve%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(_item))));
      }
      i++;
    }

    // add `attribute` to the URL query string
    if (getAttribute() != null) {
      int i = 0;
      for (String _item : getAttribute()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%sattribute%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(_item))));
      }
      i++;
    }

    // add `telemetry` to the URL query string
    if (getTelemetry() != null) {
      int i = 0;
      for (String _item : getTelemetry()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%stelemetry%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(_item))));
      }
      i++;
    }

    // add `attributeLwm2m` to the URL query string
    if (getAttributeLwm2m() != null) {
      for (String _key : getAttributeLwm2m().keySet()) {
        if (getAttributeLwm2m().get(_key) != null) {
          joiner.add(getAttributeLwm2m().get(_key).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sattributeLwm2m%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    // add `initAttrTelAsObsStrategy` to the URL query string
    if (getInitAttrTelAsObsStrategy() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinitAttrTelAsObsStrategy%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInitAttrTelAsObsStrategy()))));
    }

    // add `observeStrategy` to the URL query string
    if (getObserveStrategy() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sobserveStrategy%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getObserveStrategy()))));
    }

    return joiner.toString();
  }
}

