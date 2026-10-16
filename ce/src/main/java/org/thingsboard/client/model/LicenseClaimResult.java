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
import org.thingsboard.client.model.LicenseClaimMode;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * LicenseClaimResult
 */
@JsonPropertyOrder({
  LicenseClaimResult.JSON_PROPERTY_SIGN_UP_URL,
  LicenseClaimResult.JSON_PROPERTY_MODE,
  LicenseClaimResult.JSON_PROPERTY_CLAIM_TOKEN
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class LicenseClaimResult {
  public static final String JSON_PROPERTY_SIGN_UP_URL = "signUpUrl";
  @Nullable
  private String signUpUrl;

  public static final String JSON_PROPERTY_MODE = "mode";
  @Nullable
  private LicenseClaimMode mode;

  public static final String JSON_PROPERTY_CLAIM_TOKEN = "claimToken";
  @Nullable
  private String claimToken;

  public LicenseClaimResult() { 
  }

  public LicenseClaimResult signUpUrl(@Nullable String signUpUrl) {
    this.signUpUrl = signUpUrl;
    return this;
  }

  /**
   * Get signUpUrl
   * @return signUpUrl
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SIGN_UP_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSignUpUrl() {
    return signUpUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_SIGN_UP_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignUpUrl(@Nullable String signUpUrl) {
    this.signUpUrl = signUpUrl;
  }


  public LicenseClaimResult mode(@Nullable LicenseClaimMode mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * @return mode
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MODE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LicenseClaimMode getMode() {
    return mode;
  }


  @JsonProperty(value = JSON_PROPERTY_MODE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMode(@Nullable LicenseClaimMode mode) {
    this.mode = mode;
  }


  public LicenseClaimResult claimToken(@Nullable String claimToken) {
    this.claimToken = claimToken;
    return this;
  }

  /**
   * Get claimToken
   * @return claimToken
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CLAIM_TOKEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getClaimToken() {
    return claimToken;
  }


  @JsonProperty(value = JSON_PROPERTY_CLAIM_TOKEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClaimToken(@Nullable String claimToken) {
    this.claimToken = claimToken;
  }


  /**
   * Return true if this LicenseClaimResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseClaimResult licenseClaimResult = (LicenseClaimResult) o;
    return Objects.equals(this.signUpUrl, licenseClaimResult.signUpUrl) &&
        Objects.equals(this.mode, licenseClaimResult.mode) &&
        Objects.equals(this.claimToken, licenseClaimResult.claimToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signUpUrl, mode, claimToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseClaimResult {\n");
    sb.append("    signUpUrl: ").append(toIndentedString(signUpUrl)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    claimToken: ").append(toIndentedString(claimToken)).append("\n");
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

    // add `signUpUrl` to the URL query string
    if (getSignUpUrl() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssignUpUrl%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSignUpUrl()))));
    }

    // add `mode` to the URL query string
    if (getMode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smode%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMode()))));
    }

    // add `claimToken` to the URL query string
    if (getClaimToken() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sclaimToken%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getClaimToken()))));
    }

    return joiner.toString();
  }
}

