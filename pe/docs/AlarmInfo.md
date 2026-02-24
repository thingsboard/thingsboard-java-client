

# AlarmInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**AlarmId**](AlarmId.md) | JSON object with the alarm Id. Specify this field to update the alarm. Referencing non-existing alarm Id will cause error. Omit this field to create new alarm. |  [optional] |
|**createdTime** | **Long** | Timestamp of the alarm creation, in milliseconds |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id |  [optional] [readonly] |
|**customerId** | [**CustomerId**](CustomerId.md) | JSON object with Customer Id |  [optional] [readonly] |
|**type** | **String** | representing type of the Alarm |  |
|**originator** | [**EntityId**](EntityId.md) | JSON object with alarm originator id |  |
|**severity** | **AlarmSeverity** | Alarm severity |  |
|**acknowledged** | **Boolean** | Acknowledged |  |
|**cleared** | **Boolean** | Cleared |  |
|**assigneeId** | [**UserId**](UserId.md) | Alarm assignee user id |  [optional] |
|**startTs** | **Long** | Timestamp of the alarm start time, in milliseconds |  [optional] |
|**endTs** | **Long** | Timestamp of the alarm end time(last time update), in milliseconds |  [optional] |
|**ackTs** | **Long** | Timestamp of the alarm acknowledgement, in milliseconds |  [optional] |
|**clearTs** | **Long** | Timestamp of the alarm clearing, in milliseconds |  [optional] |
|**assignTs** | **Long** | Timestamp of the alarm assignment, in milliseconds |  [optional] |
|**propagate** | **Boolean** | Propagation flag to specify if alarm should be propagated to parent entities of alarm originator |  [optional] |
|**propagateToOwner** | **Boolean** | Propagation flag to specify if alarm should be propagated to the owner (tenant or customer) of alarm originator |  [optional] |
|**propagateToOwnerHierarchy** | **Boolean** | Propagation flag to specify if alarm should be propagated to the owner (tenant or customer) and all parent owners in the customer hierarchy |  [optional] |
|**propagateToTenant** | **Boolean** | Propagation flag to specify if alarm should be propagated to the tenant entity |  [optional] |
|**propagateRelationTypes** | **List&lt;String&gt;** | JSON array of relation types that should be used for propagation. By default, &#39;propagateRelationTypes&#39; array is empty which means that the alarm will be propagated based on any relation type to parent entities. This parameter should be used only in case when &#39;propagate&#39; parameter is set to true, otherwise, &#39;propagateRelationTypes&#39; array will be ignored. |  [optional] |
|**originatorName** | **String** | Alarm originator name |  [optional] |
|**originatorLabel** | **String** | Alarm originator label |  [optional] |
|**originatorDisplayName** | **String** | Originator display name |  [optional] |
|**assignee** | [**AlarmAssignee**](AlarmAssignee.md) | Alarm assignee |  [optional] |
|**name** | **String** | representing type of the Alarm |  [readonly] |
|**status** | **AlarmStatus** | status of the Alarm |  [readonly] |
|**details** | **com.fasterxml.jackson.databind.JsonNode** |  |  [optional] |



