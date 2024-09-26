/*
    10. Elabore um programa que leia diversos números e ao final escreva: a quantidade de números 
    digitados, a quantidade de números pares, a quantidade de números ímpares.
*/

package aula2.listaExercicio3;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in))
        {
            boolean cond = true;
            int par = 0;
            int impar = 0;
            
            while (cond)
            {
                System.out.print("Insira um valor: ");
                int num = scanner.nextInt();

                if ((num == 0))
                { 
                    cond = false;
                }else{
                    if ((num % 2) == 0)
                    {
                        par += 1;
                    }else{
                        impar += 1;
                    }
                }
            }

            int total = par + impar;

            System.out.println("par: " + par);
            System.out.println("impar: " + impar);
            System.out.println("Total: " + total);

            scanner.close();
        }
    }
}
