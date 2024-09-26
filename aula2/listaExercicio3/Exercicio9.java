/*
    9.  A conversão de graus Farenheit para graus centígrados é obtida por : C = 5/9 * (F -32). 
    Faça um programa que calcule e escreva uma tabela de centígrados em função de graus Farenheit, 
    que variam de 100 a 150 de 1 em 1. 
*/

package aula2.listaExercicio3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio9 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in))
        {
            DecimalFormat df = new DecimalFormat("0.00");

            int len = 50;
            double c;

            for (int i = 0; i < len; i++)
            {
                c = (5 * ((100 + (double)i) - 32)) / 9;

                System.out.println((100 + i) +" = " + df.format(c));
            }

            scanner.close();
        }
    }
}
