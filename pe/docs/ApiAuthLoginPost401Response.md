

# ApiAuthLoginPost401Response

## oneOf schemas
* [ThingsboardCredentialsExpiredResponse](ThingsboardCredentialsExpiredResponse.md)
* [ThingsboardErrorResponse](ThingsboardErrorResponse.md)

## Example
```java
// Import classes:
import org.thingsboard.client.model.ApiAuthLoginPost401Response;
import org.thingsboard.client.model.ThingsboardCredentialsExpiredResponse;
import org.thingsboard.client.model.ThingsboardErrorResponse;

public class Example {
    public static void main(String[] args) {
        ApiAuthLoginPost401Response exampleApiAuthLoginPost401Response = new ApiAuthLoginPost401Response();

        // create a new ThingsboardCredentialsExpiredResponse
        ThingsboardCredentialsExpiredResponse exampleThingsboardCredentialsExpiredResponse = new ThingsboardCredentialsExpiredResponse();
        // set ApiAuthLoginPost401Response to ThingsboardCredentialsExpiredResponse
        exampleApiAuthLoginPost401Response.setActualInstance(exampleThingsboardCredentialsExpiredResponse);
        // to get back the ThingsboardCredentialsExpiredResponse set earlier
        ThingsboardCredentialsExpiredResponse testThingsboardCredentialsExpiredResponse = (ThingsboardCredentialsExpiredResponse) exampleApiAuthLoginPost401Response.getActualInstance();

        // create a new ThingsboardErrorResponse
        ThingsboardErrorResponse exampleThingsboardErrorResponse = new ThingsboardErrorResponse();
        // set ApiAuthLoginPost401Response to ThingsboardErrorResponse
        exampleApiAuthLoginPost401Response.setActualInstance(exampleThingsboardErrorResponse);
        // to get back the ThingsboardErrorResponse set earlier
        ThingsboardErrorResponse testThingsboardErrorResponse = (ThingsboardErrorResponse) exampleApiAuthLoginPost401Response.getActualInstance();
    }
}
```


