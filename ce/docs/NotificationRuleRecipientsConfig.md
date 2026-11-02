
# NotificationRuleRecipientsConfig

`org.thingsboard.client.model.NotificationRuleRecipientsConfig`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **triggerType** | **NotificationRuleTriggerType** |  | [optional] |



## Subtypes

#### EscalatedNotificationRuleRecipientsConfig  *(triggerType=`ALARM`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| escalationTable | Map<String, List<UUID>> |  |  |

#### AlarmAssignmentRecipientsConfig  *(triggerType=`ALARM_ASSIGNMENT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### AlarmCommentRecipientsConfig  *(triggerType=`ALARM_COMMENT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### ApiUsageLimitRecipientsConfig  *(triggerType=`API_USAGE_LIMIT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### DeviceActivityRecipientsConfig  *(triggerType=`DEVICE_ACTIVITY`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### EdgeCommunicationFailureRecipientsConfig  *(triggerType=`EDGE_COMMUNICATION_FAILURE`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### EdgeConnectionRecipientsConfig  *(triggerType=`EDGE_CONNECTION`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### EntitiesLimitRecipientsConfig  *(triggerType=`ENTITIES_LIMIT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### EntityActionRecipientsConfig  *(triggerType=`ENTITY_ACTION`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### IntegrationLifecycleEventRecipientsConfig  *(triggerType=`INTEGRATION_LIFECYCLE_EVENT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### NewPlatformVersionRecipientsConfig  *(triggerType=`NEW_PLATFORM_VERSION`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### RateLimitsRecipientsConfig  *(triggerType=`RATE_LIMITS`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### ResourceShortageRecipientsConfig  *(triggerType=`RESOURCES_SHORTAGE`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### RuleEngineComponentLifecycleEventRecipientsConfig  *(triggerType=`RULE_ENGINE_COMPONENT_LIFECYCLE_EVENT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### TaskProcessingFailureRecipientsConfig  *(triggerType=`TASK_PROCESSING_FAILURE`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

## Referenced Types

#### NotificationRuleTriggerType (enum)
`ENTITY_ACTION` | `ALARM` | `ALARM_COMMENT` | `ALARM_ASSIGNMENT` | `DEVICE_ACTIVITY` | `RULE_ENGINE_COMPONENT_LIFECYCLE_EVENT` | `INTEGRATION_LIFECYCLE_EVENT` | `EDGE_CONNECTION` | `EDGE_COMMUNICATION_FAILURE` | `NEW_PLATFORM_VERSION` | … (15 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

