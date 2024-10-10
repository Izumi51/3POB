/*
    8.  Faça um programa utilizando listas que leia 9 números inteiros. Ao final o programa 
    deve informar o maior número, a quantidade de vezes que ele ocorre e em quais posições da lista.
*/

package aula4.listaExercicio4;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in))
        {
            int qnt = 5;

            int num [] = new int[qnt];
            int maior = Integer.MIN_VALUE;
            int qntOc = 0; 

                for (int i = 0; i < qnt; i++)
                {
                    System.out.print("Insira um numero: ");
                    num[i] = scanner.nextInt();
                    
                    if (num[i] > maior)
                    {
                        maior = num[i];
                    }
                }

                
                
                for (int i = 0; i < qnt; i++)
                {
                    if (num[i] == maior)
                    {
                        System.out.println("i: " + i);
                        qntOc++;
                    }
                }

                System.out.println(qntOc);
            
            scanner.close();
        }
    }
}