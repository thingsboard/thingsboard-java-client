

# TelemetryMappingConfiguration


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keyName** | **Map&lt;String, String&gt;** | Map of LwM2M resource paths to telemetry key names |  [optional] |
|**observe** | **Set&lt;String&gt;** | Set of resources to observe |  [optional] |
|**attribute** | **Set&lt;String&gt;** | Set of attribute keys |  [optional] |
|**telemetry** | **Set&lt;String&gt;** | Set of telemetry keys |  [optional] |
|**attributeLwm2m** | [**Map&lt;String, ObjectAttributes&gt;**](ObjectAttributes.md) | Map of resource paths to specific LwM2M object attributes |  [optional] |
|**initAttrTelAsObsStrategy** | **Boolean** |  |  [optional] |
|**observeStrategy** | **TelemetryObserveStrategy** | Observation strategy for telemetry |  [optional] |



