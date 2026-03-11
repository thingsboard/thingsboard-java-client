
# SelfRegistrationParams

`org.thingsboard.client.model.SelfRegistrationParams`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **type** | **SelfRegistrationType** |  | |
| **enabled** | **Boolean** |  | [optional] |
| **title** | **String** |  | [optional] |
| **captcha** | **CaptchaParams** |  | [optional] |
| **permissions** | **List\<GroupPermission\>** |  | [optional] |
| **notificationRecipient** | **NotificationTargetId** |  | [optional] |
| **signUpFields** | **List\<SignUpField\>** |  | [optional] |
| **customerTitlePrefix** | **String** |  | [optional] |
| **showPrivacyPolicy** | **Boolean** |  | [optional] |
| **showTermsOfUse** | **Boolean** |  | [optional] |
| **defaultDashboard** | **DefaultDashboardParams** |  | [optional] |
| **homeDashboard** | **HomeDashboardParams** |  | [optional] |
| **customerGroupId** | **EntityGroupId** |  | [optional] |
| **customMenuId** | **CustomMenuId** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

