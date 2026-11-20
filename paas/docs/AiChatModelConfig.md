
# AiChatModelConfig

`org.thingsboard.client.model.AiChatModelConfig`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **modelType** | **AiModelType** |  | [optional] [readonly] |
| **provider** | **AiProvider** | AI Provider | |



## Referenced Types

#### AiModelType (enum)
`CHAT`

#### AiProvider (enum)
`OPENAI` | `AZURE_OPENAI` | `GOOGLE_AI_GEMINI` | `GOOGLE_VERTEX_AI_GEMINI` | `MISTRAL_AI` | `ANTHROPIC` | `AMAZON_BEDROCK` | `GITHUB_MODELS` | `OLLAMA`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

