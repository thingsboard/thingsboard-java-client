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
import org.thingsboard.client.model.TbContent;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * TbUserMessage
 */
@JsonPropertyOrder({
  TbUserMessage.JSON_PROPERTY_CONTENTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class TbUserMessage {
  public static final String JSON_PROPERTY_CONTENTS = "contents";
  @javax.annotation.Nonnull
  private List<TbContent> contents = new ArrayList<>();

  public TbUserMessage() { 
  }

  public TbUserMessage contents(@javax.annotation.Nonnull List<TbContent> contents) {
    this.contents = contents;
    return this;
  }

  public TbUserMessage addContentsItem(TbContent contentsItem) {
    if (this.contents == null) {
      this.contents = new ArrayList<>();
    }
    this.contents.add(contentsItem);
    return this;
  }

  /**
   * Get contents
   * @return contents
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CONTENTS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<TbContent> getContents() {
    return contents;
  }


  @JsonProperty(value = JSON_PROPERTY_CONTENTS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContents(@javax.annotation.Nonnull List<TbContent> contents) {
    this.contents = contents;
  }


  /**
   * Return true if this TbUserMessage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TbUserMessage tbUserMessage = (TbUserMessage) o;
    return Objects.equals(this.contents, tbUserMessage.contents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TbUserMessage {\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
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

    // add `contents` to the URL query string
    if (getContents() != null) {
      for (int i = 0; i < getContents().size(); i++) {
        if (getContents().get(i) != null) {
          joiner.add(getContents().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%scontents%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

