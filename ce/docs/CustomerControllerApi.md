# CustomerControllerApi

`ThingsboardClient` methods:

```
void deleteCustomer(@Nonnull String customerId) // Delete Customer (deleteCustomer)
Customer getCustomerById(@Nonnull String customerId) // Get Customer (getCustomerById)
String getCustomerTitleById(@Nonnull String customerId) // Get Customer Title (getCustomerTitleById)
PageDataCustomer getCustomers(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Tenant Customers (getCustomers)
List<Customer> getCustomersByIds(@Nonnull List<String> customerIds) // Get customers by Customer Ids (getCustomersByIds)
com.fasterxml.jackson.databind.JsonNode getShortCustomerInfoById(@Nonnull String customerId) // Get short Customer info (getShortCustomerInfoById)
Customer getTenantCustomer(@Nonnull String customerTitle) // Get Tenant Customer by Customer title (getTenantCustomer)
Customer saveCustomer(@Nonnull Customer customer, @Nullable NameConflictPolicy nameConflictPolicy, @Nullable String uniquifySeparator, @Nullable UniquifyStrategy uniquifyStrategy) // Create or update Customer (saveCustomer)
```


## deleteCustomer

```
void deleteCustomer(@Nonnull String customerId)
```

**DELETE** `/api/customer/{customerId}`

Delete Customer (deleteCustomer)

Deletes the Customer and all customer Users. All assigned Dashboards, Assets, Devices, etc. will be unassigned but not deleted. Referencing non-existing Customer Id will cause an error.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getCustomerById

```
Customer getCustomerById(@Nonnull String customerId)
```

**GET** `/api/customer/{customerId}`

Get Customer (getCustomerById)

Get the Customer object based on the provided Customer Id. If the user has the authority of 'Tenant Administrator', the server checks that the customer is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the user belongs to the customer.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Customer**


## getCustomerTitleById

```
String getCustomerTitleById(@Nonnull String customerId)
```

**GET** `/api/customer/{customerId}/title`

Get Customer Title (getCustomerTitleById)

Get the title of the customer. If the user has the authority of 'Tenant Administrator', the server checks that the customer is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the user belongs to the customer.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**String**


## getCustomers

```
PageDataCustomer getCustomers(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/customers`

Get Tenant Customers (getCustomers)

Returns a page of customers owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


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


## getCustomersByIds

```
List<Customer> getCustomersByIds(@Nonnull List<String> customerIds)
```

**GET** `/api/customers/list`

Get customers by Customer Ids (getCustomersByIds)

Returns a list of Customer objects based on the provided ids.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerIds** | **List<String>** | A list of customer ids, separated by comma ',' | |

### Return type

**List<Customer>**


## getShortCustomerInfoById

```
com.fasterxml.jackson.databind.JsonNode getShortCustomerInfoById(@Nonnull String customerId)
```

**GET** `/api/customer/{customerId}/shortInfo`

Get short Customer info (getShortCustomerInfoById)

Get the short customer object that contains only the title and 'isPublic' flag. If the user has the authority of 'Tenant Administrator', the server checks that the customer is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the user belongs to the customer.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## getTenantCustomer

```
Customer getTenantCustomer(@Nonnull String customerTitle)
```

**GET** `/api/tenant/customers`

Get Tenant Customer by Customer title (getTenantCustomer)

Get the Customer using Customer Title.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerTitle** | **String** | A string value representing the Customer title. | |

### Return type

**Customer**


## saveCustomer

```
Customer saveCustomer(@Nonnull Customer customer, @Nullable NameConflictPolicy nameConflictPolicy, @Nullable String uniquifySeparator, @Nullable UniquifyStrategy uniquifyStrategy)
```

**POST** `/api/customer`

Create or update Customer (saveCustomer)

Creates or Updates the Customer. When creating customer, platform generates Customer Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Customer Id will be present in the response. Specify existing Customer Id to update the Customer. Referencing non-existing Customer Id will cause 'Not Found' error.Remove 'id', 'tenantId' from the request body example (below) to create new Customer entity.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customer** | **Customer** | A JSON value representing the customer. | |
| **nameConflictPolicy** | **NameConflictPolicy** | Optional value of name conflict policy. Possible values: FAIL or UNIQUIFY.  If omitted, FAIL policy is applied. FAIL policy implies exception will be thrown if an entity with the same name already exists.  UNIQUIFY policy appends a suffix to the entity name, if a name conflict occurs. | [optional] [default to FAIL] [enum: FAIL, UNIQUIFY] |
| **uniquifySeparator** | **String** | Optional value of name suffix separator used by UNIQUIFY policy. By default, underscore separator is used. For example, strategy is UNIQUIFY, separator is '-'; if a name conflict occurs for entity name 'test-name', created entity will have name like 'test-name-7fsh4f'. | [optional] [default to _] |
| **uniquifyStrategy** | **UniquifyStrategy** | Optional value of uniquify strategy used by UNIQUIFY policy. Possible values: RANDOM or INCREMENTAL. By default, RANDOM strategy is used, which means random alphanumeric string will be added as a suffix to entity name. INCREMENTAL implies the first possible number starting from 1 will be added as a name suffix. For example, strategy is UNIQUIFY, uniquify strategy is INCREMENTAL; if a name conflict occurs for entity name 'test-name', created entity will have name like 'test-name-1. | [optional] [default to RANDOM] [enum: RANDOM, INCREMENTAL] |

### Return type

**Customer**

