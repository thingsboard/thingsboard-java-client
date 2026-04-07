
# AmazonBedrockChatModelConfig

`org.thingsboard.client.model.AmazonBedrockChatModelConfig`

**Extends:** **AiModelConfig**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **providerConfig** | **AmazonBedrockProviderConfig** |  | |
| **modelId** | **String** |  | |
| **temperature** | **Double** |  | [optional] |
| **topP** | **Double** |  | [optional] |
| **maxOutputTokens** | **Integer** |  | [optional] |
| **timeoutSeconds** | **Integer** |  | [optional] |
| **maxRetries** | **Integer** |  | [optional] |
| **modelType** | **AiModelType** |  | [optional] [readonly] |



## Referenced Types

#### AiModelConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| provider | String |  |  |

#### AmazonBedrockProviderConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| region | String |  |  |
| accessKeyId | String |  |  |
| secretAccessKey | String |  |  |

#### AiModelType (enum)
`CHAT`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

