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
#   - <edition>/docs/
#
# Output log: generate-client.log (overwritten on each run)
#
# Prerequisites: Node.js/npm, Java 25, Maven, Perl
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

# Initialize nvm if available
NVM_DIR="$HOME/.nvm"
if [ -s "$NVM_DIR/nvm.sh" ]; then
  . "$NVM_DIR/nvm.sh"
fi

# Ensure openapi-generator-cli is available
if ! command -v openapi-generator-cli &> /dev/null; then
  echo "openapi-generator-cli not found. Installing via npm..."

  if ! command -v npm &> /dev/null; then
    echo "Error: npm is not installed. Please install Node.js/npm first."
    exit 1
  fi

  npm install -g @openapitools/openapi-generator-cli
  echo "openapi-generator-cli installed successfully."
fi

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

  rm -rf "$output_dir"

  JACKSON_JSON_NODE="com.fasterxml.jackson.databind.JsonNode"

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
    --global-property apiTests=false,modelTests=false \
    --schema-mappings  JsonNode="$JACKSON_JSON_NODE" \
    --import-mappings  JsonNode="$JACKSON_JSON_NODE" \
    --openapi-normalizer SET_TAGS_FOR_ALL_OPERATIONS=Thingsboard \
    2>&1 | if [ "$VERBOSE" = true ]; then cat; else grep -v -e "^\[main\] INFO  o.o.codegen.*writing file" -e "^\[main\] INFO  o.o.c.languages.*Processing operation" -e "Unknown scheme.*loginPassword"; fi

  # Strip generated OpenAPI comment block and collapse multiple blank lines
  find "$output_dir/src" -name "*.java" -exec perl -i -0pe 's|/\*\n \* ThingsBoard REST API.*?\*/\n+||s' {} +

  if [ "$DRY_RUN" = true ]; then
    echo "Dry run: generated output is in $output_dir"
  else
    # Copy generated sources and docs into the module
    rm -rf "$module_dir/src/main/java" "$module_dir/docs"
    mkdir -p "$module_dir/src/main/java"
    cp -r "$output_dir/src/main/java/"* "$module_dir/src/main/java/"
    cp -r "$output_dir/docs" "$module_dir/"
    echo "Copied src and docs to $module_dir"

    # Copy common sources (ThingsboardClient, etc.)
    local common_src="$SCRIPT_DIR/common/src/main/java"
    if [ -d "$common_src" ]; then
      cp -r "$common_src/"* "$module_dir/src/main/java/"
      echo "Copied common sources to $module_dir"
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
  # Apply license headers and stage changes
  if [ "$VERBOSE" = true ]; then
    mvn -f "$SCRIPT_DIR/pom.xml" license:format
  else
    mvn -f "$SCRIPT_DIR/pom.xml" license:format -q
  fi
  git -C "$SCRIPT_DIR" add .
fi
