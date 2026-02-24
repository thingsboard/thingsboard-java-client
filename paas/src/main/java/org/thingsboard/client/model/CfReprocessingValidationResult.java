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
import org.thingsboard.client.model.JobStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * CfReprocessingValidationResult
 */
@JsonPropertyOrder({
  CfReprocessingValidationResult.JSON_PROPERTY_IS_VALID,
  CfReprocessingValidationResult.JSON_PROPERTY_MESSAGE,
  CfReprocessingValidationResult.JSON_PROPERTY_LAST_JOB_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class CfReprocessingValidationResult {
  public static final String JSON_PROPERTY_IS_VALID = "isValid";
  @javax.annotation.Nullable
  private Boolean isValid;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  @javax.annotation.Nullable
  private String message;

  public static final String JSON_PROPERTY_LAST_JOB_STATUS = "lastJobStatus";
  @javax.annotation.Nullable
  private JobStatus lastJobStatus;

  public CfReprocessingValidationResult() { 
  }

  public CfReprocessingValidationResult isValid(@javax.annotation.Nullable Boolean isValid) {
    this.isValid = isValid;
    return this;
  }

  /**
   * Get isValid
   * @return isValid
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_IS_VALID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsValid() {
    return isValid;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_VALID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsValid(@javax.annotation.Nullable Boolean isValid) {
    this.isValid = isValid;
  }


  public CfReprocessingValidationResult message(@javax.annotation.Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MESSAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMessage() {
    return message;
  }


  @JsonProperty(value = JSON_PROPERTY_MESSAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(@javax.annotation.Nullable String message) {
    this.message = message;
  }


  public CfReprocessingValidationResult lastJobStatus(@javax.annotation.Nullable JobStatus lastJobStatus) {
    this.lastJobStatus = lastJobStatus;
    return this;
  }

  /**
   * Get lastJobStatus
   * @return lastJobStatus
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LAST_JOB_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JobStatus getLastJobStatus() {
    return lastJobStatus;
  }


  @JsonProperty(value = JSON_PROPERTY_LAST_JOB_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastJobStatus(@javax.annotation.Nullable JobStatus lastJobStatus) {
    this.lastJobStatus = lastJobStatus;
  }


  /**
   * Return true if this CfReprocessingValidationResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CfReprocessingValidationResult cfReprocessingValidationResult = (CfReprocessingValidationResult) o;
    return Objects.equals(this.isValid, cfReprocessingValidationResult.isValid) &&
        Objects.equals(this.message, cfReprocessingValidationResult.message) &&
        Objects.equals(this.lastJobStatus, cfReprocessingValidationResult.lastJobStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isValid, message, lastJobStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CfReprocessingValidationResult {\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    lastJobStatus: ").append(toIndentedString(lastJobStatus)).append("\n");
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

    // add `isValid` to the URL query string
    if (getIsValid() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sisValid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIsValid()))));
    }

    // add `message` to the URL query string
    if (getMessage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smessage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMessage()))));
    }

    // add `lastJobStatus` to the URL query string
    if (getLastJobStatus() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slastJobStatus%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLastJobStatus()))));
    }

    return joiner.toString();
  }
}

