package pro.kretov.jersey.rs;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/rs")
public class RestService {

    @GET
    public Response get() {
        return Response.ok().entity("GET").build();
    }

    @POST
    public Response post() {
        return Response.ok().entity("POST").build();
    }
}
