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
import org.thingsboard.client.model.CouponDuration;
import org.thingsboard.client.model.CouponId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * Discount
 */
@JsonPropertyOrder({
  Discount.JSON_PROPERTY_COUPON_CODE,
  Discount.JSON_PROPERTY_COUPON_VALID,
  Discount.JSON_PROPERTY_AMOUNT_OFF,
  Discount.JSON_PROPERTY_PERCENT_OFF,
  Discount.JSON_PROPERTY_COUPON_ID,
  Discount.JSON_PROPERTY_DURATION,
  Discount.JSON_PROPERTY_DURATION_IN_MONTHS,
  Discount.JSON_PROPERTY_END_DATE,
  Discount.JSON_PROPERTY_PACKAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class Discount {
  public static final String JSON_PROPERTY_COUPON_CODE = "couponCode";
  @javax.annotation.Nullable
  private String couponCode;

  public static final String JSON_PROPERTY_COUPON_VALID = "couponValid";
  @javax.annotation.Nullable
  private Boolean couponValid;

  public static final String JSON_PROPERTY_AMOUNT_OFF = "amountOff";
  @javax.annotation.Nullable
  private Long amountOff;

  public static final String JSON_PROPERTY_PERCENT_OFF = "percentOff";
  @javax.annotation.Nullable
  private Double percentOff;

  public static final String JSON_PROPERTY_COUPON_ID = "couponId";
  @javax.annotation.Nullable
  private CouponId couponId;

  public static final String JSON_PROPERTY_DURATION = "duration";
  @javax.annotation.Nullable
  private CouponDuration duration;

  public static final String JSON_PROPERTY_DURATION_IN_MONTHS = "durationInMonths";
  @javax.annotation.Nullable
  private Long durationInMonths;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  @javax.annotation.Nullable
  private Long endDate;

  public static final String JSON_PROPERTY_PACKAGE = "package";
  @javax.annotation.Nullable
  private Boolean _package;

  public Discount() { 
  }

  public Discount couponCode(@javax.annotation.Nullable String couponCode) {
    this.couponCode = couponCode;
    return this;
  }

  /**
   * Get couponCode
   * @return couponCode
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_COUPON_CODE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCouponCode() {
    return couponCode;
  }


  @JsonProperty(value = JSON_PROPERTY_COUPON_CODE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCouponCode(@javax.annotation.Nullable String couponCode) {
    this.couponCode = couponCode;
  }


  public Discount couponValid(@javax.annotation.Nullable Boolean couponValid) {
    this.couponValid = couponValid;
    return this;
  }

  /**
   * Get couponValid
   * @return couponValid
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_COUPON_VALID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCouponValid() {
    return couponValid;
  }


  @JsonProperty(value = JSON_PROPERTY_COUPON_VALID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCouponValid(@javax.annotation.Nullable Boolean couponValid) {
    this.couponValid = couponValid;
  }


  public Discount amountOff(@javax.annotation.Nullable Long amountOff) {
    this.amountOff = amountOff;
    return this;
  }

  /**
   * Get amountOff
   * @return amountOff
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_AMOUNT_OFF, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAmountOff() {
    return amountOff;
  }


  @JsonProperty(value = JSON_PROPERTY_AMOUNT_OFF, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountOff(@javax.annotation.Nullable Long amountOff) {
    this.amountOff = amountOff;
  }


  public Discount percentOff(@javax.annotation.Nullable Double percentOff) {
    this.percentOff = percentOff;
    return this;
  }

  /**
   * Get percentOff
   * @return percentOff
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PERCENT_OFF, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPercentOff() {
    return percentOff;
  }


  @JsonProperty(value = JSON_PROPERTY_PERCENT_OFF, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPercentOff(@javax.annotation.Nullable Double percentOff) {
    this.percentOff = percentOff;
  }


  public Discount couponId(@javax.annotation.Nullable CouponId couponId) {
    this.couponId = couponId;
    return this;
  }

  /**
   * Get couponId
   * @return couponId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_COUPON_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CouponId getCouponId() {
    return couponId;
  }


  @JsonProperty(value = JSON_PROPERTY_COUPON_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCouponId(@javax.annotation.Nullable CouponId couponId) {
    this.couponId = couponId;
  }


  public Discount duration(@javax.annotation.Nullable CouponDuration duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CouponDuration getDuration() {
    return duration;
  }


  @JsonProperty(value = JSON_PROPERTY_DURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(@javax.annotation.Nullable CouponDuration duration) {
    this.duration = duration;
  }


  public Discount durationInMonths(@javax.annotation.Nullable Long durationInMonths) {
    this.durationInMonths = durationInMonths;
    return this;
  }

  /**
   * Get durationInMonths
   * @return durationInMonths
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DURATION_IN_MONTHS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDurationInMonths() {
    return durationInMonths;
  }


  @JsonProperty(value = JSON_PROPERTY_DURATION_IN_MONTHS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDurationInMonths(@javax.annotation.Nullable Long durationInMonths) {
    this.durationInMonths = durationInMonths;
  }


  public Discount endDate(@javax.annotation.Nullable Long endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_END_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEndDate() {
    return endDate;
  }


  @JsonProperty(value = JSON_PROPERTY_END_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(@javax.annotation.Nullable Long endDate) {
    this.endDate = endDate;
  }


  public Discount _package(@javax.annotation.Nullable Boolean _package) {
    this._package = _package;
    return this;
  }

  /**
   * Get _package
   * @return _package
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PACKAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPackage() {
    return _package;
  }


  @JsonProperty(value = JSON_PROPERTY_PACKAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPackage(@javax.annotation.Nullable Boolean _package) {
    this._package = _package;
  }


  /**
   * Return true if this Discount object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Discount discount = (Discount) o;
    return Objects.equals(this.couponCode, discount.couponCode) &&
        Objects.equals(this.couponValid, discount.couponValid) &&
        Objects.equals(this.amountOff, discount.amountOff) &&
        Objects.equals(this.percentOff, discount.percentOff) &&
        Objects.equals(this.couponId, discount.couponId) &&
        Objects.equals(this.duration, discount.duration) &&
        Objects.equals(this.durationInMonths, discount.durationInMonths) &&
        Objects.equals(this.endDate, discount.endDate) &&
        Objects.equals(this._package, discount._package);
  }

  @Override
  public int hashCode() {
    return Objects.hash(couponCode, couponValid, amountOff, percentOff, couponId, duration, durationInMonths, endDate, _package);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Discount {\n");
    sb.append("    couponCode: ").append(toIndentedString(couponCode)).append("\n");
    sb.append("    couponValid: ").append(toIndentedString(couponValid)).append("\n");
    sb.append("    amountOff: ").append(toIndentedString(amountOff)).append("\n");
    sb.append("    percentOff: ").append(toIndentedString(percentOff)).append("\n");
    sb.append("    couponId: ").append(toIndentedString(couponId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    durationInMonths: ").append(toIndentedString(durationInMonths)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
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

    // add `couponCode` to the URL query string
    if (getCouponCode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scouponCode%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCouponCode()))));
    }

    // add `couponValid` to the URL query string
    if (getCouponValid() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scouponValid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCouponValid()))));
    }

    // add `amountOff` to the URL query string
    if (getAmountOff() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%samountOff%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAmountOff()))));
    }

    // add `percentOff` to the URL query string
    if (getPercentOff() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spercentOff%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPercentOff()))));
    }

    // add `couponId` to the URL query string
    if (getCouponId() != null) {
      joiner.add(getCouponId().toUrlQueryString(prefix + "couponId" + suffix));
    }

    // add `duration` to the URL query string
    if (getDuration() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sduration%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDuration()))));
    }

    // add `durationInMonths` to the URL query string
    if (getDurationInMonths() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdurationInMonths%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDurationInMonths()))));
    }

    // add `endDate` to the URL query string
    if (getEndDate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sendDate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEndDate()))));
    }

    // add `package` to the URL query string
    if (getPackage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spackage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPackage()))));
    }

    return joiner.toString();
  }
}

