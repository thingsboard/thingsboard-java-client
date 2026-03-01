
# UpdateMessage

`org.thingsboard.client.model.UpdateMessage`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **updateAvailable** | **Boolean** | 'True' if new platform update is available. | [optional] |
| **currentVersion** | **String** | Current ThingsBoard version. | [optional] |
| **latestVersion** | **String** | Latest ThingsBoard version. | [optional] |
| **upgradeInstructionsUrl** | **String** | Upgrade instructions URL. | [optional] |
| **currentVersionReleaseNotesUrl** | **String** | Current ThingsBoard version release notes URL. | [optional] |
| **latestVersionReleaseNotesUrl** | **String** | Latest ThingsBoard version release notes URL. | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

