# ThingsboardClient Code Examples

Method signatures (parameter counts) vary by edition (CE / PE / PaaS). The examples below match the PE edition. 
CE methods typically have fewer optional parameters. Always check `target/api-docs/` for your edition's exact signatures.

## Devices

```java
// Get device by ID
Device device = tb.getDeviceById(deviceId);

// Get device by name (unique within tenant)
Device device = tb.getTenantDeviceByName("Temperature Sensor A1");

// Create or update a device
Device device = new Device();
device.setName("My Device");
device.setType("default");
Device saved = tb.saveDevice(device, null, null, null, null, null, null);

// Delete a device
tb.deleteDevice(deviceId);

// Get device credentials (access token)
DeviceCredentials creds = tb.getDeviceCredentialsByDeviceId(deviceId);
String accessToken = creds.getCredentialsId();

// List tenant devices (paginated)
PageDataDevice page = tb.getTenantDevices(10, 0, null, null, null, null);
List<Device> devices = page.getData();

// Get device info (includes customer name, device profile name, etc.)
DeviceInfo info = tb.getDeviceInfoById(deviceId);
```

## Assets

```java
// Get asset by ID
Asset asset = tb.getAssetById(assetId);

// Get asset by name (unique within tenant)
Asset asset = tb.getTenantAssetByName("Building A");

// Create or update an asset
Asset asset = new Asset();
asset.setName("Building A");
asset.setType("building");
Asset saved = tb.saveAsset(asset, null, null, null, null, null);

// Delete an asset
tb.deleteAsset(assetId);

// List tenant assets (paginated)
PageDataAsset page = tb.getTenantAssets(10, 0, null, null, null, null);
List<Asset> assets = page.getData();
```

## Customers

```java
// Get customer by ID
Customer customer = tb.getCustomerById(customerId);

// Get customer by title (unique within tenant)
Customer customer = tb.getTenantCustomer("Acme Corp");

// Create or update a customer
Customer customer = new Customer();
customer.setTitle("Acme Corp");
customer.setEmail("info@acme.com");
Customer saved = tb.saveCustomer(customer, null, null, null, null, null);
```

## Attributes

```java
// Save server-side attributes on a device
tb.saveDeviceAttributes(deviceId, "SERVER_SCOPE",
        """
        {"billingActive": true, "plan": "pro"}
        """);

// Save attributes on any entity (device, asset, etc.)
tb.saveEntityAttributesV2("ASSET", assetId, "SERVER_SCOPE",
        """
        {"key1": "value1", "key2": 42}
        """);

// Read attributes by scope
List<AttributeData> attrs = tb.getAttributesByScope(
        "DEVICE", deviceId, "SERVER_SCOPE",
        "billingActive,plan",  // comma-separated keys (or null for all)
        null);                 // alternative: List<String> keys

// List attribute key names
List<String> keys = tb.getAttributeKeys("DEVICE", deviceId);
List<String> scopedKeys = tb.getAttributeKeysByScope("DEVICE", deviceId, "SERVER_SCOPE");

// Delete attributes
tb.deleteDeviceAttributes(deviceId, "SERVER_SCOPE", "key1,key2", null);
```

### Read-modify-write pattern

A common pattern: read an attribute, change its value, save it back.

```java
// Read current value
List<AttributeData> attrs = tb.getAttributesByScope(
        "ASSET", assetId, "SERVER_SCOPE", "deviceCount", null);

long current = 0;
if (!attrs.isEmpty()) {
    current = ((Number) attrs.get(0).getValue()).longValue();
}

// Modify and save back
long updated = current + 1;
tb.saveEntityAttributesV2("ASSET", assetId, "SERVER_SCOPE",
        "{\"deviceCount\": %d}".formatted(updated));
```

## Telemetry

```java
// List telemetry key names for an entity
List<String> keys = tb.getTimeseriesKeys("DEVICE", deviceId);

// Get timeseries history
Map<String, List<TsData>> data = tb.getTimeseriesHistory(
        "DEVICE", deviceId,
        startTs, endTs,       // Unix epoch millis
        "temperature,humidity", // keys
        null, null, null,     // intervalType, interval, timeZone
        "100",                // limit
        "NONE",               // aggregation: NONE, AVG, SUM, MIN, MAX, COUNT
        "DESC",               // order
        true,                 // useStrictDataTypes
        null);                // alternative key list

// Delete timeseries data
tb.deleteEntityTimeseries("DEVICE", deviceId,
        "temperature", true,  // keys, deleteAllDataForKeys
        null, null,           // startTs, endTs (null = all)
        true, false, null);   // deleteLatest, rewriteLatest, keyList
```

