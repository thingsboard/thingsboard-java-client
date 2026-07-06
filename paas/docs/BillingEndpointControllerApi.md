# BillingEndpointControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void checkTenantCanUpdatePlan(CheckTenantCanUpdatePlanArgs args) // checkTenantCanUpdatePlan
void notifyTenantPlanChanged(NotifyTenantPlanChangedArgs args) // notifyTenantPlanChanged
void notifyTenantStateChanged(NotifyTenantStateChangedArgs args) // notifyTenantStateChanged
void notifyTenantSubscriptionCreated(NotifyTenantSubscriptionCreatedArgs args) // notifyTenantSubscriptionCreated
void sendAccountActivatedEmail(SendAccountActivatedEmailArgs args) // sendAccountActivatedEmail
void sendBillingActivationEmail(SendBillingActivationEmailArgs args) // sendBillingActivationEmail
void sendPasswordWasResetEmail(SendPasswordWasResetEmailArgs args) // sendPasswordWasResetEmail
void sendResetPasswordEmail(SendResetPasswordEmailArgs args) // sendResetPasswordEmail
Boolean tenantHasBillingRead() // tenantHasBillingRead
Boolean tenantHasBillingWrite() // tenantHasBillingWrite
Boolean tenantHasHiddenPlansAccess() // tenantHasHiddenPlansAccess
```


## checkTenantCanUpdatePlan

**POST** `/api/billingEndpoint/tenantCanUpdatePlan`

checkTenantCanUpdatePlan

```java
void checkTenantCanUpdatePlan(CheckTenantCanUpdatePlanArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
CheckTenantCanUpdatePlanArgs.builder()
        .body(Object)
        .build()
```

### `CheckTenantCanUpdatePlanArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `body` | `Object` | **yes** |  | |

### Return type

null (empty response body)


## notifyTenantPlanChanged

**POST** `/api/billingEndpoint/tenantPlanChanged`

notifyTenantPlanChanged

```java
void notifyTenantPlanChanged(NotifyTenantPlanChangedArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
NotifyTenantPlanChangedArgs.builder()
        .body(Object)
        .build()
```

### `NotifyTenantPlanChangedArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `body` | `Object` | **yes** |  | |

### Return type

null (empty response body)


## notifyTenantStateChanged

**POST** `/api/billingEndpoint/tenantStateChanged`

notifyTenantStateChanged

```java
void notifyTenantStateChanged(NotifyTenantStateChangedArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
NotifyTenantStateChangedArgs.builder()
        .body(Object)
        .build()
```

### `NotifyTenantStateChangedArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `body` | `Object` | **yes** |  | |

### Return type

null (empty response body)


## notifyTenantSubscriptionCreated

**POST** `/api/billingEndpoint/tenantSubscriptionCreated`

notifyTenantSubscriptionCreated

```java
void notifyTenantSubscriptionCreated(NotifyTenantSubscriptionCreatedArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
NotifyTenantSubscriptionCreatedArgs.builder()
        .body(Object)
        .build()
```

### `NotifyTenantSubscriptionCreatedArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `body` | `Object` | **yes** |  | |

### Return type

null (empty response body)


## sendAccountActivatedEmail

**POST** `/api/billingEndpoint/sendAccountActivated`

sendAccountActivatedEmail

```java
void sendAccountActivatedEmail(SendAccountActivatedEmailArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SendAccountActivatedEmailArgs.builder()
        .body(Object)
        .build()
```

### `SendAccountActivatedEmailArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `body` | `Object` | **yes** |  | |

### Return type

null (empty response body)


## sendBillingActivationEmail

**POST** `/api/billingEndpoint/sendActivation`

sendBillingActivationEmail

```java
void sendBillingActivationEmail(SendBillingActivationEmailArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SendBillingActivationEmailArgs.builder()
        .body(Object)
        .build()
```

### `SendBillingActivationEmailArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `body` | `Object` | **yes** |  | |

### Return type

null (empty response body)


## sendPasswordWasResetEmail

**POST** `/api/billingEndpoint/sendPasswordWasReset`

sendPasswordWasResetEmail

```java
void sendPasswordWasResetEmail(SendPasswordWasResetEmailArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SendPasswordWasResetEmailArgs.builder()
        .body(Object)
        .build()
```

### `SendPasswordWasResetEmailArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `body` | `Object` | **yes** |  | |

### Return type

null (empty response body)


## sendResetPasswordEmail

**POST** `/api/billingEndpoint/sendResetPassword`

sendResetPasswordEmail

```java
void sendResetPasswordEmail(SendResetPasswordEmailArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SendResetPasswordEmailArgs.builder()
        .body(Object)
        .build()
```

### `SendResetPasswordEmailArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `body` | `Object` | **yes** |  | |

### Return type

null (empty response body)


## tenantHasBillingRead

**GET** `/api/billingEndpoint/tenant/permission/billing/read`

tenantHasBillingRead

```java
Boolean tenantHasBillingRead()
```

### Return type

`Boolean`


## tenantHasBillingWrite

**GET** `/api/billingEndpoint/tenant/permission/billing/write`

tenantHasBillingWrite

```java
Boolean tenantHasBillingWrite()
```

### Return type

`Boolean`


## tenantHasHiddenPlansAccess

**GET** `/api/billingEndpoint/tenant/permission/billing/hiddenPlans`

tenantHasHiddenPlansAccess

```java
Boolean tenantHasHiddenPlansAccess()
```

### Return type

`Boolean`

