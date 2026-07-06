# SolutionExportImportControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
SolutionExportResponse exportSolution(ExportSolutionArgs args) // Export Solution (exportSolution)
SolutionImportResult importSolution(ImportSolutionArgs args) // Import Solution (importSolution)
SolutionValidationResult validateSolution(ValidateSolutionArgs args) // Validate Solution (validateSolution)
```


## exportSolution

**POST** `/api/solution/export`

Export Solution (exportSolution)

Exports a set of entities as a portable solution package. The request specifies entities to include via 'internalIds' (server-internal UUIDs) and/or 'externalIds' (looked up by the entity's stored externalId within the current tenant); at least one of the two collections must be non-empty, and entities reached via both sides are deduplicated. Optional export settings control inclusion of relations, attributes, and credentials. All resolved entities must belong to the current tenant. The response contains the solution data (entities grouped by type) and any dependency warnings (e.g. when an exported device profile references a rule chain that was not included in the export). The solution data can later be imported into the same or a different tenant via the import endpoint.  Available for users with 'TENANT_ADMIN' authority. Requires VERSION_CONTROL WRITE permission.

```java
SolutionExportResponse exportSolution(ExportSolutionArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ExportSolutionArgs.builder()
        .solutionExportRequest(SolutionExportRequest)
        .build()
```

### `ExportSolutionArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `solutionExportRequest` | `SolutionExportRequest` | **yes** | Export request with internal and/or external entity IDs and optional settings. | |

### Return type

`SolutionExportResponse`


## importSolution

**POST** `/api/solution/import`

Import Solution (importSolution)

Imports a solution package into the current tenant. Before importing, the endpoint checks for name conflicts with existing entities in the tenant. If name conflicts are detected, the import is rejected with HTTP 409 (Conflict). The import is transactional — if any entity fails to import, all changes are rolled back (all-or-nothing). Entities are imported in dependency order with a two-pass resolution for circular references (e.g. rule chains referencing each other).  Available for users with 'TENANT_ADMIN' authority. Requires VERSION_CONTROL WRITE permission.

```java
SolutionImportResult importSolution(ImportSolutionArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ImportSolutionArgs.builder()
        .solutionData(SolutionData)
        .build()
```

### `ImportSolutionArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `solutionData` | `SolutionData` | **yes** | Solution data exported via the export endpoint. | |

### Return type

`SolutionImportResult`


## validateSolution

**POST** `/api/solution/validate`

Validate Solution (validateSolution)

Performs a dry-run validation of a solution without modifying any data. Detects duplicate entities within the solution, identifies name conflicts with existing entities in the current tenant, and reports missing dependency references (e.g. a device profile referencing an absent rule chain). The result indicates whether the solution is safe to import (valid=true) and lists any conflicts or warnings.  Available for users with 'TENANT_ADMIN' authority. Requires VERSION_CONTROL WRITE permission.

```java
SolutionValidationResult validateSolution(ValidateSolutionArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ValidateSolutionArgs.builder()
        .solutionData(SolutionData)
        .build()
```

### `ValidateSolutionArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `solutionData` | `SolutionData` | **yes** | Solution data to validate. | |

### Return type

`SolutionValidationResult`

