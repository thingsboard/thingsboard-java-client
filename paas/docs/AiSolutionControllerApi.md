# AiSolutionControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
com.fasterxml.jackson.databind.JsonNode chat(ChatArgs args) // chat
void clearStep(ClearStepArgs args) // clearStep
com.fasterxml.jackson.databind.JsonNode createSolution(CreateSolutionArgs args) // createSolution
void deleteSolution(DeleteSolutionArgs args) // deleteSolution
com.fasterxml.jackson.databind.JsonNode getSolution(GetSolutionArgs args) // getSolution
com.fasterxml.jackson.databind.JsonNode getSolutions() // getSolutions
com.fasterxml.jackson.databind.JsonNode installSolution(InstallSolutionArgs args) // installSolution
com.fasterxml.jackson.databind.JsonNode startNew() // startNew
com.fasterxml.jackson.databind.JsonNode uninstallSolution(UninstallSolutionArgs args) // uninstallSolution
com.fasterxml.jackson.databind.JsonNode updateData(UpdateDataArgs args) // updateData
```


## chat

**POST** `/api/ai/solution/{solutionId}/{step}/chat`

chat

```java
com.fasterxml.jackson.databind.JsonNode chat(ChatArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ChatArgs.builder()
        .solutionId(UUID)
        .step(SolutionStep)
        .body(String)
        .build()
```

### `ChatArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `solutionId` | `UUID` | **yes** |  | |
| `step` | `SolutionStep` | **yes** |  | enum: `INITIAL_CONFIGURATION`, `DASHBOARDS_CONFIGURATION` |
| `body` | `String` | **yes** |  | |

### Return type

`com.fasterxml.jackson.databind.JsonNode`


## clearStep

**DELETE** `/api/ai/solution/{solutionId}/{step}/clear`

clearStep

```java
void clearStep(ClearStepArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ClearStepArgs.builder()
        .solutionId(UUID)
        .step(SolutionStep)
        .build()
```

### `ClearStepArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `solutionId` | `UUID` | **yes** |  | |
| `step` | `SolutionStep` | **yes** |  | enum: `INITIAL_CONFIGURATION`, `DASHBOARDS_CONFIGURATION` |

### Return type

null (empty response body)


## createSolution

**POST** `/api/ai/solution/{solutionId}/create`

createSolution

```java
com.fasterxml.jackson.databind.JsonNode createSolution(CreateSolutionArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
CreateSolutionArgs.builder()
        .solutionId(UUID)
        .build()
```

### `CreateSolutionArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `solutionId` | `UUID` | **yes** |  | |

### Return type

`com.fasterxml.jackson.databind.JsonNode`


## deleteSolution

**DELETE** `/api/ai/solution/{solutionId}`

deleteSolution

```java
void deleteSolution(DeleteSolutionArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteSolutionArgs.builder()
        .solutionId(UUID)
        .build()
```

### `DeleteSolutionArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `solutionId` | `UUID` | **yes** |  | |

### Return type

null (empty response body)


## getSolution

**GET** `/api/ai/solution/{solutionId}`

getSolution

```java
com.fasterxml.jackson.databind.JsonNode getSolution(GetSolutionArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetSolutionArgs.builder()
        .solutionId(UUID)
        .build()
```

### `GetSolutionArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `solutionId` | `UUID` | **yes** |  | |

### Return type

`com.fasterxml.jackson.databind.JsonNode`


## getSolutions

**GET** `/api/ai/solution/infos`

getSolutions

```java
com.fasterxml.jackson.databind.JsonNode getSolutions()
```

### Return type

`com.fasterxml.jackson.databind.JsonNode`


## installSolution

**POST** `/api/ai/solution/{solutionId}/install`

installSolution

```java
com.fasterxml.jackson.databind.JsonNode installSolution(InstallSolutionArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
InstallSolutionArgs.builder()
        .solutionId(UUID)
        .xAuthorization(String)
        .build()
```

### `InstallSolutionArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `solutionId` | `UUID` | **yes** |  | |
| `xAuthorization` | `String` | **yes** |  | |

### Return type

`com.fasterxml.jackson.databind.JsonNode`


## startNew

**POST** `/api/ai/solution/start`

startNew

```java
com.fasterxml.jackson.databind.JsonNode startNew()
```

### Return type

`com.fasterxml.jackson.databind.JsonNode`


## uninstallSolution

**DELETE** `/api/ai/solution/{solutionId}/uninstall`

uninstallSolution

```java
com.fasterxml.jackson.databind.JsonNode uninstallSolution(UninstallSolutionArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UninstallSolutionArgs.builder()
        .solutionId(UUID)
        .xAuthorization(String)
        .build()
```

### `UninstallSolutionArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `solutionId` | `UUID` | **yes** |  | |
| `xAuthorization` | `String` | **yes** |  | |

### Return type

`com.fasterxml.jackson.databind.JsonNode`


## updateData

**PUT** `/api/ai/solution/{solutionId}/{dataKey}`

updateData

```java
com.fasterxml.jackson.databind.JsonNode updateData(UpdateDataArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UpdateDataArgs.builder()
        .solutionId(UUID)
        .dataKey(String)
        .body(Object)
        .build()
```

### `UpdateDataArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `solutionId` | `UUID` | **yes** |  | |
| `dataKey` | `String` | **yes** |  | |
| `body` | `Object` | **yes** |  | |

### Return type

`com.fasterxml.jackson.databind.JsonNode`

