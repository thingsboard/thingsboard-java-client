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
import java.io.File;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * CreateReportRequest
 */
@JsonPropertyOrder({
  CreateReportRequest.JSON_PROPERTY_FILE,
  CreateReportRequest.JSON_PROPERTY_INFO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class CreateReportRequest {
  public static final String JSON_PROPERTY_FILE = "file";
  @javax.annotation.Nonnull
  private File _file;

  public static final String JSON_PROPERTY_INFO = "info";
  @javax.annotation.Nonnull
  private String info;

  public CreateReportRequest() { 
  }

  public CreateReportRequest _file(@javax.annotation.Nonnull File _file) {
    this._file = _file;
    return this;
  }

  /**
   * Get _file
   * @return _file
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FILE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public File getFile() {
    return _file;
  }


  @JsonProperty(value = JSON_PROPERTY_FILE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFile(@javax.annotation.Nonnull File _file) {
    this._file = _file;
  }


  public CreateReportRequest info(@javax.annotation.Nonnull String info) {
    this.info = info;
    return this;
  }

  /**
   * Get info
   * @return info
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_INFO, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInfo() {
    return info;
  }


  @JsonProperty(value = JSON_PROPERTY_INFO, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInfo(@javax.annotation.Nonnull String info) {
    this.info = info;
  }


  /**
   * Return true if this createReport_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateReportRequest createReportRequest = (CreateReportRequest) o;
    return Objects.equals(this._file, createReportRequest._file) &&
        Objects.equals(this.info, createReportRequest.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_file, info);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateReportRequest {\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
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

    // add `file` to the URL query string
    if (getFile() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfile%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFile()))));
    }

    // add `info` to the URL query string
    if (getInfo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinfo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInfo()))));
    }

    return joiner.toString();
  }
}

