# MailConfigTemplateControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMailConfigTemplates**](#getMailConfigTemplates) | **GET** /api/mail/config/template | Get the list of all OAuth2 client registration templates (getMailConfigTemplates)  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority. |



## getMailConfigTemplates

> com.fasterxml.jackson.databind.JsonNode getMailConfigTemplates()

Get the list of all OAuth2 client registration templates (getMailConfigTemplates)  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

Mail configuration template is set of default smtp settings for mail server that specific provider supports

### Return type

**com.fasterxml.jackson.databind.JsonNode**

