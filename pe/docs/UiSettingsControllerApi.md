# UiSettingsControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
String getHelpBaseUrl() // Get UI help base url (getHelpBaseUrl)
```


## getHelpBaseUrl

**GET** `/api/uiSettings/helpBaseUrl`

Get UI help base url (getHelpBaseUrl)

Get UI help base url used to fetch help assets. The actual value of the base url is configurable in the system configuration file.

```java
String getHelpBaseUrl()
```

### Return type

`String`

