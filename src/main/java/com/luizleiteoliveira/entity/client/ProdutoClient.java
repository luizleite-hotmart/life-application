package com.luizleiteoliveira.entity.client;

import java.util.List;

public class ProdutoClient {

    private Long id;
    private String nome;
    private List<Long> tecnologias;

    public ProdutoClient() {
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

    public List<Long> getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(List<Long> tecnologias) {
        this.tecnologias = tecnologias;
    }
}
