package web.service.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("/checklist/v1")
@Produces(MediaType.APPLICATION_JSON)
public class BaseResource {

    @GET
    @Path("/baseTest")
    public Response getBaseTestResult() {
        Map result = new HashMap();
        result.put("HELLO", "WORLD");
        return Response.ok(result, MediaType.APPLICATION_JSON_TYPE).build();
    }
}
