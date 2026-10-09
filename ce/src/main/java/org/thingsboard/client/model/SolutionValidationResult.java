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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * Result of a solution validation (dry-run). Checks structural validity and dependency references without modifying any data.
 */
@JsonPropertyOrder({
  SolutionValidationResult.JSON_PROPERTY_VALID,
  SolutionValidationResult.JSON_PROPERTY_ENTITY_SUMMARY,
  SolutionValidationResult.JSON_PROPERTY_CONFLICTS,
  SolutionValidationResult.JSON_PROPERTY_WARNINGS
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class SolutionValidationResult {
  public static final String JSON_PROPERTY_VALID = "valid";
  @Nullable
  private Boolean valid;

  public static final String JSON_PROPERTY_ENTITY_SUMMARY = "entitySummary";
  @Nullable
  private Map<String, Integer> entitySummary = new HashMap<>();

  public static final String JSON_PROPERTY_CONFLICTS = "conflicts";
  @Nullable
  private List<String> conflicts = new ArrayList<>();

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  @Nullable
  private List<String> warnings = new ArrayList<>();

  public SolutionValidationResult() { 
  }

  public SolutionValidationResult valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * &#39;true&#39; if the solution can be imported without errors. &#39;false&#39; if there are structural issues (empty entities, unsupported types, malformed data).
   * @return valid
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_VALID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getValid() {
    return valid;
  }


  @JsonProperty(value = JSON_PROPERTY_VALID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }


  public SolutionValidationResult entitySummary(@Nullable Map<String, Integer> entitySummary) {
    this.entitySummary = entitySummary;
    return this;
  }

  public SolutionValidationResult putEntitySummaryItem(String key, Integer entitySummaryItem) {
    if (this.entitySummary == null) {
      this.entitySummary = new HashMap<>();
    }
    this.entitySummary.put(key, entitySummaryItem);
    return this;
  }

  /**
   * Number of entities per type found in the solution file.
   * @return entitySummary
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_SUMMARY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Integer> getEntitySummary() {
    return entitySummary;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_SUMMARY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntitySummary(@Nullable Map<String, Integer> entitySummary) {
    this.entitySummary = entitySummary;
  }


  public SolutionValidationResult conflicts(@Nullable List<String> conflicts) {
    this.conflicts = conflicts;
    return this;
  }

  public SolutionValidationResult addConflictsItem(String conflictsItem) {
    if (this.conflicts == null) {
      this.conflicts = new ArrayList<>();
    }
    this.conflicts.add(conflictsItem);
    return this;
  }

  /**
   * List of blocking issues that would prevent import (e.g. unsupported entity types, missing or malformed entity data).
   * @return conflicts
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CONFLICTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getConflicts() {
    return conflicts;
  }


  @JsonProperty(value = JSON_PROPERTY_CONFLICTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConflicts(@Nullable List<String> conflicts) {
    this.conflicts = conflicts;
  }


  public SolutionValidationResult warnings(@Nullable List<String> warnings) {
    this.warnings = warnings;
    return this;
  }

  public SolutionValidationResult addWarningsItem(String warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

  /**
   * List of non-blocking warnings (e.g. missing dependency references).
   * @return warnings
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_WARNINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getWarnings() {
    return warnings;
  }


  @JsonProperty(value = JSON_PROPERTY_WARNINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWarnings(@Nullable List<String> warnings) {
    this.warnings = warnings;
  }


  /**
   * Return true if this SolutionValidationResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolutionValidationResult solutionValidationResult = (SolutionValidationResult) o;
    return Objects.equals(this.valid, solutionValidationResult.valid) &&
        Objects.equals(this.entitySummary, solutionValidationResult.entitySummary) &&
        Objects.equals(this.conflicts, solutionValidationResult.conflicts) &&
        Objects.equals(this.warnings, solutionValidationResult.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, entitySummary, conflicts, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolutionValidationResult {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    entitySummary: ").append(toIndentedString(entitySummary)).append("\n");
    sb.append("    conflicts: ").append(toIndentedString(conflicts)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

    // add `valid` to the URL query string
    if (getValid() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%svalid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getValid()))));
    }

    // add `entitySummary` to the URL query string
    if (getEntitySummary() != null) {
      for (String _key : getEntitySummary().keySet()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%sentitySummary%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix),
            getEntitySummary().get(_key), ApiClient.urlEncode(ApiClient.valueToString(getEntitySummary().get(_key)))));
      }
    }

    // add `conflicts` to the URL query string
    if (getConflicts() != null) {
      for (int i = 0; i < getConflicts().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%sconflicts%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getConflicts().get(i)))));
      }
    }

    // add `warnings` to the URL query string
    if (getWarnings() != null) {
      for (int i = 0; i < getWarnings().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%swarnings%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getWarnings().get(i)))));
      }
    }

    return joiner.toString();
  }
}

