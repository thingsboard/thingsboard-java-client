

# Tenant

A JSON value representing the tenant.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**TenantId**](TenantId.md) | JSON object with the tenant Id. Specify this field to update the tenant. Referencing non-existing tenant Id will cause error. Omit this field to create new tenant. |  [optional] |
|**createdTime** | **Long** | Timestamp of the tenant creation, in milliseconds |  [optional] [readonly] |
|**country** | **String** | Country |  [optional] |
|**state** | **String** | State |  [optional] |
|**city** | **String** | City |  [optional] |
|**address** | **String** | Address Line 1 |  [optional] |
|**address2** | **String** | Address Line 2 |  [optional] |
|**zip** | **String** | Zip code |  [optional] |
|**phone** | **String** | Phone number |  [optional] |
|**email** | **String** | Email |  [optional] |
|**title** | **String** | Title of the tenant |  |
|**region** | **String** | Geo region of the tenant |  [optional] |
|**tenantProfileId** | [**TenantProfileId**](TenantProfileId.md) | JSON object with Tenant Profile Id |  [optional] |
|**version** | **Long** |  |  [optional] |
|**active** | **Boolean** |  |  [optional] |
|**lastInactiveTs** | **Long** |  |  [optional] |
|**currentPeriodStartTs** | **Long** |  |  [optional] |
|**edgeLicenseVersion** | **Integer** |  |  [optional] |
|**name** | **String** | Name of the tenant. Read-only, duplicated from title for backward compatibility |  [optional] [readonly] |
|**additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the device |  [optional] |
|**addonData** | [**TenantAddonData**](TenantAddonData.md) |  |  [optional] |



