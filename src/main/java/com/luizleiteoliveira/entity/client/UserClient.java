package com.luizleiteoliveira.entity.client;

import java.util.List;

public class UserClient {

    private Long id;
    private String nomeCompleto;
    private int anoNascimento;
    private String estadoCivil;
    private int numeroDeIrmaos;
    private Long cidade;
    private Long empresa;
    private List<Long> hobbies;

    public UserClient() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nomeCompleto;
    }

    public void setNome(String nome) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getNumeroDeIrmaos() {
        return numeroDeIrmaos;
    }

    public void setNumeroDeIrmaos(int numeroDeIrmaos) {
        this.numeroDeIrmaos = numeroDeIrmaos;
    }

    public Long getCidade() {
        return cidade;
    }

    public void setCidade(Long cidade) {
        this.cidade = cidade;
    }

    public Long getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Long empresa) {
        this.empresa = empresa;
    }

    public List<Long> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Long> hobbies) {
        this.hobbies = hobbies;
    }
}
