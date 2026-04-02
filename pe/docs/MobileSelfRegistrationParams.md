
# MobileSelfRegistrationParams

`org.thingsboard.client.model.MobileSelfRegistrationParams`

**Extends:** **SelfRegistrationParams**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **privacyPolicy** | **String** | Privacy policy text. Supports HTML. | [optional] |
| **redirect** | **MobileRedirectParams** | Mobile redirect params. | |
| **termsOfUse** | **String** | Terms of User text. Supports HTML. | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### SelfRegistrationParams
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | SelfRegistrationType |  |  |
| enabled | Boolean |  | [optional] |
| title | String |  | [optional] |
| captcha | CaptchaParams |  | [optional] |
| permissions | List<GroupPermission> |  | [optional] |
| notificationRecipient | NotificationTargetId |  | [optional] |
| signUpFields | List<SignUpField> |  | [optional] |
| customerTitlePrefix | String |  | [optional] |
| showPrivacyPolicy | Boolean |  | [optional] |
| showTermsOfUse | Boolean |  | [optional] |
| defaultDashboard | DefaultDashboardParams |  | [optional] |
| homeDashboard | HomeDashboardParams |  | [optional] |
| customerGroupId | EntityGroupId |  | [optional] |
| customMenuId | CustomMenuId |  | [optional] |

#### WebSelfRegistrationParams  *(extends SelfRegistrationParams, type=`WEB`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| domainId | DomainId | Domain name for self registration URL. Typically this matches the domain name from the Login White Labeling page. |  |
| privacyPolicy | String | Privacy policy text. Supports HTML. | [optional] |
| termsOfUse | String | Terms of User text. Supports HTML. | [optional] |

#### MobileRedirectParams
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| scheme | String | Mobile application verification settings. Used for callback to mobile application once user is registered. | [optional] |
| host | String | Mobile application verification settings. Used for callback to mobile application once user is registered. | [optional] |

#### SelfRegistrationType (enum)
`WEB` | `MOBILE`

#### CaptchaParams
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| version | String |  |  |

#### EnterpriseCaptchaParams  *(extends CaptchaParams, version=`enterprise`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| projectId | String | Your Google Cloud project ID | [optional] |
| serviceAccountCredentials | String | Service account credentials | [optional] |
| serviceAccountCredentialsFileName | String | Service account credentials file name | [optional] |
| androidKey | String | The reCAPTCHA key associated with android app. | [optional] |
| iosKey | String | The reCAPTCHA key associated with iOS app. | [optional] |
| logActionName | String | Optional action name used for logging | [optional] |

#### V2CaptchaParams  *(extends CaptchaParams, version=`v2`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| siteKey | String | Captcha site key for 'I'm not a robot' validation | [optional] |
| logActionName | String | Optional action name used for logging (for captcha version 'v3' and 'enterprise') | [optional] |
| secretKey | String | Secret key to validate the Captcha. Should match the Captcha Site Key. | [optional] |

#### V3CaptchaParams  *(extends CaptchaParams, version=`v3`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| siteKey | String | Captcha site key for 'I'm not a robot' validation | [optional] |
| logActionName | String | Optional action name used for logging (for captcha version 'v3' and 'enterprise') | [optional] |
| secretKey | String | Secret key to validate the Captcha. Should match the Captcha Site Key. | [optional] |

#### GroupPermission
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | GroupPermissionId | JSON object with the Group Permission Id. Specify this field to update the Group Permission. Referencing non-existing Group Permission Id will cause error. Omit this field to create new Group Permission. | [optional] |
| createdTime | Long | Timestamp of the group permission creation, in milliseconds | [optional] [readonly] |
| tenantId | TenantId | JSON object with the Tenant Id. | [optional] [readonly] |
| userGroupId | EntityGroupId | JSON object with the User Group Id. Represents the user group that will have permissions to perform operations against the corresponding entity group. |  |
| roleId | RoleId | JSON object with the Role Id. Represents the set of permissions. The role type (GENERIC or GROUP) determines whether 'entityGroupId' is required. |  |
| entityGroupId | EntityGroupId | JSON object with the Entity Group Id. Required when using a GROUP role — specifies the entity group to which the permissions apply. Must be null or omitted when using a GENERIC role. | [optional] |
| entityGroupType | EntityType | Type of the entities in the group: DEVICE, ASSET, CUSTOMER, etc. Auto-populated from the referenced entity group. Null for generic permissions. | [optional] [readonly] |
| isPublic | Boolean |  | [optional] |
| name | String | Name of the Group Permissions. Auto-generated | [optional] [readonly] |
| _public | Boolean |  | [optional] |

#### SignUpField
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | SignUpFieldId | Signup field id |  |
| label | String | Signup field label |  |
| required | Boolean | Indicates if field is required | [optional] |

#### DefaultDashboardParams
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | String | Default dashboard Id to assign for the new user. | [optional] |
| fullscreen | Boolean | Set default dashboard to full screen mode. | [optional] |

#### HomeDashboardParams
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | String | Home dashboard Id to assign for the new user. | [optional] |
| hideToolbar | Boolean | Indicates if hide toolbar should be hidden. | [optional] |

#### CustomMenuId
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | UUID | string |  |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (46 values total)

#### SignUpFieldId (enum)
`EMAIL` | `PASSWORD` | `REPEAT_PASSWORD` | `FIRST_NAME` | `LAST_NAME` | `PHONE` | `COUNTRY` | `CITY` | `STATE` | `ZIP` | … (12 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

