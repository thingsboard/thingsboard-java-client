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
 * LwM2MServerSecurityConfigDefault
 */
@JsonPropertyOrder({
  LwM2MServerSecurityConfigDefault.JSON_PROPERTY_SHORT_SERVER_ID,
  LwM2MServerSecurityConfigDefault.JSON_PROPERTY_BOOTSTRAP_SERVER_IS,
  LwM2MServerSecurityConfigDefault.JSON_PROPERTY_HOST,
  LwM2MServerSecurityConfigDefault.JSON_PROPERTY_PORT,
  LwM2MServerSecurityConfigDefault.JSON_PROPERTY_CLIENT_HOLD_OFF_TIME,
  LwM2MServerSecurityConfigDefault.JSON_PROPERTY_SERVER_PUBLIC_KEY,
  LwM2MServerSecurityConfigDefault.JSON_PROPERTY_SERVER_CERTIFICATE,
  LwM2MServerSecurityConfigDefault.JSON_PROPERTY_BOOTSTRAP_SERVER_ACCOUNT_TIMEOUT,
  LwM2MServerSecurityConfigDefault.JSON_PROPERTY_LIFETIME,
  LwM2MServerSecurityConfigDefault.JSON_PROPERTY_DEFAULT_MIN_PERIOD,
  LwM2MServerSecurityConfigDefault.JSON_PROPERTY_NOTIF_IF_DISABLED,
  LwM2MServerSecurityConfigDefault.JSON_PROPERTY_BINDING,
  LwM2MServerSecurityConfigDefault.JSON_PROPERTY_SECURITY_HOST,
  LwM2MServerSecurityConfigDefault.JSON_PROPERTY_SECURITY_PORT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class LwM2MServerSecurityConfigDefault {
  public static final String JSON_PROPERTY_SHORT_SERVER_ID = "shortServerId";
  @javax.annotation.Nullable
  private Integer shortServerId;

  public static final String JSON_PROPERTY_BOOTSTRAP_SERVER_IS = "bootstrapServerIs";
  @javax.annotation.Nullable
  private Boolean bootstrapServerIs;

  public static final String JSON_PROPERTY_HOST = "host";
  @javax.annotation.Nullable
  private String host;

  public static final String JSON_PROPERTY_PORT = "port";
  @javax.annotation.Nullable
  private Integer port;

  public static final String JSON_PROPERTY_CLIENT_HOLD_OFF_TIME = "clientHoldOffTime";
  @javax.annotation.Nullable
  private Integer clientHoldOffTime;

  public static final String JSON_PROPERTY_SERVER_PUBLIC_KEY = "serverPublicKey";
  @javax.annotation.Nullable
  private String serverPublicKey;

  public static final String JSON_PROPERTY_SERVER_CERTIFICATE = "serverCertificate";
  @javax.annotation.Nullable
  private String serverCertificate;

  public static final String JSON_PROPERTY_BOOTSTRAP_SERVER_ACCOUNT_TIMEOUT = "bootstrapServerAccountTimeout";
  @javax.annotation.Nullable
  private Integer bootstrapServerAccountTimeout;

  public static final String JSON_PROPERTY_LIFETIME = "lifetime";
  @javax.annotation.Nullable
  private Integer lifetime;

  public static final String JSON_PROPERTY_DEFAULT_MIN_PERIOD = "defaultMinPeriod";
  @javax.annotation.Nullable
  private Integer defaultMinPeriod;

  public static final String JSON_PROPERTY_NOTIF_IF_DISABLED = "notifIfDisabled";
  @javax.annotation.Nullable
  private Boolean notifIfDisabled;

  public static final String JSON_PROPERTY_BINDING = "binding";
  @javax.annotation.Nullable
  private String binding;

  public static final String JSON_PROPERTY_SECURITY_HOST = "securityHost";
  @javax.annotation.Nullable
  private String securityHost;

  public static final String JSON_PROPERTY_SECURITY_PORT = "securityPort";
  @javax.annotation.Nullable
  private Integer securityPort;

  public LwM2MServerSecurityConfigDefault() { 
  }

  @JsonCreator
  public LwM2MServerSecurityConfigDefault(
    @JsonProperty(JSON_PROPERTY_SHORT_SERVER_ID) Integer shortServerId, 
    @JsonProperty(JSON_PROPERTY_BOOTSTRAP_SERVER_IS) Boolean bootstrapServerIs, 
    @JsonProperty(JSON_PROPERTY_HOST) String host, 
    @JsonProperty(JSON_PROPERTY_PORT) Integer port, 
    @JsonProperty(JSON_PROPERTY_CLIENT_HOLD_OFF_TIME) Integer clientHoldOffTime, 
    @JsonProperty(JSON_PROPERTY_SERVER_PUBLIC_KEY) String serverPublicKey, 
    @JsonProperty(JSON_PROPERTY_SERVER_CERTIFICATE) String serverCertificate, 
    @JsonProperty(JSON_PROPERTY_BOOTSTRAP_SERVER_ACCOUNT_TIMEOUT) Integer bootstrapServerAccountTimeout, 
    @JsonProperty(JSON_PROPERTY_LIFETIME) Integer lifetime, 
    @JsonProperty(JSON_PROPERTY_DEFAULT_MIN_PERIOD) Integer defaultMinPeriod, 
    @JsonProperty(JSON_PROPERTY_NOTIF_IF_DISABLED) Boolean notifIfDisabled, 
    @JsonProperty(JSON_PROPERTY_BINDING) String binding, 
    @JsonProperty(JSON_PROPERTY_SECURITY_HOST) String securityHost, 
    @JsonProperty(JSON_PROPERTY_SECURITY_PORT) Integer securityPort
  ) {
  this();
    this.shortServerId = shortServerId;
    this.bootstrapServerIs = bootstrapServerIs;
    this.host = host;
    this.port = port;
    this.clientHoldOffTime = clientHoldOffTime;
    this.serverPublicKey = serverPublicKey;
    this.serverCertificate = serverCertificate;
    this.bootstrapServerAccountTimeout = bootstrapServerAccountTimeout;
    this.lifetime = lifetime;
    this.defaultMinPeriod = defaultMinPeriod;
    this.notifIfDisabled = notifIfDisabled;
    this.binding = binding;
    this.securityHost = securityHost;
    this.securityPort = securityPort;
  }

  /**
   * Server short Id. Used as link to associate server Object Instance. This identifier uniquely identifies each LwM2M Server configured for the LwM2M Client. This Resource MUST be set when the Bootstrap-Server Resource has a value of &#39;false&#39;. The values ID:0 and ID:65535 values MUST NOT be used for identifying the LwM2M Server.
   * @return shortServerId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHORT_SERVER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getShortServerId() {
    return shortServerId;
  }




  /**
   * Is Bootstrap Server or Lwm2m Server. The LwM2M Client MAY be configured to use one or more LwM2M Server Account(s). The LwM2M Client MUST have at most one LwM2M Bootstrap-Server Account. (*) The LwM2M client MUST have at least one LwM2M server account after completing the boot sequence specified.
   * @return bootstrapServerIs
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BOOTSTRAP_SERVER_IS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getBootstrapServerIs() {
    return bootstrapServerIs;
  }




  /**
   * Host for &#39;No Security&#39; mode
   * @return host
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_HOST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHost() {
    return host;
  }




  /**
   * Port for  Lwm2m Server: &#39;No Security&#39; mode: Lwm2m Server or Bootstrap Server
   * @return port
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PORT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getPort() {
    return port;
  }




  /**
   * Client Hold Off Time. The number of seconds to wait before initiating a Client Initiated Bootstrap once the LwM2M Client has determined it should initiate this bootstrap mode. (This information is relevant for use with a Bootstrap-Server only.)
   * @return clientHoldOffTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CLIENT_HOLD_OFF_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getClientHoldOffTime() {
    return clientHoldOffTime;
  }




  /**
   * Server Public Key for &#39;Security&#39; mode (DTLS): RPK or X509. Format: base64 encoded
   * @return serverPublicKey
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SERVER_PUBLIC_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getServerPublicKey() {
    return serverPublicKey;
  }




  /**
   * Server Public Key for &#39;Security&#39; mode (DTLS): X509. Format: base64 encoded
   * @return serverCertificate
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SERVER_CERTIFICATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getServerCertificate() {
    return serverCertificate;
  }




  /**
   * Bootstrap Server Account Timeout (If the value is set to 0, or if this resource is not instantiated, the Bootstrap-Server Account lifetime is infinite.)
   * @return bootstrapServerAccountTimeout
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BOOTSTRAP_SERVER_ACCOUNT_TIMEOUT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getBootstrapServerAccountTimeout() {
    return bootstrapServerAccountTimeout;
  }




  /**
   * Specify the lifetime of the registration in seconds.
   * @return lifetime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LIFETIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getLifetime() {
    return lifetime;
  }




  /**
   * The default value the LwM2M Client should use for the Minimum Period of an Observation in the absence of this parameter being included in an Observation. If this Resource doesn’t exist, the default value is 0.
   * @return defaultMinPeriod
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEFAULT_MIN_PERIOD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getDefaultMinPeriod() {
    return defaultMinPeriod;
  }




  /**
   * If true, the LwM2M Client stores “Notify” operations to the LwM2M Server while the LwM2M Server account is disabled or the LwM2M Client is offline. After the LwM2M Server account is enabled or the LwM2M Client is online, the LwM2M Client reports the stored “Notify” operations to the Server. If false, the LwM2M Client discards all the “Notify” operations or temporarily disables the Observe function while the LwM2M Server is disabled or the LwM2M Client is offline. The default value is true.
   * @return notifIfDisabled
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NOTIF_IF_DISABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getNotifIfDisabled() {
    return notifIfDisabled;
  }




  /**
   * This Resource defines the transport binding configured for the LwM2M Client. If the LwM2M Client supports the binding specified in this Resource, the LwM2M Client MUST use that transport for the Current Binding Mode.
   * @return binding
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BINDING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBinding() {
    return binding;
  }




  /**
   * Host for &#39;Security&#39; mode (DTLS)
   * @return securityHost
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SECURITY_HOST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSecurityHost() {
    return securityHost;
  }




  /**
   * Port for &#39;Security&#39; mode (DTLS): Lwm2m Server or Bootstrap Server
   * @return securityPort
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SECURITY_PORT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getSecurityPort() {
    return securityPort;
  }




  /**
   * Return true if this LwM2MServerSecurityConfigDefault object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LwM2MServerSecurityConfigDefault lwM2MServerSecurityConfigDefault = (LwM2MServerSecurityConfigDefault) o;
    return Objects.equals(this.shortServerId, lwM2MServerSecurityConfigDefault.shortServerId) &&
        Objects.equals(this.bootstrapServerIs, lwM2MServerSecurityConfigDefault.bootstrapServerIs) &&
        Objects.equals(this.host, lwM2MServerSecurityConfigDefault.host) &&
        Objects.equals(this.port, lwM2MServerSecurityConfigDefault.port) &&
        Objects.equals(this.clientHoldOffTime, lwM2MServerSecurityConfigDefault.clientHoldOffTime) &&
        Objects.equals(this.serverPublicKey, lwM2MServerSecurityConfigDefault.serverPublicKey) &&
        Objects.equals(this.serverCertificate, lwM2MServerSecurityConfigDefault.serverCertificate) &&
        Objects.equals(this.bootstrapServerAccountTimeout, lwM2MServerSecurityConfigDefault.bootstrapServerAccountTimeout) &&
        Objects.equals(this.lifetime, lwM2MServerSecurityConfigDefault.lifetime) &&
        Objects.equals(this.defaultMinPeriod, lwM2MServerSecurityConfigDefault.defaultMinPeriod) &&
        Objects.equals(this.notifIfDisabled, lwM2MServerSecurityConfigDefault.notifIfDisabled) &&
        Objects.equals(this.binding, lwM2MServerSecurityConfigDefault.binding) &&
        Objects.equals(this.securityHost, lwM2MServerSecurityConfigDefault.securityHost) &&
        Objects.equals(this.securityPort, lwM2MServerSecurityConfigDefault.securityPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shortServerId, bootstrapServerIs, host, port, clientHoldOffTime, serverPublicKey, serverCertificate, bootstrapServerAccountTimeout, lifetime, defaultMinPeriod, notifIfDisabled, binding, securityHost, securityPort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LwM2MServerSecurityConfigDefault {\n");
    sb.append("    shortServerId: ").append(toIndentedString(shortServerId)).append("\n");
    sb.append("    bootstrapServerIs: ").append(toIndentedString(bootstrapServerIs)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    clientHoldOffTime: ").append(toIndentedString(clientHoldOffTime)).append("\n");
    sb.append("    serverPublicKey: ").append(toIndentedString(serverPublicKey)).append("\n");
    sb.append("    serverCertificate: ").append(toIndentedString(serverCertificate)).append("\n");
    sb.append("    bootstrapServerAccountTimeout: ").append(toIndentedString(bootstrapServerAccountTimeout)).append("\n");
    sb.append("    lifetime: ").append(toIndentedString(lifetime)).append("\n");
    sb.append("    defaultMinPeriod: ").append(toIndentedString(defaultMinPeriod)).append("\n");
    sb.append("    notifIfDisabled: ").append(toIndentedString(notifIfDisabled)).append("\n");
    sb.append("    binding: ").append(toIndentedString(binding)).append("\n");
    sb.append("    securityHost: ").append(toIndentedString(securityHost)).append("\n");
    sb.append("    securityPort: ").append(toIndentedString(securityPort)).append("\n");
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

    // add `shortServerId` to the URL query string
    if (getShortServerId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshortServerId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShortServerId()))));
    }

    // add `bootstrapServerIs` to the URL query string
    if (getBootstrapServerIs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbootstrapServerIs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBootstrapServerIs()))));
    }

    // add `host` to the URL query string
    if (getHost() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%shost%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHost()))));
    }

    // add `port` to the URL query string
    if (getPort() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sport%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPort()))));
    }

    // add `clientHoldOffTime` to the URL query string
    if (getClientHoldOffTime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sclientHoldOffTime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getClientHoldOffTime()))));
    }

    // add `serverPublicKey` to the URL query string
    if (getServerPublicKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sserverPublicKey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getServerPublicKey()))));
    }

    // add `serverCertificate` to the URL query string
    if (getServerCertificate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sserverCertificate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getServerCertificate()))));
    }

    // add `bootstrapServerAccountTimeout` to the URL query string
    if (getBootstrapServerAccountTimeout() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbootstrapServerAccountTimeout%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBootstrapServerAccountTimeout()))));
    }

    // add `lifetime` to the URL query string
    if (getLifetime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slifetime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLifetime()))));
    }

    // add `defaultMinPeriod` to the URL query string
    if (getDefaultMinPeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdefaultMinPeriod%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDefaultMinPeriod()))));
    }

    // add `notifIfDisabled` to the URL query string
    if (getNotifIfDisabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snotifIfDisabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNotifIfDisabled()))));
    }

    // add `binding` to the URL query string
    if (getBinding() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbinding%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBinding()))));
    }

    // add `securityHost` to the URL query string
    if (getSecurityHost() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssecurityHost%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSecurityHost()))));
    }

    // add `securityPort` to the URL query string
    if (getSecurityPort() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssecurityPort%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSecurityPort()))));
    }

    return joiner.toString();
  }
}

