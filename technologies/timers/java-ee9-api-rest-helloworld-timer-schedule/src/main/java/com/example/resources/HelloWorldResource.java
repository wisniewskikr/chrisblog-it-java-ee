package com.example.resources;

import java.util.Collections;
import java.util.Map;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * The REST resource implementation class.
 */
@Path("hello")
public class HelloWorldResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response helloWorld() {
        Map<String, String> response = Collections.singletonMap("message", "Hello World!");
        return Response.ok(response).build();
    }
    
}
