/* 
    8- Faça um programa que leia o código, a quantidade, o preço unitário e a forma de pagamento de um produto.
    1. Dinheiro -- Pagamentos em dinheiro recebem um desconto de 10%.
    2. Cheque -- Pagamentos em cheque recebem um desconto de 2%.
    3. Cartão débito -- Pagamentos em cartão de débito recebem um desconto de 5%.
    4. Cartão crédito -- Pagamentos em cartão de crédito recebem um desconto de 3%.
    O programa deve informar o valor do desconto e o valor final a pagar.
*/

package aula2.lista_exercicio_2;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){

            System.out.println("1. Dinheiro\n2. Cheque\n3. debito\n4. credito.\nInsira a forma de pagamento: ");
            String metodo = scanner.nextLine();
            System.out.print("Insira o codigo: ");
            int cod = scanner.nextInt();
            System.out.print("Insira a quantidade: ");
            int quantidade = scanner.nextInt();
            System.out.print("Insira o preco unitario: ");
            double preco = scanner.nextDouble();

            double desconto = 0;
            metodo = metodo.toLowerCase();

            if (metodo.equals("dinheiro")){ 
                desconto = ((preco * (double)quantidade) * 10) / 100;
            }else{
                if (metodo.equals("cheque")) {
                    desconto = ((preco * (double)quantidade) * 2) / 100;
                }else{
                    if (metodo.equals("debito")) {
                        desconto = ((preco * (double)quantidade) * 5) / 100;
                    }else{
                        if (metodo.equals("credito")) {
                            desconto = ((preco * (double)quantidade) * 3) / 100;
                        }
                    }
                }
            }

            System.out.println(cod);
            System.out.println("Desconto: " + desconto);
            System.out.println("preco: " + (preco - desconto));
        }
    }
}
