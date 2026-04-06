
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

#### AmazonBedrockChatModelConfig  *(extends AiModelConfig, provider=`AMAZON_BEDROCK`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| modelType | AiModelType |  | [optional] [readonly] |
| providerConfig | AmazonBedrockProviderConfig |  |  |
| modelId | String |  |  |
| temperature | Double |  | [optional] |
| topP | Double |  | [optional] |
| maxOutputTokens | Integer |  | [optional] |
| timeoutSeconds | Integer |  | [optional] |
| maxRetries | Integer |  | [optional] |

#### AnthropicChatModelConfig  *(extends AiModelConfig, provider=`ANTHROPIC`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| modelType | AiModelType |  | [optional] [readonly] |
| providerConfig | AnthropicProviderConfig |  |  |
| modelId | String |  |  |
| temperature | Double |  | [optional] |
| topP | Double |  | [optional] |
| topK | Integer |  | [optional] |
| maxOutputTokens | Integer |  | [optional] |
| timeoutSeconds | Integer |  | [optional] |
| maxRetries | Integer |  | [optional] |

#### AzureOpenAiChatModelConfig  *(extends AiModelConfig, provider=`AZURE_OPENAI`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| modelType | AiModelType |  | [optional] [readonly] |
| providerConfig | AzureOpenAiProviderConfig |  |  |
| modelId | String |  |  |
| temperature | Double |  | [optional] |
| topP | Double |  | [optional] |
| frequencyPenalty | Double |  | [optional] |
| presencePenalty | Double |  | [optional] |
| maxOutputTokens | Integer |  | [optional] |
| timeoutSeconds | Integer |  | [optional] |
| maxRetries | Integer |  | [optional] |

#### GitHubModelsChatModelConfig  *(extends AiModelConfig, provider=`GITHUB_MODELS`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| modelType | AiModelType |  | [optional] [readonly] |
| providerConfig | GitHubModelsProviderConfig |  |  |
| modelId | String |  |  |
| temperature | Double |  | [optional] |
| topP | Double |  | [optional] |
| frequencyPenalty | Double |  | [optional] |
| presencePenalty | Double |  | [optional] |
| maxOutputTokens | Integer |  | [optional] |
| timeoutSeconds | Integer |  | [optional] |
| maxRetries | Integer |  | [optional] |

#### GoogleVertexAiGeminiChatModelConfig  *(extends AiModelConfig, provider=`GOOGLE_VERTEX_AI_GEMINI`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| modelType | AiModelType |  | [optional] [readonly] |
| providerConfig | GoogleVertexAiGeminiProviderConfig |  |  |
| modelId | String |  |  |
| temperature | Double |  | [optional] |
| topP | Double |  | [optional] |
| topK | Integer |  | [optional] |
| frequencyPenalty | Double |  | [optional] |
| presencePenalty | Double |  | [optional] |
| maxOutputTokens | Integer |  | [optional] |
| timeoutSeconds | Integer |  | [optional] |
| maxRetries | Integer |  | [optional] |

#### MistralAiChatModelConfig  *(extends AiModelConfig, provider=`MISTRAL_AI`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| modelType | AiModelType |  | [optional] [readonly] |
| providerConfig | MistralAiProviderConfig |  |  |
| modelId | String |  |  |
| temperature | Double |  | [optional] |
| topP | Double |  | [optional] |
| frequencyPenalty | Double |  | [optional] |
| presencePenalty | Double |  | [optional] |
| maxOutputTokens | Integer |  | [optional] |
| timeoutSeconds | Integer |  | [optional] |
| maxRetries | Integer |  | [optional] |

#### OllamaChatModelConfig  *(extends AiModelConfig, provider=`OLLAMA`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| modelType | AiModelType |  | [optional] [readonly] |
| providerConfig | OllamaProviderConfig |  |  |
| modelId | String |  |  |
| temperature | Double |  | [optional] |
| topP | Double |  | [optional] |
| topK | Integer |  | [optional] |
| contextLength | Integer |  | [optional] |
| maxOutputTokens | Integer |  | [optional] |
| timeoutSeconds | Integer |  | [optional] |
| maxRetries | Integer |  | [optional] |

#### OpenAiChatModelConfig  *(extends AiModelConfig, provider=`OPENAI`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| modelType | AiModelType |  | [optional] [readonly] |
| providerConfig | OpenAiProviderConfig |  |  |
| modelId | String |  |  |
| temperature | Double |  | [optional] |
| topP | Double |  | [optional] |
| frequencyPenalty | Double |  | [optional] |
| presencePenalty | Double |  | [optional] |
| maxOutputTokens | Integer |  | [optional] |
| timeoutSeconds | Integer |  | [optional] |
| maxRetries | Integer |  | [optional] |

#### AiModelType (enum)
`CHAT`

#### GoogleAiGeminiProviderConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| apiKey | String |  |  |

#### OpenAiProviderConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| baseUrl | String |  | [optional] |
| apiKey | String |  | [optional] |

#### AzureOpenAiProviderConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| endpoint | String |  |  |
| serviceVersion | String |  | [optional] |
| apiKey | String |  |  |

#### GoogleVertexAiGeminiProviderConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| fileName | String |  |  |
| projectId | String |  |  |
| location | String |  |  |
| serviceAccountKey | String |  |  |

#### MistralAiProviderConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| apiKey | String |  |  |

#### AnthropicProviderConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| apiKey | String |  |  |

#### AmazonBedrockProviderConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| region | String |  |  |
| accessKeyId | String |  |  |
| secretAccessKey | String |  |  |

#### GitHubModelsProviderConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| personalAccessToken | String |  |  |

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

