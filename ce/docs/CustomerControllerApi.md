# CustomerControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteCustomer**](CustomerControllerApi.md#deleteCustomer) | **DELETE** /api/customer/{customerId} | Delete Customer (deleteCustomer) |
| [**getCustomerById**](CustomerControllerApi.md#getCustomerById) | **GET** /api/customer/{customerId} | Get Customer (getCustomerById) |
| [**getCustomerTitleById**](CustomerControllerApi.md#getCustomerTitleById) | **GET** /api/customer/{customerId}/title | Get Customer Title (getCustomerTitleById) |
| [**getCustomers**](CustomerControllerApi.md#getCustomers) | **GET** /api/customers | Get Tenant Customers (getCustomers) |
| [**getCustomersByIdsV2**](CustomerControllerApi.md#getCustomersByIdsV2) | **GET** /api/customers/list | Get customers by Customer Ids (getCustomersByIdsV2) |
| [**getShortCustomerInfoById**](CustomerControllerApi.md#getShortCustomerInfoById) | **GET** /api/customer/{customerId}/shortInfo | Get short Customer info (getShortCustomerInfoById) |
| [**getTenantCustomer**](CustomerControllerApi.md#getTenantCustomer) | **GET** /api/tenant/customers | Get Tenant Customer by Customer title (getTenantCustomer) |
| [**saveCustomer**](CustomerControllerApi.md#saveCustomer) | **POST** /api/customer | Create or update Customer (saveCustomer) |



## deleteCustomer

> deleteCustomer(customerId)

Delete Customer (deleteCustomer)

Deletes the Customer and all customer Users. All assigned Dashboards, Assets, Devices, etc. will be unassigned but not deleted. Referencing non-existing Customer Id will cause an error.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String**| A string value representing the customer id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

null (empty response body)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getCustomerById

> Customer getCustomerById(customerId)

Get Customer (getCustomerById)

Get the Customer object based on the provided Customer Id. If the user has the authority of &#39;Tenant Administrator&#39;, the server checks that the customer is owned by the same tenant. If the user has the authority of &#39;Customer User&#39;, the server checks that the user belongs to the customer.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String**| A string value representing the customer id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**Customer**](Customer.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getCustomerTitleById

> String getCustomerTitleById(customerId)

Get Customer Title (getCustomerTitleById)

Get the title of the customer. If the user has the authority of &#39;Tenant Administrator&#39;, the server checks that the customer is owned by the same tenant. If the user has the authority of &#39;Customer User&#39;, the server checks that the user belongs to the customer.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String**| A string value representing the customer id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

**String**

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/text, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getCustomers

> PageDataCustomer getCustomers(pageSize, page, textSearch, sortProperty, sortOrder)

Get Tenant Customers (getCustomers)

Returns a page of customers owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the customer title. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, title, email, country, city] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataCustomer**](PageDataCustomer.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getCustomersByIdsV2

> List&lt;Customer&gt; getCustomersByIdsV2(customerIds)

Get customers by Customer Ids (getCustomersByIdsV2)

Returns a list of Customer objects based on the provided ids.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerIds** | [**List&lt;String&gt;**](String.md)| A list of customer ids, separated by comma &#39;,&#39; | |

### Return type

[**List&lt;Customer&gt;**](Customer.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getShortCustomerInfoById

> com.fasterxml.jackson.databind.JsonNode getShortCustomerInfoById(customerId)

Get short Customer info (getShortCustomerInfoById)

Get the short customer object that contains only the title and &#39;isPublic&#39; flag. If the user has the authority of &#39;Tenant Administrator&#39;, the server checks that the customer is owned by the same tenant. If the user has the authority of &#39;Customer User&#39;, the server checks that the user belongs to the customer.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String**| A string value representing the customer id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**com.fasterxml.jackson.databind.JsonNode**](com.fasterxml.jackson.databind.JsonNode.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getTenantCustomer

> Customer getTenantCustomer(customerTitle)

Get Tenant Customer by Customer title (getTenantCustomer)

Get the Customer using Customer Title.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerTitle** | **String**| A string value representing the Customer title. | |

### Return type

[**Customer**](Customer.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## saveCustomer

> Customer saveCustomer(customer, nameConflictPolicy, uniquifySeparator, uniquifyStrategy)

Create or update Customer (saveCustomer)

Creates or Updates the Customer. When creating customer, platform generates Customer Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Customer Id will be present in the response. Specify existing Customer Id to update the Customer. Referencing non-existing Customer Id will cause &#39;Not Found&#39; error.Remove &#39;id&#39;, &#39;tenantId&#39; from the request body example (below) to create new Customer entity.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customer** | [**Customer**](Customer.md)| A JSON value representing the customer. | |
| **nameConflictPolicy** | [**NameConflictPolicy**](.md)| Optional value of name conflict policy. Possible values: FAIL or UNIQUIFY.  If omitted, FAIL policy is applied. FAIL policy implies exception will be thrown if an entity with the same name already exists.  UNIQUIFY policy appends a suffix to the entity name, if a name conflict occurs. | [optional] [default to FAIL] [enum: FAIL, UNIQUIFY] |
| **uniquifySeparator** | **String**| Optional value of name suffix separator used by UNIQUIFY policy. By default, underscore separator is used. For example, strategy is UNIQUIFY, separator is &#39;-&#39;; if a name conflict occurs for entity name &#39;test-name&#39;, created entity will have name like &#39;test-name-7fsh4f&#39;. | [optional] [default to _] |
| **uniquifyStrategy** | [**UniquifyStrategy**](.md)| Optional value of uniquify strategy used by UNIQUIFY policy. Possible values: RANDOM or INCREMENTAL. By default, RANDOM strategy is used, which means random alphanumeric string will be added as a suffix to entity name. INCREMENTAL implies the first possible number starting from 1 will be added as a name suffix. For example, strategy is UNIQUIFY, uniquify strategy is INCREMENTAL; if a name conflict occurs for entity name &#39;test-name&#39;, created entity will have name like &#39;test-name-1. | [optional] [default to RANDOM] [enum: RANDOM, INCREMENTAL] |

### Return type

[**Customer**](Customer.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |

