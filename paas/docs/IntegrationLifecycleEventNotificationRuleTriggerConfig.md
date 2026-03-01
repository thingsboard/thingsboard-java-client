
# IntegrationLifecycleEventNotificationRuleTriggerConfig

`org.thingsboard.client.model.IntegrationLifecycleEventNotificationRuleTriggerConfig`

**Extends:** **NotificationRuleTriggerConfig**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **integrationTypes** | **Set\<IntegrationType\>** |  | [optional] |
| **integrations** | **Set\<UUID\>** |  | [optional] |
| **notifyOn** | **Set\<ComponentLifecycleEvent\>** |  | [optional] |
| **onlyOnError** | **Boolean** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

