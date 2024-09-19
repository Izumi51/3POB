package testando.teste.controle;
import testando.teste.dominio.Classe;

public class controleClasse {
    public static void main(String[] args) {
        Classe classe = new Classe(2, 3, 7);

        System.out.print("teste: " + classe.soma());
    }               
}