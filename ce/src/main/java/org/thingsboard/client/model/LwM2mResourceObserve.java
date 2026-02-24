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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * LwM2mResourceObserve
 */
@JsonPropertyOrder({
  LwM2mResourceObserve.JSON_PROPERTY_ID,
  LwM2mResourceObserve.JSON_PROPERTY_NAME,
  LwM2mResourceObserve.JSON_PROPERTY_OBSERVE,
  LwM2mResourceObserve.JSON_PROPERTY_ATTRIBUTE,
  LwM2mResourceObserve.JSON_PROPERTY_TELEMETRY,
  LwM2mResourceObserve.JSON_PROPERTY_KEY_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class LwM2mResourceObserve {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_OBSERVE = "observe";
  @javax.annotation.Nullable
  private Boolean observe;

  public static final String JSON_PROPERTY_ATTRIBUTE = "attribute";
  @javax.annotation.Nullable
  private Boolean attribute;

  public static final String JSON_PROPERTY_TELEMETRY = "telemetry";
  @javax.annotation.Nullable
  private Boolean telemetry;

  public static final String JSON_PROPERTY_KEY_NAME = "keyName";
  @javax.annotation.Nullable
  private String keyName;

  public LwM2mResourceObserve() { 
  }

  public LwM2mResourceObserve id(@javax.annotation.Nullable Integer id) {
    this.id = id;
    return this;
  }

  /**
   * LwM2M Resource Observe id.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable Integer id) {
    this.id = id;
  }


  public LwM2mResourceObserve name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * LwM2M Resource Observe name.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public LwM2mResourceObserve observe(@javax.annotation.Nullable Boolean observe) {
    this.observe = observe;
    return this;
  }

  /**
   * LwM2M Resource Observe observe.
   * @return observe
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OBSERVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getObserve() {
    return observe;
  }


  @JsonProperty(value = JSON_PROPERTY_OBSERVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObserve(@javax.annotation.Nullable Boolean observe) {
    this.observe = observe;
  }


  public LwM2mResourceObserve attribute(@javax.annotation.Nullable Boolean attribute) {
    this.attribute = attribute;
    return this;
  }

  /**
   * LwM2M Resource Observe attribute.
   * @return attribute
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ATTRIBUTE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAttribute() {
    return attribute;
  }


  @JsonProperty(value = JSON_PROPERTY_ATTRIBUTE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttribute(@javax.annotation.Nullable Boolean attribute) {
    this.attribute = attribute;
  }


  public LwM2mResourceObserve telemetry(@javax.annotation.Nullable Boolean telemetry) {
    this.telemetry = telemetry;
    return this;
  }

  /**
   * LwM2M Resource Observe telemetry.
   * @return telemetry
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TELEMETRY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getTelemetry() {
    return telemetry;
  }


  @JsonProperty(value = JSON_PROPERTY_TELEMETRY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTelemetry(@javax.annotation.Nullable Boolean telemetry) {
    this.telemetry = telemetry;
  }


  public LwM2mResourceObserve keyName(@javax.annotation.Nullable String keyName) {
    this.keyName = keyName;
    return this;
  }

  /**
   * LwM2M Resource Observe key name.
   * @return keyName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_KEY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKeyName() {
    return keyName;
  }


  @JsonProperty(value = JSON_PROPERTY_KEY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyName(@javax.annotation.Nullable String keyName) {
    this.keyName = keyName;
  }


  /**
   * Return true if this LwM2mResourceObserve object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LwM2mResourceObserve lwM2mResourceObserve = (LwM2mResourceObserve) o;
    return Objects.equals(this.id, lwM2mResourceObserve.id) &&
        Objects.equals(this.name, lwM2mResourceObserve.name) &&
        Objects.equals(this.observe, lwM2mResourceObserve.observe) &&
        Objects.equals(this.attribute, lwM2mResourceObserve.attribute) &&
        Objects.equals(this.telemetry, lwM2mResourceObserve.telemetry) &&
        Objects.equals(this.keyName, lwM2mResourceObserve.keyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, observe, attribute, telemetry, keyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LwM2mResourceObserve {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    observe: ").append(toIndentedString(observe)).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    telemetry: ").append(toIndentedString(telemetry)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `observe` to the URL query string
    if (getObserve() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sobserve%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getObserve()))));
    }

    // add `attribute` to the URL query string
    if (getAttribute() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sattribute%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAttribute()))));
    }

    // add `telemetry` to the URL query string
    if (getTelemetry() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stelemetry%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTelemetry()))));
    }

    // add `keyName` to the URL query string
    if (getKeyName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%skeyName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getKeyName()))));
    }

    return joiner.toString();
  }
}

