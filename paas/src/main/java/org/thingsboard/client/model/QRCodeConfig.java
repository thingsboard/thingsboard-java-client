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
import org.thingsboard.client.model.BadgePosition;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * QRCodeConfig
 */
@JsonPropertyOrder({
  QRCodeConfig.JSON_PROPERTY_SHOW_ON_HOME_PAGE,
  QRCodeConfig.JSON_PROPERTY_BADGE_ENABLED,
  QRCodeConfig.JSON_PROPERTY_QR_CODE_LABEL_ENABLED,
  QRCodeConfig.JSON_PROPERTY_BADGE_POSITION,
  QRCodeConfig.JSON_PROPERTY_QR_CODE_LABEL
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class QRCodeConfig {
  public static final String JSON_PROPERTY_SHOW_ON_HOME_PAGE = "showOnHomePage";
  @Nullable
  private Boolean showOnHomePage;

  public static final String JSON_PROPERTY_BADGE_ENABLED = "badgeEnabled";
  @Nullable
  private Boolean badgeEnabled;

  public static final String JSON_PROPERTY_QR_CODE_LABEL_ENABLED = "qrCodeLabelEnabled";
  @Nullable
  private Boolean qrCodeLabelEnabled;

  public static final String JSON_PROPERTY_BADGE_POSITION = "badgePosition";
  @Nullable
  private BadgePosition badgePosition;

  public static final String JSON_PROPERTY_QR_CODE_LABEL = "qrCodeLabel";
  @Nullable
  private String qrCodeLabel;

  public QRCodeConfig() { 
  }

  public QRCodeConfig showOnHomePage(@Nullable Boolean showOnHomePage) {
    this.showOnHomePage = showOnHomePage;
    return this;
  }

  /**
   * Get showOnHomePage
   * @return showOnHomePage
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW_ON_HOME_PAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowOnHomePage() {
    return showOnHomePage;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW_ON_HOME_PAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowOnHomePage(@Nullable Boolean showOnHomePage) {
    this.showOnHomePage = showOnHomePage;
  }


  public QRCodeConfig badgeEnabled(@Nullable Boolean badgeEnabled) {
    this.badgeEnabled = badgeEnabled;
    return this;
  }

  /**
   * Get badgeEnabled
   * @return badgeEnabled
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_BADGE_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getBadgeEnabled() {
    return badgeEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_BADGE_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBadgeEnabled(@Nullable Boolean badgeEnabled) {
    this.badgeEnabled = badgeEnabled;
  }


  public QRCodeConfig qrCodeLabelEnabled(@Nullable Boolean qrCodeLabelEnabled) {
    this.qrCodeLabelEnabled = qrCodeLabelEnabled;
    return this;
  }

  /**
   * Get qrCodeLabelEnabled
   * @return qrCodeLabelEnabled
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_QR_CODE_LABEL_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getQrCodeLabelEnabled() {
    return qrCodeLabelEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_QR_CODE_LABEL_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQrCodeLabelEnabled(@Nullable Boolean qrCodeLabelEnabled) {
    this.qrCodeLabelEnabled = qrCodeLabelEnabled;
  }


  public QRCodeConfig badgePosition(@Nullable BadgePosition badgePosition) {
    this.badgePosition = badgePosition;
    return this;
  }

  /**
   * Get badgePosition
   * @return badgePosition
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_BADGE_POSITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BadgePosition getBadgePosition() {
    return badgePosition;
  }


  @JsonProperty(value = JSON_PROPERTY_BADGE_POSITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBadgePosition(@Nullable BadgePosition badgePosition) {
    this.badgePosition = badgePosition;
  }


  public QRCodeConfig qrCodeLabel(@Nullable String qrCodeLabel) {
    this.qrCodeLabel = qrCodeLabel;
    return this;
  }

  /**
   * Get qrCodeLabel
   * @return qrCodeLabel
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_QR_CODE_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQrCodeLabel() {
    return qrCodeLabel;
  }


  @JsonProperty(value = JSON_PROPERTY_QR_CODE_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQrCodeLabel(@Nullable String qrCodeLabel) {
    this.qrCodeLabel = qrCodeLabel;
  }


  /**
   * Return true if this QRCodeConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QRCodeConfig qrCodeConfig = (QRCodeConfig) o;
    return Objects.equals(this.showOnHomePage, qrCodeConfig.showOnHomePage) &&
        Objects.equals(this.badgeEnabled, qrCodeConfig.badgeEnabled) &&
        Objects.equals(this.qrCodeLabelEnabled, qrCodeConfig.qrCodeLabelEnabled) &&
        Objects.equals(this.badgePosition, qrCodeConfig.badgePosition) &&
        Objects.equals(this.qrCodeLabel, qrCodeConfig.qrCodeLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showOnHomePage, badgeEnabled, qrCodeLabelEnabled, badgePosition, qrCodeLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QRCodeConfig {\n");
    sb.append("    showOnHomePage: ").append(toIndentedString(showOnHomePage)).append("\n");
    sb.append("    badgeEnabled: ").append(toIndentedString(badgeEnabled)).append("\n");
    sb.append("    qrCodeLabelEnabled: ").append(toIndentedString(qrCodeLabelEnabled)).append("\n");
    sb.append("    badgePosition: ").append(toIndentedString(badgePosition)).append("\n");
    sb.append("    qrCodeLabel: ").append(toIndentedString(qrCodeLabel)).append("\n");
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

    // add `showOnHomePage` to the URL query string
    if (getShowOnHomePage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshowOnHomePage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowOnHomePage()))));
    }

    // add `badgeEnabled` to the URL query string
    if (getBadgeEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbadgeEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBadgeEnabled()))));
    }

    // add `qrCodeLabelEnabled` to the URL query string
    if (getQrCodeLabelEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sqrCodeLabelEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getQrCodeLabelEnabled()))));
    }

    // add `badgePosition` to the URL query string
    if (getBadgePosition() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbadgePosition%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBadgePosition()))));
    }

    // add `qrCodeLabel` to the URL query string
    if (getQrCodeLabel() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sqrCodeLabel%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getQrCodeLabel()))));
    }

    return joiner.toString();
  }
}

