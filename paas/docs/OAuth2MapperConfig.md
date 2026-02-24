

# OAuth2MapperConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowUserCreation** | **Boolean** | Whether user should be created if not yet present on the platform after successful authentication |  [optional] |
|**activateUser** | **Boolean** | Whether user credentials should be activated when user is created after successful authentication |  [optional] |
|**type** | **MapperType** | Type of OAuth2 mapper. Depending on this param, different mapper config fields must be specified |  |
|**basic** | [**OAuth2BasicMapperConfig**](OAuth2BasicMapperConfig.md) | Mapper config for BASIC and GITHUB mapper types |  [optional] |
|**custom** | [**OAuth2CustomMapperConfig**](OAuth2CustomMapperConfig.md) | Mapper config for CUSTOM mapper type |  [optional] |



