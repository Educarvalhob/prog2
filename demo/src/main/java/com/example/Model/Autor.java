package com.example.Model;

public class Autor {
    private int id;
    private String nome_autor;


    public Autor() {
    }

    public Autor(int id, String nome_autor) {
        this.id = id;
        this.nome_autor = nome_autor;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_autor() {
        return this.nome_autor;
    }

    public void setNome_autor(String nome_autor) {
        this.nome_autor = nome_autor;
    }

}
