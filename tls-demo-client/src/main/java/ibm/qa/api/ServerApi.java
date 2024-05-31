package ibm.qa.api;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@RegisterRestClient(configKey = "server-api")
public interface ServerApi {

    @GET
    @Path("/hello-server")
    String hello();
}
