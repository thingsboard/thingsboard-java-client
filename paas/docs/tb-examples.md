# ThingsboardClient Code Examples

Endpoints that take parameters expose a single request-object overload: you pass one
`<Method>Args` object built with a fluent builder instead of a positional parameter list.
Only required parameters must be set; optional ones can be omitted. `build()` throws
`IllegalArgumentException` if a required parameter is missing.

The `<Method>Args` classes are nested in `ThingsboardApi` (the generated base class of
`ThingsboardClient`). Import them directly, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`.

The available builder fields vary by edition (CE / PE / PaaS). The examples below match the PE
edition; CE typically exposes fewer optional builder fields. Always check `target/api-docs/` for
your edition's exact signatures. Methods that take no parameters (e.g. `getUser()`) have no
`Args` object — call them directly.

## Devices

```java
// Get device by ID
Device device = tb.getDeviceById(GetDeviceByIdArgs.builder().deviceId(deviceId).build());

// Get device by name (unique within tenant)
Device device = tb.getTenantDeviceByName(GetTenantDeviceByNameArgs.builder().deviceName("Temperature Sensor A1").build());

// Create or update a device
Device device = new Device();
device.setName("My Device");
device.setType("default");
Device saved = tb.saveDevice(SaveDeviceArgs.builder().device(device).build());

// Delete a device
tb.deleteDevice(DeleteDeviceArgs.builder().deviceId(deviceId).build());

// Get device credentials (access token)
DeviceCredentials creds = tb.getDeviceCredentialsByDeviceId(GetDeviceCredentialsByDeviceIdArgs.builder().deviceId(deviceId).build());
String accessToken = creds.getCredentialsId();

// List tenant devices (paginated)
PageDataDevice page = tb.getTenantDevices(GetTenantDevicesArgs.builder().pageSize(10).page(0).build());
List<Device> devices = page.getData();

// Get device info (includes customer name, device profile name, etc.)
DeviceInfo info = tb.getDeviceInfoById(GetDeviceInfoByIdArgs.builder().deviceId(deviceId).build());
```

## Assets

```java
// Get asset by ID
Asset asset = tb.getAssetById(GetAssetByIdArgs.builder().assetId(assetId).build());

// Get asset by name (unique within tenant)
Asset asset = tb.getTenantAssetByName(GetTenantAssetByNameArgs.builder().assetName("Building A").build());

// Create or update an asset
Asset asset = new Asset();
asset.setName("Building A");
asset.setType("building");
Asset saved = tb.saveAsset(SaveAssetArgs.builder().asset(asset).build());

// Delete an asset
tb.deleteAsset(DeleteAssetArgs.builder().assetId(assetId).build());

// List tenant assets (paginated)
PageDataAsset page = tb.getTenantAssets(GetTenantAssetsArgs.builder().pageSize(10).page(0).build());
List<Asset> assets = page.getData();
```

## Customers

```java
// Get customer by ID
Customer customer = tb.getCustomerById(GetCustomerByIdArgs.builder().customerId(customerId).build());

// Get customer by title (unique within tenant)
Customer customer = tb.getTenantCustomer(GetTenantCustomerArgs.builder().customerTitle("Acme Corp").build());

// Create or update a customer
Customer customer = new Customer();
customer.setTitle("Acme Corp");
customer.setEmail("info@acme.com");
Customer saved = tb.saveCustomer(SaveCustomerArgs.builder().customer(customer).build());
```

## Attributes

```java
// Save server-side attributes on a device
tb.saveDeviceAttributes(SaveDeviceAttributesArgs.builder()
        .deviceId(deviceId)
        .scope("SERVER_SCOPE")
        .body("""
              {"billingActive": true, "plan": "pro"}
              """)
        .build());

// Save attributes on any entity (device, asset, etc.)
tb.saveEntityAttributesV2(SaveEntityAttributesV2Args.builder()
        .entityType("ASSET")
        .entityId(assetId)
        .scope("SERVER_SCOPE")
        .body("""
              {"key1": "value1", "key2": 42}
              """)
        .build());

// Read attributes by scope (omit .keys(...) for all; or use .key(List<String>))
List<AttributeData> attrs = tb.getAttributesByScope(GetAttributesByScopeArgs.builder()
        .entityType("DEVICE")
        .entityId(deviceId)
        .scope("SERVER_SCOPE")
        .keys("billingActive,plan")
        .build());

// List attribute key names
List<String> keys = tb.getAttributeKeys(GetAttributeKeysArgs.builder().entityType("DEVICE").entityId(deviceId).build());
List<String> scopedKeys = tb.getAttributeKeysByScope(GetAttributeKeysByScopeArgs.builder()
        .entityType("DEVICE")
        .entityId(deviceId)
        .scope("SERVER_SCOPE")
        .build());

