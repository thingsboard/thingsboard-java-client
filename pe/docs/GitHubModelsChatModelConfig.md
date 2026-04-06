
# GitHubModelsChatModelConfig

`org.thingsboard.client.model.GitHubModelsChatModelConfig`

**Extends:** **AiModelConfig**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **modelType** | **AiModelType** |  | [optional] [readonly] |
| **providerConfig** | **GitHubModelsProviderConfig** |  | |
| **modelId** | **String** |  | |
| **temperature** | **Double** |  | [optional] |
| **topP** | **Double** |  | [optional] |
| **frequencyPenalty** | **Double** |  | [optional] |
| **presencePenalty** | **Double** |  | [optional] |
| **maxOutputTokens** | **Integer** |  | [optional] |
| **timeoutSeconds** | **Integer** |  | [optional] |
| **maxRetries** | **Integer** |  | [optional] |



## Referenced Types

#### AiModelConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| provider | String |  |  |

#### AiModelType (enum)
`CHAT`

#### GitHubModelsProviderConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| personalAccessToken | String |  |  |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

