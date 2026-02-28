# TrendzControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTrendzSettings**](#getTrendzSettings) | **GET** /api/trendz/settings | Get Trendz Settings (getTrendzSettings) |
| [**saveTrendzSettings**](#saveTrendzSettings) | **POST** /api/trendz/settings | Save Trendz settings (saveTrendzSettings) |



## getTrendzSettings

> TrendzSettings getTrendzSettings()

Get Trendz Settings (getTrendzSettings)

Retrieves Trendz settings for this tenant.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

## saveTrendzSettings

> TrendzSettings saveTrendzSettings(trendzSettings)

Save Trendz settings (saveTrendzSettings)

Saves Trendz settings for this tenant.   Here is an example of the Trendz settings: &#x60;&#x60;&#x60;json {   \&quot;enabled\&quot;: true,   \&quot;baseUrl\&quot;: \&quot;https://some.domain.com:18888/also_necessary_prefix\&quot; } &#x60;&#x60;&#x60;  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **trendzSettings** | **TrendzSettings** |  | |

