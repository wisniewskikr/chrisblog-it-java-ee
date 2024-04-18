package com.example.resources;

import java.util.Collections;
import java.util.Map;

import com.example.events.items.HelloWorldEventItem;

import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;
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

    private Event<HelloWorldEventItem> helloWorldEvent;

    @Inject
    public HelloWorldResource(Event<HelloWorldEventItem> helloWorldEvent) {
        this.helloWorldEvent = helloWorldEvent;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response helloWorld() {
        helloWorldEvent.fire(new HelloWorldEventItem("Hello World from Event!", 5000000000L));
        Map<String, String> response = Collections.singletonMap("message", "Hello World!");
        return Response.ok(response).build();
    }
    
}
