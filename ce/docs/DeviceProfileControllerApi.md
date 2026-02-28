# DeviceProfileControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteDeviceProfile**](#deleteDeviceProfile) | **DELETE** /api/deviceProfile/{deviceProfileId} | Delete device profile (deleteDeviceProfile) |
| [**getAttributesKeys**](#getAttributesKeys) | **GET** /api/deviceProfile/devices/keys/attributes | Get attribute keys (getAttributesKeys) |
| [**getDefaultDeviceProfileInfo**](#getDefaultDeviceProfileInfo) | **GET** /api/deviceProfileInfo/default | Get Default Device Profile (getDefaultDeviceProfileInfo) |
| [**getDeviceProfileById**](#getDeviceProfileById) | **GET** /api/deviceProfile/{deviceProfileId} | Get Device Profile (getDeviceProfileById) |
| [**getDeviceProfileInfoById**](#getDeviceProfileInfoById) | **GET** /api/deviceProfileInfo/{deviceProfileId} | Get Device Profile Info (getDeviceProfileInfoById) |
| [**getDeviceProfileInfos**](#getDeviceProfileInfos) | **GET** /api/deviceProfileInfos | Get Device Profiles for transport type (getDeviceProfileInfos) |
| [**getDeviceProfileInfosByIdsV2**](#getDeviceProfileInfosByIdsV2) | **GET** /api/deviceProfileInfos/list | Get Device Profile Infos By Ids (getDeviceProfileInfosByIdsV2) |
| [**getDeviceProfileNames**](#getDeviceProfileNames) | **GET** /api/deviceProfile/names | Get Device Profile names (getDeviceProfileNames) |
| [**getDeviceProfiles**](#getDeviceProfiles) | **GET** /api/deviceProfiles | Get Device Profiles (getDeviceProfiles) |
| [**getTimeseriesKeys1**](#getTimeseriesKeys1) | **GET** /api/deviceProfile/devices/keys/timeseries | Get time series keys (getTimeseriesKeys) |
| [**saveDeviceProfile**](#saveDeviceProfile) | **POST** /api/deviceProfile | Create Or Update Device Profile (saveDeviceProfile) |
| [**setDefaultDeviceProfile**](#setDefaultDeviceProfile) | **POST** /api/deviceProfile/{deviceProfileId}/default | Make Device Profile Default (setDefaultDeviceProfile) |



## deleteDeviceProfile

> deleteDeviceProfile(deviceProfileId)

Delete device profile (deleteDeviceProfile)

Deletes the device profile. Referencing non-existing device profile Id will cause an error. Can&#39;t delete the device profile if it is referenced by existing devices.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceProfileId** | **String** | A string value representing the device profile id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## getAttributesKeys

> List&lt;String&gt; getAttributesKeys(deviceProfileId)

Get attribute keys (getAttributesKeys)

Get a set of unique attribute keys used by devices that belong to specified profile. If profile is not set returns a list of unique keys among all profiles. The call is used for auto-complete in the UI forms. The implementation limits the number of devices that participate in search to 100 as a trade of between accurate results and time-consuming queries.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceProfileId** | **String** | A string value representing the device profile id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | [optional] |


## getDefaultDeviceProfileInfo

> DeviceProfileInfo getDefaultDeviceProfileInfo()

Get Default Device Profile (getDefaultDeviceProfileInfo)

Fetch the Default Device Profile Info object. Device Profile Info is a lightweight object that includes main information about Device Profile excluding the heavyweight configuration object.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

## getDeviceProfileById

> DeviceProfile getDeviceProfileById(deviceProfileId, inlineImages)

Get Device Profile (getDeviceProfileById)

Fetch the Device Profile object based on the provided Device Profile Id. The server checks that the device profile is owned by the same tenant.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceProfileId** | **String** | A string value representing the device profile id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **inlineImages** | **Boolean** | Inline images as a data URL (Base64) | [optional] |


## getDeviceProfileInfoById

> DeviceProfileInfo getDeviceProfileInfoById(deviceProfileId)

Get Device Profile Info (getDeviceProfileInfoById)

Fetch the Device Profile Info object based on the provided Device Profile Id. Device Profile Info is a lightweight object that includes main information about Device Profile excluding the heavyweight configuration object.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceProfileId** | **String** | A string value representing the device profile id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## getDeviceProfileInfos

> PageDataDeviceProfileInfo getDeviceProfileInfos(pageSize, page, textSearch, sortProperty, sortOrder, transportType)

Get Device Profiles for transport type (getDeviceProfileInfos)

Returns a page of devices profile info objects owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. Device Profile Info is a lightweight object that includes main information about Device Profile excluding the heavyweight configuration object.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive &#39;substring&#39; filter based on the device profile name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, transportType, description, isDefault] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **transportType** | **String** | Type of the transport | [optional] [enum: DEFAULT, MQTT, COAP, LWM2M, SNMP] |


## getDeviceProfileInfosByIdsV2

> List&lt;DeviceProfileInfo&gt; getDeviceProfileInfosByIdsV2(deviceProfileIds)

Get Device Profile Infos By Ids (getDeviceProfileInfosByIdsV2)

Requested device profiles must be owned by tenant which is performing the request.   

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceProfileIds** | **List&lt;String&gt;** | A list of device profile ids, separated by comma &#39;,&#39; | |


## getDeviceProfileNames

> List&lt;EntityInfo&gt; getDeviceProfileNames(activeOnly)

Get Device Profile names (getDeviceProfileNames)

Returns a set of unique device profile names owned by the tenant.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **activeOnly** | **Boolean** | Flag indicating whether to retrieve exclusively the names of device profiles that are referenced by tenant&#39;s devices. | [optional] [default to false] |


## getDeviceProfiles

> PageDataDeviceProfile getDeviceProfiles(pageSize, page, textSearch, sortProperty, sortOrder)

Get Device Profiles (getDeviceProfiles)

Returns a page of devices profile objects owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive &#39;substring&#39; filter based on the device profile name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, transportType, description, isDefault] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |


## getTimeseriesKeys1

> List&lt;String&gt; getTimeseriesKeys1(deviceProfileId)

Get time series keys (getTimeseriesKeys)

Get a set of unique time series keys used by devices that belong to specified profile. If profile is not set returns a list of unique keys among all profiles. The call is used for auto-complete in the UI forms. The implementation limits the number of devices that participate in search to 100 as a trade of between accurate results and time-consuming queries.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceProfileId** | **String** | A string value representing the device profile id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | [optional] |


## saveDeviceProfile

> DeviceProfile saveDeviceProfile(deviceProfile)

Create Or Update Device Profile (saveDeviceProfile)

Create or update the Device Profile. When creating device profile, platform generates device profile id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created device profile id will be present in the response. Specify existing device profile id to update the device profile. Referencing non-existing device profile Id will cause &#39;Not Found&#39; error.   Device profile name is unique in the scope of tenant. Only one &#39;default&#39; device profile may exist in scope of tenant.  # Device profile data definition  Device profile data object contains alarm rules configuration, device provision strategy and transport type configuration for device connectivity. Let&#39;s review some examples. First one is the default device profile data configuration and second one - the custom one.   &#x60;&#x60;&#x60;json {    \&quot;alarms\&quot;:[    ],    \&quot;configuration\&quot;:{       \&quot;type\&quot;:\&quot;DEFAULT\&quot;    },    \&quot;provisionConfiguration\&quot;:{       \&quot;type\&quot;:\&quot;DISABLED\&quot;,       \&quot;provisionDeviceSecret\&quot;:null    },    \&quot;transportConfiguration\&quot;:{       \&quot;type\&quot;:\&quot;DEFAULT\&quot;    } } &#x60;&#x60;&#x60;  &#x60;&#x60;&#x60;json {    \&quot;alarms\&quot;:[       {          \&quot;id\&quot;:\&quot;2492b935-1226-59e9-8615-17d8978a4f93\&quot;,          \&quot;alarmType\&quot;:\&quot;Temperature Alarm\&quot;,          \&quot;clearRule\&quot;:{             \&quot;schedule\&quot;:null,             \&quot;condition\&quot;:{                \&quot;spec\&quot;:{                   \&quot;type\&quot;:\&quot;SIMPLE\&quot;                },                \&quot;condition\&quot;:[                   {                      \&quot;key\&quot;:{                         \&quot;key\&quot;:\&quot;temperature\&quot;,                         \&quot;type\&quot;:\&quot;TIME_SERIES\&quot;                      },                      \&quot;value\&quot;:null,                      \&quot;predicate\&quot;:{                         \&quot;type\&quot;:\&quot;NUMERIC\&quot;,                         \&quot;value\&quot;:{                            \&quot;userValue\&quot;:null,                            \&quot;defaultValue\&quot;:30.0,                            \&quot;dynamicValue\&quot;:null                         },                         \&quot;operation\&quot;:\&quot;LESS\&quot;                      },                      \&quot;valueType\&quot;:\&quot;NUMERIC\&quot;                   }                ]             },             \&quot;dashboardId\&quot;:null,             \&quot;alarmDetails\&quot;:null          },          \&quot;propagate\&quot;:false,          \&quot;createRules\&quot;:{             \&quot;MAJOR\&quot;:{                \&quot;schedule\&quot;:{                   \&quot;type\&quot;:\&quot;SPECIFIC_TIME\&quot;,                   \&quot;endsOn\&quot;:64800000,                   \&quot;startsOn\&quot;:43200000,                   \&quot;timezone\&quot;:\&quot;Europe/Kiev\&quot;,                   \&quot;daysOfWeek\&quot;:[                      1,                      3,                      5                   ]                },                \&quot;condition\&quot;:{                   \&quot;spec\&quot;:{                      \&quot;type\&quot;:\&quot;DURATION\&quot;,                      \&quot;unit\&quot;:\&quot;MINUTES\&quot;,                      \&quot;predicate\&quot;:{                         \&quot;userValue\&quot;:null,                         \&quot;defaultValue\&quot;:30,                         \&quot;dynamicValue\&quot;:null                      }                   },                   \&quot;condition\&quot;:[                      {                         \&quot;key\&quot;:{                            \&quot;key\&quot;:\&quot;temperature\&quot;,                            \&quot;type\&quot;:\&quot;TIME_SERIES\&quot;                         },                         \&quot;value\&quot;:null,                         \&quot;predicate\&quot;:{                            \&quot;type\&quot;:\&quot;COMPLEX\&quot;,                            \&quot;operation\&quot;:\&quot;OR\&quot;,                            \&quot;predicates\&quot;:[                               {                                  \&quot;type\&quot;:\&quot;NUMERIC\&quot;,                                  \&quot;value\&quot;:{                                     \&quot;userValue\&quot;:null,                                     \&quot;defaultValue\&quot;:50.0,                                     \&quot;dynamicValue\&quot;:null                                  },                                  \&quot;operation\&quot;:\&quot;LESS_OR_EQUAL\&quot;                               },                               {                                  \&quot;type\&quot;:\&quot;NUMERIC\&quot;,                                  \&quot;value\&quot;:{                                     \&quot;userValue\&quot;:null,                                     \&quot;defaultValue\&quot;:30.0,                                     \&quot;dynamicValue\&quot;:null                                  },                                  \&quot;operation\&quot;:\&quot;GREATER\&quot;                               }                            ]                         },                         \&quot;valueType\&quot;:\&quot;NUMERIC\&quot;                      }                   ]                },                \&quot;dashboardId\&quot;:null,                \&quot;alarmDetails\&quot;:null             },             \&quot;WARNING\&quot;:{                \&quot;schedule\&quot;:{                   \&quot;type\&quot;:\&quot;CUSTOM\&quot;,                   \&quot;items\&quot;:[                      {                         \&quot;endsOn\&quot;:0,                         \&quot;enabled\&quot;:false,                         \&quot;startsOn\&quot;:0,                         \&quot;dayOfWeek\&quot;:1                      },                      {                         \&quot;endsOn\&quot;:64800000,                         \&quot;enabled\&quot;:true,                         \&quot;startsOn\&quot;:43200000,                         \&quot;dayOfWeek\&quot;:2                      },                      {                         \&quot;endsOn\&quot;:0,                         \&quot;enabled\&quot;:false,                         \&quot;startsOn\&quot;:0,                         \&quot;dayOfWeek\&quot;:3                      },                      {                         \&quot;endsOn\&quot;:57600000,                         \&quot;enabled\&quot;:true,                         \&quot;startsOn\&quot;:36000000,                         \&quot;dayOfWeek\&quot;:4                      },                      {                         \&quot;endsOn\&quot;:0,                         \&quot;enabled\&quot;:false,                         \&quot;startsOn\&quot;:0,                         \&quot;dayOfWeek\&quot;:5                      },                      {                         \&quot;endsOn\&quot;:0,                         \&quot;enabled\&quot;:false,                         \&quot;startsOn\&quot;:0,                         \&quot;dayOfWeek\&quot;:6                      },                      {                         \&quot;endsOn\&quot;:0,                         \&quot;enabled\&quot;:false,                         \&quot;startsOn\&quot;:0,                         \&quot;dayOfWeek\&quot;:7                      }                   ],                   \&quot;timezone\&quot;:\&quot;Europe/Kiev\&quot;                },                \&quot;condition\&quot;:{                   \&quot;spec\&quot;:{                      \&quot;type\&quot;:\&quot;REPEATING\&quot;,                      \&quot;predicate\&quot;:{                         \&quot;userValue\&quot;:null,                         \&quot;defaultValue\&quot;:5,                         \&quot;dynamicValue\&quot;:null                      }                   },                   \&quot;condition\&quot;:[                      {                         \&quot;key\&quot;:{                            \&quot;key\&quot;:\&quot;tempConstant\&quot;,                            \&quot;type\&quot;:\&quot;CONSTANT\&quot;                         },                         \&quot;value\&quot;:30,                         \&quot;predicate\&quot;:{                            \&quot;type\&quot;:\&quot;NUMERIC\&quot;,                            \&quot;value\&quot;:{                               \&quot;userValue\&quot;:null,                               \&quot;defaultValue\&quot;:0.0,                               \&quot;dynamicValue\&quot;:{                                  \&quot;inherit\&quot;:false,                                  \&quot;sourceType\&quot;:\&quot;CURRENT_DEVICE\&quot;,                                  \&quot;sourceAttribute\&quot;:\&quot;tempThreshold\&quot;                               }                            },                            \&quot;operation\&quot;:\&quot;EQUAL\&quot;                         },                         \&quot;valueType\&quot;:\&quot;NUMERIC\&quot;                      }                   ]                },                \&quot;dashboardId\&quot;:null,                \&quot;alarmDetails\&quot;:null             },             \&quot;CRITICAL\&quot;:{                \&quot;schedule\&quot;:null,                \&quot;condition\&quot;:{                   \&quot;spec\&quot;:{                      \&quot;type\&quot;:\&quot;SIMPLE\&quot;                   },                   \&quot;condition\&quot;:[                      {                         \&quot;key\&quot;:{                            \&quot;key\&quot;:\&quot;temperature\&quot;,                            \&quot;type\&quot;:\&quot;TIME_SERIES\&quot;                         },                         \&quot;value\&quot;:null,                         \&quot;predicate\&quot;:{                            \&quot;type\&quot;:\&quot;NUMERIC\&quot;,                            \&quot;value\&quot;:{                               \&quot;userValue\&quot;:null,                               \&quot;defaultValue\&quot;:50.0,                               \&quot;dynamicValue\&quot;:null                            },                            \&quot;operation\&quot;:\&quot;GREATER\&quot;                         },                         \&quot;valueType\&quot;:\&quot;NUMERIC\&quot;                      }                   ]                },                \&quot;dashboardId\&quot;:null,                \&quot;alarmDetails\&quot;:null             }          },          \&quot;propagateRelationTypes\&quot;:null       }    ],    \&quot;configuration\&quot;:{       \&quot;type\&quot;:\&quot;DEFAULT\&quot;    },    \&quot;provisionConfiguration\&quot;:{       \&quot;type\&quot;:\&quot;ALLOW_CREATE_NEW_DEVICES\&quot;,       \&quot;provisionDeviceSecret\&quot;:\&quot;vaxb9hzqdbz3oqukvomg\&quot;    },    \&quot;transportConfiguration\&quot;:{       \&quot;type\&quot;:\&quot;MQTT\&quot;,       \&quot;deviceTelemetryTopic\&quot;:\&quot;v1/devices/me/telemetry\&quot;,       \&quot;deviceAttributesTopic\&quot;:\&quot;v1/devices/me/attributes\&quot;,       \&quot;transportPayloadTypeConfiguration\&quot;:{          \&quot;transportPayloadType\&quot;:\&quot;PROTOBUF\&quot;,          \&quot;deviceTelemetryProtoSchema\&quot;:\&quot;syntax &#x3D;\\\&quot;proto3\\\&quot;;\\npackage telemetry;\\n\\nmessage SensorDataReading {\\n\\n  optional double temperature &#x3D; 1;\\n  optional double humidity &#x3D; 2;\\n  InnerObject innerObject &#x3D; 3;\\n\\n  message InnerObject {\\n    optional string key1 &#x3D; 1;\\n    optional bool key2 &#x3D; 2;\\n    optional double key3 &#x3D; 3;\\n    optional int32 key4 &#x3D; 4;\\n    optional string key5 &#x3D; 5;\\n  }\\n}\&quot;,          \&quot;deviceAttributesProtoSchema\&quot;:\&quot;syntax &#x3D;\\\&quot;proto3\\\&quot;;\\npackage attributes;\\n\\nmessage SensorConfiguration {\\n  optional string firmwareVersion &#x3D; 1;\\n  optional string serialNumber &#x3D; 2;\\n}\&quot;,          \&quot;deviceRpcRequestProtoSchema\&quot;:\&quot;syntax &#x3D;\\\&quot;proto3\\\&quot;;\\npackage rpc;\\n\\nmessage RpcRequestMsg {\\n  optional string method &#x3D; 1;\\n  optional int32 requestId &#x3D; 2;\\n  optional string params &#x3D; 3;\\n}\&quot;,          \&quot;deviceRpcResponseProtoSchema\&quot;:\&quot;syntax &#x3D;\\\&quot;proto3\\\&quot;;\\npackage rpc;\\n\\nmessage RpcResponseMsg {\\n  optional string payload &#x3D; 1;\\n}\&quot;       }    } } &#x60;&#x60;&#x60;  Let&#39;s review some specific objects examples related to the device profile configuration:  # Alarm Schedule  Alarm Schedule JSON object represents the time interval during which the alarm rule is active. Note,   &#x60;&#x60;&#x60;json \&quot;schedule\&quot;: null &#x60;&#x60;&#x60;  means alarm rule is active all the time. **&#39;daysOfWeek&#39;** field represents Monday as 1, Tuesday as 2 and so on. **&#39;startsOn&#39;** and **&#39;endsOn&#39;** fields represent hours in millis (e.g. 64800000 &#x3D; 18:00 or 6pm). **&#39;enabled&#39;** flag specifies if item in a custom rule is active for specific day of the week:  ## Specific Time Schedule  &#x60;&#x60;&#x60;json {    \&quot;schedule\&quot;:{       \&quot;type\&quot;:\&quot;SPECIFIC_TIME\&quot;,       \&quot;endsOn\&quot;:64800000,       \&quot;startsOn\&quot;:43200000,       \&quot;timezone\&quot;:\&quot;Europe/Kiev\&quot;,       \&quot;daysOfWeek\&quot;:[          1,          3,          5       ]    } } &#x60;&#x60;&#x60;  ## Custom Schedule  &#x60;&#x60;&#x60;json {    \&quot;schedule\&quot;:{       \&quot;type\&quot;:\&quot;CUSTOM\&quot;,       \&quot;items\&quot;:[          {             \&quot;endsOn\&quot;:0,             \&quot;enabled\&quot;:false,             \&quot;startsOn\&quot;:0,             \&quot;dayOfWeek\&quot;:1          },          {             \&quot;endsOn\&quot;:64800000,             \&quot;enabled\&quot;:true,             \&quot;startsOn\&quot;:43200000,             \&quot;dayOfWeek\&quot;:2          },          {             \&quot;endsOn\&quot;:0,             \&quot;enabled\&quot;:false,             \&quot;startsOn\&quot;:0,             \&quot;dayOfWeek\&quot;:3          },          {             \&quot;endsOn\&quot;:57600000,             \&quot;enabled\&quot;:true,             \&quot;startsOn\&quot;:36000000,             \&quot;dayOfWeek\&quot;:4          },          {             \&quot;endsOn\&quot;:0,             \&quot;enabled\&quot;:false,             \&quot;startsOn\&quot;:0,             \&quot;dayOfWeek\&quot;:5          },          {             \&quot;endsOn\&quot;:0,             \&quot;enabled\&quot;:false,             \&quot;startsOn\&quot;:0,             \&quot;dayOfWeek\&quot;:6          },          {             \&quot;endsOn\&quot;:0,             \&quot;enabled\&quot;:false,             \&quot;startsOn\&quot;:0,             \&quot;dayOfWeek\&quot;:7          }       ],       \&quot;timezone\&quot;:\&quot;Europe/Kiev\&quot;    } } &#x60;&#x60;&#x60;  # Alarm condition type (**&#39;spec&#39;**)  Alarm condition type can be either simple, duration, or repeating. For example, 5 times in a row or during 5 minutes.  Note, **&#39;userValue&#39;** field is not used and reserved for future usage, **&#39;dynamicValue&#39;** is used for condition appliance by using the value of the **&#39;sourceAttribute&#39;** or else **&#39;defaultValue&#39;** is used (if **&#39;sourceAttribute&#39;** is absent).  **&#39;sourceType&#39;** of the **&#39;sourceAttribute&#39;** can be:   * &#39;CURRENT_DEVICE&#39;;  * &#39;CURRENT_CUSTOMER&#39;;  * &#39;CURRENT_TENANT&#39;.  **&#39;sourceAttribute&#39;** can be inherited from the owner if **&#39;inherit&#39;** is set to true (for CURRENT_DEVICE and CURRENT_CUSTOMER).  ## Repeating alarm condition  &#x60;&#x60;&#x60;json {    \&quot;spec\&quot;:{       \&quot;type\&quot;:\&quot;REPEATING\&quot;,       \&quot;predicate\&quot;:{          \&quot;userValue\&quot;:null,          \&quot;defaultValue\&quot;:5,          \&quot;dynamicValue\&quot;:{             \&quot;inherit\&quot;:true,             \&quot;sourceType\&quot;:\&quot;CURRENT_DEVICE\&quot;,             \&quot;sourceAttribute\&quot;:\&quot;tempAttr\&quot;          }       }    } } &#x60;&#x60;&#x60;  ## Duration alarm condition  &#x60;&#x60;&#x60;json {    \&quot;spec\&quot;:{       \&quot;type\&quot;:\&quot;DURATION\&quot;,       \&quot;unit\&quot;:\&quot;MINUTES\&quot;,       \&quot;predicate\&quot;:{          \&quot;userValue\&quot;:null,          \&quot;defaultValue\&quot;:30,          \&quot;dynamicValue\&quot;:null       }    } } &#x60;&#x60;&#x60;  **&#39;unit&#39;** can be:   * &#39;SECONDS&#39;;  * &#39;MINUTES&#39;;  * &#39;HOURS&#39;;  * &#39;DAYS&#39;.  # Key Filters  Key filter objects are created under the **&#39;condition&#39;** array. They allow you to define complex logical expressions over entity field, attribute, latest time series value or constant. The filter is defined using &#39;key&#39;, &#39;valueType&#39;, &#39;value&#39; (refers to the value of the &#39;CONSTANT&#39; alarm filter key type) and &#39;predicate&#39; objects. Let&#39;s review each object:  ## Alarm Filter Key  Filter Key defines either entity field, attribute, telemetry or constant. It is a JSON object that consists the key name and type. The following filter key types are supported:  * &#39;ATTRIBUTE&#39; - used for attributes values;  * &#39;TIME_SERIES&#39; - used for time series values;  * &#39;ENTITY_FIELD&#39; - used for accessing entity fields like &#39;name&#39;, &#39;label&#39;, etc. The list of available fields depends on the entity type;  * &#39;CONSTANT&#39; - constant value specified.  Let&#39;s review the example:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;TIME_SERIES\&quot;,   \&quot;key\&quot;: \&quot;temperature\&quot; } &#x60;&#x60;&#x60;  ## Value Type and Operations  Provides a hint about the data type of the entity field that is defined in the filter key. The value type impacts the list of possible operations that you may use in the corresponding predicate. For example, you may use &#39;STARTS_WITH&#39; or &#39;END_WITH&#39;, but you can&#39;t use &#39;GREATER_OR_EQUAL&#39; for string values.The following filter value types and corresponding predicate operations are supported:    * &#39;STRING&#39; - used to filter any &#39;String&#39; or &#39;JSON&#39; values. Operations: EQUAL, NOT_EQUAL, STARTS_WITH, ENDS_WITH, CONTAINS, NOT_CONTAINS;   * &#39;NUMERIC&#39; - used for &#39;Long&#39; and &#39;Double&#39; values. Operations: EQUAL, NOT_EQUAL, GREATER, LESS, GREATER_OR_EQUAL, LESS_OR_EQUAL;   * &#39;BOOLEAN&#39; - used for boolean values. Operations: EQUAL, NOT_EQUAL;  * &#39;DATE_TIME&#39; - similar to numeric, transforms value to milliseconds since epoch. Operations: EQUAL, NOT_EQUAL, GREATER, LESS, GREATER_OR_EQUAL, LESS_OR_EQUAL;      ## Filter Predicate  Filter Predicate defines the logical expression to evaluate. The list of available operations depends on the filter value type, see above. Platform supports 4 predicate types: &#39;STRING&#39;, &#39;NUMERIC&#39;, &#39;BOOLEAN&#39; and &#39;COMPLEX&#39;. The last one allows to combine multiple operations over one filter key.  Simple predicate example to check &#39;value &lt; 100&#39;:   &#x60;&#x60;&#x60;json {   \&quot;operation\&quot;: \&quot;LESS\&quot;,   \&quot;value\&quot;: {     \&quot;userValue\&quot;: null,     \&quot;defaultValue\&quot;: 100,     \&quot;dynamicValue\&quot;: null   },   \&quot;type\&quot;: \&quot;NUMERIC\&quot; } &#x60;&#x60;&#x60;  Complex predicate example, to check &#39;value &lt; 10 or value &gt; 20&#39;:   &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;COMPLEX\&quot;,   \&quot;operation\&quot;: \&quot;OR\&quot;,   \&quot;predicates\&quot;: [     {       \&quot;operation\&quot;: \&quot;LESS\&quot;,       \&quot;value\&quot;: {         \&quot;userValue\&quot;: null,         \&quot;defaultValue\&quot;: 10,         \&quot;dynamicValue\&quot;: null       },       \&quot;type\&quot;: \&quot;NUMERIC\&quot;     },     {       \&quot;operation\&quot;: \&quot;GREATER\&quot;,       \&quot;value\&quot;: {         \&quot;userValue\&quot;: null,         \&quot;defaultValue\&quot;: 20,         \&quot;dynamicValue\&quot;: null       },       \&quot;type\&quot;: \&quot;NUMERIC\&quot;     }   ] } &#x60;&#x60;&#x60;  More complex predicate example, to check &#39;value &lt; 10 or (value &gt; 50 &amp;&amp; value &lt; 60)&#39;:   &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;COMPLEX\&quot;,   \&quot;operation\&quot;: \&quot;OR\&quot;,   \&quot;predicates\&quot;: [     {       \&quot;operation\&quot;: \&quot;LESS\&quot;,       \&quot;value\&quot;: {         \&quot;userValue\&quot;: null,         \&quot;defaultValue\&quot;: 10,         \&quot;dynamicValue\&quot;: null       },       \&quot;type\&quot;: \&quot;NUMERIC\&quot;     },     {       \&quot;type\&quot;: \&quot;COMPLEX\&quot;,       \&quot;operation\&quot;: \&quot;AND\&quot;,       \&quot;predicates\&quot;: [         {           \&quot;operation\&quot;: \&quot;GREATER\&quot;,           \&quot;value\&quot;: {             \&quot;userValue\&quot;: null,             \&quot;defaultValue\&quot;: 50,             \&quot;dynamicValue\&quot;: null           },           \&quot;type\&quot;: \&quot;NUMERIC\&quot;         },         {           \&quot;operation\&quot;: \&quot;LESS\&quot;,           \&quot;value\&quot;: {             \&quot;userValue\&quot;: null,             \&quot;defaultValue\&quot;: 60,             \&quot;dynamicValue\&quot;: null           },           \&quot;type\&quot;: \&quot;NUMERIC\&quot;         }       ]     }   ] } &#x60;&#x60;&#x60;  You may also want to replace hardcoded values (for example, temperature &gt; 20) with the more dynamic expression (for example, temperature &gt; value of the tenant attribute with key &#39;temperatureThreshold&#39;). It is possible to use &#39;dynamicValue&#39; to define attribute of the tenant, customer or device. See example below:  &#x60;&#x60;&#x60;json {   \&quot;operation\&quot;: \&quot;GREATER\&quot;,   \&quot;value\&quot;: {     \&quot;userValue\&quot;: null,     \&quot;defaultValue\&quot;: 0,     \&quot;dynamicValue\&quot;: {       \&quot;inherit\&quot;: false,       \&quot;sourceType\&quot;: \&quot;CURRENT_TENANT\&quot;,       \&quot;sourceAttribute\&quot;: \&quot;temperatureThreshold\&quot;     }   },   \&quot;type\&quot;: \&quot;NUMERIC\&quot; } &#x60;&#x60;&#x60;  Note that you may use &#39;CURRENT_DEVICE&#39;, &#39;CURRENT_CUSTOMER&#39; and &#39;CURRENT_TENANT&#39; as a &#39;sourceType&#39;. The &#39;defaultValue&#39; is used when the attribute with such a name is not defined for the chosen source. The &#39;sourceAttribute&#39; can be inherited from the owner of the specified &#39;sourceType&#39; if &#39;inherit&#39; is set to true.  # Provision Configuration  There are 3 types of device provision configuration for the device profile:   * &#39;DISABLED&#39;;  * &#39;ALLOW_CREATE_NEW_DEVICES&#39;;  * &#39;CHECK_PRE_PROVISIONED_DEVICES&#39;.  Please refer to the [docs](https://thingsboard.io/docs/user-guide/device-provisioning/) for more details.  # Transport Configuration  5 transport configuration types are available:  * &#39;DEFAULT&#39;;  * &#39;MQTT&#39;;  * &#39;LWM2M&#39;;  * &#39;COAP&#39;;  * &#39;SNMP&#39;.  Default type supports basic MQTT, HTTP, CoAP and LwM2M transports. Please refer to the [docs](https://thingsboard.io/docs/user-guide/device-profiles/#transport-configuration) for more details about other types.  See another example of COAP transport configuration below:  &#x60;&#x60;&#x60;json {    \&quot;type\&quot;:\&quot;COAP\&quot;,    \&quot;clientSettings\&quot;:{       \&quot;edrxCycle\&quot;:null,       \&quot;powerMode\&quot;:\&quot;DRX\&quot;,       \&quot;psmActivityTimer\&quot;:null,       \&quot;pagingTransmissionWindow\&quot;:null    },    \&quot;coapDeviceTypeConfiguration\&quot;:{       \&quot;coapDeviceType\&quot;:\&quot;DEFAULT\&quot;,       \&quot;transportPayloadTypeConfiguration\&quot;:{          \&quot;transportPayloadType\&quot;:\&quot;JSON\&quot;       }    } } &#x60;&#x60;&#x60;Remove &#39;id&#39;, &#39;tenantId&#39; from the request body example (below) to create new Device Profile entity.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceProfile** | **DeviceProfile** |  | |


## setDefaultDeviceProfile

> DeviceProfile setDefaultDeviceProfile(deviceProfileId)

Make Device Profile Default (setDefaultDeviceProfile)

Marks device profile as default within a tenant scope.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceProfileId** | **String** | A string value representing the device profile id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

