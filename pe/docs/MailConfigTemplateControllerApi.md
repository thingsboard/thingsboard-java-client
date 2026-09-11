# MailConfigTemplateControllerApi

`ThingsboardClient` methods:

> Every method that takes input also has a request-object overload — `<method>(<Method>Args args)`,
> built via `<Method>Args.builder()...build()`. The `*Args` classes are nested in `ThingsboardApi`,
> e.g. `import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Prefer that overload in
> new code: adding an optional parameter to an endpoint changes the flat signatures documented
> below, but only adds a builder field to `*Args`.

```
com.fasterxml.jackson.databind.JsonNode getMailConfigTemplates() // Get the list of all OAuth2 client registration templates (getMailConfigTemplates)  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.
```


## getMailConfigTemplates

```
com.fasterxml.jackson.databind.JsonNode getMailConfigTemplates()
```

**GET** `/api/mail/config/template`

Get the list of all OAuth2 client registration templates (getMailConfigTemplates)  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

Mail configuration template is set of default smtp settings for mail server that specific provider supports

### Return type

**com.fasterxml.jackson.databind.JsonNode**

