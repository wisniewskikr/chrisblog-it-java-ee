package com.example.resources;

import java.util.List;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import com.example.entities.HelloWorldEntity;
import com.example.models.InfoModel;
import com.example.services.HelloWorldService;

/**
 * The REST resource implementation class.
 */
@Path("v1/messages")
public class HelloWorldResource {
    
    private HelloWorldService helloWorldService;

    @Inject
	public HelloWorldResource(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}

    @GET
    @Produces(MediaType.APPLICATION_JSON)
	public Response list() {	
		List<HelloWorldEntity> models = helloWorldService.findAll();
		return Response.ok(models).build();
	}

	@GET
    @Path("/{id}")
	public Response view(@PathParam("id") Long id) {
		HelloWorldEntity model = null;
		try {
			model = helloWorldService.findById(id);
		} catch (Exception e) {
			return Response.status(404).entity(new InfoModel(e.getMessage())).build();
		}		
		return Response.ok(model).build();
	}

	@POST
    @Consumes(MediaType.APPLICATION_JSON)
	public Response create(HelloWorldEntity helloWorldModel) {
		String message = null;
		try {
			message = helloWorldService.save(helloWorldModel);
		} catch (Exception e) {
			return Response.status(400).entity(new InfoModel(e.getMessage())).build();
		}			
		return Response.ok(new InfoModel(message)).build();
	}

	@PUT
    @Consumes(MediaType.APPLICATION_JSON)
	public Response edit(HelloWorldEntity helloWorldModel) {
		String message = null;
		try {
			message = helloWorldService.save(helloWorldModel);
		} catch (Exception e) {
			return Response.status(400).entity(new InfoModel(e.getMessage())).build();
		}			
		return Response.ok(new InfoModel(message)).build();
	}

	@DELETE
    @Path("/{id}")
	public Response delete(@PathParam("id") Long id) {
		String message = null;
		try {
			message = helloWorldService.deleteById(id);
		} catch (Exception e) {
			return Response.status(404).entity(new InfoModel(e.getMessage())).build();
		}		
		return Response.ok(new InfoModel(message)).build();
	}
    
}
