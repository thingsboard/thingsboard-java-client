# RuleEngineControllerApi

`ThingsboardClient` methods:

```
String handleRuleEngineRequestForEntity(@Nonnull String entityType, @Nonnull String entityId, @Nonnull String body) // Push entity message to the rule engine (handleRuleEngineRequestForEntity)
String handleRuleEngineRequestForEntityWithQueueAndTimeout(@Nonnull String entityType, @Nonnull String entityId, @Nonnull String queueName, @Nonnull Integer timeout, @Nonnull String body) // Push entity message with timeout and specified queue to the rule engine (handleRuleEngineRequestForEntityWithQueueAndTimeout)
String handleRuleEngineRequestForEntityWithTimeout(@Nonnull String entityType, @Nonnull String entityId, @Nonnull Integer timeout, @Nonnull String body) // Push entity message with timeout to the rule engine (handleRuleEngineRequestForEntityWithTimeout)
String handleRuleEngineRequestForUser(@Nonnull String body) // Push user message to the rule engine (handleRuleEngineRequestForUser)
```


## handleRuleEngineRequestForEntity

```
String handleRuleEngineRequestForEntity(@Nonnull String entityType, @Nonnull String entityId, @Nonnull String body)
```

**POST** `/api/rule-engine/{entityType}/{entityId}`

Push entity message to the rule engine (handleRuleEngineRequestForEntity)

Creates the Message with type 'REST_API_REQUEST' and payload taken from the request body. Uses specified Entity Id as the Rule Engine message originator. This method allows you to extend the regular platform API with the power of Rule Engine. You may use default and custom rule nodes to handle the message. The generated message contains two important metadata fields:   * **'serviceId'** to identify the platform server that received the request;  * **'requestUUID'** to identify the request and route possible response from the Rule Engine;  Use **'rest call reply'** rule node to push the reply from rule engine back as a REST API call response. The default timeout of the request processing is 10 seconds.   Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **body** | **String** | A JSON object representing the message. | |

### Return type

**String**


## handleRuleEngineRequestForEntityWithQueueAndTimeout

```
String handleRuleEngineRequestForEntityWithQueueAndTimeout(@Nonnull String entityType, @Nonnull String entityId, @Nonnull String queueName, @Nonnull Integer timeout, @Nonnull String body)
```

**POST** `/api/rule-engine/{entityType}/{entityId}/{queueName}/{timeout}`

Push entity message with timeout and specified queue to the rule engine (handleRuleEngineRequestForEntityWithQueueAndTimeout)

Creates the Message with type 'REST_API_REQUEST' and payload taken from the request body. Uses specified Entity Id as the Rule Engine message originator. This method allows you to extend the regular platform API with the power of Rule Engine. You may use default and custom rule nodes to handle the message. The generated message contains two important metadata fields:   * **'serviceId'** to identify the platform server that received the request;  * **'requestUUID'** to identify the request and route possible response from the Rule Engine;  Use **'rest call reply'** rule node to push the reply from rule engine back as a REST API call response. If request sent for Device/Device Profile or Asset/Asset Profile entity, specified queue will be used instead of the queue selected in the device or asset profile. The platform expects the timeout value in milliseconds.   Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **queueName** | **String** | Queue name to process the request in the rule engine | |
| **timeout** | **Integer** | Timeout to process the request in milliseconds | |
| **body** | **String** | A JSON object representing the message. | |

### Return type

**String**


## handleRuleEngineRequestForEntityWithTimeout

```
String handleRuleEngineRequestForEntityWithTimeout(@Nonnull String entityType, @Nonnull String entityId, @Nonnull Integer timeout, @Nonnull String body)
```

**POST** `/api/rule-engine/{entityType}/{entityId}/{timeout}`

Push entity message with timeout to the rule engine (handleRuleEngineRequestForEntityWithTimeout)

Creates the Message with type 'REST_API_REQUEST' and payload taken from the request body. Uses specified Entity Id as the Rule Engine message originator. This method allows you to extend the regular platform API with the power of Rule Engine. You may use default and custom rule nodes to handle the message. The generated message contains two important metadata fields:   * **'serviceId'** to identify the platform server that received the request;  * **'requestUUID'** to identify the request and route possible response from the Rule Engine;  Use **'rest call reply'** rule node to push the reply from rule engine back as a REST API call response. The platform expects the timeout value in milliseconds.   Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **timeout** | **Integer** | Timeout to process the request in milliseconds | |
| **body** | **String** | A JSON object representing the message. | |

### Return type

**String**


## handleRuleEngineRequestForUser

```
String handleRuleEngineRequestForUser(@Nonnull String body)
```

**POST** `/api/rule-engine/`

Push user message to the rule engine (handleRuleEngineRequestForUser)

Creates the Message with type 'REST_API_REQUEST' and payload taken from the request body. Uses current User Id ( the one which credentials is used to perform the request) as the Rule Engine message originator. This method allows you to extend the regular platform API with the power of Rule Engine. You may use default and custom rule nodes to handle the message. The generated message contains two important metadata fields:   * **'serviceId'** to identify the platform server that received the request;  * **'requestUUID'** to identify the request and route possible response from the Rule Engine;  Use **'rest call reply'** rule node to push the reply from rule engine back as a REST API call response. The default timeout of the request processing is 10 seconds.   Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **String** | A JSON object representing the message. | |

### Return type

**String**

