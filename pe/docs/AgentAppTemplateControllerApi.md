# AgentAppTemplateControllerApi

`ThingsboardClient` methods:

```
AgentAppTemplate getAgentAppTemplateByCurrentVersion(@Nonnull AgentApplicationType appType, @Nonnull AgentAppConfigType configType, @Nonnull String currentVersion) // Get Agent App Template by current version (getAgentAppTemplateByCurrentVersion)
List<AgentAppTemplate> getAgentAppTemplates() // Get all Agent App Templates (getAgentAppTemplates)
List<AgentAppTemplate> getAgentAppTemplatesByAppType(@Nonnull AgentApplicationType appType, @Nonnull AgentAppConfigType configType) // Get Agent App Templates by type (getAgentAppTemplatesByAppType)
AgentAppTemplate getLatestAgentAppTemplateByAppTypeAndConfigType(@Nonnull AgentApplicationType appType, @Nonnull AgentAppConfigType configType) // Get Agent App Template (getLatestAgentAppTemplateByType)
```


## getAgentAppTemplateByCurrentVersion

```
AgentAppTemplate getAgentAppTemplateByCurrentVersion(@Nonnull AgentApplicationType appType, @Nonnull AgentAppConfigType configType, @Nonnull String currentVersion)
```

**GET** `/api/agent/app/template/{appType}/{configType}/version/{currentVersion}`

Get Agent App Template by current version (getAgentAppTemplateByCurrentVersion)

Fetch the Agent App Template object based on the provided app type, config type, and current version. Matches the version exactly, including a floating tag used as a version such as the gateway 'latest' tag.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appType** | **AgentApplicationType** | A string value representing the agent application type, e.g. 'EDGE', 'GATEWAY' | [enum: GENERIC, EDGE, GATEWAY] |
| **configType** | **AgentAppConfigType** | A string value representing the agent configuration type, e.g. 'DOCKER_COMPOSE' | [enum: DOCKER_COMPOSE] |
| **currentVersion** | **String** | A string value representing the current version of the template, e.g. '1.0.0' | |

### Return type

**AgentAppTemplate**


## getAgentAppTemplates

```
List<AgentAppTemplate> getAgentAppTemplates()
```

**GET** `/api/agent/app/templates`

Get all Agent App Templates (getAgentAppTemplates)

Returns a list of all agent app templates available for the current tenant.  Available for users with 'TENANT_ADMIN' authority.

### Return type

**List<AgentAppTemplate>**


## getAgentAppTemplatesByAppType

```
List<AgentAppTemplate> getAgentAppTemplatesByAppType(@Nonnull AgentApplicationType appType, @Nonnull AgentAppConfigType configType)
```

**GET** `/api/agent/app/templates/{appType}/{configType}`

Get Agent App Templates by type (getAgentAppTemplatesByAppType)

Returns a list of agent app templates filtered by application type and config type.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appType** | **AgentApplicationType** | A string value representing the agent application type, e.g. 'EDGE', 'GATEWAY' | [enum: GENERIC, EDGE, GATEWAY] |
| **configType** | **AgentAppConfigType** | A string value representing the agent configuration type, e.g. 'DOCKER_COMPOSE' | [enum: DOCKER_COMPOSE] |

### Return type

**List<AgentAppTemplate>**


## getLatestAgentAppTemplateByAppTypeAndConfigType

```
AgentAppTemplate getLatestAgentAppTemplateByAppTypeAndConfigType(@Nonnull AgentApplicationType appType, @Nonnull AgentAppConfigType configType)
```

**GET** `/api/agent/app/template/{appType}/{configType}/latest`

Get Agent App Template (getLatestAgentAppTemplateByType)

Fetch the latest Agent App Template object for the given app type and config type.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appType** | **AgentApplicationType** | A string value representing the agent application type, e.g. 'EDGE', 'GATEWAY' | [enum: GENERIC, EDGE, GATEWAY] |
| **configType** | **AgentAppConfigType** | A string value representing the agent configuration type, e.g. 'DOCKER_COMPOSE' | [enum: DOCKER_COMPOSE] |

### Return type

**AgentAppTemplate**

