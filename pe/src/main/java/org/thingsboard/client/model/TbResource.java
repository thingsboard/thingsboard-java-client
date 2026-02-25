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
import org.thingsboard.client.model.CustomerId;
import org.thingsboard.client.model.ResourceSubType;
import org.thingsboard.client.model.ResourceType;
import org.thingsboard.client.model.TbResourceId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the Resource.
 */
@JsonPropertyOrder({
  TbResource.JSON_PROPERTY_ID,
  TbResource.JSON_PROPERTY_CREATED_TIME,
  TbResource.JSON_PROPERTY_TENANT_ID,
  TbResource.JSON_PROPERTY_CUSTOMER_ID,
  TbResource.JSON_PROPERTY_TITLE,
  TbResource.JSON_PROPERTY_RESOURCE_TYPE,
  TbResource.JSON_PROPERTY_RESOURCE_SUB_TYPE,
  TbResource.JSON_PROPERTY_RESOURCE_KEY,
  TbResource.JSON_PROPERTY_PUBLIC_RESOURCE_KEY,
  TbResource.JSON_PROPERTY_ETAG,
  TbResource.JSON_PROPERTY_FILE_NAME,
  TbResource.JSON_PROPERTY_DESCRIPTOR,
  TbResource.JSON_PROPERTY_PUBLIC_LINK,
  TbResource.JSON_PROPERTY_NAME,
  TbResource.JSON_PROPERTY_PUBLIC,
  TbResource.JSON_PROPERTY_LINK,
  TbResource.JSON_PROPERTY_DATA,
  TbResource.JSON_PROPERTY_PREVIEW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class TbResource {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private TbResourceId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @javax.annotation.Nullable
  private CustomerId customerId;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private String title;

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resourceType";
  @javax.annotation.Nullable
  private ResourceType resourceType;

  public static final String JSON_PROPERTY_RESOURCE_SUB_TYPE = "resourceSubType";
  @javax.annotation.Nullable
  private ResourceSubType resourceSubType;

  public static final String JSON_PROPERTY_RESOURCE_KEY = "resourceKey";
  @javax.annotation.Nullable
  private String resourceKey;

  public static final String JSON_PROPERTY_PUBLIC_RESOURCE_KEY = "publicResourceKey";
  @javax.annotation.Nullable
  private String publicResourceKey;

  public static final String JSON_PROPERTY_ETAG = "etag";
  @javax.annotation.Nullable
  private String etag;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  @javax.annotation.Nullable
  private String fileName;

  public static final String JSON_PROPERTY_DESCRIPTOR = "descriptor";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode descriptor;

  public static final String JSON_PROPERTY_PUBLIC_LINK = "publicLink";
  @javax.annotation.Nullable
  private String publicLink;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_PUBLIC = "public";
  @javax.annotation.Nullable
  private Boolean _public;

  public static final String JSON_PROPERTY_LINK = "link";
  @javax.annotation.Nullable
  private String link;

  public static final String JSON_PROPERTY_DATA = "data";
  @javax.annotation.Nullable
  private String data;

  public static final String JSON_PROPERTY_PREVIEW = "preview";
  @javax.annotation.Nullable
  private String preview;

  public TbResource() { 
  }

  @JsonCreator
  public TbResource(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_ID) CustomerId customerId, 
    @JsonProperty(JSON_PROPERTY_ETAG) String etag, 
    @JsonProperty(JSON_PROPERTY_PUBLIC_LINK) String publicLink, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_LINK) String link
  ) {
  this();
    this.createdTime = createdTime;
    this.customerId = customerId;
    this.etag = etag;
    this.publicLink = publicLink;
    this.name = name;
    this.link = link;
  }

  public TbResource id(@javax.annotation.Nullable TbResourceId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the Resource Id. Specify this field to update the Resource. Referencing non-existing Resource Id will cause error. Omit this field to create new Resource.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TbResourceId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable TbResourceId id) {
    this.id = id;
  }


  /**
   * Timestamp of the resource creation, in milliseconds
   * @return createdTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  public TbResource tenantId(@javax.annotation.Nullable TenantId tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * JSON object with Tenant Id. Tenant Id of the resource can&#39;t be changed.
   * @return tenantId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(@javax.annotation.Nullable TenantId tenantId) {
    this.tenantId = tenantId;
  }


  /**
   * JSON object with Customer Id. Customer Id of the resource can&#39;t be changed.
   * @return customerId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomerId getCustomerId() {
    return customerId;
  }




  public TbResource title(@javax.annotation.Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Resource title.
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


  public TbResource resourceType(@javax.annotation.Nullable ResourceType resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * Resource type.
   * @return resourceType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RESOURCE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ResourceType getResourceType() {
    return resourceType;
  }


  @JsonProperty(value = JSON_PROPERTY_RESOURCE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceType(@javax.annotation.Nullable ResourceType resourceType) {
    this.resourceType = resourceType;
  }


  public TbResource resourceSubType(@javax.annotation.Nullable ResourceSubType resourceSubType) {
    this.resourceSubType = resourceSubType;
    return this;
  }

  /**
   * Resource sub type.
   * @return resourceSubType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RESOURCE_SUB_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ResourceSubType getResourceSubType() {
    return resourceSubType;
  }


  @JsonProperty(value = JSON_PROPERTY_RESOURCE_SUB_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceSubType(@javax.annotation.Nullable ResourceSubType resourceSubType) {
    this.resourceSubType = resourceSubType;
  }


  public TbResource resourceKey(@javax.annotation.Nullable String resourceKey) {
    this.resourceKey = resourceKey;
    return this;
  }

  /**
   * Resource key.
   * @return resourceKey
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RESOURCE_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResourceKey() {
    return resourceKey;
  }


  @JsonProperty(value = JSON_PROPERTY_RESOURCE_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceKey(@javax.annotation.Nullable String resourceKey) {
    this.resourceKey = resourceKey;
  }


  public TbResource publicResourceKey(@javax.annotation.Nullable String publicResourceKey) {
    this.publicResourceKey = publicResourceKey;
    return this;
  }

  /**
   * Public resource key.
   * @return publicResourceKey
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PUBLIC_RESOURCE_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicResourceKey() {
    return publicResourceKey;
  }


  @JsonProperty(value = JSON_PROPERTY_PUBLIC_RESOURCE_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicResourceKey(@javax.annotation.Nullable String publicResourceKey) {
    this.publicResourceKey = publicResourceKey;
  }


  /**
   * Resource etag.
   * @return etag
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ETAG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEtag() {
    return etag;
  }




  public TbResource fileName(@javax.annotation.Nullable String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Resource file name.
   * @return fileName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FILE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFileName() {
    return fileName;
  }


  @JsonProperty(value = JSON_PROPERTY_FILE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileName(@javax.annotation.Nullable String fileName) {
    this.fileName = fileName;
  }


  public TbResource descriptor(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode descriptor) {
    this.descriptor = descriptor;
    return this;
  }

  /**
   * Resource descriptor.
   * @return descriptor
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DESCRIPTOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getDescriptor() {
    return descriptor;
  }


  @JsonProperty(value = JSON_PROPERTY_DESCRIPTOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescriptor(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode descriptor) {
    this.descriptor = descriptor;
  }


  /**
   * Get publicLink
   * @return publicLink
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PUBLIC_LINK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicLink() {
    return publicLink;
  }




  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }




  public TbResource _public(@javax.annotation.Nullable Boolean _public) {
    this._public = _public;
    return this;
  }

  /**
   * Get _public
   * @return _public
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PUBLIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPublic() {
    return _public;
  }


  @JsonProperty(value = JSON_PROPERTY_PUBLIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublic(@javax.annotation.Nullable Boolean _public) {
    this._public = _public;
  }


  /**
   * Get link
   * @return link
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LINK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLink() {
    return link;
  }




  public TbResource data(@javax.annotation.Nullable String data) {
    this.data = data;
    return this;
  }

  /**
   * Resource data.
   * @return data
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getData() {
    return data;
  }


  @JsonProperty(value = JSON_PROPERTY_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(@javax.annotation.Nullable String data) {
    this.data = data;
  }


  public TbResource preview(@javax.annotation.Nullable String preview) {
    this.preview = preview;
    return this;
  }

  /**
   * Get preview
   * @return preview
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PREVIEW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPreview() {
    return preview;
  }


  @JsonProperty(value = JSON_PROPERTY_PREVIEW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreview(@javax.annotation.Nullable String preview) {
    this.preview = preview;
  }


  /**
   * Return true if this TbResource object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TbResource tbResource = (TbResource) o;
    return Objects.equals(this.id, tbResource.id) &&
        Objects.equals(this.createdTime, tbResource.createdTime) &&
        Objects.equals(this.tenantId, tbResource.tenantId) &&
        Objects.equals(this.customerId, tbResource.customerId) &&
        Objects.equals(this.title, tbResource.title) &&
        Objects.equals(this.resourceType, tbResource.resourceType) &&
        Objects.equals(this.resourceSubType, tbResource.resourceSubType) &&
        Objects.equals(this.resourceKey, tbResource.resourceKey) &&
        Objects.equals(this.publicResourceKey, tbResource.publicResourceKey) &&
        Objects.equals(this.etag, tbResource.etag) &&
        Objects.equals(this.fileName, tbResource.fileName) &&
        Objects.equals(this.descriptor, tbResource.descriptor) &&
        Objects.equals(this.publicLink, tbResource.publicLink) &&
        Objects.equals(this.name, tbResource.name) &&
        Objects.equals(this._public, tbResource._public) &&
        Objects.equals(this.link, tbResource.link) &&
        Objects.equals(this.data, tbResource.data) &&
        Objects.equals(this.preview, tbResource.preview);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, customerId, title, resourceType, resourceSubType, resourceKey, publicResourceKey, etag, fileName, descriptor, publicLink, name, _public, link, data, preview);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TbResource {\n");
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
    sb.append("    publicLink: ").append(toIndentedString(publicLink)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    preview: ").append(toIndentedString(preview)).append("\n");
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

    // add `publicLink` to the URL query string
    if (getPublicLink() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spublicLink%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPublicLink()))));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `public` to the URL query string
    if (getPublic() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spublic%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPublic()))));
    }

    // add `link` to the URL query string
    if (getLink() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slink%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLink()))));
    }

    // add `data` to the URL query string
    if (getData() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdata%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getData()))));
    }

    // add `preview` to the URL query string
    if (getPreview() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spreview%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPreview()))));
    }

    return joiner.toString();
  }
}

