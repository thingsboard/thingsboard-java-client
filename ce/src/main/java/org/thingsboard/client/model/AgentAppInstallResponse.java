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
import org.thingsboard.client.model.AgentAppEvent;
import org.thingsboard.client.model.AgentApplication;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * Response payload for the install-agent-application endpoint. Carries both the created application and the INSTALL event so the caller can open a progress dialog without a second round-trip.
 */
@JsonPropertyOrder({
  AgentAppInstallResponse.JSON_PROPERTY_APPLICATION,
  AgentAppInstallResponse.JSON_PROPERTY_EVENT
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AgentAppInstallResponse {
  public static final String JSON_PROPERTY_APPLICATION = "application";
  @Nullable
  private AgentApplication application;

  public static final String JSON_PROPERTY_EVENT = "event";
  @Nullable
  private AgentAppEvent event;

  public AgentAppInstallResponse() { 
  }

  public AgentAppInstallResponse application(@Nullable AgentApplication application) {
    this.application = application;
    return this;
  }

  /**
   * The newly created agent application.
   * @return application
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_APPLICATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AgentApplication getApplication() {
    return application;
  }


  @JsonProperty(value = JSON_PROPERTY_APPLICATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplication(@Nullable AgentApplication application) {
    this.application = application;
  }


  public AgentAppInstallResponse event(@Nullable AgentAppEvent event) {
    this.event = event;
    return this;
  }

  /**
   * The INSTALL event created alongside the application.
   * @return event
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EVENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AgentAppEvent getEvent() {
    return event;
  }


  @JsonProperty(value = JSON_PROPERTY_EVENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEvent(@Nullable AgentAppEvent event) {
    this.event = event;
  }


  /**
   * Return true if this AgentAppInstallResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentAppInstallResponse agentAppInstallResponse = (AgentAppInstallResponse) o;
    return Objects.equals(this.application, agentAppInstallResponse.application) &&
        Objects.equals(this.event, agentAppInstallResponse.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentAppInstallResponse {\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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

    // add `application` to the URL query string
    if (getApplication() != null) {
      joiner.add(getApplication().toUrlQueryString(prefix + "application" + suffix));
    }

    // add `event` to the URL query string
    if (getEvent() != null) {
      joiner.add(getEvent().toUrlQueryString(prefix + "event" + suffix));
    }

    return joiner.toString();
  }
}

