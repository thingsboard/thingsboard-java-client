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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.thingsboard.client.model.DeliveryMethodNotificationTemplate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * NotificationRequestPreview
 */
@JsonPropertyOrder({
  NotificationRequestPreview.JSON_PROPERTY_PROCESSED_TEMPLATES,
  NotificationRequestPreview.JSON_PROPERTY_TOTAL_RECIPIENTS_COUNT,
  NotificationRequestPreview.JSON_PROPERTY_RECIPIENTS_COUNT_BY_TARGET,
  NotificationRequestPreview.JSON_PROPERTY_RECIPIENTS_PREVIEW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class NotificationRequestPreview {
  public static final String JSON_PROPERTY_PROCESSED_TEMPLATES = "processedTemplates";
  @javax.annotation.Nullable
  private Map<String, DeliveryMethodNotificationTemplate> processedTemplates = new HashMap<>();

  public static final String JSON_PROPERTY_TOTAL_RECIPIENTS_COUNT = "totalRecipientsCount";
  @javax.annotation.Nullable
  private Integer totalRecipientsCount;

  public static final String JSON_PROPERTY_RECIPIENTS_COUNT_BY_TARGET = "recipientsCountByTarget";
  @javax.annotation.Nullable
  private Map<String, Integer> recipientsCountByTarget = new HashMap<>();

  public static final String JSON_PROPERTY_RECIPIENTS_PREVIEW = "recipientsPreview";
  @javax.annotation.Nullable
  private List<String> recipientsPreview = new ArrayList<>();

  public NotificationRequestPreview() { 
  }

  public NotificationRequestPreview processedTemplates(@javax.annotation.Nullable Map<String, DeliveryMethodNotificationTemplate> processedTemplates) {
    this.processedTemplates = processedTemplates;
    return this;
  }

  public NotificationRequestPreview putProcessedTemplatesItem(String key, DeliveryMethodNotificationTemplate processedTemplatesItem) {
    if (this.processedTemplates == null) {
      this.processedTemplates = new HashMap<>();
    }
    this.processedTemplates.put(key, processedTemplatesItem);
    return this;
  }

  /**
   * Get processedTemplates
   * @return processedTemplates
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PROCESSED_TEMPLATES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, DeliveryMethodNotificationTemplate> getProcessedTemplates() {
    return processedTemplates;
  }


  @JsonProperty(value = JSON_PROPERTY_PROCESSED_TEMPLATES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProcessedTemplates(@javax.annotation.Nullable Map<String, DeliveryMethodNotificationTemplate> processedTemplates) {
    this.processedTemplates = processedTemplates;
  }


  public NotificationRequestPreview totalRecipientsCount(@javax.annotation.Nullable Integer totalRecipientsCount) {
    this.totalRecipientsCount = totalRecipientsCount;
    return this;
  }

  /**
   * Get totalRecipientsCount
   * @return totalRecipientsCount
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_RECIPIENTS_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getTotalRecipientsCount() {
    return totalRecipientsCount;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_RECIPIENTS_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalRecipientsCount(@javax.annotation.Nullable Integer totalRecipientsCount) {
    this.totalRecipientsCount = totalRecipientsCount;
  }


  public NotificationRequestPreview recipientsCountByTarget(@javax.annotation.Nullable Map<String, Integer> recipientsCountByTarget) {
    this.recipientsCountByTarget = recipientsCountByTarget;
    return this;
  }

  public NotificationRequestPreview putRecipientsCountByTargetItem(String key, Integer recipientsCountByTargetItem) {
    if (this.recipientsCountByTarget == null) {
      this.recipientsCountByTarget = new HashMap<>();
    }
    this.recipientsCountByTarget.put(key, recipientsCountByTargetItem);
    return this;
  }

  /**
   * Get recipientsCountByTarget
   * @return recipientsCountByTarget
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RECIPIENTS_COUNT_BY_TARGET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Integer> getRecipientsCountByTarget() {
    return recipientsCountByTarget;
  }


  @JsonProperty(value = JSON_PROPERTY_RECIPIENTS_COUNT_BY_TARGET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecipientsCountByTarget(@javax.annotation.Nullable Map<String, Integer> recipientsCountByTarget) {
    this.recipientsCountByTarget = recipientsCountByTarget;
  }


  public NotificationRequestPreview recipientsPreview(@javax.annotation.Nullable List<String> recipientsPreview) {
    this.recipientsPreview = recipientsPreview;
    return this;
  }

  public NotificationRequestPreview addRecipientsPreviewItem(String recipientsPreviewItem) {
    if (this.recipientsPreview == null) {
      this.recipientsPreview = new ArrayList<>();
    }
    this.recipientsPreview.add(recipientsPreviewItem);
    return this;
  }

  /**
   * Get recipientsPreview
   * @return recipientsPreview
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RECIPIENTS_PREVIEW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getRecipientsPreview() {
    return recipientsPreview;
  }


  @JsonProperty(value = JSON_PROPERTY_RECIPIENTS_PREVIEW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecipientsPreview(@javax.annotation.Nullable List<String> recipientsPreview) {
    this.recipientsPreview = recipientsPreview;
  }


  /**
   * Return true if this NotificationRequestPreview object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationRequestPreview notificationRequestPreview = (NotificationRequestPreview) o;
    return Objects.equals(this.processedTemplates, notificationRequestPreview.processedTemplates) &&
        Objects.equals(this.totalRecipientsCount, notificationRequestPreview.totalRecipientsCount) &&
        Objects.equals(this.recipientsCountByTarget, notificationRequestPreview.recipientsCountByTarget) &&
        Objects.equals(this.recipientsPreview, notificationRequestPreview.recipientsPreview);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processedTemplates, totalRecipientsCount, recipientsCountByTarget, recipientsPreview);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationRequestPreview {\n");
    sb.append("    processedTemplates: ").append(toIndentedString(processedTemplates)).append("\n");
    sb.append("    totalRecipientsCount: ").append(toIndentedString(totalRecipientsCount)).append("\n");
    sb.append("    recipientsCountByTarget: ").append(toIndentedString(recipientsCountByTarget)).append("\n");
    sb.append("    recipientsPreview: ").append(toIndentedString(recipientsPreview)).append("\n");
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

    // add `processedTemplates` to the URL query string
    if (getProcessedTemplates() != null) {
      for (String _key : getProcessedTemplates().keySet()) {
        if (getProcessedTemplates().get(_key) != null) {
          joiner.add(getProcessedTemplates().get(_key).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sprocessedTemplates%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    // add `totalRecipientsCount` to the URL query string
    if (getTotalRecipientsCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotalRecipientsCount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalRecipientsCount()))));
    }

    // add `recipientsCountByTarget` to the URL query string
    if (getRecipientsCountByTarget() != null) {
      for (String _key : getRecipientsCountByTarget().keySet()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%srecipientsCountByTarget%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix),
            getRecipientsCountByTarget().get(_key), ApiClient.urlEncode(ApiClient.valueToString(getRecipientsCountByTarget().get(_key)))));
      }
    }

    // add `recipientsPreview` to the URL query string
    if (getRecipientsPreview() != null) {
      for (int i = 0; i < getRecipientsPreview().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%srecipientsPreview%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getRecipientsPreview().get(i)))));
      }
    }

    return joiner.toString();
  }
}

