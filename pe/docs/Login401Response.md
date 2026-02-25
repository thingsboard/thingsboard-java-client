

# Login401Response

## oneOf schemas
* [ThingsboardCredentialsExpiredResponse](ThingsboardCredentialsExpiredResponse.md)
* [ThingsboardErrorResponse](ThingsboardErrorResponse.md)

## Example
```java
// Import classes:
import org.thingsboard.client.model.Login401Response;
import org.thingsboard.client.model.ThingsboardCredentialsExpiredResponse;
import org.thingsboard.client.model.ThingsboardErrorResponse;

public class Example {
    public static void main(String[] args) {
        Login401Response exampleLogin401Response = new Login401Response();

        // create a new ThingsboardCredentialsExpiredResponse
        ThingsboardCredentialsExpiredResponse exampleThingsboardCredentialsExpiredResponse = new ThingsboardCredentialsExpiredResponse();
        // set Login401Response to ThingsboardCredentialsExpiredResponse
        exampleLogin401Response.setActualInstance(exampleThingsboardCredentialsExpiredResponse);
        // to get back the ThingsboardCredentialsExpiredResponse set earlier
        ThingsboardCredentialsExpiredResponse testThingsboardCredentialsExpiredResponse = (ThingsboardCredentialsExpiredResponse) exampleLogin401Response.getActualInstance();

        // create a new ThingsboardErrorResponse
        ThingsboardErrorResponse exampleThingsboardErrorResponse = new ThingsboardErrorResponse();
        // set Login401Response to ThingsboardErrorResponse
        exampleLogin401Response.setActualInstance(exampleThingsboardErrorResponse);
        // to get back the ThingsboardErrorResponse set earlier
        ThingsboardErrorResponse testThingsboardErrorResponse = (ThingsboardErrorResponse) exampleLogin401Response.getActualInstance();
    }
}
```


