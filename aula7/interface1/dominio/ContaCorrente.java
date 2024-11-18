package aula7.interface1.dominio;

public class ContaCorrente implements Conta {
    private double saldo;
    private final double TAXAOP = 0.20;
    
    @Override
    public void depositar(double valor) {
        saldo += valor - TAXAOP;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor + TAXAOP;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
} 
