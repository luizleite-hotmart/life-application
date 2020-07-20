package com.luizleiteoliveira.entity;

import java.util.List;

public class Produto {

    private Long id;
    private String nome;
    private List<Tech> tecnologias;

    public Produto() {
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

    public List<Tech> getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(List<Tech> tecnologias) {
        this.tecnologias = tecnologias;
    }
}
