# SystemSetupControllerApi

`ThingsboardClient` methods:

> Every method that takes input also has a request-object overload — `<method>(<Method>Args args)`,
> built via `<Method>Args.builder()...build()`. The `*Args` classes are nested in `ThingsboardApi`,
> e.g. `import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Prefer that overload in
> new code: adding an optional parameter to an endpoint changes the flat signatures documented
> below, but only adds a builder field to `*Args`.

```
SetupInfo applySetupLicense(@Nonnull LicenseKeyRequest licenseKeyRequest) // Apply license key during setup (applySetupLicense)
LicenseChangeResult changeLicenseKey(@Nonnull LicenseKeyRequest licenseKeyRequest) // Change license key (changeLicenseKey)
SetupInfo clearLicense() // Clear license (clearLicense)
void completeSetup(@Nonnull SystemSetupRequest systemSetupRequest) // Complete setup (completeSetup)
void confirmNonProduction() // Confirm non-production use (confirmNonProduction)
LicenseClaimInfo getClaim(@Nullable String claimToken) // Poll license claim (getClaim)
SetupInfo getState() // Get setup state (getState)
SubscriptionInfo previewLicenseKey(@Nonnull LicenseKeyRequest licenseKeyRequest) // Preview a license key (previewLicenseKey)
LicenseClaimResult requestClaim() // Request license claim (requestClaim)
```


## applySetupLicense

```
SetupInfo applySetupLicense(@Nonnull LicenseKeyRequest licenseKeyRequest)
```

**POST** `/api/noauth/setup/license`

Apply license key during setup (applySetupLicense)

Installs the license key pasted into the setup wizard and answers with the resulting setup state, so the caller learns whether the instance is now ready or still needs an initial system administrator account. Accepted only while the license is the missing step.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **licenseKeyRequest** | **LicenseKeyRequest** |  | |

### Return type

**SetupInfo**


## changeLicenseKey

```
LicenseChangeResult changeLicenseKey(@Nonnull LicenseKeyRequest licenseKeyRequest)
```

**POST** `/api/admin/license/key`

Change license key (changeLicenseKey)

Replaces the license key of the whole deployment and answers with the resulting setup state and the license now in force, so the caller needs no second request. Available to a system administrator in every state, including while the instance is locked.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **licenseKeyRequest** | **LicenseKeyRequest** |  | |

### Return type

**LicenseChangeResult**


## clearLicense

```
SetupInfo clearLicense()
```

**POST** `/api/admin/license/clear`

Clear license (clearLicense)

Removes the license from the whole deployment and returns it to the unactivated state, so the activation flow can be run again. Answers with the resulting setup state. Available to a system administrator in every state, including while the instance is locked. Unset the TB_LICENSE_SECRET environment variable on every node first: a node that still carries it re-activates from it and stores the key back for the whole cluster, undoing the clear.

### Return type

**SetupInfo**


## completeSetup

```
void completeSetup(@Nonnull SystemSetupRequest systemSetupRequest)
```

**POST** `/api/noauth/setup/complete`

Complete setup (completeSetup)

Creates the initial system administrator account, optionally loading the demo data, and lifts the setup lock. Accepted only while the instance has no system administrator - which is what stops an anonymous caller taking over a provisioned instance.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **systemSetupRequest** | **SystemSetupRequest** |  | |

### Return type

null (empty response body)


## confirmNonProduction

```
void confirmNonProduction()
```

**POST** `/api/admin/nonProduction/confirm`

Confirm non-production use (confirmNonProduction)

Records the system administrator's declaration that this instance is not used in production, which is what a non-production license requires. Available in every state, including while the instance is locked for a lapsed confirmation.

### Return type

null (empty response body)


## getClaim

```
LicenseClaimInfo getClaim(@Nullable String claimToken)
```

**GET** `/api/noauth/setup/claim`

Poll license claim (getClaim)

Reports whether an automatic license activation is outstanding, and completes it when the portal says the user has activated. Polled by the setup wizard. Throttled and idempotent: repeated polls collapse into at most one outbound portal call per interval, and the endpoint self-disarms once no claim token is stored - after which it answers without ever calling out.  A status carries what we understand, an error status what we do not, and between them they tell the client whether the automatic path is over:  - `EXPIRED` - terminal, and the one failure with a known cause. Either the portal refused the claim outright and will refuse it again - the token's window has closed, the claim was already spent, or the account behind it can no longer resolve a licence for this installation - or the `claimToken` this poll named has been superseded by a later claim request. Either way this client's claim is dead and no further poll of it can ever succeed. Stop polling and say so specifically. A refusal is delivered on exactly one poll, since retiring the token makes every later poll answer `NOT_REQUESTED` - which, to a client that only polls after a claim request, means the same dead end. A superseded token is answered on every poll instead, since the claim that replaced it is alive and its token is left untouched.  - 429 and 5xx - retryable, and between them they are every error status this endpoint emits. Rate limiting, an unreachable portal and a failure to apply an already claimed secret all deliberately leave the claim token stored, precisely so that a later poll can still complete the activation. Show the message, but keep polling with a backoff instead of abandoning the automatic path over one transient failure. There is deliberately no terminal error status here: a refusal the portal has actually judged is reported as the `EXPIRED` status above, on a 200, so nothing on this endpoint asks the client to read a 4xx as the end of the automatic path.  The manual key form stays reachable from every state regardless, since a user may always prefer to paste a key rather than wait.  Pass the `claimToken` that POST /api/noauth/setup/claim answered with. Only one claim is outstanding per installation, so a second browser session starting the activation replaces the first session's token; naming it is what lets this endpoint tell that session its link is dead rather than report on a claim it does not hold. Optional: a poll that names no token reports on whatever claim is stored, which is the behaviour of every client written before the parameter existed. `ACTIVATED` is answered ahead of the check either way - once a licence is in place, whichever claim delivered it, every session is told to move on.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **claimToken** | **String** | The claim token this client's own activation was started with, as returned by POST /api/noauth/setup/claim. Answered EXPIRED once a later claim request has superseded it. Omitted by a client that holds no token, which reports on the stored claim. | [optional] |

### Return type

**LicenseClaimInfo**


## getState

```
SetupInfo getState()
```

**GET** `/api/noauth/setup/state`

Get setup state (getState)

Reports what the instance still needs before it is ready to use: a license, an initial system administrator account, or nothing at all. Answered in every state, including while the setup lock is in force.

### Return type

**SetupInfo**


## previewLicenseKey

```
SubscriptionInfo previewLicenseKey(@Nonnull LicenseKeyRequest licenseKeyRequest)
```

**POST** `/api/admin/license/preview`

Preview a license key (previewLicenseKey)

Reports what a license key would install, without installing it. Nothing is activated, no instance slot is spent and the deployment keeps the license it has. Answers 400 with an operator-facing message when the key is refused.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **licenseKeyRequest** | **LicenseKeyRequest** |  | |

### Return type

**SubscriptionInfo**


## requestClaim

```
LicenseClaimResult requestClaim()
```

**POST** `/api/noauth/setup/claim`

Request license claim (requestClaim)

Begins the automatic activation: mints a claim token, records it, and answers with the portal sign-up URL the operator opens. Poll GET /api/noauth/setup/claim afterwards until the portal reports the license activated. Accepted only while the license is the missing step.

### Return type

**LicenseClaimResult**

