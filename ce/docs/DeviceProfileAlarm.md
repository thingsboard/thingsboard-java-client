

# DeviceProfileAlarm


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | String value representing the alarm rule id |  [optional] |
|**alarmType** | **String** | String value representing type of the alarm |  [optional] |
|**createRules** | [**Map&lt;String, AlarmRule&gt;**](AlarmRule.md) | Complex JSON object representing create alarm rules. The unique create alarm rule can be created for each alarm severity type. There can be 5 create alarm rules configured per a single alarm type. See method implementation notes and AlarmRule model for more details |  [optional] |
|**clearRule** | [**AlarmRule**](AlarmRule.md) | JSON object representing clear alarm rule |  [optional] |
|**propagate** | **Boolean** | Propagation flag to specify if alarm should be propagated to parent entities of alarm originator |  [optional] |
|**propagateToOwner** | **Boolean** | Propagation flag to specify if alarm should be propagated to the owner (tenant or customer) of alarm originator |  [optional] |
|**propagateToTenant** | **Boolean** | Propagation flag to specify if alarm should be propagated to the tenant entity |  [optional] |
|**propagateRelationTypes** | **List&lt;String&gt;** | JSON array of relation types that should be used for propagation. By default, &#39;propagateRelationTypes&#39; array is empty which means that the alarm will be propagated based on any relation type to parent entities. This parameter should be used only in case when &#39;propagate&#39; parameter is set to true, otherwise, &#39;propagateRelationTypes&#39; array will be ignored. |  [optional] |



