package dev.pinter.apidemo.hello;

import dev.pinter.apidemo.Message;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;

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
