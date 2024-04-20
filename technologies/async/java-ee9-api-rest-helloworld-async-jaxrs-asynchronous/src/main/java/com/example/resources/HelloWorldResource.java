package com.example.resources;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import jakarta.ejb.Asynchronous;
import jakarta.ejb.Stateless;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.container.AsyncResponse;
import jakarta.ws.rs.container.Suspended;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * The REST resource implementation class.
 */
@Path("hello")
@Stateless
public class HelloWorldResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Asynchronous
    public void helloWorldAsync(@Suspended AsyncResponse asyncResponse) {

        asyncResponse.setTimeout(10, TimeUnit.SECONDS);
        asyncResponse.setTimeoutHandler(response -> response.resume(Response.status(Response.Status.SERVICE_UNAVAILABLE)));
        
        asyncResponse.resume(helloWorld());

    }

    public Response helloWorld() {
        Map<String, String> response = Collections.singletonMap("message", "Hello World!");
        return Response.ok(response).build();
    }
    
}
