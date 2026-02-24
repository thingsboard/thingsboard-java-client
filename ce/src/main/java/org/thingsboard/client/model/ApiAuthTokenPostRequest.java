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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * ApiAuthTokenPostRequest
 */
@JsonPropertyOrder({
  ApiAuthTokenPostRequest.JSON_PROPERTY_REFRESH_TOKEN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class ApiAuthTokenPostRequest {
  public static final String JSON_PROPERTY_REFRESH_TOKEN = "refreshToken";
  private JsonNullable<Object> refreshToken = JsonNullable.<Object>of(null);

  public ApiAuthTokenPostRequest() { 
  }

  public ApiAuthTokenPostRequest refreshToken(@javax.annotation.Nullable Object refreshToken) {
    this.refreshToken = JsonNullable.<Object>of(refreshToken);
    return this;
  }

  /**
   * Get refreshToken
   * @return refreshToken
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public Object getRefreshToken() {
        return refreshToken.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_REFRESH_TOKEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getRefreshToken_JsonNullable() {
    return refreshToken;
  }
  
  @JsonProperty(JSON_PROPERTY_REFRESH_TOKEN)
  public void setRefreshToken_JsonNullable(JsonNullable<Object> refreshToken) {
    this.refreshToken = refreshToken;
  }

  public void setRefreshToken(@javax.annotation.Nullable Object refreshToken) {
    this.refreshToken = JsonNullable.<Object>of(refreshToken);
  }


  /**
   * Return true if this _api_auth_token_post_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiAuthTokenPostRequest apiAuthTokenPostRequest = (ApiAuthTokenPostRequest) o;
    return equalsNullable(this.refreshToken, apiAuthTokenPostRequest.refreshToken);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(refreshToken));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiAuthTokenPostRequest {\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
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

    // add `refreshToken` to the URL query string
    if (getRefreshToken() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srefreshToken%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRefreshToken()))));
    }

    return joiner.toString();
  }
}

