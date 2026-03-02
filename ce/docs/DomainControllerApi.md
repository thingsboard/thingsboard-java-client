# DomainControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteDomain**](#deleteDomain) | **DELETE** /api/domain/{id} | Delete Domain by ID (deleteDomain) |
| [**getDomainInfoById**](#getDomainInfoById) | **GET** /api/domain/info/{id} | Get Domain info by Id (getDomainInfoById) |
| [**getTenantDomainInfos**](#getTenantDomainInfos) | **GET** /api/domain/infos | Get Domain infos (getTenantDomainInfos) |
| [**saveDomain**](#saveDomain) | **POST** /api/domain | Save or Update Domain (saveDomain) |
| [**updateDomainOauth2Clients**](#updateDomainOauth2Clients) | **PUT** /api/domain/{id}/oauth2Clients | Update oauth2 clients (updateDomainOauth2Clients) |



## deleteDomain

> deleteDomain(id)

Delete Domain by ID (deleteDomain)

Deletes Domain by ID. Referencing non-existing domain Id will cause an error.  Available for users with 'SYS_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |

### Return type

null (empty response body)


## getDomainInfoById

> DomainInfo getDomainInfoById(id)

Get Domain info by Id (getDomainInfoById)

  Available for users with 'SYS_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |

### Return type

**DomainInfo**


## getTenantDomainInfos

> PageDataDomainInfo getTenantDomainInfos(pageSize, page, textSearch, sortProperty, sortOrder)

Get Domain infos (getTenantDomainInfos)

  Available for users with 'SYS_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Case-insensitive 'substring' filter based on domain's name | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |

### Return type

**PageDataDomainInfo**


## saveDomain

> Domain saveDomain(domain, oauth2ClientIds)

Save or Update Domain (saveDomain)

Create or update the Domain. When creating domain, platform generates Domain Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Domain Id will be present in the response. Specify existing Domain Id to update the domain. Referencing non-existing Domain Id will cause 'Not Found' error.  Domain name is unique for entire platform setup.    Available for users with 'SYS_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domain** | **Domain** |  | |
| **oauth2ClientIds** | **List<String>** | A list of oauth2 client registration ids, separated by comma ',' | [optional] |

### Return type

**Domain**


## updateDomainOauth2Clients

> updateDomainOauth2Clients(id, UUID)

Update oauth2 clients (updateDomainOauth2Clients)

Update oauth2 clients for the specified domain. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |
| **UUID** | **List<UUID>** |  | |

### Return type

null (empty response body)

