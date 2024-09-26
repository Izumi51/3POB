/*  
    2- Crie um programa para solicitar o ano atual e o ano de nascimento de uma pessoa. 
    Calcular sua idade aproximada e informá-la. Se sua idade for inferior a 16 anos, 
    escrever a mensagem "Não pode votar"; caso contrário, emitir a mensagem "É eleitor".
*/
package aula2.listaExercicio2;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Insira o ano atual: ");
            int anoAtual = scanner.nextInt();
            
            System.out.print("Insira o seu ano de nascimento: ");
            int anoNasc = scanner.nextInt();
            
            int idade = anoAtual - anoNasc;
            
            if (idade < 16){
                System.out.print("Nao pode votar");
            }else{
                System.out.print("E eleitor");
            }
        }
    }
}
