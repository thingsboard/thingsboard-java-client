
# DebugIntegrationEventFilter

`org.thingsboard.client.model.DebugIntegrationEventFilter`

**Extends:** **EventFilter**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **server** | **String** | String value representing the server name, identifier or ip address where the platform is running | [optional] |
| **isError** | **IsErrorEnum** | Boolean value to filter the errors | [optional] |
| **errorStr** | **String** | The case insensitive 'contains' filter based on error message | [optional] |
| **type** | **String** |  | [optional] |
| **message** | **String** |  | [optional] |
| **statusIntegration** | **String** |  | [optional] |


### Enum: IsErrorEnum

| Name | Value |
|---- | -----|
| FALSE | "false" |
| TRUE | "true" |



## Referenced Types

#### EventFilter
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| eventType | EventType | String value representing the event type |  |
| notEmpty | Boolean |  | [optional] |

#### CalculatedFieldDebugEventFilter  *(extends EventFilter, eventType=`DEBUG_CALCULATED_FIELD`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| server | String | String value representing the server name, identifier or ip address where the platform is running | [optional] |
| isError | IsErrorEnum | Boolean value to filter the errors | [optional] |
| errorStr | String | The case insensitive 'contains' filter based on error message | [optional] |
| entityId | String | String value representing the entity id in the event body | [optional] |
| entityType | EntityTypeEnum | String value representing the entity type | [optional] |
| msgId | String | String value representing the message id in the rule engine | [optional] |
| msgType | String | String value representing the message type | [optional] |
| arguments | String | String value representing the arguments that were used in the calculation performed | [optional] |
| result | String | String value representing the result of a calculation | [optional] |

#### DebugConverterEventFilter  *(extends EventFilter, eventType=`DEBUG_CONVERTER`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| server | String | String value representing the server name, identifier or ip address where the platform is running | [optional] |
| isError | IsErrorEnum | Boolean value to filter the errors | [optional] |
| errorStr | String | The case insensitive 'contains' filter based on error message | [optional] |
| type | String |  | [optional] |
| in | String |  | [optional] |
| out | String |  | [optional] |
| metadata | String |  | [optional] |

#### RuleChainDebugEventFilter  *(extends EventFilter, eventType=`DEBUG_RULE_CHAIN`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| server | String | String value representing the server name, identifier or ip address where the platform is running | [optional] |
| isError | IsErrorEnum | Boolean value to filter the errors | [optional] |
| errorStr | String | The case insensitive 'contains' filter based on error message | [optional] |
| message | String | String value representing the message | [optional] |

#### RuleNodeDebugEventFilter  *(extends EventFilter, eventType=`DEBUG_RULE_NODE`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| server | String | String value representing the server name, identifier or ip address where the platform is running | [optional] |
| isError | IsErrorEnum | Boolean value to filter the errors | [optional] |
| errorStr | String | The case insensitive 'contains' filter based on error message | [optional] |
| msgDirectionType | MsgDirectionTypeEnum | String value representing msg direction type (incoming to entity or outcoming from entity) | [optional] |
| entityId | String | String value representing the entity id in the event body (originator of the message) | [optional] |
| entityType | EntityTypeEnum | String value representing the entity type | [optional] |
| msgId | String | String value representing the message id in the rule engine | [optional] |
| msgType | String | String value representing the message type | [optional] |
| relationType | String | String value representing the type of message routing | [optional] |
| dataSearch | String | The case insensitive 'contains' filter based on data (key and value) for the message. | [optional] |
| metadataSearch | String | The case insensitive 'contains' filter based on metadata (key and value) for the message. | [optional] |

#### ErrorEventFilter  *(extends EventFilter, eventType=`ERROR`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| server | String | String value representing the server name, identifier or ip address where the platform is running | [optional] |
| method | String | String value representing the method name when the error happened | [optional] |
| errorStr | String | The case insensitive 'contains' filter based on error message | [optional] |

#### LifeCycleEventFilter  *(extends EventFilter, eventType=`LC_EVENT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| server | String | String value representing the server name, identifier or ip address where the platform is running | [optional] |
| event | String | String value representing the lifecycle event type | [optional] |
| status | StatusEnum | String value representing status of the lifecycle event | [optional] |
| errorStr | String | The case insensitive 'contains' filter based on error message | [optional] |

#### RawDataEventFilter  *(extends EventFilter, eventType=`RAW_DATA`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| server | String | String value representing the server name, identifier or ip address where the platform is running | [optional] |
| uuid | String | String value representing the uuid | [optional] |
| messageType | String | String value representing the message type | [optional] |
| message | String | String value representing the message | [optional] |

#### StatisticsEventFilter  *(extends EventFilter, eventType=`STATS`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| server | String | String value representing the server name, identifier or ip address where the platform is running | [optional] |
| minMessagesProcessed | Integer | The minimum number of successfully processed messages | [optional] |
| maxMessagesProcessed | Integer | The maximum number of successfully processed messages | [optional] |
| minErrorsOccurred | Integer | The minimum number of errors occurred during messages processing | [optional] |
| maxErrorsOccurred | Integer | The maximum number of errors occurred during messages processing | [optional] |

#### EventType (enum)
`ERROR` | `LC_EVENT` | `STATS` | `RAW_DATA` | `DEBUG_RULE_NODE` | `DEBUG_RULE_CHAIN` | `DEBUG_CONVERTER` | `DEBUG_INTEGRATION` | `DEBUG_CALCULATED_FIELD`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

