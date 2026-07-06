# OwnerControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void changeOwnerToCustomer(ChangeOwnerToCustomerArgs args) // Change owner to customer (changeOwnerToCustomer)
void changeOwnerToTenant(ChangeOwnerToTenantArgs args) // Change owner to tenant (changeOwnerToTenant)
```


## changeOwnerToCustomer

**POST** `/api/owner/CUSTOMER/{ownerId}/{entityType}/{entityId}`

Change owner to customer (changeOwnerToCustomer)

Tenant/Customer changes Owner to Customer or sub-Customer. Sub-Customer can`t perform this operation!   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
void changeOwnerToCustomer(ChangeOwnerToCustomerArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ChangeOwnerToCustomerArgs.builder()
        .ownerId(String)
        .entityType(String)
        .entityId(String)
        .build()
```

### `ChangeOwnerToCustomerArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `ownerId` | `String` | **yes** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `entityType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `entityId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `requestBody` | `List<String>` | no |  | |

### Return type

null (empty response body)


## changeOwnerToTenant

**POST** `/api/owner/TENANT/{ownerId}/{entityType}/{entityId}`

Change owner to tenant (changeOwnerToTenant)

Tenant changes Owner from Customer or sub-Customer to Tenant.   Available for users with 'TENANT_ADMIN' authority.

```java
void changeOwnerToTenant(ChangeOwnerToTenantArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ChangeOwnerToTenantArgs.builder()
        .ownerId(String)
        .entityType(String)
        .entityId(String)
        .build()
```

### `ChangeOwnerToTenantArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `ownerId` | `String` | **yes** | A string value representing the tenant id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `entityType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `entityId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `requestBody` | `List<String>` | no |  | |

### Return type

null (empty response body)

