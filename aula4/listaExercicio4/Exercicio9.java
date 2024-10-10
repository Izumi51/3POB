/*
    Elabore um programa que contenha três listas de 10 posições A, B e C. O objetivo do 
    programa é armazenar números nas listas A e B e fazer com que a lista C receba a soma 
    dos elementos correspondentes de A e B. Ao final o programa deve exibir no vídeo o conteúdo da lista C.
*/

package aula4.listaExercicio4;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in))
        {
            int qnt = 5;

            int listA [] = new int[qnt];
            int listB [] = new int[qnt];
            int listC [] = new int[qnt];
            
            for (int i = 0; i < qnt; i++)
            {
                System.out.print("Insira um numero para lista A: ");
                listA[i] = scanner.nextInt();
                System.out.print("Insira um numero para lista B: ");
                listB[i] = scanner.nextInt();

                listC[i] = listA[i] + listB[i];
            }

            for (int i = 0; i < qnt; i++) {
                System.out.println(listC[i]);
            }
            scanner.close();
        }
    }
}