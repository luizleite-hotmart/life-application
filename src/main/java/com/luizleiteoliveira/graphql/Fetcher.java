package com.luizleiteoliveira.graphql;

import com.luizleiteoliveira.Client;
import com.luizleiteoliveira.entity.Empresa;
import com.luizleiteoliveira.entity.User;
import com.luizleiteoliveira.entity.client.EmpresaClient;
import com.luizleiteoliveira.entity.client.UserClient;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

import java.util.Optional;

public class Fetcher implements DataFetcher<User> {

    private final Client client;

    public Fetcher(Client client) {
        this.client = client;
    }


    private User getUser(int id) {
        UserClient userClient = client.getUsers(id);
        User user = new User(userClient);
        user.setEmpresa(getEmpresaUsuario(userClient.getEmpresa().intValue()));
        return user;
    }

    private Empresa getEmpresaUsuario(int id) {
        EmpresaClient empresaClient = client.getCompanies(id);
        Empresa empresa = new Empresa(empresaClient);
        return empresa;
    }

    @Override
    public User get(DataFetchingEnvironment environment) throws Exception {
        int userId = (int) Optional.ofNullable(environment.getArgument("userId")).orElse(1);
        return getUser(userId);
    }
}
