
# OllamaChatModelConfig

`org.thingsboard.client.model.OllamaChatModelConfig`

**Extends:** **AiModelConfig**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **modelType** | **AiModelType** |  | [optional] [readonly] |
| **providerConfig** | **OllamaProviderConfig** |  | |
| **modelId** | **String** |  | |
| **temperature** | **Double** |  | [optional] |
| **topP** | **Double** |  | [optional] |
| **topK** | **Integer** |  | [optional] |
| **contextLength** | **Integer** |  | [optional] |
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

#### OllamaProviderConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| baseUrl | String |  |  |
| auth | OllamaAuth |  |  |

#### OllamaAuth
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### Basic  *(extends OllamaAuth, type=`BASIC`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| username | String |  |  |
| password | String |  |  |

#### None  *(extends OllamaAuth, type=`NONE`)*
*See OllamaAuth for properties.*

#### Token  *(extends OllamaAuth, type=`TOKEN`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| token | String |  |  |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

