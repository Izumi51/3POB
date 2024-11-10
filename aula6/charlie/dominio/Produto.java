package aula6.charlie.dominio;

public class Produto {
    private int id;
    private String nome;
    private double valor;

    public Produto (int id, String nome, double valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    /* GET */
    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    /* SET */
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /* METODOS */
    public void listarProduto() {
        System.out.println("ID: " + id + ", Nome: " + nome + ", Valor: R$ " + valor);
    }

}