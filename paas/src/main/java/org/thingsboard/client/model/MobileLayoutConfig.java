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
import org.thingsboard.client.model.MobilePage;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * MobileLayoutConfig
 */
@JsonPropertyOrder({
  MobileLayoutConfig.JSON_PROPERTY_PAGES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class MobileLayoutConfig {
  public static final String JSON_PROPERTY_PAGES = "pages";
  @javax.annotation.Nullable
  private List<MobilePage> pages = new ArrayList<>();

  public MobileLayoutConfig() { 
  }

  public MobileLayoutConfig pages(@javax.annotation.Nullable List<MobilePage> pages) {
    this.pages = pages;
    return this;
  }

  public MobileLayoutConfig addPagesItem(MobilePage pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<>();
    }
    this.pages.add(pagesItem);
    return this;
  }

  /**
   * Get pages
   * @return pages
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PAGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<MobilePage> getPages() {
    return pages;
  }


  @JsonProperty(value = JSON_PROPERTY_PAGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPages(@javax.annotation.Nullable List<MobilePage> pages) {
    this.pages = pages;
  }


  /**
   * Return true if this MobileLayoutConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileLayoutConfig mobileLayoutConfig = (MobileLayoutConfig) o;
    return Objects.equals(this.pages, mobileLayoutConfig.pages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileLayoutConfig {\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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

    // add `pages` to the URL query string
    if (getPages() != null) {
      for (int i = 0; i < getPages().size(); i++) {
        if (getPages().get(i) != null) {
          joiner.add(getPages().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%spages%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

