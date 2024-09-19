/* 
    8.  Crie um programa que leia o nome e a altura de 10 pessoas e ao final escreva: 
    a altura média do grupo, o nome e a altura da pessoa mais alta.
*/

package aula2.lista_exercicio_3;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in))
        {
            int len = 10;
            String nomes[] = new String[len];
            double altura = 0;

            int indNomes = 0;
            double maior = 0;

            for (int i = 0; i < len; i++)
            {
                System.out.print("Insira seu nome: ");
                nomes[i] = scanner.nextLine();
                System.out.print("Insira sua altura: ");
                altura = scanner.nextDouble();

                scanner.nextLine(); //Consumir a quebra de linha após nextDouble()
                System.out.println();

                if (altura > maior){
                    maior = altura;
                    indNomes = i;
                }

            }

            System.out.println(nomes[indNomes] + " e o mais alto com " + altura + " de altura");

            scanner.close();
        }
    }
}
