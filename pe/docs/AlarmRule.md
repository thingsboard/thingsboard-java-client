
# AlarmRule

`org.thingsboard.client.model.AlarmRule`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **condition** | **AlarmCondition** | JSON object representing the alarm rule condition | [optional] |
| **alarmDetails** | **String** | String value representing the additional details for an alarm rule | [optional] |
| **dashboardId** | **DashboardId** | JSON object with the dashboard Id representing the reference to alarm details dashboard used by mobile application | [optional] |
| **schedule** | **AlarmSchedule** | JSON object representing time interval during which the rule is active | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### AlarmCondition
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| condition | List<AlarmConditionFilter> |  | [optional] |
| spec | AlarmConditionSpec | JSON object representing alarm condition type | [optional] |

#### AlarmSchedule
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| dynamicValue | DynamicValueString |  | [optional] |
| type | AlarmScheduleType |  | [optional] |

#### AnyTimeSchedule  *(extends AlarmSchedule, type=`ANY_TIME`)*
*See AlarmSchedule for properties.*

#### CustomTimeSchedule  *(extends AlarmSchedule, type=`CUSTOM`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| timezone | String |  | [optional] |
| items | List<CustomTimeScheduleItem> |  | [optional] |

#### SpecificTimeSchedule  *(extends AlarmSchedule, type=`SPECIFIC_TIME`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| daysOfWeek | Set<Integer> |  | [optional] |
| endsOn | Long |  | [optional] |
| startsOn | Long |  | [optional] |
| timezone | String |  | [optional] |

#### AlarmConditionFilter
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| valueType | EntityKeyValueType | String representation of the type of the value | [optional] |
| key | AlarmConditionFilterKey | JSON object for specifying alarm condition by specific key | [optional] |
| predicate | KeyFilterPredicate | JSON object representing filter condition | [optional] |
| value | Object |  | [optional] |

#### AlarmConditionSpec
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### DurationAlarmConditionSpec  *(extends AlarmConditionSpec, type=`DURATION`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| unit | TimeUnit | Duration time unit | [optional] |
| predicate | FilterPredicateValueLong | Duration predicate | [optional] |

#### RepeatingAlarmConditionSpec  *(extends AlarmConditionSpec, type=`REPEATING`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| predicate | FilterPredicateValueInteger | Repeating predicate | [optional] |

#### SimpleAlarmConditionSpec  *(extends AlarmConditionSpec, type=`SIMPLE`)*
*See AlarmConditionSpec for properties.*

#### DynamicValueString
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| resolvedValue | String |  | [optional] |
| sourceType | DynamicValueSourceType |  | [optional] |
| sourceAttribute | String |  | [optional] |
| inherit | Boolean |  | [optional] |

#### AlarmScheduleType (enum)
`ANY_TIME` | `SPECIFIC_TIME` | `CUSTOM`

#### EntityKeyValueType (enum)
`STRING` | `NUMERIC` | `BOOLEAN` | `DATE_TIME`

#### AlarmConditionFilterKey
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | AlarmConditionKeyType | The key type | [optional] |
| key | String | String value representing the key | [optional] |

#### KeyFilterPredicate
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### BooleanFilterPredicate  *(extends KeyFilterPredicate, type=`BOOLEAN`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| operation | BooleanOperation |  | [optional] |
| value | FilterPredicateValueBoolean | The value associated with the filter predicate | [optional] |

#### ComplexFilterPredicate  *(extends KeyFilterPredicate, type=`COMPLEX`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| operation | ComplexOperation |  | [optional] |
| predicates | List<KeyFilterPredicate> |  | [optional] |

#### NumericFilterPredicate  *(extends KeyFilterPredicate, type=`NUMERIC`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| operation | NumericOperation |  | [optional] |
| value | FilterPredicateValueDouble | The value associated with the filter predicate | [optional] |

#### StringFilterPredicate  *(extends KeyFilterPredicate, type=`STRING`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| operation | StringOperation |  | [optional] |
| value | FilterPredicateValueString | The value associated with the filter predicate | [optional] |
| ignoreCase | Boolean |  | [optional] |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (46 values total)

#### DynamicValueSourceType (enum)
`CURRENT_TENANT` | `CURRENT_CUSTOMER` | `CURRENT_USER` | `CURRENT_DEVICE`

#### CustomTimeScheduleItem
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| dayOfWeek | Integer |  | [optional] |
| enabled | Boolean |  | [optional] |
| endsOn | Long |  | [optional] |
| startsOn | Long |  | [optional] |

#### AlarmConditionKeyType (enum)
`ATTRIBUTE` | `TIME_SERIES` | `ENTITY_FIELD` | `CONSTANT`

#### TimeUnit (enum)
`NANOSECONDS` | `MICROSECONDS` | `MILLISECONDS` | `SECONDS` | `MINUTES` | `HOURS` | `DAYS`

#### FilterPredicateValueLong
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| defaultValue | Long |  | [optional] |
| userValue | Long |  | [optional] |
| dynamicValue | DynamicValueLong |  | [optional] |

#### FilterPredicateValueInteger
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| defaultValue | Integer |  | [optional] |
| userValue | Integer |  | [optional] |
| dynamicValue | DynamicValueInteger |  | [optional] |

#### StringOperation (enum)
`EQUAL` | `NOT_EQUAL` | `STARTS_WITH` | `ENDS_WITH` | `CONTAINS` | `NOT_CONTAINS` | `IN` | `NOT_IN`

#### FilterPredicateValueString
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| defaultValue | String |  | [optional] |
| userValue | String |  | [optional] |
| dynamicValue | DynamicValueString |  | [optional] |

#### NumericOperation (enum)
`EQUAL` | `NOT_EQUAL` | `GREATER` | `LESS` | `GREATER_OR_EQUAL` | `LESS_OR_EQUAL`

#### FilterPredicateValueDouble
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| defaultValue | Double |  | [optional] |
| userValue | Double |  | [optional] |
| dynamicValue | DynamicValueDouble |  | [optional] |

#### BooleanOperation (enum)
`EQUAL` | `NOT_EQUAL`

#### FilterPredicateValueBoolean
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| defaultValue | Boolean |  | [optional] |
| userValue | Boolean |  | [optional] |
| dynamicValue | DynamicValueBoolean |  | [optional] |

#### ComplexOperation (enum)
`AND` | `OR`

#### DynamicValueLong
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| resolvedValue | Long |  | [optional] |
| sourceType | DynamicValueSourceType |  | [optional] |
| sourceAttribute | String |  | [optional] |
| inherit | Boolean |  | [optional] |

#### DynamicValueInteger
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| resolvedValue | Integer |  | [optional] |
| sourceType | DynamicValueSourceType |  | [optional] |
| sourceAttribute | String |  | [optional] |
| inherit | Boolean |  | [optional] |

#### DynamicValueDouble
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| resolvedValue | Double |  | [optional] |
| sourceType | DynamicValueSourceType |  | [optional] |
| sourceAttribute | String |  | [optional] |
| inherit | Boolean |  | [optional] |

#### DynamicValueBoolean
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| resolvedValue | Boolean |  | [optional] |
| sourceType | DynamicValueSourceType |  | [optional] |
| sourceAttribute | String |  | [optional] |
| inherit | Boolean |  | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

