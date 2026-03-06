# AiAuditLogControllerApi

`ThingsboardClient` methods:

```
com.fasterxml.jackson.databind.JsonNode getAiAuditLogs(@Nullable UUID sourceId, @Nullable AuditLogStatusFilter status) // getAiAuditLogs
```


## getAiAuditLogs

```
com.fasterxml.jackson.databind.JsonNode getAiAuditLogs(@Nullable UUID sourceId, @Nullable AuditLogStatusFilter status)
```

**GET** `/api/ai/audit-logs`

getAiAuditLogs


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceId** | **UUID** |  | [optional] |
| **status** | **AuditLogStatusFilter** |  | [optional] [default to ALL] [enum: SUCCESS, FAILURE, ALL] |

### Return type

**com.fasterxml.jackson.databind.JsonNode**

