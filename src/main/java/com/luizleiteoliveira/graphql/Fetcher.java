package com.luizleiteoliveira.graphql;

import com.luizleiteoliveira.Client;
import com.luizleiteoliveira.entity.User;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

import java.util.Optional;

public class Fetcher implements DataFetcher<User> {

    private final Client client;

    public Fetcher(Client client) {
        this.client = client;
    }


    private User getUser(int id) {

        return new User();
    }

    @Override
    public User get(DataFetchingEnvironment environment) throws Exception {
        int userId = (int) Optional.ofNullable(environment.getArgument("userId")).orElse(1);
        return getUser(userId);
    }
}
