package com.example.resources;

import java.net.URI;
import java.util.Collections;
import java.util.Map;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;

/**
 * The REST resource implementation class.
 */
@Path("hello")
public class HelloWorldResource {

    @Context
    private UriInfo uriInfo;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response helloWorld() {

        Map<String, String> response = Collections.singletonMap("message", "Hello World!");
        URI uri = uriInfo.getBaseUriBuilder()
            .path(HelloWorldResource.class)
            .build();

        return Response.ok(response)
            .header("location", uri)
            .build();

    }
    
}
