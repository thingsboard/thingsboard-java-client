# OwnerControllerApi

`ThingsboardClient` methods:

```
void changeOwnerToCustomer(@Nonnull String ownerId, @Nonnull String entityType, @Nonnull String entityId, @Nullable List<String> requestBody) // Change owner to customer (changeOwnerToCustomer)
void changeOwnerToTenant(@Nonnull String ownerId, @Nonnull String entityType, @Nonnull String entityId, @Nullable List<String> requestBody) // Change owner to tenant (changeOwnerToTenant)
```


## changeOwnerToCustomer

```
void changeOwnerToCustomer(@Nonnull String ownerId, @Nonnull String entityType, @Nonnull String entityId, @Nullable List<String> requestBody)
```

**POST** `/api/owner/CUSTOMER/{ownerId}/{entityType}/{entityId}`

Change owner to customer (changeOwnerToCustomer)

Tenant/Customer changes Owner to Customer or sub-Customer. Sub-Customer can`t perform this operation!   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ownerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **requestBody** | **List<String>** |  | [optional] |

### Return type

null (empty response body)


## changeOwnerToTenant

```
void changeOwnerToTenant(@Nonnull String ownerId, @Nonnull String entityType, @Nonnull String entityId, @Nullable List<String> requestBody)
```

**POST** `/api/owner/TENANT/{ownerId}/{entityType}/{entityId}`

Change owner to tenant (changeOwnerToTenant)

Tenant changes Owner from Customer or sub-Customer to Tenant.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ownerId** | **String** | A string value representing the tenant id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **requestBody** | **List<String>** |  | [optional] |

### Return type

null (empty response body)

