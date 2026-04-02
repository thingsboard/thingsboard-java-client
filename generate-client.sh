#!/bin/bash
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

#
# Generates Java REST clients from OpenAPI specs using openapi-generator-cli.
#
# Usage:
#   ./generate-client.sh [options] <edition> [base-url]
#
# Arguments:
#   edition    ce | pe | paas | all
#   base-url   Optional. Fetches spec from <base-url>/v3/api-docs/thingsboard
#              and updates the local spec file before generation.
#              Not supported with "all".
#
# Options:
#   --verbose  Show full generator output (per-file writes, operations, etc.)
#   --dry-run  Generate into target/generated/ only. Skip copying to src/docs,
#              license formatting, and git staging.
#
# Examples:
#   ./generate-client.sh ce                           # Generate CE from local spec
#   ./generate-client.sh all                          # Generate all editions from local specs
#   ./generate-client.sh ce http://localhost:8080      # Fetch spec from local TB, then generate
#   ./generate-client.sh --dry-run ce                  # Generate to target/ only, don't touch src/
#   ./generate-client.sh --verbose ce                  # Full output, no log filtering
#
# What it does:
#   1. Optionally fetches OpenAPI spec from a running ThingsBoard instance
#   2. Runs openapi-generator-cli (Java native HTTP client)
#   3. Strips auto-generated OpenAPI comment blocks from Java files
#   4. Copies generated src/main/java/ and docs/ into the module (replaces previous)
#   4b. Copies common/src/main/java/ and common/docs/ on top
#   5. Applies Apache 2.0 license headers via mvn license:format
#   6. Stages all changes with git add
#
# Preserved on regeneration:
#   - <edition>/pom.xml
#   - <edition>/src/test/  (tests are never touched)
#   - <edition>/spec/openapi.json  (only updated when base-url is provided)
#
# Replaced on regeneration:
#   - <edition>/src/main/java/
#   - <edition>/docs/  (with common/docs/ overlaid on top)
#
# Output log: generate-client.log (overwritten on each run)
#
# Prerequisites: Java 25, Maven, Perl (Node.js/npm optional — JAR fallback used if absent)
#

set -euo pipefail

SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
EDITIONS=("ce" "pe" "paas")
BASE_PACKAGE="org.thingsboard.client"

VERBOSE=false
DRY_RUN=false
while [ $# -gt 0 ]; do
  case "$1" in
    --verbose) VERBOSE=true; shift ;;
    --dry-run) DRY_RUN=true; shift ;;
    -*) echo "Unknown option: $1"; exit 1 ;;
    *) break ;;
  esac
done

