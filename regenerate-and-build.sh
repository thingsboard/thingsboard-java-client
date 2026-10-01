#
# SPDX-FileCopyrightText: Copyright ThingsBoard, Inc.
# SPDX-License-Identifier: Apache-2.0
#

set -e

bash generate-client.sh all
mvn clean install -DskipTests -T3
