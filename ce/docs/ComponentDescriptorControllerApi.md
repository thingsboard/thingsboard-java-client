# ComponentDescriptorControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
ComponentDescriptor getComponentDescriptorByClazz(GetComponentDescriptorByClazzArgs args) // Get Component Descriptor (getComponentDescriptorByClazz)
List<ComponentDescriptor> getComponentDescriptorsByType(GetComponentDescriptorsByTypeArgs args) // Get Component Descriptors (getComponentDescriptorsByType)
List<ComponentDescriptor> getComponentDescriptorsByTypes(GetComponentDescriptorsByTypesArgs args) // Get Component Descriptors (getComponentDescriptorsByTypes)
```


## getComponentDescriptorByClazz

**GET** `/api/component/{componentDescriptorClazz}`

Get Component Descriptor (getComponentDescriptorByClazz)

Gets the Component Descriptor object using class name from the path parameters. Each Component Descriptor represents configuration of specific rule node (e.g. 'Save Timeseries' or 'Send Email'.). The Component Descriptors are used by the rule chain Web UI to build the configuration forms for the rule nodes. The Component Descriptors are discovered at runtime by scanning the class path and searching for @RuleNode annotation. Once discovered, the up to date list of descriptors is persisted to the database.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
ComponentDescriptor getComponentDescriptorByClazz(GetComponentDescriptorByClazzArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetComponentDescriptorByClazzArgs.builder()
        .componentDescriptorClazz(String)
        .build()
```

### `GetComponentDescriptorByClazzArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `componentDescriptorClazz` | `String` | **yes** | Component Descriptor class name | |

### Return type

`ComponentDescriptor`


## getComponentDescriptorsByType

**GET** `/api/components/{componentType}`

Get Component Descriptors (getComponentDescriptorsByType)

Gets the Component Descriptors using rule node type and optional rule chain type request parameters. Each Component Descriptor represents configuration of specific rule node (e.g. 'Save Timeseries' or 'Send Email'.). The Component Descriptors are used by the rule chain Web UI to build the configuration forms for the rule nodes. The Component Descriptors are discovered at runtime by scanning the class path and searching for @RuleNode annotation. Once discovered, the up to date list of descriptors is persisted to the database.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
List<ComponentDescriptor> getComponentDescriptorsByType(GetComponentDescriptorsByTypeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetComponentDescriptorsByTypeArgs.builder()
        .componentType(String)
        .build()
```

### `GetComponentDescriptorsByTypeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `componentType` | `String` | **yes** | Type of the Rule Node | enum: `ENRICHMENT`, `FILTER`, `TRANSFORMATION`, `ACTION`, `EXTERNAL` |
| `ruleChainType` | `String` | no | Type of the Rule Chain | enum: `CORE`, `EDGE` |

### Return type

`List<ComponentDescriptor>`


## getComponentDescriptorsByTypes

**GET** `/api/components`

Get Component Descriptors (getComponentDescriptorsByTypes)

Gets the Component Descriptors using coma separated list of rule node types and optional rule chain type request parameters. Each Component Descriptor represents configuration of specific rule node (e.g. 'Save Timeseries' or 'Send Email'.). The Component Descriptors are used by the rule chain Web UI to build the configuration forms for the rule nodes. The Component Descriptors are discovered at runtime by scanning the class path and searching for @RuleNode annotation. Once discovered, the up to date list of descriptors is persisted to the database.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
List<ComponentDescriptor> getComponentDescriptorsByTypes(GetComponentDescriptorsByTypesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetComponentDescriptorsByTypesArgs.builder()
        .componentTypes(List<String>)
        .build()
```

### `GetComponentDescriptorsByTypesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `componentTypes` | `List<String>` | **yes** | List of types of the Rule Nodes, (ENRICHMENT, FILTER, TRANSFORMATION, ACTION or EXTERNAL) | |
| `ruleChainType` | `String` | no | Type of the Rule Chain | enum: `CORE`, `EDGE` |

### Return type

`List<ComponentDescriptor>`

