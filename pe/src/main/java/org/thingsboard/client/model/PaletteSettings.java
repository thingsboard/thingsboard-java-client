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
import org.thingsboard.client.model.Palette;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * PaletteSettings
 */
@JsonPropertyOrder({
  PaletteSettings.JSON_PROPERTY_PRIMARY_PALETTE,
  PaletteSettings.JSON_PROPERTY_ACCENT_PALETTE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class PaletteSettings {
  public static final String JSON_PROPERTY_PRIMARY_PALETTE = "primaryPalette";
  @javax.annotation.Nonnull
  private Palette primaryPalette;

  public static final String JSON_PROPERTY_ACCENT_PALETTE = "accentPalette";
  @javax.annotation.Nonnull
  private Palette accentPalette;

  public PaletteSettings() { 
  }

  public PaletteSettings primaryPalette(@javax.annotation.Nonnull Palette primaryPalette) {
    this.primaryPalette = primaryPalette;
    return this;
  }

  /**
   * Primary palette JSON
   * @return primaryPalette
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_PRIMARY_PALETTE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Palette getPrimaryPalette() {
    return primaryPalette;
  }


  @JsonProperty(value = JSON_PROPERTY_PRIMARY_PALETTE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrimaryPalette(@javax.annotation.Nonnull Palette primaryPalette) {
    this.primaryPalette = primaryPalette;
  }


  public PaletteSettings accentPalette(@javax.annotation.Nonnull Palette accentPalette) {
    this.accentPalette = accentPalette;
    return this;
  }

  /**
   * Accent palette JSON
   * @return accentPalette
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ACCENT_PALETTE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Palette getAccentPalette() {
    return accentPalette;
  }


  @JsonProperty(value = JSON_PROPERTY_ACCENT_PALETTE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccentPalette(@javax.annotation.Nonnull Palette accentPalette) {
    this.accentPalette = accentPalette;
  }


  /**
   * Return true if this PaletteSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaletteSettings paletteSettings = (PaletteSettings) o;
    return Objects.equals(this.primaryPalette, paletteSettings.primaryPalette) &&
        Objects.equals(this.accentPalette, paletteSettings.accentPalette);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryPalette, accentPalette);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaletteSettings {\n");
    sb.append("    primaryPalette: ").append(toIndentedString(primaryPalette)).append("\n");
    sb.append("    accentPalette: ").append(toIndentedString(accentPalette)).append("\n");
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

    // add `primaryPalette` to the URL query string
    if (getPrimaryPalette() != null) {
      joiner.add(getPrimaryPalette().toUrlQueryString(prefix + "primaryPalette" + suffix));
    }

    // add `accentPalette` to the URL query string
    if (getAccentPalette() != null) {
      joiner.add(getAccentPalette().toUrlQueryString(prefix + "accentPalette" + suffix));
    }

    return joiner.toString();
  }
}

