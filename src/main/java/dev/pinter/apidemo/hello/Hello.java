package dev.pinter.apidemo.hello;

import dev.pinter.apidemo.Message;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/hello")
@RequestScoped
public class Hello {

    @GET
    @Path("/message")
    @Produces("application/json")
    public Response message(@QueryParam("name") String name) {
        Message message = new Message(name);
        if(name == null || name.equals("")) {
            return Response.ok("Name ???").build();
        }
        return Response.ok(message).build();
    }
}
