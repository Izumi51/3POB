/* 
    7.  Faça um programa que leia vários números inteiros e ao final escreva o maior.
*/

package aula2.listaExercicio3;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in))
        {
            boolean cond = true;
            int maior = Integer.MIN_VALUE;

            while (cond)
            {
                System.out.print("Entre com um valor: ");
                int valor = scanner.nextInt();
                
                if (valor > maior){
                    maior = valor;
                }else{
                    if (valor < 0){
                        cond = false;
                    }
                }
            }

            System.out.println(maior);

            scanner.close();
        }
    }
}
