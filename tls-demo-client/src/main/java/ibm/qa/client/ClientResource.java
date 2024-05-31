package ibm.qa.client;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import ibm.qa.api.ServerApi;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/call")
public class ClientResource {

    @RestClient
    ServerApi restClient;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String callServer() {
        return restClient.hello();
    }
}
