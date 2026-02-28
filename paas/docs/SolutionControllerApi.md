# SolutionControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSolutionTemplateDetails**](#getSolutionTemplateDetails) | **GET** /api/solutions/templates/details/{solutionTemplateId} | Get Solution template details (getSolutionTemplateDetails) |
| [**getSolutionTemplateInfos**](#getSolutionTemplateInfos) | **GET** /api/solutions/templates/infos | Get Solution templates (getSolutionTemplateInfos) |
| [**getSolutionTemplateInstructions**](#getSolutionTemplateInstructions) | **GET** /api/solutions/templates/instructions/{solutionTemplateId} | Get Solution Template Instructions (getSolutionTemplateInstructions) |
| [**installSolutionTemplate**](#installSolutionTemplate) | **POST** /api/solutions/templates/{solutionTemplateId}/install | Install Solution Template (installSolutionTemplate) |
| [**uninstallSolutionTemplate**](#uninstallSolutionTemplate) | **DELETE** /api/solutions/templates/{solutionTemplateId}/delete | Uninstall Solution Template (uninstallSolutionTemplate) |



## getSolutionTemplateDetails

> TenantSolutionTemplateDetails getSolutionTemplateDetails(solutionTemplateId)

Get Solution template details (getSolutionTemplateDetails)

Get a solution template details based on the provided id   Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **solutionTemplateId** | **String** | A string value representing the solution template id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## getSolutionTemplateInfos

> List&lt;TenantSolutionTemplateInfo&gt; getSolutionTemplateInfos()

Get Solution templates (getSolutionTemplateInfos)

Get a list of solution template descriptors   Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

## getSolutionTemplateInstructions

> TenantSolutionTemplateInstructions getSolutionTemplateInstructions(solutionTemplateId)

Get Solution Template Instructions (getSolutionTemplateInstructions)

Get a solution template instructions based on the provided id   Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **solutionTemplateId** | **String** | A string value representing the solution template id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## installSolutionTemplate

> SolutionInstallResponse installSolutionTemplate(solutionTemplateId)

Install Solution Template (installSolutionTemplate)

Install solution template based on the provided id   Security check is performed to verify that the user has &#39;WRITE&#39; permission for the entity (entities).

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **solutionTemplateId** | **String** | A string value representing the solution template id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## uninstallSolutionTemplate

> uninstallSolutionTemplate(solutionTemplateId)

Uninstall Solution Template (uninstallSolutionTemplate)

Uninstall solution template based on the provided id   Security check is performed to verify that the user has &#39;DELETE&#39; permission for the entity (entities).

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **solutionTemplateId** | **String** | A string value representing the solution template id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

