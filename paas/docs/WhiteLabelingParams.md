
# WhiteLabelingParams

`org.thingsboard.client.model.WhiteLabelingParams`

A JSON value representing the white labeling configuration

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **logoImageUrl** | **String** | Logo image URL | [optional] |
| **logoImageHeight** | **Integer** | The height of a logo container. Logo image will be automatically scaled. | [optional] |
| **appTitle** | **String** | White-labeled name of the platform | [optional] |
| **favicon** | **Favicon** | JSON object that contains website icon url and type | [optional] |
| **paletteSettings** | **PaletteSettings** | Complex JSON that describes structure of the Angular Material Palette. See [theming](https://material.angular.io/guide/theming) for more details | [optional] |
| **helpLinkBaseUrl** | **String** | Base URL for help link | [optional] |
| **uiHelpBaseUrl** | **String** | Base URL for the repository with the UI help components (markdown) | [optional] |
| **enableHelpLinks** | **Boolean** | Enable or Disable help links | [optional] |
| **whiteLabelingEnabled** | **Boolean** | Enable white-labeling | [optional] [readonly] |
| **showNameVersion** | **Boolean** | Show platform name and version on UI and login screen | [optional] |
| **platformName** | **String** | White-labeled platform name | [optional] |
| **platformVersion** | **String** | White-labeled platform version | [optional] |
| **customCss** | **String** | Custom CSS content | [optional] |
| **hideConnectivityDialog** | **Boolean** | Hide device connectivity dialog | [optional] |
| **overrideTrendzName** | **Boolean** | Override Trendz Add-on name | [optional] |
| **hideChatBot** | **Boolean** | Hide chat bot | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

