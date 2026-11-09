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
      allOf parent into an abstract interface.

  legacyStringParams
      {operationId: [parameter names]} that earlier spec versions documented
      as strings and the spec now documents as int32 integers. They get
      x-legacy-string, and their operation x-legacy-string-params, so
      api.mustache generates deprecated String overloads that delegate to the
      Integer ones. A parameter that is still a string is counted as pending.

The script fails, naming the config entry, when the spec no longer matches the
config, so that a spec change cannot silently drop a compatibility overload:
  - a subtype child or parent schema is missing;
  - the child does not have every parent property with the same definition;
  - the child already uses allOf in a shape other than the one this script
    produces (re-running the script on its own output is accepted);
  - an operationId is not in the spec, or a listed parameter is not a query
    parameter of that operation, or is neither a string nor an int32 integer.

Usage: apply_client_compat.py [--edition <label>] <client-compat.json> <spec-in> <spec-out>
"""

import argparse
import json
import sys

SCHEMA_REF = "#/components/schemas/"


class CompatError(Exception):
    pass


def own_part(child_props, parent_props, required):
    # readOnly properties stay in the child: openapi-generator 7.20 cannot
    # inherit them (the child would assign the parent's private fields)
    own = {p: s for p, s in child_props.items() if p not in parent_props or s.get("readOnly")}
    part = {"type": "object", "properties": own}
    required = [r for r in required if r in own]
    if required:
        part["required"] = required
    return part


def check_rewritten(child_name, child, parent_name, parent_props):
    """Accept a child that already has the shape make_subtypes produces."""
    all_of = child["allOf"]
    if (len(all_of) != 2 or all_of[0] != {"$ref": SCHEMA_REF + parent_name}
            or not isinstance(all_of[1], dict) or "$ref" in all_of[1] or "allOf" in all_of[1]):
        raise CompatError(f"subtypes.{child_name}: the spec already defines {child_name} with allOf, "
                          f"not as [{parent_name}, own properties]; check the server spec and update "
                          f"openapi/client-compat.json")
    own_props = all_of[1].get("properties", {})
    inherited = [p for p, s in own_props.items() if p in parent_props and not s.get("readOnly")]
    differing = [p for p, s in own_props.items() if p in parent_props and s.get("readOnly") and parent_props[p] != s]
    if inherited or differing:
        raise CompatError(f"subtypes.{child_name}: allOf part repeats {parent_name} properties: "
                          f"{', '.join(sorted(inherited + differing))}")


def make_subtypes(spec, subtypes):
    schemas = spec.get("components", {}).get("schemas", {})
    made = []
    for child_name, parent_name in subtypes.items():
        child = schemas.get(child_name)
        parent = schemas.get(parent_name)
        missing = [n for n, s in ((child_name, child), (parent_name, parent)) if s is None]
        if missing:
            raise CompatError(f"subtypes.{child_name}: schema not found in the spec: {', '.join(missing)}")
        parent_props = parent.get("properties", {})
        if "allOf" in child:
            check_rewritten(child_name, child, parent_name, parent_props)
            parent["x-parent"] = True
            made.append(f"{child_name} -> {parent_name}")
            continue
        child_props = child.get("properties", {})
        absent = sorted(p for p in parent_props if p not in child_props)
        differing = sorted(p for p, s in parent_props.items() if p in child_props and child_props[p] != s)
        if absent or differing:
            details = []
            if absent:
                details.append(f"missing in {child_name}: {', '.join(absent)}")
            if differing:
                details.append(f"defined differently: {', '.join(differing)}")
            raise CompatError(f"subtypes.{child_name}: {child_name} does not have every {parent_name} "
                              f"property with the same definition ({'; '.join(details)})")
        rewritten = {"allOf": [{"$ref": SCHEMA_REF + parent_name},
                               own_part(child_props, parent_props, child.get("required", []))]}
        if "description" in child:
            rewritten["description"] = child["description"]
        schemas[child_name] = rewritten
        parent["x-parent"] = True
        made.append(f"{child_name} -> {parent_name}")
    return made


def operations_by_id(spec):
    operations = {}
    for path_item in spec.get("paths", {}).values():
        for operation in path_item.values():
            if isinstance(operation, dict) and "operationId" in operation:
                operations[operation["operationId"]] = operation
    return operations


def mark_legacy_string_params(spec, legacy):
    operations = operations_by_id(spec)
    errors = []
    found = marked = pending = total = 0
    for operation_id, names in legacy.items():
        total += len(names)
        operation = operations.get(operation_id)
        if operation is None:
            errors.append(f"legacyStringParams.{operation_id}: operation not found in the spec")
            continue
        found += 1
        query = {p.get("name"): p for p in operation.get("parameters", []) if p.get("in") == "query"}
        for name in names:
            param = query.get(name)
            if param is None:
                errors.append(f"legacyStringParams.{operation_id}: {name} is not a query parameter of the operation")
                continue
            schema = param.get("schema", {})
            if schema.get("type") == "integer" and schema.get("format") == "int32":
                param["x-legacy-string"] = True
                operation["x-legacy-string-params"] = True
                marked += 1
            elif schema.get("type") == "string":
                pending += 1
            else:
                errors.append(f"legacyStringParams.{operation_id}: {name} is documented as "
                              f"{json.dumps(schema)}, expected an int32 integer (or a string until the spec is updated)")
    if errors:
        raise CompatError("\n".join(errors))
    return found, marked, pending, total


def main():
    parser = argparse.ArgumentParser(description="Copy the spec with vendor extensions that keep the Java client backward compatible.")
    parser.add_argument("--edition", default="", help="label for the summary line, e.g. pe")
    parser.add_argument("config")
    parser.add_argument("spec_in")
    parser.add_argument("spec_out")
    args = parser.parse_args()

    with open(args.config, encoding="utf-8") as f:
        config = json.load(f)
    with open(args.spec_in, encoding="utf-8") as f:
        spec = json.load(f)

    label = f" ({args.edition})" if args.edition else ""
    legacy = config.get("legacyStringParams", {})
    errors = []
    subtypes = []
    params = (0, 0, 0, 0)
    try:
        subtypes = make_subtypes(spec, config.get("subtypes", {}))
    except CompatError as e:
        errors.append(str(e))
    try:
        params = mark_legacy_string_params(spec, legacy)
    except CompatError as e:
        errors.append(str(e))
    if errors:
        print(f"Error: {args.spec_in} does not match {args.config}{label}:", file=sys.stderr)
        for error in "\n".join(errors).splitlines():
            print(f"  {error}", file=sys.stderr)
        sys.exit(1)

    with open(args.spec_out, "w", encoding="utf-8") as f:
        json.dump(spec, f, indent=2, ensure_ascii=False)
    found, marked, pending, total = params
    print(f"Client compat{label}: {', '.join(subtypes) or 'no subtypes'}; "
          f"{found}/{len(legacy)} operations, {marked}/{total} params marked, "
          f"{pending} pending (still string) -> {args.spec_out}")


if __name__ == "__main__":
    main()
