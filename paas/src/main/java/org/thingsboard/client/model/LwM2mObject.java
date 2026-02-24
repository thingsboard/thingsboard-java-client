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
import org.thingsboard.client.model.LwM2mInstance;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * LwM2mObject
 */
@JsonPropertyOrder({
  LwM2mObject.JSON_PROPERTY_ID,
  LwM2mObject.JSON_PROPERTY_KEY_ID,
  LwM2mObject.JSON_PROPERTY_NAME,
  LwM2mObject.JSON_PROPERTY_MULTIPLE,
  LwM2mObject.JSON_PROPERTY_MANDATORY,
  LwM2mObject.JSON_PROPERTY_INSTANCES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class LwM2mObject {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Integer id;

  public static final String JSON_PROPERTY_KEY_ID = "keyId";
  @javax.annotation.Nullable
  private String keyId;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_MULTIPLE = "multiple";
  @javax.annotation.Nullable
  private Boolean multiple;

  public static final String JSON_PROPERTY_MANDATORY = "mandatory";
  @javax.annotation.Nullable
  private Boolean mandatory;

  public static final String JSON_PROPERTY_INSTANCES = "instances";
  @javax.annotation.Nullable
  private List<LwM2mInstance> instances = new ArrayList<>();

  public LwM2mObject() { 
  }

  public LwM2mObject id(@javax.annotation.Nullable Integer id) {
    this.id = id;
    return this;
  }

  /**
   * LwM2M Object id.
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


  public LwM2mObject keyId(@javax.annotation.Nullable String keyId) {
    this.keyId = keyId;
    return this;
  }

  /**
   * LwM2M Object key id.
   * @return keyId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_KEY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKeyId() {
    return keyId;
  }


  @JsonProperty(value = JSON_PROPERTY_KEY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyId(@javax.annotation.Nullable String keyId) {
    this.keyId = keyId;
  }


  public LwM2mObject name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * LwM2M Object name.
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


  public LwM2mObject multiple(@javax.annotation.Nullable Boolean multiple) {
    this.multiple = multiple;
    return this;
  }

  /**
   * LwM2M Object multiple.
   * @return multiple
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MULTIPLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getMultiple() {
    return multiple;
  }


  @JsonProperty(value = JSON_PROPERTY_MULTIPLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMultiple(@javax.annotation.Nullable Boolean multiple) {
    this.multiple = multiple;
  }


  public LwM2mObject mandatory(@javax.annotation.Nullable Boolean mandatory) {
    this.mandatory = mandatory;
    return this;
  }

  /**
   * LwM2M Object mandatory.
   * @return mandatory
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MANDATORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getMandatory() {
    return mandatory;
  }


  @JsonProperty(value = JSON_PROPERTY_MANDATORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMandatory(@javax.annotation.Nullable Boolean mandatory) {
    this.mandatory = mandatory;
  }


  public LwM2mObject instances(@javax.annotation.Nullable List<LwM2mInstance> instances) {
    this.instances = instances;
    return this;
  }

  public LwM2mObject addInstancesItem(LwM2mInstance instancesItem) {
    if (this.instances == null) {
      this.instances = new ArrayList<>();
    }
    this.instances.add(instancesItem);
    return this;
  }

  /**
   * LwM2M Object instances.
   * @return instances
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INSTANCES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LwM2mInstance> getInstances() {
    return instances;
  }


  @JsonProperty(value = JSON_PROPERTY_INSTANCES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstances(@javax.annotation.Nullable List<LwM2mInstance> instances) {
    this.instances = instances;
  }


  /**
   * Return true if this LwM2mObject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LwM2mObject lwM2mObject = (LwM2mObject) o;
    return Objects.equals(this.id, lwM2mObject.id) &&
        Objects.equals(this.keyId, lwM2mObject.keyId) &&
        Objects.equals(this.name, lwM2mObject.name) &&
        Objects.equals(this.multiple, lwM2mObject.multiple) &&
        Objects.equals(this.mandatory, lwM2mObject.mandatory) &&
        Objects.equals(this.instances, lwM2mObject.instances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, keyId, name, multiple, mandatory, instances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LwM2mObject {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    multiple: ").append(toIndentedString(multiple)).append("\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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

    // add `keyId` to the URL query string
    if (getKeyId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%skeyId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getKeyId()))));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `multiple` to the URL query string
    if (getMultiple() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smultiple%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMultiple()))));
    }

    // add `mandatory` to the URL query string
    if (getMandatory() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smandatory%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMandatory()))));
    }

    // add `instances` to the URL query string
    if (getInstances() != null) {
      for (int i = 0; i < getInstances().size(); i++) {
        if (getInstances().get(i) != null) {
          joiner.add(getInstances().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sinstances%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

