

# TbResource

A JSON value representing the Resource.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**TbResourceId**](TbResourceId.md) | JSON object with the Resource Id. Specify this field to update the Resource. Referencing non-existing Resource Id will cause error. Omit this field to create new Resource. |  [optional] |
|**createdTime** | **Long** | Timestamp of the resource creation, in milliseconds |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id. Tenant Id of the resource can&#39;t be changed. |  [optional] |
|**customerId** | [**CustomerId**](CustomerId.md) | JSON object with Customer Id. Customer Id of the resource can&#39;t be changed. |  [optional] [readonly] |
|**title** | **String** | Resource title. |  [optional] |
|**resourceType** | **ResourceType** | Resource type. |  [optional] |
|**resourceSubType** | **ResourceSubType** | Resource sub type. |  [optional] |
|**resourceKey** | **String** | Resource key. |  [optional] |
|**publicResourceKey** | **String** | Public resource key. |  [optional] |
|**etag** | **String** | Resource etag. |  [optional] [readonly] |
|**fileName** | **String** | Resource file name. |  [optional] |
|**descriptor** | **com.fasterxml.jackson.databind.JsonNode** | Resource descriptor. |  [optional] |
|**name** | **String** |  |  [optional] [readonly] |
|**_public** | **Boolean** |  |  [optional] |
|**publicLink** | **String** |  |  [optional] [readonly] |
|**link** | **String** |  |  [optional] [readonly] |
|**preview** | **String** |  |  [optional] |
|**data** | **String** | Resource data. |  [optional] |



