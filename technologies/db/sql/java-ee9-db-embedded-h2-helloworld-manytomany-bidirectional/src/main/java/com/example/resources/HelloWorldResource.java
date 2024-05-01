package com.example.resources;

import java.util.Collections;
import java.util.Map;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import com.example.entities.HelloWorldEntity;
import com.example.services.HelloWorldService;

/**
 * The REST resource implementation class.
 */
@Path("hello")
public class HelloWorldResource {

    private HelloWorldService helloWorldService;
    
    @Inject
    public HelloWorldResource(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response helloWorld() {

        HelloWorldEntity helloWorld = helloWorldService.load(1L);
        String message = helloWorld.getMessages().iterator().next().getMessage();
        
        Map<String, String> response = Collections.singletonMap("message", message);
        return Response.ok(response).build();

    }
    
}
