package com.example.resources;

import java.util.Collections;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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

        Long id = helloWorldService.save(new HelloWorldEntity("Hello World!"));
        HelloWorldEntity helloWorld = helloWorldService.load(id);
        
        Map<String, String> response = Collections.singletonMap("message", helloWorld.getMessage());
        return Response.ok(response).build();

    }
    
}
