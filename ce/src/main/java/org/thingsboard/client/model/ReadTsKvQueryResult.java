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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.thingsboard.client.model.TsKvEntry;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * ReadTsKvQueryResult
 */
@JsonPropertyOrder({
  ReadTsKvQueryResult.JSON_PROPERTY_QUERY_ID,
  ReadTsKvQueryResult.JSON_PROPERTY_DATA,
  ReadTsKvQueryResult.JSON_PROPERTY_LAST_ENTRY_TS
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class ReadTsKvQueryResult {
  public static final String JSON_PROPERTY_QUERY_ID = "queryId";
  @Nullable
  private Integer queryId;

  public static final String JSON_PROPERTY_DATA = "data";
  @Nullable
  private List<TsKvEntry> data = new ArrayList<>();

  public static final String JSON_PROPERTY_LAST_ENTRY_TS = "lastEntryTs";
  @Nullable
  private Long lastEntryTs;

  public ReadTsKvQueryResult() { 
  }

  public ReadTsKvQueryResult queryId(@Nullable Integer queryId) {
    this.queryId = queryId;
    return this;
  }

  /**
   * Get queryId
   * @return queryId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_QUERY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getQueryId() {
    return queryId;
  }


  @JsonProperty(value = JSON_PROPERTY_QUERY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQueryId(@Nullable Integer queryId) {
    this.queryId = queryId;
  }


  public ReadTsKvQueryResult data(@Nullable List<TsKvEntry> data) {
    this.data = data;
    return this;
  }

  public ReadTsKvQueryResult addDataItem(TsKvEntry dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TsKvEntry> getData() {
    return data;
  }


  @JsonProperty(value = JSON_PROPERTY_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(@Nullable List<TsKvEntry> data) {
    this.data = data;
  }


  public ReadTsKvQueryResult lastEntryTs(@Nullable Long lastEntryTs) {
    this.lastEntryTs = lastEntryTs;
    return this;
  }

  /**
   * Get lastEntryTs
   * @return lastEntryTs
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LAST_ENTRY_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLastEntryTs() {
    return lastEntryTs;
  }


  @JsonProperty(value = JSON_PROPERTY_LAST_ENTRY_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastEntryTs(@Nullable Long lastEntryTs) {
    this.lastEntryTs = lastEntryTs;
  }


  /**
   * Return true if this ReadTsKvQueryResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadTsKvQueryResult readTsKvQueryResult = (ReadTsKvQueryResult) o;
    return Objects.equals(this.queryId, readTsKvQueryResult.queryId) &&
        Objects.equals(this.data, readTsKvQueryResult.data) &&
        Objects.equals(this.lastEntryTs, readTsKvQueryResult.lastEntryTs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryId, data, lastEntryTs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadTsKvQueryResult {\n");
    sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    lastEntryTs: ").append(toIndentedString(lastEntryTs)).append("\n");
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

    // add `queryId` to the URL query string
    if (getQueryId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%squeryId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getQueryId()))));
    }

    // add `data` to the URL query string
    if (getData() != null) {
      for (int i = 0; i < getData().size(); i++) {
        if (getData().get(i) != null) {
          joiner.add(getData().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sdata%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `lastEntryTs` to the URL query string
    if (getLastEntryTs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slastEntryTs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLastEntryTs()))));
    }

    return joiner.toString();
  }
}

