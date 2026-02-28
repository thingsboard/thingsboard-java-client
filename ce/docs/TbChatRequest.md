
# TbChatRequest

`org.thingsboard.client.model.TbChatRequest`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **systemMessage** | **String** | A system-level instruction that frames the user's input, setting the persona, tone, and constraints for the generated response | [optional] |
| **userMessage** | **TbUserMessage** | The actual user prompt that will be answered by the AI model | |
| **chatModelConfig** | **AiModelConfig** | Configuration of the AI chat model that should execute the request | |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

