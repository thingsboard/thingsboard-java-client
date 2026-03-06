# MailConfigTemplateControllerApi

`ThingsboardClient` methods:

```
com.fasterxml.jackson.databind.JsonNode getClientRegistrationTemplates() // Get the list of all OAuth2 client registration templates (getClientRegistrationTemplates)  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.
```


## getClientRegistrationTemplates

```
com.fasterxml.jackson.databind.JsonNode getClientRegistrationTemplates()
```

**GET** `/api/mail/config/template`

Get the list of all OAuth2 client registration templates (getClientRegistrationTemplates)  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

Mail configuration template is set of default smtp settings for mail server that specific provider supports

### Return type

**com.fasterxml.jackson.databind.JsonNode**

