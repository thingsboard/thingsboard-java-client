

# EntityRelationInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**from** | [**EntityId**](EntityId.md) | JSON object with [from] Entity Id. |  |
|**to** | [**EntityId**](EntityId.md) | JSON object with [to] Entity Id. |  |
|**type** | **String** | String value of relation type. |  |
|**typeGroup** | **RelationTypeGroup** | Represents the type group of the relation. |  |
|**version** | **Long** |  |  [optional] |
|**fromName** | **String** | Name of the entity for [from] direction. |  [optional] [readonly] |
|**toName** | **String** | Name of the entity for [to] direction. |  [optional] [readonly] |
|**additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the relation |  [optional] |