// Delete attributes
tb.deleteDeviceAttributes(DeleteDeviceAttributesArgs.builder()
        .deviceId(deviceId)
        .scope("SERVER_SCOPE")
        .keys("key1,key2")
        .build());
```

### Read-modify-write pattern

A common pattern: read an attribute, change its value, save it back.

```java
// Read current value
List<AttributeData> attrs = tb.getAttributesByScope(GetAttributesByScopeArgs.builder()
        .entityType("ASSET")
        .entityId(assetId)
        .scope("SERVER_SCOPE")
        .keys("deviceCount")
        .build());

long current = 0;
if (!attrs.isEmpty()) {
    current = ((Number) attrs.get(0).getValue()).longValue();
}

// Modify and save back
long updated = current + 1;
tb.saveEntityAttributesV2(SaveEntityAttributesV2Args.builder()
        .entityType("ASSET")
        .entityId(assetId)
        .scope("SERVER_SCOPE")
        .body("{\"deviceCount\": %d}".formatted(updated))
        .build());
```

## Telemetry

```java
// List telemetry key names for an entity
List<String> keys = tb.getTimeseriesKeys(GetTimeseriesKeysArgs.builder().entityType("DEVICE").entityId(deviceId).build());

// Get timeseries history
Map<String, List<TsData>> data = tb.getTimeseriesHistory(GetTimeseriesHistoryArgs.builder()
        .entityType("DEVICE")
        .entityId(deviceId)
        .startTs(startTs)                 // Unix epoch millis
        .endTs(endTs)
        .keys("temperature,humidity")
        .limit("100")
        .agg("NONE")                      // aggregation: NONE, AVG, SUM, MIN, MAX, COUNT
        .orderBy("DESC")
        .useStrictDataTypes(true)
        .build());
// Optional builder fields not set above: intervalType, interval, timeZone, key

// Delete timeseries data
tb.deleteEntityTimeseries(DeleteEntityTimeseriesArgs.builder()
        .entityType("DEVICE")
        .entityId(deviceId)
        .keys("temperature")
        .deleteAllDataForKeys(true)
        .deleteLatest(true)
        .rewriteLatestIfDeleted(false)
        .build());
// Optional builder fields not set above: startTs, endTs (null = all), key
```

## Alarms

```java
// Create an alarm
Alarm alarm = new Alarm();
alarm.setType("High Temperature");
alarm.setOriginator(new DeviceId().id(deviceId));
alarm.setSeverity(AlarmSeverity.CRITICAL);
Alarm saved = tb.saveAlarm(SaveAlarmArgs.builder().alarm(alarm).build());

// Get alarm by ID
Alarm alarm = tb.getAlarmById(GetAlarmByIdArgs.builder().alarmId(alarmId).build());

// Acknowledge an alarm
tb.ackAlarm(AckAlarmArgs.builder().alarmId(alarmId).build());

// Clear an alarm
tb.clearAlarm(ClearAlarmArgs.builder().alarmId(alarmId).build());
```

## Relations

```java
// Create a relation
EntityRelation relation = new EntityRelation();
relation.setFrom(new AssetId().id(assetId));
relation.setTo(new DeviceId().id(deviceId));
relation.setType("Contains");
relation.setTypeGroup(RelationTypeGroup.COMMON);
tb.saveRelation(SaveRelationArgs.builder().entityRelation(relation).build());
```

## Users

```java
// Get current user
User user = tb.getUser();

// Get user by ID
User user = tb.getUserById(GetUserByIdArgs.builder().userId(userId).build());
```

## Dashboards

```java
// Get dashboard by ID
Dashboard dashboard = tb.getDashboardById(GetDashboardByIdArgs.builder().dashboardId(dashboardId).build());

// List tenant dashboards (paginated)
PageDataDashboardInfo page = tb.getTenantDashboards(GetTenantDashboardsArgs.builder().pageSize(10).page(0).build());
```

## Entity Groups & Permissions (PE / PaaS only)

> The APIs in this section are only available in the PE and PaaS editions. They will not compile against the CE client.

### Entity Groups

```java
// Create a device entity group
EntityGroup group = new EntityGroup();
group.setName("Factory Floor Sensors");
group.setType(EntityGroup.TypeEnum.DEVICE);
EntityGroupInfo saved = tb.saveEntityGroup(SaveEntityGroupArgs.builder().entityGroup(group).build());
String groupId = saved.getId().getId().toString();

// Get entity group by ID
EntityGroupInfo group = tb.getEntityGroupById(GetEntityGroupByIdArgs.builder().entityGroupId(groupId).build());

