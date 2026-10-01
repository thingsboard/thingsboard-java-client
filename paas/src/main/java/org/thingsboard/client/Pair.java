// SPDX-FileCopyrightText: Copyright ThingsBoard, Inc.
// SPDX-License-Identifier: Apache-2.0
package org.thingsboard.client;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class Pair {
  private final String name;
  private final String value;

  public Pair(String name, String value) {
    this.name = isValidString(name) ? name : "";
    this.value = isValidString(value) ? value : "";
  }

  public String getName() {
    return this.name;
  }

  public String getValue() {
    return this.value;
  }

  private static boolean isValidString(String arg) {
    return arg != null;
  }
}
