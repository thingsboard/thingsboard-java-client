# CustomerControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteCustomer**](#deleteCustomer) | **DELETE** /api/customer/{customerId} | Delete Customer (deleteCustomer) |
| [**getAllCustomerInfos**](#getAllCustomerInfos) | **GET** /api/customerInfos/all | Get All Customer Infos for current user (getAllCustomerInfos) |
| [**getCustomerById**](#getCustomerById) | **GET** /api/customer/{customerId} | Get Customer (getCustomerById) |
| [**getCustomerCustomerInfos**](#getCustomerCustomerInfos) | **GET** /api/customer/{customerId}/customerInfos | Get Customer sub-customers Infos (getCustomerCustomerInfos) |
| [**getCustomerInfoById**](#getCustomerInfoById) | **GET** /api/customer/info/{customerId} | Get Customer info (getCustomerInfoById) |
| [**getCustomerTitleById**](#getCustomerTitleById) | **GET** /api/customer/{customerId}/title | Get Customer Title (getCustomerTitleById) |
| [**getCustomers**](#getCustomers) | **GET** /api/customers | Get Tenant Customers (getCustomers) |
| [**getCustomersByEntityGroupId**](#getCustomersByEntityGroupId) | **GET** /api/entityGroup/{entityGroupId}/customers | Get customers by Entity Group Id (getCustomersByEntityGroupId) |
| [**getCustomersByIds**](#getCustomersByIds) | **GET** /api/customers/list | Get customers by Customer Ids (getCustomersByIds) |
| [**getShortCustomerInfoById**](#getShortCustomerInfoById) | **GET** /api/customer/{customerId}/shortInfo | Get short Customer info (getShortCustomerInfoById) |
| [**getTenantCustomer**](#getTenantCustomer) | **GET** /api/tenant/customers | Get Tenant Customer by Customer title (getTenantCustomer) |
| [**getUserCustomers**](#getUserCustomers) | **GET** /api/user/customers | Get Customers (getUserCustomers) |
| [**saveCustomer**](#saveCustomer) | **POST** /api/customer | Create or update Customer (saveCustomer) |



## deleteCustomer

> deleteCustomer(customerId)

Delete Customer (deleteCustomer)

Deletes the Customer and all customer Users. All assigned Dashboards, Assets, Devices, etc. will be unassigned but not deleted. Referencing non-existing Customer Id will cause an error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'DELETE' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getAllCustomerInfos

> PageDataCustomerInfo getAllCustomerInfos(pageSize, page, includeCustomers, textSearch, sortProperty, sortOrder)

Get All Customer Infos for current user (getAllCustomerInfos)

Returns a page of customer info objects owned by the tenant or the customer of a current user. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **includeCustomers** | **Boolean** | Include customer or sub-customer entities | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the customer title. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, title, email, country, city] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataCustomerInfo**


## getCustomerById

> Customer getCustomerById(customerId)

Get Customer (getCustomerById)

Get the Customer object based on the provided Customer Id. If the user has the authority of 'Tenant Administrator', the server checks that the customer is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the user belongs to the customer.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Customer**


## getCustomerCustomerInfos

> PageDataCustomerInfo getCustomerCustomerInfos(customerId, pageSize, page, includeCustomers, textSearch, sortProperty, sortOrder)

Get Customer sub-customers Infos (getCustomerCustomerInfos)

Returns a page of customer info objects owned by the specified customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **includeCustomers** | **Boolean** | Include customer or sub-customer entities | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the customer title. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, title, email, country, city] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataCustomerInfo**


## getCustomerInfoById

> CustomerInfo getCustomerInfoById(customerId)

Get Customer info (getCustomerInfoById)

Get the Customer info object based on the provided Customer Id. If the user has the authority of 'Tenant Administrator', the server checks that the customer is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the user belongs to the customer.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**CustomerInfo**


## getCustomerTitleById

> String getCustomerTitleById(customerId)

Get Customer Title (getCustomerTitleById)

Get the title of the customer. If the user has the authority of 'Tenant Administrator', the server checks that the customer is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the user belongs to the customer.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**String**


## getCustomers

> PageDataCustomer getCustomers(pageSize, page, textSearch, sortProperty, sortOrder)

Get Tenant Customers (getCustomers)

Returns a page of customers owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the customer title. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, title, email, country, city] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataCustomer**


## getCustomersByEntityGroupId

> PageDataCustomer getCustomersByEntityGroupId(entityGroupId, pageSize, page, textSearch, sortProperty, sortOrder)

Get customers by Entity Group Id (getCustomersByEntityGroupId)

Returns a page of Customer objects that belongs to specified Entity Group Id. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.    Security check is performed to verify that the user has 'READ' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **String** | Maximum amount of entities in a one page | |
| **page** | **String** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the customer title. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, title, email, country, city] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataCustomer**


## getCustomersByIds

> List<Customer> getCustomersByIds(customerIds)

Get customers by Customer Ids (getCustomersByIds)

Returns a list of Customer objects based on the provided ids.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerIds** | **List<String>** | A list of customer ids, separated by comma ',' | |

### Return type

**List<Customer>**


## getShortCustomerInfoById

> com.fasterxml.jackson.databind.JsonNode getShortCustomerInfoById(customerId)

Get short Customer info (getShortCustomerInfoById)

Get the short customer object that contains only the title and 'isPublic' flag. If the user has the authority of 'Tenant Administrator', the server checks that the customer is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the user belongs to the customer.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## getTenantCustomer

> Customer getTenantCustomer(customerTitle)

Get Tenant Customer by Customer title (getTenantCustomer)

Get the Customer using Customer Title.   Available for users with 'TENANT_ADMIN' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerTitle** | **String** | A string value representing the Customer title. | |

### Return type

**Customer**


## getUserCustomers

> PageDataCustomer getUserCustomers(pageSize, page, textSearch, sortProperty, sortOrder)

Get Customers (getUserCustomers)

Returns a page of customers available for the user. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **String** | Maximum amount of entities in a one page | |
| **page** | **String** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the customer title. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, title, email, country, city] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataCustomer**


## saveCustomer

> Customer saveCustomer(customer, entityGroupId, entityGroupIds, nameConflictPolicy, uniquifySeparator, uniquifyStrategy)

Create or update Customer (saveCustomer)

Creates or Updates the Customer. When creating customer, platform generates Customer Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Customer Id will be present in the response. Specify existing Customer Id to update the Customer. Referencing non-existing Customer Id will cause 'Not Found' error.Remove 'id', 'tenantId' from the request body example (below) to create new Customer entity.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customer** | **Customer** | A JSON value representing the customer. | |
| **entityGroupId** | **String** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9'. If specified, the entity will be added to the corresponding entity group. | [optional] |
| **entityGroupIds** | **List<String>** | A list of string values, separated by comma ',' representing the Entity Group Ids. For example, '784f394c-42b6-435a-983c-b7beff2784f9','a84f394c-42b6-435a-083c-b7beff2784f9'. If specified, the entity will be added to the corresponding entity groups. | [optional] |
| **nameConflictPolicy** | **NameConflictPolicy** | Optional value of name conflict policy. Possible values: FAIL or UNIQUIFY.  If omitted, FAIL policy is applied. FAIL policy implies exception will be thrown if an entity with the same name already exists.  UNIQUIFY policy appends a suffix to the entity name, if a name conflict occurs. | [optional] [default to FAIL] [enum: FAIL, UNIQUIFY] |
| **uniquifySeparator** | **String** | Optional value of name suffix separator used by UNIQUIFY policy. By default, underscore separator is used. For example, strategy is UNIQUIFY, separator is '-'; if a name conflict occurs for entity name 'test-name', created entity will have name like 'test-name-7fsh4f'. | [optional] [default to _] |
| **uniquifyStrategy** | **UniquifyStrategy** | Optional value of uniquify strategy used by UNIQUIFY policy. Possible values: RANDOM or INCREMENTAL. By default, RANDOM strategy is used, which means random alphanumeric string will be added as a suffix to entity name. INCREMENTAL implies the first possible number starting from 1 will be added as a name suffix. For example, strategy is UNIQUIFY, uniquify strategy is INCREMENTAL; if a name conflict occurs for entity name 'test-name', created entity will have name like 'test-name-1. | [optional] [default to RANDOM] [enum: RANDOM, INCREMENTAL] |

### Return type

**Customer**

