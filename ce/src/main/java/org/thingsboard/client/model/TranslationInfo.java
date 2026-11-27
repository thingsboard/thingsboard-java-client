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
import javax.annotation.Nullable;
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * TranslationInfo
 */
@JsonPropertyOrder({
  TranslationInfo.JSON_PROPERTY_LOCALE_CODE,
  TranslationInfo.JSON_PROPERTY_LANGUAGE,
  TranslationInfo.JSON_PROPERTY_COUNTRY,
  TranslationInfo.JSON_PROPERTY_PROGRESS,
  TranslationInfo.JSON_PROPERTY_CUSTOMIZED
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class TranslationInfo {
  public static final String JSON_PROPERTY_LOCALE_CODE = "localeCode";
  @Nullable
  private String localeCode;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  @Nullable
  private String language;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  @Nullable
  private String country;

  public static final String JSON_PROPERTY_PROGRESS = "progress";
  @Nullable
  private Integer progress;

  public static final String JSON_PROPERTY_CUSTOMIZED = "customized";
  @Nullable
  private Boolean customized;

  public TranslationInfo() { 
  }

  public TranslationInfo localeCode(@Nullable String localeCode) {
    this.localeCode = localeCode;
    return this;
  }

  /**
   * Locale code formed by combining the ISO 639-1 language code and the ISO 3166-1 region code. For example, \&quot;en_US\&quot;
   * @return localeCode
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LOCALE_CODE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLocaleCode() {
    return localeCode;
  }


  @JsonProperty(value = JSON_PROPERTY_LOCALE_CODE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocaleCode(@Nullable String localeCode) {
    this.localeCode = localeCode;
  }


  public TranslationInfo language(@Nullable String language) {
    this.language = language;
    return this;
  }

  /**
   * Locale code language display name. For example, \&quot;Polish (Polski)\&quot;
   * @return language
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LANGUAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLanguage() {
    return language;
  }


  @JsonProperty(value = JSON_PROPERTY_LANGUAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(@Nullable String language) {
    this.language = language;
  }


  public TranslationInfo country(@Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * Locale code country display name. For example, \&quot;Poland\&quot;
   * @return country
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_COUNTRY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCountry() {
    return country;
  }


  @JsonProperty(value = JSON_PROPERTY_COUNTRY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(@Nullable String country) {
    this.country = country;
  }


  public TranslationInfo progress(@Nullable Integer progress) {
    this.progress = progress;
    return this;
  }

  /**
   * Number representing translation percentage progress. For example, 40 that means 40% of all keys are translated.
   * @return progress
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PROGRESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getProgress() {
    return progress;
  }


  @JsonProperty(value = JSON_PROPERTY_PROGRESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProgress(@Nullable Integer progress) {
    this.progress = progress;
  }


  public TranslationInfo customized(@Nullable Boolean customized) {
    this.customized = customized;
    return this;
  }

  /**
   * Boolean representing if current language has customization.
   * @return customized
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMIZED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCustomized() {
    return customized;
  }


  @JsonProperty(value = JSON_PROPERTY_CUSTOMIZED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomized(@Nullable Boolean customized) {
    this.customized = customized;
  }


  /**
   * Return true if this TranslationInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranslationInfo translationInfo = (TranslationInfo) o;
    return Objects.equals(this.localeCode, translationInfo.localeCode) &&
        Objects.equals(this.language, translationInfo.language) &&
        Objects.equals(this.country, translationInfo.country) &&
        Objects.equals(this.progress, translationInfo.progress) &&
        Objects.equals(this.customized, translationInfo.customized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localeCode, language, country, progress, customized);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranslationInfo {\n");
    sb.append("    localeCode: ").append(toIndentedString(localeCode)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    customized: ").append(toIndentedString(customized)).append("\n");
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

    // add `localeCode` to the URL query string
    if (getLocaleCode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slocaleCode%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLocaleCode()))));
    }

    // add `language` to the URL query string
    if (getLanguage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slanguage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLanguage()))));
    }

    // add `country` to the URL query string
    if (getCountry() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scountry%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCountry()))));
    }

    // add `progress` to the URL query string
    if (getProgress() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprogress%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getProgress()))));
    }

    // add `customized` to the URL query string
    if (getCustomized() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scustomized%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCustomized()))));
    }

    return joiner.toString();
  }
}

