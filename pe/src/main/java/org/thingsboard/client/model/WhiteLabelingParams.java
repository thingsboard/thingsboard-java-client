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
import org.thingsboard.client.model.Favicon;
import org.thingsboard.client.model.PaletteSettings;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the white labeling configuration
 */
@JsonPropertyOrder({
  WhiteLabelingParams.JSON_PROPERTY_LOGO_IMAGE_URL,
  WhiteLabelingParams.JSON_PROPERTY_LOGO_IMAGE_HEIGHT,
  WhiteLabelingParams.JSON_PROPERTY_APP_TITLE,
  WhiteLabelingParams.JSON_PROPERTY_FAVICON,
  WhiteLabelingParams.JSON_PROPERTY_PALETTE_SETTINGS,
  WhiteLabelingParams.JSON_PROPERTY_HELP_LINK_BASE_URL,
  WhiteLabelingParams.JSON_PROPERTY_UI_HELP_BASE_URL,
  WhiteLabelingParams.JSON_PROPERTY_ENABLE_HELP_LINKS,
  WhiteLabelingParams.JSON_PROPERTY_WHITE_LABELING_ENABLED,
  WhiteLabelingParams.JSON_PROPERTY_SHOW_NAME_VERSION,
  WhiteLabelingParams.JSON_PROPERTY_PLATFORM_NAME,
  WhiteLabelingParams.JSON_PROPERTY_PLATFORM_VERSION,
  WhiteLabelingParams.JSON_PROPERTY_CUSTOM_CSS,
  WhiteLabelingParams.JSON_PROPERTY_HIDE_CONNECTIVITY_DIALOG,
  WhiteLabelingParams.JSON_PROPERTY_OVERRIDE_TRENDZ_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class WhiteLabelingParams {
  public static final String JSON_PROPERTY_LOGO_IMAGE_URL = "logoImageUrl";
  @javax.annotation.Nullable
  private String logoImageUrl;

  public static final String JSON_PROPERTY_LOGO_IMAGE_HEIGHT = "logoImageHeight";
  @javax.annotation.Nullable
  private Integer logoImageHeight;

  public static final String JSON_PROPERTY_APP_TITLE = "appTitle";
  @javax.annotation.Nullable
  private String appTitle;

  public static final String JSON_PROPERTY_FAVICON = "favicon";
  @javax.annotation.Nullable
  private Favicon favicon;

  public static final String JSON_PROPERTY_PALETTE_SETTINGS = "paletteSettings";
  @javax.annotation.Nullable
  private PaletteSettings paletteSettings;

  public static final String JSON_PROPERTY_HELP_LINK_BASE_URL = "helpLinkBaseUrl";
  @javax.annotation.Nullable
  private String helpLinkBaseUrl;

  public static final String JSON_PROPERTY_UI_HELP_BASE_URL = "uiHelpBaseUrl";
  @javax.annotation.Nullable
  private String uiHelpBaseUrl;

  public static final String JSON_PROPERTY_ENABLE_HELP_LINKS = "enableHelpLinks";
  @javax.annotation.Nullable
  private Boolean enableHelpLinks;

  public static final String JSON_PROPERTY_WHITE_LABELING_ENABLED = "whiteLabelingEnabled";
  @javax.annotation.Nullable
  private Boolean whiteLabelingEnabled;

  public static final String JSON_PROPERTY_SHOW_NAME_VERSION = "showNameVersion";
  @javax.annotation.Nullable
  private Boolean showNameVersion;

  public static final String JSON_PROPERTY_PLATFORM_NAME = "platformName";
  @javax.annotation.Nullable
  private String platformName;

  public static final String JSON_PROPERTY_PLATFORM_VERSION = "platformVersion";
  @javax.annotation.Nullable
  private String platformVersion;

  public static final String JSON_PROPERTY_CUSTOM_CSS = "customCss";
  @javax.annotation.Nullable
  private String customCss;

  public static final String JSON_PROPERTY_HIDE_CONNECTIVITY_DIALOG = "hideConnectivityDialog";
  @javax.annotation.Nullable
  private Boolean hideConnectivityDialog;

  public static final String JSON_PROPERTY_OVERRIDE_TRENDZ_NAME = "overrideTrendzName";
  @javax.annotation.Nullable
  private Boolean overrideTrendzName;

  public WhiteLabelingParams() { 
  }

  @JsonCreator
  public WhiteLabelingParams(
    @JsonProperty(JSON_PROPERTY_WHITE_LABELING_ENABLED) Boolean whiteLabelingEnabled
  ) {
  this();
    this.whiteLabelingEnabled = whiteLabelingEnabled;
  }

  public WhiteLabelingParams logoImageUrl(@javax.annotation.Nullable String logoImageUrl) {
    this.logoImageUrl = logoImageUrl;
    return this;
  }

  /**
   * Logo image URL
   * @return logoImageUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LOGO_IMAGE_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLogoImageUrl() {
    return logoImageUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_LOGO_IMAGE_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogoImageUrl(@javax.annotation.Nullable String logoImageUrl) {
    this.logoImageUrl = logoImageUrl;
  }


  public WhiteLabelingParams logoImageHeight(@javax.annotation.Nullable Integer logoImageHeight) {
    this.logoImageHeight = logoImageHeight;
    return this;
  }

  /**
   * The height of a logo container. Logo image will be automatically scaled.
   * @return logoImageHeight
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LOGO_IMAGE_HEIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getLogoImageHeight() {
    return logoImageHeight;
  }


  @JsonProperty(value = JSON_PROPERTY_LOGO_IMAGE_HEIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogoImageHeight(@javax.annotation.Nullable Integer logoImageHeight) {
    this.logoImageHeight = logoImageHeight;
  }


  public WhiteLabelingParams appTitle(@javax.annotation.Nullable String appTitle) {
    this.appTitle = appTitle;
    return this;
  }

  /**
   * White-labeled name of the platform
   * @return appTitle
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_APP_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAppTitle() {
    return appTitle;
  }


  @JsonProperty(value = JSON_PROPERTY_APP_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppTitle(@javax.annotation.Nullable String appTitle) {
    this.appTitle = appTitle;
  }


  public WhiteLabelingParams favicon(@javax.annotation.Nullable Favicon favicon) {
    this.favicon = favicon;
    return this;
  }

  /**
   * JSON object that contains website icon url and type
   * @return favicon
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FAVICON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Favicon getFavicon() {
    return favicon;
  }


  @JsonProperty(value = JSON_PROPERTY_FAVICON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFavicon(@javax.annotation.Nullable Favicon favicon) {
    this.favicon = favicon;
  }


  public WhiteLabelingParams paletteSettings(@javax.annotation.Nullable PaletteSettings paletteSettings) {
    this.paletteSettings = paletteSettings;
    return this;
  }

  /**
   * Complex JSON that describes structure of the Angular Material Palette. See [theming](https://material.angular.io/guide/theming) for more details
   * @return paletteSettings
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PALETTE_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PaletteSettings getPaletteSettings() {
    return paletteSettings;
  }


  @JsonProperty(value = JSON_PROPERTY_PALETTE_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaletteSettings(@javax.annotation.Nullable PaletteSettings paletteSettings) {
    this.paletteSettings = paletteSettings;
  }


  public WhiteLabelingParams helpLinkBaseUrl(@javax.annotation.Nullable String helpLinkBaseUrl) {
    this.helpLinkBaseUrl = helpLinkBaseUrl;
    return this;
  }

  /**
   * Base URL for help link
   * @return helpLinkBaseUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_HELP_LINK_BASE_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHelpLinkBaseUrl() {
    return helpLinkBaseUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_HELP_LINK_BASE_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHelpLinkBaseUrl(@javax.annotation.Nullable String helpLinkBaseUrl) {
    this.helpLinkBaseUrl = helpLinkBaseUrl;
  }


  public WhiteLabelingParams uiHelpBaseUrl(@javax.annotation.Nullable String uiHelpBaseUrl) {
    this.uiHelpBaseUrl = uiHelpBaseUrl;
    return this;
  }

  /**
   * Base URL for the repository with the UI help components (markdown)
   * @return uiHelpBaseUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_UI_HELP_BASE_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUiHelpBaseUrl() {
    return uiHelpBaseUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_UI_HELP_BASE_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUiHelpBaseUrl(@javax.annotation.Nullable String uiHelpBaseUrl) {
    this.uiHelpBaseUrl = uiHelpBaseUrl;
  }


  public WhiteLabelingParams enableHelpLinks(@javax.annotation.Nullable Boolean enableHelpLinks) {
    this.enableHelpLinks = enableHelpLinks;
    return this;
  }

  /**
   * Enable or Disable help links
   * @return enableHelpLinks
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENABLE_HELP_LINKS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnableHelpLinks() {
    return enableHelpLinks;
  }


  @JsonProperty(value = JSON_PROPERTY_ENABLE_HELP_LINKS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableHelpLinks(@javax.annotation.Nullable Boolean enableHelpLinks) {
    this.enableHelpLinks = enableHelpLinks;
  }


  /**
   * Enable white-labeling
   * @return whiteLabelingEnabled
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_WHITE_LABELING_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getWhiteLabelingEnabled() {
    return whiteLabelingEnabled;
  }




  public WhiteLabelingParams showNameVersion(@javax.annotation.Nullable Boolean showNameVersion) {
    this.showNameVersion = showNameVersion;
    return this;
  }

  /**
   * Show platform name and version on UI and login screen
   * @return showNameVersion
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW_NAME_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowNameVersion() {
    return showNameVersion;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW_NAME_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowNameVersion(@javax.annotation.Nullable Boolean showNameVersion) {
    this.showNameVersion = showNameVersion;
  }


  public WhiteLabelingParams platformName(@javax.annotation.Nullable String platformName) {
    this.platformName = platformName;
    return this;
  }

  /**
   * White-labeled platform name
   * @return platformName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PLATFORM_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPlatformName() {
    return platformName;
  }


  @JsonProperty(value = JSON_PROPERTY_PLATFORM_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatformName(@javax.annotation.Nullable String platformName) {
    this.platformName = platformName;
  }


  public WhiteLabelingParams platformVersion(@javax.annotation.Nullable String platformVersion) {
    this.platformVersion = platformVersion;
    return this;
  }

  /**
   * White-labeled platform version
   * @return platformVersion
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PLATFORM_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPlatformVersion() {
    return platformVersion;
  }


  @JsonProperty(value = JSON_PROPERTY_PLATFORM_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatformVersion(@javax.annotation.Nullable String platformVersion) {
    this.platformVersion = platformVersion;
  }


  public WhiteLabelingParams customCss(@javax.annotation.Nullable String customCss) {
    this.customCss = customCss;
    return this;
  }

  /**
   * Custom CSS content
   * @return customCss
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOM_CSS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomCss() {
    return customCss;
  }


  @JsonProperty(value = JSON_PROPERTY_CUSTOM_CSS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomCss(@javax.annotation.Nullable String customCss) {
    this.customCss = customCss;
  }


  public WhiteLabelingParams hideConnectivityDialog(@javax.annotation.Nullable Boolean hideConnectivityDialog) {
    this.hideConnectivityDialog = hideConnectivityDialog;
    return this;
  }

  /**
   * Hide device connectivity dialog
   * @return hideConnectivityDialog
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_HIDE_CONNECTIVITY_DIALOG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHideConnectivityDialog() {
    return hideConnectivityDialog;
  }


  @JsonProperty(value = JSON_PROPERTY_HIDE_CONNECTIVITY_DIALOG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHideConnectivityDialog(@javax.annotation.Nullable Boolean hideConnectivityDialog) {
    this.hideConnectivityDialog = hideConnectivityDialog;
  }


  public WhiteLabelingParams overrideTrendzName(@javax.annotation.Nullable Boolean overrideTrendzName) {
    this.overrideTrendzName = overrideTrendzName;
    return this;
  }

  /**
   * Override Trendz Add-on name
   * @return overrideTrendzName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OVERRIDE_TRENDZ_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getOverrideTrendzName() {
    return overrideTrendzName;
  }


  @JsonProperty(value = JSON_PROPERTY_OVERRIDE_TRENDZ_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverrideTrendzName(@javax.annotation.Nullable Boolean overrideTrendzName) {
    this.overrideTrendzName = overrideTrendzName;
  }


  /**
   * Return true if this WhiteLabelingParams object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhiteLabelingParams whiteLabelingParams = (WhiteLabelingParams) o;
    return Objects.equals(this.logoImageUrl, whiteLabelingParams.logoImageUrl) &&
        Objects.equals(this.logoImageHeight, whiteLabelingParams.logoImageHeight) &&
        Objects.equals(this.appTitle, whiteLabelingParams.appTitle) &&
        Objects.equals(this.favicon, whiteLabelingParams.favicon) &&
        Objects.equals(this.paletteSettings, whiteLabelingParams.paletteSettings) &&
        Objects.equals(this.helpLinkBaseUrl, whiteLabelingParams.helpLinkBaseUrl) &&
        Objects.equals(this.uiHelpBaseUrl, whiteLabelingParams.uiHelpBaseUrl) &&
        Objects.equals(this.enableHelpLinks, whiteLabelingParams.enableHelpLinks) &&
        Objects.equals(this.whiteLabelingEnabled, whiteLabelingParams.whiteLabelingEnabled) &&
        Objects.equals(this.showNameVersion, whiteLabelingParams.showNameVersion) &&
        Objects.equals(this.platformName, whiteLabelingParams.platformName) &&
        Objects.equals(this.platformVersion, whiteLabelingParams.platformVersion) &&
        Objects.equals(this.customCss, whiteLabelingParams.customCss) &&
        Objects.equals(this.hideConnectivityDialog, whiteLabelingParams.hideConnectivityDialog) &&
        Objects.equals(this.overrideTrendzName, whiteLabelingParams.overrideTrendzName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logoImageUrl, logoImageHeight, appTitle, favicon, paletteSettings, helpLinkBaseUrl, uiHelpBaseUrl, enableHelpLinks, whiteLabelingEnabled, showNameVersion, platformName, platformVersion, customCss, hideConnectivityDialog, overrideTrendzName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhiteLabelingParams {\n");
    sb.append("    logoImageUrl: ").append(toIndentedString(logoImageUrl)).append("\n");
    sb.append("    logoImageHeight: ").append(toIndentedString(logoImageHeight)).append("\n");
    sb.append("    appTitle: ").append(toIndentedString(appTitle)).append("\n");
    sb.append("    favicon: ").append(toIndentedString(favicon)).append("\n");
    sb.append("    paletteSettings: ").append(toIndentedString(paletteSettings)).append("\n");
    sb.append("    helpLinkBaseUrl: ").append(toIndentedString(helpLinkBaseUrl)).append("\n");
    sb.append("    uiHelpBaseUrl: ").append(toIndentedString(uiHelpBaseUrl)).append("\n");
    sb.append("    enableHelpLinks: ").append(toIndentedString(enableHelpLinks)).append("\n");
    sb.append("    whiteLabelingEnabled: ").append(toIndentedString(whiteLabelingEnabled)).append("\n");
    sb.append("    showNameVersion: ").append(toIndentedString(showNameVersion)).append("\n");
    sb.append("    platformName: ").append(toIndentedString(platformName)).append("\n");
    sb.append("    platformVersion: ").append(toIndentedString(platformVersion)).append("\n");
    sb.append("    customCss: ").append(toIndentedString(customCss)).append("\n");
    sb.append("    hideConnectivityDialog: ").append(toIndentedString(hideConnectivityDialog)).append("\n");
    sb.append("    overrideTrendzName: ").append(toIndentedString(overrideTrendzName)).append("\n");
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

    // add `logoImageUrl` to the URL query string
    if (getLogoImageUrl() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slogoImageUrl%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLogoImageUrl()))));
    }

    // add `logoImageHeight` to the URL query string
    if (getLogoImageHeight() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slogoImageHeight%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLogoImageHeight()))));
    }

    // add `appTitle` to the URL query string
    if (getAppTitle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sappTitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAppTitle()))));
    }

    // add `favicon` to the URL query string
    if (getFavicon() != null) {
      joiner.add(getFavicon().toUrlQueryString(prefix + "favicon" + suffix));
    }

    // add `paletteSettings` to the URL query string
    if (getPaletteSettings() != null) {
      joiner.add(getPaletteSettings().toUrlQueryString(prefix + "paletteSettings" + suffix));
    }

    // add `helpLinkBaseUrl` to the URL query string
    if (getHelpLinkBaseUrl() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%shelpLinkBaseUrl%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHelpLinkBaseUrl()))));
    }

    // add `uiHelpBaseUrl` to the URL query string
    if (getUiHelpBaseUrl() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%suiHelpBaseUrl%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUiHelpBaseUrl()))));
    }

    // add `enableHelpLinks` to the URL query string
    if (getEnableHelpLinks() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%senableHelpLinks%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEnableHelpLinks()))));
    }

    // add `whiteLabelingEnabled` to the URL query string
    if (getWhiteLabelingEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%swhiteLabelingEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getWhiteLabelingEnabled()))));
    }

    // add `showNameVersion` to the URL query string
    if (getShowNameVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshowNameVersion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowNameVersion()))));
    }

    // add `platformName` to the URL query string
    if (getPlatformName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%splatformName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPlatformName()))));
    }

    // add `platformVersion` to the URL query string
    if (getPlatformVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%splatformVersion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPlatformVersion()))));
    }

    // add `customCss` to the URL query string
    if (getCustomCss() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scustomCss%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCustomCss()))));
    }

    // add `hideConnectivityDialog` to the URL query string
    if (getHideConnectivityDialog() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%shideConnectivityDialog%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHideConnectivityDialog()))));
    }

    // add `overrideTrendzName` to the URL query string
    if (getOverrideTrendzName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%soverrideTrendzName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOverrideTrendzName()))));
    }

    return joiner.toString();
  }
}

