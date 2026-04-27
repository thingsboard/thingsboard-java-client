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
import org.thingsboard.client.model.AcmeCertificateId;
import org.thingsboard.client.model.CertificateInfo;
import org.thingsboard.client.model.CloudDomainId;
import org.thingsboard.client.model.CustomerId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * CloudDomainInfo
 */
@JsonPropertyOrder({
  CloudDomainInfo.JSON_PROPERTY_ID,
  CloudDomainInfo.JSON_PROPERTY_CREATED_TIME,
  CloudDomainInfo.JSON_PROPERTY_TENANT_ID,
  CloudDomainInfo.JSON_PROPERTY_CUSTOMER_ID,
  CloudDomainInfo.JSON_PROPERTY_DOMAIN_NAME,
  CloudDomainInfo.JSON_PROPERTY_ACME_CERTIFICATE_ID,
  CloudDomainInfo.JSON_PROPERTY_CERTIFICATE
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class CloudDomainInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private CloudDomainId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @Nullable
  private CustomerId customerId;

  public static final String JSON_PROPERTY_DOMAIN_NAME = "domainName";
  @Nullable
  private String domainName;

  public static final String JSON_PROPERTY_ACME_CERTIFICATE_ID = "acmeCertificateId";
  @Nullable
  private AcmeCertificateId acmeCertificateId;

  public static final String JSON_PROPERTY_CERTIFICATE = "certificate";
  @Nullable
  private CertificateInfo certificate;

  public CloudDomainInfo() { 
  }

  @JsonCreator
  public CloudDomainInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime
  ) {
  this();
    this.createdTime = createdTime;
  }

  public CloudDomainInfo id(@Nullable CloudDomainId id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CloudDomainId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable CloudDomainId id) {
    this.id = id;
  }


  /**
   * Entity creation timestamp in milliseconds since Unix epoch
   * @return createdTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  public CloudDomainInfo tenantId(@Nullable TenantId tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(@Nullable TenantId tenantId) {
    this.tenantId = tenantId;
  }


  public CloudDomainInfo customerId(@Nullable CustomerId customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomerId getCustomerId() {
    return customerId;
  }


  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerId(@Nullable CustomerId customerId) {
    this.customerId = customerId;
  }


  public CloudDomainInfo domainName(@Nullable String domainName) {
    this.domainName = domainName;
    return this;
  }

  /**
   * Get domainName
   * @return domainName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DOMAIN_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDomainName() {
    return domainName;
  }


  @JsonProperty(value = JSON_PROPERTY_DOMAIN_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomainName(@Nullable String domainName) {
    this.domainName = domainName;
  }


  public CloudDomainInfo acmeCertificateId(@Nullable AcmeCertificateId acmeCertificateId) {
    this.acmeCertificateId = acmeCertificateId;
    return this;
  }

  /**
   * Get acmeCertificateId
   * @return acmeCertificateId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ACME_CERTIFICATE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AcmeCertificateId getAcmeCertificateId() {
    return acmeCertificateId;
  }


  @JsonProperty(value = JSON_PROPERTY_ACME_CERTIFICATE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcmeCertificateId(@Nullable AcmeCertificateId acmeCertificateId) {
    this.acmeCertificateId = acmeCertificateId;
  }


  public CloudDomainInfo certificate(@Nullable CertificateInfo certificate) {
    this.certificate = certificate;
    return this;
  }

  /**
   * Get certificate
   * @return certificate
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CERTIFICATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CertificateInfo getCertificate() {
    return certificate;
  }


  @JsonProperty(value = JSON_PROPERTY_CERTIFICATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCertificate(@Nullable CertificateInfo certificate) {
    this.certificate = certificate;
  }


  /**
   * Return true if this CloudDomainInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudDomainInfo cloudDomainInfo = (CloudDomainInfo) o;
    return Objects.equals(this.id, cloudDomainInfo.id) &&
        Objects.equals(this.createdTime, cloudDomainInfo.createdTime) &&
        Objects.equals(this.tenantId, cloudDomainInfo.tenantId) &&
        Objects.equals(this.customerId, cloudDomainInfo.customerId) &&
        Objects.equals(this.domainName, cloudDomainInfo.domainName) &&
        Objects.equals(this.acmeCertificateId, cloudDomainInfo.acmeCertificateId) &&
        Objects.equals(this.certificate, cloudDomainInfo.certificate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, customerId, domainName, acmeCertificateId, certificate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudDomainInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    acmeCertificateId: ").append(toIndentedString(acmeCertificateId)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(getId().toUrlQueryString(prefix + "id" + suffix));
    }

    // add `createdTime` to the URL query string
    if (getCreatedTime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%screatedTime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCreatedTime()))));
    }

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      joiner.add(getTenantId().toUrlQueryString(prefix + "tenantId" + suffix));
    }

    // add `customerId` to the URL query string
    if (getCustomerId() != null) {
      joiner.add(getCustomerId().toUrlQueryString(prefix + "customerId" + suffix));
    }

    // add `domainName` to the URL query string
    if (getDomainName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdomainName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDomainName()))));
    }

    // add `acmeCertificateId` to the URL query string
    if (getAcmeCertificateId() != null) {
      joiner.add(getAcmeCertificateId().toUrlQueryString(prefix + "acmeCertificateId" + suffix));
    }

    // add `certificate` to the URL query string
    if (getCertificate() != null) {
      joiner.add(getCertificate().toUrlQueryString(prefix + "certificate" + suffix));
    }

    return joiner.toString();
  }
}

