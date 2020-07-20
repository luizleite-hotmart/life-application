package com.luizleiteoliveira;

import com.luizleiteoliveira.entity.client.UserClient;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient
public interface Client {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/users/{userId}")
    UserClient getUsers(@PathParam("userId") int userId);
}
