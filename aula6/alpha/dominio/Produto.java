package aula6.alpha.dominio;

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

    // get
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    // set
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }

    // Metodos
    public void listarProduto () {
        System.out.println("\n\tProduto: " + nome + "\n\tID: "+ id + "\n\tValor: " + valor);
    }
}
