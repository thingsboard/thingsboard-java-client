
# EscalatedNotificationRuleRecipientsConfig

`org.thingsboard.client.model.EscalatedNotificationRuleRecipientsConfig`

Escalated notification rule recipients configuration

**Extends:** **NotificationRuleRecipientsConfig**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **escalationTable** | **Map\<String, List<UUID>\>** |  | |



## Referenced Types

#### NotificationRuleRecipientsConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| triggerType | NotificationRuleTriggerType |  | [optional] |

#### AlarmAssignmentRecipientsConfig  *(extends NotificationRuleRecipientsConfig, triggerType=`ALARM_ASSIGNMENT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### AlarmCommentRecipientsConfig  *(extends NotificationRuleRecipientsConfig, triggerType=`ALARM_COMMENT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### ApiUsageLimitRecipientsConfig  *(extends NotificationRuleRecipientsConfig, triggerType=`API_USAGE_LIMIT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### DeviceActivityRecipientsConfig  *(extends NotificationRuleRecipientsConfig, triggerType=`DEVICE_ACTIVITY`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### EdgeCommunicationFailureRecipientsConfig  *(extends NotificationRuleRecipientsConfig, triggerType=`EDGE_COMMUNICATION_FAILURE`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### EdgeConnectionRecipientsConfig  *(extends NotificationRuleRecipientsConfig, triggerType=`EDGE_CONNECTION`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### EntitiesLimitRecipientsConfig  *(extends NotificationRuleRecipientsConfig, triggerType=`ENTITIES_LIMIT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### EntityActionRecipientsConfig  *(extends NotificationRuleRecipientsConfig, triggerType=`ENTITY_ACTION`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### IntegrationLifecycleEventRecipientsConfig  *(extends NotificationRuleRecipientsConfig, triggerType=`INTEGRATION_LIFECYCLE_EVENT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### NewPlatformVersionRecipientsConfig  *(extends NotificationRuleRecipientsConfig, triggerType=`NEW_PLATFORM_VERSION`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### RateLimitsRecipientsConfig  *(extends NotificationRuleRecipientsConfig, triggerType=`RATE_LIMITS`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### ResourceShortageRecipientsConfig  *(extends NotificationRuleRecipientsConfig, triggerType=`RESOURCES_SHORTAGE`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### RuleEngineComponentLifecycleEventRecipientsConfig  *(extends NotificationRuleRecipientsConfig, triggerType=`RULE_ENGINE_COMPONENT_LIFECYCLE_EVENT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### TaskProcessingFailureRecipientsConfig  *(extends NotificationRuleRecipientsConfig, triggerType=`TASK_PROCESSING_FAILURE`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### NotificationRuleTriggerType (enum)
`ENTITY_ACTION` | `ALARM` | `ALARM_COMMENT` | `ALARM_ASSIGNMENT` | `DEVICE_ACTIVITY` | `RULE_ENGINE_COMPONENT_LIFECYCLE_EVENT` | `INTEGRATION_LIFECYCLE_EVENT` | `EDGE_CONNECTION` | `EDGE_COMMUNICATION_FAILURE` | `NEW_PLATFORM_VERSION` | … (15 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

