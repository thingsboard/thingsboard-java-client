
# CustomMenu

`org.thingsboard.client.model.CustomMenu`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **CustomMenuId** |  | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with Tenant Id that owns the menu. | [optional] [readonly] |
| **customerId** | **CustomerId** | JSON object with Customer Id that owns the menu. | [optional] [readonly] |
| **name** | **String** | Custom menu name | |
| **scope** | **CMScope** | Custom menu scope. Possible values: SYSTEM, TENANT, CUSTOMER | |
| **assigneeType** | **CMAssigneeType** | Custom menu assignee type. Possible values are: All (all users of specified scope), CUSTOMERS (specified customers), USERS (specified list of users), NO_ASSIGN (no assignees), USER_GROUPS (user groups) | |
| **userGroupNames** | **List\<String\>** | User group names menu is applied to | [optional] |
| **config** | **CustomMenuConfig** | Custom menu configuration | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

