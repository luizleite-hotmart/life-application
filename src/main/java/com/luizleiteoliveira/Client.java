package com.luizleiteoliveira;

import com.luizleiteoliveira.entity.Hobbie;
import com.luizleiteoliveira.entity.Tech;
import com.luizleiteoliveira.entity.client.EmpresaClient;
import com.luizleiteoliveira.entity.client.ProdutoClient;
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

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/hobbies/{hobbieId}")
    Hobbie getHobbie(@PathParam("hobbieId") int hobbieId);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/companies/{companyId}")
    EmpresaClient getCompanies(@PathParam("companyId") int companyId);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/products/{productId}")
    ProdutoClient getProducts(@PathParam("productId") int productId);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/technologies/{techId}")
    Tech getTechnologies(@PathParam("techId") int techId);
}
