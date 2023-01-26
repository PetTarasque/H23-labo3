package ulaval.glo2003;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/ping")
public class PingPongResource {
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Response pong(PingRequest pingRequest, @HeaderParam("AuthId") String header, @PathParam("id") String pathParam) {
        PingResponse response = new PingResponse(pingRequest.name, header, pathParam);
        return Response.ok(response).build();
    }
}
