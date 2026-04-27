
# EntityDataQuery

`org.thingsboard.client.model.EntityDataQuery`

Entity data query to find entities. Page size is capped at 100.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **entityFilter** | **EntityFilter** |  | [optional] |
| **keyFilters** | **List\<KeyFilter\>** |  | [optional] |
| **keyFiltersOperation** | **AlarmRuleComplexOperation** |  | [optional] |
| **pageLink** | **EntityDataPageLink** |  | [optional] |
| **entityFields** | **List\<EntityKey\>** |  | [optional] |
| **latestValues** | **List\<EntityKey\>** |  | [optional] |
| **keyFiltersOperationOrDefault** | **AlarmRuleComplexOperation** |  | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### EntityFilter
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### ApiUsageStateFilter  *(extends EntityFilter, type=`apiUsageState`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| customerId | CustomerId |  | [optional] |

#### AssetSearchQueryFilter  *(extends EntityFilter, type=`assetSearchQuery`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| rootEntity | AliasEntityId |  | [optional] |
| relationType | String |  | [optional] |
| direction | EntitySearchDirection |  | [optional] |
| maxLevel | Integer |  | [optional] |
| fetchLastLevelOnly | Boolean |  | [optional] |
| rootStateEntity | Boolean |  | [optional] |
| defaultStateEntity | AliasEntityId |  | [optional] |
| assetTypes | List<String> |  | [optional] |

#### AssetTypeFilter  *(extends EntityFilter, type=`assetType`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| assetTypes | List<String> |  | [optional] |
| assetNameFilter | String |  | [optional] |
| assetType | String |  | [optional] |

#### DeviceSearchQueryFilter  *(extends EntityFilter, type=`deviceSearchQuery`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| rootEntity | AliasEntityId |  | [optional] |
| relationType | String |  | [optional] |
| direction | EntitySearchDirection |  | [optional] |
| maxLevel | Integer |  | [optional] |
| fetchLastLevelOnly | Boolean |  | [optional] |
| rootStateEntity | Boolean |  | [optional] |
| defaultStateEntity | AliasEntityId |  | [optional] |
| deviceTypes | List<String> |  | [optional] |

#### DeviceTypeFilter  *(extends EntityFilter, type=`deviceType`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| deviceTypes | List<String> |  | [optional] |
| deviceNameFilter | String |  | [optional] |
| deviceType | String |  | [optional] |

#### EdgeSearchQueryFilter  *(extends EntityFilter, type=`edgeSearchQuery`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| rootEntity | AliasEntityId |  | [optional] |
| relationType | String |  | [optional] |
| direction | EntitySearchDirection |  | [optional] |
| maxLevel | Integer |  | [optional] |
| fetchLastLevelOnly | Boolean |  | [optional] |
| rootStateEntity | Boolean |  | [optional] |
| defaultStateEntity | AliasEntityId |  | [optional] |
| edgeTypes | List<String> |  | [optional] |

#### EdgeTypeFilter  *(extends EntityFilter, type=`edgeType`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| edgeTypes | List<String> |  | [optional] |
| edgeNameFilter | String |  | [optional] |
| edgeType | String |  | [optional] |

#### EntitiesByGroupNameFilter  *(extends EntityFilter, type=`entitiesByGroupName`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| groupType | EntityType |  | [optional] |
| ownerId | EntityId |  | [optional] |
| entityGroupNameFilter | String |  | [optional] |
| groupStateEntity | Boolean |  | [optional] |
| stateEntityParamName | String |  | [optional] |

#### EntityGroupFilter  *(extends EntityFilter, type=`entityGroup`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| groupType | EntityType |  | [optional] |
| entityGroup | String |  | [optional] |
| groupStateEntity | Boolean |  | [optional] |
| defaultStateGroupType | EntityType |  | [optional] |
| defaultStateEntityGroup | String |  | [optional] |

#### EntityGroupListFilter  *(extends EntityFilter, type=`entityGroupList`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| groupType | EntityType |  | [optional] |
| entityGroupList | List<String> |  | [optional] |

#### EntityGroupNameFilter  *(extends EntityFilter, type=`entityGroupName`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| groupType | EntityType |  | [optional] |
| entityGroupNameFilter | String |  | [optional] |

#### EntityListFilter  *(extends EntityFilter, type=`entityList`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| entityType | EntityType |  | [optional] |
| entityList | List<String> |  | [optional] |

#### EntityNameFilter  *(extends EntityFilter, type=`entityName`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| entityType | EntityType |  | [optional] |
| entityNameFilter | String |  | [optional] |

#### EntityTypeFilter  *(extends EntityFilter, type=`entityType`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| entityType | EntityType |  | [optional] |

