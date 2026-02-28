# EntityQueryControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countAlarmsByQuery**](EntityQueryControllerApi.md#countAlarmsByQuery) | **POST** /api/alarmsQuery/count | Count Alarms by Query (countAlarmsByQuery) |
| [**countEntitiesByQuery**](EntityQueryControllerApi.md#countEntitiesByQuery) | **POST** /api/entitiesQuery/count | Count Entities by Query |
| [**findAlarmDataByQuery**](EntityQueryControllerApi.md#findAlarmDataByQuery) | **POST** /api/alarmsQuery/find | Find Alarms by Query |
| [**findAvailableEntityKeysByQuery**](EntityQueryControllerApi.md#findAvailableEntityKeysByQuery) | **POST** /api/entitiesQuery/find/keys | Find Available Entity Keys by Query (deprecated) |
| [**findAvailableEntityKeysByQueryV2**](EntityQueryControllerApi.md#findAvailableEntityKeysByQueryV2) | **POST** /api/v2/entitiesQuery/find/keys | Find Available Entity Keys By Query |
| [**findEntityDataByQuery**](EntityQueryControllerApi.md#findEntityDataByQuery) | **POST** /api/entitiesQuery/find | Find Entity Data by Query |
| [**getEdqsState**](EntityQueryControllerApi.md#getEdqsState) | **GET** /api/edqs/state | getEdqsState |
| [**processSystemEdqsRequest**](EntityQueryControllerApi.md#processSystemEdqsRequest) | **POST** /api/edqs/system/request | processSystemEdqsRequest |



## countAlarmsByQuery

> Long countAlarmsByQuery(alarmCountQuery)

Count Alarms by Query (countAlarmsByQuery)

Returns the number of alarms that match the query definition.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alarmCountQuery** | [**AlarmCountQuery**](AlarmCountQuery.md)|  | |

### Return type

**Long**

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## countEntitiesByQuery

> Long countEntitiesByQuery(entityCountQuery)

Count Entities by Query

Allows to run complex queries to search the count of platform entities (devices, assets, customers, etc) based on the combination of main entity filter and multiple key filters. Returns the number of entities that match the query definition.  # Query Definition    Main **entity filter** is mandatory and defines generic search criteria. For example, \&quot;find all devices with profile &#39;Moisture Sensor&#39;\&quot; or \&quot;Find all devices related to asset &#39;Building A&#39;\&quot;  Optional **key filters** allow to filter results of the entity filter by complex criteria against main entity fields (name, label, type, etc), attributes and telemetry. For example, \&quot;temperature &gt; 20 or temperature&lt; 10\&quot; or \&quot;name starts with &#39;T&#39;, and attribute &#39;model&#39; is &#39;T1000&#39;, and time series field &#39;batteryLevel&#39; &gt; 40\&quot;.  Let&#39;s review the example:  &#x60;&#x60;&#x60;json {   \&quot;entityFilter\&quot;: {     \&quot;type\&quot;: \&quot;entityType\&quot;,     \&quot;entityType\&quot;: \&quot;DEVICE\&quot;   },   \&quot;keyFilters\&quot;: [     {       \&quot;key\&quot;: {         \&quot;type\&quot;: \&quot;ATTRIBUTE\&quot;,         \&quot;key\&quot;: \&quot;active\&quot;       },       \&quot;valueType\&quot;: \&quot;BOOLEAN\&quot;,       \&quot;predicate\&quot;: {         \&quot;operation\&quot;: \&quot;EQUAL\&quot;,         \&quot;value\&quot;: {           \&quot;defaultValue\&quot;: true,           \&quot;dynamicValue\&quot;: null         },         \&quot;type\&quot;: \&quot;BOOLEAN\&quot;       }     }   ] } &#x60;&#x60;&#x60;   Example mentioned above search all devices which have attribute &#39;active&#39; set to &#39;true&#39;. Now let&#39;s review available entity filters and key filters syntax:   # Entity Filters Entity Filter body depends on the &#39;type&#39; parameter. Let&#39;s review available entity filter types. In fact, they do correspond to available dashboard aliases.  ## Single Entity  Allows to filter only one entity based on the id. For example, this entity filter selects certain device:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;singleEntity\&quot;,   \&quot;singleEntity\&quot;: {     \&quot;id\&quot;: \&quot;d521edb0-2a7a-11ec-94eb-213c95f54092\&quot;,     \&quot;entityType\&quot;: \&quot;DEVICE\&quot;   } } &#x60;&#x60;&#x60;  ## Entity List Filter  Allows to filter entities of the same type using their ids. For example, this entity filter selects two devices:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;entityList\&quot;,   \&quot;entityType\&quot;: \&quot;DEVICE\&quot;,   \&quot;entityList\&quot;: [     \&quot;e6501f30-2a7a-11ec-94eb-213c95f54092\&quot;,     \&quot;e6657bf0-2a7a-11ec-94eb-213c95f54092\&quot;   ] } &#x60;&#x60;&#x60;  ## Entity Name Filter  Allows to filter entities of the same type using the **&#39;starts with&#39;** expression over entity name. For example, this entity filter selects all devices which name starts with &#39;Air Quality&#39;:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;entityName\&quot;,   \&quot;entityType\&quot;: \&quot;DEVICE\&quot;,   \&quot;entityNameFilter\&quot;: \&quot;Air Quality\&quot; } &#x60;&#x60;&#x60;  ## Entity Type Filter  Allows to filter entities based on their type (CUSTOMER, USER, DASHBOARD, ASSET, DEVICE, etc)For example, this entity filter selects all tenant customers:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;entityType\&quot;,   \&quot;entityType\&quot;: \&quot;CUSTOMER\&quot; } &#x60;&#x60;&#x60;  ## Asset Type Filter  Allows to filter assets based on their type and the **&#39;starts with&#39;** expression over their name. For example, this entity filter selects all &#39;charging station&#39; assets which name starts with &#39;Tesla&#39;:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;assetType\&quot;,   \&quot;assetType\&quot;: \&quot;charging station\&quot;,   \&quot;assetNameFilter\&quot;: \&quot;Tesla\&quot; } &#x60;&#x60;&#x60;  ## Device Type Filter  Allows to filter devices based on their type and the **&#39;starts with&#39;** expression over their name. For example, this entity filter selects all &#39;Temperature Sensor&#39; devices which name starts with &#39;ABC&#39;:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;deviceType\&quot;,   \&quot;deviceType\&quot;: \&quot;Temperature Sensor\&quot;,   \&quot;deviceNameFilter\&quot;: \&quot;ABC\&quot; } &#x60;&#x60;&#x60;  ## Edge Type Filter  Allows to filter edge instances based on their type and the **&#39;starts with&#39;** expression over their name. For example, this entity filter selects all &#39;Factory&#39; edge instances which name starts with &#39;Nevada&#39;:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;edgeType\&quot;,   \&quot;edgeType\&quot;: \&quot;Factory\&quot;,   \&quot;edgeNameFilter\&quot;: \&quot;Nevada\&quot; } &#x60;&#x60;&#x60;  ## Entity View Filter  Allows to filter entity views based on their type and the **&#39;starts with&#39;** expression over their name. For example, this entity filter selects all &#39;Concrete Mixer&#39; entity views which name starts with &#39;CAT&#39;:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;entityViewType\&quot;,   \&quot;entityViewType\&quot;: \&quot;Concrete Mixer\&quot;,   \&quot;entityViewNameFilter\&quot;: \&quot;CAT\&quot; } &#x60;&#x60;&#x60;  ## Api Usage Filter  Allows to query for Api Usage based on optional customer id. If the customer id is not set, returns current tenant API usage.For example, this entity filter selects the &#39;Api Usage&#39; entity for customer with id &#39;e6501f30-2a7a-11ec-94eb-213c95f54092&#39;:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;apiUsageState\&quot;,   \&quot;customerId\&quot;: {     \&quot;id\&quot;: \&quot;d521edb0-2a7a-11ec-94eb-213c95f54092\&quot;,     \&quot;entityType\&quot;: \&quot;CUSTOMER\&quot;   } } &#x60;&#x60;&#x60;  ## Relations Query Filter  Allows to filter entities that are related to the provided root entity. Possible direction values are &#39;TO&#39; and &#39;FROM&#39;. The &#39;maxLevel&#39; defines how many relation levels should the query search &#39;recursively&#39;. Assuming the &#39;maxLevel&#39; is &gt; 1, the &#39;fetchLastLevelOnly&#39; defines either to return all related entities or only entities that are on the last level of relations. The &#39;filter&#39; object allows you to define the relation type and set of acceptable entity types to search for. The relation query calculates all related entities, even if they are filtered using different relation types, and then extracts only those who match the &#39;filters&#39;.  For example, this entity filter selects all devices and assets which are related to the asset with id &#39;e51de0c0-2a7a-11ec-94eb-213c95f54092&#39;:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;relationsQuery\&quot;,   \&quot;rootEntity\&quot;: {     \&quot;entityType\&quot;: \&quot;ASSET\&quot;,     \&quot;id\&quot;: \&quot;e51de0c0-2a7a-11ec-94eb-213c95f54092\&quot;   },   \&quot;direction\&quot;: \&quot;FROM\&quot;,   \&quot;maxLevel\&quot;: 1,   \&quot;fetchLastLevelOnly\&quot;: false,   \&quot;filters\&quot;: [     {       \&quot;relationType\&quot;: \&quot;Contains\&quot;,       \&quot;entityTypes\&quot;: [         \&quot;DEVICE\&quot;,         \&quot;ASSET\&quot;       ]     }   ] } &#x60;&#x60;&#x60;  ## Asset Search Query  Allows to filter assets that are related to the provided root entity. Filters related assets based on the relation type and set of asset types. Possible direction values are &#39;TO&#39; and &#39;FROM&#39;. The &#39;maxLevel&#39; defines how many relation levels should the query search &#39;recursively&#39;. Assuming the &#39;maxLevel&#39; is &gt; 1, the &#39;fetchLastLevelOnly&#39; defines either to return all related entities or only entities that are on the last level of relations. The &#39;relationType&#39; defines the type of the relation to search for. The &#39;assetTypes&#39; defines the type of the asset to search for. The relation query calculates all related entities, even if they are filtered using different relation types, and then extracts only assets that match &#39;relationType&#39; and &#39;assetTypes&#39; conditions.  For example, this entity filter selects &#39;charging station&#39; assets which are related to the asset with id &#39;e51de0c0-2a7a-11ec-94eb-213c95f54092&#39; using &#39;Contains&#39; relation:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;assetSearchQuery\&quot;,   \&quot;rootEntity\&quot;: {     \&quot;entityType\&quot;: \&quot;ASSET\&quot;,     \&quot;id\&quot;: \&quot;e51de0c0-2a7a-11ec-94eb-213c95f54092\&quot;   },   \&quot;direction\&quot;: \&quot;FROM\&quot;,   \&quot;maxLevel\&quot;: 1,   \&quot;fetchLastLevelOnly\&quot;: false,   \&quot;relationType\&quot;: \&quot;Contains\&quot;,   \&quot;assetTypes\&quot;: [     \&quot;charging station\&quot;   ] } &#x60;&#x60;&#x60;  ## Device Search Query  Allows to filter devices that are related to the provided root entity. Filters related devices based on the relation type and set of device types. Possible direction values are &#39;TO&#39; and &#39;FROM&#39;. The &#39;maxLevel&#39; defines how many relation levels should the query search &#39;recursively&#39;. Assuming the &#39;maxLevel&#39; is &gt; 1, the &#39;fetchLastLevelOnly&#39; defines either to return all related entities or only entities that are on the last level of relations. The &#39;relationType&#39; defines the type of the relation to search for. The &#39;deviceTypes&#39; defines the type of the device to search for. The relation query calculates all related entities, even if they are filtered using different relation types, and then extracts only devices that match &#39;relationType&#39; and &#39;deviceTypes&#39; conditions.  For example, this entity filter selects &#39;Charging port&#39; and &#39;Air Quality Sensor&#39; devices which are related to the asset with id &#39;e52b0020-2a7a-11ec-94eb-213c95f54092&#39; using &#39;Contains&#39; relation:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;deviceSearchQuery\&quot;,   \&quot;rootEntity\&quot;: {     \&quot;entityType\&quot;: \&quot;ASSET\&quot;,     \&quot;id\&quot;: \&quot;e52b0020-2a7a-11ec-94eb-213c95f54092\&quot;   },   \&quot;direction\&quot;: \&quot;FROM\&quot;,   \&quot;maxLevel\&quot;: 2,   \&quot;fetchLastLevelOnly\&quot;: true,   \&quot;relationType\&quot;: \&quot;Contains\&quot;,   \&quot;deviceTypes\&quot;: [     \&quot;Air Quality Sensor\&quot;,     \&quot;Charging port\&quot;   ] } &#x60;&#x60;&#x60;  ## Entity View Query  Allows to filter entity views that are related to the provided root entity. Filters related entity views based on the relation type and set of entity view types. Possible direction values are &#39;TO&#39; and &#39;FROM&#39;. The &#39;maxLevel&#39; defines how many relation levels should the query search &#39;recursively&#39;. Assuming the &#39;maxLevel&#39; is &gt; 1, the &#39;fetchLastLevelOnly&#39; defines either to return all related entities or only entities that are on the last level of relations. The &#39;relationType&#39; defines the type of the relation to search for. The &#39;entityViewTypes&#39; defines the type of the entity view to search for. The relation query calculates all related entities, even if they are filtered using different relation types, and then extracts only devices that match &#39;relationType&#39; and &#39;deviceTypes&#39; conditions.  For example, this entity filter selects &#39;Concrete mixer&#39; entity views which are related to the asset with id &#39;e52b0020-2a7a-11ec-94eb-213c95f54092&#39; using &#39;Contains&#39; relation:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;entityViewSearchQuery\&quot;,   \&quot;rootEntity\&quot;: {     \&quot;entityType\&quot;: \&quot;ASSET\&quot;,     \&quot;id\&quot;: \&quot;e52b0020-2a7a-11ec-94eb-213c95f54092\&quot;   },   \&quot;direction\&quot;: \&quot;FROM\&quot;,   \&quot;maxLevel\&quot;: 1,   \&quot;fetchLastLevelOnly\&quot;: false,   \&quot;relationType\&quot;: \&quot;Contains\&quot;,   \&quot;entityViewTypes\&quot;: [     \&quot;Concrete mixer\&quot;   ] } &#x60;&#x60;&#x60;  ## Edge Search Query  Allows to filter edge instances that are related to the provided root entity. Filters related edge instances based on the relation type and set of edge types. Possible direction values are &#39;TO&#39; and &#39;FROM&#39;. The &#39;maxLevel&#39; defines how many relation levels should the query search &#39;recursively&#39;. Assuming the &#39;maxLevel&#39; is &gt; 1, the &#39;fetchLastLevelOnly&#39; defines either to return all related entities or only entities that are on the last level of relations. The &#39;relationType&#39; defines the type of the relation to search for. The &#39;deviceTypes&#39; defines the type of the device to search for. The relation query calculates all related entities, even if they are filtered using different relation types, and then extracts only devices that match &#39;relationType&#39; and &#39;deviceTypes&#39; conditions.  For example, this entity filter selects &#39;Factory&#39; edge instances which are related to the asset with id &#39;e52b0020-2a7a-11ec-94eb-213c95f54092&#39; using &#39;Contains&#39; relation:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;deviceSearchQuery\&quot;,   \&quot;rootEntity\&quot;: {     \&quot;entityType\&quot;: \&quot;ASSET\&quot;,     \&quot;id\&quot;: \&quot;e52b0020-2a7a-11ec-94eb-213c95f54092\&quot;   },   \&quot;direction\&quot;: \&quot;FROM\&quot;,   \&quot;maxLevel\&quot;: 2,   \&quot;fetchLastLevelOnly\&quot;: true,   \&quot;relationType\&quot;: \&quot;Contains\&quot;,   \&quot;edgeTypes\&quot;: [     \&quot;Factory\&quot;   ] } &#x60;&#x60;&#x60;   # Key Filters Key Filter allows you to define complex logical expressions over entity field, attribute or latest time series value. The filter is defined using &#39;key&#39;, &#39;valueType&#39; and &#39;predicate&#39; objects. Single Entity Query may have zero, one or multiple predicates. If multiple filters are defined, they are evaluated using logical &#39;AND&#39;. The example below checks that temperature of the entity is above 20 degrees:  &#x60;&#x60;&#x60;json {   \&quot;key\&quot;: {     \&quot;type\&quot;: \&quot;TIME_SERIES\&quot;,     \&quot;key\&quot;: \&quot;temperature\&quot;   },   \&quot;valueType\&quot;: \&quot;NUMERIC\&quot;,   \&quot;predicate\&quot;: {     \&quot;operation\&quot;: \&quot;GREATER\&quot;,     \&quot;value\&quot;: {       \&quot;defaultValue\&quot;: 20,       \&quot;dynamicValue\&quot;: null     },     \&quot;type\&quot;: \&quot;NUMERIC\&quot;   } } &#x60;&#x60;&#x60;   Now let&#39;s review &#39;key&#39;, &#39;valueType&#39; and &#39;predicate&#39; objects in detail.  ## Filter Key  Filter Key defines either entity field, attribute or telemetry. It is a JSON object that consists the key name and type. The following filter key types are supported:    * &#39;CLIENT_ATTRIBUTE&#39; - used for client attributes;   * &#39;SHARED_ATTRIBUTE&#39; - used for shared attributes;   * &#39;SERVER_ATTRIBUTE&#39; - used for server attributes;   * &#39;ATTRIBUTE&#39; - used for any of the above;   * &#39;TIME_SERIES&#39; - used for time series values;   * &#39;ENTITY_FIELD&#39; - used for accessing entity fields like &#39;name&#39;, &#39;label&#39;, etc. The list of available fields depends on the entity type;   * &#39;ALARM_FIELD&#39; - similar to entity field, but is used in alarm queries only;     Let&#39;s review the example:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;TIME_SERIES\&quot;,   \&quot;key\&quot;: \&quot;temperature\&quot; } &#x60;&#x60;&#x60;  ## Value Type and Operations  Provides a hint about the data type of the entity field that is defined in the filter key. The value type impacts the list of possible operations that you may use in the corresponding predicate. For example, you may use &#39;STARTS_WITH&#39; or &#39;END_WITH&#39;, but you can&#39;t use &#39;GREATER_OR_EQUAL&#39; for string values.The following filter value types and corresponding predicate operations are supported:    * &#39;STRING&#39; - used to filter any &#39;String&#39; or &#39;JSON&#39; values. Operations: EQUAL, NOT_EQUAL, STARTS_WITH, ENDS_WITH, CONTAINS, NOT_CONTAINS;   * &#39;NUMERIC&#39; - used for &#39;Long&#39; and &#39;Double&#39; values. Operations: EQUAL, NOT_EQUAL, GREATER, LESS, GREATER_OR_EQUAL, LESS_OR_EQUAL;   * &#39;BOOLEAN&#39; - used for boolean values. Operations: EQUAL, NOT_EQUAL;  * &#39;DATE_TIME&#39; - similar to numeric, transforms value to milliseconds since epoch. Operations: EQUAL, NOT_EQUAL, GREATER, LESS, GREATER_OR_EQUAL, LESS_OR_EQUAL;    ## Filter Predicate  Filter Predicate defines the logical expression to evaluate. The list of available operations depends on the filter value type, see above. Platform supports 4 predicate types: &#39;STRING&#39;, &#39;NUMERIC&#39;, &#39;BOOLEAN&#39; and &#39;COMPLEX&#39;. The last one allows to combine multiple operations over one filter key.  Simple predicate example to check &#39;value &lt; 100&#39;:   &#x60;&#x60;&#x60;json {   \&quot;operation\&quot;: \&quot;LESS\&quot;,   \&quot;value\&quot;: {     \&quot;defaultValue\&quot;: 100,     \&quot;dynamicValue\&quot;: null   },   \&quot;type\&quot;: \&quot;NUMERIC\&quot; } &#x60;&#x60;&#x60;  Complex predicate example, to check &#39;value &lt; 10 or value &gt; 20&#39;:   &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;COMPLEX\&quot;,   \&quot;operation\&quot;: \&quot;OR\&quot;,   \&quot;predicates\&quot;: [     {       \&quot;operation\&quot;: \&quot;LESS\&quot;,       \&quot;value\&quot;: {         \&quot;defaultValue\&quot;: 10,         \&quot;dynamicValue\&quot;: null       },       \&quot;type\&quot;: \&quot;NUMERIC\&quot;     },     {       \&quot;operation\&quot;: \&quot;GREATER\&quot;,       \&quot;value\&quot;: {         \&quot;defaultValue\&quot;: 20,         \&quot;dynamicValue\&quot;: null       },       \&quot;type\&quot;: \&quot;NUMERIC\&quot;     }   ] } &#x60;&#x60;&#x60;  More complex predicate example, to check &#39;value &lt; 10 or (value &gt; 50 &amp;&amp; value &lt; 60)&#39;:   &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;COMPLEX\&quot;,   \&quot;operation\&quot;: \&quot;OR\&quot;,   \&quot;predicates\&quot;: [     {       \&quot;operation\&quot;: \&quot;LESS\&quot;,       \&quot;value\&quot;: {         \&quot;defaultValue\&quot;: 10,         \&quot;dynamicValue\&quot;: null       },       \&quot;type\&quot;: \&quot;NUMERIC\&quot;     },     {       \&quot;type\&quot;: \&quot;COMPLEX\&quot;,       \&quot;operation\&quot;: \&quot;AND\&quot;,       \&quot;predicates\&quot;: [         {           \&quot;operation\&quot;: \&quot;GREATER\&quot;,           \&quot;value\&quot;: {             \&quot;defaultValue\&quot;: 50,             \&quot;dynamicValue\&quot;: null           },           \&quot;type\&quot;: \&quot;NUMERIC\&quot;         },         {           \&quot;operation\&quot;: \&quot;LESS\&quot;,           \&quot;value\&quot;: {             \&quot;defaultValue\&quot;: 60,             \&quot;dynamicValue\&quot;: null           },           \&quot;type\&quot;: \&quot;NUMERIC\&quot;         }       ]     }   ] } &#x60;&#x60;&#x60;   You may also want to replace hardcoded values (for example, temperature &gt; 20) with the more dynamic expression (for example, temperature &gt; &#39;value of the tenant attribute with key &#39;temperatureThreshold&#39;). It is possible to use &#39;dynamicValue&#39; to define attribute of the tenant, customer or user that is performing the API call. See example below:   &#x60;&#x60;&#x60;json {   \&quot;operation\&quot;: \&quot;GREATER\&quot;,   \&quot;value\&quot;: {     \&quot;defaultValue\&quot;: 0,     \&quot;dynamicValue\&quot;: {       \&quot;sourceType\&quot;: \&quot;CURRENT_USER\&quot;,       \&quot;sourceAttribute\&quot;: \&quot;temperatureThreshold\&quot;     }   },   \&quot;type\&quot;: \&quot;NUMERIC\&quot; } &#x60;&#x60;&#x60;   Note that you may use &#39;CURRENT_USER&#39;, &#39;CURRENT_CUSTOMER&#39; and &#39;CURRENT_TENANT&#39; as a &#39;sourceType&#39;. The &#39;defaultValue&#39; is used when the attribute with such a name is not defined for the chosen source.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityCountQuery** | [**EntityCountQuery**](EntityCountQuery.md)|  | |

### Return type

**Long**

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## findAlarmDataByQuery

> PageDataAlarmData findAlarmDataByQuery(alarmDataQuery)

Find Alarms by Query

This method description defines how Alarm Data Query extends the Entity Data Query. See method &#39;Find Entity Data by Query&#39; first to get the info about &#39;Entity Data Query&#39;.   The platform will first search the entities that match the entity and key filters. Then, the platform will use &#39;Alarm Page Link&#39; to filter the alarms related to those entities. Finally, platform fetch the properties of alarm that are defined in the **&#39;alarmFields&#39;** and combine them with the other entity, attribute and latest time series fields to return the result.    See example of the alarm query below. The query will search first 100 active alarms with type &#39;Temperature Alarm&#39; or &#39;Fire Alarm&#39; for any device with current temperature &gt; 0. The query will return combination of the entity fields: name of the device, device model and latest temperature reading and alarms fields: createdTime, type, severity and status:   &#x60;&#x60;&#x60;json {   \&quot;entityFilter\&quot;: {     \&quot;type\&quot;: \&quot;entityType\&quot;,     \&quot;resolveMultiple\&quot;: true,     \&quot;entityType\&quot;: \&quot;DEVICE\&quot;   },   \&quot;pageLink\&quot;: {     \&quot;page\&quot;: 0,     \&quot;pageSize\&quot;: 100,     \&quot;textSearch\&quot;: null,     \&quot;searchPropagatedAlarms\&quot;: false,     \&quot;statusList\&quot;: [       \&quot;ACTIVE\&quot;     ],     \&quot;severityList\&quot;: [       \&quot;CRITICAL\&quot;,       \&quot;MAJOR\&quot;     ],     \&quot;typeList\&quot;: [       \&quot;Temperature Alarm\&quot;,       \&quot;Fire Alarm\&quot;     ],     \&quot;sortOrder\&quot;: {       \&quot;key\&quot;: {         \&quot;key\&quot;: \&quot;createdTime\&quot;,         \&quot;type\&quot;: \&quot;ALARM_FIELD\&quot;       },       \&quot;direction\&quot;: \&quot;DESC\&quot;     },     \&quot;timeWindow\&quot;: 86400000   },   \&quot;keyFilters\&quot;: [     {       \&quot;key\&quot;: {         \&quot;type\&quot;: \&quot;TIME_SERIES\&quot;,         \&quot;key\&quot;: \&quot;temperature\&quot;       },       \&quot;valueType\&quot;: \&quot;NUMERIC\&quot;,       \&quot;predicate\&quot;: {         \&quot;operation\&quot;: \&quot;GREATER\&quot;,         \&quot;value\&quot;: {           \&quot;defaultValue\&quot;: 0,           \&quot;dynamicValue\&quot;: null         },         \&quot;type\&quot;: \&quot;NUMERIC\&quot;       }     }   ],   \&quot;alarmFields\&quot;: [     {       \&quot;type\&quot;: \&quot;ALARM_FIELD\&quot;,       \&quot;key\&quot;: \&quot;createdTime\&quot;     },     {       \&quot;type\&quot;: \&quot;ALARM_FIELD\&quot;,       \&quot;key\&quot;: \&quot;type\&quot;     },     {       \&quot;type\&quot;: \&quot;ALARM_FIELD\&quot;,       \&quot;key\&quot;: \&quot;severity\&quot;     },     {       \&quot;type\&quot;: \&quot;ALARM_FIELD\&quot;,       \&quot;key\&quot;: \&quot;status\&quot;     }   ],   \&quot;entityFields\&quot;: [     {       \&quot;type\&quot;: \&quot;ENTITY_FIELD\&quot;,       \&quot;key\&quot;: \&quot;name\&quot;     }   ],   \&quot;latestValues\&quot;: [     {       \&quot;type\&quot;: \&quot;ATTRIBUTE\&quot;,       \&quot;key\&quot;: \&quot;model\&quot;     },     {       \&quot;type\&quot;: \&quot;TIME_SERIES\&quot;,       \&quot;key\&quot;: \&quot;temperature\&quot;     }   ] } &#x60;&#x60;&#x60;

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alarmDataQuery** | [**AlarmDataQuery**](AlarmDataQuery.md)|  | |

### Return type

[**PageDataAlarmData**](PageDataAlarmData.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## findAvailableEntityKeysByQuery

> AvailableEntityKeys findAvailableEntityKeysByQuery(timeseries, attributes, entityDataQuery, scope)

Find Available Entity Keys by Query (deprecated)

**Deprecated.** Use the V2 endpoint (&#x60;POST /api/v2/entitiesQuery/find/keys&#x60;) instead.  Returns unique time series and/or attribute key names from entities matching the query.  Executes the Entity Data Query to find up to 100 entities, then fetches and aggregates all distinct key names.  Primarily used for UI features like autocomplete suggestions.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **timeseries** | **Boolean**| When true, includes unique time series key names in the response. When false, the &#39;timeseries&#39; list will be empty. | |
| **attributes** | **Boolean**| When true, includes unique attribute key names in the response. When false, the &#39;attribute&#39; list will be empty. Use &#39;scope&#39; parameter to filter by attribute scope. | |
| **entityDataQuery** | [**EntityDataQuery**](EntityDataQuery.md)|  | |
| **scope** | **String**| Filters attribute keys by scope. Only applies when &#39;attributes&#39; is true. If not specified, returns attribute keys from all scopes. | [optional] [enum: SERVER_SCOPE, SHARED_SCOPE, CLIENT_SCOPE] |

### Return type

[**AvailableEntityKeys**](AvailableEntityKeys.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## findAvailableEntityKeysByQueryV2

> AvailableEntityKeysV2 findAvailableEntityKeysByQueryV2(entityDataQuery, includeTimeseries, includeAttributes, scopes, includeSamples)

Find Available Entity Keys By Query

Discovers unique time series and/or attribute key names available on entities that match the given query. Works in two steps: first, the request body (an Entity Data Query) is executed to find matching entities (page size is capped at 100); then, all distinct key names are collected from those entities.  Optionally, each key can include a sample — the most recent value (by timestamp) for that key across all matched entities.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityDataQuery** | [**EntityDataQuery**](EntityDataQuery.md)|  | |
| **includeTimeseries** | **Boolean**| When true, includes unique time series keys in the response. When false, the &#39;timeseries&#39; field is omitted. At least one of &#39;includeTimeseries&#39; or &#39;includeAttributes&#39; must be true. | [optional] [default to true] |
| **includeAttributes** | **Boolean**| When true, includes unique attribute keys in the response. When false, the &#39;attributes&#39; field is omitted. At least one of &#39;includeTimeseries&#39; or &#39;includeAttributes&#39; must be true. | [optional] [default to true] |
| **scopes** | **String**| Filters attribute keys by scope. Only applies when &#39;includeAttributes&#39; is true. When not specified, scopes are auto-determined: all three scopes (server, client, shared) for device entities, server scope only for other entity types. | [optional] [enum: SERVER_SCOPE, SHARED_SCOPE, CLIENT_SCOPE] |
| **includeSamples** | **Boolean**| When true, each key entry includes a &#39;sample&#39; object with the most recent value and timestamp. When false, only key names are returned (sample is omitted from JSON). | [optional] [default to false] |

### Return type

[**AvailableEntityKeysV2**](AvailableEntityKeysV2.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## findEntityDataByQuery

> PageDataEntityData findEntityDataByQuery(entityDataQuery)

Find Entity Data by Query

Allows to run complex queries over platform entities (devices, assets, customers, etc) based on the combination of main entity filter and multiple key filters. Returns the paginated result of the query that contains requested entity fields and latest values of requested attributes and time series data.  # Query Definition    Main **entity filter** is mandatory and defines generic search criteria. For example, \&quot;find all devices with profile &#39;Moisture Sensor&#39;\&quot; or \&quot;Find all devices related to asset &#39;Building A&#39;\&quot;  Optional **key filters** allow to filter results of the **entity filter** by complex criteria against main entity fields (name, label, type, etc), attributes and telemetry. For example, \&quot;temperature &gt; 20 or temperature&lt; 10\&quot; or \&quot;name starts with &#39;T&#39;, and attribute &#39;model&#39; is &#39;T1000&#39;, and time series field &#39;batteryLevel&#39; &gt; 40\&quot;.  The **entity fields** and **latest values** contains list of entity fields and latest attribute/telemetry fields to fetch for each entity.  The **page link** contains information about the page to fetch and the sort ordering.  Let&#39;s review the example:  &#x60;&#x60;&#x60;json {   \&quot;entityFilter\&quot;: {     \&quot;type\&quot;: \&quot;entityType\&quot;,     \&quot;resolveMultiple\&quot;: true,     \&quot;entityType\&quot;: \&quot;DEVICE\&quot;   },   \&quot;keyFilters\&quot;: [     {       \&quot;key\&quot;: {         \&quot;type\&quot;: \&quot;TIME_SERIES\&quot;,         \&quot;key\&quot;: \&quot;temperature\&quot;       },       \&quot;valueType\&quot;: \&quot;NUMERIC\&quot;,       \&quot;predicate\&quot;: {         \&quot;operation\&quot;: \&quot;GREATER\&quot;,         \&quot;value\&quot;: {           \&quot;defaultValue\&quot;: 0,           \&quot;dynamicValue\&quot;: {             \&quot;sourceType\&quot;: \&quot;CURRENT_USER\&quot;,             \&quot;sourceAttribute\&quot;: \&quot;temperatureThreshold\&quot;,             \&quot;inherit\&quot;: false           }         },         \&quot;type\&quot;: \&quot;NUMERIC\&quot;       }     }   ],   \&quot;entityFields\&quot;: [     {       \&quot;type\&quot;: \&quot;ENTITY_FIELD\&quot;,       \&quot;key\&quot;: \&quot;name\&quot;     },     {       \&quot;type\&quot;: \&quot;ENTITY_FIELD\&quot;,       \&quot;key\&quot;: \&quot;label\&quot;     },     {       \&quot;type\&quot;: \&quot;ENTITY_FIELD\&quot;,       \&quot;key\&quot;: \&quot;additionalInfo\&quot;     }   ],   \&quot;latestValues\&quot;: [     {       \&quot;type\&quot;: \&quot;ATTRIBUTE\&quot;,       \&quot;key\&quot;: \&quot;model\&quot;     },     {       \&quot;type\&quot;: \&quot;TIME_SERIES\&quot;,       \&quot;key\&quot;: \&quot;temperature\&quot;     }   ],   \&quot;pageLink\&quot;: {     \&quot;page\&quot;: 0,     \&quot;pageSize\&quot;: 10,     \&quot;sortOrder\&quot;: {       \&quot;key\&quot;: {         \&quot;key\&quot;: \&quot;name\&quot;,         \&quot;type\&quot;: \&quot;ENTITY_FIELD\&quot;       },       \&quot;direction\&quot;: \&quot;ASC\&quot;     }   } } &#x60;&#x60;&#x60;   Example mentioned above search all devices which have attribute &#39;active&#39; set to &#39;true&#39;. Now let&#39;s review available entity filters and key filters syntax:   # Entity Filters Entity Filter body depends on the &#39;type&#39; parameter. Let&#39;s review available entity filter types. In fact, they do correspond to available dashboard aliases.  ## Single Entity  Allows to filter only one entity based on the id. For example, this entity filter selects certain device:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;singleEntity\&quot;,   \&quot;singleEntity\&quot;: {     \&quot;id\&quot;: \&quot;d521edb0-2a7a-11ec-94eb-213c95f54092\&quot;,     \&quot;entityType\&quot;: \&quot;DEVICE\&quot;   } } &#x60;&#x60;&#x60;  ## Entity List Filter  Allows to filter entities of the same type using their ids. For example, this entity filter selects two devices:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;entityList\&quot;,   \&quot;entityType\&quot;: \&quot;DEVICE\&quot;,   \&quot;entityList\&quot;: [     \&quot;e6501f30-2a7a-11ec-94eb-213c95f54092\&quot;,     \&quot;e6657bf0-2a7a-11ec-94eb-213c95f54092\&quot;   ] } &#x60;&#x60;&#x60;  ## Entity Name Filter  Allows to filter entities of the same type using the **&#39;starts with&#39;** expression over entity name. For example, this entity filter selects all devices which name starts with &#39;Air Quality&#39;:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;entityName\&quot;,   \&quot;entityType\&quot;: \&quot;DEVICE\&quot;,   \&quot;entityNameFilter\&quot;: \&quot;Air Quality\&quot; } &#x60;&#x60;&#x60;  ## Entity Type Filter  Allows to filter entities based on their type (CUSTOMER, USER, DASHBOARD, ASSET, DEVICE, etc)For example, this entity filter selects all tenant customers:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;entityType\&quot;,   \&quot;entityType\&quot;: \&quot;CUSTOMER\&quot; } &#x60;&#x60;&#x60;  ## Asset Type Filter  Allows to filter assets based on their type and the **&#39;starts with&#39;** expression over their name. For example, this entity filter selects all &#39;charging station&#39; assets which name starts with &#39;Tesla&#39;:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;assetType\&quot;,   \&quot;assetType\&quot;: \&quot;charging station\&quot;,   \&quot;assetNameFilter\&quot;: \&quot;Tesla\&quot; } &#x60;&#x60;&#x60;  ## Device Type Filter  Allows to filter devices based on their type and the **&#39;starts with&#39;** expression over their name. For example, this entity filter selects all &#39;Temperature Sensor&#39; devices which name starts with &#39;ABC&#39;:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;deviceType\&quot;,   \&quot;deviceType\&quot;: \&quot;Temperature Sensor\&quot;,   \&quot;deviceNameFilter\&quot;: \&quot;ABC\&quot; } &#x60;&#x60;&#x60;  ## Edge Type Filter  Allows to filter edge instances based on their type and the **&#39;starts with&#39;** expression over their name. For example, this entity filter selects all &#39;Factory&#39; edge instances which name starts with &#39;Nevada&#39;:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;edgeType\&quot;,   \&quot;edgeType\&quot;: \&quot;Factory\&quot;,   \&quot;edgeNameFilter\&quot;: \&quot;Nevada\&quot; } &#x60;&#x60;&#x60;  ## Entity View Filter  Allows to filter entity views based on their type and the **&#39;starts with&#39;** expression over their name. For example, this entity filter selects all &#39;Concrete Mixer&#39; entity views which name starts with &#39;CAT&#39;:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;entityViewType\&quot;,   \&quot;entityViewType\&quot;: \&quot;Concrete Mixer\&quot;,   \&quot;entityViewNameFilter\&quot;: \&quot;CAT\&quot; } &#x60;&#x60;&#x60;  ## Api Usage Filter  Allows to query for Api Usage based on optional customer id. If the customer id is not set, returns current tenant API usage.For example, this entity filter selects the &#39;Api Usage&#39; entity for customer with id &#39;e6501f30-2a7a-11ec-94eb-213c95f54092&#39;:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;apiUsageState\&quot;,   \&quot;customerId\&quot;: {     \&quot;id\&quot;: \&quot;d521edb0-2a7a-11ec-94eb-213c95f54092\&quot;,     \&quot;entityType\&quot;: \&quot;CUSTOMER\&quot;   } } &#x60;&#x60;&#x60;  ## Relations Query Filter  Allows to filter entities that are related to the provided root entity. Possible direction values are &#39;TO&#39; and &#39;FROM&#39;. The &#39;maxLevel&#39; defines how many relation levels should the query search &#39;recursively&#39;. Assuming the &#39;maxLevel&#39; is &gt; 1, the &#39;fetchLastLevelOnly&#39; defines either to return all related entities or only entities that are on the last level of relations. The &#39;filter&#39; object allows you to define the relation type and set of acceptable entity types to search for. The relation query calculates all related entities, even if they are filtered using different relation types, and then extracts only those who match the &#39;filters&#39;.  For example, this entity filter selects all devices and assets which are related to the asset with id &#39;e51de0c0-2a7a-11ec-94eb-213c95f54092&#39;:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;relationsQuery\&quot;,   \&quot;rootEntity\&quot;: {     \&quot;entityType\&quot;: \&quot;ASSET\&quot;,     \&quot;id\&quot;: \&quot;e51de0c0-2a7a-11ec-94eb-213c95f54092\&quot;   },   \&quot;direction\&quot;: \&quot;FROM\&quot;,   \&quot;maxLevel\&quot;: 1,   \&quot;fetchLastLevelOnly\&quot;: false,   \&quot;filters\&quot;: [     {       \&quot;relationType\&quot;: \&quot;Contains\&quot;,       \&quot;entityTypes\&quot;: [         \&quot;DEVICE\&quot;,         \&quot;ASSET\&quot;       ]     }   ] } &#x60;&#x60;&#x60;  ## Asset Search Query  Allows to filter assets that are related to the provided root entity. Filters related assets based on the relation type and set of asset types. Possible direction values are &#39;TO&#39; and &#39;FROM&#39;. The &#39;maxLevel&#39; defines how many relation levels should the query search &#39;recursively&#39;. Assuming the &#39;maxLevel&#39; is &gt; 1, the &#39;fetchLastLevelOnly&#39; defines either to return all related entities or only entities that are on the last level of relations. The &#39;relationType&#39; defines the type of the relation to search for. The &#39;assetTypes&#39; defines the type of the asset to search for. The relation query calculates all related entities, even if they are filtered using different relation types, and then extracts only assets that match &#39;relationType&#39; and &#39;assetTypes&#39; conditions.  For example, this entity filter selects &#39;charging station&#39; assets which are related to the asset with id &#39;e51de0c0-2a7a-11ec-94eb-213c95f54092&#39; using &#39;Contains&#39; relation:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;assetSearchQuery\&quot;,   \&quot;rootEntity\&quot;: {     \&quot;entityType\&quot;: \&quot;ASSET\&quot;,     \&quot;id\&quot;: \&quot;e51de0c0-2a7a-11ec-94eb-213c95f54092\&quot;   },   \&quot;direction\&quot;: \&quot;FROM\&quot;,   \&quot;maxLevel\&quot;: 1,   \&quot;fetchLastLevelOnly\&quot;: false,   \&quot;relationType\&quot;: \&quot;Contains\&quot;,   \&quot;assetTypes\&quot;: [     \&quot;charging station\&quot;   ] } &#x60;&#x60;&#x60;  ## Device Search Query  Allows to filter devices that are related to the provided root entity. Filters related devices based on the relation type and set of device types. Possible direction values are &#39;TO&#39; and &#39;FROM&#39;. The &#39;maxLevel&#39; defines how many relation levels should the query search &#39;recursively&#39;. Assuming the &#39;maxLevel&#39; is &gt; 1, the &#39;fetchLastLevelOnly&#39; defines either to return all related entities or only entities that are on the last level of relations. The &#39;relationType&#39; defines the type of the relation to search for. The &#39;deviceTypes&#39; defines the type of the device to search for. The relation query calculates all related entities, even if they are filtered using different relation types, and then extracts only devices that match &#39;relationType&#39; and &#39;deviceTypes&#39; conditions.  For example, this entity filter selects &#39;Charging port&#39; and &#39;Air Quality Sensor&#39; devices which are related to the asset with id &#39;e52b0020-2a7a-11ec-94eb-213c95f54092&#39; using &#39;Contains&#39; relation:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;deviceSearchQuery\&quot;,   \&quot;rootEntity\&quot;: {     \&quot;entityType\&quot;: \&quot;ASSET\&quot;,     \&quot;id\&quot;: \&quot;e52b0020-2a7a-11ec-94eb-213c95f54092\&quot;   },   \&quot;direction\&quot;: \&quot;FROM\&quot;,   \&quot;maxLevel\&quot;: 2,   \&quot;fetchLastLevelOnly\&quot;: true,   \&quot;relationType\&quot;: \&quot;Contains\&quot;,   \&quot;deviceTypes\&quot;: [     \&quot;Air Quality Sensor\&quot;,     \&quot;Charging port\&quot;   ] } &#x60;&#x60;&#x60;  ## Entity View Query  Allows to filter entity views that are related to the provided root entity. Filters related entity views based on the relation type and set of entity view types. Possible direction values are &#39;TO&#39; and &#39;FROM&#39;. The &#39;maxLevel&#39; defines how many relation levels should the query search &#39;recursively&#39;. Assuming the &#39;maxLevel&#39; is &gt; 1, the &#39;fetchLastLevelOnly&#39; defines either to return all related entities or only entities that are on the last level of relations. The &#39;relationType&#39; defines the type of the relation to search for. The &#39;entityViewTypes&#39; defines the type of the entity view to search for. The relation query calculates all related entities, even if they are filtered using different relation types, and then extracts only devices that match &#39;relationType&#39; and &#39;deviceTypes&#39; conditions.  For example, this entity filter selects &#39;Concrete mixer&#39; entity views which are related to the asset with id &#39;e52b0020-2a7a-11ec-94eb-213c95f54092&#39; using &#39;Contains&#39; relation:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;entityViewSearchQuery\&quot;,   \&quot;rootEntity\&quot;: {     \&quot;entityType\&quot;: \&quot;ASSET\&quot;,     \&quot;id\&quot;: \&quot;e52b0020-2a7a-11ec-94eb-213c95f54092\&quot;   },   \&quot;direction\&quot;: \&quot;FROM\&quot;,   \&quot;maxLevel\&quot;: 1,   \&quot;fetchLastLevelOnly\&quot;: false,   \&quot;relationType\&quot;: \&quot;Contains\&quot;,   \&quot;entityViewTypes\&quot;: [     \&quot;Concrete mixer\&quot;   ] } &#x60;&#x60;&#x60;  ## Edge Search Query  Allows to filter edge instances that are related to the provided root entity. Filters related edge instances based on the relation type and set of edge types. Possible direction values are &#39;TO&#39; and &#39;FROM&#39;. The &#39;maxLevel&#39; defines how many relation levels should the query search &#39;recursively&#39;. Assuming the &#39;maxLevel&#39; is &gt; 1, the &#39;fetchLastLevelOnly&#39; defines either to return all related entities or only entities that are on the last level of relations. The &#39;relationType&#39; defines the type of the relation to search for. The &#39;deviceTypes&#39; defines the type of the device to search for. The relation query calculates all related entities, even if they are filtered using different relation types, and then extracts only devices that match &#39;relationType&#39; and &#39;deviceTypes&#39; conditions.  For example, this entity filter selects &#39;Factory&#39; edge instances which are related to the asset with id &#39;e52b0020-2a7a-11ec-94eb-213c95f54092&#39; using &#39;Contains&#39; relation:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;deviceSearchQuery\&quot;,   \&quot;rootEntity\&quot;: {     \&quot;entityType\&quot;: \&quot;ASSET\&quot;,     \&quot;id\&quot;: \&quot;e52b0020-2a7a-11ec-94eb-213c95f54092\&quot;   },   \&quot;direction\&quot;: \&quot;FROM\&quot;,   \&quot;maxLevel\&quot;: 2,   \&quot;fetchLastLevelOnly\&quot;: true,   \&quot;relationType\&quot;: \&quot;Contains\&quot;,   \&quot;edgeTypes\&quot;: [     \&quot;Factory\&quot;   ] } &#x60;&#x60;&#x60;   # Key Filters Key Filter allows you to define complex logical expressions over entity field, attribute or latest time series value. The filter is defined using &#39;key&#39;, &#39;valueType&#39; and &#39;predicate&#39; objects. Single Entity Query may have zero, one or multiple predicates. If multiple filters are defined, they are evaluated using logical &#39;AND&#39;. The example below checks that temperature of the entity is above 20 degrees:  &#x60;&#x60;&#x60;json {   \&quot;key\&quot;: {     \&quot;type\&quot;: \&quot;TIME_SERIES\&quot;,     \&quot;key\&quot;: \&quot;temperature\&quot;   },   \&quot;valueType\&quot;: \&quot;NUMERIC\&quot;,   \&quot;predicate\&quot;: {     \&quot;operation\&quot;: \&quot;GREATER\&quot;,     \&quot;value\&quot;: {       \&quot;defaultValue\&quot;: 20,       \&quot;dynamicValue\&quot;: null     },     \&quot;type\&quot;: \&quot;NUMERIC\&quot;   } } &#x60;&#x60;&#x60;   Now let&#39;s review &#39;key&#39;, &#39;valueType&#39; and &#39;predicate&#39; objects in detail.  ## Filter Key  Filter Key defines either entity field, attribute or telemetry. It is a JSON object that consists the key name and type. The following filter key types are supported:    * &#39;CLIENT_ATTRIBUTE&#39; - used for client attributes;   * &#39;SHARED_ATTRIBUTE&#39; - used for shared attributes;   * &#39;SERVER_ATTRIBUTE&#39; - used for server attributes;   * &#39;ATTRIBUTE&#39; - used for any of the above;   * &#39;TIME_SERIES&#39; - used for time series values;   * &#39;ENTITY_FIELD&#39; - used for accessing entity fields like &#39;name&#39;, &#39;label&#39;, etc. The list of available fields depends on the entity type;   * &#39;ALARM_FIELD&#39; - similar to entity field, but is used in alarm queries only;     Let&#39;s review the example:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;TIME_SERIES\&quot;,   \&quot;key\&quot;: \&quot;temperature\&quot; } &#x60;&#x60;&#x60;  ## Value Type and Operations  Provides a hint about the data type of the entity field that is defined in the filter key. The value type impacts the list of possible operations that you may use in the corresponding predicate. For example, you may use &#39;STARTS_WITH&#39; or &#39;END_WITH&#39;, but you can&#39;t use &#39;GREATER_OR_EQUAL&#39; for string values.The following filter value types and corresponding predicate operations are supported:    * &#39;STRING&#39; - used to filter any &#39;String&#39; or &#39;JSON&#39; values. Operations: EQUAL, NOT_EQUAL, STARTS_WITH, ENDS_WITH, CONTAINS, NOT_CONTAINS;   * &#39;NUMERIC&#39; - used for &#39;Long&#39; and &#39;Double&#39; values. Operations: EQUAL, NOT_EQUAL, GREATER, LESS, GREATER_OR_EQUAL, LESS_OR_EQUAL;   * &#39;BOOLEAN&#39; - used for boolean values. Operations: EQUAL, NOT_EQUAL;  * &#39;DATE_TIME&#39; - similar to numeric, transforms value to milliseconds since epoch. Operations: EQUAL, NOT_EQUAL, GREATER, LESS, GREATER_OR_EQUAL, LESS_OR_EQUAL;    ## Filter Predicate  Filter Predicate defines the logical expression to evaluate. The list of available operations depends on the filter value type, see above. Platform supports 4 predicate types: &#39;STRING&#39;, &#39;NUMERIC&#39;, &#39;BOOLEAN&#39; and &#39;COMPLEX&#39;. The last one allows to combine multiple operations over one filter key.  Simple predicate example to check &#39;value &lt; 100&#39;:   &#x60;&#x60;&#x60;json {   \&quot;operation\&quot;: \&quot;LESS\&quot;,   \&quot;value\&quot;: {     \&quot;defaultValue\&quot;: 100,     \&quot;dynamicValue\&quot;: null   },   \&quot;type\&quot;: \&quot;NUMERIC\&quot; } &#x60;&#x60;&#x60;  Complex predicate example, to check &#39;value &lt; 10 or value &gt; 20&#39;:   &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;COMPLEX\&quot;,   \&quot;operation\&quot;: \&quot;OR\&quot;,   \&quot;predicates\&quot;: [     {       \&quot;operation\&quot;: \&quot;LESS\&quot;,       \&quot;value\&quot;: {         \&quot;defaultValue\&quot;: 10,         \&quot;dynamicValue\&quot;: null       },       \&quot;type\&quot;: \&quot;NUMERIC\&quot;     },     {       \&quot;operation\&quot;: \&quot;GREATER\&quot;,       \&quot;value\&quot;: {         \&quot;defaultValue\&quot;: 20,         \&quot;dynamicValue\&quot;: null       },       \&quot;type\&quot;: \&quot;NUMERIC\&quot;     }   ] } &#x60;&#x60;&#x60;  More complex predicate example, to check &#39;value &lt; 10 or (value &gt; 50 &amp;&amp; value &lt; 60)&#39;:   &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;COMPLEX\&quot;,   \&quot;operation\&quot;: \&quot;OR\&quot;,   \&quot;predicates\&quot;: [     {       \&quot;operation\&quot;: \&quot;LESS\&quot;,       \&quot;value\&quot;: {         \&quot;defaultValue\&quot;: 10,         \&quot;dynamicValue\&quot;: null       },       \&quot;type\&quot;: \&quot;NUMERIC\&quot;     },     {       \&quot;type\&quot;: \&quot;COMPLEX\&quot;,       \&quot;operation\&quot;: \&quot;AND\&quot;,       \&quot;predicates\&quot;: [         {           \&quot;operation\&quot;: \&quot;GREATER\&quot;,           \&quot;value\&quot;: {             \&quot;defaultValue\&quot;: 50,             \&quot;dynamicValue\&quot;: null           },           \&quot;type\&quot;: \&quot;NUMERIC\&quot;         },         {           \&quot;operation\&quot;: \&quot;LESS\&quot;,           \&quot;value\&quot;: {             \&quot;defaultValue\&quot;: 60,             \&quot;dynamicValue\&quot;: null           },           \&quot;type\&quot;: \&quot;NUMERIC\&quot;         }       ]     }   ] } &#x60;&#x60;&#x60;   You may also want to replace hardcoded values (for example, temperature &gt; 20) with the more dynamic expression (for example, temperature &gt; &#39;value of the tenant attribute with key &#39;temperatureThreshold&#39;). It is possible to use &#39;dynamicValue&#39; to define attribute of the tenant, customer or user that is performing the API call. See example below:   &#x60;&#x60;&#x60;json {   \&quot;operation\&quot;: \&quot;GREATER\&quot;,   \&quot;value\&quot;: {     \&quot;defaultValue\&quot;: 0,     \&quot;dynamicValue\&quot;: {       \&quot;sourceType\&quot;: \&quot;CURRENT_USER\&quot;,       \&quot;sourceAttribute\&quot;: \&quot;temperatureThreshold\&quot;     }   },   \&quot;type\&quot;: \&quot;NUMERIC\&quot; } &#x60;&#x60;&#x60;   Note that you may use &#39;CURRENT_USER&#39;, &#39;CURRENT_CUSTOMER&#39; and &#39;CURRENT_TENANT&#39; as a &#39;sourceType&#39;. The &#39;defaultValue&#39; is used when the attribute with such a name is not defined for the chosen source.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityDataQuery** | [**EntityDataQuery**](EntityDataQuery.md)|  | |

### Return type

[**PageDataEntityData**](PageDataEntityData.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getEdqsState

> EdqsState getEdqsState()

getEdqsState

### Parameters

This endpoint does not need any parameter.

### Return type

[**EdqsState**](EdqsState.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## processSystemEdqsRequest

> processSystemEdqsRequest(toCoreEdqsRequest)

processSystemEdqsRequest

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **toCoreEdqsRequest** | [**ToCoreEdqsRequest**](ToCoreEdqsRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |

