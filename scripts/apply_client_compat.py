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

  subtypes
      {child: parent} for classes that extend another class on the server
      while the spec describes them as two unrelated schemas, e.g. AlarmInfo
      and Alarm. The child becomes allOf [parent, its own properties] and the
      parent gets x-parent, so the generated child extends the parent, and a
      method that now returns AlarmInfo stays assignable to Alarm. The spec
      itself stays flat because other generators (e.g. dart-dio) turn an
      allOf parent into an abstract interface. A child is rewritten only if
      it has every parent property with the same definition.

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


def make_subtypes(spec, subtypes):
    schemas = spec.get("components", {}).get("schemas", {})
    made = 0
    for child_name, parent_name in subtypes.items():
        child = schemas.get(child_name)
        parent = schemas.get(parent_name)
        if child is None or parent is None or "allOf" in child:
            continue
        child_props = child.get("properties", {})
        parent_props = parent.get("properties", {})
        if any(child_props.get(p) != s for p, s in parent_props.items()):
            continue
        # readOnly properties stay in the child: openapi-generator 7.20 cannot
        # inherit them (the child would assign the parent's private fields)
        own = {p: s for p, s in child_props.items() if p not in parent_props or s.get("readOnly")}
        part = {"type": "object", "properties": own}
        required = [r for r in child.get("required", []) if r in own]
        if required:
            part["required"] = required
        rewritten = {"allOf": [{"$ref": "#/components/schemas/" + parent_name}, part]}
        if "description" in child:
            rewritten["description"] = child["description"]
        schemas[child_name] = rewritten
        parent["x-parent"] = True
        made += 1
    return made


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

    subtypes = make_subtypes(spec, config.get("subtypes", {}))
    params = mark_legacy_string_params(spec, config.get("legacyStringParams", {}))

    with open(spec_out, "w", encoding="utf-8") as f:
        json.dump(spec, f, indent=2, ensure_ascii=False)
    print(f"Client compat: {subtypes} subtype(s), {params} legacy String parameter(s) -> {spec_out}")


if __name__ == "__main__":
    main()
