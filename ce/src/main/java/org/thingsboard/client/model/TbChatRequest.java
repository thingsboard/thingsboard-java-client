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
import org.thingsboard.client.model.AiModelConfig;
import org.thingsboard.client.model.TbUserMessage;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * TbChatRequest
 */
@JsonPropertyOrder({
  TbChatRequest.JSON_PROPERTY_SYSTEM_MESSAGE,
  TbChatRequest.JSON_PROPERTY_USER_MESSAGE,
  TbChatRequest.JSON_PROPERTY_CHAT_MODEL_CONFIG
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class TbChatRequest {
  public static final String JSON_PROPERTY_SYSTEM_MESSAGE = "systemMessage";
  @javax.annotation.Nullable
  private String systemMessage;

  public static final String JSON_PROPERTY_USER_MESSAGE = "userMessage";
  @javax.annotation.Nonnull
  private TbUserMessage userMessage;

  public static final String JSON_PROPERTY_CHAT_MODEL_CONFIG = "chatModelConfig";
  @javax.annotation.Nonnull
  private AiModelConfig chatModelConfig;

  public TbChatRequest() { 
  }

  public TbChatRequest systemMessage(@javax.annotation.Nullable String systemMessage) {
    this.systemMessage = systemMessage;
    return this;
  }

  /**
   * A system-level instruction that frames the user&#39;s input, setting the persona, tone, and constraints for the generated response
   * @return systemMessage
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SYSTEM_MESSAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSystemMessage() {
    return systemMessage;
  }


  @JsonProperty(value = JSON_PROPERTY_SYSTEM_MESSAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSystemMessage(@javax.annotation.Nullable String systemMessage) {
    this.systemMessage = systemMessage;
  }


  public TbChatRequest userMessage(@javax.annotation.Nonnull TbUserMessage userMessage) {
    this.userMessage = userMessage;
    return this;
  }

  /**
   * The actual user prompt that will be answered by the AI model
   * @return userMessage
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_USER_MESSAGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TbUserMessage getUserMessage() {
    return userMessage;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_MESSAGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserMessage(@javax.annotation.Nonnull TbUserMessage userMessage) {
    this.userMessage = userMessage;
  }


  public TbChatRequest chatModelConfig(@javax.annotation.Nonnull AiModelConfig chatModelConfig) {
    this.chatModelConfig = chatModelConfig;
    return this;
  }

  /**
   * Configuration of the AI chat model that should execute the request
   * @return chatModelConfig
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CHAT_MODEL_CONFIG, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiModelConfig getChatModelConfig() {
    return chatModelConfig;
  }


  @JsonProperty(value = JSON_PROPERTY_CHAT_MODEL_CONFIG, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChatModelConfig(@javax.annotation.Nonnull AiModelConfig chatModelConfig) {
    this.chatModelConfig = chatModelConfig;
  }


  /**
   * Return true if this TbChatRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TbChatRequest tbChatRequest = (TbChatRequest) o;
    return Objects.equals(this.systemMessage, tbChatRequest.systemMessage) &&
        Objects.equals(this.userMessage, tbChatRequest.userMessage) &&
        Objects.equals(this.chatModelConfig, tbChatRequest.chatModelConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemMessage, userMessage, chatModelConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TbChatRequest {\n");
    sb.append("    systemMessage: ").append(toIndentedString(systemMessage)).append("\n");
    sb.append("    userMessage: ").append(toIndentedString(userMessage)).append("\n");
    sb.append("    chatModelConfig: ").append(toIndentedString(chatModelConfig)).append("\n");
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

    // add `systemMessage` to the URL query string
    if (getSystemMessage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssystemMessage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSystemMessage()))));
    }

    // add `userMessage` to the URL query string
    if (getUserMessage() != null) {
      joiner.add(getUserMessage().toUrlQueryString(prefix + "userMessage" + suffix));
    }

    // add `chatModelConfig` to the URL query string
    if (getChatModelConfig() != null) {
      joiner.add(getChatModelConfig().toUrlQueryString(prefix + "chatModelConfig" + suffix));
    }

    return joiner.toString();
  }
}

