
# AmazonBedrockChatModelConfig

`org.thingsboard.client.model.AmazonBedrockChatModelConfig`

**Extends:** **AiModelConfig**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **modelType** | **AiModelType** |  | [optional] [readonly] |
| **providerConfig** | **AmazonBedrockProviderConfig** |  | |
| **modelId** | **String** |  | |
| **temperature** | **Double** |  | [optional] |
| **topP** | **Double** |  | [optional] |
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

#### AmazonBedrockProviderConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| region | String |  |  |
| accessKeyId | String |  |  |
| secretAccessKey | String |  |  |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

