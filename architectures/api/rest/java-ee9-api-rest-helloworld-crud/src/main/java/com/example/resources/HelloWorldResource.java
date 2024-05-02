package com.example.resources;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.models.HelloWorldModel;
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
		List<HelloWorldModel> models = helloWorldService.findAll();
		return Response.ok(models).build();
	}

	@GET
    @Path("/{id}")
	public Response view(@PathParam("id") Long id) {
		HelloWorldModel model = null;
		try {
			model = helloWorldService.findById(id);
		} catch (Exception e) {
			return Response.status(404).entity(new InfoModel(e.getMessage())).build();
		}		
		return Response.ok(model).build();
	}

	@POST
    @Consumes(MediaType.APPLICATION_JSON)
	public Response create(HelloWorldModel helloWorldModel) {
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
	public Response edit(HelloWorldModel helloWorldModel) {
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
