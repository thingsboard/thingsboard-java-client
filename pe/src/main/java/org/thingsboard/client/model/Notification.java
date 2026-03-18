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
import org.thingsboard.client.model.NotificationDeliveryMethod;
import org.thingsboard.client.model.NotificationId;
import org.thingsboard.client.model.NotificationInfo;
import org.thingsboard.client.model.NotificationRequestId;
import org.thingsboard.client.model.NotificationStatus;
import org.thingsboard.client.model.NotificationType;
import org.thingsboard.client.model.UserId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * Notification
 */
@JsonPropertyOrder({
  Notification.JSON_PROPERTY_ID,
  Notification.JSON_PROPERTY_CREATED_TIME,
  Notification.JSON_PROPERTY_REQUEST_ID,
  Notification.JSON_PROPERTY_RECIPIENT_ID,
  Notification.JSON_PROPERTY_TYPE,
  Notification.JSON_PROPERTY_DELIVERY_METHOD,
  Notification.JSON_PROPERTY_SUBJECT,
  Notification.JSON_PROPERTY_TEXT,
  Notification.JSON_PROPERTY_ADDITIONAL_CONFIG,
  Notification.JSON_PROPERTY_INFO,
  Notification.JSON_PROPERTY_STATUS
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class Notification {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private NotificationId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  @Nullable
  private NotificationRequestId requestId;

  public static final String JSON_PROPERTY_RECIPIENT_ID = "recipientId";
  @Nullable
  private UserId recipientId;

  public static final String JSON_PROPERTY_TYPE = "type";
  @Nullable
  private NotificationType type;

  public static final String JSON_PROPERTY_DELIVERY_METHOD = "deliveryMethod";
  @Nullable
  private NotificationDeliveryMethod deliveryMethod;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  @Nullable
  private String subject;

  public static final String JSON_PROPERTY_TEXT = "text";
  @Nullable
  private String text;

  public static final String JSON_PROPERTY_ADDITIONAL_CONFIG = "additionalConfig";
  @Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalConfig = null;

  public static final String JSON_PROPERTY_INFO = "info";
  @Nullable
  private NotificationInfo info;

  public static final String JSON_PROPERTY_STATUS = "status";
  @Nullable
  private NotificationStatus status;

  public Notification() { 
  }

  @JsonCreator
  public Notification(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime
  ) {
  this();
    this.createdTime = createdTime;
  }

  public Notification id(@Nullable NotificationId id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NotificationId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable NotificationId id) {
    this.id = id;
  }


  /**
   * Entity creation timestamp in milliseconds since Unix epoch
   * @return createdTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  public Notification requestId(@Nullable NotificationRequestId requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Get requestId
   * @return requestId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_REQUEST_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NotificationRequestId getRequestId() {
    return requestId;
  }


  @JsonProperty(value = JSON_PROPERTY_REQUEST_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestId(@Nullable NotificationRequestId requestId) {
    this.requestId = requestId;
  }


  public Notification recipientId(@Nullable UserId recipientId) {
    this.recipientId = recipientId;
    return this;
  }

  /**
   * Get recipientId
   * @return recipientId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_RECIPIENT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UserId getRecipientId() {
    return recipientId;
  }


  @JsonProperty(value = JSON_PROPERTY_RECIPIENT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecipientId(@Nullable UserId recipientId) {
    this.recipientId = recipientId;
  }


  public Notification type(@Nullable NotificationType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NotificationType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@Nullable NotificationType type) {
    this.type = type;
  }


  public Notification deliveryMethod(@Nullable NotificationDeliveryMethod deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
    return this;
  }

  /**
   * Get deliveryMethod
   * @return deliveryMethod
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DELIVERY_METHOD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NotificationDeliveryMethod getDeliveryMethod() {
    return deliveryMethod;
  }


  @JsonProperty(value = JSON_PROPERTY_DELIVERY_METHOD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryMethod(@Nullable NotificationDeliveryMethod deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }


  public Notification subject(@Nullable String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   * @return subject
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SUBJECT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSubject() {
    return subject;
  }


  @JsonProperty(value = JSON_PROPERTY_SUBJECT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubject(@Nullable String subject) {
    this.subject = subject;
  }


  public Notification text(@Nullable String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TEXT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getText() {
    return text;
  }


  @JsonProperty(value = JSON_PROPERTY_TEXT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setText(@Nullable String text) {
    this.text = text;
  }


  public Notification additionalConfig(@Nullable com.fasterxml.jackson.databind.JsonNode additionalConfig) {
    this.additionalConfig = additionalConfig;
    return this;
  }

  /**
   * Get additionalConfig
   * @return additionalConfig
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_CONFIG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getAdditionalConfig() {
    return additionalConfig;
  }


  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_CONFIG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalConfig(@Nullable com.fasterxml.jackson.databind.JsonNode additionalConfig) {
    this.additionalConfig = additionalConfig;
  }


  public Notification info(@Nullable NotificationInfo info) {
    this.info = info;
    return this;
  }

  /**
   * Get info
   * @return info
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NotificationInfo getInfo() {
    return info;
  }


  @JsonProperty(value = JSON_PROPERTY_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInfo(@Nullable NotificationInfo info) {
    this.info = info;
  }


  public Notification status(@Nullable NotificationStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NotificationStatus getStatus() {
    return status;
  }


  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(@Nullable NotificationStatus status) {
    this.status = status;
  }


  /**
   * Return true if this Notification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notification notification = (Notification) o;
    return Objects.equals(this.id, notification.id) &&
        Objects.equals(this.createdTime, notification.createdTime) &&
        Objects.equals(this.requestId, notification.requestId) &&
        Objects.equals(this.recipientId, notification.recipientId) &&
        Objects.equals(this.type, notification.type) &&
        Objects.equals(this.deliveryMethod, notification.deliveryMethod) &&
        Objects.equals(this.subject, notification.subject) &&
        Objects.equals(this.text, notification.text) &&
        Objects.equals(this.additionalConfig, notification.additionalConfig) &&
        Objects.equals(this.info, notification.info) &&
        Objects.equals(this.status, notification.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, requestId, recipientId, type, deliveryMethod, subject, text, additionalConfig, info, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    deliveryMethod: ").append(toIndentedString(deliveryMethod)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    additionalConfig: ").append(toIndentedString(additionalConfig)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(getId().toUrlQueryString(prefix + "id" + suffix));
    }

    // add `createdTime` to the URL query string
    if (getCreatedTime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%screatedTime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCreatedTime()))));
    }

    // add `requestId` to the URL query string
    if (getRequestId() != null) {
      joiner.add(getRequestId().toUrlQueryString(prefix + "requestId" + suffix));
    }

    // add `recipientId` to the URL query string
    if (getRecipientId() != null) {
      joiner.add(getRecipientId().toUrlQueryString(prefix + "recipientId" + suffix));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `deliveryMethod` to the URL query string
    if (getDeliveryMethod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdeliveryMethod%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDeliveryMethod()))));
    }

    // add `subject` to the URL query string
    if (getSubject() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssubject%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSubject()))));
    }

    // add `text` to the URL query string
    if (getText() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stext%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getText()))));
    }

    // add `additionalConfig` to the URL query string
    if (getAdditionalConfig() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditionalConfig%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalConfig()))));
    }

    // add `info` to the URL query string
    if (getInfo() != null) {
      joiner.add(getInfo().toUrlQueryString(prefix + "info" + suffix));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstatus%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStatus()))));
    }

    return joiner.toString();
  }
}

