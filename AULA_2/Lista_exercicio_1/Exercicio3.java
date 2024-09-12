/*
    3.  Faça um programa para solicitar o código, a
    quantidade de alunos do sexo masculino, a quantidade de alunos do sexo feminino
    e a quantidade de alunos aprovados de uma determinada turma.

    Calcular e informar: a
    porcentagem de alunos do sexo masculino; a porcentagem de alunos do sexo
    feminino; a porcentagem de alunos reprovados; o total de alunos da turma.
*/

package AULA_2.Lista_exercicio_1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Insira o codigo da turma: ");
        int codigo = scanner.nextInt();

        System.out.print("Insira a quantidade de alunos do sexo Masculino: ");
        int quantM = scanner.nextInt();

        System.out.print("Insira a quantidade de alunos do sexo feminino: ");
        int quantF = scanner.nextInt();

        System.out.print("Insira a quantidade de alunos aprovados na turma " + codigo + ": ");
        int quantA = scanner.nextInt();

        int totalAlunos = quantF + quantM;
        double porcentM = (quantM * 100) / totalAlunos;
        double porcentF = (quantF * 100) / totalAlunos;
        double porcentA = (quantA * 100) / totalAlunos;

        System.out.println("Porcentagem de alunos Masculinos: " + df.format(porcentM));
        System.out.println("Porcentagem de alunos Femininos: " + df.format(porcentF));
        System.out.println("Porcentagem de alunos Aprovados: " + df.format(porcentA));
        System.out.println("Total de alunos: " + totalAlunos);

        scanner.close();
    }
}