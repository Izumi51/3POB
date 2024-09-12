/*
    2.  Faça um programa que calcule e escreva no vídeo o somatório dos números inteiros de 1 até 50.
*/

package AULA_2.Lista_exercicio_3;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in))
        {
            int len = 50;
            int soma = 0;

            for (int i = 0; i <= len; i++)
            {
                soma += i;
            }

            System.out.println(soma);

            scanner.close();
        }
    }
}
