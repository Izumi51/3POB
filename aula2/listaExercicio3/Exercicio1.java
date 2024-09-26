/* 
    1.  Faça um programa que leia o preço de 10 produtos. 
    Ao final escreva o somatório dos preços.
*/

package aula2.listaExercicio3;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in))
        {   
            int len = 10;
            int soma = 0;

            for (int i = 0; i < len; i++)
            {
                System.out.print("Entre com um valor: ");
                int valor = scanner.nextInt();
                soma += valor;
            }

            System.out.println(soma);

            scanner.close();
        }
    }
}
