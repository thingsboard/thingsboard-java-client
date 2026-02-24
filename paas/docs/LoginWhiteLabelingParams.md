

# LoginWhiteLabelingParams

A JSON value representing the login white labeling configuration

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**logoImageUrl** | **String** | Logo image URL |  [optional] |
|**logoImageHeight** | **Integer** | The height of a logo container. Logo image will be automatically scaled. |  [optional] |
|**appTitle** | **String** | White-labeled name of the platform |  [optional] |
|**favicon** | [**Favicon**](Favicon.md) | JSON object that contains website icon url and type |  [optional] |
|**paletteSettings** | [**PaletteSettings**](PaletteSettings.md) | Complex JSON that describes structure of the Angular Material Palette. See [theming](https://material.angular.io/guide/theming) for more details |  [optional] |
|**helpLinkBaseUrl** | **String** | Base URL for help link |  [optional] |
|**uiHelpBaseUrl** | **String** | Base URL for the repository with the UI help components (markdown) |  [optional] |
|**enableHelpLinks** | **Boolean** | Enable or Disable help links |  [optional] |
|**whiteLabelingEnabled** | **Boolean** | Enable white-labeling |  [optional] [readonly] |
|**showNameVersion** | **Boolean** | Show platform name and version on UI and login screen |  [optional] |
|**platformName** | **String** | White-labeled platform name |  [optional] |
|**platformVersion** | **String** | White-labeled platform version |  [optional] |
|**customCss** | **String** | Custom CSS content |  [optional] |
|**hideConnectivityDialog** | **Boolean** | Hide device connectivity dialog |  [optional] |
|**overrideTrendzName** | **Boolean** | Override Trendz Add-on name |  [optional] |
|**pageBackgroundColor** | **String** | Login page background color |  [optional] |
|**darkForeground** | **Boolean** | Enable/Disable dark foreground |  [optional] |
|**domainId** | [**DomainId**](DomainId.md) | Domain id |  [optional] |
|**baseUrl** | **String** | Base URL for the activation link, etc |  [optional] |
|**prohibitDifferentUrl** | **Boolean** | Prohibit use of other URLs. It is recommended to enable this setting |  [optional] |
|**adminSettingsId** | **String** | Id of the settings object that store this parameters |  [optional] |
|**showNameBottom** | **Boolean** | Show platform name and version on login page |  [optional] |



