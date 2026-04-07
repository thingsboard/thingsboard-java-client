# AiSolutionControllerApi

`ThingsboardClient` methods:

```
com.fasterxml.jackson.databind.JsonNode chat(@Nonnull UUID solutionId, @Nonnull SolutionStep step, @Nonnull String body) // chat
void clearStep(@Nonnull UUID solutionId, @Nonnull SolutionStep step) // clearStep
com.fasterxml.jackson.databind.JsonNode createSolution(@Nonnull UUID solutionId) // createSolution
void deleteSolution(@Nonnull UUID solutionId) // deleteSolution
com.fasterxml.jackson.databind.JsonNode exportSolution(@Nonnull UUID solutionId) // exportSolution
com.fasterxml.jackson.databind.JsonNode getSolution(@Nonnull UUID solutionId) // getSolution
com.fasterxml.jackson.databind.JsonNode getSolutions() // getSolutions
com.fasterxml.jackson.databind.JsonNode importSolution(@Nonnull Object body) // importSolution
com.fasterxml.jackson.databind.JsonNode installSolution(@Nonnull UUID solutionId, @Nonnull String xAuthorization) // installSolution
com.fasterxml.jackson.databind.JsonNode startNew() // startNew
com.fasterxml.jackson.databind.JsonNode uninstallSolution(@Nonnull UUID solutionId, @Nonnull String xAuthorization) // uninstallSolution
com.fasterxml.jackson.databind.JsonNode updateData(@Nonnull UUID solutionId, @Nonnull String dataKey, @Nonnull Object body) // updateData
```


## chat

```
com.fasterxml.jackson.databind.JsonNode chat(@Nonnull UUID solutionId, @Nonnull SolutionStep step, @Nonnull String body)
```

**POST** `/api/ai/solution/{solutionId}/{step}/chat`

chat


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **solutionId** | **UUID** |  | |
| **step** | **SolutionStep** |  | [enum: INITIAL_CONFIGURATION, DASHBOARDS_CONFIGURATION] |
| **body** | **String** |  | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## clearStep

```
void clearStep(@Nonnull UUID solutionId, @Nonnull SolutionStep step)
```

**DELETE** `/api/ai/solution/{solutionId}/{step}/clear`

clearStep


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **solutionId** | **UUID** |  | |
| **step** | **SolutionStep** |  | [enum: INITIAL_CONFIGURATION, DASHBOARDS_CONFIGURATION] |

### Return type

null (empty response body)


## createSolution

```
com.fasterxml.jackson.databind.JsonNode createSolution(@Nonnull UUID solutionId)
```

**POST** `/api/ai/solution/{solutionId}/create`

createSolution


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **solutionId** | **UUID** |  | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## deleteSolution

```
void deleteSolution(@Nonnull UUID solutionId)
```

**DELETE** `/api/ai/solution/{solutionId}`

deleteSolution


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **solutionId** | **UUID** |  | |

### Return type

null (empty response body)


## exportSolution

```
com.fasterxml.jackson.databind.JsonNode exportSolution(@Nonnull UUID solutionId)
```

**GET** `/api/ai/solution/{solutionId}/export`

exportSolution


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **solutionId** | **UUID** |  | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## getSolution

```
com.fasterxml.jackson.databind.JsonNode getSolution(@Nonnull UUID solutionId)
```

**GET** `/api/ai/solution/{solutionId}`

getSolution


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **solutionId** | **UUID** |  | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## getSolutions

```
com.fasterxml.jackson.databind.JsonNode getSolutions()
```

**GET** `/api/ai/solution/infos`

getSolutions

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## importSolution

```
com.fasterxml.jackson.databind.JsonNode importSolution(@Nonnull Object body)
```

**POST** `/api/ai/solution/import`

importSolution


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object** |  | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## installSolution

```
com.fasterxml.jackson.databind.JsonNode installSolution(@Nonnull UUID solutionId, @Nonnull String xAuthorization)
```

**POST** `/api/ai/solution/{solutionId}/install`

installSolution


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **solutionId** | **UUID** |  | |
| **xAuthorization** | **String** |  | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## startNew

```
com.fasterxml.jackson.databind.JsonNode startNew()
```

**POST** `/api/ai/solution/start`

startNew

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## uninstallSolution

```
com.fasterxml.jackson.databind.JsonNode uninstallSolution(@Nonnull UUID solutionId, @Nonnull String xAuthorization)
```

**DELETE** `/api/ai/solution/{solutionId}/uninstall`

uninstallSolution


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **solutionId** | **UUID** |  | |
| **xAuthorization** | **String** |  | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## updateData

```
com.fasterxml.jackson.databind.JsonNode updateData(@Nonnull UUID solutionId, @Nonnull String dataKey, @Nonnull Object body)
```

**PUT** `/api/ai/solution/{solutionId}/{dataKey}`

updateData


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **solutionId** | **UUID** |  | |
| **dataKey** | **String** |  | |
| **body** | **Object** |  | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**

