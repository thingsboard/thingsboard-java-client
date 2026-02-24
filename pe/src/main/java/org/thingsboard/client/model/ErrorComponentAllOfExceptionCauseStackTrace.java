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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * ErrorComponentAllOfExceptionCauseStackTrace
 */
@JsonPropertyOrder({
  ErrorComponentAllOfExceptionCauseStackTrace.JSON_PROPERTY_CLASS_LOADER_NAME,
  ErrorComponentAllOfExceptionCauseStackTrace.JSON_PROPERTY_MODULE_NAME,
  ErrorComponentAllOfExceptionCauseStackTrace.JSON_PROPERTY_MODULE_VERSION,
  ErrorComponentAllOfExceptionCauseStackTrace.JSON_PROPERTY_METHOD_NAME,
  ErrorComponentAllOfExceptionCauseStackTrace.JSON_PROPERTY_FILE_NAME,
  ErrorComponentAllOfExceptionCauseStackTrace.JSON_PROPERTY_LINE_NUMBER,
  ErrorComponentAllOfExceptionCauseStackTrace.JSON_PROPERTY_NATIVE_METHOD,
  ErrorComponentAllOfExceptionCauseStackTrace.JSON_PROPERTY_CLASS_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class ErrorComponentAllOfExceptionCauseStackTrace {
  public static final String JSON_PROPERTY_CLASS_LOADER_NAME = "classLoaderName";
  @javax.annotation.Nullable
  private String classLoaderName;

  public static final String JSON_PROPERTY_MODULE_NAME = "moduleName";
  @javax.annotation.Nullable
  private String moduleName;

  public static final String JSON_PROPERTY_MODULE_VERSION = "moduleVersion";
  @javax.annotation.Nullable
  private String moduleVersion;

  public static final String JSON_PROPERTY_METHOD_NAME = "methodName";
  @javax.annotation.Nullable
  private String methodName;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  @javax.annotation.Nullable
  private String fileName;

  public static final String JSON_PROPERTY_LINE_NUMBER = "lineNumber";
  @javax.annotation.Nullable
  private Integer lineNumber;

  public static final String JSON_PROPERTY_NATIVE_METHOD = "nativeMethod";
  @javax.annotation.Nullable
  private Boolean nativeMethod;

  public static final String JSON_PROPERTY_CLASS_NAME = "className";
  @javax.annotation.Nullable
  private String className;

  public ErrorComponentAllOfExceptionCauseStackTrace() { 
  }

  public ErrorComponentAllOfExceptionCauseStackTrace classLoaderName(@javax.annotation.Nullable String classLoaderName) {
    this.classLoaderName = classLoaderName;
    return this;
  }

  /**
   * Get classLoaderName
   * @return classLoaderName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CLASS_LOADER_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getClassLoaderName() {
    return classLoaderName;
  }


  @JsonProperty(value = JSON_PROPERTY_CLASS_LOADER_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClassLoaderName(@javax.annotation.Nullable String classLoaderName) {
    this.classLoaderName = classLoaderName;
  }


  public ErrorComponentAllOfExceptionCauseStackTrace moduleName(@javax.annotation.Nullable String moduleName) {
    this.moduleName = moduleName;
    return this;
  }

  /**
   * Get moduleName
   * @return moduleName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MODULE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getModuleName() {
    return moduleName;
  }


  @JsonProperty(value = JSON_PROPERTY_MODULE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModuleName(@javax.annotation.Nullable String moduleName) {
    this.moduleName = moduleName;
  }


  public ErrorComponentAllOfExceptionCauseStackTrace moduleVersion(@javax.annotation.Nullable String moduleVersion) {
    this.moduleVersion = moduleVersion;
    return this;
  }

  /**
   * Get moduleVersion
   * @return moduleVersion
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MODULE_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getModuleVersion() {
    return moduleVersion;
  }


  @JsonProperty(value = JSON_PROPERTY_MODULE_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModuleVersion(@javax.annotation.Nullable String moduleVersion) {
    this.moduleVersion = moduleVersion;
  }


  public ErrorComponentAllOfExceptionCauseStackTrace methodName(@javax.annotation.Nullable String methodName) {
    this.methodName = methodName;
    return this;
  }

  /**
   * Get methodName
   * @return methodName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_METHOD_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMethodName() {
    return methodName;
  }


  @JsonProperty(value = JSON_PROPERTY_METHOD_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMethodName(@javax.annotation.Nullable String methodName) {
    this.methodName = methodName;
  }


  public ErrorComponentAllOfExceptionCauseStackTrace fileName(@javax.annotation.Nullable String fileName) {
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


  public ErrorComponentAllOfExceptionCauseStackTrace lineNumber(@javax.annotation.Nullable Integer lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

  /**
   * Get lineNumber
   * @return lineNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LINE_NUMBER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getLineNumber() {
    return lineNumber;
  }


  @JsonProperty(value = JSON_PROPERTY_LINE_NUMBER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineNumber(@javax.annotation.Nullable Integer lineNumber) {
    this.lineNumber = lineNumber;
  }


  public ErrorComponentAllOfExceptionCauseStackTrace nativeMethod(@javax.annotation.Nullable Boolean nativeMethod) {
    this.nativeMethod = nativeMethod;
    return this;
  }

  /**
   * Get nativeMethod
   * @return nativeMethod
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NATIVE_METHOD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getNativeMethod() {
    return nativeMethod;
  }


  @JsonProperty(value = JSON_PROPERTY_NATIVE_METHOD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNativeMethod(@javax.annotation.Nullable Boolean nativeMethod) {
    this.nativeMethod = nativeMethod;
  }


  public ErrorComponentAllOfExceptionCauseStackTrace className(@javax.annotation.Nullable String className) {
    this.className = className;
    return this;
  }

  /**
   * Get className
   * @return className
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CLASS_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getClassName() {
    return className;
  }


  @JsonProperty(value = JSON_PROPERTY_CLASS_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClassName(@javax.annotation.Nullable String className) {
    this.className = className;
  }


  /**
   * Return true if this ErrorComponent_allOf_exception_cause_stackTrace object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorComponentAllOfExceptionCauseStackTrace errorComponentAllOfExceptionCauseStackTrace = (ErrorComponentAllOfExceptionCauseStackTrace) o;
    return Objects.equals(this.classLoaderName, errorComponentAllOfExceptionCauseStackTrace.classLoaderName) &&
        Objects.equals(this.moduleName, errorComponentAllOfExceptionCauseStackTrace.moduleName) &&
        Objects.equals(this.moduleVersion, errorComponentAllOfExceptionCauseStackTrace.moduleVersion) &&
        Objects.equals(this.methodName, errorComponentAllOfExceptionCauseStackTrace.methodName) &&
        Objects.equals(this.fileName, errorComponentAllOfExceptionCauseStackTrace.fileName) &&
        Objects.equals(this.lineNumber, errorComponentAllOfExceptionCauseStackTrace.lineNumber) &&
        Objects.equals(this.nativeMethod, errorComponentAllOfExceptionCauseStackTrace.nativeMethod) &&
        Objects.equals(this.className, errorComponentAllOfExceptionCauseStackTrace.className);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classLoaderName, moduleName, moduleVersion, methodName, fileName, lineNumber, nativeMethod, className);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorComponentAllOfExceptionCauseStackTrace {\n");
    sb.append("    classLoaderName: ").append(toIndentedString(classLoaderName)).append("\n");
    sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
    sb.append("    moduleVersion: ").append(toIndentedString(moduleVersion)).append("\n");
    sb.append("    methodName: ").append(toIndentedString(methodName)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    nativeMethod: ").append(toIndentedString(nativeMethod)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
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

    // add `classLoaderName` to the URL query string
    if (getClassLoaderName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sclassLoaderName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getClassLoaderName()))));
    }

    // add `moduleName` to the URL query string
    if (getModuleName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smoduleName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getModuleName()))));
    }

    // add `moduleVersion` to the URL query string
    if (getModuleVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smoduleVersion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getModuleVersion()))));
    }

    // add `methodName` to the URL query string
    if (getMethodName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smethodName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMethodName()))));
    }

    // add `fileName` to the URL query string
    if (getFileName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfileName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFileName()))));
    }

    // add `lineNumber` to the URL query string
    if (getLineNumber() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slineNumber%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLineNumber()))));
    }

    // add `nativeMethod` to the URL query string
    if (getNativeMethod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snativeMethod%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNativeMethod()))));
    }

    // add `className` to the URL query string
    if (getClassName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sclassName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getClassName()))));
    }

    return joiner.toString();
  }
}

