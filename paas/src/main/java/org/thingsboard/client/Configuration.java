// SPDX-FileCopyrightText: Copyright ThingsBoard, Inc.
// SPDX-License-Identifier: Apache-2.0
package org.thingsboard.client;

import javax.annotation.Generated;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class Configuration {
  public static final String VERSION = "4.4.0PAAS";

  private static final AtomicReference<ApiClient> defaultApiClient = new AtomicReference<>();
  private static volatile Supplier<ApiClient> apiClientFactory = ApiClient::new;

  /**
   * Get the default API client, which would be used when creating API instances without providing an API client.
   *
   * @return Default API client
   */
  public static ApiClient getDefaultApiClient() {
    ApiClient client = defaultApiClient.get();
    if (client == null) {
      client = defaultApiClient.updateAndGet(val -> {
        if (val != null) { // changed by another thread
          return val;
        }
        return apiClientFactory.get();
      });
    }
    return client;
  }

  /**
   * Set the default API client, which would be used when creating API instances without providing an API client.
   *
   * @param apiClient API client
   */
  public static void setDefaultApiClient(ApiClient apiClient) {
    defaultApiClient.set(apiClient);
  }

  /**
   * set the callback used to create new ApiClient objects
   */
  public static void setApiClientFactory(Supplier<ApiClient> factory) {
    apiClientFactory = Objects.requireNonNull(factory);
  }

  private Configuration() {
  }
}