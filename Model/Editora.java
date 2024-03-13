package Model;

public class Editora {
    private int id;
    private String nome_editora;


    public Editora() {
    }

    public Editora(int id, String nome_editora) {
        this.id = id;
        this.nome_editora = nome_editora;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_editora() {
        return this.nome_editora;
    }

    public void setNome_editora(String nome_editora) {
        this.nome_editora = nome_editora;
    }

}
