
# TranslationInfo

`org.thingsboard.client.model.TranslationInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **localeCode** | **String** | Locale code formed by combining the ISO 639-1 language code and the ISO 3166-1 region code. For example, \"en_US\" | [optional] |
| **language** | **String** | Locale code language display name. For example, \"Polish (Polski)\" | [optional] |
| **country** | **String** | Locale code country display name. For example, \"Poland\" | [optional] |
| **progress** | **Integer** | Number representing translation percentage progress. For example, 40 that means 40% of all keys are translated. | [optional] |
| **customized** | **Boolean** | Boolean representing if current language has customization. | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

