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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets IntegrationType
 */
public enum IntegrationType {
  
  OCEANCONNECT("OCEANCONNECT"),
  
  SIGFOX("SIGFOX"),
  
  THINGPARK("THINGPARK"),
  
  TPE("TPE"),
  
  CHIRPSTACK("CHIRPSTACK"),
  
  PARTICLE("PARTICLE"),
  
  TMOBILE_IOT_CDP("TMOBILE_IOT_CDP"),
  
  HTTP("HTTP"),
  
  MQTT("MQTT"),
  
  PUB_SUB("PUB_SUB"),
  
  AWS_IOT("AWS_IOT"),
  
  AWS_SQS("AWS_SQS"),
  
  AWS_KINESIS("AWS_KINESIS"),
  
  TTN("TTN"),
  
  TTI("TTI"),
  
  AZURE_EVENT_HUB("AZURE_EVENT_HUB"),
  
  OPC_UA("OPC_UA"),
  
  CUSTOM("CUSTOM"),
  
  UDP("UDP"),
  
  TCP("TCP"),
  
  KAFKA("KAFKA"),
  
  AZURE_IOT_HUB("AZURE_IOT_HUB"),
  
  APACHE_PULSAR("APACHE_PULSAR"),
  
  RABBITMQ("RABBITMQ"),
  
  LORIOT("LORIOT"),
  
  COAP("COAP"),
  
  TUYA("TUYA"),
  
  AZURE_SERVICE_BUS("AZURE_SERVICE_BUS"),
  
  KPN("KPN");

  private String value;

  IntegrationType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static IntegrationType fromValue(String value) {
    for (IntegrationType b : IntegrationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    if (prefix == null) {
      prefix = "";
    }

    return String.format(java.util.Locale.ROOT, "%s=%s", prefix, this.toString());
  }

}

