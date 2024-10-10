/*
    4.  Construa um programa usando listas que leia o nome e a nota de 10 alunos e ao final 
    escreva: a nota média da turma; o nome e a nota dos alunos com resultados superiores a 
    nota média da turma.
*/

package aula4.listaExercicio4;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in))
        {
            ArrayList<Double> notas = new ArrayList<>();
            ArrayList<String> nomes = new ArrayList<>();
            int qnt = 2;

            for (int i = 0; i < qnt; i++)
            {
                System.out.print("Insira um nome: ");
                    nomes.add(scanner.nextLine());
                System.out.print("Insira nota: ");
                    notas.add(scanner.nextDouble());
                scanner.nextLine();
            }

            int len = notas.size();
            double media = 0;

            for(int i = 0; i < len; i++) {
                media += notas.get(i);
            }

            media /= len;

            for(int i=0; i<len; i++) {
                if (notas.get(i) > media) {
                    System.out.println(nomes.get(i) + " " + notas.get(i));
                }
            }
            scanner.close();
        }
    }
}