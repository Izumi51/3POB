/*
    5- Faça um programa que leia dois números e mostre qual o maior dos dois. 
    O programa deve informar caso sejam iguais. 
*/
package aula2.listaExercicio2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in))
        {
            System.out.print("Insira um numero: ");
            double n1 = scanner.nextDouble();
            System.out.print("Insira um numero: ");
            double n2 = scanner.nextDouble();
            
            if(n1 > n2)
            {
                System.out.print("n1 maior");
            }else{
                if(n1 < n2)
                {
                    System.out.print("n2 maior");
                }else{
                    System.out.print("iguais");
                }
            }

            scanner.close();
        }
    }
}