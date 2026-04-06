
# AttributesOutput

`org.thingsboard.client.model.AttributesOutput`

**Extends:** **Output**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **strategy** | **AttributesOutputStrategy** |  | [optional] |



## Referenced Types

#### Output
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| name | String |  | [optional] |
| scope | AttributeScope |  | [optional] |
| decimalsByDefault | Integer |  | [optional] |
| strategy | Object |  | [optional] |
| type | String |  |  |

#### AttributesOutputStrategy
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### AttributesImmediateOutputStrategy  *(extends AttributesOutputStrategy, type=`IMMEDIATE`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| sendAttributesUpdatedNotification | Boolean |  | [optional] |
| updateAttributesOnlyOnValueChange | Boolean |  | [optional] |
| saveAttribute | Boolean |  | [optional] |
| sendWsUpdate | Boolean |  | [optional] |
| processCfs | Boolean |  | [optional] |

#### AttributesRuleChainOutputStrategy  *(extends AttributesOutputStrategy, type=`RULE_CHAIN`)*
*See AttributesOutputStrategy for properties.*

#### AttributeScope (enum)
`CLIENT_SCOPE` | `SERVER_SCOPE` | `SHARED_SCOPE`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

