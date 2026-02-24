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
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.thingsboard.client.model.ReportComponent;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * HeaderFooter
 */
@JsonPropertyOrder({
  HeaderFooter.JSON_PROPERTY_ENABLED,
  HeaderFooter.JSON_PROPERTY_COMPONENTS,
  HeaderFooter.JSON_PROPERTY_FIRST_PAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class HeaderFooter {
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  @javax.annotation.Nullable
  private Boolean enabled;

  public static final String JSON_PROPERTY_COMPONENTS = "components";
  @javax.annotation.Nonnull
  private List<ReportComponent> components = new ArrayList<>();

  public static final String JSON_PROPERTY_FIRST_PAGE = "firstPage";
  private JsonNullable<Object> firstPage = JsonNullable.<Object>of(null);

  public HeaderFooter() { 
  }

  public HeaderFooter enabled(@javax.annotation.Nullable Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(value = JSON_PROPERTY_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(@javax.annotation.Nullable Boolean enabled) {
    this.enabled = enabled;
  }


  public HeaderFooter components(@javax.annotation.Nonnull List<ReportComponent> components) {
    this.components = components;
    return this;
  }

  public HeaderFooter addComponentsItem(ReportComponent componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<>();
    }
    this.components.add(componentsItem);
    return this;
  }

  /**
   * Get components
   * @return components
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_COMPONENTS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ReportComponent> getComponents() {
    return components;
  }


  @JsonProperty(value = JSON_PROPERTY_COMPONENTS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setComponents(@javax.annotation.Nonnull List<ReportComponent> components) {
    this.components = components;
  }


  public HeaderFooter firstPage(@javax.annotation.Nullable Object firstPage) {
    this.firstPage = JsonNullable.<Object>of(firstPage);
    return this;
  }

  /**
   * Get firstPage
   * @return firstPage
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public Object getFirstPage() {
        return firstPage.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FIRST_PAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getFirstPage_JsonNullable() {
    return firstPage;
  }
  
  @JsonProperty(JSON_PROPERTY_FIRST_PAGE)
  public void setFirstPage_JsonNullable(JsonNullable<Object> firstPage) {
    this.firstPage = firstPage;
  }

  public void setFirstPage(@javax.annotation.Nullable Object firstPage) {
    this.firstPage = JsonNullable.<Object>of(firstPage);
  }


  /**
   * Return true if this HeaderFooter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeaderFooter headerFooter = (HeaderFooter) o;
    return Objects.equals(this.enabled, headerFooter.enabled) &&
        Objects.equals(this.components, headerFooter.components) &&
        equalsNullable(this.firstPage, headerFooter.firstPage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, components, hashCodeNullable(firstPage));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaderFooter {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    firstPage: ").append(toIndentedString(firstPage)).append("\n");
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

    // add `enabled` to the URL query string
    if (getEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%senabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEnabled()))));
    }

    // add `components` to the URL query string
    if (getComponents() != null) {
      for (int i = 0; i < getComponents().size(); i++) {
        if (getComponents().get(i) != null) {
          joiner.add(getComponents().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%scomponents%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `firstPage` to the URL query string
    if (getFirstPage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfirstPage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFirstPage()))));
    }

    return joiner.toString();
  }
}

