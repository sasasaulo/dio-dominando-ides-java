package com.saulo.dominandoides.model;

import java.util.Objects;

public class Cachorro {

    private String nome;
    private String cor;
    private int idade;

    public Cachorro(String nome, String cor, int idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public Cachorro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cachorro cachorro = (Cachorro) o;
        return Objects.equals(nome, cachorro.nome) && Objects.equals(cor, cachorro.cor) && Objects.equals(idade, cachorro.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, idade);
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade='" + idade + '\'' +
                '}';
    }
}
