package com.luizleiteoliveira.entity;

public class User {

    private Long id;
    private String nomeCompleto;
    private int anoNascimento;
    private String estadoCivil;
    private int numeroDeIrmaos;
    private Cidade cidade;
    private Empresa empresa;
    private Hobbie hobbies;

    public User() {
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

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Hobbie getHobbies() {
        return hobbies;
    }

    public void setHobbies(Hobbie hobbies) {
        this.hobbies = hobbies;
    }
}
