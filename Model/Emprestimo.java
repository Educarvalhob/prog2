package Model;

public class Emprestimo {
    private int id;
    private String data_emprestimo;


    public Emprestimo() {
    }

    public Emprestimo(int id, String data_emprestimo) {
        this.id = id;
        this.data_emprestimo = data_emprestimo;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData_emprestimo() {
        return this.data_emprestimo;
    }

    public void setData_emprestimo(String data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

}
