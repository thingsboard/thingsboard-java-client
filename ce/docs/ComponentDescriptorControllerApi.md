# ComponentDescriptorControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getComponentDescriptorByClazz**](#getComponentDescriptorByClazz) | **GET** /api/component/{componentDescriptorClazz} | Get Component Descriptor (getComponentDescriptorByClazz) |
| [**getComponentDescriptorsByType**](#getComponentDescriptorsByType) | **GET** /api/components/{componentType} | Get Component Descriptors (getComponentDescriptorsByType) |
| [**getComponentDescriptorsByTypes**](#getComponentDescriptorsByTypes) | **GET** /api/components | Get Component Descriptors (getComponentDescriptorsByTypes) |



## getComponentDescriptorByClazz

> ComponentDescriptor getComponentDescriptorByClazz(componentDescriptorClazz)

Get Component Descriptor (getComponentDescriptorByClazz)

Gets the Component Descriptor object using class name from the path parameters. Each Component Descriptor represents configuration of specific rule node (e.g. &#39;Save Timeseries&#39; or &#39;Send Email&#39;.). The Component Descriptors are used by the rule chain Web UI to build the configuration forms for the rule nodes. The Component Descriptors are discovered at runtime by scanning the class path and searching for @RuleNode annotation. Once discovered, the up to date list of descriptors is persisted to the database.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **componentDescriptorClazz** | **String** | Component Descriptor class name | |


## getComponentDescriptorsByType

> List&lt;ComponentDescriptor&gt; getComponentDescriptorsByType(componentType, ruleChainType)

Get Component Descriptors (getComponentDescriptorsByType)

Gets the Component Descriptors using rule node type and optional rule chain type request parameters. Each Component Descriptor represents configuration of specific rule node (e.g. &#39;Save Timeseries&#39; or &#39;Send Email&#39;.). The Component Descriptors are used by the rule chain Web UI to build the configuration forms for the rule nodes. The Component Descriptors are discovered at runtime by scanning the class path and searching for @RuleNode annotation. Once discovered, the up to date list of descriptors is persisted to the database.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **componentType** | **String** | Type of the Rule Node | [enum: ENRICHMENT, FILTER, TRANSFORMATION, ACTION, EXTERNAL] |
| **ruleChainType** | **String** | Type of the Rule Chain | [optional] [enum: CORE, EDGE] |


## getComponentDescriptorsByTypes

> List&lt;ComponentDescriptor&gt; getComponentDescriptorsByTypes(componentTypes, ruleChainType)

Get Component Descriptors (getComponentDescriptorsByTypes)

Gets the Component Descriptors using coma separated list of rule node types and optional rule chain type request parameters. Each Component Descriptor represents configuration of specific rule node (e.g. &#39;Save Timeseries&#39; or &#39;Send Email&#39;.). The Component Descriptors are used by the rule chain Web UI to build the configuration forms for the rule nodes. The Component Descriptors are discovered at runtime by scanning the class path and searching for @RuleNode annotation. Once discovered, the up to date list of descriptors is persisted to the database.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **componentTypes** | **List&lt;String&gt;** | List of types of the Rule Nodes, (ENRICHMENT, FILTER, TRANSFORMATION, ACTION or EXTERNAL) | |
| **ruleChainType** | **String** | Type of the Rule Chain | [optional] [enum: CORE, EDGE] |

