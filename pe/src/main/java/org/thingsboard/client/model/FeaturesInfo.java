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
 * FeaturesInfo
 */
@JsonPropertyOrder({
  FeaturesInfo.JSON_PROPERTY_OAUTH_ENABLED,
  FeaturesInfo.JSON_PROPERTY_SMS_ENABLED,
  FeaturesInfo.JSON_PROPERTY_WHITE_LABELING_ENABLED,
  FeaturesInfo.JSON_PROPERTY_NOTIFICATION_ENABLED,
  FeaturesInfo.JSON_PROPERTY_TWO_FA_ENABLED,
  FeaturesInfo.JSON_PROPERTY_EMAIL_ENABLED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class FeaturesInfo {
  public static final String JSON_PROPERTY_OAUTH_ENABLED = "oauthEnabled";
  @javax.annotation.Nullable
  private Boolean oauthEnabled;

  public static final String JSON_PROPERTY_SMS_ENABLED = "smsEnabled";
  @javax.annotation.Nullable
  private Boolean smsEnabled;

  public static final String JSON_PROPERTY_WHITE_LABELING_ENABLED = "whiteLabelingEnabled";
  @javax.annotation.Nullable
  private Boolean whiteLabelingEnabled;

  public static final String JSON_PROPERTY_NOTIFICATION_ENABLED = "notificationEnabled";
  @javax.annotation.Nullable
  private Boolean notificationEnabled;

  public static final String JSON_PROPERTY_TWO_FA_ENABLED = "twoFaEnabled";
  @javax.annotation.Nullable
  private Boolean twoFaEnabled;

  public static final String JSON_PROPERTY_EMAIL_ENABLED = "emailEnabled";
  @javax.annotation.Nullable
  private Boolean emailEnabled;

  public FeaturesInfo() { 
  }

  public FeaturesInfo oauthEnabled(@javax.annotation.Nullable Boolean oauthEnabled) {
    this.oauthEnabled = oauthEnabled;
    return this;
  }

  /**
   * Get oauthEnabled
   * @return oauthEnabled
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OAUTH_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getOauthEnabled() {
    return oauthEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_OAUTH_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOauthEnabled(@javax.annotation.Nullable Boolean oauthEnabled) {
    this.oauthEnabled = oauthEnabled;
  }


  public FeaturesInfo smsEnabled(@javax.annotation.Nullable Boolean smsEnabled) {
    this.smsEnabled = smsEnabled;
    return this;
  }

  /**
   * Get smsEnabled
   * @return smsEnabled
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SMS_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSmsEnabled() {
    return smsEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_SMS_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSmsEnabled(@javax.annotation.Nullable Boolean smsEnabled) {
    this.smsEnabled = smsEnabled;
  }


  public FeaturesInfo whiteLabelingEnabled(@javax.annotation.Nullable Boolean whiteLabelingEnabled) {
    this.whiteLabelingEnabled = whiteLabelingEnabled;
    return this;
  }

  /**
   * Get whiteLabelingEnabled
   * @return whiteLabelingEnabled
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_WHITE_LABELING_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getWhiteLabelingEnabled() {
    return whiteLabelingEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_WHITE_LABELING_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWhiteLabelingEnabled(@javax.annotation.Nullable Boolean whiteLabelingEnabled) {
    this.whiteLabelingEnabled = whiteLabelingEnabled;
  }


  public FeaturesInfo notificationEnabled(@javax.annotation.Nullable Boolean notificationEnabled) {
    this.notificationEnabled = notificationEnabled;
    return this;
  }

  /**
   * Get notificationEnabled
   * @return notificationEnabled
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NOTIFICATION_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getNotificationEnabled() {
    return notificationEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_NOTIFICATION_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotificationEnabled(@javax.annotation.Nullable Boolean notificationEnabled) {
    this.notificationEnabled = notificationEnabled;
  }


  public FeaturesInfo twoFaEnabled(@javax.annotation.Nullable Boolean twoFaEnabled) {
    this.twoFaEnabled = twoFaEnabled;
    return this;
  }

  /**
   * Get twoFaEnabled
   * @return twoFaEnabled
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TWO_FA_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getTwoFaEnabled() {
    return twoFaEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_TWO_FA_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTwoFaEnabled(@javax.annotation.Nullable Boolean twoFaEnabled) {
    this.twoFaEnabled = twoFaEnabled;
  }


  public FeaturesInfo emailEnabled(@javax.annotation.Nullable Boolean emailEnabled) {
    this.emailEnabled = emailEnabled;
    return this;
  }

  /**
   * Get emailEnabled
   * @return emailEnabled
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EMAIL_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEmailEnabled() {
    return emailEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_EMAIL_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailEnabled(@javax.annotation.Nullable Boolean emailEnabled) {
    this.emailEnabled = emailEnabled;
  }


  /**
   * Return true if this FeaturesInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeaturesInfo featuresInfo = (FeaturesInfo) o;
    return Objects.equals(this.oauthEnabled, featuresInfo.oauthEnabled) &&
        Objects.equals(this.smsEnabled, featuresInfo.smsEnabled) &&
        Objects.equals(this.whiteLabelingEnabled, featuresInfo.whiteLabelingEnabled) &&
        Objects.equals(this.notificationEnabled, featuresInfo.notificationEnabled) &&
        Objects.equals(this.twoFaEnabled, featuresInfo.twoFaEnabled) &&
        Objects.equals(this.emailEnabled, featuresInfo.emailEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauthEnabled, smsEnabled, whiteLabelingEnabled, notificationEnabled, twoFaEnabled, emailEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturesInfo {\n");
    sb.append("    oauthEnabled: ").append(toIndentedString(oauthEnabled)).append("\n");
    sb.append("    smsEnabled: ").append(toIndentedString(smsEnabled)).append("\n");
    sb.append("    whiteLabelingEnabled: ").append(toIndentedString(whiteLabelingEnabled)).append("\n");
    sb.append("    notificationEnabled: ").append(toIndentedString(notificationEnabled)).append("\n");
    sb.append("    twoFaEnabled: ").append(toIndentedString(twoFaEnabled)).append("\n");
    sb.append("    emailEnabled: ").append(toIndentedString(emailEnabled)).append("\n");
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

    // add `oauthEnabled` to the URL query string
    if (getOauthEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%soauthEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOauthEnabled()))));
    }

    // add `smsEnabled` to the URL query string
    if (getSmsEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssmsEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSmsEnabled()))));
    }

    // add `whiteLabelingEnabled` to the URL query string
    if (getWhiteLabelingEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%swhiteLabelingEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getWhiteLabelingEnabled()))));
    }

    // add `notificationEnabled` to the URL query string
    if (getNotificationEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snotificationEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNotificationEnabled()))));
    }

    // add `twoFaEnabled` to the URL query string
    if (getTwoFaEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stwoFaEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTwoFaEnabled()))));
    }

    // add `emailEnabled` to the URL query string
    if (getEmailEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%semailEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEmailEnabled()))));
    }

    return joiner.toString();
  }
}

