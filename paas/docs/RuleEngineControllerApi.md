# RuleEngineControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
String handleRuleEngineRequestForEntity(HandleRuleEngineRequestForEntityArgs args) // Push entity message to the rule engine (handleRuleEngineRequestForEntity)
String handleRuleEngineRequestForEntityWithQueueAndTimeout(HandleRuleEngineRequestForEntityWithQueueAndTimeoutArgs args) // Push entity message with timeout and specified queue to the rule engine (handleRuleEngineRequestForEntityWithQueueAndTimeout)
String handleRuleEngineRequestForEntityWithTimeout(HandleRuleEngineRequestForEntityWithTimeoutArgs args) // Push entity message with timeout to the rule engine (handleRuleEngineRequestForEntityWithTimeout)
String handleRuleEngineRequestForUser(HandleRuleEngineRequestForUserArgs args) // Push user message to the rule engine (handleRuleEngineRequestForUser)
```


## handleRuleEngineRequestForEntity

**POST** `/api/rule-engine/{entityType}/{entityId}`

Push entity message to the rule engine (handleRuleEngineRequestForEntity)

Creates the Message with type 'REST_API_REQUEST' and payload taken from the request body. Uses specified Entity Id as the Rule Engine message originator. This method allows you to extend the regular platform API with the power of Rule Engine. You may use default and custom rule nodes to handle the message. The generated message contains two important metadata fields:   * **'serviceId'** to identify the platform server that received the request;  * **'requestUUID'** to identify the request and route possible response from the Rule Engine;  Use **'rest call reply'** rule node to push the reply from rule engine back as a REST API call response. The default timeout of the request processing is 10 seconds.   Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).

```java
String handleRuleEngineRequestForEntity(HandleRuleEngineRequestForEntityArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
HandleRuleEngineRequestForEntityArgs.builder()
        .entityType(String)
        .entityId(String)
        .body(String)
        .build()
```

### `HandleRuleEngineRequestForEntityArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `entityId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `body` | `String` | **yes** | A JSON object representing the message. | |

### Return type

`String`


## handleRuleEngineRequestForEntityWithQueueAndTimeout

**POST** `/api/rule-engine/{entityType}/{entityId}/{queueName}/{timeout}`

Push entity message with timeout and specified queue to the rule engine (handleRuleEngineRequestForEntityWithQueueAndTimeout)

Creates the Message with type 'REST_API_REQUEST' and payload taken from the request body. Uses specified Entity Id as the Rule Engine message originator. This method allows you to extend the regular platform API with the power of Rule Engine. You may use default and custom rule nodes to handle the message. The generated message contains two important metadata fields:   * **'serviceId'** to identify the platform server that received the request;  * **'requestUUID'** to identify the request and route possible response from the Rule Engine;  Use **'rest call reply'** rule node to push the reply from rule engine back as a REST API call response. If request sent for Device/Device Profile or Asset/Asset Profile entity, specified queue will be used instead of the queue selected in the device or asset profile. The platform expects the timeout value in milliseconds.   Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).

```java
String handleRuleEngineRequestForEntityWithQueueAndTimeout(HandleRuleEngineRequestForEntityWithQueueAndTimeoutArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
HandleRuleEngineRequestForEntityWithQueueAndTimeoutArgs.builder()
        .entityType(String)
        .entityId(String)
        .queueName(String)
        .timeout(Integer)
        .body(String)
        .build()
```

### `HandleRuleEngineRequestForEntityWithQueueAndTimeoutArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `entityId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `queueName` | `String` | **yes** | Queue name to process the request in the rule engine | |
| `timeout` | `Integer` | **yes** | Timeout to process the request in milliseconds | |
| `body` | `String` | **yes** | A JSON object representing the message. | |

### Return type

`String`


## handleRuleEngineRequestForEntityWithTimeout

**POST** `/api/rule-engine/{entityType}/{entityId}/{timeout}`

Push entity message with timeout to the rule engine (handleRuleEngineRequestForEntityWithTimeout)

Creates the Message with type 'REST_API_REQUEST' and payload taken from the request body. Uses specified Entity Id as the Rule Engine message originator. This method allows you to extend the regular platform API with the power of Rule Engine. You may use default and custom rule nodes to handle the message. The generated message contains two important metadata fields:   * **'serviceId'** to identify the platform server that received the request;  * **'requestUUID'** to identify the request and route possible response from the Rule Engine;  Use **'rest call reply'** rule node to push the reply from rule engine back as a REST API call response. The platform expects the timeout value in milliseconds.   Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).

```java
String handleRuleEngineRequestForEntityWithTimeout(HandleRuleEngineRequestForEntityWithTimeoutArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
HandleRuleEngineRequestForEntityWithTimeoutArgs.builder()
        .entityType(String)
        .entityId(String)
        .timeout(Integer)
        .body(String)
        .build()
```

### `HandleRuleEngineRequestForEntityWithTimeoutArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `entityId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `timeout` | `Integer` | **yes** | Timeout to process the request in milliseconds | |
| `body` | `String` | **yes** | A JSON object representing the message. | |

### Return type

`String`


## handleRuleEngineRequestForUser

**POST** `/api/rule-engine/`

Push user message to the rule engine (handleRuleEngineRequestForUser)

Creates the Message with type 'REST_API_REQUEST' and payload taken from the request body. Uses current User Id ( the one which credentials is used to perform the request) as the Rule Engine message originator. This method allows you to extend the regular platform API with the power of Rule Engine. You may use default and custom rule nodes to handle the message. The generated message contains two important metadata fields:   * **'serviceId'** to identify the platform server that received the request;  * **'requestUUID'** to identify the request and route possible response from the Rule Engine;  Use **'rest call reply'** rule node to push the reply from rule engine back as a REST API call response. The default timeout of the request processing is 10 seconds.   Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).

```java
String handleRuleEngineRequestForUser(HandleRuleEngineRequestForUserArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
HandleRuleEngineRequestForUserArgs.builder()
        .body(String)
        .build()
```

### `HandleRuleEngineRequestForUserArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `body` | `String` | **yes** | A JSON object representing the message. | |

### Return type

`String`

