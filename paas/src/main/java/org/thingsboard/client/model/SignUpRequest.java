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
import java.util.HashMap;
import java.util.Map;
import org.thingsboard.client.model.PlatformType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the signup request.
 */
@JsonPropertyOrder({
  SignUpRequest.JSON_PROPERTY_FIELDS,
  SignUpRequest.JSON_PROPERTY_RECAPTCHA_RESPONSE,
  SignUpRequest.JSON_PROPERTY_PKG_NAME,
  SignUpRequest.JSON_PROPERTY_PLATFORM,
  SignUpRequest.JSON_PROPERTY_APP_SECRET
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class SignUpRequest {
  public static final String JSON_PROPERTY_FIELDS = "fields";
  @javax.annotation.Nullable
  private Map<String, String> fields = new HashMap<>();

  public static final String JSON_PROPERTY_RECAPTCHA_RESPONSE = "recaptchaResponse";
  @javax.annotation.Nullable
  private String recaptchaResponse;

  public static final String JSON_PROPERTY_PKG_NAME = "pkgName";
  @javax.annotation.Nullable
  private String pkgName;

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  @javax.annotation.Nullable
  private PlatformType platform;

  public static final String JSON_PROPERTY_APP_SECRET = "appSecret";
  @javax.annotation.Nullable
  private String appSecret;

  public SignUpRequest() { 
  }

  public SignUpRequest fields(@javax.annotation.Nullable Map<String, String> fields) {
    this.fields = fields;
    return this;
  }

  public SignUpRequest putFieldsItem(String key, String fieldsItem) {
    if (this.fields == null) {
      this.fields = new HashMap<>();
    }
    this.fields.put(key, fieldsItem);
    return this;
  }

  /**
   * List of sign-up form fields
   * @return fields
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FIELDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getFields() {
    return fields;
  }


  @JsonProperty(value = JSON_PROPERTY_FIELDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFields(@javax.annotation.Nullable Map<String, String> fields) {
    this.fields = fields;
  }


  public SignUpRequest recaptchaResponse(@javax.annotation.Nullable String recaptchaResponse) {
    this.recaptchaResponse = recaptchaResponse;
    return this;
  }

  /**
   * Response from reCAPTCHA validation
   * @return recaptchaResponse
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RECAPTCHA_RESPONSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRecaptchaResponse() {
    return recaptchaResponse;
  }


  @JsonProperty(value = JSON_PROPERTY_RECAPTCHA_RESPONSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecaptchaResponse(@javax.annotation.Nullable String recaptchaResponse) {
    this.recaptchaResponse = recaptchaResponse;
  }


  public SignUpRequest pkgName(@javax.annotation.Nullable String pkgName) {
    this.pkgName = pkgName;
    return this;
  }

  /**
   * For mobile apps only. Mobile app package name
   * @return pkgName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PKG_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPkgName() {
    return pkgName;
  }


  @JsonProperty(value = JSON_PROPERTY_PKG_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPkgName(@javax.annotation.Nullable String pkgName) {
    this.pkgName = pkgName;
  }


  public SignUpRequest platform(@javax.annotation.Nullable PlatformType platform) {
    this.platform = platform;
    return this;
  }

  /**
   * For mobile apps only. Mobile app package platform
   * @return platform
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PLATFORM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PlatformType getPlatform() {
    return platform;
  }


  @JsonProperty(value = JSON_PROPERTY_PLATFORM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatform(@javax.annotation.Nullable PlatformType platform) {
    this.platform = platform;
  }


  public SignUpRequest appSecret(@javax.annotation.Nullable String appSecret) {
    this.appSecret = appSecret;
    return this;
  }

  /**
   * For mobile apps only. Mobile app secret
   * @return appSecret
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_APP_SECRET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAppSecret() {
    return appSecret;
  }


  @JsonProperty(value = JSON_PROPERTY_APP_SECRET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppSecret(@javax.annotation.Nullable String appSecret) {
    this.appSecret = appSecret;
  }


  /**
   * Return true if this SignUpRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignUpRequest signUpRequest = (SignUpRequest) o;
    return Objects.equals(this.fields, signUpRequest.fields) &&
        Objects.equals(this.recaptchaResponse, signUpRequest.recaptchaResponse) &&
        Objects.equals(this.pkgName, signUpRequest.pkgName) &&
        Objects.equals(this.platform, signUpRequest.platform) &&
        Objects.equals(this.appSecret, signUpRequest.appSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, recaptchaResponse, pkgName, platform, appSecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignUpRequest {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    recaptchaResponse: ").append(toIndentedString(recaptchaResponse)).append("\n");
    sb.append("    pkgName: ").append(toIndentedString(pkgName)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    appSecret: ").append(toIndentedString(appSecret)).append("\n");
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

    // add `fields` to the URL query string
    if (getFields() != null) {
      for (String _key : getFields().keySet()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%sfields%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix),
            getFields().get(_key), ApiClient.urlEncode(ApiClient.valueToString(getFields().get(_key)))));
      }
    }

    // add `recaptchaResponse` to the URL query string
    if (getRecaptchaResponse() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srecaptchaResponse%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRecaptchaResponse()))));
    }

    // add `pkgName` to the URL query string
    if (getPkgName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spkgName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPkgName()))));
    }

    // add `platform` to the URL query string
    if (getPlatform() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%splatform%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPlatform()))));
    }

    // add `appSecret` to the URL query string
    if (getAppSecret() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sappSecret%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAppSecret()))));
    }

    return joiner.toString();
  }
}

