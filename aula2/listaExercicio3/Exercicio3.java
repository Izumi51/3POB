// 3.  Faça um programa que leia a idade de 10 pessoas. Ao final escreva a média das idades.


package aula2.listaExercicio3;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in))
        {
            int len = 10;
            int soma = 0;

            for (int i = 0; i < len; i++)
            {
                System.out.print("Entre com uma idade: ");
                int valor = scanner.nextInt();
                soma += valor;
            }

            double media = (double)soma/len;

            System.out.println(media);

            scanner.close();
        }
    }
}
