package Model;

public class Livro {
    private int id;
    private String nome_livro;
    private String descricao;
    private int ano_publicacao;
    private Autor autor;
    private Editora editora;


    public Livro() {
    }

    public Livro(int id, String nome_livro, String descricao, int ano_publicacao, Autor autor, Edicao edicao, Editora editora, Emprestimo_livro emprestimo_livro) {
        this.id = id;
        this.nome_livro = nome_livro;
        this.descricao = descricao;
        this.ano_publicacao = ano_publicacao;
        this.autor = autor;
        this.edicao = edicao;
        this.editora = editora;
        this.emprestimo_livro = emprestimo_livro;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_livro() {
        return this.nome_livro;
    }

    public void setNome_livro(String nome_livro) {
        this.nome_livro = nome_livro;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAno_publicacao() {
        return this.ano_publicacao;
    }

    public void setAno_publicacao(int ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return this.editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
    
}