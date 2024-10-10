/*
    Construa um programa que armazene números inteiros em uma lista de 10 posições, 
    calcule o quadrado de cada elemento armazenado nesta lista e armazene o resultado 
    em uma outra lista. Ao final os dados da segunda lista devem ser exibidos.
*/

package aula4.listaExercicio4;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in))
        {
            int qnt = 5;

            int num [] = new int[qnt];
            int quad [] = new int[qnt];

                for (int i = 0; i < qnt; i++)
                {
                    System.out.print("Insira um numero: ");
                    num[i] = scanner.nextInt();
                    quad[i] = num[i] * num[i];
                }

                for (int i = 0; i < qnt; i++)
                {
                    System.out.println(quad[i]);
                }
                
            scanner.close();
        }
    }
}