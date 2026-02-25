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
 * CaptchaClientParams
 */
@JsonPropertyOrder({
  CaptchaClientParams.JSON_PROPERTY_CAPTCHA_SITE_KEY,
  CaptchaClientParams.JSON_PROPERTY_CAPTCHA_VERSION,
  CaptchaClientParams.JSON_PROPERTY_CAPTCHA_ACTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class CaptchaClientParams {
  public static final String JSON_PROPERTY_CAPTCHA_SITE_KEY = "captchaSiteKey";
  @javax.annotation.Nullable
  private String captchaSiteKey;

  public static final String JSON_PROPERTY_CAPTCHA_VERSION = "captchaVersion";
  @javax.annotation.Nullable
  private String captchaVersion;

  public static final String JSON_PROPERTY_CAPTCHA_ACTION = "captchaAction";
  @javax.annotation.Nullable
  private String captchaAction;

  public CaptchaClientParams() { 
  }

  public CaptchaClientParams captchaSiteKey(@javax.annotation.Nullable String captchaSiteKey) {
    this.captchaSiteKey = captchaSiteKey;
    return this;
  }

  /**
   * Get captchaSiteKey
   * @return captchaSiteKey
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CAPTCHA_SITE_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCaptchaSiteKey() {
    return captchaSiteKey;
  }


  @JsonProperty(value = JSON_PROPERTY_CAPTCHA_SITE_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCaptchaSiteKey(@javax.annotation.Nullable String captchaSiteKey) {
    this.captchaSiteKey = captchaSiteKey;
  }


  public CaptchaClientParams captchaVersion(@javax.annotation.Nullable String captchaVersion) {
    this.captchaVersion = captchaVersion;
    return this;
  }

  /**
   * Get captchaVersion
   * @return captchaVersion
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CAPTCHA_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCaptchaVersion() {
    return captchaVersion;
  }


  @JsonProperty(value = JSON_PROPERTY_CAPTCHA_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCaptchaVersion(@javax.annotation.Nullable String captchaVersion) {
    this.captchaVersion = captchaVersion;
  }


  public CaptchaClientParams captchaAction(@javax.annotation.Nullable String captchaAction) {
    this.captchaAction = captchaAction;
    return this;
  }

  /**
   * Get captchaAction
   * @return captchaAction
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CAPTCHA_ACTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCaptchaAction() {
    return captchaAction;
  }


  @JsonProperty(value = JSON_PROPERTY_CAPTCHA_ACTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCaptchaAction(@javax.annotation.Nullable String captchaAction) {
    this.captchaAction = captchaAction;
  }


  /**
   * Return true if this CaptchaClientParams object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaptchaClientParams captchaClientParams = (CaptchaClientParams) o;
    return Objects.equals(this.captchaSiteKey, captchaClientParams.captchaSiteKey) &&
        Objects.equals(this.captchaVersion, captchaClientParams.captchaVersion) &&
        Objects.equals(this.captchaAction, captchaClientParams.captchaAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(captchaSiteKey, captchaVersion, captchaAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaptchaClientParams {\n");
    sb.append("    captchaSiteKey: ").append(toIndentedString(captchaSiteKey)).append("\n");
    sb.append("    captchaVersion: ").append(toIndentedString(captchaVersion)).append("\n");
    sb.append("    captchaAction: ").append(toIndentedString(captchaAction)).append("\n");
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

    // add `captchaSiteKey` to the URL query string
    if (getCaptchaSiteKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scaptchaSiteKey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCaptchaSiteKey()))));
    }

    // add `captchaVersion` to the URL query string
    if (getCaptchaVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scaptchaVersion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCaptchaVersion()))));
    }

    // add `captchaAction` to the URL query string
    if (getCaptchaAction() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scaptchaAction%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCaptchaAction()))));
    }

    return joiner.toString();
  }
}

