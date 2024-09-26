/*  
    6- Crie um programa para ler o valor do salário mínimo, o nome e o salário bruto de um empregado. 
    Se o seu salário for menor que um salário mínimo descontar 2%; se for igual, descontar 5%, e se for 
    superior, descontar 8%. Informar o valor do desconto e o salário líquido.
*/
package aula2.listaExercicio2;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in))
        {

            System.out.print("Insira seu nome: ");
            String nome = scanner.nextLine();
            System.out.print("Insira o salario minimo: ");
            double salarioMin = scanner.nextDouble();
            System.out.print("Insira seu salario: ");
            double salario = scanner.nextDouble();

            double desconto;

            if (salario < salarioMin){ 
                desconto = (salario * 2) / 100;
            }else{
                if (salario == salarioMin) {
                    desconto = (salario * 3) / 100;
                }else{
                    desconto = (salario * 8) / 100;
                }
            }
            
            System.out.println(nome);
            System.out.println("Desconto: " + desconto);
            System.out.println("Salario Liquido: " + (salario - desconto));
    
            scanner.close();
        }
    }
}
