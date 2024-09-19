/*
    2.  Faça um programa que dado o valor da
    temperatura em graus FARENHEIT, calcular e escrever o valor da temperatura em
    graus CELSIUS.

    Fórmula: C = 5/9 * (F - 32)
*/
package aula2.lista_exercicio_1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Insira a temperatura em FARENHEIT: ");
        double tempFar = scanner.nextDouble();

        double tempCel = (5.0/9.0) * (tempFar - 32);

        System.out.print("A temperatura " + df.format(tempFar) + "F em Celsius é: " + df.format(tempCel));
        
        scanner.close();
    }
}