if [ $# -eq 0 ]; then
  echo "Usage: $0 [--verbose] [--dry-run] <edition> [base-url]"
  echo "  edition: ce | pe | paas | all"
  echo "  base-url: optional, fetches spec from <base-url>/v3/api-docs/thingsboard"
  exit 1
fi

EDITION="$1"
BASE_URL="${2:-}"
LOG_FILE="$SCRIPT_DIR/generate-client.log"

# Log everything to file and stdout
exec > >(tee "$LOG_FILE") 2>&1

OPENAPI_GENERATOR_VERSION="7.20.0"
GENERATOR_CACHE_DIR="${OPENAPI_GENERATOR_CACHE_DIR:-${HOME}/.cache/openapi-generator}"
GENERATOR_JAR="$GENERATOR_CACHE_DIR/openapi-generator-cli-${OPENAPI_GENERATOR_VERSION}.jar"

if [ ! -f "$GENERATOR_JAR" ]; then
  echo "Downloading openapi-generator-cli ${OPENAPI_GENERATOR_VERSION}..."
  mkdir -p "$GENERATOR_CACHE_DIR"
  curl -fSL -o "$GENERATOR_JAR" \
    "https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/${OPENAPI_GENERATOR_VERSION}/openapi-generator-cli-${OPENAPI_GENERATOR_VERSION}.jar"
fi
openapi-generator-cli() { java -jar "$GENERATOR_JAR" "$@"; }

generate() {
  local edition="$1"
  local spec_file="$SCRIPT_DIR/$edition/spec/openapi.json"
  local output_dir="$SCRIPT_DIR/$edition/target/generated"
  local module_dir="$SCRIPT_DIR/$edition"

  if [ -n "$BASE_URL" ]; then
    local api_url="$BASE_URL/v3/api-docs/thingsboard"
    echo "Fetching spec for $edition from $api_url"
    mkdir -p "$(dirname "$spec_file")"
    curl -sf "$api_url" -o "$spec_file" || { echo "Error: failed to fetch spec from $api_url"; exit 1; }
  fi

  if [ ! -f "$spec_file" ]; then
    echo "Error: spec file not found: $spec_file"
    exit 1
  fi

  local docs_output_dir="$SCRIPT_DIR/$edition/target/generated-docs"

  rm -rf "$output_dir" "$docs_output_dir"

  JACKSON_JSON_NODE="com.fasterxml.jackson.databind.JsonNode"

  echo "Validating spec: $spec_file"
  local validate_output
  validate_output=$(openapi-generator-cli validate -i "$spec_file" 2>&1) || {
    echo "$validate_output" | grep -v "Unused model:"
    exit 1
  }

  # Detect duplicate operationIds (ThingsBoard's spec generator appends _1, _2, etc.)
  local duplicates
  duplicates=$(grep -o '"operationId" *: *"[^"]*"' "$spec_file" | sed 's/.*: *"//;s/"//' | grep -E '_[0-9]+$' || true)
  if [ -n "$duplicates" ]; then
    echo "Error: spec contains duplicate operationIds (suffixed by ThingsBoard):"
    echo "$duplicates" | sed 's/^/  /'
    echo "Fix the @ApiOperation annotations in ThingsBoard source to use unique names."
    exit 1
  fi

  # Run 1 — Java client (single class, no docs)
  echo "Generating client for edition: $edition from $spec_file"
  openapi-generator-cli generate \
    -i "$spec_file" \
    -g java \
    --library=native \
    -o "$output_dir" \
    --api-package "$BASE_PACKAGE.api" \
    --model-package "$BASE_PACKAGE.model" \
    --invoker-package "$BASE_PACKAGE" \
    --additional-properties hideGenerationTimestamp=true \
    --global-property apiTests=false,modelTests=false,modelDocs=false,apiDocs=false \
    --schema-mappings  JsonNode="$JACKSON_JSON_NODE" \
    --import-mappings  JsonNode="$JACKSON_JSON_NODE" \
    --openapi-normalizer SET_TAGS_FOR_ALL_OPERATIONS=Thingsboard \
    -t "$SCRIPT_DIR/openapi" \
    2>&1 | if [ "$VERBOSE" = true ]; then cat; else grep -v -e "^\[main\] INFO  o.o.codegen.*writing file" -e "^\[main\] INFO  o.o.c.languages.*Processing operation" -e "Unknown scheme.*loginPassword" -e "Skipped by.*options supplied by user"; fi

  # Run 2 — Per-controller docs only (preserves original tags)
  echo "Generating per-controller docs for edition: $edition"
  openapi-generator-cli generate \
    -i "$spec_file" \
    -g java \
    --library=native \
    -o "$docs_output_dir" \
    --api-package "$BASE_PACKAGE.api" \
    --model-package "$BASE_PACKAGE.model" \
    --invoker-package "$BASE_PACKAGE" \
    --additional-properties hideGenerationTimestamp=true \
    --global-property apis,models,supportingFiles=false,apiTests=false,modelTests=false \
    --schema-mappings  JsonNode="$JACKSON_JSON_NODE" \
    --import-mappings  JsonNode="$JACKSON_JSON_NODE" \
    -t "$SCRIPT_DIR/openapi" \
    2>&1 | if [ "$VERBOSE" = true ]; then cat; else grep -v -e "^\[main\] INFO  o.o.codegen.*writing file" -e "^\[main\] INFO  o.o.c.languages.*Processing operation" -e "Unknown scheme.*loginPassword" -e "Skipped by.*options supplied by user"; fi

  # Post-process all generated Java files:
  #  - strip OpenAPI comment block
  #  - shorten fully-qualified javax.annotation annotations and add imports
  find "$output_dir/src" -name "*.java" -exec perl -i -0pe '
    s|/\*\n \* ThingsBoard REST API.*?\*/\n+||s;
    s/\@javax\.annotation\.(Nonnull|Nullable|Generated)/\@$1/g;
    my @n;
    push @n, "import javax.annotation.Generated;" if /\@Generated/ && !/import javax\.annotation\.Generated/;
    push @n, "import javax.annotation.Nonnull;" if /\@Nonnull/ && !/import javax\.annotation\.Nonnull/;
    push @n, "import javax.annotation.Nullable;" if /\@Nullable/ && !/import javax\.annotation\.Nullable/;
    if (@n) { my $b = join("\n", @n) . "\n"; s/^(import )/$b$1/m || s/(^package [^;]+;\n)/$1$b/m; }
  ' {} +

  # API class only: remove all blank lines, then restore one between methods,
  # before constructors, and before the class annotation
  find "$output_dir/src" -path "*/api/ThingsboardApi.java" -exec perl -i -0pe '
    s/\n{2,}/\n/g;
    s/\}\n(  (?:\/\*\*|private |public |protected ))/}\n\n$1/g;
    s/;\n(  public )/;\n\n$1/g;
    s/;\n(\@Generated)/;\n\n$1/g;
  ' {} +

  # Make ApiException unchecked (extend RuntimeException instead of Exception)
  perl -i -pe 's/extends Exception/extends RuntimeException/' "$output_dir/src/main/java/org/thingsboard/client/ApiException.java"

  if [ "$DRY_RUN" = true ]; then
    echo "Dry run: generated client is in $output_dir"
    echo "Dry run: generated docs are in $docs_output_dir"
  else
    # Copy generated sources into the module
    rm -rf "$module_dir/src/main/java"
    mkdir -p "$module_dir/src/main/java"
    cp -r "$output_dir/src/main/java/"* "$module_dir/src/main/java/"
    echo "Copied src to $module_dir"

    # Copy common sources (ThingsboardClient, etc.)
    local common_src="$SCRIPT_DIR/common/src/main/java"
    if [ -d "$common_src" ]; then
      cp -r "$common_src/"* "$module_dir/src/main/java/"
      echo "Copied common sources to $module_dir"
    fi

    # Copy per-controller docs into the module
    rm -rf "$module_dir/docs"
    cp -r "$docs_output_dir/docs" "$module_dir/docs"
    echo "Copied docs to $module_dir"

    # Copy common docs (tb-examples.md, etc.)
    local common_docs="$SCRIPT_DIR/common/docs"
    if [ -d "$common_docs" ]; then
      cp -r "$common_docs/"* "$module_dir/docs/"
      echo "Copied common docs to $module_dir"
    fi
  fi
}

