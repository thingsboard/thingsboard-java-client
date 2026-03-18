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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * DeleteTenantRequest
 */
@JsonPropertyOrder({
  DeleteTenantRequest.JSON_PROPERTY_REASON,
  DeleteTenantRequest.JSON_PROPERTY_ADDITIONAL_NOTES
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class DeleteTenantRequest {
  public static final String JSON_PROPERTY_REASON = "reason";
  @Nullable
  private String reason;

  public static final String JSON_PROPERTY_ADDITIONAL_NOTES = "additionalNotes";
  @Nullable
  private String additionalNotes;

  public DeleteTenantRequest() { 
  }

  public DeleteTenantRequest reason(@Nullable String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_REASON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReason() {
    return reason;
  }


  @JsonProperty(value = JSON_PROPERTY_REASON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReason(@Nullable String reason) {
    this.reason = reason;
  }


  public DeleteTenantRequest additionalNotes(@Nullable String additionalNotes) {
    this.additionalNotes = additionalNotes;
    return this;
  }

  /**
   * Get additionalNotes
   * @return additionalNotes
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_NOTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAdditionalNotes() {
    return additionalNotes;
  }


  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_NOTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalNotes(@Nullable String additionalNotes) {
    this.additionalNotes = additionalNotes;
  }


  /**
   * Return true if this DeleteTenantRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteTenantRequest deleteTenantRequest = (DeleteTenantRequest) o;
    return Objects.equals(this.reason, deleteTenantRequest.reason) &&
        Objects.equals(this.additionalNotes, deleteTenantRequest.additionalNotes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, additionalNotes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteTenantRequest {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    additionalNotes: ").append(toIndentedString(additionalNotes)).append("\n");
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

    // add `reason` to the URL query string
    if (getReason() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sreason%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getReason()))));
    }

    // add `additionalNotes` to the URL query string
    if (getAdditionalNotes() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditionalNotes%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalNotes()))));
    }

    return joiner.toString();
  }
}

