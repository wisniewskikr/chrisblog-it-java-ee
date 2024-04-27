package com.example.resources;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

/**
 * The REST resource implementation class.
 */
@Path("hello")
public class HelloWorldResource {

    @GET
    public Response helloWorld() {

        JsonObject helloWorldJson = Json.createObjectBuilder()
            .add("message", "Hello World!")
            .build();

        return Response.ok(helloWorldJson).build();

    }
    
}