if [ "$EDITION" = "all" ]; then
  if [ -n "$BASE_URL" ]; then
    echo "Error: base-url is not supported with 'all'. Run per edition instead."
    exit 1
  fi
  for e in "${EDITIONS[@]}"; do
    generate "$e"
  done
else
  if [[ ! " ${EDITIONS[*]} " =~ " ${EDITION} " ]]; then
    echo "Error: unknown edition '$EDITION'. Must be one of: ${EDITIONS[*]} all"
    exit 1
  fi
  generate "$EDITION"
fi

if [ "$DRY_RUN" = false ]; then
  # Flatten model docs (inline referenced types for self-contained reading)
  if command -v python3 >/dev/null 2>&1; then
    if [ "$EDITION" = "all" ]; then
      for e in "${EDITIONS[@]}"; do
        echo "Flattening docs for $e..."
        python3 "$SCRIPT_DIR/scripts/flatten_docs.py" "$SCRIPT_DIR/$e/docs"
      done
    else
      echo "Flattening docs for $EDITION..."
      python3 "$SCRIPT_DIR/scripts/flatten_docs.py" "$SCRIPT_DIR/$EDITION/docs"
    fi
  else
    echo "Warning: python3 not found — skipping docs flattening"
  fi

  # Resolve mvn: prefer M2_HOME/MAVEN_HOME, fall back to PATH
  if [ -n "${M2_HOME:-}" ] && [ -x "$M2_HOME/bin/mvn" ]; then
    MVN="$M2_HOME/bin/mvn"
  elif [ -n "${MAVEN_HOME:-}" ] && [ -x "$MAVEN_HOME/bin/mvn" ]; then
    MVN="$MAVEN_HOME/bin/mvn"
  elif command -v mvn >/dev/null 2>&1; then
    MVN="mvn"
  else
    echo "Error: mvn not found. Set M2_HOME or MAVEN_HOME, or add mvn to PATH."
    exit 1
  fi

  # Apply license headers and stage changes
  if [ "$VERBOSE" = true ]; then
    "$MVN" -f "$SCRIPT_DIR/pom.xml" license:format
  else
    "$MVN" -f "$SCRIPT_DIR/pom.xml" license:format -q
  fi
  git -C "$SCRIPT_DIR" add .
fi
