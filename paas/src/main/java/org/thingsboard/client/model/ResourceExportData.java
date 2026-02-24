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
import org.thingsboard.client.model.ResourceSubType;
import org.thingsboard.client.model.ResourceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * ResourceExportData
 */
@JsonPropertyOrder({
  ResourceExportData.JSON_PROPERTY_LINK,
  ResourceExportData.JSON_PROPERTY_TITLE,
  ResourceExportData.JSON_PROPERTY_TYPE,
  ResourceExportData.JSON_PROPERTY_SUB_TYPE,
  ResourceExportData.JSON_PROPERTY_RESOURCE_KEY,
  ResourceExportData.JSON_PROPERTY_FILE_NAME,
  ResourceExportData.JSON_PROPERTY_PUBLIC_RESOURCE_KEY,
  ResourceExportData.JSON_PROPERTY_IS_PUBLIC,
  ResourceExportData.JSON_PROPERTY_MEDIA_TYPE,
  ResourceExportData.JSON_PROPERTY_DATA,
  ResourceExportData.JSON_PROPERTY_PUBLIC
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class ResourceExportData {
  public static final String JSON_PROPERTY_LINK = "link";
  @javax.annotation.Nullable
  private String link;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private String title;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private ResourceType type;

  public static final String JSON_PROPERTY_SUB_TYPE = "subType";
  @javax.annotation.Nullable
  private ResourceSubType subType;

  public static final String JSON_PROPERTY_RESOURCE_KEY = "resourceKey";
  @javax.annotation.Nullable
  private String resourceKey;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  @javax.annotation.Nullable
  private String fileName;

  public static final String JSON_PROPERTY_PUBLIC_RESOURCE_KEY = "publicResourceKey";
  @javax.annotation.Nullable
  private String publicResourceKey;

  public static final String JSON_PROPERTY_IS_PUBLIC = "isPublic";
  @javax.annotation.Nullable
  private Boolean isPublic;

  public static final String JSON_PROPERTY_MEDIA_TYPE = "mediaType";
  @javax.annotation.Nullable
  private String mediaType;

  public static final String JSON_PROPERTY_DATA = "data";
  @javax.annotation.Nullable
  private String data;

  public static final String JSON_PROPERTY_PUBLIC = "public";
  @javax.annotation.Nullable
  private Boolean _public;

  public ResourceExportData() { 
  }

  public ResourceExportData link(@javax.annotation.Nullable String link) {
    this.link = link;
    return this;
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


  @JsonProperty(value = JSON_PROPERTY_LINK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLink(@javax.annotation.Nullable String link) {
    this.link = link;
  }


  public ResourceExportData title(@javax.annotation.Nullable String title) {
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


  public ResourceExportData type(@javax.annotation.Nullable ResourceType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ResourceType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable ResourceType type) {
    this.type = type;
  }


  public ResourceExportData subType(@javax.annotation.Nullable ResourceSubType subType) {
    this.subType = subType;
    return this;
  }

  /**
   * Get subType
   * @return subType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SUB_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ResourceSubType getSubType() {
    return subType;
  }


  @JsonProperty(value = JSON_PROPERTY_SUB_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubType(@javax.annotation.Nullable ResourceSubType subType) {
    this.subType = subType;
  }


  public ResourceExportData resourceKey(@javax.annotation.Nullable String resourceKey) {
    this.resourceKey = resourceKey;
    return this;
  }

  /**
   * Get resourceKey
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


  public ResourceExportData fileName(@javax.annotation.Nullable String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Get fileName
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


  public ResourceExportData publicResourceKey(@javax.annotation.Nullable String publicResourceKey) {
    this.publicResourceKey = publicResourceKey;
    return this;
  }

  /**
   * Get publicResourceKey
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


  public ResourceExportData isPublic(@javax.annotation.Nullable Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

  /**
   * Get isPublic
   * @return isPublic
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_IS_PUBLIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsPublic() {
    return isPublic;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_PUBLIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPublic(@javax.annotation.Nullable Boolean isPublic) {
    this.isPublic = isPublic;
  }


  public ResourceExportData mediaType(@javax.annotation.Nullable String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  /**
   * Get mediaType
   * @return mediaType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MEDIA_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMediaType() {
    return mediaType;
  }


  @JsonProperty(value = JSON_PROPERTY_MEDIA_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaType(@javax.annotation.Nullable String mediaType) {
    this.mediaType = mediaType;
  }


  public ResourceExportData data(@javax.annotation.Nullable String data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
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


  public ResourceExportData _public(@javax.annotation.Nullable Boolean _public) {
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
   * Return true if this ResourceExportData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceExportData resourceExportData = (ResourceExportData) o;
    return Objects.equals(this.link, resourceExportData.link) &&
        Objects.equals(this.title, resourceExportData.title) &&
        Objects.equals(this.type, resourceExportData.type) &&
        Objects.equals(this.subType, resourceExportData.subType) &&
        Objects.equals(this.resourceKey, resourceExportData.resourceKey) &&
        Objects.equals(this.fileName, resourceExportData.fileName) &&
        Objects.equals(this.publicResourceKey, resourceExportData.publicResourceKey) &&
        Objects.equals(this.isPublic, resourceExportData.isPublic) &&
        Objects.equals(this.mediaType, resourceExportData.mediaType) &&
        Objects.equals(this.data, resourceExportData.data) &&
        Objects.equals(this._public, resourceExportData._public);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, title, type, subType, resourceKey, fileName, publicResourceKey, isPublic, mediaType, data, _public);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceExportData {\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    resourceKey: ").append(toIndentedString(resourceKey)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    publicResourceKey: ").append(toIndentedString(publicResourceKey)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
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

    // add `link` to the URL query string
    if (getLink() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slink%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLink()))));
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTitle()))));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `subType` to the URL query string
    if (getSubType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssubType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSubType()))));
    }

    // add `resourceKey` to the URL query string
    if (getResourceKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sresourceKey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getResourceKey()))));
    }

    // add `fileName` to the URL query string
    if (getFileName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfileName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFileName()))));
    }

    // add `publicResourceKey` to the URL query string
    if (getPublicResourceKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spublicResourceKey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPublicResourceKey()))));
    }

    // add `isPublic` to the URL query string
    if (getIsPublic() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sisPublic%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIsPublic()))));
    }

    // add `mediaType` to the URL query string
    if (getMediaType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smediaType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMediaType()))));
    }

    // add `data` to the URL query string
    if (getData() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdata%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getData()))));
    }

    // add `public` to the URL query string
    if (getPublic() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spublic%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPublic()))));
    }

    return joiner.toString();
  }
}

