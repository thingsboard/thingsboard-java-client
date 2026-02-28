# WhiteLabelingControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteCurrentLoginWhiteLabelParams**](#deleteCurrentLoginWhiteLabelParams) | **DELETE** /api/whiteLabel/currentLoginWhiteLabelParams | Delete Login White Labeling configuration (deleteCurrentLoginWhiteLabelParams) |
| [**deleteCurrentWhiteLabelParams**](#deleteCurrentWhiteLabelParams) | **DELETE** /api/whiteLabel/currentWhiteLabelParams | Delete General White Labeling configuration (deleteCurrentWhiteLabelParams) |
| [**getCurrentLoginWhiteLabelParams**](#getCurrentLoginWhiteLabelParams) | **GET** /api/whiteLabel/currentLoginWhiteLabelParams | Get Login White Labeling configuration (getCurrentWhiteLabelParams) |
| [**getCurrentWhiteLabelParams**](#getCurrentWhiteLabelParams) | **GET** /api/whiteLabel/currentWhiteLabelParams | Get White Labeling configuration (getCurrentWhiteLabelParams) |
| [**getLoginWhiteLabelParams**](#getLoginWhiteLabelParams) | **GET** /api/noauth/whiteLabel/loginWhiteLabelParams | Get Login White Labeling parameters |
| [**getMailTemplates**](#getMailTemplates) | **GET** /api/whiteLabel/mailTemplates | Get the Mail templates settings (getMailTemplates) |
| [**getWhiteLabelParams**](#getWhiteLabelParams) | **GET** /api/whiteLabel/whiteLabelParams | Get White Labeling parameters |
| [**isCustomerWhiteLabelingAllowed**](#isCustomerWhiteLabelingAllowed) | **GET** /api/whiteLabel/isCustomerWhiteLabelingAllowed | Check Customer White Labeling Allowed |
| [**isWhiteLabelingAllowed**](#isWhiteLabelingAllowed) | **GET** /api/whiteLabel/isWhiteLabelingAllowed | Check White Labeling Allowed |
| [**previewWhiteLabelParams**](#previewWhiteLabelParams) | **POST** /api/whiteLabel/previewWhiteLabelParams | Preview Login White Labeling configuration (saveWhiteLabelParams) |
| [**saveLoginWhiteLabelParams**](#saveLoginWhiteLabelParams) | **POST** /api/whiteLabel/loginWhiteLabelParams | Create Or Update Login White Labeling configuration (saveWhiteLabelParams) |
| [**saveMailTemplates**](#saveMailTemplates) | **POST** /api/whiteLabel/mailTemplates | Save the Mail templates settings (saveMailTemplates) |
| [**saveWhiteLabelParams**](#saveWhiteLabelParams) | **POST** /api/whiteLabel/whiteLabelParams | Create Or Update White Labeling configuration (saveWhiteLabelParams) |
| [**tenantWhiteLabelingAllowed**](#tenantWhiteLabelingAllowed) | **GET** /api/tenant/whiteLabelingAllowed | tenantWhiteLabelingAllowed |



## deleteCurrentLoginWhiteLabelParams

> deleteCurrentLoginWhiteLabelParams(customerId)

Delete Login White Labeling configuration (deleteCurrentLoginWhiteLabelParams)

Delete the Login White Labeling configuration that corresponds to the authority of the user.   Security check is performed to verify that the user has &#39;WRITE&#39; permission for the white labeling resource.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | [optional] |


## deleteCurrentWhiteLabelParams

> deleteCurrentWhiteLabelParams(customerId)

Delete General White Labeling configuration (deleteCurrentWhiteLabelParams)

Delete the White Labeling configuration that corresponds to the authority of the user.   Security check is performed to verify that the user has &#39;WRITE&#39; permission for the white labeling resource.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | [optional] |


## getCurrentLoginWhiteLabelParams

> LoginWhiteLabelingParams getCurrentLoginWhiteLabelParams(customerId)

Get Login White Labeling configuration (getCurrentWhiteLabelParams)

Fetch the Login  White Labeling configuration that corresponds to the authority of the user. The API call is designed to load the Login White Labeling configuration for edition. So, the result is NOT merged with the parent level White Labeling configuration. Let&#39;s assume there is a custom White Labeling  configured on a system level. And there is no custom White Labeling  items configured on a tenant level. In such a case, the API call will return default object for the tenant administrator.   Security check is performed to verify that the user has &#39;READ&#39; permission for the white labeling resource.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | [optional] |


## getCurrentWhiteLabelParams

> WhiteLabelingParams getCurrentWhiteLabelParams(customerId)

Get White Labeling configuration (getCurrentWhiteLabelParams)

Fetch the White Labeling configuration that corresponds to the authority of the user. The API call is designed to load the White Labeling configuration for edition. So, the result is NOT merged with the parent level White Labeling configuration. Let&#39;s assume there is a custom White Labeling  configured on a system level. And there is no custom White Labeling  items configured on a tenant level. In such a case, the API call will return default object for the tenant administrator.   Security check is performed to verify that the user has &#39;READ&#39; permission for the white labeling resource.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | [optional] |


## getLoginWhiteLabelParams

> LoginWhiteLabelingParams getLoginWhiteLabelParams()

Get Login White Labeling parameters

Returns login white-labeling parameters based on the hostname from request.

## getMailTemplates

> com.fasterxml.jackson.databind.JsonNode getMailTemplates(systemByDefault)

Get the Mail templates settings (getMailTemplates)

Fetch Mail template settings.   Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.  Security check is performed to verify that the user has &#39;READ&#39; permission for the white labeling resource.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **systemByDefault** | **Boolean** | Use system settings if settings are not defined on tenant level. | [optional] [default to false] |


## getWhiteLabelParams

> WhiteLabelingParams getWhiteLabelParams()

Get White Labeling parameters

Returns white-labeling parameters for the current user.

## isCustomerWhiteLabelingAllowed

> Boolean isCustomerWhiteLabelingAllowed()

Check Customer White Labeling Allowed

Check if the White Labeling is enabled for the customers of the current tenant  Security check is performed to verify that the user has &#39;WRITE&#39; permission for the white labeling resource.  Available for users with &#39;TENANT_ADMIN&#39; authority.

## isWhiteLabelingAllowed

> Boolean isWhiteLabelingAllowed()

Check White Labeling Allowed

Check if the White Labeling is enabled for the current user owner (tenant or customer)  Security check is performed to verify that the user has &#39;WRITE&#39; permission for the white labeling resource.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

## previewWhiteLabelParams

> WhiteLabelingParams previewWhiteLabelParams(whiteLabelingParams)

Preview Login White Labeling configuration (saveWhiteLabelParams)

Merge the White Labeling configuration with the parent configuration and return the result.  Security check is performed to verify that the user has &#39;WRITE&#39; permission for the white labeling resource.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **whiteLabelingParams** | **WhiteLabelingParams** |  | |


## saveLoginWhiteLabelParams

> LoginWhiteLabelingParams saveLoginWhiteLabelParams(loginWhiteLabelingParams, customerId)

Create Or Update Login White Labeling configuration (saveWhiteLabelParams)

Creates or Updates the White Labeling configuration.  Security check is performed to verify that the user has &#39;WRITE&#39; permission for the white labeling resource.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loginWhiteLabelingParams** | **LoginWhiteLabelingParams** |  | |
| **customerId** | **String** | A string value representing the customer id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | [optional] |


## saveMailTemplates

> com.fasterxml.jackson.databind.JsonNode saveMailTemplates(body)

Save the Mail templates settings (saveMailTemplates)

Creates or Updates the Mail templates settings.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.  Security check is performed to verify that the user has &#39;WRITE&#39; permission for the white labeling resource.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object** | A JSON value representing the Administration Settings. | |


## saveWhiteLabelParams

> WhiteLabelingParams saveWhiteLabelParams(whiteLabelingParams, customerId)

Create Or Update White Labeling configuration (saveWhiteLabelParams)

Creates or Updates the White Labeling configuration.  Security check is performed to verify that the user has &#39;WRITE&#39; permission for the white labeling resource.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **whiteLabelingParams** | **WhiteLabelingParams** |  | |
| **customerId** | **String** | A string value representing the customer id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | [optional] |


## tenantWhiteLabelingAllowed

> tenantWhiteLabelingAllowed()

tenantWhiteLabelingAllowed
