

# NotificationRequestStats

Notification request processing statistics

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sent** | **Map&lt;String, Object&gt;** | Number of successfully sent notifications per delivery method |  [optional] |
|**errors** | **Map&lt;String, Map&lt;String, String&gt;&gt;** | Errors per delivery method. Each entry maps recipient name to error message |  [optional] |
|**totalErrors** | **Object** |  |  [optional] |
|**error** | **String** | General error message if the entire request failed |  [optional] |



