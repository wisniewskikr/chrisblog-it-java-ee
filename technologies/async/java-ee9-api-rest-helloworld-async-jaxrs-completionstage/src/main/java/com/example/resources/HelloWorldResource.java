package com.example.resources;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import jakarta.annotation.Resource;
import jakarta.enterprise.concurrent.ManagedExecutorService;
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

    @Resource
    private ManagedExecutorService mes;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public CompletionStage<Response> helloWorldAsync() {
        return CompletableFuture.supplyAsync(this::helloWorld, mes);
    }

    public Response helloWorld() {
        Map<String, String> response = Collections.singletonMap("message", "Hello World!");
        return Response.ok(response).build();
    }
    
}
