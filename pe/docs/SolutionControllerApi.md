# SolutionControllerApi

`ThingsboardClient` methods:

```
TenantSolutionTemplateDetails getSolutionTemplateDetails(@Nonnull String solutionTemplateId) // Get Solution template details (getSolutionTemplateDetails)
List<TenantSolutionTemplateInfo> getSolutionTemplateInfos() // Get Solution templates (getSolutionTemplateInfos)
TenantSolutionTemplateInstructions getSolutionTemplateInstructions(@Nonnull String solutionTemplateId) // Get Solution Template Instructions (getSolutionTemplateInstructions)
SolutionInstallResponse installSolutionTemplate(@Nonnull String solutionTemplateId) // Install Solution Template (installSolutionTemplate)
void uninstallSolutionTemplate(@Nonnull String solutionTemplateId) // Uninstall Solution Template (uninstallSolutionTemplate)
```


## getSolutionTemplateDetails

```
TenantSolutionTemplateDetails getSolutionTemplateDetails(@Nonnull String solutionTemplateId)
```

**GET** `/api/solutions/templates/details/{solutionTemplateId}`

Get Solution template details (getSolutionTemplateDetails)

Get a solution template details based on the provided id   Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **solutionTemplateId** | **String** | A string value representing the solution template id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**TenantSolutionTemplateDetails**


## getSolutionTemplateInfos

```
List<TenantSolutionTemplateInfo> getSolutionTemplateInfos()
```

**GET** `/api/solutions/templates/infos`

Get Solution templates (getSolutionTemplateInfos)

Get a list of solution template descriptors   Security check is performed to verify that the user has 'READ' permission for the entity (entities).

### Return type

**List<TenantSolutionTemplateInfo>**


## getSolutionTemplateInstructions

```
TenantSolutionTemplateInstructions getSolutionTemplateInstructions(@Nonnull String solutionTemplateId)
```

**GET** `/api/solutions/templates/instructions/{solutionTemplateId}`

Get Solution Template Instructions (getSolutionTemplateInstructions)

Get a solution template instructions based on the provided id   Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **solutionTemplateId** | **String** | A string value representing the solution template id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**TenantSolutionTemplateInstructions**


## installSolutionTemplate

```
SolutionInstallResponse installSolutionTemplate(@Nonnull String solutionTemplateId)
```

**POST** `/api/solutions/templates/{solutionTemplateId}/install`

Install Solution Template (installSolutionTemplate)

Install solution template based on the provided id   Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **solutionTemplateId** | **String** | A string value representing the solution template id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**SolutionInstallResponse**


## uninstallSolutionTemplate

```
void uninstallSolutionTemplate(@Nonnull String solutionTemplateId)
```

**DELETE** `/api/solutions/templates/{solutionTemplateId}/delete`

Uninstall Solution Template (uninstallSolutionTemplate)

Uninstall solution template based on the provided id   Security check is performed to verify that the user has 'DELETE' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **solutionTemplateId** | **String** | A string value representing the solution template id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)

