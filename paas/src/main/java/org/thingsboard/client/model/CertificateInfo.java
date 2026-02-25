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
import org.thingsboard.client.model.AcmeCertificateId;
import org.thingsboard.client.model.CertificateStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * CertificateInfo
 */
@JsonPropertyOrder({
  CertificateInfo.JSON_PROPERTY_STATUS,
  CertificateInfo.JSON_PROPERTY_DOMAIN_NAME,
  CertificateInfo.JSON_PROPERTY_SERIAL_NUMBER,
  CertificateInfo.JSON_PROPERTY_NOT_BEFORE,
  CertificateInfo.JSON_PROPERTY_NOT_AFTER,
  CertificateInfo.JSON_PROPERTY_REQUESTED_AT,
  CertificateInfo.JSON_PROPERTY_ISSUED_AT,
  CertificateInfo.JSON_PROPERTY_ACME_CERTIFICATE_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class CertificateInfo {
  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nullable
  private CertificateStatus status;

  public static final String JSON_PROPERTY_DOMAIN_NAME = "domainName";
  @javax.annotation.Nullable
  private String domainName;

  public static final String JSON_PROPERTY_SERIAL_NUMBER = "serialNumber";
  @javax.annotation.Nullable
  private String serialNumber;

  public static final String JSON_PROPERTY_NOT_BEFORE = "notBefore";
  @javax.annotation.Nullable
  private Long notBefore;

  public static final String JSON_PROPERTY_NOT_AFTER = "notAfter";
  @javax.annotation.Nullable
  private Long notAfter;

  public static final String JSON_PROPERTY_REQUESTED_AT = "requestedAt";
  @javax.annotation.Nullable
  private Long requestedAt;

  public static final String JSON_PROPERTY_ISSUED_AT = "issuedAt";
  @javax.annotation.Nullable
  private Long issuedAt;

  public static final String JSON_PROPERTY_ACME_CERTIFICATE_ID = "acmeCertificateId";
  @javax.annotation.Nullable
  private AcmeCertificateId acmeCertificateId;

  public CertificateInfo() { 
  }

  public CertificateInfo status(@javax.annotation.Nullable CertificateStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CertificateStatus getStatus() {
    return status;
  }


  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(@javax.annotation.Nullable CertificateStatus status) {
    this.status = status;
  }


  public CertificateInfo domainName(@javax.annotation.Nullable String domainName) {
    this.domainName = domainName;
    return this;
  }

  /**
   * Get domainName
   * @return domainName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DOMAIN_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDomainName() {
    return domainName;
  }


  @JsonProperty(value = JSON_PROPERTY_DOMAIN_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomainName(@javax.annotation.Nullable String domainName) {
    this.domainName = domainName;
  }


  public CertificateInfo serialNumber(@javax.annotation.Nullable String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Get serialNumber
   * @return serialNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SERIAL_NUMBER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSerialNumber() {
    return serialNumber;
  }


  @JsonProperty(value = JSON_PROPERTY_SERIAL_NUMBER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSerialNumber(@javax.annotation.Nullable String serialNumber) {
    this.serialNumber = serialNumber;
  }


  public CertificateInfo notBefore(@javax.annotation.Nullable Long notBefore) {
    this.notBefore = notBefore;
    return this;
  }

  /**
   * Get notBefore
   * @return notBefore
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NOT_BEFORE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNotBefore() {
    return notBefore;
  }


  @JsonProperty(value = JSON_PROPERTY_NOT_BEFORE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotBefore(@javax.annotation.Nullable Long notBefore) {
    this.notBefore = notBefore;
  }


  public CertificateInfo notAfter(@javax.annotation.Nullable Long notAfter) {
    this.notAfter = notAfter;
    return this;
  }

  /**
   * Get notAfter
   * @return notAfter
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NOT_AFTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNotAfter() {
    return notAfter;
  }


  @JsonProperty(value = JSON_PROPERTY_NOT_AFTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotAfter(@javax.annotation.Nullable Long notAfter) {
    this.notAfter = notAfter;
  }


  public CertificateInfo requestedAt(@javax.annotation.Nullable Long requestedAt) {
    this.requestedAt = requestedAt;
    return this;
  }

  /**
   * Get requestedAt
   * @return requestedAt
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_REQUESTED_AT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRequestedAt() {
    return requestedAt;
  }


  @JsonProperty(value = JSON_PROPERTY_REQUESTED_AT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestedAt(@javax.annotation.Nullable Long requestedAt) {
    this.requestedAt = requestedAt;
  }


  public CertificateInfo issuedAt(@javax.annotation.Nullable Long issuedAt) {
    this.issuedAt = issuedAt;
    return this;
  }

  /**
   * Get issuedAt
   * @return issuedAt
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ISSUED_AT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIssuedAt() {
    return issuedAt;
  }


  @JsonProperty(value = JSON_PROPERTY_ISSUED_AT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuedAt(@javax.annotation.Nullable Long issuedAt) {
    this.issuedAt = issuedAt;
  }


  public CertificateInfo acmeCertificateId(@javax.annotation.Nullable AcmeCertificateId acmeCertificateId) {
    this.acmeCertificateId = acmeCertificateId;
    return this;
  }

  /**
   * Get acmeCertificateId
   * @return acmeCertificateId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ACME_CERTIFICATE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AcmeCertificateId getAcmeCertificateId() {
    return acmeCertificateId;
  }


  @JsonProperty(value = JSON_PROPERTY_ACME_CERTIFICATE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcmeCertificateId(@javax.annotation.Nullable AcmeCertificateId acmeCertificateId) {
    this.acmeCertificateId = acmeCertificateId;
  }


  /**
   * Return true if this CertificateInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateInfo certificateInfo = (CertificateInfo) o;
    return Objects.equals(this.status, certificateInfo.status) &&
        Objects.equals(this.domainName, certificateInfo.domainName) &&
        Objects.equals(this.serialNumber, certificateInfo.serialNumber) &&
        Objects.equals(this.notBefore, certificateInfo.notBefore) &&
        Objects.equals(this.notAfter, certificateInfo.notAfter) &&
        Objects.equals(this.requestedAt, certificateInfo.requestedAt) &&
        Objects.equals(this.issuedAt, certificateInfo.issuedAt) &&
        Objects.equals(this.acmeCertificateId, certificateInfo.acmeCertificateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, domainName, serialNumber, notBefore, notAfter, requestedAt, issuedAt, acmeCertificateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateInfo {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
    sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
    sb.append("    requestedAt: ").append(toIndentedString(requestedAt)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
    sb.append("    acmeCertificateId: ").append(toIndentedString(acmeCertificateId)).append("\n");
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

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstatus%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStatus()))));
    }

    // add `domainName` to the URL query string
    if (getDomainName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdomainName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDomainName()))));
    }

    // add `serialNumber` to the URL query string
    if (getSerialNumber() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sserialNumber%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSerialNumber()))));
    }

    // add `notBefore` to the URL query string
    if (getNotBefore() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snotBefore%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNotBefore()))));
    }

    // add `notAfter` to the URL query string
    if (getNotAfter() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snotAfter%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNotAfter()))));
    }

    // add `requestedAt` to the URL query string
    if (getRequestedAt() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srequestedAt%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRequestedAt()))));
    }

    // add `issuedAt` to the URL query string
    if (getIssuedAt() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sissuedAt%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIssuedAt()))));
    }

    // add `acmeCertificateId` to the URL query string
    if (getAcmeCertificateId() != null) {
      joiner.add(getAcmeCertificateId().toUrlQueryString(prefix + "acmeCertificateId" + suffix));
    }

    return joiner.toString();
  }
}

