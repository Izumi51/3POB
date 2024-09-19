package AULA_3.dominio;

public class Produto {
    private int numero;
    private int quantidade;
    private double valor;

    // objeto construtor OBS: OBRIGATORIO
    // poderia ser public produto (){}
    public Produto (int numero, int quantidade, double valor){
        super();
        this.numero = numero;
        this.quantidade = quantidade;
        this.valor = valor;
    } 

    // get == pegar valor
    public int getNumero(){
        return numero;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public double getValor(){
        return valor;
    }
    
    // set == atualizar
    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    // metodos
    public double valorPagar(){
        return quantidade * valor;
    }
}
