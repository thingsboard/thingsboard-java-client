
# DeviceCredentials

`org.thingsboard.client.model.DeviceCredentials`

A JSON value representing the device credentials.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **DeviceCredentialsId** | The Id is automatically generated during device creation. Use 'getDeviceCredentialsByDeviceId' to obtain the id based on device id. Use 'updateDeviceCredentials' to update device credentials.  | [readonly] |
| **createdTime** | **Long** | Timestamp of the device credentials creation, in milliseconds | [optional] |
| **deviceId** | **DeviceId** | JSON object with the device Id. | |
| **credentialsType** | **DeviceCredentialsType** | Type of the credentials | [optional] |
| **credentialsId** | **String** | Unique Credentials Id per platform instance. Used to lookup credentials from the database. By default, new access token for your device. Depends on the type of the credentials. | |
| **credentialsValue** | **String** | Value of the credentials. Null in case of ACCESS_TOKEN credentials type. Base64 value in case of X509_CERTIFICATE. Complex object in case of MQTT_BASIC and LWM2M_CREDENTIALS | [optional] |
| **version** | **Long** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

