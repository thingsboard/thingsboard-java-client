

# EdgeInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**EdgeId**](EdgeId.md) | JSON object with the Edge Id. Specify this field to update the Edge. Referencing non-existing Edge Id will cause error. Omit this field to create new Edge. |  [optional] |
|**createdTime** | **Long** | Timestamp of the edge creation, in milliseconds |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id. Use &#39;assignDeviceToTenant&#39; to change the Tenant Id. |  [optional] [readonly] |
|**customerId** | [**CustomerId**](CustomerId.md) | JSON object with Customer Id. Use &#39;assignEdgeToCustomer&#39; to change the Customer Id. |  [optional] [readonly] |
|**rootRuleChainId** | [**RuleChainId**](RuleChainId.md) | JSON object with Root Rule Chain Id. Use &#39;setEdgeRootRuleChain&#39; to change the Root Rule Chain Id. |  [optional] [readonly] |
|**name** | **String** | Unique Edge Name in scope of Tenant |  |
|**type** | **String** | Edge type |  |
|**label** | **String** | Label that may be used in widgets |  [optional] |
|**routingKey** | **String** | Edge routing key (&#39;username&#39;) to authorize on cloud |  |
|**secret** | **String** | Edge secret (&#39;password&#39;) to authorize on cloud |  |
|**edgeLicenseKey** | **String** | Edge license key obtained from license portal |  |
|**cloudEndpoint** | **String** | Edge uses this cloud URL to activate and periodically check it&#39;s license |  |
|**version** | **Long** |  |  [optional] |
|**ownerName** | **String** | Owner name |  [optional] [readonly] |
|**groups** | [**List&lt;EntityInfo&gt;**](EntityInfo.md) | Groups |  [optional] |
|**ownerId** | [**EntityId**](EntityId.md) |  |  [optional] [readonly] |
|**additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** |  |  [optional] |



