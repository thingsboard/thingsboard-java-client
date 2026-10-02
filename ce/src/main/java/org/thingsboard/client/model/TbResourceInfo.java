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
import org.thingsboard.client.model.CustomerId;
import org.thingsboard.client.model.ResourceSubType;
import org.thingsboard.client.model.ResourceType;
import org.thingsboard.client.model.TbResourceId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the Resource Info.
 */
@JsonPropertyOrder({
  TbResourceInfo.JSON_PROPERTY_ID,
  TbResourceInfo.JSON_PROPERTY_CREATED_TIME,
  TbResourceInfo.JSON_PROPERTY_TENANT_ID,
  TbResourceInfo.JSON_PROPERTY_CUSTOMER_ID,
  TbResourceInfo.JSON_PROPERTY_TITLE,
  TbResourceInfo.JSON_PROPERTY_RESOURCE_TYPE,
  TbResourceInfo.JSON_PROPERTY_RESOURCE_SUB_TYPE,
  TbResourceInfo.JSON_PROPERTY_RESOURCE_KEY,
  TbResourceInfo.JSON_PROPERTY_PUBLIC_RESOURCE_KEY,
  TbResourceInfo.JSON_PROPERTY_ETAG,
  TbResourceInfo.JSON_PROPERTY_FILE_NAME,
  TbResourceInfo.JSON_PROPERTY_DESCRIPTOR,
  TbResourceInfo.JSON_PROPERTY_LINK,
  TbResourceInfo.JSON_PROPERTY_NAME,
  TbResourceInfo.JSON_PROPERTY_PUBLIC,
  TbResourceInfo.JSON_PROPERTY_PUBLIC_LINK
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class TbResourceInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private TbResourceId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @Nullable
  private CustomerId customerId;

  public static final String JSON_PROPERTY_TITLE = "title";
  @Nullable
  private String title;

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resourceType";
  @Nullable
  private ResourceType resourceType;

  public static final String JSON_PROPERTY_RESOURCE_SUB_TYPE = "resourceSubType";
  @Nullable
  private ResourceSubType resourceSubType;

  public static final String JSON_PROPERTY_RESOURCE_KEY = "resourceKey";
  @Nullable
  private String resourceKey;

  public static final String JSON_PROPERTY_PUBLIC_RESOURCE_KEY = "publicResourceKey";
  @Nullable
  private String publicResourceKey;

  public static final String JSON_PROPERTY_ETAG = "etag";
  @Nullable
  private String etag;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  @Nullable
  private String fileName;

  public static final String JSON_PROPERTY_DESCRIPTOR = "descriptor";
  @Nullable
  private com.fasterxml.jackson.databind.JsonNode descriptor;

  public static final String JSON_PROPERTY_LINK = "link";
  @Nullable
  private String link;

  public static final String JSON_PROPERTY_NAME = "name";
  @Nullable
  private String name;

  public static final String JSON_PROPERTY_PUBLIC = "public";
  @Nullable
  private Boolean _public;

  public static final String JSON_PROPERTY_PUBLIC_LINK = "publicLink";
  @Nullable
  private String publicLink;

  public TbResourceInfo() { 
  }

  @JsonCreator
  public TbResourceInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_ID) CustomerId customerId, 
    @JsonProperty(JSON_PROPERTY_ETAG) String etag, 
    @JsonProperty(JSON_PROPERTY_LINK) String link, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_PUBLIC_LINK) String publicLink
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
    this.customerId = customerId;
    this.etag = etag;
    this.link = link;
    this.name = name;
    this.publicLink = publicLink;
  }

  public TbResourceInfo id(@Nullable TbResourceId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the Resource Id. Specify this field to update the Resource. Referencing non-existing Resource Id will cause error. Omit this field to create new Resource.
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TbResourceId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable TbResourceId id) {
    this.id = id;
  }


  /**
   * Timestamp of the resource creation, in milliseconds
   * @return createdTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  /**
   * JSON object with Tenant Id. Tenant Id of the resource can&#39;t be changed.
   * @return tenantId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }




  /**
   * JSON object with Customer Id. Customer Id of the resource can&#39;t be changed.
   * @return customerId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomerId getCustomerId() {
    return customerId;
  }




  public TbResourceInfo title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Resource title.
   * @return title
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(@Nullable String title) {
    this.title = title;
  }


  public TbResourceInfo resourceType(@Nullable ResourceType resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * Resource type.
   * @return resourceType
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_RESOURCE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ResourceType getResourceType() {
    return resourceType;
  }


  @JsonProperty(value = JSON_PROPERTY_RESOURCE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceType(@Nullable ResourceType resourceType) {
    this.resourceType = resourceType;
  }


  public TbResourceInfo resourceSubType(@Nullable ResourceSubType resourceSubType) {
    this.resourceSubType = resourceSubType;
    return this;
  }

  /**
   * Resource sub type.
   * @return resourceSubType
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_RESOURCE_SUB_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ResourceSubType getResourceSubType() {
    return resourceSubType;
  }


  @JsonProperty(value = JSON_PROPERTY_RESOURCE_SUB_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceSubType(@Nullable ResourceSubType resourceSubType) {
    this.resourceSubType = resourceSubType;
  }


  public TbResourceInfo resourceKey(@Nullable String resourceKey) {
    this.resourceKey = resourceKey;
    return this;
  }

  /**
   * Resource key.
   * @return resourceKey
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_RESOURCE_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResourceKey() {
    return resourceKey;
  }


  @JsonProperty(value = JSON_PROPERTY_RESOURCE_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceKey(@Nullable String resourceKey) {
    this.resourceKey = resourceKey;
  }


  public TbResourceInfo publicResourceKey(@Nullable String publicResourceKey) {
    this.publicResourceKey = publicResourceKey;
    return this;
  }

  /**
   * Public resource key.
   * @return publicResourceKey
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PUBLIC_RESOURCE_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicResourceKey() {
    return publicResourceKey;
  }


  @JsonProperty(value = JSON_PROPERTY_PUBLIC_RESOURCE_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicResourceKey(@Nullable String publicResourceKey) {
    this.publicResourceKey = publicResourceKey;
  }


  /**
   * Resource etag.
   * @return etag
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ETAG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEtag() {
    return etag;
  }




  public TbResourceInfo fileName(@Nullable String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Resource file name.
   * @return fileName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_FILE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFileName() {
    return fileName;
  }


  @JsonProperty(value = JSON_PROPERTY_FILE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileName(@Nullable String fileName) {
    this.fileName = fileName;
  }


  public TbResourceInfo descriptor(@Nullable com.fasterxml.jackson.databind.JsonNode descriptor) {
    this.descriptor = descriptor;
    return this;
  }

  /**
   * Resource descriptor.
   * @return descriptor
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DESCRIPTOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getDescriptor() {
    return descriptor;
  }


  @JsonProperty(value = JSON_PROPERTY_DESCRIPTOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescriptor(@Nullable com.fasterxml.jackson.databind.JsonNode descriptor) {
    this.descriptor = descriptor;
  }


  /**
   * Get link
   * @return link
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LINK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLink() {
    return link;
  }




  /**
   * Get name
   * @return name
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }




  public TbResourceInfo _public(@Nullable Boolean _public) {
    this._public = _public;
    return this;
  }

  /**
   * Get _public
   * @return _public
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PUBLIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPublic() {
    return _public;
  }


  @JsonProperty(value = JSON_PROPERTY_PUBLIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublic(@Nullable Boolean _public) {
    this._public = _public;
  }


  /**
   * Get publicLink
   * @return publicLink
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PUBLIC_LINK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicLink() {
    return publicLink;
  }




  /**
   * Return true if this TbResourceInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TbResourceInfo tbResourceInfo = (TbResourceInfo) o;
    return Objects.equals(this.id, tbResourceInfo.id) &&
        Objects.equals(this.createdTime, tbResourceInfo.createdTime) &&
        Objects.equals(this.tenantId, tbResourceInfo.tenantId) &&
        Objects.equals(this.customerId, tbResourceInfo.customerId) &&
        Objects.equals(this.title, tbResourceInfo.title) &&
        Objects.equals(this.resourceType, tbResourceInfo.resourceType) &&
        Objects.equals(this.resourceSubType, tbResourceInfo.resourceSubType) &&
        Objects.equals(this.resourceKey, tbResourceInfo.resourceKey) &&
        Objects.equals(this.publicResourceKey, tbResourceInfo.publicResourceKey) &&
        Objects.equals(this.etag, tbResourceInfo.etag) &&
        Objects.equals(this.fileName, tbResourceInfo.fileName) &&
        Objects.equals(this.descriptor, tbResourceInfo.descriptor) &&
        Objects.equals(this.link, tbResourceInfo.link) &&
        Objects.equals(this.name, tbResourceInfo.name) &&
        Objects.equals(this._public, tbResourceInfo._public) &&
        Objects.equals(this.publicLink, tbResourceInfo.publicLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, customerId, title, resourceType, resourceSubType, resourceKey, publicResourceKey, etag, fileName, descriptor, link, name, _public, publicLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TbResourceInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceSubType: ").append(toIndentedString(resourceSubType)).append("\n");
    sb.append("    resourceKey: ").append(toIndentedString(resourceKey)).append("\n");
    sb.append("    publicResourceKey: ").append(toIndentedString(publicResourceKey)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    publicLink: ").append(toIndentedString(publicLink)).append("\n");
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

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTitle()))));
    }

    // add `resourceType` to the URL query string
    if (getResourceType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sresourceType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getResourceType()))));
    }

    // add `resourceSubType` to the URL query string
    if (getResourceSubType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sresourceSubType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getResourceSubType()))));
    }

    // add `resourceKey` to the URL query string
    if (getResourceKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sresourceKey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getResourceKey()))));
    }

    // add `publicResourceKey` to the URL query string
    if (getPublicResourceKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spublicResourceKey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPublicResourceKey()))));
    }

    // add `etag` to the URL query string
    if (getEtag() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%setag%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEtag()))));
    }

    // add `fileName` to the URL query string
    if (getFileName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfileName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFileName()))));
    }

    // add `descriptor` to the URL query string
    if (getDescriptor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdescriptor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDescriptor()))));
    }

    // add `link` to the URL query string
    if (getLink() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slink%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLink()))));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `public` to the URL query string
    if (getPublic() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spublic%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPublic()))));
    }

    // add `publicLink` to the URL query string
    if (getPublicLink() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spublicLink%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPublicLink()))));
    }

    return joiner.toString();
  }
}

