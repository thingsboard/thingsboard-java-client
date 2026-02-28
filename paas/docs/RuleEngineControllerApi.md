# RuleEngineControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**handleRuleEngineRequest**](RuleEngineControllerApi.md#handleRuleEngineRequest) | **POST** /api/rule-engine/{entityType}/{entityId} | Push entity message to the rule engine (handleRuleEngineRequest) |
| [**handleRuleEngineRequest1**](RuleEngineControllerApi.md#handleRuleEngineRequest1) | **POST** /api/rule-engine/{entityType}/{entityId}/{timeout} | Push entity message with timeout to the rule engine (handleRuleEngineRequest) |
| [**handleRuleEngineRequest2**](RuleEngineControllerApi.md#handleRuleEngineRequest2) | **POST** /api/rule-engine/{entityType}/{entityId}/{queueName}/{timeout} | Push entity message with timeout and specified queue to the rule engine (handleRuleEngineRequest) |
| [**handleRuleEngineRequest3**](RuleEngineControllerApi.md#handleRuleEngineRequest3) | **POST** /api/rule-engine/ | Push user message to the rule engine (handleRuleEngineRequest) |



## handleRuleEngineRequest

> String handleRuleEngineRequest(entityType, entityId, body)

Push entity message to the rule engine (handleRuleEngineRequest)

Creates the Message with type &#39;REST_API_REQUEST&#39; and payload taken from the request body. Uses specified Entity Id as the Rule Engine message originator. This method allows you to extend the regular platform API with the power of Rule Engine. You may use default and custom rule nodes to handle the message. The generated message contains two important metadata fields:   * **&#39;serviceId&#39;** to identify the platform server that received the request;  * **&#39;requestUUID&#39;** to identify the request and route possible response from the Rule Engine;  Use **&#39;rest call reply&#39;** rule node to push the reply from rule engine back as a REST API call response. The default timeout of the request processing is 10 seconds.   Security check is performed to verify that the user has &#39;WRITE&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String**| A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **entityId** | **String**| A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **body** | **String**|  | |

### Return type

**String**

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


## handleRuleEngineRequest1

> String handleRuleEngineRequest1(entityType, entityId, timeout, body)

Push entity message with timeout to the rule engine (handleRuleEngineRequest)

Creates the Message with type &#39;REST_API_REQUEST&#39; and payload taken from the request body. Uses specified Entity Id as the Rule Engine message originator. This method allows you to extend the regular platform API with the power of Rule Engine. You may use default and custom rule nodes to handle the message. The generated message contains two important metadata fields:   * **&#39;serviceId&#39;** to identify the platform server that received the request;  * **&#39;requestUUID&#39;** to identify the request and route possible response from the Rule Engine;  Use **&#39;rest call reply&#39;** rule node to push the reply from rule engine back as a REST API call response. The platform expects the timeout value in milliseconds.   Security check is performed to verify that the user has &#39;WRITE&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String**| A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **entityId** | **String**| A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **timeout** | **Integer**| Timeout to process the request in milliseconds | |
| **body** | **String**|  | |

### Return type

**String**

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


## handleRuleEngineRequest2

> String handleRuleEngineRequest2(entityType, entityId, queueName, timeout, body)

Push entity message with timeout and specified queue to the rule engine (handleRuleEngineRequest)

Creates the Message with type &#39;REST_API_REQUEST&#39; and payload taken from the request body. Uses specified Entity Id as the Rule Engine message originator. This method allows you to extend the regular platform API with the power of Rule Engine. You may use default and custom rule nodes to handle the message. The generated message contains two important metadata fields:   * **&#39;serviceId&#39;** to identify the platform server that received the request;  * **&#39;requestUUID&#39;** to identify the request and route possible response from the Rule Engine;  Use **&#39;rest call reply&#39;** rule node to push the reply from rule engine back as a REST API call response. If request sent for Device/Device Profile or Asset/Asset Profile entity, specified queue will be used instead of the queue selected in the device or asset profile. The platform expects the timeout value in milliseconds.   Security check is performed to verify that the user has &#39;WRITE&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String**| A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **entityId** | **String**| A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **queueName** | **String**| Queue name to process the request in the rule engine | |
| **timeout** | **Integer**| Timeout to process the request in milliseconds | |
| **body** | **String**|  | |

### Return type

**String**

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


## handleRuleEngineRequest3

> String handleRuleEngineRequest3(body)

Push user message to the rule engine (handleRuleEngineRequest)

Creates the Message with type &#39;REST_API_REQUEST&#39; and payload taken from the request body. Uses current User Id ( the one which credentials is used to perform the request) as the Rule Engine message originator. This method allows you to extend the regular platform API with the power of Rule Engine. You may use default and custom rule nodes to handle the message. The generated message contains two important metadata fields:   * **&#39;serviceId&#39;** to identify the platform server that received the request;  * **&#39;requestUUID&#39;** to identify the request and route possible response from the Rule Engine;  Use **&#39;rest call reply&#39;** rule node to push the reply from rule engine back as a REST API call response. The default timeout of the request processing is 10 seconds.   Security check is performed to verify that the user has &#39;WRITE&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **String**|  | |

### Return type

**String**

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

