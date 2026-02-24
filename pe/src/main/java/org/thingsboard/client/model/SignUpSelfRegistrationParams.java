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
import org.thingsboard.client.model.CaptchaParams;
import org.thingsboard.client.model.SignUpField;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * SignUpSelfRegistrationParams
 */
@JsonPropertyOrder({
  SignUpSelfRegistrationParams.JSON_PROPERTY_TITLE,
  SignUpSelfRegistrationParams.JSON_PROPERTY_CAPTCHA,
  SignUpSelfRegistrationParams.JSON_PROPERTY_FIELDS,
  SignUpSelfRegistrationParams.JSON_PROPERTY_SHOW_PRIVACY_POLICY,
  SignUpSelfRegistrationParams.JSON_PROPERTY_SHOW_TERMS_OF_USE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class SignUpSelfRegistrationParams {
  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private String title;

  public static final String JSON_PROPERTY_CAPTCHA = "captcha";
  @javax.annotation.Nullable
  private CaptchaParams captcha;

  public static final String JSON_PROPERTY_FIELDS = "fields";
  @javax.annotation.Nullable
  private List<SignUpField> fields = new ArrayList<>();

  public static final String JSON_PROPERTY_SHOW_PRIVACY_POLICY = "showPrivacyPolicy";
  @javax.annotation.Nullable
  private Boolean showPrivacyPolicy;

  public static final String JSON_PROPERTY_SHOW_TERMS_OF_USE = "showTermsOfUse";
  @javax.annotation.Nullable
  private Boolean showTermsOfUse;

  public SignUpSelfRegistrationParams() { 
  }

  public SignUpSelfRegistrationParams title(@javax.annotation.Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
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


  public SignUpSelfRegistrationParams captcha(@javax.annotation.Nullable CaptchaParams captcha) {
    this.captcha = captcha;
    return this;
  }

  /**
   * Get captcha
   * @return captcha
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CAPTCHA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CaptchaParams getCaptcha() {
    return captcha;
  }


  @JsonProperty(value = JSON_PROPERTY_CAPTCHA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCaptcha(@javax.annotation.Nullable CaptchaParams captcha) {
    this.captcha = captcha;
  }


  public SignUpSelfRegistrationParams fields(@javax.annotation.Nullable List<SignUpField> fields) {
    this.fields = fields;
    return this;
  }

  public SignUpSelfRegistrationParams addFieldsItem(SignUpField fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * Get fields
   * @return fields
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FIELDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SignUpField> getFields() {
    return fields;
  }


  @JsonProperty(value = JSON_PROPERTY_FIELDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFields(@javax.annotation.Nullable List<SignUpField> fields) {
    this.fields = fields;
  }


  public SignUpSelfRegistrationParams showPrivacyPolicy(@javax.annotation.Nullable Boolean showPrivacyPolicy) {
    this.showPrivacyPolicy = showPrivacyPolicy;
    return this;
  }

  /**
   * Get showPrivacyPolicy
   * @return showPrivacyPolicy
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW_PRIVACY_POLICY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowPrivacyPolicy() {
    return showPrivacyPolicy;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW_PRIVACY_POLICY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowPrivacyPolicy(@javax.annotation.Nullable Boolean showPrivacyPolicy) {
    this.showPrivacyPolicy = showPrivacyPolicy;
  }


  public SignUpSelfRegistrationParams showTermsOfUse(@javax.annotation.Nullable Boolean showTermsOfUse) {
    this.showTermsOfUse = showTermsOfUse;
    return this;
  }

  /**
   * Get showTermsOfUse
   * @return showTermsOfUse
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW_TERMS_OF_USE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowTermsOfUse() {
    return showTermsOfUse;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW_TERMS_OF_USE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowTermsOfUse(@javax.annotation.Nullable Boolean showTermsOfUse) {
    this.showTermsOfUse = showTermsOfUse;
  }


  /**
   * Return true if this SignUpSelfRegistrationParams object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignUpSelfRegistrationParams signUpSelfRegistrationParams = (SignUpSelfRegistrationParams) o;
    return Objects.equals(this.title, signUpSelfRegistrationParams.title) &&
        Objects.equals(this.captcha, signUpSelfRegistrationParams.captcha) &&
        Objects.equals(this.fields, signUpSelfRegistrationParams.fields) &&
        Objects.equals(this.showPrivacyPolicy, signUpSelfRegistrationParams.showPrivacyPolicy) &&
        Objects.equals(this.showTermsOfUse, signUpSelfRegistrationParams.showTermsOfUse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, captcha, fields, showPrivacyPolicy, showTermsOfUse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignUpSelfRegistrationParams {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    captcha: ").append(toIndentedString(captcha)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    showPrivacyPolicy: ").append(toIndentedString(showPrivacyPolicy)).append("\n");
    sb.append("    showTermsOfUse: ").append(toIndentedString(showTermsOfUse)).append("\n");
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

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTitle()))));
    }

    // add `captcha` to the URL query string
    if (getCaptcha() != null) {
      joiner.add(getCaptcha().toUrlQueryString(prefix + "captcha" + suffix));
    }

    // add `fields` to the URL query string
    if (getFields() != null) {
      for (int i = 0; i < getFields().size(); i++) {
        if (getFields().get(i) != null) {
          joiner.add(getFields().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sfields%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `showPrivacyPolicy` to the URL query string
    if (getShowPrivacyPolicy() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshowPrivacyPolicy%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowPrivacyPolicy()))));
    }

    // add `showTermsOfUse` to the URL query string
    if (getShowTermsOfUse() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshowTermsOfUse%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowTermsOfUse()))));
    }

    return joiner.toString();
  }
}

