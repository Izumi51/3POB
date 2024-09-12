/*
    5-  Elabore um programa para solicitar o nome de uma equipe de futebol, a 
    quantidade de derrotas, empates e vitórias obtidas por ela no campeonato. 
    Calcular e informar: a quantidade de pontos ganhos e a quantidade de pontos perdidos.
 */

package AULA_2.Lista_exercicio_1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite nome do time: ");
        String nomeTime = scanner.nextLine();

        System.out.print("Digite o numero de vitoria: ");
        int vitoria = scanner.nextInt();

        System.out.print("Digite o numero de derrotas: ");
        int derrota = scanner.nextInt();

        System.out.print("Digite o numero de empates: ");
        int empate = scanner.nextInt();

        int jogos = vitoria + derrota + empate;
        int pontosGanhos = (vitoria * 3) + (empate * 1);
        int pontosPerdidos = (derrota * 3) + (empate * 2);

        System.out.println("Nome: " + nomeTime);
        System.out.println("Jogos: " + jogos);
        System.out.println("Pontos Ganhos: " + pontosGanhos);
        System.out.println("Pontos Perdidos: " + pontosPerdidos);

        scanner.close();
    }
}
