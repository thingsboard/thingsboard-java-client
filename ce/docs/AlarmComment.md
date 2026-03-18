
# AlarmComment

`org.thingsboard.client.model.AlarmComment`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **AlarmCommentId** | JSON object with the alarm comment Id. Specify this field to update the alarm comment. Referencing non-existing alarm Id will cause error. Omit this field to create new alarm. | [optional] |
| **createdTime** | **Long** | Timestamp of the alarm comment creation, in milliseconds | [optional] [readonly] |
| **alarmId** | **AlarmId** | JSON object with Alarm id. | [optional] [readonly] |
| **userId** | **UserId** | JSON object with User id. | [optional] [readonly] |
| **type** | **AlarmCommentType** | Defines origination of comment. System type means comment was created by TB. OTHER type means comment was created by user. | [optional] |
| **comment** | **com.fasterxml.jackson.databind.JsonNode** | JSON object with text of comment. | [optional] |
| **name** | **String** | representing comment text | [optional] [readonly] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

