# SolutionControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSolutionTemplateDetails**](SolutionControllerApi.md#getSolutionTemplateDetails) | **GET** /api/solutions/templates/details/{solutionTemplateId} | Get Solution template details (getSolutionTemplateDetails) |
| [**getSolutionTemplateInfos**](SolutionControllerApi.md#getSolutionTemplateInfos) | **GET** /api/solutions/templates/infos | Get Solution templates (getSolutionTemplateInfos) |
| [**getSolutionTemplateInstructions**](SolutionControllerApi.md#getSolutionTemplateInstructions) | **GET** /api/solutions/templates/instructions/{solutionTemplateId} | Get Solution Template Instructions (getSolutionTemplateInstructions) |
| [**installSolutionTemplate**](SolutionControllerApi.md#installSolutionTemplate) | **POST** /api/solutions/templates/{solutionTemplateId}/install | Install Solution Template (installSolutionTemplate) |
| [**uninstallSolutionTemplate**](SolutionControllerApi.md#uninstallSolutionTemplate) | **DELETE** /api/solutions/templates/{solutionTemplateId}/delete | Uninstall Solution Template (uninstallSolutionTemplate) |



## getSolutionTemplateDetails

> TenantSolutionTemplateDetails getSolutionTemplateDetails(solutionTemplateId)

Get Solution template details (getSolutionTemplateDetails)

Get a solution template details based on the provided id   Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **solutionTemplateId** | **String**| A string value representing the solution template id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**TenantSolutionTemplateDetails**](TenantSolutionTemplateDetails.md)

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


## getSolutionTemplateInfos

> List&lt;TenantSolutionTemplateInfo&gt; getSolutionTemplateInfos()

Get Solution templates (getSolutionTemplateInfos)

Get a list of solution template descriptors   Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;TenantSolutionTemplateInfo&gt;**](TenantSolutionTemplateInfo.md)

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


## getSolutionTemplateInstructions

> TenantSolutionTemplateInstructions getSolutionTemplateInstructions(solutionTemplateId)

Get Solution Template Instructions (getSolutionTemplateInstructions)

Get a solution template instructions based on the provided id   Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **solutionTemplateId** | **String**| A string value representing the solution template id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**TenantSolutionTemplateInstructions**](TenantSolutionTemplateInstructions.md)

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


## installSolutionTemplate

> SolutionInstallResponse installSolutionTemplate(solutionTemplateId)

Install Solution Template (installSolutionTemplate)

Install solution template based on the provided id   Security check is performed to verify that the user has &#39;WRITE&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **solutionTemplateId** | **String**| A string value representing the solution template id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**SolutionInstallResponse**](SolutionInstallResponse.md)

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


## uninstallSolutionTemplate

> uninstallSolutionTemplate(solutionTemplateId)

Uninstall Solution Template (uninstallSolutionTemplate)

Uninstall solution template based on the provided id   Security check is performed to verify that the user has &#39;DELETE&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **solutionTemplateId** | **String**| A string value representing the solution template id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

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

