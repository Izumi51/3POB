package AULA_3.controle;
import AULA_3.dominio.Produto;
import java.util.Scanner;

public class controlaProduto {
    
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Insira o numero: ");
            int numero = scanner.nextInt();
            System.out.println("Insira a quantidade: ");
            int quantidade = scanner.nextInt();
            System.out.println("Insira o valor: ");
            double valor = scanner.nextDouble();

            Produto produto = new Produto(numero, quantidade, valor);

            System.out.println("Total: " + produto.valorPagar());
        }
    }
}