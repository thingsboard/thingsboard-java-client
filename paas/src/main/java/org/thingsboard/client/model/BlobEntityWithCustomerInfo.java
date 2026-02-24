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
import org.thingsboard.client.model.BlobEntityId;
import org.thingsboard.client.model.CustomerId;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * BlobEntityWithCustomerInfo
 */
@JsonPropertyOrder({
  BlobEntityWithCustomerInfo.JSON_PROPERTY_ID,
  BlobEntityWithCustomerInfo.JSON_PROPERTY_CREATED_TIME,
  BlobEntityWithCustomerInfo.JSON_PROPERTY_TENANT_ID,
  BlobEntityWithCustomerInfo.JSON_PROPERTY_CUSTOMER_ID,
  BlobEntityWithCustomerInfo.JSON_PROPERTY_NAME,
  BlobEntityWithCustomerInfo.JSON_PROPERTY_TYPE,
  BlobEntityWithCustomerInfo.JSON_PROPERTY_CONTENT_TYPE,
  BlobEntityWithCustomerInfo.JSON_PROPERTY_CUSTOMER_TITLE,
  BlobEntityWithCustomerInfo.JSON_PROPERTY_CUSTOMER_IS_PUBLIC,
  BlobEntityWithCustomerInfo.JSON_PROPERTY_OWNER_ID,
  BlobEntityWithCustomerInfo.JSON_PROPERTY_ADDITIONAL_INFO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class BlobEntityWithCustomerInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private BlobEntityId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @javax.annotation.Nullable
  private CustomerId customerId;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private String type;

  /**
   * blob content type
   */
  public enum ContentTypeEnum {
    APPLICATION_PDF(String.valueOf("application/pdf")),
    
    IMAGE_JPEG(String.valueOf("image/jpeg")),
    
    IMAGE_PNG(String.valueOf("image/png"));

    private String value;

    ContentTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ContentTypeEnum fromValue(String value) {
      for (ContentTypeEnum b : ContentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CONTENT_TYPE = "contentType";
  @javax.annotation.Nullable
  private ContentTypeEnum contentType;

  public static final String JSON_PROPERTY_CUSTOMER_TITLE = "customerTitle";
  @javax.annotation.Nullable
  private String customerTitle;

  public static final String JSON_PROPERTY_CUSTOMER_IS_PUBLIC = "customerIsPublic";
  @javax.annotation.Nullable
  private Boolean customerIsPublic;

  public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
  @javax.annotation.Nullable
  private EntityId ownerId;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalInfo;

  public BlobEntityWithCustomerInfo() { 
  }

  @JsonCreator
  public BlobEntityWithCustomerInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_ID) CustomerId customerId, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_TYPE) String type, 
    @JsonProperty(JSON_PROPERTY_CONTENT_TYPE) ContentTypeEnum contentType, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_IS_PUBLIC) Boolean customerIsPublic, 
    @JsonProperty(JSON_PROPERTY_OWNER_ID) EntityId ownerId
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
    this.customerId = customerId;
    this.name = name;
    this.type = type;
    this.contentType = contentType;
    this.customerIsPublic = customerIsPublic;
    this.ownerId = ownerId;
  }

  public BlobEntityWithCustomerInfo id(@javax.annotation.Nullable BlobEntityId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the blob entity Id. Referencing non-existing blob entity Id will cause error
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BlobEntityId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable BlobEntityId id) {
    this.id = id;
  }


  /**
   * Timestamp of the blob entity creation, in milliseconds
   * @return createdTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  /**
   * JSON object with Tenant Id
   * @return tenantId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }




  /**
   * JSON object with Customer Id
   * @return customerId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomerId getCustomerId() {
    return customerId;
  }




  /**
   * blob entity name
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }




  /**
   * blob entity type
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }




  /**
   * blob content type
   * @return contentType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CONTENT_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ContentTypeEnum getContentType() {
    return contentType;
  }




  public BlobEntityWithCustomerInfo customerTitle(@javax.annotation.Nullable String customerTitle) {
    this.customerTitle = customerTitle;
    return this;
  }

  /**
   * Title of the customer
   * @return customerTitle
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomerTitle() {
    return customerTitle;
  }


  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerTitle(@javax.annotation.Nullable String customerTitle) {
    this.customerTitle = customerTitle;
  }


  /**
   * Parameter that specifies if customer is public
   * @return customerIsPublic
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_IS_PUBLIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCustomerIsPublic() {
    return customerIsPublic;
  }




  /**
   * JSON object with Customer or Tenant Id
   * @return ownerId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OWNER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getOwnerId() {
    return ownerId;
  }




  public BlobEntityWithCustomerInfo additionalInfo(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Additional parameters of the blob entity
   * @return additionalInfo
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getAdditionalInfo() {
    return additionalInfo;
  }


  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalInfo(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  /**
   * Return true if this BlobEntityWithCustomerInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlobEntityWithCustomerInfo blobEntityWithCustomerInfo = (BlobEntityWithCustomerInfo) o;
    return Objects.equals(this.id, blobEntityWithCustomerInfo.id) &&
        Objects.equals(this.createdTime, blobEntityWithCustomerInfo.createdTime) &&
        Objects.equals(this.tenantId, blobEntityWithCustomerInfo.tenantId) &&
        Objects.equals(this.customerId, blobEntityWithCustomerInfo.customerId) &&
        Objects.equals(this.name, blobEntityWithCustomerInfo.name) &&
        Objects.equals(this.type, blobEntityWithCustomerInfo.type) &&
        Objects.equals(this.contentType, blobEntityWithCustomerInfo.contentType) &&
        Objects.equals(this.customerTitle, blobEntityWithCustomerInfo.customerTitle) &&
        Objects.equals(this.customerIsPublic, blobEntityWithCustomerInfo.customerIsPublic) &&
        Objects.equals(this.ownerId, blobEntityWithCustomerInfo.ownerId) &&
        Objects.equals(this.additionalInfo, blobEntityWithCustomerInfo.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, customerId, name, type, contentType, customerTitle, customerIsPublic, ownerId, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlobEntityWithCustomerInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    customerTitle: ").append(toIndentedString(customerTitle)).append("\n");
    sb.append("    customerIsPublic: ").append(toIndentedString(customerIsPublic)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `contentType` to the URL query string
    if (getContentType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scontentType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getContentType()))));
    }

    // add `customerTitle` to the URL query string
    if (getCustomerTitle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scustomerTitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCustomerTitle()))));
    }

    // add `customerIsPublic` to the URL query string
    if (getCustomerIsPublic() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scustomerIsPublic%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCustomerIsPublic()))));
    }

    // add `ownerId` to the URL query string
    if (getOwnerId() != null) {
      joiner.add(getOwnerId().toUrlQueryString(prefix + "ownerId" + suffix));
    }

    // add `additionalInfo` to the URL query string
    if (getAdditionalInfo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditionalInfo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalInfo()))));
    }

    return joiner.toString();
  }
}

