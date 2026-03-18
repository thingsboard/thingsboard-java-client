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
import org.thingsboard.client.model.DomainId;
import org.thingsboard.client.model.Favicon;
import org.thingsboard.client.model.PaletteSettings;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the login white labeling configuration
 */
@JsonPropertyOrder({
  LoginWhiteLabelingParams.JSON_PROPERTY_LOGO_IMAGE_URL,
  LoginWhiteLabelingParams.JSON_PROPERTY_LOGO_IMAGE_HEIGHT,
  LoginWhiteLabelingParams.JSON_PROPERTY_APP_TITLE,
  LoginWhiteLabelingParams.JSON_PROPERTY_FAVICON,
  LoginWhiteLabelingParams.JSON_PROPERTY_PALETTE_SETTINGS,
  LoginWhiteLabelingParams.JSON_PROPERTY_HELP_LINK_BASE_URL,
  LoginWhiteLabelingParams.JSON_PROPERTY_UI_HELP_BASE_URL,
  LoginWhiteLabelingParams.JSON_PROPERTY_ENABLE_HELP_LINKS,
  LoginWhiteLabelingParams.JSON_PROPERTY_WHITE_LABELING_ENABLED,
  LoginWhiteLabelingParams.JSON_PROPERTY_SHOW_NAME_VERSION,
  LoginWhiteLabelingParams.JSON_PROPERTY_PLATFORM_NAME,
  LoginWhiteLabelingParams.JSON_PROPERTY_PLATFORM_VERSION,
  LoginWhiteLabelingParams.JSON_PROPERTY_CUSTOM_CSS,
  LoginWhiteLabelingParams.JSON_PROPERTY_HIDE_CONNECTIVITY_DIALOG,
  LoginWhiteLabelingParams.JSON_PROPERTY_OVERRIDE_TRENDZ_NAME,
  LoginWhiteLabelingParams.JSON_PROPERTY_HIDE_CHAT_BOT,
  LoginWhiteLabelingParams.JSON_PROPERTY_PAGE_BACKGROUND_COLOR,
  LoginWhiteLabelingParams.JSON_PROPERTY_DARK_FOREGROUND,
  LoginWhiteLabelingParams.JSON_PROPERTY_DOMAIN_ID,
  LoginWhiteLabelingParams.JSON_PROPERTY_BASE_URL,
  LoginWhiteLabelingParams.JSON_PROPERTY_PROHIBIT_DIFFERENT_URL,
  LoginWhiteLabelingParams.JSON_PROPERTY_ADMIN_SETTINGS_ID,
  LoginWhiteLabelingParams.JSON_PROPERTY_SHOW_NAME_BOTTOM
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class LoginWhiteLabelingParams {
  public static final String JSON_PROPERTY_LOGO_IMAGE_URL = "logoImageUrl";
  @Nullable
  private String logoImageUrl;

  public static final String JSON_PROPERTY_LOGO_IMAGE_HEIGHT = "logoImageHeight";
  @Nullable
  private Integer logoImageHeight;

  public static final String JSON_PROPERTY_APP_TITLE = "appTitle";
  @Nullable
  private String appTitle;

  public static final String JSON_PROPERTY_FAVICON = "favicon";
  @Nullable
  private Favicon favicon;

  public static final String JSON_PROPERTY_PALETTE_SETTINGS = "paletteSettings";
  @Nullable
  private PaletteSettings paletteSettings;

  public static final String JSON_PROPERTY_HELP_LINK_BASE_URL = "helpLinkBaseUrl";
  @Nullable
  private String helpLinkBaseUrl;

  public static final String JSON_PROPERTY_UI_HELP_BASE_URL = "uiHelpBaseUrl";
  @Nullable
  private String uiHelpBaseUrl;

  public static final String JSON_PROPERTY_ENABLE_HELP_LINKS = "enableHelpLinks";
  @Nullable
  private Boolean enableHelpLinks;

  public static final String JSON_PROPERTY_WHITE_LABELING_ENABLED = "whiteLabelingEnabled";
  @Nullable
  private Boolean whiteLabelingEnabled;

  public static final String JSON_PROPERTY_SHOW_NAME_VERSION = "showNameVersion";
  @Nullable
  private Boolean showNameVersion;

  public static final String JSON_PROPERTY_PLATFORM_NAME = "platformName";
  @Nullable
  private String platformName;

  public static final String JSON_PROPERTY_PLATFORM_VERSION = "platformVersion";
  @Nullable
  private String platformVersion;

  public static final String JSON_PROPERTY_CUSTOM_CSS = "customCss";
  @Nullable
  private String customCss;

  public static final String JSON_PROPERTY_HIDE_CONNECTIVITY_DIALOG = "hideConnectivityDialog";
  @Nullable
  private Boolean hideConnectivityDialog;

  public static final String JSON_PROPERTY_OVERRIDE_TRENDZ_NAME = "overrideTrendzName";
  @Nullable
  private Boolean overrideTrendzName;

  public static final String JSON_PROPERTY_HIDE_CHAT_BOT = "hideChatBot";
  @Nullable
  private Boolean hideChatBot;

  public static final String JSON_PROPERTY_PAGE_BACKGROUND_COLOR = "pageBackgroundColor";
  @Nullable
  private String pageBackgroundColor;

  public static final String JSON_PROPERTY_DARK_FOREGROUND = "darkForeground";
  @Nullable
  private Boolean darkForeground;

  public static final String JSON_PROPERTY_DOMAIN_ID = "domainId";
  @Nullable
  private DomainId domainId;

  public static final String JSON_PROPERTY_BASE_URL = "baseUrl";
  @Nullable
  private String baseUrl;

  public static final String JSON_PROPERTY_PROHIBIT_DIFFERENT_URL = "prohibitDifferentUrl";
  @Nullable
  private Boolean prohibitDifferentUrl;

  public static final String JSON_PROPERTY_ADMIN_SETTINGS_ID = "adminSettingsId";
  @Nullable
  private String adminSettingsId;

  public static final String JSON_PROPERTY_SHOW_NAME_BOTTOM = "showNameBottom";
  @Nullable
  private Boolean showNameBottom;

  public LoginWhiteLabelingParams() { 
  }

  @JsonCreator
  public LoginWhiteLabelingParams(
    @JsonProperty(JSON_PROPERTY_WHITE_LABELING_ENABLED) Boolean whiteLabelingEnabled
  ) {
  this();
    this.whiteLabelingEnabled = whiteLabelingEnabled;
  }

  public LoginWhiteLabelingParams logoImageUrl(@Nullable String logoImageUrl) {
    this.logoImageUrl = logoImageUrl;
    return this;
  }

  /**
   * Logo image URL
   * @return logoImageUrl
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LOGO_IMAGE_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLogoImageUrl() {
    return logoImageUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_LOGO_IMAGE_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogoImageUrl(@Nullable String logoImageUrl) {
    this.logoImageUrl = logoImageUrl;
  }


  public LoginWhiteLabelingParams logoImageHeight(@Nullable Integer logoImageHeight) {
    this.logoImageHeight = logoImageHeight;
    return this;
  }

  /**
   * The height of a logo container. Logo image will be automatically scaled.
   * @return logoImageHeight
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LOGO_IMAGE_HEIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getLogoImageHeight() {
    return logoImageHeight;
  }


  @JsonProperty(value = JSON_PROPERTY_LOGO_IMAGE_HEIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogoImageHeight(@Nullable Integer logoImageHeight) {
    this.logoImageHeight = logoImageHeight;
  }


  public LoginWhiteLabelingParams appTitle(@Nullable String appTitle) {
    this.appTitle = appTitle;
    return this;
  }

  /**
   * White-labeled name of the platform
   * @return appTitle
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_APP_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAppTitle() {
    return appTitle;
  }


  @JsonProperty(value = JSON_PROPERTY_APP_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppTitle(@Nullable String appTitle) {
    this.appTitle = appTitle;
  }


  public LoginWhiteLabelingParams favicon(@Nullable Favicon favicon) {
    this.favicon = favicon;
    return this;
  }

  /**
   * JSON object that contains website icon url and type
   * @return favicon
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_FAVICON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Favicon getFavicon() {
    return favicon;
  }


  @JsonProperty(value = JSON_PROPERTY_FAVICON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFavicon(@Nullable Favicon favicon) {
    this.favicon = favicon;
  }


  public LoginWhiteLabelingParams paletteSettings(@Nullable PaletteSettings paletteSettings) {
    this.paletteSettings = paletteSettings;
    return this;
  }

  /**
   * Complex JSON that describes structure of the Angular Material Palette. See [theming](https://material.angular.io/guide/theming) for more details
   * @return paletteSettings
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PALETTE_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PaletteSettings getPaletteSettings() {
    return paletteSettings;
  }


  @JsonProperty(value = JSON_PROPERTY_PALETTE_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaletteSettings(@Nullable PaletteSettings paletteSettings) {
    this.paletteSettings = paletteSettings;
  }


  public LoginWhiteLabelingParams helpLinkBaseUrl(@Nullable String helpLinkBaseUrl) {
    this.helpLinkBaseUrl = helpLinkBaseUrl;
    return this;
  }

  /**
   * Base URL for help link
   * @return helpLinkBaseUrl
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_HELP_LINK_BASE_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHelpLinkBaseUrl() {
    return helpLinkBaseUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_HELP_LINK_BASE_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHelpLinkBaseUrl(@Nullable String helpLinkBaseUrl) {
    this.helpLinkBaseUrl = helpLinkBaseUrl;
  }


  public LoginWhiteLabelingParams uiHelpBaseUrl(@Nullable String uiHelpBaseUrl) {
    this.uiHelpBaseUrl = uiHelpBaseUrl;
    return this;
  }

  /**
   * Base URL for the repository with the UI help components (markdown)
   * @return uiHelpBaseUrl
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_UI_HELP_BASE_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUiHelpBaseUrl() {
    return uiHelpBaseUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_UI_HELP_BASE_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUiHelpBaseUrl(@Nullable String uiHelpBaseUrl) {
    this.uiHelpBaseUrl = uiHelpBaseUrl;
  }


  public LoginWhiteLabelingParams enableHelpLinks(@Nullable Boolean enableHelpLinks) {
    this.enableHelpLinks = enableHelpLinks;
    return this;
  }

  /**
   * Enable or Disable help links
   * @return enableHelpLinks
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ENABLE_HELP_LINKS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnableHelpLinks() {
    return enableHelpLinks;
  }


  @JsonProperty(value = JSON_PROPERTY_ENABLE_HELP_LINKS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableHelpLinks(@Nullable Boolean enableHelpLinks) {
    this.enableHelpLinks = enableHelpLinks;
  }


  /**
   * Enable white-labeling
   * @return whiteLabelingEnabled
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_WHITE_LABELING_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getWhiteLabelingEnabled() {
    return whiteLabelingEnabled;
  }




  public LoginWhiteLabelingParams showNameVersion(@Nullable Boolean showNameVersion) {
    this.showNameVersion = showNameVersion;
    return this;
  }

  /**
   * Show platform name and version on UI and login screen
   * @return showNameVersion
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW_NAME_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowNameVersion() {
    return showNameVersion;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW_NAME_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowNameVersion(@Nullable Boolean showNameVersion) {
    this.showNameVersion = showNameVersion;
  }


  public LoginWhiteLabelingParams platformName(@Nullable String platformName) {
    this.platformName = platformName;
    return this;
  }

  /**
   * White-labeled platform name
   * @return platformName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PLATFORM_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPlatformName() {
    return platformName;
  }


  @JsonProperty(value = JSON_PROPERTY_PLATFORM_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatformName(@Nullable String platformName) {
    this.platformName = platformName;
  }


  public LoginWhiteLabelingParams platformVersion(@Nullable String platformVersion) {
    this.platformVersion = platformVersion;
    return this;
  }

  /**
   * White-labeled platform version
   * @return platformVersion
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PLATFORM_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPlatformVersion() {
    return platformVersion;
  }


  @JsonProperty(value = JSON_PROPERTY_PLATFORM_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatformVersion(@Nullable String platformVersion) {
    this.platformVersion = platformVersion;
  }


  public LoginWhiteLabelingParams customCss(@Nullable String customCss) {
    this.customCss = customCss;
    return this;
  }

  /**
   * Custom CSS content
   * @return customCss
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOM_CSS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomCss() {
    return customCss;
  }


  @JsonProperty(value = JSON_PROPERTY_CUSTOM_CSS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomCss(@Nullable String customCss) {
    this.customCss = customCss;
  }


  public LoginWhiteLabelingParams hideConnectivityDialog(@Nullable Boolean hideConnectivityDialog) {
    this.hideConnectivityDialog = hideConnectivityDialog;
    return this;
  }

  /**
   * Hide device connectivity dialog
   * @return hideConnectivityDialog
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_HIDE_CONNECTIVITY_DIALOG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHideConnectivityDialog() {
    return hideConnectivityDialog;
  }


  @JsonProperty(value = JSON_PROPERTY_HIDE_CONNECTIVITY_DIALOG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHideConnectivityDialog(@Nullable Boolean hideConnectivityDialog) {
    this.hideConnectivityDialog = hideConnectivityDialog;
  }


  public LoginWhiteLabelingParams overrideTrendzName(@Nullable Boolean overrideTrendzName) {
    this.overrideTrendzName = overrideTrendzName;
    return this;
  }

  /**
   * Override Trendz Add-on name
   * @return overrideTrendzName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_OVERRIDE_TRENDZ_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getOverrideTrendzName() {
    return overrideTrendzName;
  }


  @JsonProperty(value = JSON_PROPERTY_OVERRIDE_TRENDZ_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverrideTrendzName(@Nullable Boolean overrideTrendzName) {
    this.overrideTrendzName = overrideTrendzName;
  }


  public LoginWhiteLabelingParams hideChatBot(@Nullable Boolean hideChatBot) {
    this.hideChatBot = hideChatBot;
    return this;
  }

  /**
   * Hide chat bot
   * @return hideChatBot
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_HIDE_CHAT_BOT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHideChatBot() {
    return hideChatBot;
  }


  @JsonProperty(value = JSON_PROPERTY_HIDE_CHAT_BOT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHideChatBot(@Nullable Boolean hideChatBot) {
    this.hideChatBot = hideChatBot;
  }


  public LoginWhiteLabelingParams pageBackgroundColor(@Nullable String pageBackgroundColor) {
    this.pageBackgroundColor = pageBackgroundColor;
    return this;
  }

  /**
   * Login page background color
   * @return pageBackgroundColor
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PAGE_BACKGROUND_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPageBackgroundColor() {
    return pageBackgroundColor;
  }


  @JsonProperty(value = JSON_PROPERTY_PAGE_BACKGROUND_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageBackgroundColor(@Nullable String pageBackgroundColor) {
    this.pageBackgroundColor = pageBackgroundColor;
  }


  public LoginWhiteLabelingParams darkForeground(@Nullable Boolean darkForeground) {
    this.darkForeground = darkForeground;
    return this;
  }

  /**
   * Enable/Disable dark foreground
   * @return darkForeground
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DARK_FOREGROUND, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDarkForeground() {
    return darkForeground;
  }


  @JsonProperty(value = JSON_PROPERTY_DARK_FOREGROUND, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDarkForeground(@Nullable Boolean darkForeground) {
    this.darkForeground = darkForeground;
  }


  public LoginWhiteLabelingParams domainId(@Nullable DomainId domainId) {
    this.domainId = domainId;
    return this;
  }

  /**
   * Domain id
   * @return domainId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DOMAIN_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DomainId getDomainId() {
    return domainId;
  }


  @JsonProperty(value = JSON_PROPERTY_DOMAIN_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomainId(@Nullable DomainId domainId) {
    this.domainId = domainId;
  }


  public LoginWhiteLabelingParams baseUrl(@Nullable String baseUrl) {
    this.baseUrl = baseUrl;
    return this;
  }

  /**
   * Base URL for the activation link, etc
   * @return baseUrl
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_BASE_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBaseUrl() {
    return baseUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_BASE_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBaseUrl(@Nullable String baseUrl) {
    this.baseUrl = baseUrl;
  }


  public LoginWhiteLabelingParams prohibitDifferentUrl(@Nullable Boolean prohibitDifferentUrl) {
    this.prohibitDifferentUrl = prohibitDifferentUrl;
    return this;
  }

  /**
   * Prohibit use of other URLs. It is recommended to enable this setting
   * @return prohibitDifferentUrl
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PROHIBIT_DIFFERENT_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getProhibitDifferentUrl() {
    return prohibitDifferentUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_PROHIBIT_DIFFERENT_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProhibitDifferentUrl(@Nullable Boolean prohibitDifferentUrl) {
    this.prohibitDifferentUrl = prohibitDifferentUrl;
  }


  public LoginWhiteLabelingParams adminSettingsId(@Nullable String adminSettingsId) {
    this.adminSettingsId = adminSettingsId;
    return this;
  }

  /**
   * Id of the settings object that store this parameters
   * @return adminSettingsId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ADMIN_SETTINGS_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAdminSettingsId() {
    return adminSettingsId;
  }


  @JsonProperty(value = JSON_PROPERTY_ADMIN_SETTINGS_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdminSettingsId(@Nullable String adminSettingsId) {
    this.adminSettingsId = adminSettingsId;
  }


  public LoginWhiteLabelingParams showNameBottom(@Nullable Boolean showNameBottom) {
    this.showNameBottom = showNameBottom;
    return this;
  }

  /**
   * Show platform name and version on login page
   * @return showNameBottom
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW_NAME_BOTTOM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowNameBottom() {
    return showNameBottom;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW_NAME_BOTTOM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowNameBottom(@Nullable Boolean showNameBottom) {
    this.showNameBottom = showNameBottom;
  }


  /**
   * Return true if this LoginWhiteLabelingParams object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginWhiteLabelingParams loginWhiteLabelingParams = (LoginWhiteLabelingParams) o;
    return Objects.equals(this.logoImageUrl, loginWhiteLabelingParams.logoImageUrl) &&
        Objects.equals(this.logoImageHeight, loginWhiteLabelingParams.logoImageHeight) &&
        Objects.equals(this.appTitle, loginWhiteLabelingParams.appTitle) &&
        Objects.equals(this.favicon, loginWhiteLabelingParams.favicon) &&
        Objects.equals(this.paletteSettings, loginWhiteLabelingParams.paletteSettings) &&
        Objects.equals(this.helpLinkBaseUrl, loginWhiteLabelingParams.helpLinkBaseUrl) &&
        Objects.equals(this.uiHelpBaseUrl, loginWhiteLabelingParams.uiHelpBaseUrl) &&
        Objects.equals(this.enableHelpLinks, loginWhiteLabelingParams.enableHelpLinks) &&
        Objects.equals(this.whiteLabelingEnabled, loginWhiteLabelingParams.whiteLabelingEnabled) &&
        Objects.equals(this.showNameVersion, loginWhiteLabelingParams.showNameVersion) &&
        Objects.equals(this.platformName, loginWhiteLabelingParams.platformName) &&
        Objects.equals(this.platformVersion, loginWhiteLabelingParams.platformVersion) &&
        Objects.equals(this.customCss, loginWhiteLabelingParams.customCss) &&
        Objects.equals(this.hideConnectivityDialog, loginWhiteLabelingParams.hideConnectivityDialog) &&
        Objects.equals(this.overrideTrendzName, loginWhiteLabelingParams.overrideTrendzName) &&
        Objects.equals(this.hideChatBot, loginWhiteLabelingParams.hideChatBot) &&
        Objects.equals(this.pageBackgroundColor, loginWhiteLabelingParams.pageBackgroundColor) &&
        Objects.equals(this.darkForeground, loginWhiteLabelingParams.darkForeground) &&
        Objects.equals(this.domainId, loginWhiteLabelingParams.domainId) &&
        Objects.equals(this.baseUrl, loginWhiteLabelingParams.baseUrl) &&
        Objects.equals(this.prohibitDifferentUrl, loginWhiteLabelingParams.prohibitDifferentUrl) &&
        Objects.equals(this.adminSettingsId, loginWhiteLabelingParams.adminSettingsId) &&
        Objects.equals(this.showNameBottom, loginWhiteLabelingParams.showNameBottom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logoImageUrl, logoImageHeight, appTitle, favicon, paletteSettings, helpLinkBaseUrl, uiHelpBaseUrl, enableHelpLinks, whiteLabelingEnabled, showNameVersion, platformName, platformVersion, customCss, hideConnectivityDialog, overrideTrendzName, hideChatBot, pageBackgroundColor, darkForeground, domainId, baseUrl, prohibitDifferentUrl, adminSettingsId, showNameBottom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginWhiteLabelingParams {\n");
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
    sb.append("    hideChatBot: ").append(toIndentedString(hideChatBot)).append("\n");
    sb.append("    pageBackgroundColor: ").append(toIndentedString(pageBackgroundColor)).append("\n");
    sb.append("    darkForeground: ").append(toIndentedString(darkForeground)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    prohibitDifferentUrl: ").append(toIndentedString(prohibitDifferentUrl)).append("\n");
    sb.append("    adminSettingsId: ").append(toIndentedString(adminSettingsId)).append("\n");
    sb.append("    showNameBottom: ").append(toIndentedString(showNameBottom)).append("\n");
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

    // add `hideChatBot` to the URL query string
    if (getHideChatBot() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%shideChatBot%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHideChatBot()))));
    }

    // add `pageBackgroundColor` to the URL query string
    if (getPageBackgroundColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spageBackgroundColor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPageBackgroundColor()))));
    }

    // add `darkForeground` to the URL query string
    if (getDarkForeground() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdarkForeground%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDarkForeground()))));
    }

    // add `domainId` to the URL query string
    if (getDomainId() != null) {
      joiner.add(getDomainId().toUrlQueryString(prefix + "domainId" + suffix));
    }

    // add `baseUrl` to the URL query string
    if (getBaseUrl() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbaseUrl%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBaseUrl()))));
    }

    // add `prohibitDifferentUrl` to the URL query string
    if (getProhibitDifferentUrl() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprohibitDifferentUrl%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getProhibitDifferentUrl()))));
    }

    // add `adminSettingsId` to the URL query string
    if (getAdminSettingsId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadminSettingsId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdminSettingsId()))));
    }

    // add `showNameBottom` to the URL query string
    if (getShowNameBottom() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshowNameBottom%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowNameBottom()))));
    }

    return joiner.toString();
  }
}

