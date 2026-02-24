

# RelationsSearchParameters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rootId** | **UUID** | Root entity id to start search from. |  [optional] |
|**rootType** | **EntityType** | Type of the root entity. |  [optional] |
|**direction** | **EntitySearchDirection** | Type of the root entity. |  [optional] |
|**relationTypeGroup** | **RelationTypeGroup** | Type of the relation. |  [optional] |
|**maxLevel** | **Integer** | Maximum level of the search depth. |  [optional] |
|**fetchLastLevelOnly** | **Boolean** | Fetch entities that match the last level of search. Useful to find Devices that are strictly &#39;maxLevel&#39; relations away from the root entity. |  [optional] |



