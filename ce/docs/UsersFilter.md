
# UsersFilter

`org.thingsboard.client.model.UsersFilter`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **type** | **String** |  | |



## Subtypes

#### AffectedTenantAdministratorsFilter  *(type=`AFFECTED_TENANT_ADMINISTRATORS`)*
*(no additional properties)*

#### AffectedUserFilter  *(type=`AFFECTED_USER`)*
*(no additional properties)*

#### AllUsersFilter  *(type=`ALL_USERS`)*
*(no additional properties)*

#### CustomerUsersFilter  *(type=`CUSTOMER_USERS`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| customerId | UUID |  |  |

#### OriginatorEntityOwnerUsersFilter  *(type=`ORIGINATOR_ENTITY_OWNER_USERS`)*
*(no additional properties)*

#### SystemAdministratorsFilter  *(type=`SYSTEM_ADMINISTRATORS`)*
*(no additional properties)*

#### TenantAdministratorsFilter  *(type=`TENANT_ADMINISTRATORS`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| tenantsIds | Set<UUID> |  | [optional] |
| tenantProfilesIds | Set<UUID> |  | [optional] |

#### UserListFilter  *(type=`USER_LIST`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| usersIds | List<UUID> |  |  |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

