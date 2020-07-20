package com.luizleiteoliveira.graphql;


import com.luizleiteoliveira.Client;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import java.io.InputStreamReader;
import java.util.Objects;

public class GraphQLProducer {

    private final Logger LOGGER = LoggerFactory.getLogger(GraphQLProducer.class);

    @RestClient
    @Inject
    Client userClient;



    @Produces
    public GraphQL setup() {

        LOGGER.info("Setting up GraphQL..");

        SchemaParser schemaParser = new SchemaParser();
        TypeDefinitionRegistry registry = schemaParser.parse(
            new InputStreamReader(
                Objects.requireNonNull(Thread.currentThread().getContextClassLoader()
                    .getResourceAsStream("META-INF/resources/graphql.schema"))));

        SchemaGenerator schemaGenerator = new SchemaGenerator();
        GraphQLSchema graphQLSchema = schemaGenerator.makeExecutableSchema(registry, wirings());
        return GraphQL.newGraphQL(graphQLSchema).build();
    }

    private RuntimeWiring wirings() {

        LOGGER.info("Wiring queries..");

        return RuntimeWiring.newRuntimeWiring()
            .type("Query",
                builder -> builder.dataFetcher("getUser", new Fetcher(userClient)))
            .build();
    }


}
