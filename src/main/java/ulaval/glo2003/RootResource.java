package ulaval.glo2003;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("")
public class RootResource {
    @Path("error1")
    @GET
    public Response error1() {
        throw new IllegalArgumentException("Illegal argument exception!");
    }

    @Path("error2")
    @GET
    public Response error2() {
        throw new RuntimeException("Runtime exception!");
    }
}
