package aula7.interface1.dominio;

public interface Conta {
    void depositar(double valor);
    void sacar(double valor);
    double getSaldo();
}