## Alarms

```java
// Create an alarm
Alarm alarm = new Alarm();
alarm.setType("High Temperature");
alarm.setOriginator(new EntityId().entityType(EntityId.EntityTypeEnum.DEVICE).id(deviceId));
alarm.setSeverity(Alarm.SeverityEnum.CRITICAL);
Alarm saved = tb.saveAlarm(alarm);

// Get alarm by ID
Alarm alarm = tb.getAlarmById(alarmId);

// Acknowledge an alarm
tb.ackAlarm(alarmId);

// Clear an alarm
tb.clearAlarm(alarmId);
```

## Relations

```java
// Create a relation
EntityRelation relation = new EntityRelation();
relation.setFrom(new EntityId().entityType(EntityId.EntityTypeEnum.ASSET).id(assetId));
relation.setTo(new EntityId().entityType(EntityId.EntityTypeEnum.DEVICE).id(deviceId));
relation.setType("Contains");
relation.setTypeGroup(EntityRelation.TypeGroupEnum.COMMON);
tb.saveRelation(relation);
```

## Users

```java
// Get current user
User user = tb.getUser();

// Get user by ID
User user = tb.getUserById(userId);
```

## Dashboards

```java
// Get dashboard by ID
Dashboard dashboard = tb.getDashboardById(dashboardId);

// List tenant dashboards (paginated)
PageDataDashboardInfo page = tb.getTenantDashboards1(10, 0, null, null, null, null);
```

## Entity Groups & Permissions (PE / PaaS only)

> The APIs in this section are only available in the PE and PaaS editions. They will not compile against the CE client.

### Entity Groups

```java
// Create a device entity group
EntityGroup group = new EntityGroup();
group.setName("Factory Floor Sensors");
group.setType(EntityGroup.TypeEnum.DEVICE);
EntityGroupInfo saved = tb.saveEntityGroup(group);
String groupId = saved.getId().getId().toString();

// Get entity group by ID
EntityGroupInfo group = tb.getEntityGroupById(groupId);

// Look up by owner, type, and name
User me = tb.getUser();
String tenantId = me.getTenantId().getId().toString();
EntityGroupInfo group = tb.getEntityGroupByOwnerAndNameAndType(
        "TENANT", tenantId, "DEVICE", "Factory Floor Sensors");

// Get the special "All" group for a given owner and type
EntityGroupInfo allDevices = tb.getEntityGroupAllByOwnerAndType("TENANT", tenantId, "DEVICE");

// List all device groups (optionally include shared)
List<EntityGroupInfo> groups = tb.getAllEntityGroupsByType("DEVICE", true);

// List device groups owned by a specific customer
List<EntityGroupInfo> groups = tb.getAllEntityGroupsByOwnerAndType(
        "CUSTOMER", customerId, "DEVICE");

// Add devices to a group
tb.addEntitiesToEntityGroup(groupId, List.of(deviceId1, deviceId2));

// Remove devices from a group
tb.removeEntitiesFromEntityGroup(groupId, List.of(deviceId1));

// List devices in a group (paginated)
PageDataDevice page = tb.getDevicesByEntityGroupId(groupId, "10", "0", null, null, null);
List<Device> devices = page.getData();

// Delete an entity group
tb.deleteEntityGroup(groupId);
```

### Roles

```java
// Create a GROUP role (controls access to a specific entity group)
Role role = new Role();
role.setName("Sensor Viewers");
role.setType(RoleType.GROUP);
Role saved = tb.saveRole(role);
String roleId = saved.getId().getId().toString();

// Get role by ID
Role role = tb.getRoleById(roleId);

// List roles (paginated, optionally filter by type)
PageDataRole page = tb.getRoles("10", "0", "GROUP", null, null, null);
List<Role> roles = page.getData();
```

### Group Permissions

```java
// Grant a user group access to an entity group via a role
GroupPermission gp = new GroupPermission();
gp.setUserGroupId(new EntityGroupId()
        .id(UUID.fromString(userGroupId)).entityType(EntityType.ENTITY_GROUP));
gp.setEntityGroupId(new EntityGroupId()
        .id(UUID.fromString(deviceGroupId)).entityType(EntityType.ENTITY_GROUP));
gp.setRoleId(new RoleId()
        .id(UUID.fromString(roleId)).entityType(EntityType.ROLE));
GroupPermission saved = tb.saveGroupPermission(gp);

// List permissions for an entity group
List<GroupPermissionInfo> perms = tb.getEntityGroupPermissions(deviceGroupId);

// List permissions for a user group
List<GroupPermissionInfo> perms = tb.getUserGroupPermissions(userGroupId);

// Delete a group permission
tb.deleteGroupPermission(saved.getId().getId().toString());
```

