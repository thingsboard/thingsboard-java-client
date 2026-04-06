
# DeviceSearchQueryFilter

`org.thingsboard.client.model.DeviceSearchQueryFilter`

**Extends:** **EntityFilter**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **rootEntity** | **AliasEntityId** |  | [optional] |
| **relationType** | **String** |  | [optional] |
| **direction** | **EntitySearchDirection** |  | [optional] |
| **maxLevel** | **Integer** |  | [optional] |
| **fetchLastLevelOnly** | **Boolean** |  | [optional] |
| **rootStateEntity** | **Boolean** |  | [optional] |
| **defaultStateEntity** | **AliasEntityId** |  | [optional] |
| **deviceTypes** | **List\<String\>** |  | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `CalculatedFieldId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityViewId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

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

#### SingleEntityFilter  *(extends EntityFilter, type=`singleEntity`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| singleEntity | AliasEntityId |  | [optional] |

#### AliasEntityId
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| aliasEntityType | AliasEntityType |  | [optional] |
| entityType | EntityType |  |  |
| id | UUID | ID of the entity, time-based UUID v1 |  |

#### EntitySearchDirection (enum)
`FROM` | `TO`

#### AliasEntityType (enum)
`CURRENT_CUSTOMER` | `CURRENT_TENANT` | `CURRENT_USER` | `CURRENT_USER_OWNER`

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `RULE_CHAIN` | `RULE_NODE` | `ENTITY_VIEW` | … (36 values total)

#### RelationEntityTypeFilter
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| relationType | String | Type of the relation between root entity and other entity (e.g. 'Contains' or 'Manages'). | [optional] |
| entityTypes | List<EntityType> | Array of entity types to filter the related entities (e.g. 'DEVICE', 'ASSET'). | [optional] |
| negate | Boolean | Negate relation type between root entity and other entity. | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

