package com.example.resources;

import java.util.Collections;
import java.util.Map;

import com.example.threads.items.HelloWorldThreadItem;
import com.example.threads.processors.HelloWorldThreadProcessor;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.annotation.Resource;
import jakarta.enterprise.concurrent.ManagedExecutorService;
import jakarta.inject.Inject;

/**
 * The REST resource implementation class.
 */
@Path("hello")
public class HelloWorldResource {

    @Resource
    private ManagedExecutorService mes;

    private HelloWorldThreadProcessor processor;
    
    @Inject
    public HelloWorldResource(HelloWorldThreadProcessor processor) {
        this.processor = processor;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response helloWorld() {

        mes.execute(() -> processor.onHelloWorldAction(new HelloWorldThreadItem("Hello World from Thread!", 5000000000L)));
        Map<String, String> response = Collections.singletonMap("message", "Hello World!");
        return Response.ok(response).build();
        
    }
    
}