### Sharing

```java
// Share entity group with a specific user group using a role
tb.shareEntityGroupToChildOwnerUserGroup(entityGroupId, userGroupId, roleId);

// Share entity group with the "All" user group (read-only)
ShareGroupRequest req = new ShareGroupRequest();
req.setAllUserGroup(true);
req.setReadElseWrite(true);
tb.shareEntityGroup(entityGroupId, req);
```

### Ownership

```java
// Transfer a device group to a customer
tb.changeOwnerToCustomer(customerId, "ENTITY_GROUP", groupId, null);

// Transfer it back to the tenant
tb.changeOwnerToTenant(tenantId, "ENTITY_GROUP", groupId, null);
```

### Customer hierarchy

```java
// Create a sub-customer and place it in a customer group
Customer sub = new Customer();
sub.setTitle("Acme West");
Customer saved = tb.saveCustomer(sub, customerGroupId, null, null, null, null);
String subId = saved.getId().getId().toString();

// Get the "All" user group for the sub-customer
EntityGroupInfo allUsers = tb.getEntityGroupAllByOwnerAndType(
        "CUSTOMER", subId, "USER");
String userGroupId = allUsers.getId().getId().toString();

// Create a customer user and place it in a user group
User user = new User();
user.setEmail("operator@acme-west.com");
user.setAuthority(Authority.CUSTOMER_USER);
user.setCustomerId(new CustomerId()
        .id(UUID.fromString(subId)).entityType(EntityType.CUSTOMER));
User savedUser = tb.saveUser(user, "false", userGroupId, null);

// List users in a user group (paginated)
PageDataUser page = tb.getUsersByEntityGroupId(userGroupId, 10, 0, null, null, null);

// List customers in a customer group (paginated)
PageDataCustomer page = tb.getCustomersByEntityGroupId(
        customerGroupId, "10", "0", null, null, null);
```

### Full workflow: customer onboarding

End-to-end example: create customer, device group, user group, role, permission, and share.

```java
// 1. Create customer
Customer customer = new Customer();
customer.setTitle("Acme Corp");
Customer savedCustomer = tb.saveCustomer(customer, null, null, null, null, null);
String customerId = savedCustomer.getId().getId().toString();

// 2. Create a device group owned by the tenant
EntityGroup deviceGroup = new EntityGroup();
deviceGroup.setName("Acme Devices");
deviceGroup.setType(EntityGroup.TypeEnum.DEVICE);
EntityGroupInfo savedGroup = tb.saveEntityGroup(deviceGroup);
String deviceGroupId = savedGroup.getId().getId().toString();

// 3. Get the customer's "All" user group (auto-created by TB)
EntityGroupInfo allUsers = tb.getEntityGroupAllByOwnerAndType(
        "CUSTOMER", customerId, "USER");
String userGroupId = allUsers.getId().getId().toString();

// 4. Create a role that grants read-only access
Role role = new Role();
role.setName("Acme Device Readers");
role.setType(RoleType.GROUP);
Role savedRole = tb.saveRole(role);
String roleId = savedRole.getId().getId().toString();

// 5. Share the device group with the customer's user group
tb.shareEntityGroupToChildOwnerUserGroup(deviceGroupId, userGroupId, roleId);

// 6. Add devices to the group
tb.addEntitiesToEntityGroup(deviceGroupId, List.of(deviceId));
```

### Find or create an entity group

```java
User me = tb.getUser();
String tenantId = me.getTenantId().getId().toString();

EntityGroupInfo group;
try {
    group = tb.getEntityGroupByOwnerAndNameAndType(
            "TENANT", tenantId, "DEVICE", "Factory Floor Sensors");
} catch (ApiException e) {
    if (e.getCode() == 404) {
        EntityGroup newGroup = new EntityGroup();
        newGroup.setName("Factory Floor Sensors");
        newGroup.setType(EntityGroup.TypeEnum.DEVICE);
        group = tb.saveEntityGroup(newGroup);
    } else {
        throw e;
    }
}
String groupId = group.getId().getId().toString();
```
