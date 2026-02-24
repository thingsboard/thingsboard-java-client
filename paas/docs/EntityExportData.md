

# EntityExportData

Base export container for ThingsBoard entities

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entityType** | **EntityType** |  |  |
|**entity** | [**ExportableEntity**](ExportableEntity.md) |  |  [optional] |
|**relations** | [**List&lt;EntityRelation&gt;**](EntityRelation.md) |  |  [optional] |
|**attributes** | **Map&lt;String, List&lt;AttributeExportData&gt;&gt;** | Map of attributes where key is the scope of attributes and value is the list of attributes for that scope |  [optional] |
|**calculatedFields** | [**List&lt;CalculatedField&gt;**](CalculatedField.md) |  |  [optional] |



