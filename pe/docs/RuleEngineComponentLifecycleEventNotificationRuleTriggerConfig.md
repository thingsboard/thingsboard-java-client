
# RuleEngineComponentLifecycleEventNotificationRuleTriggerConfig

`org.thingsboard.client.model.RuleEngineComponentLifecycleEventNotificationRuleTriggerConfig`

**Extends:** **NotificationRuleTriggerConfig**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **ruleChains** | **Set\<UUID\>** |  | [optional] |
| **ruleChainEvents** | **Set\<ComponentLifecycleEvent\>** |  | [optional] |
| **onlyRuleChainLifecycleFailures** | **Boolean** |  | [optional] |
| **trackRuleNodeEvents** | **Boolean** |  | [optional] |
| **ruleNodeEvents** | **Set\<ComponentLifecycleEvent\>** |  | [optional] |
| **onlyRuleNodeLifecycleFailures** | **Boolean** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

