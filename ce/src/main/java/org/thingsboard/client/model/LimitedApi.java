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
 * Gets or Sets LimitedApi
 */
public enum LimitedApi {
  
  ENTITY_EXPORT("ENTITY_EXPORT"),
  
  ENTITY_IMPORT("ENTITY_IMPORT"),
  
  NOTIFICATION_REQUESTS("NOTIFICATION_REQUESTS"),
  
  NOTIFICATION_REQUESTS_PER_RULE("NOTIFICATION_REQUESTS_PER_RULE"),
  
  REST_REQUESTS_PER_TENANT("REST_REQUESTS_PER_TENANT"),
  
  REST_REQUESTS_PER_CUSTOMER("REST_REQUESTS_PER_CUSTOMER"),
  
  WS_UPDATES_PER_SESSION("WS_UPDATES_PER_SESSION"),
  
  CASSANDRA_WRITE_QUERIES_CORE("CASSANDRA_WRITE_QUERIES_CORE"),
  
  CASSANDRA_READ_QUERIES_CORE("CASSANDRA_READ_QUERIES_CORE"),
  
  CASSANDRA_WRITE_QUERIES_RULE_ENGINE("CASSANDRA_WRITE_QUERIES_RULE_ENGINE"),
  
  CASSANDRA_READ_QUERIES_RULE_ENGINE("CASSANDRA_READ_QUERIES_RULE_ENGINE"),
  
  CASSANDRA_READ_QUERIES_MONOLITH("CASSANDRA_READ_QUERIES_MONOLITH"),
  
  CASSANDRA_WRITE_QUERIES_MONOLITH("CASSANDRA_WRITE_QUERIES_MONOLITH"),
  
  CASSANDRA_QUERIES("CASSANDRA_QUERIES"),
  
  EDGE_EVENTS("EDGE_EVENTS"),
  
  EDGE_EVENTS_PER_EDGE("EDGE_EVENTS_PER_EDGE"),
  
  EDGE_UPLINK_MESSAGES("EDGE_UPLINK_MESSAGES"),
  
  EDGE_UPLINK_MESSAGES_PER_EDGE("EDGE_UPLINK_MESSAGES_PER_EDGE"),
  
  PASSWORD_RESET("PASSWORD_RESET"),
  
  TWO_FA_VERIFICATION_CODE_SEND("TWO_FA_VERIFICATION_CODE_SEND"),
  
  TWO_FA_VERIFICATION_CODE_CHECK("TWO_FA_VERIFICATION_CODE_CHECK"),
  
  TRANSPORT_MESSAGES_PER_TENANT("TRANSPORT_MESSAGES_PER_TENANT"),
  
  TRANSPORT_MESSAGES_PER_DEVICE("TRANSPORT_MESSAGES_PER_DEVICE"),
  
  TRANSPORT_MESSAGES_PER_GATEWAY("TRANSPORT_MESSAGES_PER_GATEWAY"),
  
  TRANSPORT_MESSAGES_PER_GATEWAY_DEVICE("TRANSPORT_MESSAGES_PER_GATEWAY_DEVICE"),
  
  EMAILS("EMAILS"),
  
  WS_SUBSCRIPTIONS("WS_SUBSCRIPTIONS"),
  
  CALCULATED_FIELD_DEBUG_EVENTS("CALCULATED_FIELD_DEBUG_EVENTS");

  private String value;

  LimitedApi(String value) {
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
  public static LimitedApi fromValue(String value) {
    for (LimitedApi b : LimitedApi.values()) {
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

