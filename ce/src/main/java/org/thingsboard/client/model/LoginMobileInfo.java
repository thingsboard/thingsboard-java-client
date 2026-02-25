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
import org.thingsboard.client.model.MobileAppVersionInfo;
import org.thingsboard.client.model.OAuth2ClientLoginInfo;
import org.thingsboard.client.model.StoreInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * LoginMobileInfo
 */
@JsonPropertyOrder({
  LoginMobileInfo.JSON_PROPERTY_O_AUTH2_CLIENT_LOGIN_INFOS,
  LoginMobileInfo.JSON_PROPERTY_STORE_INFO,
  LoginMobileInfo.JSON_PROPERTY_VERSION_INFO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class LoginMobileInfo {
  public static final String JSON_PROPERTY_O_AUTH2_CLIENT_LOGIN_INFOS = "oAuth2ClientLoginInfos";
  @javax.annotation.Nullable
  private List<OAuth2ClientLoginInfo> oAuth2ClientLoginInfos = new ArrayList<>();

  public static final String JSON_PROPERTY_STORE_INFO = "storeInfo";
  @javax.annotation.Nullable
  private StoreInfo storeInfo;

  public static final String JSON_PROPERTY_VERSION_INFO = "versionInfo";
  @javax.annotation.Nullable
  private MobileAppVersionInfo versionInfo;

  public LoginMobileInfo() { 
  }

  public LoginMobileInfo oAuth2ClientLoginInfos(@javax.annotation.Nullable List<OAuth2ClientLoginInfo> oAuth2ClientLoginInfos) {
    this.oAuth2ClientLoginInfos = oAuth2ClientLoginInfos;
    return this;
  }

  public LoginMobileInfo addOAuth2ClientLoginInfosItem(OAuth2ClientLoginInfo oAuth2ClientLoginInfosItem) {
    if (this.oAuth2ClientLoginInfos == null) {
      this.oAuth2ClientLoginInfos = new ArrayList<>();
    }
    this.oAuth2ClientLoginInfos.add(oAuth2ClientLoginInfosItem);
    return this;
  }

  /**
   * Get oAuth2ClientLoginInfos
   * @return oAuth2ClientLoginInfos
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_O_AUTH2_CLIENT_LOGIN_INFOS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<OAuth2ClientLoginInfo> getoAuth2ClientLoginInfos() {
    return oAuth2ClientLoginInfos;
  }


  @JsonProperty(value = JSON_PROPERTY_O_AUTH2_CLIENT_LOGIN_INFOS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setoAuth2ClientLoginInfos(@javax.annotation.Nullable List<OAuth2ClientLoginInfo> oAuth2ClientLoginInfos) {
    this.oAuth2ClientLoginInfos = oAuth2ClientLoginInfos;
  }


  public LoginMobileInfo storeInfo(@javax.annotation.Nullable StoreInfo storeInfo) {
    this.storeInfo = storeInfo;
    return this;
  }

  /**
   * Get storeInfo
   * @return storeInfo
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_STORE_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public StoreInfo getStoreInfo() {
    return storeInfo;
  }


  @JsonProperty(value = JSON_PROPERTY_STORE_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoreInfo(@javax.annotation.Nullable StoreInfo storeInfo) {
    this.storeInfo = storeInfo;
  }


  public LoginMobileInfo versionInfo(@javax.annotation.Nullable MobileAppVersionInfo versionInfo) {
    this.versionInfo = versionInfo;
    return this;
  }

  /**
   * Get versionInfo
   * @return versionInfo
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_VERSION_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MobileAppVersionInfo getVersionInfo() {
    return versionInfo;
  }


  @JsonProperty(value = JSON_PROPERTY_VERSION_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersionInfo(@javax.annotation.Nullable MobileAppVersionInfo versionInfo) {
    this.versionInfo = versionInfo;
  }


  /**
   * Return true if this LoginMobileInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginMobileInfo loginMobileInfo = (LoginMobileInfo) o;
    return Objects.equals(this.oAuth2ClientLoginInfos, loginMobileInfo.oAuth2ClientLoginInfos) &&
        Objects.equals(this.storeInfo, loginMobileInfo.storeInfo) &&
        Objects.equals(this.versionInfo, loginMobileInfo.versionInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oAuth2ClientLoginInfos, storeInfo, versionInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginMobileInfo {\n");
    sb.append("    oAuth2ClientLoginInfos: ").append(toIndentedString(oAuth2ClientLoginInfos)).append("\n");
    sb.append("    storeInfo: ").append(toIndentedString(storeInfo)).append("\n");
    sb.append("    versionInfo: ").append(toIndentedString(versionInfo)).append("\n");
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

    // add `oAuth2ClientLoginInfos` to the URL query string
    if (getoAuth2ClientLoginInfos() != null) {
      for (int i = 0; i < getoAuth2ClientLoginInfos().size(); i++) {
        if (getoAuth2ClientLoginInfos().get(i) != null) {
          joiner.add(getoAuth2ClientLoginInfos().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%soAuth2ClientLoginInfos%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `storeInfo` to the URL query string
    if (getStoreInfo() != null) {
      joiner.add(getStoreInfo().toUrlQueryString(prefix + "storeInfo" + suffix));
    }

    // add `versionInfo` to the URL query string
    if (getVersionInfo() != null) {
      joiner.add(getVersionInfo().toUrlQueryString(prefix + "versionInfo" + suffix));
    }

    return joiner.toString();
  }
}

