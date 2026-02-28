
# OAuth2BasicMapperConfig

`org.thingsboard.client.model.OAuth2BasicMapperConfig`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **emailAttributeKey** | **String** | Email attribute key of OAuth2 principal attributes. Must be specified for BASIC mapper type and cannot be specified for GITHUB type | [optional] |
| **firstNameAttributeKey** | **String** | First name attribute key | [optional] |
| **lastNameAttributeKey** | **String** | Last name attribute key | [optional] |
| **tenantNameStrategy** | **TenantNameStrategyType** | Tenant naming strategy. For DOMAIN type, domain for tenant name will be taken from the email (substring before '@') | |
| **tenantNamePattern** | **String** | Tenant name pattern for CUSTOM naming strategy. OAuth2 attributes in the pattern can be used by enclosing attribute key in '%{' and '}' | [optional] |
| **customerNamePattern** | **String** | Customer name pattern. When creating a user on the first OAuth2 log in, if specified, customer name will be used to create or find existing customer in the platform and assign customerId to the user | [optional] |
| **defaultDashboardName** | **String** | Name of the tenant's dashboard to set as default dashboard for newly created user | [optional] |
| **alwaysFullScreen** | **Boolean** | Whether default dashboard should be open in full screen | [optional] |
| **parentCustomerNamePattern** | **String** |  | [optional] |
| **userGroupsNamePattern** | **List\<String\>** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

