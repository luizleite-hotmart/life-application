package com.luizleiteoliveira.graphql;

import com.luizleiteoliveira.Client;
import com.luizleiteoliveira.entity.Empresa;
import com.luizleiteoliveira.entity.Produto;
import com.luizleiteoliveira.entity.Tech;
import com.luizleiteoliveira.entity.User;
import com.luizleiteoliveira.entity.client.EmpresaClient;
import com.luizleiteoliveira.entity.client.ProdutoClient;
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
        for (Long produtoId: empresaClient.getProdutos()) {
            empresa.getProdutos().add(getProducto(produtoId.intValue()));
        }
        return empresa;
    }

    private Produto getProducto(int id) {
        ProdutoClient produtoClient = client.getProducts(id);
        Produto produto = new Produto(produtoClient);
        for (Long techId: produtoClient.getTecnologias()) {
            produto.getTecnologias().add(getTech(techId.intValue()));
        }
        return produto;
    }

    private Tech getTech(int id) {
        return client.getTechnologies(id);
    }

    @Override
    public User get(DataFetchingEnvironment environment) throws Exception {
        int userId = (int) Optional.ofNullable(environment.getArgument("userId")).orElse(1);
        return getUser(userId);
    }
}
