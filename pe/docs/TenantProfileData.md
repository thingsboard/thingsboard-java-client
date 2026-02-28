
# TenantProfileData

`org.thingsboard.client.model.TenantProfileData`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **_configuration** | **TenantProfileConfiguration** | Complex JSON object that contains profile settings: max devices, max assets, rate limits, etc. | [optional] |
| **queueConfiguration** | **List\<TenantProfileQueueConfiguration\>** | JSON array of queue configuration per tenant profile | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

