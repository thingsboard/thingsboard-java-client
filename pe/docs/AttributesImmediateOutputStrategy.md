
# AttributesImmediateOutputStrategy

`org.thingsboard.client.model.AttributesImmediateOutputStrategy`

**Extends:** **AttributesOutputStrategy**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **sendAttributesUpdatedNotification** | **Boolean** |  | [optional] |
| **updateAttributesOnlyOnValueChange** | **Boolean** |  | [optional] |
| **saveAttribute** | **Boolean** |  | [optional] |
| **sendWsUpdate** | **Boolean** |  | [optional] |
| **processCfs** | **Boolean** |  | [optional] |



## Referenced Types

#### AttributesOutputStrategy
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### AttributesRuleChainOutputStrategy  *(extends AttributesOutputStrategy, type=`RULE_CHAIN`)*
*See AttributesOutputStrategy for properties.*

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

