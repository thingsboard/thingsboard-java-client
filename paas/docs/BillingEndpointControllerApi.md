# BillingEndpointControllerApi

`ThingsboardClient` methods:

```
void checkTenantCanUpdatePlan(@Nonnull Object body) // checkTenantCanUpdatePlan
void notifyTenantPlanChanged(@Nonnull Object body) // notifyTenantPlanChanged
void notifyTenantStateChanged(@Nonnull Object body) // notifyTenantStateChanged
void notifyTenantSubscriptionCreated(@Nonnull Object body) // notifyTenantSubscriptionCreated
void sendAccountActivatedEmail(@Nonnull Object body) // sendAccountActivatedEmail
void sendBillingActivationEmail(@Nonnull Object body) // sendBillingActivationEmail
void sendPasswordWasResetEmail(@Nonnull Object body) // sendPasswordWasResetEmail
void sendResetPasswordEmail(@Nonnull Object body) // sendResetPasswordEmail
Boolean tenantHasBillingRead() // tenantHasBillingRead
Boolean tenantHasBillingWrite() // tenantHasBillingWrite
Boolean tenantHasHiddenPlansAccess() // tenantHasHiddenPlansAccess
```


## checkTenantCanUpdatePlan

```
void checkTenantCanUpdatePlan(@Nonnull Object body)
```

**POST** `/api/billingEndpoint/tenantCanUpdatePlan`

checkTenantCanUpdatePlan


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object** |  | |

### Return type

null (empty response body)


## notifyTenantPlanChanged

```
void notifyTenantPlanChanged(@Nonnull Object body)
```

**POST** `/api/billingEndpoint/tenantPlanChanged`

notifyTenantPlanChanged


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object** |  | |

### Return type

null (empty response body)


## notifyTenantStateChanged

```
void notifyTenantStateChanged(@Nonnull Object body)
```

**POST** `/api/billingEndpoint/tenantStateChanged`

notifyTenantStateChanged


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object** |  | |

### Return type

null (empty response body)


## notifyTenantSubscriptionCreated

```
void notifyTenantSubscriptionCreated(@Nonnull Object body)
```

**POST** `/api/billingEndpoint/tenantSubscriptionCreated`

notifyTenantSubscriptionCreated


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object** |  | |

### Return type

null (empty response body)


## sendAccountActivatedEmail

```
void sendAccountActivatedEmail(@Nonnull Object body)
```

**POST** `/api/billingEndpoint/sendAccountActivated`

sendAccountActivatedEmail


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object** |  | |

### Return type

null (empty response body)


## sendBillingActivationEmail

```
void sendBillingActivationEmail(@Nonnull Object body)
```

**POST** `/api/billingEndpoint/sendActivation`

sendBillingActivationEmail


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object** |  | |

### Return type

null (empty response body)


## sendPasswordWasResetEmail

```
void sendPasswordWasResetEmail(@Nonnull Object body)
```

**POST** `/api/billingEndpoint/sendPasswordWasReset`

sendPasswordWasResetEmail


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object** |  | |

### Return type

null (empty response body)


## sendResetPasswordEmail

```
void sendResetPasswordEmail(@Nonnull Object body)
```

**POST** `/api/billingEndpoint/sendResetPassword`

sendResetPasswordEmail


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object** |  | |

### Return type

null (empty response body)


## tenantHasBillingRead

```
Boolean tenantHasBillingRead()
```

**GET** `/api/billingEndpoint/tenant/permission/billing/read`

tenantHasBillingRead

### Return type

**Boolean**


## tenantHasBillingWrite

```
Boolean tenantHasBillingWrite()
```

**GET** `/api/billingEndpoint/tenant/permission/billing/write`

tenantHasBillingWrite

### Return type

**Boolean**


## tenantHasHiddenPlansAccess

```
Boolean tenantHasHiddenPlansAccess()
```

**GET** `/api/billingEndpoint/tenant/permission/billing/hiddenPlans`

tenantHasHiddenPlansAccess

### Return type

**Boolean**

