

# RPKLwM2MBootstrapServerCredential


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**shortServerId** | **Integer** | Server short Id. Used as link to associate server Object Instance. This identifier uniquely identifies each LwM2M Server configured for the LwM2M Client. This Resource MUST be set when the Bootstrap-Server Resource has a value of &#39;false&#39;. The values ID:0 and ID:65535 values MUST NOT be used for identifying the LwM2M Server. |  [optional] [readonly] |
|**bootstrapServerIs** | **Boolean** | Is Bootstrap Server or Lwm2m Server. The LwM2M Client MAY be configured to use one or more LwM2M Server Account(s). The LwM2M Client MUST have at most one LwM2M Bootstrap-Server Account. (*) The LwM2M client MUST have at least one LwM2M server account after completing the boot sequence specified. |  [optional] [readonly] |
|**host** | **String** | Host for &#39;No Security&#39; mode |  [optional] [readonly] |
|**port** | **Integer** | Port for  Lwm2m Server: &#39;No Security&#39; mode: Lwm2m Server or Bootstrap Server |  [optional] [readonly] |
|**clientHoldOffTime** | **Integer** | Client Hold Off Time. The number of seconds to wait before initiating a Client Initiated Bootstrap once the LwM2M Client has determined it should initiate this bootstrap mode. (This information is relevant for use with a Bootstrap-Server only.) |  [optional] [readonly] |
|**serverPublicKey** | **String** | Server Public Key for &#39;Security&#39; mode (DTLS): RPK or X509. Format: base64 encoded |  [optional] [readonly] |
|**serverCertificate** | **String** | Server Public Key for &#39;Security&#39; mode (DTLS): X509. Format: base64 encoded |  [optional] [readonly] |
|**bootstrapServerAccountTimeout** | **Integer** | Bootstrap Server Account Timeout (If the value is set to 0, or if this resource is not instantiated, the Bootstrap-Server Account lifetime is infinite.) |  [optional] [readonly] |
|**lifetime** | **Integer** | Specify the lifetime of the registration in seconds. |  [optional] [readonly] |
|**defaultMinPeriod** | **Integer** | The default value the LwM2M Client should use for the Minimum Period of an Observation in the absence of this parameter being included in an Observation. If this Resource doesn’t exist, the default value is 0. |  [optional] [readonly] |
|**notifIfDisabled** | **Boolean** | If true, the LwM2M Client stores “Notify” operations to the LwM2M Server while the LwM2M Server account is disabled or the LwM2M Client is offline. After the LwM2M Server account is enabled or the LwM2M Client is online, the LwM2M Client reports the stored “Notify” operations to the Server. If false, the LwM2M Client discards all the “Notify” operations or temporarily disables the Observe function while the LwM2M Server is disabled or the LwM2M Client is offline. The default value is true. |  [optional] [readonly] |
|**binding** | **String** | This Resource defines the transport binding configured for the LwM2M Client. If the LwM2M Client supports the binding specified in this Resource, the LwM2M Client MUST use that transport for the Current Binding Mode. |  [optional] [readonly] |



