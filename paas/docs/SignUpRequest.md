
# SignUpRequest

`org.thingsboard.client.model.SignUpRequest`

A JSON value representing the signup request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **fields** | **Map\<String, String\>** | List of sign-up form fields | [optional] |
| **recaptchaResponse** | **String** | Response from reCAPTCHA validation | [optional] |
| **pkgName** | **String** | For mobile apps only. Mobile app package name | [optional] |
| **platform** | **PlatformType** | For mobile apps only. Mobile app package platform | [optional] |
| **appSecret** | **String** | For mobile apps only. Mobile app secret | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

