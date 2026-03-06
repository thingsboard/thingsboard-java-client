
# User

`org.thingsboard.client.model.User`

A JSON value representing the User.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **UserId** | JSON object with the User Id. Specify this field to update the device. Referencing non-existing User Id will cause error. Omit this field to create new customer. | [optional] |
| **createdTime** | **Long** | Timestamp of the user creation, in milliseconds | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with the Tenant Id. | [optional] |
| **customerId** | **CustomerId** | JSON object with the Customer Id. | [optional] |
| **email** | **String** | Email of the user | |
| **authority** | **Authority** | Authority | |
| **firstName** | **String** | First name of the user | [optional] |
| **lastName** | **String** | Last name of the user | [optional] |
| **phone** | **String** | Phone number of the user | [optional] |
| **customMenuId** | **CustomMenuId** |  | [optional] |
| **version** | **Long** |  | [optional] |
| **name** | **String** | Duplicates the email of the user, readonly | [optional] [readonly] |
| **ownerId** | **EntityId** | JSON object with Customer or Tenant Id | [optional] [readonly] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the user. May include: 'defaultDashboardId' (string, UUID of the default dashboard), 'defaultDashboardFullscreen' (boolean), 'homeDashboardId' (string, UUID of the home dashboard), 'homeDashboardHideToolbar' (boolean), 'lang' (string, user locale, e.g. 'en_US'), 'authProviderName' (string, name of the authentication provider). | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

