# ThingsBoard Java REST Clients

Auto-generated Java REST clients for ThingsBoard, built from OpenAPI specifications using [OpenAPI Generator](https://openapi-generator.tech/).

## Modules

| Module | Artifact | Description |
|--------|----------|-------------|
| `ce` | `thingsboard-ce-client` | Community Edition REST client |
| `pe` | `thingsboard-pe-client` | Professional Edition REST client |
| `paas` | `thingsboard-paas-client` | Cloud (PaaS) REST client |

All modules share the same `org.thingsboard.client` group ID and use the `org.thingsboard.client.api` / `org.thingsboard.client.model` packages.

## Maven Coordinates

```xml
<dependency>
    <groupId>org.thingsboard.client</groupId>
    <artifactId>thingsboard-ce-client</artifactId>
    <version>4.4.0-SNAPSHOT</version>
</dependency>
```

Replace `thingsboard-ce-client` with `thingsboard-pe-client` or `thingsboard-paas-client` for other editions.

## Usage

### JWT Authentication

```java
import org.thingsboard.client.ThingsboardClient;

// Credentials — logs in automatically, refreshes tokens before expiry
ThingsboardClient client = ThingsboardClient.builder()
        .url("http://localhost:8080")
        .credentials("tenant@thingsboard.org", "tenant")
        .build();

var devices = client.getTenantDevices(10, 0, null, null, null, null);
```

### API Key Authentication

```java
ThingsboardClient client = ThingsboardClient.builder()
        .url("http://localhost:8080")
        .apiKey("your-api-key")
        .build();

var devices = client.getTenantDevices(10, 0, null, null, null, null);
```

### Deferred Login

```java
ThingsboardClient client = ThingsboardClient.builder()
        .url("http://localhost:8080")
        .build();

client.login("tenant@thingsboard.org", "tenant");
```

## Project Structure

```
thingsboard-java-client/
├── pom.xml                          # Parent POM
├── generate-client.sh               # Client generation script
├── openapitools.json                # OpenAPI Generator version config
├── license-header-template.txt      # License header for generated files
├── common/
│   ├── pom.xml                      # Compiles against CE for IDE support
│   └── src/main/java/               # Handwritten shared code (ThingsboardClient, etc.)
├── ce/
│   ├── pom.xml
│   ├── spec/openapi.json            # OpenAPI spec (committed)
│   ├── src/main/java/               # Generated + common sources (committed)
│   └── target/generated/            # Raw generator output (gitignored)
├── pe/
│   └── (same structure as ce)
└── paas/
    └── (same structure as ce)
```

The `common/` module contains handwritten classes shared across all editions (e.g. `ThingsboardClient`).
It is not a runtime dependency — `generate-client.sh` copies its sources into each edition during generation.

## Client Generation

Clients are generated from OpenAPI specification files located at `<edition>/spec/openapi.json`. 
The `generate-client.sh` script handles the full workflow: generate, post-process, apply license headers, and stage changes.

### Prerequisites

- Node.js / npm (for `openapi-generator-cli`)
- Java 25
- Maven
- Perl (for post-processing)

The script will auto-install `openapi-generator-cli` via npm if not found.

```
Usage: ./generate-client.sh [options] <edition> [base-url]

Arguments:
  edition    ce | pe | paas | all
  base-url   Optional. Fetches spec from <base-url>/v3/api-docs/thingsboard
             and updates the local spec file before generation.
             Not supported with "all".

Options:
  --verbose  Show full generator output (per-file writes, operations, etc.)
  --dry-run  Generate into target/generated/ only. Skip copying to src/,
             license formatting, and git staging.
```

### Examples

```bash
./generate-client.sh ce                            # Generate CE from local spec
./generate-client.sh all                           # Generate all editions from local specs
./generate-client.sh ce http://localhost:8080       # Fetch spec from a running TB, then generate
./generate-client.sh --dry-run ce                   # Generate to target/ only, don't touch src/
./generate-client.sh --verbose ce                   # Full output, no log filtering
```

### What it does

1. Optionally fetches OpenAPI spec from a running ThingsBoard instance
2. Runs `openapi-generator-cli` (Java native HTTP client)
3. Strips auto-generated OpenAPI comment blocks from Java files
4. Copies generated `src/main/java/` into the module, then copies `common/` sources on top
5. Applies Apache 2.0 license headers via `mvn license:format`
6. Stages all changes with `git add`

### Preserved on regeneration

- `<edition>/pom.xml`
- `<edition>/src/test/` (tests are never touched)
- `<edition>/spec/openapi.json` (only updated when `base-url` is provided)
- `common/` (handwritten shared sources, copied into editions)

### Replaced on regeneration

- `<edition>/src/main/java/`

Output log: `generate-client.log` (overwritten on each run)