// Look up by owner, type, and name
User me = tb.getUser();
String tenantId = me.getTenantId().getId().toString();
EntityGroupInfo group = tb.getEntityGroupByOwnerAndNameAndType(GetEntityGroupByOwnerAndNameAndTypeArgs.builder()
        .ownerType("TENANT")
        .ownerId(tenantId)
        .groupType("DEVICE")
        .groupName("Factory Floor Sensors")
        .build());

// Get the special "All" group for a given owner and type
EntityGroupInfo allDevices = tb.getEntityGroupAllByOwnerAndType(GetEntityGroupAllByOwnerAndTypeArgs.builder()
        .ownerType("TENANT")
        .ownerId(tenantId)
        .groupType("DEVICE")
        .build());

// List all device groups (optionally include shared)
List<EntityGroupInfo> groups = tb.getAllEntityGroupsByType(GetAllEntityGroupsByTypeArgs.builder().groupType("DEVICE").includeShared(true).build());

// List device groups owned by a specific customer
List<EntityGroupInfo> groups = tb.getAllEntityGroupsByOwnerAndType(GetAllEntityGroupsByOwnerAndTypeArgs.builder()
        .ownerType("CUSTOMER")
        .ownerId(customerId)
        .groupType("DEVICE")
        .build());

// Add devices to a group
tb.addEntitiesToEntityGroup(AddEntitiesToEntityGroupArgs.builder().entityGroupId(groupId).requestBody(List.of(deviceId1, deviceId2)).build());

// Remove devices from a group
tb.removeEntitiesFromEntityGroup(RemoveEntitiesFromEntityGroupArgs.builder().entityGroupId(groupId).requestBody(List.of(deviceId1)).build());

// List devices in a group (paginated)
PageDataDevice page = tb.getDevicesByEntityGroupId(GetDevicesByEntityGroupIdArgs.builder()
        .entityGroupId(groupId)
        .pageSize("10")
        .page("0")
        .build());
List<Device> devices = page.getData();

// Delete an entity group
tb.deleteEntityGroup(DeleteEntityGroupArgs.builder().entityGroupId(groupId).build());
```

### Roles

```java
// Create a GROUP role (controls access to a specific entity group)
Role role = new Role();
role.setName("Sensor Viewers");
role.setType(RoleType.GROUP);
Role saved = tb.saveRole(SaveRoleArgs.builder().role(role).build());
String roleId = saved.getId().getId().toString();

// Get role by ID
Role role = tb.getRoleById(GetRoleByIdArgs.builder().roleId(roleId).build());

// List roles (paginated, optionally filter by type)
PageDataRole page = tb.getRoles(GetRolesArgs.builder()
        .pageSize("10")
        .page("0")
        .type("GROUP")
        .build());
List<Role> roles = page.getData();
```

### Group Permissions

```java
// Grant a user group access to an entity group via a role
GroupPermission gp = new GroupPermission();
gp.setUserGroupId(new EntityGroupId().id(UUID.fromString(userGroupId)));
gp.setEntityGroupId(new EntityGroupId().id(UUID.fromString(deviceGroupId)));
gp.setRoleId(new RoleId().id(UUID.fromString(roleId)));
GroupPermission saved = tb.saveGroupPermission(SaveGroupPermissionArgs.builder().groupPermission(gp).build());

// List permissions for an entity group
List<GroupPermissionInfo> perms = tb.getEntityGroupPermissions(GetEntityGroupPermissionsArgs.builder().entityGroupId(deviceGroupId).build());

// List permissions for a user group
List<GroupPermissionInfo> perms = tb.getUserGroupPermissions(GetUserGroupPermissionsArgs.builder().userGroupId(userGroupId).build());

// Delete a group permission
tb.deleteGroupPermission(DeleteGroupPermissionArgs.builder().groupPermissionId(saved.getId().getId().toString()).build());
```

### Sharing

```java
// Share entity group with a specific user group using a role
tb.shareEntityGroupToChildOwnerUserGroup(ShareEntityGroupToChildOwnerUserGroupArgs.builder()
        .entityGroupId(entityGroupId)
        .userGroupId(userGroupId)
        .roleId(roleId)
        .build());

// Share entity group with the "All" user group (read-only)
ShareGroupRequest req = new ShareGroupRequest();
req.setAllUserGroup(true);
req.setReadElseWrite(true);
tb.shareEntityGroup(ShareEntityGroupArgs.builder().entityGroupId(entityGroupId).shareGroupRequest(req).build());
```

### Ownership

```java
// Transfer a device group to a customer
tb.changeOwnerToCustomer(ChangeOwnerToCustomerArgs.builder()
        .ownerId(customerId)
        .entityType("ENTITY_GROUP")
        .entityId(groupId)
        .build());

