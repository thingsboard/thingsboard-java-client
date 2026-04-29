
# AiModelConfig

`org.thingsboard.client.model.AiModelConfig`

Root configuration for AI models

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **provider** | **String** |  | |



## Subtypes

#### AmazonBedrockChatModelConfig  *(provider=`AMAZON_BEDROCK`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| providerConfig | AmazonBedrockProviderConfig |  |  |
| modelId | String |  |  |
| temperature | Double |  | [optional] |
| topP | Double |  | [optional] |
| maxOutputTokens | Integer |  | [optional] |
| timeoutSeconds | Integer |  | [optional] |
| maxRetries | Integer |  | [optional] |
| modelType | AiModelType |  | [optional] [readonly] |

#### AnthropicChatModelConfig  *(provider=`ANTHROPIC`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| providerConfig | AnthropicProviderConfig |  |  |
| modelId | String |  |  |
| temperature | Double |  | [optional] |
| topP | Double |  | [optional] |
| topK | Integer |  | [optional] |
| maxOutputTokens | Integer |  | [optional] |
| timeoutSeconds | Integer |  | [optional] |
| maxRetries | Integer |  | [optional] |
| modelType | AiModelType |  | [optional] [readonly] |

#### AzureOpenAiChatModelConfig  *(provider=`AZURE_OPENAI`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| providerConfig | AzureOpenAiProviderConfig |  |  |
| modelId | String |  |  |
| temperature | Double |  | [optional] |
| topP | Double |  | [optional] |
| frequencyPenalty | Double |  | [optional] |
| presencePenalty | Double |  | [optional] |
| maxOutputTokens | Integer |  | [optional] |
| timeoutSeconds | Integer |  | [optional] |
| maxRetries | Integer |  | [optional] |
| modelType | AiModelType |  | [optional] [readonly] |

#### GitHubModelsChatModelConfig  *(provider=`GITHUB_MODELS`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| providerConfig | GitHubModelsProviderConfig |  |  |
| modelId | String |  |  |
| temperature | Double |  | [optional] |
| topP | Double |  | [optional] |
| frequencyPenalty | Double |  | [optional] |
| presencePenalty | Double |  | [optional] |
| maxOutputTokens | Integer |  | [optional] |
| timeoutSeconds | Integer |  | [optional] |
| maxRetries | Integer |  | [optional] |
| modelType | AiModelType |  | [optional] [readonly] |

#### GoogleAiGeminiChatModelConfig  *(provider=`GOOGLE_AI_GEMINI`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| providerConfig | GoogleAiGeminiProviderConfig |  |  |
| modelId | String |  |  |
| temperature | Double |  | [optional] |
| topP | Double |  | [optional] |
| topK | Integer |  | [optional] |
| frequencyPenalty | Double |  | [optional] |
| presencePenalty | Double |  | [optional] |
| maxOutputTokens | Integer |  | [optional] |
| timeoutSeconds | Integer |  | [optional] |
| maxRetries | Integer |  | [optional] |
| modelType | AiModelType |  | [optional] [readonly] |

#### GoogleVertexAiGeminiChatModelConfig  *(provider=`GOOGLE_VERTEX_AI_GEMINI`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
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
| modelType | AiModelType |  | [optional] [readonly] |

#### MistralAiChatModelConfig  *(provider=`MISTRAL_AI`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| providerConfig | MistralAiProviderConfig |  |  |
| modelId | String |  |  |
| temperature | Double |  | [optional] |
| topP | Double |  | [optional] |
| frequencyPenalty | Double |  | [optional] |
| presencePenalty | Double |  | [optional] |
| maxOutputTokens | Integer |  | [optional] |
| timeoutSeconds | Integer |  | [optional] |
| maxRetries | Integer |  | [optional] |
| modelType | AiModelType |  | [optional] [readonly] |

#### OllamaChatModelConfig  *(provider=`OLLAMA`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| providerConfig | OllamaProviderConfig |  |  |
| modelId | String |  |  |
| temperature | Double |  | [optional] |
| topP | Double |  | [optional] |
| topK | Integer |  | [optional] |
| contextLength | Integer |  | [optional] |
| maxOutputTokens | Integer |  | [optional] |
| timeoutSeconds | Integer |  | [optional] |
| maxRetries | Integer |  | [optional] |
| modelType | AiModelType |  | [optional] [readonly] |

#### OpenAiChatModelConfig  *(provider=`OPENAI`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| providerConfig | OpenAiProviderConfig |  |  |
| modelId | String |  |  |
| temperature | Double |  | [optional] |
| topP | Double |  | [optional] |
| frequencyPenalty | Double |  | [optional] |
| presencePenalty | Double |  | [optional] |
| maxOutputTokens | Integer |  | [optional] |
| timeoutSeconds | Integer |  | [optional] |
| maxRetries | Integer |  | [optional] |
| modelType | AiModelType |  | [optional] [readonly] |

## Referenced Types

#### AmazonBedrockProviderConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| region | String |  |  |
| accessKeyId | String |  |  |
| secretAccessKey | String |  |  |

#### AiModelType (enum)
`CHAT`

#### AnthropicProviderConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| apiKey | String |  |  |

#### AzureOpenAiProviderConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| endpoint | String |  |  |
| serviceVersion | String |  | [optional] |
| apiKey | String |  |  |

#### GitHubModelsProviderConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| personalAccessToken | String |  |  |

#### GoogleAiGeminiProviderConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| apiKey | String |  |  |

#### GoogleVertexAiGeminiProviderConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| fileName | String |  | [optional] |
| projectId | String |  |  |
| location | String |  |  |
| serviceAccountKey | String |  |  |

#### MistralAiProviderConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| apiKey | String |  |  |

#### OllamaProviderConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| baseUrl | String |  |  |
| auth | OllamaAuth |  |  |

#### OpenAiProviderConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| baseUrl | String |  | [optional] |
| apiKey | String |  | [optional] |

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

