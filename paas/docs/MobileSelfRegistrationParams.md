
# MobileSelfRegistrationParams

`org.thingsboard.client.model.MobileSelfRegistrationParams`

**Extends:** **SelfRegistrationParams**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **enabled** | **Boolean** | Indicates if self-registration is allowed via sign-up form | [optional] |
| **title** | **String** | The text message to appear on login form | |
| **captcha** | **CaptchaParams** | Captcha site key for 'I'm not a robot' validation | |
| **signUpFields** | **List\<SignUpField\>** | List of sign-up form fields | |
| **showPrivacyPolicy** | **Boolean** | Show or hide 'Privacy Policy' | [optional] |
| **showTermsOfUse** | **Boolean** | Show or hide 'Terms of Use' | [optional] |
| **notificationRecipient** | **NotificationTargetId** | Recipient to use for notifications when new user self-registered. | [optional] |
| **customerTitlePrefix** | **String** | Prefix to add to created customer | [optional] |
| **customerGroupId** | **EntityGroupId** | Id of the customer group customer wil be added to. | [optional] |
| **permissions** | **List\<GroupPermission\>** | Group Permissions to assign for the new customer user. | |
| **defaultDashboard** | **DefaultDashboardParams** | Default dashboard params | [optional] |
| **homeDashboard** | **HomeDashboardParams** | Home dashboard params | [optional] |
| **customMenuId** | **CustomMenuId** | Custom menu id | [optional] |
| **privacyPolicy** | **String** | Privacy policy text. Supports HTML. | [optional] |
| **termsOfUse** | **String** | Terms of User text. Supports HTML. | [optional] |
| **redirect** | **MobileRedirectParams** | Mobile redirect params. | |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

