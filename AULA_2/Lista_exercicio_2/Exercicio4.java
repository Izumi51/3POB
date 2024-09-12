/*
    4- Elabore um programa para solicitar o nome, o sexo e o salário bruto de um empregado. 
    Se o seu sexo for masculino, descontar 5% de seu salário; caso contrário, descontar 3%. 
    Informar o valor do desconto e o salário líquido.
 */

package AULA_2.Lista_exercicio_2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in))
        {

            System.out.print("Insira seu nome: ");
            String nome = scanner.nextLine();
            System.out.print("Insira seu sexo (m) ou (f): ");
            String sexo = scanner.nextLine();
            System.out.print("Insira seu salario: ");
            double salario = scanner.nextDouble();

            double desconto = 0;

            if (("M".equals(sexo)) || ("m".equals(sexo)))
            { 
                desconto = (salario * 5) / 100;
            }else{
                if (("F".equals(sexo)) || ("f".equals(sexo)))
                {
                    desconto = (salario * 3) / 100;
                }
            }
            
            System.out.println(nome);
            System.out.println("Desconto: " + desconto);
            System.out.println("Salario Liquido: " + (salario - desconto));
    
            scanner.close();
        }
    }
}