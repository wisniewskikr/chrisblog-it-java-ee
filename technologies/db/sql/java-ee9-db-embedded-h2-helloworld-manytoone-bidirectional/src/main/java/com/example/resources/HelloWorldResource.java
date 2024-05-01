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
import com.example.entities.MessageEntity;
import com.example.services.HelloWorldService;
import com.example.services.MessageService;

/**
 * The REST resource implementation class.
 */
@Path("hello")
public class HelloWorldResource {

    private HelloWorldService helloWorldService;

    private MessageService messageService;
    
    @Inject
    public HelloWorldResource(HelloWorldService helloWorldService, MessageService messageService) {
        this.helloWorldService = helloWorldService;
        this.messageService = messageService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response helloWorld() {

        MessageEntity messageEntity = messageService.load(1L);
        HelloWorldEntity helloWorld = helloWorldService.load(messageEntity.getHelloWorldEntity().getId());
        String message = helloWorld.getMessages().iterator().next().getMessage();
        
        Map<String, String> response = Collections.singletonMap("message", message);
        return Response.ok(response).build();

    }
    
}
