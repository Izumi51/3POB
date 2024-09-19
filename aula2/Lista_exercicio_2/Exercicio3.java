/*
    3- Faça um programa para solicitar o nome e as duas notas e um aluno. 
    Calcular sua média e informá-la. Se ela for inferior a 7, escrever "Reprovado”; 
    caso contrário escrever "Aprovado". 
*/

package aula2.lista_exercicio_2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            DecimalFormat df = new DecimalFormat("0.00");
            
            System.out.print("Insira seu Nome: ");
            String nome = scanner.nextLine();
            
            System.out.print("Insira a nota 1: ");
            float nota1 = scanner.nextFloat();
            
            System.out.print("Insira a nota 2: ");
            float nota2 = scanner.nextFloat();
            
            float media = (nota1 + nota2) / 2;
            
            System.out.println(nome + "\t" + df.format(media));
            
            if (media < 7){
                System.out.println("Reprovado");
            }else{
                System.out.println("Aprovado");
            }
        }
    }    
}

