package com.example.Model;

public class Emprestimo_Livro {
    private int id;
    private Livro livro;
    private Emprestimo emprestimo;

    public Emprestimo_Livro() {
    }

    public Emprestimo_Livro(int id, Livro livro, Emprestimo emprestimo) {
        this.id = id;
        this.livro = livro;
        this.emprestimo = emprestimo;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Livro getLivro() {
        return this.livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Emprestimo getEmprestimo() {
        return this.emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

}