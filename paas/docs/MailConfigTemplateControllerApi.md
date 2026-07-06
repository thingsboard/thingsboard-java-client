# MailConfigTemplateControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
com.fasterxml.jackson.databind.JsonNode getMailConfigTemplates() // Get the list of all OAuth2 client registration templates (getMailConfigTemplates)  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.
```


## getMailConfigTemplates

**GET** `/api/mail/config/template`

Get the list of all OAuth2 client registration templates (getMailConfigTemplates)  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

Mail configuration template is set of default smtp settings for mail server that specific provider supports

```java
com.fasterxml.jackson.databind.JsonNode getMailConfigTemplates()
```

### Return type

`com.fasterxml.jackson.databind.JsonNode`

