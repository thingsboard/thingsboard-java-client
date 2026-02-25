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
import org.thingsboard.client.model.AlarmCommentId;
import org.thingsboard.client.model.AlarmCommentType;
import org.thingsboard.client.model.AlarmId;
import org.thingsboard.client.model.UserId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AlarmComment
 */
@JsonPropertyOrder({
  AlarmComment.JSON_PROPERTY_ALARM_ID,
  AlarmComment.JSON_PROPERTY_USER_ID,
  AlarmComment.JSON_PROPERTY_TYPE,
  AlarmComment.JSON_PROPERTY_COMMENT,
  AlarmComment.JSON_PROPERTY_ID,
  AlarmComment.JSON_PROPERTY_CREATED_TIME,
  AlarmComment.JSON_PROPERTY_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AlarmComment {
  public static final String JSON_PROPERTY_ALARM_ID = "alarmId";
  @javax.annotation.Nullable
  private AlarmId alarmId;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  @javax.annotation.Nullable
  private UserId userId;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private AlarmCommentType type;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode comment;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private AlarmCommentId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public AlarmComment() { 
  }

  @JsonCreator
  public AlarmComment(
    @JsonProperty(JSON_PROPERTY_ALARM_ID) AlarmId alarmId, 
    @JsonProperty(JSON_PROPERTY_USER_ID) UserId userId, 
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_NAME) String name
  ) {
  this();
    this.alarmId = alarmId;
    this.userId = userId;
    this.createdTime = createdTime;
    this.name = name;
  }

  /**
   * JSON object with Alarm id.
   * @return alarmId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ALARM_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AlarmId getAlarmId() {
    return alarmId;
  }




  /**
   * JSON object with User id.
   * @return userId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_USER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UserId getUserId() {
    return userId;
  }




  public AlarmComment type(@javax.annotation.Nullable AlarmCommentType type) {
    this.type = type;
    return this;
  }

  /**
   * Defines origination of comment. System type means comment was created by TB. OTHER type means comment was created by user.
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AlarmCommentType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable AlarmCommentType type) {
    this.type = type;
  }


  public AlarmComment comment(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode comment) {
    this.comment = comment;
    return this;
  }

  /**
   * JSON object with text of comment.
   * @return comment
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_COMMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getComment() {
    return comment;
  }


  @JsonProperty(value = JSON_PROPERTY_COMMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComment(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode comment) {
    this.comment = comment;
  }


  public AlarmComment id(@javax.annotation.Nullable AlarmCommentId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the alarm comment Id. Specify this field to update the alarm comment. Referencing non-existing alarm Id will cause error. Omit this field to create new alarm.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AlarmCommentId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable AlarmCommentId id) {
    this.id = id;
  }


  /**
   * Timestamp of the alarm comment creation, in milliseconds
   * @return createdTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  /**
   * representing comment text
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }




  /**
   * Return true if this AlarmComment object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmComment alarmComment = (AlarmComment) o;
    return Objects.equals(this.alarmId, alarmComment.alarmId) &&
        Objects.equals(this.userId, alarmComment.userId) &&
        Objects.equals(this.type, alarmComment.type) &&
        Objects.equals(this.comment, alarmComment.comment) &&
        Objects.equals(this.id, alarmComment.id) &&
        Objects.equals(this.createdTime, alarmComment.createdTime) &&
        Objects.equals(this.name, alarmComment.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alarmId, userId, type, comment, id, createdTime, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmComment {\n");
    sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

    // add `alarmId` to the URL query string
    if (getAlarmId() != null) {
      joiner.add(getAlarmId().toUrlQueryString(prefix + "alarmId" + suffix));
    }

    // add `userId` to the URL query string
    if (getUserId() != null) {
      joiner.add(getUserId().toUrlQueryString(prefix + "userId" + suffix));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `comment` to the URL query string
    if (getComment() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scomment%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getComment()))));
    }

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(getId().toUrlQueryString(prefix + "id" + suffix));
    }

    // add `createdTime` to the URL query string
    if (getCreatedTime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%screatedTime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCreatedTime()))));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    return joiner.toString();
  }
}

