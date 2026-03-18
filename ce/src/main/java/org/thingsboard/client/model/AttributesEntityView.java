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
import javax.annotation.Nonnull;
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AttributesEntityView
 */
@JsonPropertyOrder({
  AttributesEntityView.JSON_PROPERTY_CS,
  AttributesEntityView.JSON_PROPERTY_SS,
  AttributesEntityView.JSON_PROPERTY_SH
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AttributesEntityView {
  public static final String JSON_PROPERTY_CS = "cs";
  @Nonnull
  private List<String> cs = new ArrayList<>();

  public static final String JSON_PROPERTY_SS = "ss";
  @Nonnull
  private List<String> ss = new ArrayList<>();

  public static final String JSON_PROPERTY_SH = "sh";
  @Nonnull
  private List<String> sh = new ArrayList<>();

  public AttributesEntityView() { 
  }

  public AttributesEntityView cs(@Nonnull List<String> cs) {
    this.cs = cs;
    return this;
  }

  public AttributesEntityView addCsItem(String csItem) {
    if (this.cs == null) {
      this.cs = new ArrayList<>();
    }
    this.cs.add(csItem);
    return this;
  }

  /**
   * List of client-side attribute keys to expose
   * @return cs
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_CS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getCs() {
    return cs;
  }


  @JsonProperty(value = JSON_PROPERTY_CS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCs(@Nonnull List<String> cs) {
    this.cs = cs;
  }


  public AttributesEntityView ss(@Nonnull List<String> ss) {
    this.ss = ss;
    return this;
  }

  public AttributesEntityView addSsItem(String ssItem) {
    if (this.ss == null) {
      this.ss = new ArrayList<>();
    }
    this.ss.add(ssItem);
    return this;
  }

  /**
   * List of server-side attribute keys to expose
   * @return ss
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_SS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getSs() {
    return ss;
  }


  @JsonProperty(value = JSON_PROPERTY_SS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSs(@Nonnull List<String> ss) {
    this.ss = ss;
  }


  public AttributesEntityView sh(@Nonnull List<String> sh) {
    this.sh = sh;
    return this;
  }

  public AttributesEntityView addShItem(String shItem) {
    if (this.sh == null) {
      this.sh = new ArrayList<>();
    }
    this.sh.add(shItem);
    return this;
  }

  /**
   * List of shared attribute keys to expose
   * @return sh
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_SH, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getSh() {
    return sh;
  }


  @JsonProperty(value = JSON_PROPERTY_SH, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSh(@Nonnull List<String> sh) {
    this.sh = sh;
  }


  /**
   * Return true if this AttributesEntityView object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributesEntityView attributesEntityView = (AttributesEntityView) o;
    return Objects.equals(this.cs, attributesEntityView.cs) &&
        Objects.equals(this.ss, attributesEntityView.ss) &&
        Objects.equals(this.sh, attributesEntityView.sh);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cs, ss, sh);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributesEntityView {\n");
    sb.append("    cs: ").append(toIndentedString(cs)).append("\n");
    sb.append("    ss: ").append(toIndentedString(ss)).append("\n");
    sb.append("    sh: ").append(toIndentedString(sh)).append("\n");
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

    // add `cs` to the URL query string
    if (getCs() != null) {
      for (int i = 0; i < getCs().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%scs%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getCs().get(i)))));
      }
    }

    // add `ss` to the URL query string
    if (getSs() != null) {
      for (int i = 0; i < getSs().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%sss%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getSs().get(i)))));
      }
    }

    // add `sh` to the URL query string
    if (getSh() != null) {
      for (int i = 0; i < getSh().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%ssh%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getSh().get(i)))));
      }
    }

    return joiner.toString();
  }
}

