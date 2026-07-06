# CustomerControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteCustomer(DeleteCustomerArgs args) // Delete Customer (deleteCustomer)
Customer getCustomerById(GetCustomerByIdArgs args) // Get Customer (getCustomerById)
String getCustomerTitleById(GetCustomerTitleByIdArgs args) // Get Customer Title (getCustomerTitleById)
PageDataCustomer getCustomers(GetCustomersArgs args) // Get Tenant Customers (getCustomers)
List<Customer> getCustomersByIds(GetCustomersByIdsArgs args) // Get customers by Customer Ids (getCustomersByIds)
com.fasterxml.jackson.databind.JsonNode getShortCustomerInfoById(GetShortCustomerInfoByIdArgs args) // Get short Customer info (getShortCustomerInfoById)
Customer getTenantCustomer(GetTenantCustomerArgs args) // Get Tenant Customer by Customer title (getTenantCustomer)
Customer saveCustomer(SaveCustomerArgs args) // Create or update Customer (saveCustomer)
```


## deleteCustomer

**DELETE** `/api/customer/{customerId}`

Delete Customer (deleteCustomer)

Deletes the Customer and all customer Users. All assigned Dashboards, Assets, Devices, etc. will be unassigned but not deleted. Referencing non-existing Customer Id will cause an error.  Available for users with 'TENANT_ADMIN' authority.

```java
void deleteCustomer(DeleteCustomerArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteCustomerArgs.builder()
        .customerId(String)
        .build()
```

### `DeleteCustomerArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customerId` | `String` | **yes** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getCustomerById

**GET** `/api/customer/{customerId}`

Get Customer (getCustomerById)

Get the Customer object based on the provided Customer Id. If the user has the authority of 'Tenant Administrator', the server checks that the customer is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the user belongs to the customer.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
Customer getCustomerById(GetCustomerByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetCustomerByIdArgs.builder()
        .customerId(String)
        .build()
```

### `GetCustomerByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customerId` | `String` | **yes** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Customer`


## getCustomerTitleById

**GET** `/api/customer/{customerId}/title`

Get Customer Title (getCustomerTitleById)

Get the title of the customer. If the user has the authority of 'Tenant Administrator', the server checks that the customer is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the user belongs to the customer.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
String getCustomerTitleById(GetCustomerTitleByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetCustomerTitleByIdArgs.builder()
        .customerId(String)
        .build()
```

### `GetCustomerTitleByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customerId` | `String` | **yes** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`String`


## getCustomers

**GET** `/api/customers`

Get Tenant Customers (getCustomers)

Returns a page of customers owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.

```java
PageDataCustomer getCustomers(GetCustomersArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetCustomersArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetCustomersArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the customer title. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `title`, `email`, `country`, `city` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataCustomer`


## getCustomersByIds

**GET** `/api/customers/list`

Get customers by Customer Ids (getCustomersByIds)

Returns a list of Customer objects based on the provided ids.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
List<Customer> getCustomersByIds(GetCustomersByIdsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetCustomersByIdsArgs.builder()
        .customerIds(List<String>)
        .build()
```

### `GetCustomersByIdsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customerIds` | `List<String>` | **yes** | A list of customer ids, separated by comma ',' | |

### Return type

`List<Customer>`


## getShortCustomerInfoById

**GET** `/api/customer/{customerId}/shortInfo`

Get short Customer info (getShortCustomerInfoById)

Get the short customer object that contains only the title and 'isPublic' flag. If the user has the authority of 'Tenant Administrator', the server checks that the customer is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the user belongs to the customer.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
com.fasterxml.jackson.databind.JsonNode getShortCustomerInfoById(GetShortCustomerInfoByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetShortCustomerInfoByIdArgs.builder()
        .customerId(String)
        .build()
```

### `GetShortCustomerInfoByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customerId` | `String` | **yes** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`com.fasterxml.jackson.databind.JsonNode`


## getTenantCustomer

**GET** `/api/tenant/customers`

Get Tenant Customer by Customer title (getTenantCustomer)

Get the Customer using Customer Title.   Available for users with 'TENANT_ADMIN' authority.

```java
Customer getTenantCustomer(GetTenantCustomerArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTenantCustomerArgs.builder()
        .customerTitle(String)
        .build()
```

### `GetTenantCustomerArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customerTitle` | `String` | **yes** | A string value representing the Customer title. | |

### Return type

`Customer`


## saveCustomer

**POST** `/api/customer`

Create or update Customer (saveCustomer)

Creates or Updates the Customer. When creating customer, platform generates Customer Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Customer Id will be present in the response. Specify existing Customer Id to update the Customer. Referencing non-existing Customer Id will cause 'Not Found' error.Remove 'id', 'tenantId' from the request body example (below) to create new Customer entity.   Available for users with 'TENANT_ADMIN' authority.

```java
Customer saveCustomer(SaveCustomerArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveCustomerArgs.builder()
        .customer(Customer)
        .build()
```

### `SaveCustomerArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customer` | `Customer` | **yes** | A JSON value representing the customer. | |
| `nameConflictPolicy` | `NameConflictPolicy` | no | Optional value of name conflict policy. Possible values: FAIL or UNIQUIFY.  If omitted, FAIL policy is applied. FAIL policy implies exception will be thrown if an entity with the same name already exists.  UNIQUIFY policy appends a suffix to the entity name, if a name conflict occurs. | default: `FAIL` enum: `FAIL`, `UNIQUIFY` |
| `uniquifySeparator` | `String` | no | Optional value of name suffix separator used by UNIQUIFY policy. By default, underscore separator is used. For example, strategy is UNIQUIFY, separator is '-'; if a name conflict occurs for entity name 'test-name', created entity will have name like 'test-name-7fsh4f'. | default: `_` |
| `uniquifyStrategy` | `UniquifyStrategy` | no | Optional value of uniquify strategy used by UNIQUIFY policy. Possible values: RANDOM or INCREMENTAL. By default, RANDOM strategy is used, which means random alphanumeric string will be added as a suffix to entity name. INCREMENTAL implies the first possible number starting from 1 will be added as a name suffix. For example, strategy is UNIQUIFY, uniquify strategy is INCREMENTAL; if a name conflict occurs for entity name 'test-name', created entity will have name like 'test-name-1. | default: `RANDOM` enum: `RANDOM`, `INCREMENTAL` |

### Return type

`Customer`

