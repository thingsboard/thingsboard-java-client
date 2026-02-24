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
import org.thingsboard.client.model.CustomerId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * ShortCustomerInfo
 */
@JsonPropertyOrder({
  ShortCustomerInfo.JSON_PROPERTY_CUSTOMER_ID,
  ShortCustomerInfo.JSON_PROPERTY_TITLE,
  ShortCustomerInfo.JSON_PROPERTY_IS_PUBLIC,
  ShortCustomerInfo.JSON_PROPERTY_PUBLIC
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class ShortCustomerInfo {
  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @javax.annotation.Nullable
  private CustomerId customerId;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private String title;

  public static final String JSON_PROPERTY_IS_PUBLIC = "isPublic";
  @javax.annotation.Nullable
  private Boolean isPublic;

  public static final String JSON_PROPERTY_PUBLIC = "public";
  @javax.annotation.Nullable
  private Boolean _public;

  public ShortCustomerInfo() { 
  }

  public ShortCustomerInfo customerId(@javax.annotation.Nullable CustomerId customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * JSON object with the customer Id.
   * @return customerId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomerId getCustomerId() {
    return customerId;
  }


  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerId(@javax.annotation.Nullable CustomerId customerId) {
    this.customerId = customerId;
  }


  public ShortCustomerInfo title(@javax.annotation.Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the customer.
   * @return title
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = title;
  }


  public ShortCustomerInfo isPublic(@javax.annotation.Nullable Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

  /**
   * Get isPublic
   * @return isPublic
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_IS_PUBLIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsPublic() {
    return isPublic;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_PUBLIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPublic(@javax.annotation.Nullable Boolean isPublic) {
    this.isPublic = isPublic;
  }


  public ShortCustomerInfo _public(@javax.annotation.Nullable Boolean _public) {
    this._public = _public;
    return this;
  }

  /**
   * Get _public
   * @return _public
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PUBLIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPublic() {
    return _public;
  }


  @JsonProperty(value = JSON_PROPERTY_PUBLIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublic(@javax.annotation.Nullable Boolean _public) {
    this._public = _public;
  }


  /**
   * Return true if this ShortCustomerInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShortCustomerInfo shortCustomerInfo = (ShortCustomerInfo) o;
    return Objects.equals(this.customerId, shortCustomerInfo.customerId) &&
        Objects.equals(this.title, shortCustomerInfo.title) &&
        Objects.equals(this.isPublic, shortCustomerInfo.isPublic) &&
        Objects.equals(this._public, shortCustomerInfo._public);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, title, isPublic, _public);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShortCustomerInfo {\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
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

    // add `customerId` to the URL query string
    if (getCustomerId() != null) {
      joiner.add(getCustomerId().toUrlQueryString(prefix + "customerId" + suffix));
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTitle()))));
    }

    // add `isPublic` to the URL query string
    if (getIsPublic() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sisPublic%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIsPublic()))));
    }

    // add `public` to the URL query string
    if (getPublic() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spublic%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPublic()))));
    }

    return joiner.toString();
  }
}

