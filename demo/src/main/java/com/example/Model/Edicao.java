package com.example.Model;

public class Edicao {
    private int id;
    private int ano;
    private String novo_conteudo;
    private Livro livro;


    public Edicao() {
    }

    public Edicao(int id, int ano, String novo_conteudo, Livro livro) {
        this.id = id;
        this.ano = ano;
        this.novo_conteudo = novo_conteudo;
        this.livro = livro;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNovo_conteudo() {
        return this.novo_conteudo;
    }

    public void setNovo_conteudo(String novo_conteudo) {
        this.novo_conteudo = novo_conteudo;
    }

    public Livro getLivro() {
        return this.livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

}