
# SelfRegistrationParams

`org.thingsboard.client.model.SelfRegistrationParams`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **permissions** | **List\<GroupPermission\>** |  | [optional] |
| **type** | **SelfRegistrationType** |  | |
| **showPrivacyPolicy** | **Boolean** |  | [optional] |
| **showTermsOfUse** | **Boolean** |  | [optional] |
| **title** | **String** |  | [optional] |
| **enabled** | **Boolean** |  | [optional] |
| **homeDashboard** | **HomeDashboardParams** |  | [optional] |
| **notificationRecipient** | **NotificationTargetId** |  | [optional] |
| **captcha** | **CaptchaParams** |  | [optional] |
| **signUpFields** | **List\<SignUpField\>** |  | [optional] |
| **defaultDashboard** | **DefaultDashboardParams** |  | [optional] |
| **customerTitlePrefix** | **String** |  | [optional] |
| **customMenuId** | **CustomMenuId** |  | [optional] |
| **customerGroupId** | **EntityGroupId** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

