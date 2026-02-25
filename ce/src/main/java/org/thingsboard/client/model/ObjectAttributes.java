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
import org.openapitools.jackson.nullable.JsonNullable;
import org.thingsboard.client.model.LwM2mVersion;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * ObjectAttributes
 */
@JsonPropertyOrder({
  ObjectAttributes.JSON_PROPERTY_DIM,
  ObjectAttributes.JSON_PROPERTY_SSID,
  ObjectAttributes.JSON_PROPERTY_URI,
  ObjectAttributes.JSON_PROPERTY_VER,
  ObjectAttributes.JSON_PROPERTY_LWM2M,
  ObjectAttributes.JSON_PROPERTY_PMIN,
  ObjectAttributes.JSON_PROPERTY_PMAX,
  ObjectAttributes.JSON_PROPERTY_GT,
  ObjectAttributes.JSON_PROPERTY_LT,
  ObjectAttributes.JSON_PROPERTY_ST,
  ObjectAttributes.JSON_PROPERTY_EPMIN,
  ObjectAttributes.JSON_PROPERTY_EPMAX
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class ObjectAttributes {
  public static final String JSON_PROPERTY_DIM = "dim";
  @javax.annotation.Nullable
  private Long dim;

  public static final String JSON_PROPERTY_SSID = "ssid";
  @javax.annotation.Nullable
  private Long ssid;

  public static final String JSON_PROPERTY_URI = "uri";
  @javax.annotation.Nullable
  private String uri;

  public static final String JSON_PROPERTY_VER = "ver";
  private JsonNullable<Object> ver = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LWM2M = "lwm2m";
  @javax.annotation.Nullable
  private LwM2mVersion lwm2m;

  public static final String JSON_PROPERTY_PMIN = "pmin";
  @javax.annotation.Nullable
  private Long pmin;

  public static final String JSON_PROPERTY_PMAX = "pmax";
  @javax.annotation.Nullable
  private Long pmax;

  public static final String JSON_PROPERTY_GT = "gt";
  @javax.annotation.Nullable
  private Double gt;

  public static final String JSON_PROPERTY_LT = "lt";
  @javax.annotation.Nullable
  private Double lt;

  public static final String JSON_PROPERTY_ST = "st";
  @javax.annotation.Nullable
  private Double st;

  public static final String JSON_PROPERTY_EPMIN = "epmin";
  @javax.annotation.Nullable
  private Long epmin;

  public static final String JSON_PROPERTY_EPMAX = "epmax";
  @javax.annotation.Nullable
  private Long epmax;

  public ObjectAttributes() { 
  }

  public ObjectAttributes dim(@javax.annotation.Nullable Long dim) {
    this.dim = dim;
    return this;
  }

  /**
   * Get dim
   * @return dim
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DIM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDim() {
    return dim;
  }


  @JsonProperty(value = JSON_PROPERTY_DIM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDim(@javax.annotation.Nullable Long dim) {
    this.dim = dim;
  }


  public ObjectAttributes ssid(@javax.annotation.Nullable Long ssid) {
    this.ssid = ssid;
    return this;
  }

  /**
   * Get ssid
   * @return ssid
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SSID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSsid() {
    return ssid;
  }


  @JsonProperty(value = JSON_PROPERTY_SSID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSsid(@javax.annotation.Nullable Long ssid) {
    this.ssid = ssid;
  }


  public ObjectAttributes uri(@javax.annotation.Nullable String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * Get uri
   * @return uri
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_URI, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUri() {
    return uri;
  }


  @JsonProperty(value = JSON_PROPERTY_URI, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUri(@javax.annotation.Nullable String uri) {
    this.uri = uri;
  }


  public ObjectAttributes ver(@javax.annotation.Nullable Object ver) {
    this.ver = JsonNullable.<Object>of(ver);
    return this;
  }

  /**
   * Get ver
   * @return ver
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public Object getVer() {
        return ver.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_VER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getVer_JsonNullable() {
    return ver;
  }
  
  @JsonProperty(JSON_PROPERTY_VER)
  public void setVer_JsonNullable(JsonNullable<Object> ver) {
    this.ver = ver;
  }

  public void setVer(@javax.annotation.Nullable Object ver) {
    this.ver = JsonNullable.<Object>of(ver);
  }


  public ObjectAttributes lwm2m(@javax.annotation.Nullable LwM2mVersion lwm2m) {
    this.lwm2m = lwm2m;
    return this;
  }

  /**
   * Get lwm2m
   * @return lwm2m
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LWM2M, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LwM2mVersion getLwm2m() {
    return lwm2m;
  }


  @JsonProperty(value = JSON_PROPERTY_LWM2M, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLwm2m(@javax.annotation.Nullable LwM2mVersion lwm2m) {
    this.lwm2m = lwm2m;
  }


  public ObjectAttributes pmin(@javax.annotation.Nullable Long pmin) {
    this.pmin = pmin;
    return this;
  }

  /**
   * Get pmin
   * @return pmin
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PMIN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPmin() {
    return pmin;
  }


  @JsonProperty(value = JSON_PROPERTY_PMIN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPmin(@javax.annotation.Nullable Long pmin) {
    this.pmin = pmin;
  }


  public ObjectAttributes pmax(@javax.annotation.Nullable Long pmax) {
    this.pmax = pmax;
    return this;
  }

  /**
   * Get pmax
   * @return pmax
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PMAX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPmax() {
    return pmax;
  }


  @JsonProperty(value = JSON_PROPERTY_PMAX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPmax(@javax.annotation.Nullable Long pmax) {
    this.pmax = pmax;
  }


  public ObjectAttributes gt(@javax.annotation.Nullable Double gt) {
    this.gt = gt;
    return this;
  }

  /**
   * Get gt
   * @return gt
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getGt() {
    return gt;
  }


  @JsonProperty(value = JSON_PROPERTY_GT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGt(@javax.annotation.Nullable Double gt) {
    this.gt = gt;
  }


  public ObjectAttributes lt(@javax.annotation.Nullable Double lt) {
    this.lt = lt;
    return this;
  }

  /**
   * Get lt
   * @return lt
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLt() {
    return lt;
  }


  @JsonProperty(value = JSON_PROPERTY_LT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLt(@javax.annotation.Nullable Double lt) {
    this.lt = lt;
  }


  public ObjectAttributes st(@javax.annotation.Nullable Double st) {
    this.st = st;
    return this;
  }

  /**
   * Get st
   * @return st
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSt() {
    return st;
  }


  @JsonProperty(value = JSON_PROPERTY_ST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSt(@javax.annotation.Nullable Double st) {
    this.st = st;
  }


  public ObjectAttributes epmin(@javax.annotation.Nullable Long epmin) {
    this.epmin = epmin;
    return this;
  }

  /**
   * Get epmin
   * @return epmin
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EPMIN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEpmin() {
    return epmin;
  }


  @JsonProperty(value = JSON_PROPERTY_EPMIN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEpmin(@javax.annotation.Nullable Long epmin) {
    this.epmin = epmin;
  }


  public ObjectAttributes epmax(@javax.annotation.Nullable Long epmax) {
    this.epmax = epmax;
    return this;
  }

  /**
   * Get epmax
   * @return epmax
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EPMAX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEpmax() {
    return epmax;
  }


  @JsonProperty(value = JSON_PROPERTY_EPMAX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEpmax(@javax.annotation.Nullable Long epmax) {
    this.epmax = epmax;
  }


  /**
   * Return true if this ObjectAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectAttributes objectAttributes = (ObjectAttributes) o;
    return Objects.equals(this.dim, objectAttributes.dim) &&
        Objects.equals(this.ssid, objectAttributes.ssid) &&
        Objects.equals(this.uri, objectAttributes.uri) &&
        equalsNullable(this.ver, objectAttributes.ver) &&
        Objects.equals(this.lwm2m, objectAttributes.lwm2m) &&
        Objects.equals(this.pmin, objectAttributes.pmin) &&
        Objects.equals(this.pmax, objectAttributes.pmax) &&
        Objects.equals(this.gt, objectAttributes.gt) &&
        Objects.equals(this.lt, objectAttributes.lt) &&
        Objects.equals(this.st, objectAttributes.st) &&
        Objects.equals(this.epmin, objectAttributes.epmin) &&
        Objects.equals(this.epmax, objectAttributes.epmax);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dim, ssid, uri, hashCodeNullable(ver), lwm2m, pmin, pmax, gt, lt, st, epmin, epmax);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectAttributes {\n");
    sb.append("    dim: ").append(toIndentedString(dim)).append("\n");
    sb.append("    ssid: ").append(toIndentedString(ssid)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    ver: ").append(toIndentedString(ver)).append("\n");
    sb.append("    lwm2m: ").append(toIndentedString(lwm2m)).append("\n");
    sb.append("    pmin: ").append(toIndentedString(pmin)).append("\n");
    sb.append("    pmax: ").append(toIndentedString(pmax)).append("\n");
    sb.append("    gt: ").append(toIndentedString(gt)).append("\n");
    sb.append("    lt: ").append(toIndentedString(lt)).append("\n");
    sb.append("    st: ").append(toIndentedString(st)).append("\n");
    sb.append("    epmin: ").append(toIndentedString(epmin)).append("\n");
    sb.append("    epmax: ").append(toIndentedString(epmax)).append("\n");
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

    // add `dim` to the URL query string
    if (getDim() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdim%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDim()))));
    }

    // add `ssid` to the URL query string
    if (getSsid() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sssid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSsid()))));
    }

    // add `uri` to the URL query string
    if (getUri() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%suri%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUri()))));
    }

    // add `ver` to the URL query string
    if (getVer() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sver%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVer()))));
    }

    // add `lwm2m` to the URL query string
    if (getLwm2m() != null) {
      joiner.add(getLwm2m().toUrlQueryString(prefix + "lwm2m" + suffix));
    }

    // add `pmin` to the URL query string
    if (getPmin() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spmin%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPmin()))));
    }

    // add `pmax` to the URL query string
    if (getPmax() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spmax%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPmax()))));
    }

    // add `gt` to the URL query string
    if (getGt() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sgt%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getGt()))));
    }

    // add `lt` to the URL query string
    if (getLt() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slt%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLt()))));
    }

    // add `st` to the URL query string
    if (getSt() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sst%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSt()))));
    }

    // add `epmin` to the URL query string
    if (getEpmin() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sepmin%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEpmin()))));
    }

    // add `epmax` to the URL query string
    if (getEpmax() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sepmax%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEpmax()))));
    }

    return joiner.toString();
  }
}

