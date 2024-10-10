/*
    Faça um programa utilizando listas que leia 10 números inteiros e ao final escreva estes    
    números na ordem crescente e na ordem decrescente.
*/

package aula4.listaExercicio4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in))
        {
            ArrayList<Integer> num = new ArrayList<>();
            int qnt = 10;

            for (int i = 0; i < qnt; i++)
            {
                System.out.print("Insira um numero: ");
                    num.add(scanner.nextInt());
            }

            Collections.sort(num);
            System.out.println(num);
            Collections.reverse(num);
            System.out.print(num);
            
            scanner.close();
        }
    }
}