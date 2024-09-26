/*
    1- Faça um programa para solicitar o nome e a idade de uma pessoa. 
    Se sua idade for menor que 18 anos, escrever a mensagem: "É menor".
*/

package aula2.listaExercicio2;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Insira seu nome: ");
            String nome = scanner.nextLine();
            
            System.out.print("Insira sua idade: ");
            int idade = scanner.nextInt();
            
            if (idade < 18){
                System.out.println(nome + " e menor de idade");
            }else{
                System.out.println(nome + " e maior de idade");
            }
        }
    }
}
