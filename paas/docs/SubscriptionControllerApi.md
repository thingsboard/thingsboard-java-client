# SubscriptionControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMergedTenantProfileConfiguration**](#getMergedTenantProfileConfiguration) | **GET** /api/tenant/subscription/mergedProfileConfig | getMergedTenantProfileConfiguration |
| [**getTenantProfileConfigurationById**](#getTenantProfileConfigurationById) | **GET** /api/tenantProfile/{tenantProfileId}/profileConfig | getTenantProfileConfigurationById |
| [**getTenantSubscription**](#getTenantSubscription) | **GET** /api/tenant/subscription | getTenantSubscription |
| [**getTenantSubscriptionUsage**](#getTenantSubscriptionUsage) | **GET** /api/tenant/subscription/usage | getTenantSubscriptionUsage |
| [**trendzUsed**](#trendzUsed) | **GET** /api/tenant/subscription/trendzUsed | trendzUsed |



## getMergedTenantProfileConfiguration

> DefaultTenantProfileConfiguration getMergedTenantProfileConfiguration()

getMergedTenantProfileConfiguration

### Return type

**DefaultTenantProfileConfiguration**


## getTenantProfileConfigurationById

> DefaultTenantProfileConfiguration getTenantProfileConfigurationById(tenantProfileId)

getTenantProfileConfigurationById


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantProfileId** | **String** |  | |

### Return type

**DefaultTenantProfileConfiguration**


## getTenantSubscription

> SubscriptionDetails getTenantSubscription()

getTenantSubscription

### Return type

**SubscriptionDetails**


## getTenantSubscriptionUsage

> SubscriptionUsage getTenantSubscriptionUsage()

getTenantSubscriptionUsage

### Return type

**SubscriptionUsage**


## trendzUsed

> Boolean trendzUsed()

trendzUsed

### Return type

**Boolean**

