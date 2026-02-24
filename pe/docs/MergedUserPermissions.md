

# MergedUserPermissions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**genericPermissions** | **Map&lt;String, Set&lt;Operation&gt;&gt;** | Map of permissions defined using generic roles (&#39;Customer Administrator&#39;, etc) |  [optional] |
|**groupPermissions** | [**Map&lt;String, MergedGroupPermissionInfo&gt;**](MergedGroupPermissionInfo.md) | Map of permissions defined using group roles (&#39;Read&#39; or &#39;Write&#39; access to specific entity group, etc) |  [optional] |
|**readGroupPermissions** | [**Map&lt;String, MergedGroupTypePermissionInfo&gt;**](MergedGroupTypePermissionInfo.md) | Map of read permissions per entity type. Used on the UI to enable/disable certain components. |  [optional] |
|**readEntityPermissions** | [**Map&lt;String, MergedGroupTypePermissionInfo&gt;**](MergedGroupTypePermissionInfo.md) | Map of read permissions per resource. Used on the UI to enable/disable certain components. |  [optional] |
|**readAttrPermissions** | [**Map&lt;String, MergedGroupTypePermissionInfo&gt;**](MergedGroupTypePermissionInfo.md) | Map of read entity attributes permissions per resource. Used on the UI to enable/disable certain tabs. |  [optional] |
|**readTsPermissions** | [**Map&lt;String, MergedGroupTypePermissionInfo&gt;**](MergedGroupTypePermissionInfo.md) | Map of read entity time-series permissions per resource. Used on the UI to enable/disable certain tabs. |  [optional] |



