
# CertificateInfo

`org.thingsboard.client.model.CertificateInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **status** | **CertificateStatus** |  | [optional] |
| **domainName** | **String** |  | [optional] |
| **serialNumber** | **String** |  | [optional] |
| **notBefore** | **Long** |  | [optional] |
| **notAfter** | **Long** |  | [optional] |
| **requestedAt** | **Long** |  | [optional] |
| **issuedAt** | **Long** |  | [optional] |
| **acmeCertificateId** | **AcmeCertificateId** |  | [optional] |



## Referenced Types

#### CertificateStatus (enum)
`PENDING_VALIDATION` | `ISSUED` | `INACTIVE` | `EXPIRED` | `VALIDATION_TIMED_OUT` | `REVOKED` | `FAILED` | `UNKNOWN`

#### AcmeCertificateId
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | UUID | string |  |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

