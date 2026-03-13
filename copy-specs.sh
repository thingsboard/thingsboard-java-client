#!/usr/bin/env bash
set -euo pipefail

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
EDITIONS=(ce pe paas)
TARGETS=(
  "$SCRIPT_DIR/../thingsboard-python-client"
  "$SCRIPT_DIR/../thingsboard-dart-client"
)

for target in "${TARGETS[@]}"; do
  for edition in "${EDITIONS[@]}"; do
    src="$SCRIPT_DIR/$edition/spec/openapi.json"
    dst="$target/$edition/spec/openapi.json"
    cp "$src" "$dst"
    echo "Copied $edition/spec/openapi.json -> $(basename "$target")/$edition/spec/openapi.json"
  done
done
