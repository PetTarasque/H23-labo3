package ulaval.glo2003;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;

public class IllegalArgumentExceptionMapper implements ExceptionMapper<IllegalArgumentException> {

    @Override
    public Response toResponse(IllegalArgumentException exception) {
        Error error = new Error(new SubError("You made an Error!"));
        return Response.status(400).entity(error).build();
    }
}
