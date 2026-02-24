

# ShareGroupRequest

The Share Group Request JSON

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ownerId** | [**EntityId**](EntityId.md) | In case &#39;allUserGroup&#39; is set to true, this property specifies the owner of the user group &#39;All&#39;. Either Tenant or Customer Id. |  [optional] |
|**allUserGroup** | **Boolean** | Indicate that the group should be shared with user group &#39;All&#39; that belongs to Tenant or Customer (see &#39;ownerId&#39; property description). |  |
|**userGroupId** | [**EntityGroupId**](EntityGroupId.md) | In case &#39;allUserGroup&#39; is set to false, this property specifies the specific user group that the entity group should be shared with. |  [optional] |
|**readElseWrite** | **Boolean** | Used if &#39;roleIds&#39; property is not present. if the value is &#39;true&#39;, creates role with read-only permissions. If the value is &#39;false&#39;, creates role with write permissions. |  [optional] |
|**roleIds** | [**List&lt;RoleId&gt;**](RoleId.md) | List of group role Ids that should be used to share the entity group with the user group. If not set, the platform will create new role (see &#39;readElseWrite&#39; property description) |  [optional] |



