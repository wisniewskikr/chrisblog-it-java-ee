package com.example.mappers;

import com.example.exceptions.HelloWorldException;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class HelloWorldExceptionMapper implements ExceptionMapper<HelloWorldException> {

    @Override
    public Response toResponse(HelloWorldException exception) {

        return Response.status(Response.Status.BAD_REQUEST)
            .header("HelloWorldException", exception.getMessage())
            .entity(exception.getMessage())
            .build();

    }
    
}