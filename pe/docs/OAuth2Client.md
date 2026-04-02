
# OAuth2Client

`org.thingsboard.client.model.OAuth2Client`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **OAuth2ClientId** |  | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional info of OAuth2 client. Must include: 'providerName' (string, name of the OAuth2 provider). | |
| **tenantId** | **TenantId** | JSON object with Tenant Id | [optional] |
| **customerId** | **CustomerId** | JSON object with Customer Id | [optional] |
| **title** | **String** | Oauth2 client title | |
| **mapperConfig** | **OAuth2MapperConfig** | Config for mapping OAuth2 log in response to platform entities | |
| **clientId** | **String** | OAuth2 client ID. Cannot be empty | |
| **clientSecret** | **String** | OAuth2 client secret. Cannot be empty | |
| **authorizationUri** | **String** | Authorization URI of the OAuth2 provider. Cannot be empty | |
| **accessTokenUri** | **String** | Access token URI of the OAuth2 provider. Cannot be empty | |
| **scope** | **List\<String\>** | OAuth scopes that will be requested from OAuth2 platform. Cannot be empty | |
| **userInfoUri** | **String** | User info URI of the OAuth2 provider | [optional] |
| **userNameAttributeName** | **String** | Name of the username attribute in OAuth2 provider response. Cannot be empty | |
| **jwkSetUri** | **String** | JSON Web Key URI of the OAuth2 provider | [optional] |
| **clientAuthenticationMethod** | **String** | Client authentication method to use: 'BASIC' or 'POST'. Cannot be empty | |
| **loginButtonLabel** | **String** | OAuth2 provider label. Cannot be empty | |
| **loginButtonIcon** | **String** | Log in button icon for OAuth2 provider | [optional] |
| **platforms** | **List\<PlatformType\>** | List of platforms for which usage of the OAuth2 client is allowed (empty for all allowed) | [optional] |
| **name** | **String** |  | [optional] [readonly] |
| **ownerId** | **EntityId** |  | [optional] [readonly] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### OAuth2MapperConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| allowUserCreation | Boolean | Whether user should be created if not yet present on the platform after successful authentication | [optional] |
| activateUser | Boolean | Whether user credentials should be activated when user is created after successful authentication | [optional] |
| type | MapperType | Type of OAuth2 mapper. Depending on this param, different mapper config fields must be specified |  |
| basic | OAuth2BasicMapperConfig | Mapper config for BASIC and GITHUB mapper types | [optional] |
| custom | OAuth2CustomMapperConfig | Mapper config for CUSTOM mapper type | [optional] |

#### PlatformType (enum)
`WEB` | `ANDROID` | `IOS`

#### MapperType (enum)
`BASIC` | `CUSTOM` | `GITHUB` | `APPLE`

#### OAuth2BasicMapperConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| emailAttributeKey | String | Email attribute key of OAuth2 principal attributes. Must be specified for BASIC mapper type and cannot be specified for GITHUB type | [optional] |
| firstNameAttributeKey | String | First name attribute key | [optional] |
| lastNameAttributeKey | String | Last name attribute key | [optional] |
| tenantNameStrategy | TenantNameStrategyType | Tenant naming strategy. For DOMAIN type, domain for tenant name will be taken from the email (substring before '@') |  |
| tenantNamePattern | String | Tenant name pattern for CUSTOM naming strategy. OAuth2 attributes in the pattern can be used by enclosing attribute key in '%{' and '}' | [optional] |
| customerNamePattern | String | Customer name pattern. When creating a user on the first OAuth2 log in, if specified, customer name will be used to create or find existing customer in the platform and assign customerId to the user | [optional] |
| defaultDashboardName | String | Name of the tenant's dashboard to set as default dashboard for newly created user | [optional] |
| alwaysFullScreen | Boolean | Whether default dashboard should be open in full screen | [optional] |
| parentCustomerNamePattern | String |  | [optional] |
| userGroupsNamePattern | List<String> |  | [optional] |

#### OAuth2CustomMapperConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| url | String |  | [optional] |
| username | String |  | [optional] |
| password | String |  | [optional] |
| sendToken | Boolean |  | [optional] |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (46 values total)

#### TenantNameStrategyType (enum)
`DOMAIN` | `EMAIL` | `CUSTOM`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

