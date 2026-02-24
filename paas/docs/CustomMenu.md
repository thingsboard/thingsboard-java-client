

# CustomMenu


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**CustomMenuId**](CustomMenuId.md) |  |  [optional] |
|**createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id that owns the menu. |  [optional] [readonly] |
|**customerId** | [**CustomerId**](CustomerId.md) | JSON object with Customer Id that owns the menu. |  [optional] [readonly] |
|**name** | **String** | Custom menu name |  |
|**scope** | **CMScope** | Custom menu scope. Possible values: SYSTEM, TENANT, CUSTOMER |  |
|**assigneeType** | **CMAssigneeType** | Custom menu assignee type. Possible values are: All (all users of specified scope), CUSTOMERS (specified customers), USERS (specified list of users), NO_ASSIGN (no assignees), USER_GROUPS (user groups) |  |
|**userGroupNames** | **List&lt;String&gt;** | User group names menu is applied to |  [optional] |
|**config** | [**CustomMenuConfig**](CustomMenuConfig.md) | Custom menu configuration |  [optional] |



