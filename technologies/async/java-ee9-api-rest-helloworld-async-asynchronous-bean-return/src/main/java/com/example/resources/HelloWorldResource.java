package com.example.resources;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import com.example.services.AsyncService;

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

    private AsyncService asyncService;

    @Inject
    public HelloWorldResource(AsyncService asyncService) {
        this.asyncService = asyncService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response helloWorld() throws InterruptedException, ExecutionException {

        Future<String> future = asyncService.displayMessageWithDelay("Asynchronous Hello World!", 5000000000L);
        System.out.println(future.get());
        
        Map<String, String> response = Collections.singletonMap("message", "Hello World!");
        return Response.ok(response).build();

    }
    
}
