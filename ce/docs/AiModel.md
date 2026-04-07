
# AiModel

`org.thingsboard.client.model.AiModel`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **AiModelId** |  | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object representing the ID of the tenant associated with this AI model | [readonly] |
| **version** | **Long** | Version of the AI model record; increments automatically whenever the record is changed | [readonly] |
| **name** | **String** | Display name for this AI model configuration; not the technical model identifier | |
| **_configuration** | **AiModelConfig** | Configuration of the AI model | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `CalculatedFieldId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityViewId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### AiModelConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| provider | String |  |  |

#### AmazonBedrockChatModelConfig  *(extends AiModelConfig, provider=`AMAZON_BEDROCK`)*
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

#### AnthropicChatModelConfig  *(extends AiModelConfig, provider=`ANTHROPIC`)*
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

#### AzureOpenAiChatModelConfig  *(extends AiModelConfig, provider=`AZURE_OPENAI`)*
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

#### GitHubModelsChatModelConfig  *(extends AiModelConfig, provider=`GITHUB_MODELS`)*
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

#### GoogleAiGeminiChatModelConfig  *(extends AiModelConfig, provider=`GOOGLE_AI_GEMINI`)*
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

#### GoogleVertexAiGeminiChatModelConfig  *(extends AiModelConfig, provider=`GOOGLE_VERTEX_AI_GEMINI`)*
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

#### MistralAiChatModelConfig  *(extends AiModelConfig, provider=`MISTRAL_AI`)*
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

#### OllamaChatModelConfig  *(extends AiModelConfig, provider=`OLLAMA`)*
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

#### OpenAiChatModelConfig  *(extends AiModelConfig, provider=`OPENAI`)*
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

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `RULE_CHAIN` | `RULE_NODE` | `ENTITY_VIEW` | … (36 values total)

#### OpenAiProviderConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| baseUrl | String |  | [optional] |
| apiKey | String |  | [optional] |

#### AiModelType (enum)
`CHAT`

#### AzureOpenAiProviderConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| endpoint | String |  |  |
| serviceVersion | String |  | [optional] |
| apiKey | String |  |  |

#### GoogleAiGeminiProviderConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
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

