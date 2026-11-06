#!/usr/bin/env python3
#
# Copyright © 2026-2026 ThingsBoard, Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

"""Copy the spec with vendor extensions that keep the Java client backward compatible.

When ThingsBoard corrects a type in its spec, the regenerated client can stop
compiling for code written against an earlier client version. The config file
(openapi/client-compat.json) lists such cases:

  parentSchemas
      Schemas that other schemas extend through allOf without a discriminator.
      openapi-generator flattens such an allOf unless the parent has x-parent,
      so e.g. AlarmInfo would not extend Alarm, and a method that now returns
      AlarmInfo could no longer be assigned to Alarm. Properties that a child
      repeats from its parent are removed from the child.

  legacyStringParams
      {operationId: [parameter names]} that earlier spec versions documented
      as strings and the spec now documents as int32 integers. They get
      x-legacy-string, and their operation x-legacy-string-params, so
      api.mustache generates deprecated String overloads that delegate to the
      Integer ones. A parameter that is still a string is left alone.

Usage: apply_client_compat.py <client-compat.json> <spec-in> <spec-out>
"""

import json
import sys


def mark_parents(spec, names):
    schemas = spec.get("components", {}).get("schemas", {})
    marked = 0
    for name in names:
        if name in schemas:
            schemas[name]["x-parent"] = True
            marked += 1
            dedupe_children(schemas, name)
    return marked


def dedupe_children(schemas, parent_name):
    """Drop properties that a child's inline allOf part repeats from the parent.

    swagger-core writes every property of the class into the inline part, so
    without this the generated child would redeclare all parent fields.
    """
    parent = schemas[parent_name]
    parent_props = parent.get("properties", {})
    parent_ref = "#/components/schemas/" + parent_name
    for schema in schemas.values():
        all_of = schema.get("allOf") or []
        if not any(part.get("$ref") == parent_ref for part in all_of):
            continue
        for part in all_of:
            props = part.get("properties")
            if not props:
                continue
            # readOnly properties stay: openapi-generator 7.20 cannot inherit them
            # (the child would assign the parent's private fields)
            for prop in [p for p, s in props.items()
                         if parent_props.get(p) == s and not s.get("readOnly")]:
                del props[prop]
            if "required" in part:
                part["required"] = [r for r in part["required"] if r in props]
                if not part["required"]:
                    del part["required"]


def mark_legacy_string_params(spec, legacy):
    marked = 0
    for path_item in spec.get("paths", {}).values():
        for operation in path_item.values():
            if not isinstance(operation, dict):
                continue
            names = legacy.get(operation.get("operationId"))
            if not names:
                continue
            for param in operation.get("parameters", []):
                schema = param.get("schema", {})
                if (param.get("in") == "query" and param.get("name") in names
                        and schema.get("type") == "integer" and schema.get("format") == "int32"):
                    param["x-legacy-string"] = True
                    operation["x-legacy-string-params"] = True
                    marked += 1
    return marked


def main():
    if len(sys.argv) != 4:
        print(__doc__.strip().splitlines()[-1])
        sys.exit(1)
    config_file, spec_in, spec_out = sys.argv[1:]

    with open(config_file, encoding="utf-8") as f:
        config = json.load(f)
    with open(spec_in, encoding="utf-8") as f:
        spec = json.load(f)

    parents = mark_parents(spec, config.get("parentSchemas", []))
    params = mark_legacy_string_params(spec, config.get("legacyStringParams", {}))

    with open(spec_out, "w", encoding="utf-8") as f:
        json.dump(spec, f, indent=2, ensure_ascii=False)
    print(f"Client compat: {parents} parent schema(s), {params} legacy String parameter(s) -> {spec_out}")


if __name__ == "__main__":
    main()
