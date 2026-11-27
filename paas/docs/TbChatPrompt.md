
# TbChatPrompt

`org.thingsboard.client.model.TbChatPrompt`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **systemMessage** | **String** | A system-level instruction that frames the user's input, setting the persona, tone, and constraints for the generated response | [optional] |
| **userMessage** | **TbUserMessage** | The actual user prompt that will be answered by the AI model | |



## Referenced Types

#### TbUserMessage
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| contents | List<TbContent> | A list of content parts that make up the complete user prompt |  |

#### TbContent
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| contentType | String |  |  |

#### TbTextContent  *(extends TbContent, contentType=`TEXT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| text | String | The text content |  |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

