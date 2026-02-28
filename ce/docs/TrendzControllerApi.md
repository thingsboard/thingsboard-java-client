# TrendzControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTrendzSettings**](#getTrendzSettings) | **GET** /api/trendz/settings | Get Trendz Settings (getTrendzSettings) |
| [**saveTrendzSettings**](#saveTrendzSettings) | **POST** /api/trendz/settings | Save Trendz settings (saveTrendzSettings) |



## getTrendzSettings

> TrendzSettings getTrendzSettings()

Get Trendz Settings (getTrendzSettings)

Retrieves Trendz settings for this tenant.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

### Return type

**TrendzSettings**


## saveTrendzSettings

> TrendzSettings saveTrendzSettings(trendzSettings)

Save Trendz settings (saveTrendzSettings)

Saves Trendz settings for this tenant.   Here is an example of the Trendz settings: ```json {   \"enabled\": true,   \"baseUrl\": \"https://some.domain.com:18888/also_necessary_prefix\" } ```  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **trendzSettings** | **TrendzSettings** |  | |

### Return type

**TrendzSettings**

