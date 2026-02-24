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
import org.thingsboard.client.model.SmsProviderConfiguration;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the Test SMS request.
 */
@JsonPropertyOrder({
  TestSmsRequest.JSON_PROPERTY_PROVIDER_CONFIGURATION,
  TestSmsRequest.JSON_PROPERTY_NUMBER_TO,
  TestSmsRequest.JSON_PROPERTY_MESSAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class TestSmsRequest {
  public static final String JSON_PROPERTY_PROVIDER_CONFIGURATION = "providerConfiguration";
  @javax.annotation.Nullable
  private SmsProviderConfiguration providerConfiguration;

  public static final String JSON_PROPERTY_NUMBER_TO = "numberTo";
  @javax.annotation.Nullable
  private String numberTo;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  @javax.annotation.Nullable
  private String message;

  public TestSmsRequest() { 
  }

  public TestSmsRequest providerConfiguration(@javax.annotation.Nullable SmsProviderConfiguration providerConfiguration) {
    this.providerConfiguration = providerConfiguration;
    return this;
  }

  /**
   * The SMS provider configuration
   * @return providerConfiguration
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PROVIDER_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SmsProviderConfiguration getProviderConfiguration() {
    return providerConfiguration;
  }


  @JsonProperty(value = JSON_PROPERTY_PROVIDER_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProviderConfiguration(@javax.annotation.Nullable SmsProviderConfiguration providerConfiguration) {
    this.providerConfiguration = providerConfiguration;
  }


  public TestSmsRequest numberTo(@javax.annotation.Nullable String numberTo) {
    this.numberTo = numberTo;
    return this;
  }

  /**
   * The phone number or other identifier to specify as a recipient of the SMS.
   * @return numberTo
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NUMBER_TO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNumberTo() {
    return numberTo;
  }


  @JsonProperty(value = JSON_PROPERTY_NUMBER_TO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberTo(@javax.annotation.Nullable String numberTo) {
    this.numberTo = numberTo;
  }


  public TestSmsRequest message(@javax.annotation.Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * The test message
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


  /**
   * Return true if this TestSmsRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestSmsRequest testSmsRequest = (TestSmsRequest) o;
    return Objects.equals(this.providerConfiguration, testSmsRequest.providerConfiguration) &&
        Objects.equals(this.numberTo, testSmsRequest.numberTo) &&
        Objects.equals(this.message, testSmsRequest.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerConfiguration, numberTo, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestSmsRequest {\n");
    sb.append("    providerConfiguration: ").append(toIndentedString(providerConfiguration)).append("\n");
    sb.append("    numberTo: ").append(toIndentedString(numberTo)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

    // add `providerConfiguration` to the URL query string
    if (getProviderConfiguration() != null) {
      joiner.add(getProviderConfiguration().toUrlQueryString(prefix + "providerConfiguration" + suffix));
    }

    // add `numberTo` to the URL query string
    if (getNumberTo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snumberTo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNumberTo()))));
    }

    // add `message` to the URL query string
    if (getMessage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smessage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMessage()))));
    }

    return joiner.toString();
  }
}

