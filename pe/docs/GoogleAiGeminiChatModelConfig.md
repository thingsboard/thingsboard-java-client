
# GoogleAiGeminiChatModelConfig

`org.thingsboard.client.model.GoogleAiGeminiChatModelConfig`

**Extends:** **AiModelConfig**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **modelType** | **AiModelType** |  | [optional] [readonly] |
| **providerConfig** | **GoogleAiGeminiProviderConfig** |  | |
| **modelId** | **String** |  | |
| **temperature** | **Double** |  | [optional] |
| **topP** | **Double** |  | [optional] |
| **topK** | **Integer** |  | [optional] |
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

#### GoogleAiGeminiProviderConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| apiKey | String |  |  |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

