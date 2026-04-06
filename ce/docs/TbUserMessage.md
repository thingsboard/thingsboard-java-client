
# TbUserMessage

`org.thingsboard.client.model.TbUserMessage`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **contents** | **List\<TbContent\>** |  | |



## Referenced Types

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

