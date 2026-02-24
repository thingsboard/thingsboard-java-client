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
import java.util.UUID;
import org.thingsboard.client.model.LinkType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * Button
 */
@JsonPropertyOrder({
  Button.JSON_PROPERTY_ENABLED,
  Button.JSON_PROPERTY_TEXT,
  Button.JSON_PROPERTY_LINK_TYPE,
  Button.JSON_PROPERTY_LINK,
  Button.JSON_PROPERTY_DASHBOARD_ID,
  Button.JSON_PROPERTY_DASHBOARD_STATE,
  Button.JSON_PROPERTY_SET_ENTITY_ID_IN_STATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class Button {
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  @javax.annotation.Nullable
  private Boolean enabled;

  public static final String JSON_PROPERTY_TEXT = "text";
  @javax.annotation.Nullable
  private String text;

  public static final String JSON_PROPERTY_LINK_TYPE = "linkType";
  @javax.annotation.Nullable
  private LinkType linkType;

  public static final String JSON_PROPERTY_LINK = "link";
  @javax.annotation.Nullable
  private String link;

  public static final String JSON_PROPERTY_DASHBOARD_ID = "dashboardId";
  @javax.annotation.Nullable
  private UUID dashboardId;

  public static final String JSON_PROPERTY_DASHBOARD_STATE = "dashboardState";
  @javax.annotation.Nullable
  private String dashboardState;

  public static final String JSON_PROPERTY_SET_ENTITY_ID_IN_STATE = "setEntityIdInState";
  @javax.annotation.Nullable
  private Boolean setEntityIdInState;

  public Button() { 
  }

  public Button enabled(@javax.annotation.Nullable Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(value = JSON_PROPERTY_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(@javax.annotation.Nullable Boolean enabled) {
    this.enabled = enabled;
  }


  public Button text(@javax.annotation.Nullable String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TEXT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getText() {
    return text;
  }


  @JsonProperty(value = JSON_PROPERTY_TEXT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setText(@javax.annotation.Nullable String text) {
    this.text = text;
  }


  public Button linkType(@javax.annotation.Nullable LinkType linkType) {
    this.linkType = linkType;
    return this;
  }

  /**
   * Get linkType
   * @return linkType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LINK_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LinkType getLinkType() {
    return linkType;
  }


  @JsonProperty(value = JSON_PROPERTY_LINK_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkType(@javax.annotation.Nullable LinkType linkType) {
    this.linkType = linkType;
  }


  public Button link(@javax.annotation.Nullable String link) {
    this.link = link;
    return this;
  }

  /**
   * Get link
   * @return link
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LINK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLink() {
    return link;
  }


  @JsonProperty(value = JSON_PROPERTY_LINK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLink(@javax.annotation.Nullable String link) {
    this.link = link;
  }


  public Button dashboardId(@javax.annotation.Nullable UUID dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  /**
   * Get dashboardId
   * @return dashboardId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DASHBOARD_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getDashboardId() {
    return dashboardId;
  }


  @JsonProperty(value = JSON_PROPERTY_DASHBOARD_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDashboardId(@javax.annotation.Nullable UUID dashboardId) {
    this.dashboardId = dashboardId;
  }


  public Button dashboardState(@javax.annotation.Nullable String dashboardState) {
    this.dashboardState = dashboardState;
    return this;
  }

  /**
   * Get dashboardState
   * @return dashboardState
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DASHBOARD_STATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDashboardState() {
    return dashboardState;
  }


  @JsonProperty(value = JSON_PROPERTY_DASHBOARD_STATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDashboardState(@javax.annotation.Nullable String dashboardState) {
    this.dashboardState = dashboardState;
  }


  public Button setEntityIdInState(@javax.annotation.Nullable Boolean setEntityIdInState) {
    this.setEntityIdInState = setEntityIdInState;
    return this;
  }

  /**
   * Get setEntityIdInState
   * @return setEntityIdInState
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SET_ENTITY_ID_IN_STATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSetEntityIdInState() {
    return setEntityIdInState;
  }


  @JsonProperty(value = JSON_PROPERTY_SET_ENTITY_ID_IN_STATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSetEntityIdInState(@javax.annotation.Nullable Boolean setEntityIdInState) {
    this.setEntityIdInState = setEntityIdInState;
  }


  /**
   * Return true if this Button object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Button button = (Button) o;
    return Objects.equals(this.enabled, button.enabled) &&
        Objects.equals(this.text, button.text) &&
        Objects.equals(this.linkType, button.linkType) &&
        Objects.equals(this.link, button.link) &&
        Objects.equals(this.dashboardId, button.dashboardId) &&
        Objects.equals(this.dashboardState, button.dashboardState) &&
        Objects.equals(this.setEntityIdInState, button.setEntityIdInState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, text, linkType, link, dashboardId, dashboardState, setEntityIdInState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Button {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
    sb.append("    dashboardState: ").append(toIndentedString(dashboardState)).append("\n");
    sb.append("    setEntityIdInState: ").append(toIndentedString(setEntityIdInState)).append("\n");
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

    // add `enabled` to the URL query string
    if (getEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%senabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEnabled()))));
    }

    // add `text` to the URL query string
    if (getText() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stext%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getText()))));
    }

    // add `linkType` to the URL query string
    if (getLinkType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slinkType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLinkType()))));
    }

    // add `link` to the URL query string
    if (getLink() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slink%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLink()))));
    }

    // add `dashboardId` to the URL query string
    if (getDashboardId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdashboardId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDashboardId()))));
    }

    // add `dashboardState` to the URL query string
    if (getDashboardState() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdashboardState%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDashboardState()))));
    }

    // add `setEntityIdInState` to the URL query string
    if (getSetEntityIdInState() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssetEntityIdInState%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSetEntityIdInState()))));
    }

    return joiner.toString();
  }
}

