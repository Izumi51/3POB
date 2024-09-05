/*
    3- Faça um programa para solicitar o nome e as duas notas e um aluno. 
    Calcular sua média e informá-la. Se ela for inferior a 7, escrever "Reprovado”; 
    caso contrário escrever "Aprovado". 
*/

package AULA_2.Lista_exer_2;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Insira seu Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Insira a nota 1: ");
        float nota1 = scanner.nextFloat();

        System.out.print("Insira a nota 2: ");
        float nota2 = scanner.nextFloat();

        float media = (nota1 + nota2) / 2;

        System.out.print(nome + media); 

        if (media < 7){
            System.out.print("Reprovado"); 
        }else{
            System.out.print("Aprovado");
        }

        scanner.close();
    }    
}

