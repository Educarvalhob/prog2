package Model;

public class Emprestimo_livro {
    private id;
    private Livro livro;
    private Emprestimo emprestimo; 

    public Emprestimo_livro() {
    }

    public Emprestimo_livro(Livro livro, Emprestimo emprestimo) {
        this.livro = livro;
        this.emprestimo = emprestimo;
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