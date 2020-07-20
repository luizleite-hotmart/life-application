package com.luizleiteoliveira.entity;

import com.luizleiteoliveira.entity.client.EmpresaClient;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private Long id;
    private String nome;
    private List<Produto> produtos = new ArrayList<>();
    private Cidade cidade;

    public Empresa() {
    }

    public Empresa(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Empresa(EmpresaClient empresaClient) {
        this.nome = empresaClient.getNome();
        this.id = empresaClient.getId();
    }

}
