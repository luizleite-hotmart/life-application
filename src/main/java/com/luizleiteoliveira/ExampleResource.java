package com.luizleiteoliveira;

import com.luizleiteoliveira.entity.User;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/user")
public class ExampleResource {

    @Inject
    @RestClient
    Client client;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User hello() {
        return client.getUsers(1);
    }
}