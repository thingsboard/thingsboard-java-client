#!/usr/bin/env bash
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
