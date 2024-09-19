/*
    2.  Elabore um programa usando listas que leia a matrícula e o salário bruto de 100 empregados. 
    Os dados devem ser armazenados em listas. O programa deve descontar 11% do salário bruto de cada 
    empregado e ao final escrever: a matrícula, o salário bruto, o desconto e o salário líquido de 
    cada empregado.
*/

package aula4.lista_exercicio_4;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in))
        {
            int qnt = 3;
            int matriculas[] = new int[qnt];
            float salario[] = new float[qnt];

            for (int i = 0; i < qnt; i++)
            {
                System.out.print("Insira sua matricula: ");
                matriculas[i] = scanner.nextInt();
                System.out.print("Intira seu salario: ");
                salario[i] = scanner.nextFloat();
                System.out.print("\n");
            }

            for (int i = 0; i < qnt; i++)
            {
                float desconto = (salario[i] * 11) / 100;
                float liquido = salario[i] - desconto;

                System.out.println("Matricula: " + matriculas[i] + " salario bruto: " + salario[i] + " desconto: " + desconto + " liquido: " + liquido);
            }

            scanner.close();
        }
    }
}