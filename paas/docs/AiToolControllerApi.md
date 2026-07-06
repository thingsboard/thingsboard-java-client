# AiToolControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
com.fasterxml.jackson.databind.JsonNode resolveToolApproval(ResolveToolApprovalArgs args) // resolveToolApproval
```


## resolveToolApproval

**POST** `/api/ai/tools/resolve-approval`

resolveToolApproval

```java
com.fasterxml.jackson.databind.JsonNode resolveToolApproval(ResolveToolApprovalArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ResolveToolApprovalArgs.builder()
        .body(Object)
        .build()
```

### `ResolveToolApprovalArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `body` | `Object` | **yes** |  | |

### Return type

`com.fasterxml.jackson.databind.JsonNode`

