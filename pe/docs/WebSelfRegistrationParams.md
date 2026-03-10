
# WebSelfRegistrationParams

`org.thingsboard.client.model.WebSelfRegistrationParams`

**Extends:** **SelfRegistrationParams**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **privacyPolicy** | **String** | Privacy policy text. Supports HTML. | [optional] |
| **termsOfUse** | **String** | Terms of User text. Supports HTML. | [optional] |
| **domainId** | **DomainId** | Domain name for self registration URL. Typically this matches the domain name from the Login White Labeling page. | |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

