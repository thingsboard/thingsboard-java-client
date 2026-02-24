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
import org.thingsboard.client.model.TwoFaProviderType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * TwoFaProviderInfo
 */
@JsonPropertyOrder({
  TwoFaProviderInfo.JSON_PROPERTY_TYPE,
  TwoFaProviderInfo.JSON_PROPERTY_IS_DEFAULT,
  TwoFaProviderInfo.JSON_PROPERTY_CONTACT,
  TwoFaProviderInfo.JSON_PROPERTY_MIN_VERIFICATION_CODE_SEND_PERIOD,
  TwoFaProviderInfo.JSON_PROPERTY_DEFAULT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class TwoFaProviderInfo {
  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private TwoFaProviderType type;

  public static final String JSON_PROPERTY_IS_DEFAULT = "isDefault";
  @javax.annotation.Nullable
  private Boolean isDefault;

  public static final String JSON_PROPERTY_CONTACT = "contact";
  @javax.annotation.Nullable
  private String contact;

  public static final String JSON_PROPERTY_MIN_VERIFICATION_CODE_SEND_PERIOD = "minVerificationCodeSendPeriod";
  @javax.annotation.Nullable
  private Integer minVerificationCodeSendPeriod;

  public static final String JSON_PROPERTY_DEFAULT = "default";
  @javax.annotation.Nullable
  private Boolean _default;

  public TwoFaProviderInfo() { 
  }

  public TwoFaProviderInfo type(@javax.annotation.Nullable TwoFaProviderType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TwoFaProviderType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable TwoFaProviderType type) {
    this.type = type;
  }


  public TwoFaProviderInfo isDefault(@javax.annotation.Nullable Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Get isDefault
   * @return isDefault
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_IS_DEFAULT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsDefault() {
    return isDefault;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_DEFAULT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDefault(@javax.annotation.Nullable Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public TwoFaProviderInfo contact(@javax.annotation.Nullable String contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   * @return contact
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CONTACT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getContact() {
    return contact;
  }


  @JsonProperty(value = JSON_PROPERTY_CONTACT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContact(@javax.annotation.Nullable String contact) {
    this.contact = contact;
  }


  public TwoFaProviderInfo minVerificationCodeSendPeriod(@javax.annotation.Nullable Integer minVerificationCodeSendPeriod) {
    this.minVerificationCodeSendPeriod = minVerificationCodeSendPeriod;
    return this;
  }

  /**
   * Get minVerificationCodeSendPeriod
   * @return minVerificationCodeSendPeriod
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MIN_VERIFICATION_CODE_SEND_PERIOD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMinVerificationCodeSendPeriod() {
    return minVerificationCodeSendPeriod;
  }


  @JsonProperty(value = JSON_PROPERTY_MIN_VERIFICATION_CODE_SEND_PERIOD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinVerificationCodeSendPeriod(@javax.annotation.Nullable Integer minVerificationCodeSendPeriod) {
    this.minVerificationCodeSendPeriod = minVerificationCodeSendPeriod;
  }


  public TwoFaProviderInfo _default(@javax.annotation.Nullable Boolean _default) {
    this._default = _default;
    return this;
  }

  /**
   * Get _default
   * @return _default
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEFAULT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDefault() {
    return _default;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFAULT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefault(@javax.annotation.Nullable Boolean _default) {
    this._default = _default;
  }


  /**
   * Return true if this TwoFaProviderInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwoFaProviderInfo twoFaProviderInfo = (TwoFaProviderInfo) o;
    return Objects.equals(this.type, twoFaProviderInfo.type) &&
        Objects.equals(this.isDefault, twoFaProviderInfo.isDefault) &&
        Objects.equals(this.contact, twoFaProviderInfo.contact) &&
        Objects.equals(this.minVerificationCodeSendPeriod, twoFaProviderInfo.minVerificationCodeSendPeriod) &&
        Objects.equals(this._default, twoFaProviderInfo._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, isDefault, contact, minVerificationCodeSendPeriod, _default);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwoFaProviderInfo {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    minVerificationCodeSendPeriod: ").append(toIndentedString(minVerificationCodeSendPeriod)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `isDefault` to the URL query string
    if (getIsDefault() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sisDefault%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIsDefault()))));
    }

    // add `contact` to the URL query string
    if (getContact() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scontact%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getContact()))));
    }

    // add `minVerificationCodeSendPeriod` to the URL query string
    if (getMinVerificationCodeSendPeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sminVerificationCodeSendPeriod%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMinVerificationCodeSendPeriod()))));
    }

    // add `default` to the URL query string
    if (getDefault() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdefault%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDefault()))));
    }

    return joiner.toString();
  }
}

