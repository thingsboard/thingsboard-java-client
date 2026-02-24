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
 * MobileSessionInfo
 */
@JsonPropertyOrder({
  MobileSessionInfo.JSON_PROPERTY_FCM_TOKEN_TIMESTAMP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class MobileSessionInfo {
  public static final String JSON_PROPERTY_FCM_TOKEN_TIMESTAMP = "fcmTokenTimestamp";
  @javax.annotation.Nullable
  private Long fcmTokenTimestamp;

  public MobileSessionInfo() { 
  }

  public MobileSessionInfo fcmTokenTimestamp(@javax.annotation.Nullable Long fcmTokenTimestamp) {
    this.fcmTokenTimestamp = fcmTokenTimestamp;
    return this;
  }

  /**
   * Get fcmTokenTimestamp
   * @return fcmTokenTimestamp
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FCM_TOKEN_TIMESTAMP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFcmTokenTimestamp() {
    return fcmTokenTimestamp;
  }


  @JsonProperty(value = JSON_PROPERTY_FCM_TOKEN_TIMESTAMP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFcmTokenTimestamp(@javax.annotation.Nullable Long fcmTokenTimestamp) {
    this.fcmTokenTimestamp = fcmTokenTimestamp;
  }


  /**
   * Return true if this MobileSessionInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileSessionInfo mobileSessionInfo = (MobileSessionInfo) o;
    return Objects.equals(this.fcmTokenTimestamp, mobileSessionInfo.fcmTokenTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fcmTokenTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileSessionInfo {\n");
    sb.append("    fcmTokenTimestamp: ").append(toIndentedString(fcmTokenTimestamp)).append("\n");
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

    // add `fcmTokenTimestamp` to the URL query string
    if (getFcmTokenTimestamp() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfcmTokenTimestamp%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFcmTokenTimestamp()))));
    }

    return joiner.toString();
  }
}