// Transfer it back to the tenant
tb.changeOwnerToTenant(ChangeOwnerToTenantArgs.builder()
        .ownerId(tenantId)
        .entityType("ENTITY_GROUP")
        .entityId(groupId)
        .build());
```

### Customer hierarchy

```java
// Create a sub-customer and place it in a customer group
Customer sub = new Customer();
sub.setTitle("Acme West");
Customer saved = tb.saveCustomer(SaveCustomerArgs.builder().customer(sub).entityGroupId(customerGroupId).build());
String subId = saved.getId().getId().toString();

// Get the "All" user group for the sub-customer
EntityGroupInfo allUsers = tb.getEntityGroupAllByOwnerAndType(GetEntityGroupAllByOwnerAndTypeArgs.builder()
        .ownerType("CUSTOMER")
        .ownerId(subId)
        .groupType("USER")
        .build());
String userGroupId = allUsers.getId().getId().toString();

// Create a customer user and place it in a user group
User user = new User();
user.setEmail("operator@acme-west.com");
user.setAuthority(Authority.CUSTOMER_USER);
user.setCustomerId(new CustomerId().id(UUID.fromString(subId)));
User savedUser = tb.saveUser(SaveUserArgs.builder()
        .user(user)
        .sendActivationMail("false")
        .entityGroupId(userGroupId)
        .build());

// List users in a user group (paginated)
PageDataUser page = tb.getUsersByEntityGroupId(GetUsersByEntityGroupIdArgs.builder()
        .entityGroupId(userGroupId)
        .pageSize(10)
        .page(0)
        .build());

// List customers in a customer group (paginated)
PageDataCustomer page = tb.getCustomersByEntityGroupId(GetCustomersByEntityGroupIdArgs.builder()
        .entityGroupId(customerGroupId)
        .pageSize("10")
        .page("0")
        .build());
```

### Full workflow: customer onboarding

End-to-end example: create customer, device group, user group, role, permission, and share.

```java
// 1. Create customer
Customer customer = new Customer();
customer.setTitle("Acme Corp");
Customer savedCustomer = tb.saveCustomer(SaveCustomerArgs.builder().customer(customer).build());
String customerId = savedCustomer.getId().getId().toString();

// 2. Create a device group owned by the tenant
EntityGroup deviceGroup = new EntityGroup();
deviceGroup.setName("Acme Devices");
deviceGroup.setType(EntityGroup.TypeEnum.DEVICE);
EntityGroupInfo savedGroup = tb.saveEntityGroup(SaveEntityGroupArgs.builder().entityGroup(deviceGroup).build());
String deviceGroupId = savedGroup.getId().getId().toString();

// 3. Get the customer's "All" user group (auto-created by TB)
EntityGroupInfo allUsers = tb.getEntityGroupAllByOwnerAndType(GetEntityGroupAllByOwnerAndTypeArgs.builder()
        .ownerType("CUSTOMER")
        .ownerId(customerId)
        .groupType("USER")
        .build());
String userGroupId = allUsers.getId().getId().toString();

// 4. Create a role that grants read-only access
Role role = new Role();
role.setName("Acme Device Readers");
role.setType(RoleType.GROUP);
Role savedRole = tb.saveRole(SaveRoleArgs.builder().role(role).build());
String roleId = savedRole.getId().getId().toString();

// 5. Share the device group with the customer's user group
tb.shareEntityGroupToChildOwnerUserGroup(ShareEntityGroupToChildOwnerUserGroupArgs.builder()
        .entityGroupId(deviceGroupId)
        .userGroupId(userGroupId)
        .roleId(roleId)
        .build());

// 6. Add devices to the group
tb.addEntitiesToEntityGroup(AddEntitiesToEntityGroupArgs.builder().entityGroupId(deviceGroupId).requestBody(List.of(deviceId)).build());
```

### Find or create an entity group

```java
User me = tb.getUser();
String tenantId = me.getTenantId().getId().toString();

EntityGroupInfo group;
try {
    group = tb.getEntityGroupByOwnerAndNameAndType(GetEntityGroupByOwnerAndNameAndTypeArgs.builder()
            .ownerType("TENANT")
            .ownerId(tenantId)
            .groupType("DEVICE")
            .groupName("Factory Floor Sensors")
            .build());
} catch (ApiException e) {
    if (e.getCode() == 404) {
        EntityGroup newGroup = new EntityGroup();
        newGroup.setName("Factory Floor Sensors");
        newGroup.setType(EntityGroup.TypeEnum.DEVICE);
        group = tb.saveEntityGroup(SaveEntityGroupArgs.builder().entityGroup(newGroup).build());
    } else {
        throw e;
    }
}
String groupId = group.getId().getId().toString();
```
