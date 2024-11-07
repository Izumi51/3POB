package aula6.charlie.dominio;

public class Produto {
    private int id;
    private String nome;
    private double valor;

    public Produto (int id, String nome, double valor) {
        super();
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    /* GET */
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    /* SET */
    public void setId(int id) {
        this.id = id;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setValor (double valor) {
        this.valor = valor; 
    }

    /* METODOS */
    public void listarProduto () {
        System.out.println("Id do produto: " + id + "Nome do produto: " + nome + "Valor do produto: " + valor);
    }
}
