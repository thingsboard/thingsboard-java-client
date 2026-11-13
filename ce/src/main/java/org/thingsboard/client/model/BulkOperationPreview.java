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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.thingsboard.client.model.SkippedApp;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * BulkOperationPreview
 */
@JsonPropertyOrder({
  BulkOperationPreview.JSON_PROPERTY_TOTAL,
  BulkOperationPreview.JSON_PROPERTY_ELIGIBLE,
  BulkOperationPreview.JSON_PROPERTY_SKIPPED_COUNTS_BY_REASON,
  BulkOperationPreview.JSON_PROPERTY_SKIPPED_SAMPLE
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class BulkOperationPreview {
  public static final String JSON_PROPERTY_TOTAL = "total";
  @Nullable
  private Integer total;

  public static final String JSON_PROPERTY_ELIGIBLE = "eligible";
  @Nullable
  private Integer eligible;

  public static final String JSON_PROPERTY_SKIPPED_COUNTS_BY_REASON = "skippedCountsByReason";
  @Nullable
  private Map<String, Integer> skippedCountsByReason = new HashMap<>();

  public static final String JSON_PROPERTY_SKIPPED_SAMPLE = "skippedSample";
  @Nullable
  private List<SkippedApp> skippedSample = new ArrayList<>();

  public BulkOperationPreview() { 
  }

  public BulkOperationPreview total(@Nullable Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Total number of apps targeted by the bulk operation
   * @return total
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getTotal() {
    return total;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotal(@Nullable Integer total) {
    this.total = total;
  }


  public BulkOperationPreview eligible(@Nullable Integer eligible) {
    this.eligible = eligible;
    return this;
  }

  /**
   * Number of apps that would be submitted (total minus skipped)
   * @return eligible
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ELIGIBLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getEligible() {
    return eligible;
  }


  @JsonProperty(value = JSON_PROPERTY_ELIGIBLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEligible(@Nullable Integer eligible) {
    this.eligible = eligible;
  }


  public BulkOperationPreview skippedCountsByReason(@Nullable Map<String, Integer> skippedCountsByReason) {
    this.skippedCountsByReason = skippedCountsByReason;
    return this;
  }

  public BulkOperationPreview putSkippedCountsByReasonItem(String key, Integer skippedCountsByReasonItem) {
    if (this.skippedCountsByReason == null) {
      this.skippedCountsByReason = new HashMap<>();
    }
    this.skippedCountsByReason.put(key, skippedCountsByReasonItem);
    return this;
  }

  /**
   * Skip count per reason for the targeted apps
   * @return skippedCountsByReason
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SKIPPED_COUNTS_BY_REASON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Integer> getSkippedCountsByReason() {
    return skippedCountsByReason;
  }


  @JsonProperty(value = JSON_PROPERTY_SKIPPED_COUNTS_BY_REASON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkippedCountsByReason(@Nullable Map<String, Integer> skippedCountsByReason) {
    this.skippedCountsByReason = skippedCountsByReason;
  }


  public BulkOperationPreview skippedSample(@Nullable List<SkippedApp> skippedSample) {
    this.skippedSample = skippedSample;
    return this;
  }

  public BulkOperationPreview addSkippedSampleItem(SkippedApp skippedSampleItem) {
    if (this.skippedSample == null) {
      this.skippedSample = new ArrayList<>();
    }
    this.skippedSample.add(skippedSampleItem);
    return this;
  }

  /**
   * Sample of skipped apps, capped per reason. Use the run history to inspect the full list.
   * @return skippedSample
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SKIPPED_SAMPLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SkippedApp> getSkippedSample() {
    return skippedSample;
  }


  @JsonProperty(value = JSON_PROPERTY_SKIPPED_SAMPLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkippedSample(@Nullable List<SkippedApp> skippedSample) {
    this.skippedSample = skippedSample;
  }


  /**
   * Return true if this BulkOperationPreview object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkOperationPreview bulkOperationPreview = (BulkOperationPreview) o;
    return Objects.equals(this.total, bulkOperationPreview.total) &&
        Objects.equals(this.eligible, bulkOperationPreview.eligible) &&
        Objects.equals(this.skippedCountsByReason, bulkOperationPreview.skippedCountsByReason) &&
        Objects.equals(this.skippedSample, bulkOperationPreview.skippedSample);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, eligible, skippedCountsByReason, skippedSample);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkOperationPreview {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    eligible: ").append(toIndentedString(eligible)).append("\n");
    sb.append("    skippedCountsByReason: ").append(toIndentedString(skippedCountsByReason)).append("\n");
    sb.append("    skippedSample: ").append(toIndentedString(skippedSample)).append("\n");
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

    // add `total` to the URL query string
    if (getTotal() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotal()))));
    }

    // add `eligible` to the URL query string
    if (getEligible() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%seligible%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEligible()))));
    }

    // add `skippedCountsByReason` to the URL query string
    if (getSkippedCountsByReason() != null) {
      for (String _key : getSkippedCountsByReason().keySet()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%sskippedCountsByReason%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix),
            getSkippedCountsByReason().get(_key), ApiClient.urlEncode(ApiClient.valueToString(getSkippedCountsByReason().get(_key)))));
      }
    }

    // add `skippedSample` to the URL query string
    if (getSkippedSample() != null) {
      for (int i = 0; i < getSkippedSample().size(); i++) {
        if (getSkippedSample().get(i) != null) {
          joiner.add(getSkippedSample().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sskippedSample%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