#### EntityViewSearchQueryFilter  *(extends EntityFilter, type=`entityViewSearchQuery`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| rootEntity | AliasEntityId |  | [optional] |
| relationType | String |  | [optional] |
| direction | EntitySearchDirection |  | [optional] |
| maxLevel | Integer |  | [optional] |
| fetchLastLevelOnly | Boolean |  | [optional] |
| rootStateEntity | Boolean |  | [optional] |
| defaultStateEntity | AliasEntityId |  | [optional] |
| entityViewTypes | List<String> |  | [optional] |

#### EntityViewTypeFilter  *(extends EntityFilter, type=`entityViewType`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| entityViewTypes | List<String> |  | [optional] |
| entityViewNameFilter | String |  | [optional] |
| entityViewType | String |  | [optional] |

#### RelationsQueryFilter  *(extends EntityFilter, type=`relationsQuery`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| rootEntity | AliasEntityId |  | [optional] |
| multiRoot | Boolean |  | [optional] |
| multiRootEntitiesType | EntityType |  | [optional] |
| multiRootEntityIds | Set<String> |  | [optional] |
| direction | EntitySearchDirection |  | [optional] |
| filters | List<RelationEntityTypeFilter> |  | [optional] |
| maxLevel | Integer |  | [optional] |
| fetchLastLevelOnly | Boolean |  | [optional] |
| negate | Boolean |  | [optional] |
| rootStateEntity | Boolean |  | [optional] |
| defaultStateEntity | AliasEntityId |  | [optional] |

#### SchedulerEventFilter  *(extends EntityFilter, type=`schedulerEvent`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| originator | AliasEntityId |  | [optional] |
| eventType | String |  | [optional] |
| originatorStateEntity | Boolean |  | [optional] |
| defaultStateEntity | AliasEntityId |  | [optional] |

#### SingleEntityFilter  *(extends EntityFilter, type=`singleEntity`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| singleEntity | AliasEntityId |  | [optional] |

#### StateEntityFilter  *(extends EntityFilter, type=`stateEntity`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| defaultStateEntity | AliasEntityId |  | [optional] |

#### StateEntityOwnerFilter  *(extends EntityFilter, type=`stateEntityOwner`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| singleEntity | AliasEntityId |  | [optional] |
| defaultStateEntity | AliasEntityId |  | [optional] |

#### KeyFilter
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| key | EntityKey |  | [optional] |
| valueType | EntityKeyValueType |  | [optional] |
| predicate | KeyFilterPredicate |  | [optional] |

#### AlarmRuleComplexOperation (enum)
`AND` | `OR`

#### EntityDataPageLink
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| pageSize | Integer |  | [optional] |
| page | Integer |  | [optional] |
| textSearch | String |  | [optional] |
| sortOrder | EntityDataSortOrder |  | [optional] |
| dynamic | Boolean |  | [optional] |

#### EntityKey
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | EntityKeyType |  | [optional] |
| key | String |  | [optional] |

#### EntityKeyValueType (enum)
`STRING` | `NUMERIC` | `BOOLEAN` | `DATE_TIME`

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
| operation | AlarmRuleComplexOperation |  | [optional] |
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

#### EntityDataSortOrder
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| key | EntityKey |  | [optional] |
| direction | Direction |  | [optional] |

#### EntityKeyType (enum)
`ATTRIBUTE` | `CLIENT_ATTRIBUTE` | `SHARED_ATTRIBUTE` | `SERVER_ATTRIBUTE` | `TIME_SERIES` | `ENTITY_FIELD` | `ALARM_FIELD`

#### AliasEntityId
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| aliasEntityType | AliasEntityType |  | [optional] |
| entityType | EntityType |  |  |
| id | UUID | ID of the entity, time-based UUID v1 |  |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (46 values total)

#### EntitySearchDirection (enum)
`FROM` | `TO`

#### RelationEntityTypeFilter
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| relationType | String | Type of the relation between root entity and other entity (e.g. 'Contains' or 'Manages'). | [optional] |
| entityTypes | List<EntityType> | Array of entity types to filter the related entities (e.g. 'DEVICE', 'ASSET'). | [optional] |
| negate | Boolean | Negate relation type between root entity and other entity. | [optional] |

#### Direction (enum)
`ASC` | `DESC`

#### AliasEntityType (enum)
`CURRENT_CUSTOMER` | `CURRENT_TENANT` | `CURRENT_USER` | `CURRENT_USER_OWNER`

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

#### DynamicValueString
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| resolvedValue | String |  | [optional] |
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

#### DynamicValueSourceType (enum)
`CURRENT_TENANT` | `CURRENT_CUSTOMER` | `CURRENT_USER` | `CURRENT_DEVICE`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

