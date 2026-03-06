# ComponentDescriptorControllerApi

`ThingsboardClient` methods:

```
ComponentDescriptor getComponentDescriptorByClazz(@Nonnull String componentDescriptorClazz) // Get Component Descriptor (getComponentDescriptorByClazz)
List<ComponentDescriptor> getComponentDescriptorsByType(@Nonnull String componentType, @Nullable String ruleChainType) // Get Component Descriptors (getComponentDescriptorsByType)
List<ComponentDescriptor> getComponentDescriptorsByTypes(@Nonnull List<String> componentTypes, @Nullable String ruleChainType) // Get Component Descriptors (getComponentDescriptorsByTypes)
```


## getComponentDescriptorByClazz

```
ComponentDescriptor getComponentDescriptorByClazz(@Nonnull String componentDescriptorClazz)
```

**GET** `/api/component/{componentDescriptorClazz}`

Get Component Descriptor (getComponentDescriptorByClazz)

Gets the Component Descriptor object using class name from the path parameters. Each Component Descriptor represents configuration of specific rule node (e.g. 'Save Timeseries' or 'Send Email'.). The Component Descriptors are used by the rule chain Web UI to build the configuration forms for the rule nodes. The Component Descriptors are discovered at runtime by scanning the class path and searching for @RuleNode annotation. Once discovered, the up to date list of descriptors is persisted to the database.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **componentDescriptorClazz** | **String** | Component Descriptor class name | |

### Return type

**ComponentDescriptor**


## getComponentDescriptorsByType

```
List<ComponentDescriptor> getComponentDescriptorsByType(@Nonnull String componentType, @Nullable String ruleChainType)
```

**GET** `/api/components/{componentType}`

Get Component Descriptors (getComponentDescriptorsByType)

Gets the Component Descriptors using rule node type and optional rule chain type request parameters. Each Component Descriptor represents configuration of specific rule node (e.g. 'Save Timeseries' or 'Send Email'.). The Component Descriptors are used by the rule chain Web UI to build the configuration forms for the rule nodes. The Component Descriptors are discovered at runtime by scanning the class path and searching for @RuleNode annotation. Once discovered, the up to date list of descriptors is persisted to the database.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **componentType** | **String** | Type of the Rule Node | [enum: ENRICHMENT, FILTER, TRANSFORMATION, ACTION, EXTERNAL] |
| **ruleChainType** | **String** | Type of the Rule Chain | [optional] [enum: CORE, EDGE] |

### Return type

**List<ComponentDescriptor>**


## getComponentDescriptorsByTypes

```
List<ComponentDescriptor> getComponentDescriptorsByTypes(@Nonnull List<String> componentTypes, @Nullable String ruleChainType)
```

**GET** `/api/components`

Get Component Descriptors (getComponentDescriptorsByTypes)

Gets the Component Descriptors using coma separated list of rule node types and optional rule chain type request parameters. Each Component Descriptor represents configuration of specific rule node (e.g. 'Save Timeseries' or 'Send Email'.). The Component Descriptors are used by the rule chain Web UI to build the configuration forms for the rule nodes. The Component Descriptors are discovered at runtime by scanning the class path and searching for @RuleNode annotation. Once discovered, the up to date list of descriptors is persisted to the database.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **componentTypes** | **List<String>** | List of types of the Rule Nodes, (ENRICHMENT, FILTER, TRANSFORMATION, ACTION or EXTERNAL) | |
| **ruleChainType** | **String** | Type of the Rule Chain | [optional] [enum: CORE, EDGE] |

### Return type

**List<ComponentDescriptor>**

