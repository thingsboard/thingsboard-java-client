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
import org.thingsboard.client.model.DashboardId;
import org.thingsboard.client.model.EntityGroupId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * TenantSolutionTemplateInstructions
 */
@JsonPropertyOrder({
  TenantSolutionTemplateInstructions.JSON_PROPERTY_DASHBOARD_GROUP_ID,
  TenantSolutionTemplateInstructions.JSON_PROPERTY_DASHBOARD_ID,
  TenantSolutionTemplateInstructions.JSON_PROPERTY_PUBLIC_ID,
  TenantSolutionTemplateInstructions.JSON_PROPERTY_MAIN_DASHBOARD_PUBLIC,
  TenantSolutionTemplateInstructions.JSON_PROPERTY_DETAILS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class TenantSolutionTemplateInstructions {
  public static final String JSON_PROPERTY_DASHBOARD_GROUP_ID = "dashboardGroupId";
  @javax.annotation.Nullable
  private EntityGroupId dashboardGroupId;

  public static final String JSON_PROPERTY_DASHBOARD_ID = "dashboardId";
  @javax.annotation.Nullable
  private DashboardId dashboardId;

  public static final String JSON_PROPERTY_PUBLIC_ID = "publicId";
  @javax.annotation.Nullable
  private CustomerId publicId;

  public static final String JSON_PROPERTY_MAIN_DASHBOARD_PUBLIC = "mainDashboardPublic";
  @javax.annotation.Nullable
  private Boolean mainDashboardPublic;

  public static final String JSON_PROPERTY_DETAILS = "details";
  @javax.annotation.Nullable
  private String details;

  public TenantSolutionTemplateInstructions() { 
  }

  public TenantSolutionTemplateInstructions dashboardGroupId(@javax.annotation.Nullable EntityGroupId dashboardGroupId) {
    this.dashboardGroupId = dashboardGroupId;
    return this;
  }

  /**
   * Id of the group that contains main dashboard of the solution
   * @return dashboardGroupId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DASHBOARD_GROUP_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityGroupId getDashboardGroupId() {
    return dashboardGroupId;
  }


  @JsonProperty(value = JSON_PROPERTY_DASHBOARD_GROUP_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDashboardGroupId(@javax.annotation.Nullable EntityGroupId dashboardGroupId) {
    this.dashboardGroupId = dashboardGroupId;
  }


  public TenantSolutionTemplateInstructions dashboardId(@javax.annotation.Nullable DashboardId dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  /**
   * Id of the main dashboard of the solution
   * @return dashboardId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DASHBOARD_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DashboardId getDashboardId() {
    return dashboardId;
  }


  @JsonProperty(value = JSON_PROPERTY_DASHBOARD_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDashboardId(@javax.annotation.Nullable DashboardId dashboardId) {
    this.dashboardId = dashboardId;
  }


  public TenantSolutionTemplateInstructions publicId(@javax.annotation.Nullable CustomerId publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * Id of the public customer if solution has public entities
   * @return publicId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PUBLIC_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomerId getPublicId() {
    return publicId;
  }


  @JsonProperty(value = JSON_PROPERTY_PUBLIC_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicId(@javax.annotation.Nullable CustomerId publicId) {
    this.publicId = publicId;
  }


  public TenantSolutionTemplateInstructions mainDashboardPublic(@javax.annotation.Nullable Boolean mainDashboardPublic) {
    this.mainDashboardPublic = mainDashboardPublic;
    return this;
  }

  /**
   * Is the main dashboard public
   * @return mainDashboardPublic
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MAIN_DASHBOARD_PUBLIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getMainDashboardPublic() {
    return mainDashboardPublic;
  }


  @JsonProperty(value = JSON_PROPERTY_MAIN_DASHBOARD_PUBLIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMainDashboardPublic(@javax.annotation.Nullable Boolean mainDashboardPublic) {
    this.mainDashboardPublic = mainDashboardPublic;
  }


  public TenantSolutionTemplateInstructions details(@javax.annotation.Nullable String details) {
    this.details = details;
    return this;
  }

  /**
   * Markdown with solution usage instructions
   * @return details
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DETAILS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDetails() {
    return details;
  }


  @JsonProperty(value = JSON_PROPERTY_DETAILS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetails(@javax.annotation.Nullable String details) {
    this.details = details;
  }


  /**
   * Return true if this TenantSolutionTemplateInstructions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantSolutionTemplateInstructions tenantSolutionTemplateInstructions = (TenantSolutionTemplateInstructions) o;
    return Objects.equals(this.dashboardGroupId, tenantSolutionTemplateInstructions.dashboardGroupId) &&
        Objects.equals(this.dashboardId, tenantSolutionTemplateInstructions.dashboardId) &&
        Objects.equals(this.publicId, tenantSolutionTemplateInstructions.publicId) &&
        Objects.equals(this.mainDashboardPublic, tenantSolutionTemplateInstructions.mainDashboardPublic) &&
        Objects.equals(this.details, tenantSolutionTemplateInstructions.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardGroupId, dashboardId, publicId, mainDashboardPublic, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantSolutionTemplateInstructions {\n");
    sb.append("    dashboardGroupId: ").append(toIndentedString(dashboardGroupId)).append("\n");
    sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    mainDashboardPublic: ").append(toIndentedString(mainDashboardPublic)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

    // add `dashboardGroupId` to the URL query string
    if (getDashboardGroupId() != null) {
      joiner.add(getDashboardGroupId().toUrlQueryString(prefix + "dashboardGroupId" + suffix));
    }

    // add `dashboardId` to the URL query string
    if (getDashboardId() != null) {
      joiner.add(getDashboardId().toUrlQueryString(prefix + "dashboardId" + suffix));
    }

    // add `publicId` to the URL query string
    if (getPublicId() != null) {
      joiner.add(getPublicId().toUrlQueryString(prefix + "publicId" + suffix));
    }

    // add `mainDashboardPublic` to the URL query string
    if (getMainDashboardPublic() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smainDashboardPublic%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMainDashboardPublic()))));
    }

    // add `details` to the URL query string
    if (getDetails() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdetails%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDetails()))));
    }

    return joiner.toString();
  }
}

