package com.example.resources;

import java.util.Collections;
import java.util.Map;

import com.example.models.HelloWorldModel;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * The REST resource implementation class.
 */
@Path("hello")
public class HelloWorldResource {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response helloWorld(@Valid @NotNull HelloWorldModel model) {
        Map<String, String> response = Collections.singletonMap("message", model.getMessage());
        return Response.ok(response).build();
    }
    
}
