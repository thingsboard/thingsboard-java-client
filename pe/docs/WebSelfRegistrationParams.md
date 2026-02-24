

# WebSelfRegistrationParams


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | Indicates if self-registration is allowed via sign-up form |  [optional] |
|**title** | **String** | The text message to appear on login form |  |
|**captcha** | [**CaptchaParams**](CaptchaParams.md) | Captcha site key for &#39;I&#39;m not a robot&#39; validation |  |
|**signUpFields** | [**List&lt;SignUpField&gt;**](SignUpField.md) | List of sign-up form fields |  |
|**showPrivacyPolicy** | **Boolean** | Show or hide &#39;Privacy Policy&#39; |  [optional] |
|**showTermsOfUse** | **Boolean** | Show or hide &#39;Terms of Use&#39; |  [optional] |
|**notificationRecipient** | [**NotificationTargetId**](NotificationTargetId.md) | Recipient to use for notifications when new user self-registered. |  [optional] |
|**customerTitlePrefix** | **String** | Prefix to add to created customer |  [optional] |
|**customerGroupId** | [**EntityGroupId**](EntityGroupId.md) | Id of the customer group customer wil be added to. |  [optional] |
|**permissions** | [**List&lt;GroupPermission&gt;**](GroupPermission.md) | Group Permissions to assign for the new customer user. |  |
|**defaultDashboard** | [**DefaultDashboardParams**](DefaultDashboardParams.md) | Default dashboard params |  [optional] |
|**homeDashboard** | [**HomeDashboardParams**](HomeDashboardParams.md) | Home dashboard params |  [optional] |
|**customMenuId** | [**CustomMenuId**](CustomMenuId.md) | Custom menu id |  [optional] |
|**privacyPolicy** | **String** | Privacy policy text. Supports HTML. |  [optional] |
|**termsOfUse** | **String** | Terms of User text. Supports HTML. |  [optional] |
|**domainId** | [**DomainId**](DomainId.md) | Domain name for self registration URL. Typically this matches the domain name from the Login White Labeling page. |  |



