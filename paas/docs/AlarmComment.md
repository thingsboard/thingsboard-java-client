

# AlarmComment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**alarmId** | [**AlarmId**](AlarmId.md) | JSON object with Alarm id. |  [optional] [readonly] |
|**userId** | [**UserId**](UserId.md) | JSON object with User id. |  [optional] [readonly] |
|**type** | **AlarmCommentType** | Defines origination of comment. System type means comment was created by TB. OTHER type means comment was created by user. |  [optional] |
|**comment** | **com.fasterxml.jackson.databind.JsonNode** | JSON object with text of comment. |  [optional] |
|**id** | [**AlarmCommentId**](AlarmCommentId.md) | JSON object with the alarm comment Id. Specify this field to update the alarm comment. Referencing non-existing alarm Id will cause error. Omit this field to create new alarm. |  [optional] |
|**createdTime** | **Long** | Timestamp of the alarm comment creation, in milliseconds |  [optional] [readonly] |
|**name** | **String** | representing comment text |  [optional] [readonly] |



