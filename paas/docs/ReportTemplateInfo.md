

# ReportTemplateInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**ReportTemplateId**](ReportTemplateId.md) | JSON object with the report template Id. Specify this field to update the report. Referencing non-existing report template Id will cause error. Omit this field to create new report template |  [optional] |
|**createdTime** | **Long** | Timestamp of the report template creation, in milliseconds |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id. Tenant Id of the report template can&#39;t be changed. |  [optional] [readonly] |
|**customerId** | [**CustomerId**](CustomerId.md) | JSON object with Customer Id |  [optional] [readonly] |
|**name** | **String** | Report name |  |
|**format** | **TbReportFormat** | Report format |  |
|**type** | **ReportTemplateType** | Report template type |  |
|**description** | **String** | Description |  [optional] |
|**version** | **Long** |  |  [optional] |
|**ownerName** | **String** | Owner name |  [optional] [readonly] |
|**ownerId** | [**EntityId**](EntityId.md) | JSON object with Customer or Tenant Id |  [optional] [readonly] |



